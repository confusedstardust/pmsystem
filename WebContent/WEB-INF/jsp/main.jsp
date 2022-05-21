<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial: update items set itemscount = ? where itemsid = ?
DEBUG [http-nio-8082-exec-7] - ==> Parameters: 62(Integer), 1(Integer)
DEBUG [http-nio-8082-exec-7] - <==    Updates: 1
DEBUG [http-nio-8082-exec-8] - ==>  Preparing: update items set itemscount = ? where itemsid = ?
DEBUG [http-nio-8082-exec-8] - ==> Parameters: 61(Integer), 1(Integer)
DEBUG [http-nio-8082-exec-8] - <==    Updates: 1
DEBUG [http-nio-8082-exec-6] - ==>  Preparing: update items set itemscount = ? where itemsid = ?
DEBUG [http-nio-8082-exec-6] - ==> Parameters: 60(Integer), 1(Integer)
DEBUG [http-nio-8082-exec-6] - <==    Updates: 1
DEBUG [http-nio-8082-exec-10] - ==>  Preparing: update items set itemscount = ? where itemsid = ?
DEBUG [http-nio-8082-exec-10] - ==> Parameters: 59(Integer), 1(Integer)
DEBUG [http-nio-8082-exec-10] - <==    Updates: 1-scale=1">
    <title>警员管理系统</title>
    <!-- Base Styling  -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}../../css/fonts.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../../css/style.css">
    <link href="../../css/layui.css" rel="stylesheet" />
<%--    <script src="../../js/jquery3-2.1.min.js" type="text/javascript"></script>--%>
    <script src="${pageContext.request.contextPath}../../js/jquery3-2.1.min.js"></script>
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
    <!-- Chart js -->
    <script src="${pageContext.request.contextPath}../../js/Chart.min.js"></script>
    <script src="${pageContext.request.contextPath}../../js/charts-custom.js"></script>
    <link rel="stylesheet" type="text/css" href="/path/to/bootstrap.min.css">
    <!-- Main Custom JQuery -->
    <script src="${pageContext.request.contextPath}../../js/toggleFullScreen.js"></script>
    <script src="${pageContext.request.contextPath}../../js/main.js"></script>
    <script src="${pageContext.request.contextPath}../../layui/layui.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}../../js/upload.js" type="text/javascript"></script>
    <script crossorigin="anonymous" integrity="sha512-6Fte/fZaeI/iDaKioXn3TY3ATgsaJGnZ7o0TstIENrnKXNLXTR5E6au08gvxasCDZ9k1gVElx6ME6+gcYvtNQw==" src="https://lib.baomitu.com/echarts/5.3.1/echarts.common.js"></script>
</head>

<body>
    <div id="main-wrapper" class="show">
        <!-- start logo components -->
        <div class="nav-header">
            <div class="brand-logo">
                <a href=""> <img src="${pageContext.request.contextPath}../../image/jh.png"  style="width: 80px;" alt="img"></a>
