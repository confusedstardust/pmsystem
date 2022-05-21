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
                    <div class="text-center" id="modallable">确定删除此物品？</div>
                </h2>
                <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
                <div class="col-lg-12">
                    要删除的物品是：<h3><font  color="red" id="items"></font></h3>
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
                        <div class="text-left"><label><h3>新增物品</h3></label></div>
                        <div id="infolist" class="row"></div>
                    </div>
                </div>
                <button type="button" class="btn btn-primary float-end" id="additemsinput" >新增物品</button>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="insertinfo">
                    确认新增物品
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
                        <h4 class="card-title">物品管理</h4>
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

                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                <tr >
                                    <td>序号</td>
                                    <td>物品名称</td>
                                    <td>物品编码</td>
                                    <td>库存量</td>
                                    <td>操作</td>
                                </tr>
                                </thead>
                                <tbody id="itemslist">
                                </tbody>
                            </table>
                        </div>
                        <div class="col-xl-12"><button type="button" class="btn btn-primary float-end" onclick="addinfo()" >新增物品</button></div>
                        <div class="col-xl-12" id="newrow"></div>
                    </div>

                </div>
            </div>
        </div>

    </div>
</div>
<%--主要页面结束结束结束结束结束结束结束结束结束结束结束结束结束结束结束--%>
<%--<script type="text/javascript" src="../../js/jquery3-2.1.min.js"></script>--%>
<%--<script type="text/javascript" src="../../js/jquery.spinner.js"></script>--%>
<%--<script type="text/javascript">--%>
<%--    $('.spinnerExample').spinner({});--%>
<%--</script>--%>
        <!-- start section content -->
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
            url:"${pageContext.request.contextPath}/items/queryAllItems",
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
                    var tr= '<tr id="'+i1+'"><td>'+(parseInt(i1)+1)+'</td>'+
                        '<td>'+data[i1].itemsname+'</td>'+
                        '<td id="itemsid">  '+data[i1].itemsid+'</td>'+
                        '<td>'+'<div class="col-lg-5"><div class="row"><button id="plus" class="col-lg-1 btn-content" onclick="plus('+i1+')"><span>+</span></button>' +
                        '<input type="text" class="col-lg-3 " onchange="changefuc(this)" value="'+data[i1].itemscount+'">' +
                        '<button class="col-lg-1 btn-content " onclick="minus('+i1+')"><span>-</span></button></div></div></td>'+
                        '<td>'+'<button type="button" class=" btn-sm btn-info " data-toggle="modal" data-target="#myModal" onclick="deleteitems('+i1+')">删除</button>&nbsp;'+
                        '</td></tr>';
                    thelist.push(tr);
                }
                $("#itemslist").html(thelist);
            }
        });
    });
    //变动库存函数
    function plus(x){
        var temp=$("#itemslist").find("tr").eq(x).find("td").eq(3)
            .find(".col-lg-5").find(".row").find("input").val();

        $("#itemslist").find("tr").eq(x).find("td").eq(3)
            .find(".col-lg-5").find(".row").find("input").val((parseInt(temp)+1));
        var itemsid=$("#itemslist").find("tr").eq(x).find("td").eq(2).html();
        var itemscount=parseInt(temp)+1;
        $.ajax({
           url:"${pageContext.request.contextPath}/items/setitems?itemsid="+itemsid+"&itemscount="+itemscount,
        });
    };
    function minus(x){
        var temp=$("#itemslist").find("tr").eq(x).find("td").eq(3)
            .find(".col-lg-5").find(".row").find("input").val();

        $("#itemslist").find("tr").eq(x).find("td").eq(3)
            .find(".col-lg-5").find(".row").find("input").val((parseInt(temp)-1));

        var itemsid=$("#itemslist").find("tr").eq(x).find("td").eq(2).html();
        var itemscount=parseInt(temp)-1;
        $.ajax({
            url:"${pageContext.request.contextPath}/items/setitems?itemsid="+itemsid+"&itemscount="+itemscount,
        });
    };
    function changefuc(obj){
        var itemsid=$(obj).parents("tr").find("td").eq(2).html();
        var itemscount=$(obj).val();
        $.ajax({
            url:"${pageContext.request.contextPath}/items/setitems?itemsid="+itemsid+"&itemscount="+itemscount,
        });

    }


    //确认删除的弹出框，显示要删除的内容
    function deleteitems(x){
        console.log(cordlist[x]);
        $("#delModal").modal('show');
        $("#hditemsid").val(cordlist[x].itemsid);
        $("#items").html('&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
            '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
            '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
            '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+cordlist[x].itemsname);
    }

    //点击后删除
    $("#delebtn").click(function (){
        console.log($(this).parent().find("input").val());
        $.ajax({
            url:"${pageContext.request.contextPath}/items/deleteitems?itemsid="+$(this).parent().find("input").val(),
            success:function (data){
                alert(data);
                $("#delModal").modal('hide');
                $.ajax({
                    url: "${pageContext.request.contextPath}/items/ItemsPage",
                    success: function (data) {
                        var html=data;
                        $("#ajaxrequest").html(html);
                    }
                });
            }
        });
    })

    //通过名称查询物品
    $("#querybtn").click(function (){
        console.log();
        $.ajax({
            url:"${pageContext.request.contextPath}/items/queryitem?itemsname="+$("#searchitem").val(),
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log("条件查到物品列表",data);
                // 将返回的数据动态加载到tbody里面
                var thelist=[];
                var tbody = document.getElementById("itemslist");
                cordlist=[];
                for (i1 in data){
                    cordlist.push(data[i1]);
                    // var tr=document.createElement("tr");
                    // tbody.append(tr);
                    var tr= '<tr id="'+i1+'"><td>'+(parseInt(i1)+1)+'</td>'+
                        '<td>'+data[i1].itemsname+'</td>'+
                        '<td id="itemsid">  '+data[i1].itemsid+'</td>'+
                        '<td>'+'<div class="col-lg-5"><div class="row"><button id="plus" class="col-lg-1 btn-content" onclick="plus('+i1+')"><span>+</span></button>' +
                        '<input type="text" class="col-lg-3 " value="'+data[i1].itemscount+'">' +
                        '<button class="col-lg-1 btn-content " onclick="minus('+i1+')"><span>-</span></button></div></div></td>'+
                        '<td>'+'<button type="button" class=" btn-sm btn-info " data-toggle="modal" data-target="#myModal" onclick="deleteitems('+i1+')">删除</button>&nbsp;'+
                        '</td></tr>';
                    thelist.push(tr);
                }
                $("#itemslist").html(thelist);
            }
        });
    })
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
        var newrow=$('</br></br><div class="row"> <div class="col-lg-2">物品名称</div> ' +
            '<div class="col-lg-3"><input style="height: 35px; type="text"  class="form-control"></div> ' +
            '<div class="col-lg-2">物品库存</div> ' +
            '<div class="col-lg-3"><input style="height: 35px; type="text" class="form-control"></div> ' +
            '<div class="col-lg-1">' +
            '<button type="button" id="removerow" style="width: 30px">X</button></div></div>');
        $("#infolist").append(newrow);
        newrow.find('#removerow').click(function (){
            newrow.remove();
        });
    })

    //验证提交合法性、并且封装数据的函数
    $("#insertinfo").click(function (){
        var rowlist=$("#infolist").find(".row");
        var list=[];
        console.log((parseInt(rowlist.length)*2));
        for (var temp=0;temp<(parseInt(rowlist.length)*2);){
            var iname=rowlist.find("input").eq(temp++).val();
            var isid=rowlist.find("input").eq(temp++).val();
            var items={
                "itemsname":iname,
                "itemscount":isid
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
                url:"${pageContext.request.contextPath}/items/insertItems",
                data:{data:list},
                contentType: "text",
                success:function (data){
                    console.log("------前台提交------");
                    alert(data);
                    $("#Addmodal").modal('hide');
                    $.ajax({
                        url: "${pageContext.request.contextPath}/items/ItemsPage",
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