<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/2/13
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}../../css/dsSelect.css" type="text/css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}../../js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}../../js/jquery3-2.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}../../js/dsSelect.js"></script>
</head>
<body>
<div id="main-wrapper" class="show">
    <div class="warper container-fluid">
        <div class="new-patients main_container">
<%--            无用的填充部分--%>
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
                            <h4 class="card-title">物品申领</h4>
                        </div>
                        <div class="card-body">
                            <div class="basic-form">

                                    <div class="row">
                                        <div class="col-xl-11">
                                            <div class="form-group row">
                                                <label class="col-lg-6 col-form-label"><h3>请选择要申领的物品</h3>
                                                    <span class="text-danger"></span>
                                                </label>
                                                <div class="form-group row">
                                                    <div class="col-lg-7">

                                                            <span class="text-danger"></span>

                                                    </div>
                                                <div class="col-lg-12">

                                                    <div class="dsSelect" id="dsSelectTemp" style="padding-left: 140px">

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xl-6">
                                            <div class="form-group row">
                                                <div class="col-lg-6">
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
                                                <div class="form-group"><button type="button" class="btn btn-primary float-end" onclick=submititemsapply()>提交</button></div>
                                            </div>
                                        </div>
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
                    <h4 class="card-title">物品申领记录</h4>
                </div>
                <div class="card-body">
                    <div class="table-responsive" >
                        <table class="table table-hover">
                            <thead>
                            <tr>
                                <th >申请日期</th>
                                <th >申请物品</th>
                                <th >申请状态</th>
                                <th >备&nbsp;&nbsp;&nbsp;注</th>
                            </tr>
                            </thead>

                            <tbody id="cordtbody">
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>

    </div>
</div>


    <!--正文-->



</div>
<p>

    <script type="text/javascript">
<%--        载入要做的初始化多选框对象--%>
    let dsSelectObj = new dsSelect("dsSelectTemp");
    dsSelectObj.multiSelect =true;
    dsSelectObj.init();
        $("cordtbody").ready( function queryitems(){
            //自动发送ajax请求全部物品列表
            $.ajax({
                url:"${pageContext.request.contextPath}/apply/queryallitems",
                type:"post",
                success:function (data){
                    data=JSON.stringify(data);
                    data=JSON.parse(data);
                    var datasR=[];
                    dsSelectObj.setLeftData(data,"itemsname");
                    dsSelectObj.setRightData(datasR,"itemsname");
                }
            });
        })
    //提交事件
    function submititemsapply(){
        var itemapplylist=JSON.stringify(dsSelectObj.getSelectRightValus());
        console.log(itemapplylist);
        if (itemapplylist=="[]") {
            alert("请选择申请物品");
        }else{
            $.ajax({
                url:"${pageContext.request.contextPath}/apply/itemsapply?pnum=${policeSession.pnum}",
                data:{data:itemapplylist},
                contentType: "text",
                success:function (data){
                   // console.log("success insertitemcord");
                    alert("提交成功！！");
                    location.reload();
                }
            });
        }
    }
    </script>


<script type="text/javascript">
    $("cordtbody").ready( function querycord(){
        $.ajax({
            url:"${pageContext.request.contextPath}/apply/queryitemscord?pnum=${policeSession.pnum}",
            type:"post",
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log(data);

                var tbody = document.getElementById("cordtbody")
                for (i in data){
                    var tr=document.createElement("tr");
                    tbody.append(tr);
                    var td1 = document.createElement("td");
                    var td2 = document.createElement("td");
                    var td3 = document.createElement("td");
                    var td4 = document.createElement("td");
                    td1.innerHTML=format(data[i].orderdate);
                    queryitemsbyorderid(data[i].orderid,i);
                    // td2.innerHTML=data[i].itemsname;
                    td3.innerHTML=setStatus(data[i].orderstatus);
                    td4.innerHTML=data[i].judgereason;
                    tr.appendChild(td1);
                    tr.appendChild(td2);
                    tr.appendChild(td3);
                    tr.appendChild(td4);
                    console.log(i+"ook");
                //
                }



            }
        });

    })
    function format(date){
        var d=new Date(date);
        var val=d.getFullYear()+"-"+(d.getMonth()+1)+"-" +(d.getDate());
        return val ;
    };
    function setStatus(val){
        if (val=='1'){
            val="审核中";
        }
        if (val=='2'){
            val="通过";
        }
        if (val=='3'){
            val="拒绝"
        }
        return val;
    }
    function queryitemsbyorderid(data,val){
        $.ajax({
            url:"${pageContext.request.contextPath}/apply/queryOrderdetailscord?orderid="+data,
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                var namelis="";
                for (i in data){
                  namelis=namelis+data[i].itemsname+" ";
                }
                $("tbody").find("tr").eq(val).find("td").eq(1).text(namelis);
                console.log(namelis+val);
            }
        })
    }
</script>
</body>
</html>
