package com.hj.controller;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.hj.dao.LeaveMapper;
import com.hj.pojo.*;
import com.hj.pojo.TDO.OrderTDO;
import com.hj.service.ApplyService;
import com.hj.service.LeaveService;
import com.hj.service.OrderService;
import com.hj.service.OrderdetailService;
import com.hj.utils.DateTools;
import com.hj.utils.uuidTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/apply")
public class ApplyController {
    @Autowired
    private ApplyService applyService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderdetailService orderdetailService;
    @Autowired
    private LeaveService leaveService;
//    跳转到请假审批
    @RequestMapping("/holiday")
    public String HolidayApply(HttpSession session){
        return "holidayApply";
    }

//    提交审批
    @RequestMapping(value = "/insert")
    public String insertApplyCord(HttpServletRequest request , HttpSession session) throws Exception{
        Police police= (Police) session.getAttribute("policeSession");
//      创建一个对象接收好参数后传递给applyservice进行添加
        Apply apply=new Apply();
        apply.setPnum(request.getParameter("pnum"));
        apply.setApplytype(request.getParameter("applytype"));
        apply.setApplydate(DateTools.change(request.getParameter("applydate")));
        apply.setStartdate(DateTools.change(request.getParameter("startdate")));
        apply.setEnddate(DateTools.change(request.getParameter("enddate")));
        apply.setApplydetail(request.getParameter("applydetail"));
        apply.setDepartid(police.getDepartid());
//        把applytypeid(表示申请状态)用parseInt方法强转成int
        apply.setApplytypeid(Integer.parseInt(request.getParameter("applytypeid")));
        applyService.insertApplyCord(apply);
        return "main";
    }
//显示请假记录
    @RequestMapping(value = "/querycord")
    @ResponseBody
    public List<Apply> queryCord(String pnum,HttpServletRequest request){
        List<Apply> list=applyService.queryAllCordByPnum(pnum);
            JSONArray jsonobjects= JSONArray.parseArray(JSON.toJSONString(list));
        request.setAttribute("resultlist", jsonobjects);
        return list;
    }

//    跳转到物品申领
    @RequestMapping("/items")
    public String items(){
        return "select";
    }
//    查询物品列表
    @RequestMapping("/queryallitems")
    @ResponseBody
    public List<Items> queryallitems(HttpServletRequest request){
       List<Items> list= applyService.queryallitems();
        JSONArray allitems= JSONArray.parseArray(JSON.toJSONString(list));
        request.setAttribute("allitems", allitems);
        return list;
    }
//    提交物品申请
    @RequestMapping("/itemsapply")
    public String itemsapply(String data,HttpServletRequest request,String pnum) throws ParseException {
//        getAttribute没用
//        System.out.println( request.getAttribute("data"));
//        生成申请订单
        Order order=new Order();
        order.setOrderid(uuidTools.setuuid());
        order.setPnum(pnum);
        order.setOrderstatus(1);
        order.setOrderdate(DateTools.change(DateTools.getNowDateShort()));
        orderService.insertItemsApply(order);

        List<Items> itemsList=JSON.parseArray(data,Items.class);
        for (Items items :itemsList){
            orderdetailService.insertOrderdetailCord( items.getItemsid(),order.getOrderid());
        }

        return "main";
    }
    @RequestMapping("/queryitemscord")
    @ResponseBody
    public List<Order> queryitemscord(HttpServletRequest request, String pnum){
        return orderService.queryitemscord(pnum);
    }

    @RequestMapping("/queryOrderdetailscord")
    @ResponseBody
    public List<Items> queryOrderdetailscord(HttpServletRequest request, String orderid){
        System.out.println(orderid);
        List<Items> orderdetailList=orderdetailService.queryOrderDetailCord(orderid);
        for (Items orderdetail: orderdetailList){
            orderdetail.getItemsname();
        }
        return orderdetailList;
    }