<%--                <a href=""><img class="brand-title" src="${pageContext.request.contextPath}../../image/logo.png" alt=""></a>--%>
            </div>
        </div>
        <!-- End logo components -->
        <!-- start section sidebar -->
        <aside class="left-panel nicescroll-box">
            <nav class="navigation">
                <ul class="list-unstyled main-menu">
                    <li class="has-submenu active">
                        <a href="${pageContext.request.contextPath}/main">
                            <i class="fas fa-th-large"></i>
                            <span class="nav-label">数据统计</span>
                        </a>
                    </li>
                    <li class="has-submenu">
                        <a href="#" class="has-arrow mm-collapsed">
                            <i class="fas fa-user-md"></i>
                            <span class="nav-label">警情</span>
                        </a>
                        <ul class="list-unstyled mm-collapse">
                            <li><a href="#" onclick=issueSend()>警情处理</a></li>
                            <li><a href="#" onclick="logSend()">日志</a></li>
                        </ul>
                    </li>
                    <li class="has-submenu">
                        <a href="#" class="has-arrow mm-collapsed">
                            <i class="fas fa-users"></i>
                            <span class="nav-label">审批</span>
                        </a>
                        <ul class="list-unstyled mm-collapse">
                            <li><a href="#" onclick=applySend() >请假审批</a></li>
                            <li><a href="#" onclick=itemsApplySend()>物品申领</a></li>
                            <li><a href="#" onclick=leaveApplySend()>离职申请</a></li>
                        </ul>
                    </li>
                    <li class="has-submenu">
                        <a href="#" onclick="departPageSend()">
                            <i class="fas fa-calendar-plus"></i>
                            <span class="nav-label">部门管理</span>
                        </a>
                    </li>
                    <li class="has-submenu">
                        <a  href="#">
                            <i class="fas fa-calendar-plus"></i>
                            <span class="nav-label" onclick="memberPageSend()">人员管理</span>
                        </a>
                    </li>

                    <li class="has-submenu">
                        <a  href="#">
                            <i class="fas fa-calendar-plus"></i>
                            <span class="nav-label" onclick="holidaySend()" >请假审批</span>
                        </a>
                    </li>
                    <li class="has-submenu">
                        <a href="#" class="has-arrow mm-collapsed">
                            <i class="fas fa-heartbeat"></i>
                            <span class="nav-label">物资管理</span>
                        </a>
                        <ul class="list-unstyled mm-collapse">
                            <li><a href="#" onclick="itemsEditSend()">物品审批</a></li>
                            <li><a href="#"onclick="itemsManageSend()">物品编辑</a></li>
                        </ul>
                    </li>
                    <li class="has-submenu">
                        <a href="#">
                            <i class="fas fa-calendar-alt"></i>
                            <span class="nav-label" onclick="InfoPageSend()">公告管理</span>
                        </a>
                    </li>
                    <li class="has-submenu">
                        <a href="#" class="has-arrow mm-collapsed">
                            <i class="fas fa-cog"></i>
                            <span class="nav-label">个人设置</span>
                        </a>
                        <ul class="list-unstyled mm-collapse">
                            <li><span><a href="#" onclick=updateInfoSend()>个人资料</a></span></li>
                            <li><span><a href="#" onclick="resetpswSend()">修改密码</a></span></li>
                        </ul>
                    </li>
                </ul>
            </nav>
            <div class="sidebar-widgets">
                <div class="top-sidebar box-shadow mx-25 m-b-30 p-b-20 text-center">
                    <a href="#">
                        <img src="${pageContext.request.contextPath}../../image/jc.jpg"  style="width: 140px;" alt="img">
                    </a>
                    <a href="#">
                        <h4 class="text-primary mb-0">技术支持---小何</h4>
                    </a>
                </div>
                <div class="copyright text-center">
                    <p class="mb-0">tel:13323165352</p>
                    <p class="mb-0"> © 2022</p>
                </div>
            </div>
        </aside>
        <!-- End section sidebar -->
        <!-- start section header -->
        <div class="header">
            <header class="top-head container-fluid">
                <div class="nav-control">
                    <div class="hamburger">
                        <span class="line"></span><span class="line"></span><span class="line"></span>
                    </div>
                    <div class="left-header content-header__menu">
                        <ul class="list-unstyled">
                            <li class="nav-link btn">
                                <a href="#"><i class="far fa-calendar-check"></i> <span> 欢迎登入</span></a>
                            </li>
                            <li class="nav-link btn">
                                <a href="#"><i class="far fa-file-alt"></i> <span> 警员综合信息系统</span></a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="header-right">
                    <div class="fullscreen notification_dropdown">
                        <div class="full">
                            <a class="text-dark" href="#!" onclick="javascript:toggleFullScreen()">
                                <i class="fas fa-expand"></i>
                            </a>
                        </div>
                    </div>
                    <div class="my-account-wrapper">
                        <div class="account-wrapper">
                            <div class="account-control">
                                <a class="login header-profile" href="#" title="Sign in">
                                    <div class="header-info">
                                        <span>${policeSession.pname}</span>
                                        <small>${levelSession.levelname}</small>
                                    </div>
                                    <img src="../../${policeSession.picuture}" alt="people">
                                </a>
                                <div class="account-dropdown-form dropdown-container">
                                    <div class="form-content">
                                        <a href="#" >
