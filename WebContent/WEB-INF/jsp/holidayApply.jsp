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
    <link rel="stylesheet" href="${pageContext.request.contextPath}../../css/fonts.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../../css/style.css">
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
                                    <h4 class="card-title">请假审批</h4>
                                </div>
                                <div class="card-body">
                                    <div class="basic-form">
                                        <form action="${pageContext.request.contextPath}/apply/insert.action"  method="post" id="insertHolidayApply" >
                                            <div class="row">
                                                <div class="col-xl-6">
                                                    <div class="form-group row">
                                                        <label class="col-lg-4 col-form-label">警号
                                                            <span class="text-danger"></span>
                                                        </label>
                                                        <div class="col-lg-6">
                                                            <input type="text" class="form-control" readonly="readonly" name="pnum" value="${policeSession.pnum}">
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-xl-6">
<%--                                                    请假类别--%>
                                                    <div class="form-group row">
                                                        <label class="col-lg-4 col-form-label">请假类别<span class="text-danger"></span></label>
                                                        <div class="col-lg-6">
                                                            <div class="form-group">
                                                                <select class="form-control form-select" name="applytype">
                                                                    <option>请选择</option>
                                                                    <option>事假</option>
                                                                    <option>病假</option>
                                                                    <option>婚假</option>
                                                                    <option>年假</option>
                                                                    <option>工伤假</option>
                                                                    <option>加班补休</option>
                                                                    <option>产假</option>
                                                                    <option>其他</option>
                                                                </select>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-xl-6">
<%--                                                    开始日期--%>
                                                    <div class="form-group row">
                                                        <label class="col-lg-4 col-form-label">开始日期 <span class="text-danger"></span></label>
                                                        <div class="col-lg-6">
                                                            <input type="date" class="form-control" name="startdate" >
                                                        </div>
                                                    </div>

                                                </div>
                                                <div class="col-xl-6">
<%--                                                    结束日期--%>
                                                    <div class="form-group row">
                                                        <label class="col-lg-4 col-form-label">结束日期 <span class="text-danger"></span></label>
                                                        <div class="col-lg-6">
                                                            <input type="date" class="form-control" name="enddate" >
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-xl-6">
                                                    <div class="form-group row">
                                                        <label class="col-lg-4 col-form-label">请假原因<span class="text-danger"></span></label>
                                                        <div class="col-lg-6">
                                                            <textarea rows="" cols="" class="form-control" name="applydetail"></textarea>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-xl-6">
                                                    <div class="form-group row">
                                                        <label class="col-lg-4 col-form-label">所在部门<span class="text-danger"></span></label>
                                                        <div class="col-lg-6">
                                                            <input type="text" class="form-control" readonly="readonly" name="leveldetal" value="${departSession.departname}">
                                                            <input type="hidden" name="applydate" id="applydate">
                                                            <input type="hidden" name="applytypeid" id="applytypeid">
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
                                                        <div class="form-group"><button type="button" class="btn btn-primary float-end" onclick=submitInsert()>提交</button></div>
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
                            <div class="card">
                                <div class="card-header">
                                    <h4 class="card-title">请假记录</h4>
                                </div>
                                <div class="card-body">
                                    <div class="table-responsive" >
                                        <table class="table table-hover">
                                            <thead>
                                            <tr>
                                                <th >申请日期</th>
                                                <th >请假类型</th>
                                                <th >开始时间</th>
                                                <th >结束时间</th>
                                                <th >申请状态</th>
                                            </tr>
                                            </thead>
                                            <!-- On rows -->
                                            <!-- On cells (`td` or `th`) -->
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
    function submitInsert(){
        //记录当前时间生成applydate
        var time=Date.now();
        var a=new Date(time);
        // time=a.getFullYear()+"-"+(a.getMonth()+1)+"-"+(a.getDate()-1);
        time=format(a);
        //设置两个隐藏域申请日期和申请状态
        $("#applydate").val(time);
        $("#applytypeid").val(1);
        console.log(document.getElementById("applydate").value);
        $("#insertHolidayApply").submit();
        $.ajax({
            url: "${pageContext.request.contextPath}/apply/holiday.action",
            success: function (data) {
                $("#ajaxrequest").html(data);
            }
        });
    }
    $("cordtbody").ready( function querycord(){
        $.ajax({
            url:"${pageContext.request.contextPath}/apply/querycord?pnum=${policeSession.pnum}",
            type:"post",
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);

                var tbody = document.getElementById("cordtbody")
                for (i in data){
                    var tr=document.createElement("tr");
                    tbody.append(tr);
                    var td1 = document.createElement("td");
                    var td2 = document.createElement("td");
                    var td3 = document.createElement("td");
                    var td4 = document.createElement("td");
                    var td5 = document.createElement("td");
                    td1.innerHTML=format(data[i].applydate);
                    td2.innerHTML=data[i].applytype;
                    td3.innerHTML=format(data[i].startdate);
                    td4.innerHTML=format(data[i].enddate);
                    td5.innerHTML=setStatus(data[i].applytypeid);
                    tr.appendChild(td1);
                    tr.appendChild(td2);
                    tr.appendChild(td3);
                    tr.appendChild(td4);
                    tr.appendChild(td5);
                    console.log(i+"ook");

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
</script>
</html>