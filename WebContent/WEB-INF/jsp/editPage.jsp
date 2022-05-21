<%--
Created by IntelliJ IDEA.
User: lenovo
Date: 2022/3/12
Time: 20:19
To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Tabib Apps web | Admin Dashboard Template</title>
    <!-- Base Styling  -->
    <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
<%--    <link rel="stylesheet" href="/resources/demos/style.css">--%>
    <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
    <script src="${pageContext.request.contextPath}../../js/jquery3-2.1.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}../../css/fonts.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../../css/style.css">
</head>

<body>
<%--模态框1拒绝--%>
<div class="modal fade" id="denyModal" tabindex="2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"	>
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h2 class="modal-title "  >
                    <div class="text-center" id="modallable"></div>
                </h2>
                <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
                <div class="col-lg-12">
                    <div class="row">
                        <div class="col-lg-3">
                            填写拒绝原因
                        </div>
                        <div class="col-lg-7">
                            <textarea rows="" cols="" class="form-control"id="reasontext"></textarea>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <input type="hidden" id="hdpnum">
                    <button type="button" class="btn btn-success" data-bs-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-danger" id="denybtn">确认拒绝</button>
                </div>
            </div>
        </div>

    </div><!-- /.modal-content -->
</div>
<script>
    $( function() {
        $( "#tabs" ).tabs();
    } );
</script>
<%--标签页--%>
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
                        <h4 class="card-title">物资审批</h4>
                    </div>
                    <div class="card-body">
                        <div class="col-lg-12">
                            <div class="row">
                                <%--                                <div class="col-lg-2">--%>
                                <%--                                    <button type="button" class="btn btn-primary" id="addpolice">新增</button>--%>
                                <%--                                </div>--%>
                                <div class="col-lg-3">
                                    <input class="form-control" placeholder="输入物品名" id="searchitem" style="height: 38px">
                                </div>
                                <div class="col-lg-2">
                                    <button type="button" class="btn btn-warning" id="querybtn">检索</button>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="card-body">
                        <div class="form-group">
                        </div>
<%--===========================用自带标签============================--%>
                        <ul class="nav nav-tabs" id="myTab" role="tablist">

                            <li class="nav-item col-md-4" role="presentation">
                                <button class="nav-link" id="wsp-tab" data-bs-toggle="tab" data-bs-target="#wsp" type="button" role="tab" aria-controls="wsp" aria-selected="true">
                                    未审批
                                </button>
                            </li>
                            <li class="nav-item col-md-4" role="presentation">
                                <button class="nav-link" id="ytg-tab" data-bs-toggle="tab" data-bs-target="#ytg" type="button" role="tab" aria-controls="ytg" aria-selected="false">已通过</button>
                            </li>
                            <li class="nav-item col-md-4" role="presentation">
                                <button class="nav-link" id="yjj-tab" data-bs-toggle="tab" data-bs-target="#yjj" type="button" role="tab" aria-controls="yjj" aria-selected="false">已拒绝</button>
                            </li>
                        </ul>
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade" id="wsp" role="tabpanel" aria-labelledby="wsp-tab">
                                <div class="card m-t-30">
                                    <div class="card-body">
                                                <div class="table-responsive" >
                                                    <table class="table table-hover">
                                                        <thead>
                                                        <tr>
                                                            <th>申请人</th>
                                                            <th >申请日期</th>
                                                            <th >申请物品</th>
                                                            <th >申请状态</th>
                                                            <th>操&nbsp;&nbsp;&nbsp;&nbsp;作</th>
                                                        </tr>
                                                        </thead>
                                                        <!-- On rows -->
                                                        <!-- On cells (`td` or `th`) -->
                                                        <tbody id="cordtbody1">
                                                        </tbody>
                                                    </table>
                                                </div>

                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane fade" id="ytg" role="tabpanel" aria-labelledby="ytg-tab">
                                <div class="card m-t-30">
                                    <div class="card-body">
                                                <div class="table-responsive" >
                                                    <table class="table table-hover">
                                                        <thead>
                                                        <tr>
                                                            <th>申请人</th>
                                                            <th >申请日期</th>
                                                            <th >申请物品</th>
                                                            <th >申请状态</th>
                                                            <th >通过日期</th>
                                                            <%--                                            <th>操&nbsp;&nbsp;&nbsp;&nbsp;作</th>--%>
                                                        </tr>
                                                        </thead>
                                                        <!-- On rows -->
                                                        <!-- On cells (`td` or `th`) -->
                                                        <tbody id="cordtbody2">
                                                        </tbody>
                                                    </table>
                                                </div>
                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane fade" id="yjj" role="tabpanel" aria-labelledby="yjj-tab">
                                <div class="card m-t-30">
                                    <div class="card-body">
                                                <div class="table-responsive" >
                                                    <table class="table table-hover">
                                                        <thead>
                                                        <tr>
                                                            <th>申请人</th>
                                                            <th >申请日期</th>
                                                            <th >申请物品</th>
                                                            <th >申请状态</th>
                                                            <th >处理日期</th>
                                                            <th >备&nbsp;&nbsp;&nbsp;&nbsp;注</th>
                                                            <%--                                            <th>操&nbsp;&nbsp;&nbsp;&nbsp;作</th>--%>
                                                        </tr>
                                                        </thead>
                                                        <!-- On rows -->
                                                        <!-- On cells (`td` or `th`) -->
                                                        <tbody id="cordtbody3">
                                                        </tbody>
                                                    </table>
                                                </div>

                                    </div>
                                </div>
                            </div>



                        </div>

                    </div>

                </div>
            </div>
        </div>

    </div>