<%--                                            href="settings.jsp"--%>
                                            <i class="far fa-user"></i>
                                            <span class="ml-2" onclick=updateInfoSend() >个人资料</span>
                                        </a>
                                        <a >
                                            <i class="far fa-envelope"></i>
                                            <span class="ml-2" onclick="resetpswSend()">修改密码</span>
                                        </a>
                                        <a href="${pageContext.request.contextPath}/logout">
                                            <i class="fas fa-sign-in-alt"></i>
                                            <span class="ml-2">注销 </span>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
        </div>
        <!-- End section header -->
        <!-- start section content -->
        <div class="content-body">
            <div id="ajaxrequest"  style="padding-left: 140px">
<%--                ===========================存放动态生成的数据====================--%>
    <div class="warper container-fluid">
        <div class="row page-titles mx-0">
            <div class="col-lg-12 p-md-0">
                <h4 class="text-primary">Good morning <span class="names">Dr Roberts</span></h4>
                <p class="mb-0">Tabib Apps web | Admin Dashboard Template</p>
            </div>
        </div>
        <div class="new-patients main_container">
            <div class="row">
                <div class="col-sm-6 col-xl-3 col-lg-6">
                    <div class="widget card card-primary">
                        <div class="card-body">
                            <div class="media text-center">
                                        <span>
                                            <i class="fas fa-calendar-check fa-2x"></i>
                                        </span>
                                <div class="media-body">
                                    <span class="text-white" >总案件数</span>
                                    <h3 class="mb-0 text-white" id="issuecount">7699</h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-xl-3 col-lg-6">
                    <div class="widget card card-danger">
                        <div class="card-body">
                            <div class="media text-center">
                                        <span>
                                            <i class="fas fa-user-nurse fa-2x"></i>
                                        </span>
                                <div class="media-body">
                                    <span class="text-white">在职警员</span>
                                    <h3 class="mb-0 text-white" id="membercount">400</h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-xl-3 col-lg-6">
                    <div class="widget card card-primary">
                        <div class="card-body">
                            <div class="media text-center">
                                        <span>
                                            <i class="fas fa-user-plus fa-2x"></i>
                                        </span>
                                <div class="media-body">
                                    <span class="text-white">今日新增案件数</span>
                                    <h3 class="mb-0 text-white" id="newissue">1360</h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-xl-3 col-lg-6">
                    <div class="widget card card-primary">
                        <div class="card-body">
                            <div class="media text-center">
                                        <span>
                                            <i class="fas fa-database fa-2x"></i>
                                        </span>
                                <div class="media-body">
                                    <span class="text-white">所属部门</span>
                                    <h3 class="mb-0 text-white" >${departSession.departname}</h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-8">
                    <div class="card shadow widget1">
                        <div class="card-header">
                            <h4 class="card-title">系统公告</h4>
                            <span class="subtitle" id="infodate"></span>
                        </div>
                        <div class="card-body" id="infocontent" >
                            <div   class="chartjs-size-monitor" style="position: absolute; inset: 0px; overflow: hidden; pointer-events: none; visibility: hidden; z-index: -1;">
                                <div class="chartjs-size-monitor-expand" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;">
                                    <div style="position:absolute;width:1000000px;height:1000000px;left:0;top:0">
                                    </div>
                                </div>
                                <div class="chartjs-size-monitor-shrink" style="position:absolute;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:-1;">
                                    <div style="position:absolute;width:200%;height:200%;left:0; top:0">
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-12" >
                                <h3 class="text-center" id="infotite"></h3>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4">
                    <div class="card shadow widget-2">
                        <div class="card-header">
                            <h4 class="card-title">公告列表</h4>
                        </div>
                        <div class="card-body">
                            <div class="panel-body widget-media main-scroll nicescroll-box">
                                <ul class="list-group list-unstyled" id="infolit">
                                    <li class="list-group-item d-flex justify-content-between align-items-center media">
                                        <div class="d-flex">
                                            <div class="img-patient">
                                                <img src="static/picture/user1.jpg" class="rounded-circle" alt="people">
                                            </div>
                                            <div class="media-body">
                                                <h4 class="mb-0">Airi Satou</h4>
                                                <span>Maried, Rabat</span>
                                            </div>
                                        </div>
                                        <button type="button" class="ms-btn-icon btn-success" name="button">
                                            <i class="fas fa-arrow-right"></i>
                                        </button>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="card shadow widget1">
                        <div class="card-header">
                            <h4 class="card-title">案情类型统计</h4>
                        </div>
                        <div class="card-body">
                            <div class="row justify-content-center">
                                    <div style="width: 550px;height: 450px" id="chart3"></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="card shadow widget1">
                        <div class="card-header">
                            <h4 class="card-title">物品申请统计</h4>
                        </div>
                        <div class="card-body">
                            <div style="width: 550px;height: 450px" id="chart2"></div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="card shadow widget1">
                        <div class="card-header">
                            <h4 class="card-title">官方掉粉</h4>
                        </div>
                        <div class="card-body">
                            <div style="width: 550px;height: 450px" id="aschart"></div>
                        </div>
                    </div>
                </div>


            </div>
        </div>
    </div>
            </div>
        </div>
        <!-- End section content -->
    </div>
