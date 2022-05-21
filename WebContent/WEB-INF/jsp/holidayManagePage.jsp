<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/3/14
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <button type="button" class="btn btn-danger" id="denybtn">删除</button>
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
                        <h4 class="card-title">请假审批</h4>
                    </div>
                    <div class="card-body">
                        <div class="col-lg-12">
                            <div class="row">
                                <%--                                <div class="col-lg-2">--%>
                                <%--                                    <button type="button" class="btn btn-primary" id="addpolice">新增</button>--%>
                                <%--                                </div>--%>
                                <div class="col-lg-3">
                                    <input class="form-control" placeholder="输入警员名" id="searchitem" style="height: 38px">
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

                        <div id="tabs">
                            <ul>
                                <li><a href="#tabs-1">未审批</a></li>
                                <li><a href="#tabs-2">已通过</a></li>
                                <li><a href="#tabs-3">已拒绝</a></li>
                            </ul>
                            <div id="tabs-1">
                                <div class="table-responsive" >
                                    <table class="table table-hover">
                                        <thead>
                                        <tr>
                                            <th>申请人</th>
                                            <th>请假类型</th>
                                            <th >开始日期</th>
                                            <th >结束日期</th>
                                            <th >备&nbsp;&nbsp;&nbsp;&nbsp;注</th>
                                            <th>操&nbsp;&nbsp;&nbsp;&nbsp;作</th>
                                        </tr>
                                        </thead>
                                        <!-- On rows -->
                                        <!-- On cells (`td` or `th`) -->
                                        <tbody id="cordtbody1">
                                        </tbody>
                                    </table>
                                </div>
                                <%--                                <div class="col-xl-12"><button type="button" class="btn btn-primary float-end" onclick="addinfo()" >新增物品</button></div>--%>
                                <%--                                <div class="col-xl-12" id="newrow"></div>--%>
                            </div>
                            <div id="tabs-2">
                                <div class="table-responsive" >
                                    <table class="table table-hover">
                                        <thead>
                                        <tr>
                                            <th>申请人</th>
                                            <th>请假类型</th>
                                            <th >开始日期</th>
                                            <th >结束日期</th>
                                            <th >备&nbsp;&nbsp;&nbsp;&nbsp;注</th>
                                            <th>批准日期</th>
                                            <%--                                            <th>操&nbsp;&nbsp;&nbsp;&nbsp;作</th>--%>
                                        </tr>
                                        </thead>
                                        <!-- On rows -->
                                        <!-- On cells (`td` or `th`) -->
                                        <tbody id="cordtbody2">
                                        </tbody>
                                    </table>
                                </div>
                                <%--                                <div class="col-xl-12"><button type="button" class="btn btn-primary float-end" onclick="addinfo()" >新增物品</button></div>--%>
                                <%--                                <div class="col-xl-12" id="newrow"></div>--%>
                            </div>
                            <div id="tabs-3">
                                <div class="table-responsive" >
                                    <table class="table table-hover">
                                        <thead>
                                        <tr>
                                            <th>申请人</th>
                                            <th>请假类型</th>
                                            <th >开始日期</th>
                                            <th >结束日期</th>
                                            <th >备&nbsp;&nbsp;&nbsp;&nbsp;注</th>
                                            <th>拒绝原因</th>
                                            <%--                                            <th>操&nbsp;&nbsp;&nbsp;&nbsp;作</th>--%>
                                        </tr>
                                        </thead>
                                        <!-- On rows -->
                                        <!-- On cells (`td` or `th`) -->
                                        <tbody id="cordtbody3">
                                        </tbody>
                                    </table>
                                </div>
                                <%--                                <div class="col-xl-12"><button type="button" class="btn btn-primary float-end" onclick="addinfo()" >新增物品</button></div>--%>
                                <%--                                <div class="col-xl-12" id="newrow"></div>--%>
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
            url:"${pageContext.request.contextPath}/apply/checkHolidayApply?applytypeid="+1,
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
                    var tr= '<tr><input type="hidden" id="applyid" value="'+data[i1].applyid+'"/><td>'+data[i1].pname+'</td>'+
                        '<td><input type="hidden" id="confirmdate">'+data[i1].applytype+'</td>'+
                        '<td>'+format(data[i1].applydate)+'</td>'+
                        '<td>'+format(data[i1].enddate)+'</td>'+
                        '<td>'+data[i1].applydetail+'</td>'+
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
            url:"${pageContext.request.contextPath}/apply/checkHolidayApply?applytypeid="+2,
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
                        '<td>'+data[i1].applytype+'</td>'+
                        '<td>'+format(data[i1].applydate)+'</td>'+
                        '<td>'+format(data[i1].enddate)+'</td>'+
                        '<td>'+data[i1].applydetail+'</td>'+
                        '<td>'+format(data[i1].confirmdate)+'</td></tr>';
                    thelist.push(tr);
                }
                // console.log(thelist);
                $("#cordtbody2").html(thelist);
            }
        });
    });
    $("#cordtbody3").ready(function (){
        $.ajax({
            url:"${pageContext.request.contextPath}/apply/checkHolidayApply?applytypeid="+3,
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
                    var tr=  '<tr><td>'+data[i1].pname+'</td>'+
                        '<td>'+data[i1].applytype+'</td>'+
                        '<td>'+format(data[i1].applydate)+'</td>'+
                        '<td>'+format(data[i1].enddate)+'</td>'+
                        '<td>'+data[i1].applydetail+'</td>'+
                        '<td>'+data[i1].denyreason+'</td></tr>';
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
            val="拒绝";
        }
        if (val=='3'){
            val="通过"
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
        var applyid=$(obj).parents("tr").find("input").eq(0).val();
        $(obj).parents("tr").find("input").eq(1).val(format(new Date()));
        var confirmdate=$(obj).parents("tr").find("input").eq(1).val();
        var tmap={
            "applyid":parseInt(applyid),
            "confirmdate":confirmdate,
            "applytypeid":2
        }
        tmap=JSON.stringify(tmap);
        console.log(tmap);
        $.ajax({
            url:"${pageContext.request.contextPath}/apply/updateHolidayApply",
            data:{data:tmap},
            contentType:"text",
        });
        console.log($(obj).parents("tr").html());
        $(obj).parents("tr").remove();
    }
    function deny(obj){
        var applyid=$(obj).parents("tr").find("input").eq(0).val();
        $(obj).parents("tr").find("input").eq(1).val(format(new Date()));
        var confirmdate=$(obj).parents("tr").find("input").eq(1).val();
        var tmap={
            "applyid":applyid,
            "confirmdate":confirmdate,
            "applytypeid":3,
            "denyreason":""
        }
        $("#denyModal").modal('show');
        $("#modallable").html("拒绝<font color='red'>"+$(obj).parents("tr").find("td").eq(0).html()+"</font>的申请");
        //监听器
        $('#denybtn').on('click', function() {
            if ($("#reasontext").val().length>0){
                tmap.denyreason=$("#reasontext").val();
                tmap=JSON.stringify(tmap);
                console.log(tmap+"=====temp对象=====");
                $.ajax({
                    url:"${pageContext.request.contextPath}/apply/denyHoliday",
                    data:{data:tmap},
                    contentType:"text",
                });
                $("#reasontext").val('');
                // console.log("=====tmap对象清楚后======="+da);
                $(obj).parents("tr").remove();
            }else {
                alert("请填写拒绝原因");
            }
            $("#denyModal").modal('hide');
        });

    }
</script>
</html>
