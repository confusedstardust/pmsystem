<%--
Created by IntelliJ IDEA.
User: lenovo
Date: 2022/2/28
Time: 19:16
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
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}../../css/fonts.css">--%>
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}../../css/style.css">--%>
</head>

<body>
<div class="warper container-fluid">
    <div class="new-patients main_container">
        <div class="row page-titles mx-0">
            <div class="col-sm-6 p-md-0">
                <div class="welcome-text">
                    <h4 class="text-primary">New Patient</h4>
                </div>
            </div>
            <div class="col-sm-6 p-md-0 justify-content-sm-end mt-2 mt-sm-0 d-flex">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="main.jsp">Home</a></li>
                    <li class="breadcrumb-item active"><a href="javascript:;">New Patient</a></li>
                </ol>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <h4 class="card-title">修改密码</h4>
                    </div>
                    <div class="card-body">
                        <div class="basic-form">
                            <form action="${pageContext.request.contextPath}/resetpswop.action" method="post" id="resetpsw">
                                <div class="row">
                                    <div class="col-xl-6">
                                        <div class="form-group row">
                                            <label class="col-lg-3 col-form-label">原密码
                                                <span class="text-danger"></span>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="password" class="form-control" id="psw"  name="psw" >
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-6">

                                        <div class="form-group row">
                                            <label class="col-lg-3 col-form-label">新密码<span class="text-danger"></span></label>
                                            <div class="col-lg-6">
                                                <div class="form-group">
                                                    <input type="password" class="form-control" id="npsw" name="npsw">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-6">
                                        <div class="form-group row">
                                            <label class="col-lg-3 col-form-label">确认新密码 <span class="text-danger"></span></label>
                                            <div class="col-lg-6">
                                                <input type="password" class="form-control" id="cnpsw" name="cnpsw">
                                                <input type="hidden" id="pnum" name="pnum" value="${policeSession.pnum}">
                                            </div>
                                        </div>
                                    </div>
                                    <hr>
                                    <div class="row">
                                        <div class="col-sm-11">
                                            <div class="form-group"><button type="button" class="btn btn-primary float-end" onclick="submitit()">确认修改</button></div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<%--    <!-- JQuery v3.5.1 -->--%>
    <script src="${pageContext.request.contextPath}../../js/jquery.min.js"></script>

<%--    <!-- popper js -->--%>
    <script src="${pageContext.request.contextPath}../../js/popper.min.js"></script>

<%--    <!-- Bootstrap -->--%>
    <script src="${pageContext.request.contextPath}../../js/bootstrap.min.js"></script>

<%--    <!-- Moment -->--%>
    <script src="${pageContext.request.contextPath}../../js/moment.min.js"></script>

<%--    <!-- Date Range Picker -->--%>
    <script src="${pageContext.request.contextPath}../../js/daterangepicker.min.js"></script>

<%--    <!-- Datatable -->--%>
    <script src="${pageContext.request.contextPath}../../js/jquery.dataTables.min.js"></script>
    <script src="${pageContext.request.contextPath}../../js/init-tdatatable.js"></script>
<%--    <!-- Chart js -->--%>
    <script src="${pageContext.request.contextPath}../../js/apexcharts.min.js"></script>
    <script src="${pageContext.request.contextPath}../../js/apex-custom.js"></script>
<%--    <!-- Main Custom JQuery -->--%>
    <script src="${pageContext.request.contextPath}../../js/toggleFullScreen.js"></script>
    <script src="${pageContext.request.contextPath}../../js/main.js"></script>
</body>
<script>
    function submitit(){
        var v1=$("#cnpsw").val();
        var v2=$("#npsw").val();
        if (v1!=v2){
            alert("请确保两次输入的密码一致");
        }else {
            if (v1.length>0&&v2.length>0&&$("#psw").val().length>0){
                $.ajax({
                    url:"${pageContext.request.contextPath}/resetpswop.action",
                    data:$("#resetpsw").serialize(),
                    success:function (data){
                        alert(data)
                        window.location="${pageContext.request.contextPath}/logout"
                    }
                });
            }else {
                alert("确认输入后提交");
            }
        }

    }
</script>

</html>