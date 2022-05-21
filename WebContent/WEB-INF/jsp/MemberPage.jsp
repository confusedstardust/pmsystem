<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Tabib Apps web | Admin Dashboard Template</title>
    <script src="${pageContext.request.contextPath}../../js/jquery3-2.1.min.js"></script>
    <!-- JQuery v3.5.1 -->
    <link rel="stylesheet" href="../../css/backstage.css">
    <!-- Base Styling  -->
    <link rel="stylesheet" href="../../css/fonts.css">
    <link rel="stylesheet" href="../../css/style.css">
</head>

<body>
<%--模态框1确认删除--%>
<div class="modal fade" id="delModal" tabindex="2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"	>
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h2 class="modal-title "  >
                    <div class="text-center" id="modallable">确定删除用户？</div>
                </h2>
                <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
                <div class="col-lg-12">
                    要删除的用户是：<h3><font  color="red" id="pname"></font></h3>
                </div>
                <div class="modal-footer">
                    <input type="hidden" id="hdpnum">
                    <button type="button" class="btn btn-success" data-bs-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-danger" id="delebtn">删除</button>
                </div>
            </div>
        </div>

    </div><!-- /.modal-content -->
</div>
<%--    模态框2--展示警员详细信息--%>
<div class="modal fade" id="pinfoModal" tabindex="2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"	>
    <div class="modal-dialog">
        <div class="modal-content" style="width: 700px">
            <div class="modal-header">
                <h2 class="modal-title "  >
                    <div class="text-center" id="modaltitlexx"></div>
                </h2>
                <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-12 col-lg-12">
                        <div class="text-left"><label><h3>警员详细信息</h3></label></div>
                        <form  method="post" id="updatememberinfo" >
                            <div class="row">
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">姓名
                                        </label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" name="pname" readonly="readonly" id="pnameinfo">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">密码 <span class="text-danger"></span></label>

                                            <div class="col-xl-7">
                                                <div class="row">
                                                    <div class="col-xl-10">
                                                        <input type="password" name="ppsw" class="form-control" readonly="readonly" id="ppswinfo" >
                                                    </div>
                                                    <div class="col-xl-2">
                                                        <button type="button" id="parsecss"  readonly="readonly" style="height: 27px;width: 30px;margin-top: 10px;margin-left: -20px;" class="icon-eye"><span class="glyphicon glyphicon-eye-open"></span></button>
                                                        <input type="hidden" class="form-control" readonly="readonly" id="pnuminfo" name="pnum" >
                                                    </div>
                                                </div>

                                            </div>




                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">身份证号
                                        </label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" readonly="readonly" name="pidcard"  id="pidcardinfo">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">手机号码 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" name="ptel" class="form-control" readonly="readonly" id="ptelinfo" >
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">性别 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <select name="psex" class="form-select" id="psexinfo">
                                                <option value="1">男</option>
                                                <option value="2">女</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">所属部门<span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <select id="departinfo" class="form-select" name="departid"></select>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">职务 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <select class="form-select" name="levelrank" id="levelnameinfo">
                                                <option value="1">警员</option>
                                                <option value="2">警司</option>
                                                <option value="3">警督</option>
                                                <option value="4">总警监</option>
                                                <option value="5">管理员</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">职级 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <select class="form-select" name="plevel" id="plevelinfo">
                                                <option value="1">一级</option>
                                                <option value="2">二级</option>
                                                <option value="3">三级</option>
                                            </select>

                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">


                                    </div>
                                </div>
                            </div>
                        </form>