</div>
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
    $("#cordtbody1").ready(function (){
        $.ajax({
            url:"${pageContext.request.contextPath}/apply/checkCordByStatus?orderstatus="+1,
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log("查到综合列表",data);
                // 将返回的数据动态加载到tbody里面
                var thelist=[];
                var tbody = document.getElementById("cordtbody1")
                // cordlist=[];
                for (i1 in data){
                    // cordlist.push(data[i1]);
                    // var tr=document.createElement("tr");
                    // tbody.append(tr);
                    var tr= '<tr><input type="hidden" id="orderid" value="'+data[i1].orderid+'"/><td>'+data[i1].pname+'</td>'+
                        '<td><input type="hidden" id="dealdate">'+format(data[i1].orderdate)+'</td>'+
                        '<td>'+getItemsStr(data[i1].itemsList)+'</td>'+
                        '<td>'+setStatus(data[i1].orderstatus)+'</td>'+
                        '<td>'+'<button type="button" class=" btn-sm btn-info " data-toggle="modal" data-target="#myModal" onclick="pass(this)">通过</button>&nbsp;<button type="button" class=" btn-sm btn-danger " data-toggle="modal" data-target="#myModal" onclick="deny(this)">拒绝</button>'+
                        '</td></tr>';
                    thelist.push(tr);
                }
                // console.log(thelist);
                $("#cordtbody1").html(thelist);
            }
        });
    });
    $("#cordtbody2").ready(function (){
        $.ajax({
            url:"${pageContext.request.contextPath}/apply/checkCordByStatus?orderstatus="+2,
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log("查到通过列表",data);
                // 将返回的数据动态加载到tbody里面
                var thelist=[];
                var tbody = document.getElementById("cordtbody2")
                // cordlist=[];
                for (i1 in data){
                    // cordlist.push(data[i1]);
                    // var tr=document.createElement("tr");
                    // tbody.append(tr);
                    var tr= '<tr><td>'+data[i1].pname+'</td>'+
                        '<td>'+format(data[i1].orderdate)+'</td>'+
                        '<td>'+getItemsStr(data[i1].itemsList)+'</td>'+
                        '<td>'+setStatus(data[i1].orderstatus)+'</td>'+
                        '<td>'+format(data[i1].dealdate)+'</td></tr>';
                    thelist.push(tr);
                }
                // console.log(thelist);
                $("#cordtbody2").html(thelist);
            }
        });
    });
    $("#cordtbody3").ready(function (){
        $.ajax({
            url:"${pageContext.request.contextPath}/apply/checkCordByStatus?orderstatus="+3,
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log("查到通过列表",data);
                // 将返回的数据动态加载到tbody里面
                var thelist=[];
                var tbody = document.getElementById("cordtbody3")
                // cordlist=[];
                for (i1 in data){
                    // cordlist.push(data[i1]);
                    // var tr=document.createElement("tr");
                    // tbody.append(tr);
                    var tr= '<tr><td>'+data[i1].pname+'</td>'+
                        '<td>'+format(data[i1].orderdate)+'</td>'+
                        '<td>'+getItemsStr(data[i1].itemsList)+'</td>'+
                        '<td>'+setStatus(data[i1].orderstatus)+'</td>'+
                        '<td>'+format(data[i1].dealdate)+'</td>' +
                        '<td>'+data[i1].judgereason+'</td></tr>';
                    thelist.push(tr);
                }
                // console.log(thelist);
                $("#cordtbody3").html(thelist);
            }
        });
    });
    function format(date){
        var d=new Date(date);
        var val=d.getFullYear()+"-"+(d.getMonth()+1)+"-" +(d.getDate());
        return val ;
    };
    function setStatus(val){
        if (val=='1'){
            val="待处理";
        }
        if (val=='2'){
            val="通过";
        }
        if (val=='3'){
            val="拒绝"
        }
        return val;
    }
    function getItemsStr(data){
        var namelis="";
        for (i in data){
            namelis=namelis+data[i].itemsname+" ";
        }
        return namelis;
    }
    function pass(obj){
        var orderid=$(obj).parents("tr").find("input").eq(0).val();
        $(obj).parents("tr").find("input").eq(1).val(format(new Date()));
        var dealdate=$(obj).parents("tr").find("input").eq(1).val();
        var tmap={
            "orderid":orderid,
            "dealdate":dealdate,
            "orderstatus":2
        }
        tmap=JSON.stringify(tmap);
        console.log(tmap);
        $.ajax({
            url:"${pageContext.request.contextPath}/apply/changeStatusByStatus",
            data:{data:tmap},
            contentType:"text",
        });
        console.log($(obj).parents("tr").html());
        $(obj).parents("tr").remove();
    }
    function deny(obj){
        var orderid=$(obj).parents("tr").find("input").eq(0).val();
        $(obj).parents("tr").find("input").eq(1).val(format(new Date()));
        var dealdate=$(obj).parents("tr").find("input").eq(1).val();
        var tmap={
            "orderid":orderid,
            "dealdate":dealdate,
            "orderstatus":3,
            "judgereason":""
        }
        $("#denyModal").modal('show');
        $("#modallable").html("拒绝<font color='red'>"+$(obj).parents("tr").find("td").eq(0).html()+"</font>的申请");
        //监听器
        $('#denybtn').on('click', function() {
            if ($("#reasontext").val().length>0){
                tmap.judgereason=$("#reasontext").val();
                tmap=JSON.stringify(tmap);
                console.log(tmap);
                $.ajax({
                    url:"${pageContext.request.contextPath}/apply/denyItemsOrder",
                    data:{data:tmap},
                    contentType:"text",
                });
                console.log($(obj).parents("tr").html());
                $(obj).parents("tr").remove();
            }else {
                alert("请填写拒绝原因");
            }
            $("#denyModal").modal('hide');
        });


    }
</script>
</html>