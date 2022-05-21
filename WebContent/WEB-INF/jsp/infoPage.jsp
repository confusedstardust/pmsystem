<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/3/19
  Time: 16:52
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
                    <div class="text-center" id="modallable">确定删除公告？</div>
                </h2>
                <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
                <div class="col-lg-12">
                    要删除的公告是：<h3><font  color="red" id="pname"></font></h3>
                </div>
                <div class="modal-footer">
                    <input type="hidden" id="infoid">
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
                        <div class="text-left"><label><h3>公告详情</h3></label></div>
                        <form  method="post" >
                            <div class="row">
                                <div class="col-xl-12">
                                    <div class="form-group row">
                                        <label class="col-xl-2 col-form-label">公告标题
                                        </label>
                                        <div class="col-xl-7">
                                            <input type="text" readonly="readonly" id="thetitle" class="form-control"  style="height: 30px"; name="infotitle">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                </div>
                                <div class="col-xl-12">
                                    <div class="form-group row">
                                        <label class="col-xl-2 col-form-label">详细内容
                                        </label>
                                        <div class="col-xl-9">
                                            <textarea class="form-control" readonly="readonly" style="height: 230px" id="thedetail"></textarea>
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

            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<!-- start section content -->
<%--模态框3---新增公告--%>
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
                        <div class="text-left"><label><h3>新增公告信息</h3></label></div>
                        <form  method="post" id="infoForm" >
                            <div class="row">
                                <div class="col-xl-12">
                                    <div class="form-group row">
                                        <label class="col-xl-2 col-form-label">公告标题
                                        </label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control"  style="height: 30px"; id="infotitle">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                </div>
                                <div class="col-xl-12">
                                    <div class="form-group row">
                                        <label class="col-xl-2 col-form-label">详细内容
                                        </label>
                                        <div class="col-xl-9">
                                            <textarea class="form-control" style="height: 230px" id="infodetail"></textarea>
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
                    确认新增公告
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
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
                        <h4 class="card-title">公告管理</h4>
                    </div>
                    <div class="card-body">
                        <div class="col-lg-12">
                            <div class="row">
                                <div class="col-lg-2">
                                    <button type="button" class="btn btn-primary" id="addpolice">新增</button>
                                </div>
                            </div>
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
                                    <th>标题</th>
                                    <th>发布日期</th>
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
            url:"${pageContext.request.contextPath}/info/getInfoData",
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log("查到公告列表",data);
                // 将返回的数据动态加载到tbody里面
                var thelist=[];
                cordlist=[];
                var tbody = document.getElementById("cordbody")
                for (i1 in data){
                    cordlist.push(data[i1]);
                    var tr=document.createElement("tr");
                    // tbody.append(tr);
                    var tr= '<tr><td>'+(parseInt(i1)+1)+'</td>'+
                        '<td>'+data[i1].infotitle+'</td>'+
                        '<td>'+format(data[i1].infodate)+'' +
                        '<input type="hidden" id="hdid" value="'+data[i1].infoid+'"></td>'+
                        '<td>'+'<button type="button" class=" btn-sm btn-info " data-toggle="modal" data-target="#myModal" onclick="showpinfo('+i1+')">查看详情</button>&nbsp;'+
                        '<button type="button"  style="height: 26px;width: 40px" class=" btn-danger icon-close" data-toggle="modal" data-target="#myModal" onclick="deleteMember('+i1+')"><span class="glyphicon glyphicon-remove"></span></button>'+'' +
                        '&nbsp;<button type="button" onclick="gotop(this)"   class="btn-sm btn-danger icon-arrow-up">置顶</button></td></tr>';
                    thelist.push(tr);
                    //为每一行设置一个按钮
                    // getdepart(data[i1].pnum)
                    // rowdata.push(data[i]);
                }
                $("#cordtbody").html(thelist);
            }
        });
    });
    function format(date){
        var d=new Date(date);
        var val=d.getFullYear()+"-"+(d.getMonth()+1)+"-" +(d.getDate());
        return val ;
    };
    function deleteMember(x){
        $("#delModal").modal('show');
        $("#pname").html('&nbsp;&nbsp;&nbsp;' +
            '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
            '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;' +
            '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+cordlist[x].infotitle);
        $("#infoid").val(cordlist[x].infoid);
    }
    //删除
    $("#delebtn").click(function (){
        $.ajax({
            url:"${pageContext.request.contextPath}/info/deleteInfo?infoid="+$(this).parent().find("#infoid").val(),
            success:function (data){
                alert(data);
                $("#delModal").modal('hide');
                location.reload();

            }
        });
    })
    //新增模态框
    $("#addpolice").click(function (){
        $("#Addmodal").modal('show');
    });
    //模态框内公告信息
    function showpinfo(x){
        $("#pinfoModal").modal('show');
        $("#thetitle").val(cordlist[x].infotitle);
        $("#thedetail").val(cordlist[x].infodetail);
    }

    //新增公告
    $("#insertinfo").click(function (){
        var infotitle=$("#infotitle").val();
        var infodetail=$("#infodetail").val();

        var infodata={
            "infotitle":infotitle,
            "infodetail":infodetail
        }
        infodata=JSON.stringify(infodata);
        $.ajax({
            url:"${pageContext.request.contextPath}/info/insertNewInfo.action",
            data:{data:infodata},
            success:function (data){
                alert(data);
                location.reload();
            }
        });
    });
    function gotop(obj){
        $.ajax({
           url:"${pageContext.request.contextPath}/info/goTopInfo?infoid="+$(obj).parents("tr").find("#hdid").val(),
            success:function (){
               alert("已置顶");
            }
        });
    }
</script>
</html>
