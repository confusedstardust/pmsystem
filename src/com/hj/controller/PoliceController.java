package com.hj.controller;
import com.hj.pojo.Depart;
import com.hj.pojo.Level;
import com.hj.pojo.Police;
import com.hj.service.DepartService;
import com.hj.service.LevelService;
import com.hj.service.PoliceService;
import com.hj.utils.uploadTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PoliceController {
    @Autowired
    private PoliceService policeService;
    @Autowired
    private LevelService levelService;
    @Autowired
    private DepartService departService;

    @RequestMapping(value = "/login")
    public String Login(String pnum,String ppsw,
                        Model model, HttpServletRequest request, HttpSession session){
        Police police= policeService.findPolice(pnum,ppsw);
        if (police==null){
            model.addAttribute("msg","警号或密码错误，请确认后重试");
            return "login";
        }else {
            Level  level=levelService.findLevelInfo(police.getLevelrank());
            Depart depart=departService.FindDepartInfo(police.getDepartid());
            session.setAttribute("departSession",depart);
            session.setAttribute("policeSession",police);
            session.setAttribute("levelSession", level);
            return "main";
        }
    }
    @RequestMapping(value="/resetppsw")
    public String ResetPpsw(String pnum,String pname,String pidcard,String ppsw, Model model,
                            HttpServletRequest request){
        Police police= policeService.checkIdentity(pnum,pidcard,pname);
        if (police==null){
            model.addAttribute("msg","请仔细核对身份信息后再重试");
            return "login";
        }else {
            policeService.updatePpsw(pidcard,ppsw);
            model.addAttribute("msg","密码修改成功！");
            return "login";
        }

    }
    @RequestMapping(value = "/settings")
//    @ResponseBody
    public String PersonalInfoPage(HttpSession session){
        return "settings";
    }
    @RequestMapping(value = "/updatePtelInfo")
    public void updatePtelInfo( String ptel,HttpSession session) throws ServletException, IOException {
        Police police= (Police) session.getAttribute("policeSession");
        policeService.updatePtel(ptel,police.getPnum());
//        return "settings";
    }
    @RequestMapping(value = "/updateImage")
    public String updateImage(MultipartFile picturefile, HttpSession session) throws ServletException, IOException {
        Police police= (Police) session.getAttribute("policeSession");
        String path="E:\\桌面x\\原D盘\\11111\\pmsystem\\WebContent\\plsimage";
//
        uploadTools tools= new uploadTools();
        String filepath=tools.upload(picturefile,police.getPnum(),path);
//        E:\\桌面x\\原D盘\\11111\\pmsystem\\WebContent\\plsimage"
        System.out.println(filepath);
        policeService.updateImage(filepath,police.getPnum());
        return "main";
    }
    @RequestMapping("/logout")
    public String LogOut(HttpSession session){
        session.invalidate();
        return "login";
    }
//跳转到重设密码页
    @RequestMapping("/resetpage")
    public String RestPswpage(HttpSession session){
        return "resetpsw";
    }
//    重设密码
    @RequestMapping(value = "/resetpswop",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String ResetPsw(HttpServletRequest request){
        Police police= policeService.findPolice(
                request.getParameter("pnum"),request.getParameter("psw"));
        if (police==null){
//           返回失败
            System.out.println("没查到");
            return "修改失败，请核对后再试" ;
        }else {
            policeService.updatePpsw(police.getPidcard(),request.getParameter("npsw"));
            return "密码修改成功！";
        }
    }
    @RequestMapping(value = "/policecrud")
    public String getMemberCrudPage(){
        return "MemberPage";
    }
    @RequestMapping(value = "queryallmember")
    @ResponseBody
    public List<Police> getMember(){
        return policeService.queryAllMember();
    }

    @RequestMapping(value = "deleteMember",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String delMember(String pnum){
        policeService.deletePolice(pnum);
        return "成功删除！";
    }
    @RequestMapping(value = "/updateMember",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String updateMember(HttpServletRequest request){
        Police police=new Police();
        police.setPnum(request.getParameter("pnum"));
        police.setPname(request.getParameter("pname"));
        police.setPlevel(Integer.parseInt(request.getParameter("plevel")));
        police.setPtel(request.getParameter("ptel"));
        police.setPsex(request.getParameter("psex"));
        police.setPpsw(request.getParameter("ppsw"));
        police.setDepartid(Integer.parseInt(request.getParameter("departid")));
        police.setLevelrank(Integer.parseInt(request.getParameter("levelrank")));
        police.setPidcard(request.getParameter("pidcard"));
        policeService.updatePoliceInfo(police);
        return "更新成功！";
    }

    @RequestMapping(value = "/querysamepnum",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String querysamepnum(String pnum){
        if (policeService.querysamepnum(pnum)==1){
            return "1";
        }else{
            return "0";
        }

    }
    @RequestMapping(value = "/insertMember",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String insertMember(HttpServletRequest request){
        Police police=new Police();
        police.setPnum(request.getParameter("pnum"));
        police.setPname(request.getParameter("pname"));
        police.setPlevel(Integer.parseInt(request.getParameter("plevel")));
        police.setPtel(request.getParameter("ptel"));
        police.setPsex(request.getParameter("psex"));
        police.setPpsw(request.getParameter("ppsw"));
        police.setDepartid(Integer.parseInt(request.getParameter("departid")));
        police.setLevelrank(Integer.parseInt(request.getParameter("levelrank")));
        police.setPidcard(request.getParameter("pidcard"));
        policeService.insertMember(police);
        return "添加成功！";
    }
    @RequestMapping(value = "querybypartten")
    @ResponseBody
    public List<Police> queryByPartten(String arg,String partten){
        return policeService.queryByPartten(arg,partten);
    }

    @RequestMapping(value = "queryMessInfo")
    @ResponseBody
    public Map buileInfo() throws ParseException {

        return policeService.queryMessInfo();
    }
    @RequestMapping("main")
    public String gotomain(){
        return "main";
    }


}
