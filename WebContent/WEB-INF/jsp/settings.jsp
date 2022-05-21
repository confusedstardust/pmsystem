<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}../../css/layui.css" />
    <style>
        body{margin: 10px;}
        .demo-carousel{height: 200px; line-height: 200px; text-align: center;}
    </style>

</head>

<script src="${pageContext.request.contextPath}${pageContext.request.contextPath}../../js/jquery3-2.1.min.js"></script>
<script src="${pageContext.request.contextPath}${pageContext.request.contextPath}../../js/jquery.js"></script>
<%--jquery包必须在layer包的上面，不然失效--%>
<%--<script src="layui/lay/modules/layer.js"></script>--%>
<%--<script src="${pageContext.request.contextPath}${pageContext.request.contextPath}../../js/upload.js"></script>--%>

<body>
        <!-- start section content -->
            <div class="warper container-fluid">
                <div class="doctorino_settings main_container">
                    <div class="row page-titles mx-0">
                        <div class="col-sm-6 p-md-0">
                            <div class="welcome-text">
                                <h4 class="text-primary"> </h4>
                            </div>
                        </div>
                        <div class="col-sm-6 p-md-0 justify-content-sm-end mt-2 mt-sm-0 d-flex">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="main.jsp"> </a></li>
                                <li class="breadcrumb-item active"><a href="javascript:;">   </a>
                                </li>
                            </ol>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="card shadow mb-4">
                                <div class="card-header">
                                    <h4 class="card-title"> 基本资料 </h4>
                                </div>
                                <div class="card-body">
                                    <form action="${pageContext.request.contextPath}/updateinfo"  method="post" enctype=“multipart/form-data” id="pinfo" >
                                        <div class="row">
                                            <div class="col-xl-6">
                                                <div class="form-group row">
                                                    <label class="col-lg-4 col-form-label">姓名
                                                        <span class="text-danger"></span>
                                                    </label>
                                                    <div class="col-lg-6">
                                                        <input type="text" class="form-control" readonly="readonly" name="pname" value="${policeSession.pname}">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-6">
                                                <div class="form-group row">
                                                    <label class="col-lg-4 col-form-label">警号 <span class="text-danger"></span></label>
                                                    <div class="col-lg-6">
                                                        <input type="text" class="form-control" name="pnum" readonly="readonly" value="${policeSession.pnum}">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-6">
                                                <div class="form-group row">
                                                    <label class="col-lg-4 col-form-label">所属部门 <span class="text-danger"></span></label>
                                                    <div class="col-lg-6">
                                                        <input type="text" class="form-control" name="leveldetal" readonly="readonly" value="${departSession.departname}">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-6">
                                                <div class="form-group row">
                                                    <label class="col-lg-4 col-form-label">身份证号<span class="text-danger"></span></label>
                                                    <div class="col-lg-6">
                                                        <input type="text" class="form-control" name="pidcard" readonly="readonly" value="${policeSession.pidcard}">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-6">
                                                <div class="form-group row">
                                                    <label class="col-lg-4 col-form-label">职务<span class="text-danger"></span></label>
                                                    <div class="col-lg-6">
                                                        <input type="text" class="form-control" readonly="readonly" id="zhiwu" name="levelname" value="${levelSession.levelname}">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-6">
                                                <div class="form-group row">
                                                    <label class="col-lg-4 col-form-label">性别<span class="text-danger"></span></label>
                                                    <div class="col-lg-6">
                                                        <input type="text" class="form-control" readonly="readonly" id="psex" name="psex" value="${policeSession.psex}">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-6">
                                                <div class="form-group row">
                                                    <label class="col-lg-4 col-form-label">手机号码<span class="text-danger"></span></label>
                                                    <div class="col-lg-6">
                                                        <input type="text" class="form-control" id="ptel" name="ptel" value="${policeSession.ptel}">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-xl-6">
                                                <div class="form-group row">
<%--                                                    <label class="col-lg-4 col-form-label">住址</label>--%>
                                                    <div class="col-lg-6">
<%--                                                        value="${policeSession.address}"--%>
<%--                                                        <input type="text" class="form-control" name="address" >--%>
                                                    </div>
                                                </div>
                                            </div>
                                            <hr>
                                            <div class="row">
                                                <div class="col-sm-11">
                                                    <div class="form-group"><button type="button" class="btn btn-primary float-end" onclick=updateInfo()>保存</button></div>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                    <div class="col-xl-6">
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label">上传照片</label>
                                            <div class="col-lg-11">
                                                <div class="uploader orange">
                                                    <form action="${pageContext.request.contextPath}/updateImage.action" enctype="multipart/form-data" id="pictureform" method="post">
                                                        <input type="text" class="filename" readonly="readonly"/>
                                                        <input type="button" name="file" class="button" value="点击上传..."/>
                                                        <input type="file" size="30" name="picturefile" id="picturefile"/>

                                                    </form>


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
<%--        <button id="open"  class="layui-btn layui-btn-primary">弹出窗口</button>--%>
        </div>

    <!-- JQuery v3.5.1 -->