<%--                        <div class="col-xl-12" id="newrow"></div>--%>

                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="updateinfo">
                    更改人员信息
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<%--模态框3---新增警员--%>
<div class="modal fade" id="Addmodal" tabindex="2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"	>
    <div class="modal-dialog">
        <div class="modal-content" style="width: 700px">
            <div class="modal-header">
                <h2 class="modal-title "  >
                    <div class="text-center" ></div>
                </h2>
                <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-12 col-lg-12">
                        <div class="text-left"><label><h3>警员详细信息</h3></label></div>
                        <form  method="post" id="insertememberinfo" >
                            <div class="row">
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">姓名
                                        </label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" name="pname">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">警号<span class="text-danger"></span></label>

                                        <div class="col-xl-7">
                                            <div class="row">
                                                <div class="col-xl-10">
                                                    <input type="text" id="pnum" name="pnum" class="form-control"  >
                                                </div>
                                                <div class="col-xl-2">

                                                    <button id="checkbtn" data-toggle="tooltip" data-placement="top" title="点击验证警号合法性！" type="button"style="height: 27px;width: 30px;margin-top: 10px;margin-left: -20px;" class="icon-check">
                                                        <span class="glyphicon glyphicon-refresh"></span></button>
                                                </div>
                                            </div>

                                        </div>




                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">身份证号
                                        </label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="pidcard" name="pidcard"  >
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">手机号码 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" name="ptel" class="form-control"   >
                                            <input type="hidden" name="ppsw" id="psw">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">性别 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <select name="psex" class="form-select" >
                                                <option value="0">请选择</option>
                                                <option value="1">男</option>
                                                <option value="2">女</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">所属部门<span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <select id="departselect" class="form-select" name="departid">
                                                <option value="0">请选择</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">职务 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <select class="form-select" name="levelrank" >
                                                <option value="0">请选择</option>
                                                <option value="1">警员</option>
                                                <option value="2">警司</option>
                                                <option value="3">警督</option>
                                                <option value="4">总警监</option>
                                                <option value="5">管理员</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">职级 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <select class="form-select" name="plevel" >
                                                <option value="0">请选择</option>
                                                <option value="1">一级</option>
                                                <option value="2">二级</option>
                                                <option value="3">三级</option>
                                            </select>

                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">


                                    </div>
                                </div>
                            </div>
                        </form>
                        <div class="col-xl-12" id="newrow"></div>

                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="insertinfo">
                    确认新增警员
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<%--模态框4---变更日志--%>
<div class="modal fade" id="alertModal" tabindex="2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"	>
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <div class="modal-title">
                    <h4>人员变更日志</h4>
                </div>
            </div>
            <div class="modal-body">
                <div class="table-responsive">
                    <table id="policeloglist" class="table table-hover">
                        <thead>
                        <tr>
                            <th>警号</th>
                            <th>姓名</th>
                            <th>操作类型</th>
                            <th>变更日期</th>
                        </tr>
                        </thead>
                        <tbody id="theoplist"></tbody>
                    </table>
                </div>
                <div class="modal-footer">
                </div>
            </div>
        </div>

    </div><!-- /.modal-content -->
</div>
<%--模态框5---离职模态框--%>
<div class="modal fade" id="agreeleaveModal"  tabindex="2" role="dialog" aria-labelledby="agreeModalLabel" aria-hidden="true"	>
    <div class="modal-dialog">
        <div class="modal-content" style="width: 600px;">
            <div class="modal-header">
                <div class="modal-title">
                    <h4>离职申请</h4>
                </div>
            </div>
            <div class="modal-body">
                <div class="table-responsive">
                    <table id="leaveWantlist" class="table table-hover">
                        <thead>
                        <tr>
                            <th>警号</th>
                            <th>申请类型</th>
                            <th>申请日期</th>
                            <th>备注</th>
                            <th>交接人</th>
                            <th>操作(状态)</th>
                        </tr>
                        </thead>
                        <tbody id="wantlist"></tbody>
                    </table>
                </div>
                <div class="modal-footer">
                </div>
            </div>
        </div>

    </div><!-- /.modal-content -->
</div>