</body>

<script type="text/javascript">
<%--    =============================异步跳转====================================================--%>
    function updateInfoSend(){
        $.ajax({
            // type: "post",
            url: "${pageContext.request.contextPath}/settings.action",
            // dataType: "json",
            success: function (data) {
                var html=data;
                $("#ajaxrequest").html(html);
            }
        });
    }
    function applySend(){
        $.ajax({
            // type: "post",
            url: "${pageContext.request.contextPath}/apply/holiday.action",
            // dataType: "dataType",
            success: function (data) {
                var html=data;
                $("#ajaxrequest").html(html);

            }
        });
    }
    function itemsApplySend(){
        $.ajax({
            // type: "post",
            url: "${pageContext.request.contextPath}/apply/items.action",
            // dataType: "dataType",
            success: function (data) {
                var html=data;
                $("#ajaxrequest").html(html);

            }
        });
    }
    function issueSend(){
        $.ajax({
            // type: "post",
            url: "${pageContext.request.contextPath}/issue/issuepage.action",
            // dataType: "dataType",
            success: function (data) {
                var html=data;
                $("#ajaxrequest").html(html);

            }
        });
    }
    function resetpswSend(){
        $.ajax({
            url: "${pageContext.request.contextPath}/resetpage.action",
            success: function (data) {
                var html=data;
                $("#ajaxrequest").html(html);
            }
        });
    }
    function logSend(){
        $.ajax({
            url: "${pageContext.request.contextPath}/log/logpage",
            success: function (data) {
                var html=data;
                $("#ajaxrequest").html(html);
            }
        });
    }
    function memberPageSend(){
        var did=${departSession.departid};
        if (did==2||did==0){
            $.ajax({
                url: "${pageContext.request.contextPath}/policecrud",
                success: function (data) {
                    var html=data;
                    $("#ajaxrequest").html(html);
                }
            });
        }else{
            alert("对不起，只有人力资源部门可以访问此页");
        }

    }
    function itemsManageSend(){
        var did=${departSession.departid};
        if (did==4||did==0){
            $.ajax({
                url: "${pageContext.request.contextPath}/items/ItemsPage",
                success: function (data) {
                    var html=data;
                    $("#ajaxrequest").html(html);
                }
            });
        }else{
            alert("对不起，只有后勤部门可以访问此页");
        }

    }
    function itemsEditSend(){
        var did=${departSession.departid};
        if (did==4||did==0){
            $.ajax({
                url: "${pageContext.request.contextPath}/apply/editApplyPage",
                success: function (data) {
                    var html=data;
                    $("#ajaxrequest").html(html);
                }
            });
        }else{
            alert("对不起，只有后勤部门可以访问此页");
        }

    }
    function holidaySend(){
        var did=${departSession.departid};
        if (did==2||did==0){
            $.ajax({
                url: "${pageContext.request.contextPath}/apply/dealHolidayApply",
                success: function (data) {
                    var html=data;
                    $("#ajaxrequest").html(html);
                }
            });
        }else{
            alert("对不起，只有人力资源部门可以访问此页");
        }

    }
    function InfoPageSend(){
        var did=${departSession.departid};
        if (did==3||did==0){
            $.ajax({
                url: "${pageContext.request.contextPath}/info/infoPage",
                success: function (data) {
                    var html=data;
                    $("#ajaxrequest").html(html);
                }
            });
        }else{
            alert("对不起，只有宣传部门可以访问此页");
        }
    }
    function departPageSend(){
        var did=${departSession.departid};
        if (did==2||did==0){
            $.ajax({
                url: "${pageContext.request.contextPath}/depart/departPage",
                success: function (data) {
                    var html=data;
                    $("#ajaxrequest").html(html);
                }
            });
        }else{
            alert("对不起，只有人力资源部门可以访问此页");
        }

    }
    function leaveApplySend(){
        $.ajax({
            url: "${pageContext.request.contextPath}/apply/leavePage?pnum="+${policeSession.pnum},
            success: function (data) {
                var html=data;
                $("#ajaxrequest").html(html);
            }
        });
    }
    //=====================================main数据===========================================
    $("#infodetail").ready(function (){
        $.ajax({
            url:"${pageContext.request.contextPath}/info/getTopInfo",
            success:function (data){
                var content='<h3 class="text-center" id="infotite">《'+data.infotitle+'》</h3>' +
                    '<p class=" text-left col-lg-12">'+data.infodetail+'</p></br>';
                $("#infocontent").html(content);

            }
        });
    });
    var cordlist=[];
    $("#ajaxrequest").ready(function (){
        $.ajax({
            url: "${pageContext.request.contextPath}/queryMessInfo",
            success: function (data) {
                data=JSON.stringify(data);
                data=JSON.parse(data);
                $("#issuecount").text(data.issuecount);
                $("#membercount").text(data.membercount);
                $("#newissue").text(data.newissue);
            }
        });

        $.ajax({
           url:"${pageContext.request.contextPath}/info/getInfoData",
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
               var htmlset=[];
               cordlist=[];
                for (var i in data) {
                    cordlist.push(data[i]);
                    var lilist='<li class="list-group-item d-flex justify-content-between align-items-center media"> ' +
                        '<div class="d-flex"> <div class="img-patient"> ' +
                        '</div><div class="media-body"><h4 class="mb-0">'
                        +omit(data[i].infotitle)+'</h4><span>'+format(data[i].infodate)+'</span>' +
                        '</div></div><button type="button" class=" btn-sm btn-info "' +
                        'onclick="showinfo('+i+')">查看详情</button></li>'
                    htmlset.push(lilist);
                }
                $("#infolit").html(htmlset);
               
            }
        });

    });
    function format(date){
        var d=new Date(date);
        var val=d.getFullYear()+"-"+(d.getMonth()+1)+"-" +(d.getDate());
        return val ;
    };
    function omit(val){
        if (val.length>15){
            val=val.substring(0,13);
            return val+"……";
        }
        else
            return val;
    }
    function showinfo(x){
        var content='<h3 class="text-center" id="infotite">《'+cordlist[x].infotitle+'》</h3>' +
            '<p class=" text-left col-lg-12">'+cordlist[x].infodetail+'</p></br>';
        $("#infocontent").html(content);
    }

    //=============================图表部分-=========================================
    //得到图表信息
    var piedata=[];
    $.ajax({
        url:"${pageContext.request.contextPath}/items/itemsApplyFromChart",
        async:false,
        success:function (data){
            // data=JSON.stringify(data);
            // console.log(data);
            piedata=data;
        }
    });
    var mycharts=echarts.init(document.getElementById("chart2"));
    // 指定图表的配置项和数据
    var option = {
        title: {
            // text: 'ECharts 入门示例'
        },
        tooltip: {
            trigger:"item",
            formatter:'{b}   申请{c}次'
        },
        legend: {
            data: ['销量']
        },
        // xAxis: {
        //     data: ['衬衫', '羊毛衫', '雪纺衫', '裤子', '高跟鞋', '袜子']
        // },
        // yAxis: {},
        series: [
            {
                // name: ,
                type: 'pie',
                data: piedata,
                label:{
                    show:true,
                    formatter:function (arg){
                        // console.log(arg);
                        return arg.name+arg.percent+"%";
                    }
                }
                    // [5, 20, 36, 10, 10, 20]
            }
        ]
    };
    // 使用刚指定的配置项和数据显示图表。
    mycharts.setOption(option);

    //警情统计数据
    var issuedata=[];
    $.ajax({
        url:"${pageContext.request.contextPath}/issue/issueTypeFromChart",
        async:false,
        success:function (data){
            // data=JSON.stringify(data);
            // console.log(data);
            issuedata=data;
        }
    });
    var issueChart=echarts.init(document.getElementById("chart3"));
    var opt= {
        title: {
            // text: 'ECharts 入门示例'
        },
        tooltip: {
            trigger:"item",
            formatter:'{b}   出现{c}次'
        },
        legend: {
            data: ['销量']
        },
        // xAxis: {
        //     data: ['衬衫', '羊毛衫', '雪纺衫', '裤子', '高跟鞋', '袜子']
        // },
        // yAxis: {},
        series: [
            {
                // name: ,
                type: 'pie',
                data: issuedata,
                label:{
                    show:true,
                    formatter:function (arg){
                        // console.log(arg);
                        return arg.name+arg.percent+"%";
                    }
                },
                roseType:'radius'
                // [5, 20, 36, 10, 10, 20]
            }
        ]
    };
    issueChart.setOption(opt);

    //=============================as图表部分-=========================================
