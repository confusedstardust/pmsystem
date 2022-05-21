<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/4/14
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>请假页</title>
<head>
    <title>Title</title>
    <link crossorigin="anonymous" integrity="sha384-5lb0sC1j9tKxLBG2FjZSNZN5a+8YAU0Tad3v8+FavsFS8eBKd5xK2d28U6cJP3PY" href="//lib.baomitu.com/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker-standalone.css" rel="stylesheet">

</head>
<body>
<div id="main-wrapper" class="show">
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
                            <h4 class="card-title">离职审批</h4>
                        </div>
                        <br class="card-body">
                            <h3 class="text-center" id="msg">您已经申请过离职审批，以下是审批详情</h3>
                        </br>
                            <div class="basic-form">
                                <form action="#" >
                                    <div class="row">
                                        <div class="col-xl-6">
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label">姓名
                                                    <span class="text-danger"></span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="text" class="form-control" readonly="readonly" name="pname" value="${policeSession.pname}">
                                                    <input type="hidden" class="form-control" readonly="readonly" id="pnum" name="pnum" value="${policeSession.pnum}">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xl-6">
                                            <%--                                                    请假类别--%>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label">离职类别<span class="text-danger"></span></label>
                                                <div class="col-lg-6">
                                                    <div class="form-group">
                                                        <input type="text" class="form-control" readonly="readonly" name="type" value="${leaveSession.ltype}">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xl-6">
                                            <%--                                                    开始日期--%>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label">所属部门<span class="text-danger"></span></label>
                                                <div class="col-lg-6">
                                                    <input type="text" readonly="readonly" class="form-control" name="departname" value="${departSession.departname}" >
                                                </div>
                                            </div>

                                        </div>
                                        <div class="col-xl-6">
                                            <%--                                                    结束日期--%>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label">离职日期 <span class="text-danger"></span></label>
                                                <div class="col-lg-6">

                                                    <input type="text" class="form-control"  readonly="readonly" id="ldate" name="ldate" >
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xl-6">
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label">备注<span class="text-danger"></span></label>
                                                <div class="col-lg-6">
                                                    <input type="text" class="form-control" value="${leaveSession.lreason}"  id="lreason" readonly="readonly"  name="applydetail">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xl-6">
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label">工作交接人<span class="text-danger"></span></label>
                                                <div class="col-lg-6">
                                                    <input type="text" readonly="readonly" value="${leaveSession.continueman}" class="form-control" id="continueman" name="nextman">
                                                    <input type="hidden" name="applydate" id="applydate">
<%--                                                    <input type="hidden" name="applytypeid" id="applytypeid">--%>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xl-6">
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label">审批通过日期<span class="text-danger"></span></label>
                                                <div class="col-lg-6">
                                                    <input type="text" readonly="readonly" class="form-control" id="passdate" name="applydate">
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xl-6">
                                            <div class="form-group row">
                                                <div class="col-lg-6">
                                                </div>
                                            </div>
                                        </div>
                                        <hr>
                                        <div class="row">
                                            <div class="col-sm-11">
<%--                                                <div class="form-group"><button type="button" class="btn btn-primary float-end" onclick=submitInsert()>提交</button></div>--%>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                </div>
            </div>
        </div>
    </div>
</div>
<!-- JQuery v3.5.1 -->
<script src="${pageContext.request.contextPath}../../js/jquery.js"></script>
<!-- popper js -->
<script src="${pageContext.request.contextPath}../../js/popper.min.js"></script>
<!-- Bootstrap -->
<script src="${pageContext.request.contextPath}../../js/bootstrap.min.js"></script>
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
<script type="text/javascript">
    function format(time) {
        if (time==null) {
            return "未审批";
        }else {
            var date = new Date(time);
            var date = new Date(time);
            var y = date.getFullYear();
            var m = date.getMonth() + 1;
            var d = date.getDate();
            console.log(y + "-" + m + "-" + d);
            return y + '-' + m + '-' + d ;
        }

    }
    $("#ldate").val(format(${ldate}));
    $("#passdate").val(format(${passdate}));
</script>
</html>

<script>

</script>