<%--===========================================================================================================================================--%>

            <div class="warper container-fluid">
                <div class="new-patients main_container">
                    <div class="row page-titles mx-0">
                        <div class="col-sm-6 p-md-0">
                            <div class="welcome-text">
                                <h4 class="text-primary"></h4>
                            </div>
                        </div>
                        <div class="col-sm-6 p-md-0 justify-content-sm-end mt-2 mt-sm-0 d-flex">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="main.jsp"></a></li>
                                <li class="breadcrumb-item active"><a href="javascript:;"></a></li>
                            </ol>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4 class="card-title">人员管理</h4>
                                </div>
                                <br class="card-body">
                                    <div class="col-lg-12">
                                        <div class="row">
                                            <div class="col-lg-2">
                                                <button type="button" class="btn btn-primary" id="addpolice">新增</button>
                                            </div>
                                            <div class="col-lg-2">
                                                <h5><label style="margin-top: 9px;margin-left: 60px;">按条件检索：</label></h5>
                                            </div>
                                            <div class="col-lg-3">
                                                <select class="form-select" name="serachpartten" id="partten">
                                                    <option value="1">人名</option>
                                                    <option value="2">警号</option>
                                                    <option value="3">所属部门</option>
                                                    <option value="4">电话号码</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-3">
                                                <input class="form-control" placeholder="" id="searchissuelog" style="height: 38px">
                                            </div>
                                            <div class="col-lg-2">
                                                <button type="button" class="btn btn-warning" id="querybtn">检索</button>
                                            </div>
                                        </div>
                                    </div>
                                </br>
                                    <div class="col-lg-12">
                                        <button type="button" class="btn btn-success" onclick="alertModal()">人员变更日志</button>
                                        <button type="button" class="btn btn-warning" onclick="agreeleaveModal()">离职申请列表</button>
                                        <div class="table-responsive">
                                    </div>
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                    </div>

                                    <div class="table-responsive">
                                        <table id="example1" class="table table-hover">
                                            <thead>
                                            <tr>
                                                <th>序号</th>
                                                <th>姓名</th>
                                                <th>警号</th>
                                                <th>所属部门</th>
                                                <th>电话号码</th>
                                                <th>&nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                                    &nbsp;&nbsp;&nbsp;操作</th>
                                            </tr>
                                            </thead>
                                            <tbody id="cordtbody"></tbody>
                                        </table>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                    <div class="row">
                    </div>
                </div>
            </div>
    </div>
<!-- popper js -->
<script src="${pageContext.request.contextPath}../../js/popper.min.js"></script>

<!-- Bootstrap -->
<script src="${pageContext.request.contextPath}../../js/bootstrap.js"></script>

<!-- Moment -->
<script src="${pageContext.request.contextPath}../../js/moment.min.js"></script>

<!-- Date Range Picker -->
<script src="${pageContext.request.contextPath}../../js/daterangepicker.min.js"></script>

<!-- Datatable -->
<script src="${pageContext.request.contextPath}../../js/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}../../js/init-tdatatable.js"></script>
<!-- Main Custom JQuery -->
<script src="${pageContext.request.contextPath}../../js/toggleFullScreen.js"></script>
<script src="${pageContext.request.contextPath}../../js/main.js"></script>

