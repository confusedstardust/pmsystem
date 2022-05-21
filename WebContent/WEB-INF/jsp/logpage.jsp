<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/3/1
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script src="${pageContext.request.contextPath}../../js/jquery3-2.1.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}../../css/fonts.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../../css/style.css">
    <style>
        *{margin:0;padding:0}
        /*body{font-size:14px;font-family:"微软雅黑";background:url("images/2.jpg")top no-repeat;background-attachment:fixed;z-index:0;background-size:100%;}*/
        .box{height:500px;margin:100px auto;position:relative;z-index:1;}
        /*内容发布区域*/
        .box .boxcenter{width:500px;height:200px;background:#fff;position:absolute;top:80px;left:180px;border:1px solid green;border-radius:6px;}
        .box .boxcenter .boxc_t{height:30px;line-height:30px;}
        .box .boxcenter .boxc_t h4{padding-left:20px;background:#3BBFB4;border-top-left-radius:6px;
            border-top-right-radius:6px;}
        .box .boxcenter .boxc_c{width:460px;height:100px;border:1px solid #A6C8FF;margin:8px auto;text-indent:10px;box-shadow:0 0 4px #A6C8FF;}
        .box .boxcenter .boxc_b{width:80px;height:30px;position:absolute;right:10px;bottom:8px;}
        .box .boxcenter .boxc_b a{font-size:14px;color:#fff;line-height:30px;background:#3bbfb4;border-radius:6px;
            display:block;text-align:center;text-decoration:none;}
        .box .boxcenter .boxc_b a:hover{background:#2C8E86;}
        .box .timeline{width:60px;height:100%;position:absolute;top:100px;left:80px;border-right:2px solid #5d7895;}/**/
        .timeline .timeline_t{width:50px;height:50px;border-radius:50%;border:1px solid #fff;background-size:100%;}
        .timeline .nextbox{width:380px;height:80px;position:absolute;left:60px;}
        .a{width:380px;height:80px;background:#fff;border-radius:6px;margin-top:30px;font-size:16px;line-height:20px;text-indent:20px;word-break:break-all;position:relative;left:6px;}
        .a .b{width:6px;height:6px;border-radius:50%;border:2px solid #fff;background:#9DCFE1;position:absolute;top:35px;left:-10px;}
        #time{font-size:20px;color:#ababab;}
        #hour{font-size:12px;color:#92CADE;}
    </style>
</head>
<body>
<div id="main-wrapper" class="show">
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
                            <h4 class="card-title">我的日志</h4>
                        </div>
                        <div class="card-body">
                            <div class="col-lg-12">
                                <div class="row">
                                    <div class="col-xl-6">
                                        <button type="button" data-toggle="modal" data-target="#myModal" onclick="showmodal()" class="btn btn-warning w-35 h-56">新增工作日志</button>
                                    </div>
                                    <div class="col-xl-6">
                                        <button type="button" data-toggle="modal" data-target="#myIssueModal" onclick="showissuemodal()" class="btn btn-success w-35 h-56">新增警情日志</button>
                                    </div>
                                    <div class="col-xl-4">
<%--                                        <button type="button" data-toggle="modal" data-target="#myModal" onclick="showmodal()" class="btn btn-info w-30 h-56">公开日志列表</button>--%>
                                    </div>
                                </div>
                            </div>

                        </div>

                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="card">
                        <div class="card-header">
                            <h4 class="card-title">日志记录</h4>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="box" style="margin-top: -90px; margin-left: -99px;">
                                        <!--时光轴线-->
                                        <div class="timeline">
                                            <div class="timeline_t">
                                            </div>
                                            <div class="nextbox"></div>
                                        </div>

                                    </div>
                                </div>
                                <%--                            --%>
                                <div class="col-lg-6">
                                   <div class="row">
                                       <div class="col-lg-5">
                                           <input class="form-control" placeholder="查询警情日志" id="searchissuelog" style="height: 38px">
                                       </div>
                                       <div class="col-lg-4">
                                           <select class="form-select" name="serachpartten" id="partten">
                                               <option value="1">按日志名</option>
                                               <option value="2">按接警号</option>
                                           </select>
                                       </div>
                                       <div class="col-lg-3">
                                           <button type="button" class="btn btn-warning" id="querylogbtn">检索</button>
                                       </div>
                                   </div>
                                    <div class="row">
                                        <table id="issuelogcord" class="table table-hover">
                                            <thead>
                                            <tr>
                                                <th>接警单号</th>
                                                <th>日志名</th>
                                                <th>创建日期</th>
                                                <th>操作</th>
                                                <th></th>
                                            </tr>
                                            </thead>
                                            <tbody id="cordbody">

                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-12">
                                <div class="page" id="Page">

                                </div>
                            </div>

                            <script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
                            <script>
<%--                                添加工作日志--%>
                                $(function(){
                                    var count=0;
                                    $("#updateinfo").click(function(){
                                        //获取值
                                        var title=$("#logtitle").val();
                                        var center = $("#logcontent").val();//.appendTo("nextbox");
                                        //判断有效性
                                        if(center==""){
                                            alert("请输入内容喔！");
                                            return;
                                        }
                                        //封装数据
                                        var list={
                                            "logdate":format(new Date()),
                                            "logdetail": center,
                                            "pnum": ${policeSession.pnum},
                                            "logtitle":title,
                                            "issueid":1,
                                            "logtype":1
                                        };
                                        list=JSON.stringify(list);
                                        console.log(list);
                                        //异步提交
                                        $.ajax({
                                            url:"${pageContext.request.contextPath}/log/insertlog",
                                            data:{data:list},
                                            contentType:"text",
                                            success:function (data){
                                                alert(data);
                                                //    跳转
                                                $.ajax({
                                                    url:"${pageContext.request.contextPath}log/logpage",
                                                    success:function (data){
                                                        $("#ajaxrequest").html(data);
                                                    }
                                                });
                                            }
                                        });
                                        $(".nextbox").prepend("<div class='form-group' style='width: 500px' onclick='toggle()'><div> "+
                                            "<div class='b'></div>"+
                                            "<span id='time'>"+year+"-"+
                                            month+"-"+
                                            day+"&nbsp;&nbsp;"+
                                            "<span id='hour' >"+"《"+title+"》"+"</span>"+
                                            "</span>"+
                                            "<br>"+
                                            "<textarea class='form-control' id='panel' readonly='readonly' >"+center+"</textarea>"+
                                            "</div></div>");
                                        count=count+1;
                                        var height=$(".box").height();
                                        height=height+500;
                                        if (count>2){

                                            $(".box").css({"height":height+"px"});
                                            count=0;
                                        }
                                        $("#logcontent").val("");
                                        $("#logtitle").val("");
                                        $("#myModal").modal("hide");
                                    });
                                    //alert(1);
                                    $("#logcontent").keydown(function(event){
                                        var len =$("#logcontent").val().length;
                                        if(len > 512){
                                            alert("到达最大长度！");
                                        }
                                    });
                                    var dateDom = new Date();
                                    //获取本地时间，年月日时分
                                    var year = dateDom.getFullYear();
                                    var month = dateDom.getMonth()+1;
                                    var day = dateDom.getDate();
                                    // var hour = dateDom.getHours();
                                    // var min = dateDom.getMinutes();
                                });
                            </script>
                        </div>
                    </div>
                </div>
            </div>
        </div>



<%--        调用方法：--%>
<%--        $(".tcdPageCode").createPage({--%>
<%--        pageCount:10,--%>
<%--        current:1,--%>
<%--        backFn:function(p){--%>
<%--        //单击回调方法，p是当前页码--%>
<%--        }--%>
<%--        });--%>
<%--        pageCount：总页数--%>
<%--        current：当前页--%>
       <pre><br>

</pre>


    </div>
</div>
<%--模态框1工作日志--%>
<div class="modal fade" id="myModal" tabindex="2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"	>
    <div class="modal-dialog">
        <div class="modal-content" style="width: 1000px;margin-left: -250px;">
            <div class="modal-header">
                <h2 class="modal-title "  >
                    <div class="text-center" id="modallable">新增工作日志</div>
                </h2>
                <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-12 col-lg-12">
                        <div class="text-left"><label><h3>工作日志</h3></label></div>
                        <form action="#" method="post"  id="??">
                            <div class="row">
                                <div class="col-xl-12">
                                    <div class="form-group row">
                                        <label class="col-xl-12 col-form-label" >日志标题 <span class="text-danger"></span></label>
                                        <div class="col-lg-6">
                                            <input type="text" class="form-control" id="logtitle" style="height: 30px" >
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-12">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">主要内容 <span class="text-danger"></span></label>
                                        <div class="col-lg-12">
                                            <textarea type="text" class="form-control" id="logcontent" style="height: 400px" ></textarea>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-12" >

                                    </div>
                                </div>
                                <%--                                <div class="col-xl-12">--%>
                                <%--                                    <button type="button" class="btn btn-primary float-right" onclick="clone()" style="margin-left: 510px;">新增详情</button>--%>
                                <%--                                </div>--%>
                            </div>
                        </form>
                    </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-danger" data-bs-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="updateinfo">
                        提交
                    </button>
                </div>
                </div>
            </div>

        </div><!-- /.modal-content -->
    </div>
<%--模态框2用于警情日志--%>
<div class="modal fade" id="myIssueModal" tabindex="2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"	>
    <div class="modal-dialog">
        <div class="modal-content" style="width: 1000px;margin-left: -250px;">
            <div class="modal-header">
                <h2 class="modal-title "  >
                    <div class="text-center" >新增警情日志</div>
                </h2>
                <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-12 col-lg-12">
                        <div class="text-left"><label><h3>警情日志</h3></label></div>
                        <form action="#" method="post"  id="">
                            <div class="row">
                                <div class="col-xl-12">
                                    <div class="form-group row">
                                        <label class="col-xl-1 col-form-label" >日志标题 <span class="text-danger"></span></label>
                                        <div class="col-lg-3">
                                            <input type="text" class="form-control" id="issuelogtitle" style="height: 38px" >
                                        </div>
                                        <label class="col-xl-1 col-form-label" >所属案件 <span class="text-danger"></span></label>
                                        <div class="col-lg-3">
                                            <input type="text" class="form-control" id="searchissue" style="height: 38px" >
                                        </div>
<%--                                        --%>
                                        <div class="col-lg-2">
                                            <select class="form-select" name="serachpartten" id="serachpartten">
                                                <option value="1">按案件名</option>
                                                <option value="2">按接警号</option>
                                            </select>
                                        </div>
                                        <div class="col-lg-2">
                                            <button type="button" class="btn btn-warning" onclick="search()">检索</button>
                                        </div>
                                        </div></div>
                                    </div>
                                </form>
                        <div class="col-lg-3" id="resultset">
<%--                            显示结果--%>
                        </div>
                                <div class="col-xl-12">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">主要内容 <span class="text-danger"></span></label>
                                        <div class="col-lg-12">
                                            <textarea type="text" class="form-control" id="issuelogcontent" style="height: 400px" ></textarea>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-12">

                                </div>
                            </div>
                    </div>
            <div class="modal-footer ">
                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="issuelogsubmit" >
                    提交
                </button>
            </div>
                </div>

            </div>

        </div>

    </div><!-- /.modal-content -->
<%--模态框3警情日志详情--%>
<div class="modal fade" id="IssuedetailModal" tabindex="2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"	>
    <div class="modal-dialog">
        <div class="modal-content" style="width: 1000px;margin-left: -250px;">
            <div class="modal-header">
                <h2 class="modal-title "  >
                    <div class="text-center"id="titleofissuelog">警情日志详情</div>
                </h2>
                <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-12 col-lg-12">
                        <div class="text-left"><label><h3 id="islgtt">案件详情</h3></label></div>
                        <form action="#" method="post" >
                            <div class="row">
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-3 col-form-label">案件名 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="issuetitle" readonly="readonly">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-3 col-form-label">案件号 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="issueid" readonly="readonly">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-12">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">报警内容 <span class="text-danger"></span></label>
                                        <div class="col-lg-12">
                                            <textarea type="text" class="form-control" id="issuedetail" readonly="readonly"></textarea>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-12" id="ptn">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">案件详情 <span class="text-danger"></span></label>
                                        <div class="col-lg-12" id="chose">
                                            <textarea type="text" class="form-control" id="puteventmanname" readonly="readonly"></textarea>
                                        </div>


                                    </div>
                                </div>
                                <div class="col-xl-12">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">警情日志<span class="text-danger"></span></label>
                                        <div class="col-lg-12">
                                            <textarea type="text" class="form-control" id="issuelogdetail"></textarea>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>

                    </div>
                </div>
                <div class="modal-footer ">
                    <button type="button" class="btn btn-danger" data-bs-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="issuelogupdate">
                        提交更改
                    </button>
                </div>
            </div>

        </div>

    </div>

</div>
</div><!-- /.modal -->
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
</html>
<script src="${pageContext.request.contextPath}../../js/MyPage.js"></script>
<script>
<%--    调用三个模态框--%>
    function showmodal(){
        $("#myModal").modal("show");
    }
    function showissuemodal(){
        $("#myIssueModal").modal("show");
    }
    var oldval;
    function showissuedetailmodal(temp){
        $("#IssuedetailModal").modal("show");
        $("#islgtt").html("《"+cordlist[temp].logtitle+"》");
        $("#issueid").val(cordlist[temp].issueid);
        $("#issuelogdetail").val(cordlist[temp].logdetail);
        oldval=$("#issuelogdetail").val();
        //异步查案请
        $.ajax({
            url:"${pageContext.request.contextPath}/issue/queryissuebyissueid?issueid="+cordlist[temp].issueid,
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log(data);
                $("#issuetitle").val(data.issuetitle);
                $("#issuedetail").val(data.issuedetail);
                $("#puteventmanname").val(data.puteventmanname);
            }
        });


    }
    function format(date){
        var d=new Date(date);
        var val=d.getFullYear()+"-"+(d.getMonth()+1)+"-" +(d.getDate());
        return val ;
    };


    var cordlist=[];
$.ajax({
    url:"${pageContext.request.contextPath}/log/queryissuelog?pnum=${policeSession.pnum}&pageNum="+1,
    type:"post",
    success:function (data){
        data=JSON.stringify(data);
        data=JSON.parse(data);
        console.log("查到用户的警情日志列表",data);
        // 将返回的数据动态加载到tbody里面
        var thelist=[];
        cordlist=[];
        var tbody = document.getElementById("cordbody")
        for (i1 in data){
            cordlist.push(data[i1]);
            var tr=document.createElement("tr");
            tbody.append(tr);
            var tr= '<tr><td>'+data[i1].issueid+'</td>'+
                '<td>'+data[i1].logtitle+'</td>'+
                '<td>'+format(data[i1].logdate)+'</td>'+
                '<td>'+'<button type="button" class=" btn-sm btn-info " data-toggle="modal" data-target="#myModal" onclick="showissuedetailmodal('+i1+')">查看详情</button>'+'</td></tr>';
            thelist.push(tr);
            //为每一行设置一个按钮
            // rowdata.push(data[i]);
        }
        $("#cordbody").html(thelist);
    }
});


    //展示工作日志记录
    var count=0;
    $(".nextbox").ready(function (){
        $.ajax({
            url: "${pageContext.request.contextPath}/log/queryworklog?pnum=${policeSession.pnum}",
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log(data);
                for (i in data){
                    $(".nextbox").prepend("<div class='form-group'><div style='width: 500px'> "+
                        "<div class='b'></div>"+
                        "<span id='time' onclick='toggle("+i+")'>"+format(data[i].logdate)+"&nbsp;&nbsp;"+
                        "<span id='hour' >"+"《"+data[i].logtitle+"》"+"</span>"+
                        "</span>"+ "<br>"+
                        "<textarea style='display: none'  class='form-control' id='panel' readonly='readonly' >"+data[i].logdetail+"</textarea>"+
                        "</div></div>");
                    count=count+1;
                    var height=$(".box").height();
                    height=height+100;
                    if (count>2){
                        $(".box").css({"height":height+"px"});
                        count=0;
                    }
                }
            }
        });
    });
    //展开和闭合详细内容
    function toggle(x){
        var x=i-x;
        var texteareaList=$(".nextbox").find("textarea");
        console.log(x,texteareaList[x]);
        $(texteareaList[x]).slideToggle("slow");
    }
    //根据名称或id模糊查找警情与日志绑定
    function search(){
        var partten= $("#serachpartten").val();
        var arg=$("#searchissue").val();
        console.log(partten,arg);
        $.ajax({
            url:"${pageContext.request.contextPath}/log/searchlog?partten="+partten+"&arg="+arg,
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                var list=[];
                for (items in data){
                    var tile='<tr><td><input type="radio" name="issue" id="issueradio" value="'+data[items].issueid+'">'+data[items].issuetitle+'</td></tr>';
                    list.push(tile);
                }
                $("#resultset").html(list);

            }
        });
    }
    //提交工作日志
    $("#issuelogsubmit").click(function (){
        var title=$("#issuelogtitle").val();
        var issueid=$("input:radio:checked").val();
        var logcontent=$("#issuelogcontent").val();
        var list={
            "logdate":format(new Date()),
            "logdetail": logcontent,
            "pnum": ${policeSession.pnum},
            "logtitle":title,
            "issueid":issueid,
            "logtype":2
        };
        list=JSON.stringify(list);
        $.ajax({
            url:"${pageContext.request.contextPath}/log/insertissuelog",
            data:{data:list},
            contentType: "text",
            success:function (){
                $("#myIssueModal").modal("hide");
                //    跳转
                $.ajax({
                    url:"${pageContext.request.contextPath}log/logpage",
                    success:function (data){
                        $("#ajaxrequest").html(data);
                    }
                });
                // $("#issuelogcontent").val("");
                // $("#resultset").children("tr").remove();
                // $("#issuelogtitle").val("");
                // $("#searchissue").val("");
            }
        });
    });
<%--    展示警情相关的日志记录--%>
//更新警情日志详情
$("#issuelogupdate").click(function (){
    var newval=$("#issuelogdetail").val();
    if (newval==oldval){
        $("#IssuedetailModal").modal('hide');
    }else {
        newval=format(new Date())+newval;
        var log={
            "issueid":$("#issueid").val(),
            "logdetail":newval
        }
        log=JSON.stringify(log);
        $.ajax({
           url:"${pageContext.request.contextPath}/log/updatelog",
            data:{data:log},
            contentType:"text",
            success:function (data){
               alert(data);
                $("#IssuedetailModal").modal("hide");
            //    跳转
                $.ajax({
                    url:"${pageContext.request.contextPath}log/logpage",
                    success:function (data){
                        $("#ajaxrequest").html(data);
                    }
                });
            }
        });
    }
});
//查询日志by不同方式
$("#querylogbtn").click(function (){
    var partten=$("#partten").val();
    var searchissuelog=$("#searchissuelog").val();
    console.log(partten,searchissuelog);
    $.ajax({
        url:"${pageContext.request.contextPath}/log/qilbp?partten="+partten+"&arg="+searchissuelog+"&pnum="+${policeSession.pnum},
        // type:"post",
        success:function (dataa){
            dataa=JSON.stringify(dataa);
            dataa=JSON.parse(dataa);
            var theset=[];
            cordlist=[];
            for (v in dataa){
                var trandtd="<tr>" +
                    "<td>"+dataa[v].issueid+"</td>" +"<td>"+dataa[v].logtitle+"</td>"
                    +"<td>"+format(dataa[v].logdate)+"</td>"+"<td>"+'<button type="button" class=" btn-sm btn-info " data-toggle="modal" data-target="#myModal" onclick="showissuedetailmodal('+v+')">查看详情</button>'+"</td>"
                "</tr>";
                theset.push(trandtd);
                cordlist.push(dataa[v]);
            }
            console.log("cordlist列表"+cordlist);
            $("#cordbody").html(theset);
        }
    });
});
</script>