<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/3/20
  Time: 17:42
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
    <script src="${pageContext.request.contextPath}../../js/jquery3-2.1.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}../../css/fonts.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../../css/style.css">
</head>

<body>

<%--模态框1确认删除--%>
<div class="modal fade" id="delModal" tabindex="2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"	>
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h2 class="modal-title "  >
                    <div class="text-center" id="modallable">确定删除此部门？</div>
                </h2>
                <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
                <div class="col-lg-12">
                    要删除的部门是：<h3><font  color="red" id="items"></font></h3>
                </div>
                <div class="modal-footer">
                    <input type="hidden" id="hditemsid">
                    <button type="button" class="btn btn-success" data-bs-dismiss="modal">取消</button>
                    <button type="button" class="btn btn-danger" id="delebtn">删除</button>
                </div>
            </div>
        </div>

    </div><!-- /.modal-content -->
</div>
<%--模态框2新增--%>
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
                        <div class="text-left"><label><h3>新增部门</h3></label></div>
                        <div id="infolist" class="row"></div>
                    </div>
                </div>
                <button type="button" class="btn btn-primary float-end" id="additemsinput" >新增部门</button>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="insertinfo">
                    确认新增部门
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<%--模态框3修改--%>
<div class="modal fade" id="ModifyModal" tabindex="2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"	>
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
                        <div class="text-left"><label><h3>修改此部门信息</h3></label></div>
                        <div id="departinfo" class="row">
                            <div class="col-md-6 col-lg-6">
                                <div class="form-group">
                                    <input type="hidden" id="mdfid">
                                    <label for="departname">部门名称</label>
                                    <input type="text" class="form-control" id="departname" placeholder="请输入部门名称">
                                </div>
                            </div>
                            <div class="col-md-6 col-lg-6">
                                <div class="form-group">
                                    <label for="departroot">部门负责人</label>
                                    <input type="text" class="form-control" id="departroot" placeholder="请输入部门负责人">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary"onclick="confirmModify()">
                    确认修改部门信息
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<%--主要页面--%>
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
                        <h4 class="card-title">部门管理</h4>
                    </div>
                    <div class="card-body">
                        <div class="col-lg-12">
                            <div class="row">
                                <%--                                <div class="col-lg-2">--%>
                                <%--                                    <button type="button" class="btn btn-primary" id="addpolice">新增</button>--%>
                                <%--                                </div>--%>
                                    <div class="col-xl-12 "><button type="button" class="btn btn-primary float-end" onclick="addinfo()" >新增部门</button></div>

                            </div>
                        </div>

                    </div>
                    <div class="card-body">
                        <div class="form-group">
                        </div>

                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                <tr >
                                    <td>序号</td>
                                    <td>部门名称</td>
                                    <td>部门人数</td>
                                    <td>部门负责人</td>
                                    <td>操&nbsp;&nbsp;&nbsp;&nbsp;作</td>
                                </tr>
                                </thead>
                                <tbody id="itemslist">
                                </tbody>
                            </table>
                        </div>
                        <div class="col-xl-12" id="newrow"></div>
                    </div>

                </div>
            </div>
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
    // 新增模态框展示
    function addinfo(){
        $("#Addmodal").modal("show");
    }

    var cordlist=[];
    $("#itemslist").ready(function (){
        $.ajax({
            url:"${pageContext.request.contextPath}/depart/queryAlldepart",
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                // console.log("查到物品列表",data);
                // 将返回的数据动态加载到tbody里面
                var thelist=[];
                var tbody = document.getElementById("itemslist")
                cordlist=[];
                for (i1 in data){
                    cordlist.push(data[i1]);
                    // var tr=document.createElement("tr");
                    // tbody.append(tr);
                    var tr= '<tr id="'+i1+'">' +
                        '<input type="hidden" value="'+data[i1].departid+'"><td>'+(parseInt(i1)+1)+'</td>'+
                        '<td>'+data[i1].departname+'</td>'+
                        '<td >'+data[i1].count+'</td>'+
                        '<td> '+data[i1].departroot+'</td>'+
                        '<td>'+'<button type="button" class=" btn-sm btn-info " data-toggle="modal" data-target="#myModal" onclick="deleteitems('+i1+')">删除</button>&nbsp;'+
                        '<button type="button" class=" btn-sm btn-success" data-toggle="modal" data-target="#myModal" onclick="modify('+i1+')">修改</button></td></tr>';
                    thelist.push(tr);
                }
                $("#itemslist").html(thelist);
            }
        });
    });

    var trtemp=99;
    //确认删除的弹出框，显示要删除的内容
    function deleteitems(x){
        console.log(cordlist[x]);
        $("#delModal").modal('show');
        $("#hditemsid").val(cordlist[x].departid);
        $("#items").html('&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
            '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
            '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
            '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+cordlist[x].departname);
        trtemp=x;
    }


    //点击后删除
    $("#delebtn").click(function (){
        var trlist=$("#itemslist").find("tr");
        trlist.eq(trtemp).remove();
        $.ajax({
            url:"${pageContext.request.contextPath}/depart/deletedepart?departid="+$(this).parent().find("input").val(),
            success:function (data){
                alert(data);
                $("#delModal").modal('hide');
                $.ajax({
                    url: "${pageContext.request.contextPath}/depart/departPage",
                    success: function (data) {
                        var html=data;
                        $("#ajaxrequest").html(html);
                    }
                });
            }
        });
    })


    function modify(x){
        $("#ModifyModal").modal("show");
        $("#mdfid").val(cordlist[x].departid);
        $("#departname").val(cordlist[x].departname);
        $("#departroot").val(cordlist[x].departroot);
    }
    function confirmModify(){
        var departname=$("#departname").val();
        var departroot=$("#departroot").val();
        var departid=$("#mdfid").val();
        $.ajax({
            url:"${pageContext.request.contextPath}/depart/modifydepart",

            data: {data:JSON.stringify({"departid":departid,"departname":departname,"departroot":departroot})},
            contentType:"application/json",
            success:function (data){
                alert(data);
                $("#ModifyModal").modal("hide");
                $.ajax({
                    url: "${pageContext.request.contextPath}/depart/departPage",
                    success: function (data) {
                        var html=data;
                        $("#ajaxrequest").html(html);
                    }
                });
            }
        });
    }

    //新增物品
    $("#insertbtn").click(function (){
        var items={
            "itemsname":$("#iname").val(),
            "itemscount":$("#icoutn").val()
        }
        console.log(items);
        items=JSON.stringify(items);
        $.ajax({
            url:"${pageContext.request.contextPath}/items/insertItems",
            data:{data: items},
            contentType: "text",
            success:function (data){
                alert(data);
            }
        });
    });
    //加物品的框框
    $("#additemsinput").click(function (){
        var newrow=$('</br></br><div class="row"> <div class="col-lg-2">部门名称</div> ' +
            '<div class="col-lg-3"><input style="height: 35px; type="text"  class="form-control"></div> ' +
            '<div class="col-lg-2">部门负责人</div> ' +
            '<div class="col-lg-3"><input style="height: 35px; type="text" class="form-control"></div> ' +
            '<div class="col-lg-1">' +
            '<button type="button" id="removerow" style="width: 30px">X</button></div></div>');
        $("#infolist").append(newrow);
        newrow.find('#removerow').click(function (){
            newrow.remove();
        });
    })
    //提交新增的部门信息
    //验证提交合法性、并且封装数据的函数
    $("#insertinfo").click(function (){
        var rowlist=$("#infolist").find(".row");
        var list=[];
        console.log((parseInt(rowlist.length)*2));
        for (var temp=0;temp<(parseInt(rowlist.length)*2);){
            var iname=rowlist.find("input").eq(temp++).val();
            var isid=rowlist.find("input").eq(temp++).val();
            var items={
                "departname":iname,
                "departroot":isid
            }
            list.push(items);
        }
        // console.log("要添加的物品列表"+list);
        // 防止提供空列表、验证名字和list长度是否为空
        if ($("#infolist").find(".row").length==0){
            alert("不能提交空信息");
        }else if ((list.length>0&&rowlist.find("input").eq(0).val()=="")){
            alert("不可提交空信息");
        }else {
            list=JSON.stringify(list);
            console.log(list);
            $.ajax({
                url:"${pageContext.request.contextPath}/depart/insertdepart",
                data:{data:list},
                contentType: "text",
                success:function (data){
                    console.log("------前台提交------");
                    alert(data);
                    $("#Addmodal").modal('hide');
                    $.ajax({
                        url: "${pageContext.request.contextPath}/depart/departPage",
                        success: function (data) {
                            var html=data;
                            $("#ajaxrequest").html(html);
                        }
                    });
                }
            });
        }
    });
</script>
</html>