</body>
<script>
    var cordlist=[];
    $("#cordtbody").ready(function (){
        $.ajax({
           url:"${pageContext.request.contextPath}/queryallmember",
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log("查到警员列表",data);
                // 将返回的数据动态加载到tbody里面
                var thelist=[];
                cordlist=[];
                var tbody = document.getElementById("cordbody")
                for (i1 in data){
                    cordlist.push(data[i1]);
                    var tr=document.createElement("tr");
                    // tbody.append(tr);
                    var tr= '<tr><td>'+(parseInt(i1)+1)+'</td>'+
                        '<td>'+data[i1].pname+'</td>'+
                        '<td>'+data[i1].pnum+'</td>'+
                        '<td>'+getdepart(data[i1].departid).departname +'</td>'+
                        '<td>'+data[i1].ptel+'</td>'+
                        '<td>'+'<button type="button" class=" btn-sm btn-info " data-toggle="modal" data-target="#myModal" onclick="showpinfo('+i1+')">查看详情</button>&nbsp;'+
                        '<button type="button"  style="height: 30px;width: 40px" class=" btn-danger icon-close" data-toggle="modal" data-target="#myModal" onclick="deleteMember('+i1+')"><span class="glyphicon glyphicon-remove"></span></button>'+'</td></tr>';
                    thelist.push(tr);
                    //为每一行设置一个按钮
                    // getdepart(data[i1].pnum)
                    // rowdata.push(data[i]);
                }
                $("#cordtbody").html(thelist);
            }
        });
    });
    function deleteMember(x){
        $("#delModal").modal('show');
        $("#pname").html('&nbsp;&nbsp;&nbsp;' +
            '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
            '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
            '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+cordlist[x].pname);
        $("#hdpnum").val(cordlist[x].pnum);
    }
    //删除
    $("#delebtn").click(function (){
        $.ajax({
            url:"${pageContext.request.contextPath}/deleteMember?pnum="+$(this).parent().find("input").val(),
            success:function (data){
                alert(data);
                $("#delModal").modal('hide');
                $.ajax({
                    url: "${pageContext.request.contextPath}/policecrud",
                    success: function (data) {
                        var html=data;
                        $("#ajaxrequest").html(html);
                    }
                });
            }
        });
    })
    //新增模态框
    $("#addpolice").click(function (){
       $("#Addmodal").modal('show');
    });
    //模态框内警察信息
    function showpinfo(x){
        $("#pinfoModal").modal('show');
        $("#pnameinfo").val(cordlist[x].pname);
        $("#pnuminfo").val(cordlist[x].pnum);
        $("#pidcardinfo").val(cordlist[x].pidcard);
        $("#ptelinfo").val(cordlist[x].ptel);
        $("#psexinfo").val(judgesex(cordlist[x].psex));
        $("#departinfo").val(cordlist[x].departid);
        $("#levelnameinfo").val(cordlist[x].levelrank);
        $("#plevelinfo").val(cordlist[x].plevel);
        $("#ppswinfo").val(cordlist[x].ppsw);
    }
     //密码可见性
     $("#parsecss").click(function (){
         if ($("#ppswinfo").attr("type")=="password"){
             $("#ppswinfo").attr("type","text");
             flag=0;
         } else{
             $("#ppswinfo").attr("type","password");
         }
     });
    //修改只读框框
    $("#pinfoModal").find("input").click(function (){
        if ($(this).attr("readonly")=="readonly"){
            $(this).removeAttr("readonly");
        }else {
            $(this).attr("readonly","readonly");
        }
    });
    //设置级别123
    function setLevel(xx){
        var tem=xx;
        console.log(tem);
        switch (tem){
            case 1: return "一级"; break;
            case 2:return "二级";break;
            case 3:return "三级";break;
        }
    };
    function getdepart(x){
        var departinfo=[];
        $.ajax({
            url:"${pageContext.request.contextPath}/depart/finddepartinfo?departid="+x,
            async:false,
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                departinfo=data;
            }
        });
        return departinfo;
    }
    function getlevel(x){
        var levelinfo=[];
        $.ajax({
            url:"${pageContext.request.contextPath}/level/findlevelinfo?levelrank="+x,
            async:false,
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                levelinfo=data;
            }
        });
        console.log(levelinfo)
        return levelinfo;
    }
    //判断性别
    function judgesex(x){
        if (x=='1')
            return 1;
        else
            return 2;

    }
    //获得部门列表
    $("#departinfo").ready(function (){
        $.ajax({
           url:"${pageContext.request.contextPath}/depart/departlist",
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
               list=[];
               for (i in data){
                   var opt='<option value='+(parseInt(i)+1)+'>'+
                       data[i].departname+'</option>';
                   list.push(opt);
               }
               $("#departinfo").html(list);
            }
        });
    });
    //更新警察信息
    $("#updateinfo").click(function (){
        $.ajax({
           url:"${pageContext.request.contextPath}/updateMember",
            data:$("#updatememberinfo").serialize(),
           success:function (data){
               alert(data);
               $("#pinfoModal").modal('hide');
               $.ajax({
                   url: "${pageContext.request.contextPath}/policecrud",
                   success: function (data) {
                       var html=data;
                       $("#ajaxrequest").html(html);
                   }
               });
           }
        });
    })
    //新增部分获得部门列表
    $("#departselect").ready(function (){
        $.ajax({
            url:"${pageContext.request.contextPath}/depart/departlist",
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                list=[];
                for (i in data){
                    var opt='<option value='+(parseInt(i)+1)+'>'+
                        data[i].departname+'</option>';
                    list.push(opt);
                }
                $("#departselect").append(list);
            }
        });
    });