    @RequestMapping("/checkCordByStatus")
    @ResponseBody
    public List<OrderTDO> checkItemsCord(int orderstatus){
        List<OrderTDO>the=orderService.checkCordByStatus(orderstatus);
        System.out.println(the.get(0).getItemsList());
        return the;
    }

    @RequestMapping("/changeStatusByStatus")
    @ResponseBody
    public void changeStatus(String data) throws ParseException {
       Map map=JSON.parseObject(data);
        orderService.changeStatus((String) map.get("orderid"),(Integer) (map.get("orderstatus")),DateTools.change((String) map.get("dealdate")));
    }

    @RequestMapping("/denyItemsOrder")
    @ResponseBody
    public void denyItemsOrder(String data) throws ParseException {
        Map map=JSON.parseObject(data);
        orderService.denyItemsOrder((String) map.get("orderid"),(Integer) (map.get("orderstatus")),
                DateTools.change((String) map.get("dealdate")),(String)map.get("judgereason"));
    }

    @RequestMapping("/queryAllitemscord")
    @ResponseBody
    public List<Order> queryAll(){
       return orderService.queryAllCord();
    }

    @RequestMapping("/editApplyPage")
    public String editApplyPage(){
        return "editPage";
    }
//跳转处理请假页面
    @RequestMapping("/dealHolidayApply")
    public String holidayApplyPage(){
        return "holidayManagePage";
    }

    @RequestMapping("/checkHolidayApply")
    @ResponseBody
    public List<Map> queryApplyBystatus(int applytypeid){
        return applyService.queryAllCordByStatus(applytypeid);
    }



    @RequestMapping("/updateHolidayApply")
    @ResponseBody
    public void dealHolidayStatus(String data) throws ParseException {
        Map tmap=JSON.parseObject(data);
        applyService.dealHolidayStatus(Integer.parseInt(tmap.get("applytypeid").toString()),Integer.parseInt(tmap.get("applyid").toString()),DateTools.change((String) tmap.get("confirmdate")));
    }

    @RequestMapping("/denyHoliday")
    @ResponseBody
    public void denyHoliday(String data) throws ParseException {
        Map map=JSON.parseObject(data);
        System.out.println("!!!!!"+map.get("applyid"));
        applyService.denyHoliday(Integer.parseInt(map.get("applyid").toString()) ,(Integer) (map.get("applytypeid")),
                DateTools.change((String) map.get("confirmdate")),(String)map.get("denyreason"));
    }
    @RequestMapping("/leavePage")
    public String LeavePage(String pnum, HttpSession session){
        Leave leave=new Leave();
        try {
            leave=leaveService.findLeaveByPnum(pnum);

        }catch (NullPointerException e){
//            leave=null;
        }
        finally {
            if (leave==null){
                return "leavePage";
            }else{
                session.setAttribute("leaveSession",leave);
                session.setAttribute("ldate",leave.getLdate().getTime());
                try {
                    session.setAttribute("passdate",leave.getPassdate().getTime());
                }catch (NullPointerException e){
                    session.setAttribute("passdate",null);
                }
                System.out.println(leave.toString());
                return "waitPage";
            }
        }

    }
//    添加离职信息
    @RequestMapping("/insertleave")
    @ResponseBody
    public void insertleave(String data,HttpServletRequest request) throws ParseException {
        Leave leave=JSON.parseObject(data,Leave.class);
        System.out.println(leave.toString());
        leaveService.insertLeaveCord(leave);
    }
    @RequestMapping("/agreeLeave")
    @ResponseBody
    public String agreeLeave(String pnum) throws ParseException {
        leaveService.agreeCord(pnum,DateTools.change(DateTools.getNowDateShort()));
        return "success";
    }
    @RequestMapping("/findnlLeave")
    @ResponseBody
    public List<Leave> findnlLeave(){
        return leaveService.findNullLeave();
    }
}


