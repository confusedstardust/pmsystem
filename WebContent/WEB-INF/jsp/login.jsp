<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/1/25
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>警员管理系统登录</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}../../js/jquery3-2.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}../../css/styles.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../../css/jigsaw.css">
    <style>
        #msg {
            width: 100%;
            line-height: 40px;
            font-size: 14px;
            text-align: center;
        }
    </style>
    <script type="text/javascript">
        $(function (){

        });
    </script>
</head>
<body>

<div class="jq22-container" style="padding-top:100px">
    <div class="login-wrap">
        <div class="login-html">
            <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">登录</label>
            <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">忘记密码</label>
            <div class="login-form">
                <form action="${pageContext.request.contextPath}/login.action" id="lgifm" method="post">
                    <div class="sign-in-htm">
                        <div class="group">
                            <label for="user" class="label">警号</label>
                            <input id="pnum" name="pnum" type="text" class="input">
                        </div>
                        <div class="group">
                            <label for="pass" class="label">密码</label>
                            <input id="ppsw" name="ppsw" type="password" class="input" data-type="password">
                        </div>
                        <div class="group">
<%--                            <div class="container">--%>
<%--                                <div id="captcha" style="position: relative" data-type="password"></div>--%>
<%--                                <div id="msg"></div>--%>
<%--                            </div>--%>
                        </div>
                        <div class="group">
<%--                            <input id="check" type="checkbox" class="check" checked>--%>
<%--    <span class="icon">--%>
                            <label for="check"></span> ${msg}</label>
                        </div>
                        <div class="group">
                            <input type="button" class="button" value="登录" onClick="check()">
<%--                            <input type="submit" >--%>
                        </div>
                        <div class="hr"></div>
                        <div class="foot-lnk">
<%--                            <a href="#forgot">忘记密码?</a>--%>
                        </div>
                    </div>
                </form>
                <form action="${pageContext.request.contextPath}/resetppsw.action" method="post">
                    <div class="sign-up-htm">
                        <div class="group">
                            <label for="user" class="label">警号</label>
                            <input id="pnum" name="pnum" type="text" class="input">
                        </div>
                        <div class="group">
                            <label for="pass" class="label">姓名</label>
                            <input id="pname" type="text" class="input" name="pname">
                        </div>
                        <div class="group">
                            <label for="pass" class="label">身份证号</label>
                            <input id="pidcard" type="text" class="input" name="pidcard">
                        </div>
                        <div class="group">
                            <label for="pass" class="label">新密码</label>
                            <input id="password1" type="password" class="input" name="ppsw">
                        </div>
                        <div class="group">
                            <label for="pass" class="label">确认新密码</label>
                            <input id="password2" type="password" class="input" name="cfmppsw">
                        </div>
                        <div class="group">
                            <a href="register.html"><input type="submit" class="button" value="重设新密码"></a>
                        </div>
                        <div class="hr"></div>
                        <div class="foot-lnk">
<%--                            <label for="tab-1">已经成员?</a>--%>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}../../js/jigsaw.js"></script>
<script type="text/javascript">

    var flag=false;
    function check(){
        var name=document.getElementById('pnum').value;
        var pass=document.getElementById('ppsw').value;
        if(name.trim().length > 0&&pass.trim().length > 0){
            var form = document.getElementById("lgifm");
            form.submit();
            // alert("登录成功!")
            //window.location.href="#";
        }else{
            if (name.trim().length == 0)
            alert("请输入警号!")
            else
                alert("请输入密码！")
        }
    }
    jigsaw.init(document.getElementById('captcha'), function () {
        flag=true;
        document.getElementById('msg').innerHTML = '验证通过！'
    })
    // jigsaw.init(document.getElementById('captcha'), function () {
    //     if (flag=true)
    //     document.getElementById('msg').innerHTML = '验证通过！'

    // })
</script>
</body>
</html>