//    查重
    $("#checkbtn").click(function (){
        $.ajax({
            url:"${pageContext.request.contextPath}/querysamepnum?pnum="+$("#pnum").val(),
            success:function (data){
                console.log(data);
                if (data==0){
                    alert("验证通过");
                }else {
                    alert("警号已存在，请重新输入！");
                }
            }
        });

    });
//新增成员
    $("#insertinfo").click(function (){
        // $("#insertememberinfo")
        var str=$("#pidcard").val();
        var psw=$("#pnum").val()+"."+str.substring(str.length-4);
        $("#psw").val(psw);
        $.ajax({
            url:"${pageContext.request.contextPath}/insertMember.action",
            data:$("#insertememberinfo").serialize(),
            success:function (data){
                alert(data);
                $("#Addmodal").modal('hide');
                $.ajax({
                    url: "${pageContext.request.contextPath}/policecrud",
                    success: function (data) {
                        var html=data;
                        $("#ajaxrequest").html(html);
                    }
                });
            }
        });
    });

//    检索
    $("#querybtn").click(function (){
        var p= $("#partten").val();
        var a=$("#searchissuelog").val();
        console.log(p,a);
        $.ajax({
            url:"${pageContext.request.contextPath}/querybypartten?arg="+a+"&partten="+p,
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log(data);
                // location.reload();
            }
        });
    });

//    人员变更模态框
    function alertModal(){
        $("#alertModal").modal('show');
        policeloglist=[];
        $.ajax({
           url:"${pageContext.request.contextPath}/log/querypolicelog",
            async:false,
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log(data);
                for (i in data){
                    var opt='<tr><td>'+data[i].pnum+'</td><td>'
                        +data[i].pname+'</td><td>'+judgeType(data[i].optype)+
                        '</td><td>'+format(data[i].opdate)+'</td></tr>';
                    policeloglist.push(opt);
                }
            }
        });
        console.log(policeloglist);
        $("#theoplist").html(policeloglist);
    }

    //    判断类型
    function judgeType(type){
        if (type=="INSERT"){
            return "新增成员";
        }else if (type=="DELETE"){
            return "删除成员";
        }
    }
    function agreeleave(date,pnum){
        $.ajax({
            url:"${pageContext.request.contextPath}/apply/agreeLeave?pnum="+pnum,
            success:function (data){
                alert(data);
                $("#agreeleaveModal").modal('hide');
                $.ajax({
                    url:"${pageContext.request.contextPath}/policecrud",
                    success: function (data) {
                        var html=data;
                        $("#ajaxrequest").html(html);
                    }
                });
            }
        });
    }

    //显示离职名单
    function agreeleaveModal(){
        $("#agreeleaveModal").modal('show');
        wantlist=[];
        $.ajax({
            url:"${pageContext.request.contextPath}/apply/findnlLeave",
            async:false,
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log(data);
                for (i in data){
                    var opt='<tr><td>'+data[i].pnum+'</td><td>'
                        +data[i].ltype+'</td><td>'+format(data[i].ldate)+
                        '</td><td>'+data[i].lreason+'</td>' +
                        '<td>'+data[i].continueman+'</td>' +
                        '<td>'+judgebtn(data[i].passdate,data[i].pnum) +'</td>'+
                        '</tr>';
                    wantlist.push(opt);
                }
                console.log(wantlist);
                $("#wantlist").html(wantlist);
            }
        });
        function judgebtn(date,pnum){
            if (date==null){
                return '<button class="btn btn-primary" onclick="agreeleave('+date+'\,'+pnum+')">同意</button>';
            }else {
                return'已同意';
            }
        }




    }


</script>
</html>