var asdata=[];
$.getJSON("http://api.bilibili.com/x/relation/stat?vmid=703007996&jsonp=jsonp",function (data){
    asdata=data;
    console.log(asdata);
});
// $.ajax({
//     url:"http://api.bilibili.com/x/relation/stat?vmid=703007996&jsonp=jsonp",
//     type:"post",
//     // async:false,
//     success:function (data){
//         // data=JSON.stringify(data);
//         console.log(data);
//         issuedata.push(data);
//     }
// });
var asChart=echarts.init(document.getElementById("aschart"));
var opt= {
    title: {
        text: 'A-SOUL_Official'
    },
    // tooltip: {
    //     trigger:"item",
    //     formatter:'{b}   出现{c}次'
    // },
    // legend: {
    //     data: ['销量']
    // },
    xAxis: {
        data: ['衬衫', '羊毛衫', '雪纺衫', '裤子', '高跟鞋', '袜子']
    },
    series: [
        {
            // name: ,
            type: 'line',
            data: asdata,
            label:{
                show:true,
                // formatter:function (arg){
                //     // console.log(arg);
                //     return arg.name+arg.percent+"%";
                // }
            },
            roseType:'radius'
            // [5, 20, 36, 10, 10, 20]
        }
    ]
};
asChart.setOption(opt);
</script>
</html>