</body>
<style type="text/css">
    .uploader{
    position:relative;
    display:inline-block;
    overflow:hidden;
    cursor:default;
    padding:0;
    margin:10px 0px;
    -moz-box-shadow:0px 0px 5px #ddd;
    -webkit-box-shadow:0px 0px 5px #ddd;
    box-shadow:0px 0px 5px #ddd;

    -moz-border-radius:5px;
    -webkit-border-radius:5px;
    border-radius:5px;
}
.filename{
    float:left;
    display:inline-block;
    outline:0 none;
    height:32px;
    width:180px;
    margin:0;
    padding:8px 10px;
    overflow:hidden;
    cursor:default;
    border:1px solid;
    border-right:0;
    font:9pt/100% Arial, Helvetica, sans-serif; color:#777;
    text-shadow:1px 1px 0px #fff;
    text-overflow:ellipsis;
    white-space:nowrap;

    -moz-border-radius:5px 0px 0px 5px;
    -webkit-border-radius:5px 0px 0px 5px;
    border-radius:5px 0px 0px 5px;

    background:#f5f5f5;
    background:-moz-linear-gradient(top, #fafafa 0%, #eee 100%);
    background:-webkit-gradient(linear, left top, left bottom, color-stop(0%,#fafafa), color-stop(100%,#f5f5f5));
    filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#fafafa', endColorstr='#f5f5f5',GradientType=0);
    border-color:#ccc;

    -moz-box-shadow:0px 0px 1px #fff inset;
    -webkit-box-shadow:0px 0px 1px #fff inset;
    box-shadow:0px 0px 1px #fff inset;

    -moz-box-sizing:border-box;
    -webkit-box-sizing:border-box;
    box-sizing:border-box;
}
.button{
    float:left;
    height:32px;
    display:inline-block;
    outline:0 none;
    padding:8px 12px;
    margin:0;
    cursor:pointer;
    border:1px solid;
    font:bold 9pt/100% Arial, Helvetica, sans-serif;

    -moz-border-radius:0px 5px 5px 0px;
    -webkit-border-radius:0px 5px 5px 0px;
    border-radius:0px 5px 5px 0px;

    -moz-box-shadow:0px 0px 1px #fff inset;
    -webkit-box-shadow:0px 0px 1px #fff inset;
    box-shadow:0px 0px 1px #fff inset;
}
.uploader input[type=file]{
    position:absolute;
    top:0; right:0; bottom:0;
    border:0;
    padding:0; margin:0;
    height:30px;
    cursor:pointer;
    filter:alpha(opacity=0);
    -moz-opacity:0;
    -khtml-opacity: 0;
    opacity:0;
}

input[type=button]::-moz-focus-inner{padding:0; border:0 none; -moz-box-sizing:content-box;}
input[type=button]::-webkit-focus-inner{padding:0; border:0 none; -webkit-box-sizing:content-box;}
input[type=text]::-moz-focus-inner{padding:0; border:0 none; -moz-box-sizing:content-box;}
input[type=text]::-webkit-focus-inner{padding:0; border:0 none; -webkit-box-sizing:content-box;}

/* Orange Color Scheme ------------------------ */

.orange .button{
    color:#fff;
    text-shadow:1px 1px 0px #c04501;
    background:#d54d01;
    background:-moz-linear-gradient(top, #f86c1f 0%, #d54d01 100%);
    background:-webkit-gradient(linear, left top, left bottom, color-stop(0%,#f86c1f), color-stop(100%,#d54d01));
    filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#f86c1f', endColorstr='#d54d01',GradientType=0);
    border-color:#c04501;
}

.orange:hover .button{
    background:#f86c1f;
    background:-moz-linear-gradient(top, #d54d01 0%, #f86c1f 100%);
    background:-webkit-gradient(linear, left top, left bottom, color-stop(0%,#d54d01), color-stop(100%,#f86c1f));
    filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#d54d01', endColorstr='#f86c1f',GradientType=0);
}
</style>
<div style="text-align:center;clear:both"></div>
    <script type="text/javascript">
        $(function(){
        $("input[type=file]").change(function(){$(this).parents(".uploader").find(".filename").val($(this).val());});
        $("input[type=file]").each(function(){
            if($(this).val()==""){$(this).parents(".uploader").find(".filename").val("未选中图片...");}
        });
    });
    </script>

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
<script type="text/javascript">
    function updateInfo(){
         var a=document.getElementById("picturefile");
         if (a.value!=""){
             $("#pictureform").submit();
         }
        var ptel=document.getElementById("ptel").value;
        // alert(ptel)
        $.ajax({
            type: "post",
            url: "${pageContext.request.contextPath}/updatePtelInfo?ptel="+ptel,
            success: function () {
                alert("ok")
            }
        });
    }
</script>
<script type="text/javascript">
    $("#psex").val(function (){
        var sex=${policeSession.psex};
       if (sex==1)
           return '男';
       else
           return '女';
    });
    function setLevel(){
        var tem=${policeSession.plevel};
        console.log(tem);
        switch (tem){
            case 1: return "一级"; break;
            case 2:return "二级";break;
            case 3:return "三级";break;
            case 4:return "总警监";break;
            case 5:return "管理员";break;
        }
    };
    var  zwstr="${levelSession.levelname}";
    $("#zhiwu").val(setLevel()+zwstr);
</script>

</html>

