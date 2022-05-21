<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script src="${pageContext.request.contextPath}../../js/jquery3-2.1.min.js"></script>
    <!-- JQuery v3.5.1 -->
    <link rel="stylesheet" href="../../css/backstage.css">

    <!--添加删除专家-->
    <script type="text/javascript">
        $(function () {
            var show_count = 20;   //要显示的条数
            var count = 1;    //递增的开始值，这里是你的ID
            $("#btn_addtr").click(function () {

                var length = $("#dynamicTable tbody tr").length;
                //alert(length);
                if (length < show_count)    //点击时候，如果当前的数字小于递增结束的条件
                {
                    $("#tab11 tbody tr").clone().appendTo("#dynamicTable tbody");   //在表格后面添加一行
                    changeIndex();//更新行号
                }
            });


        });
        function changeIndex() {
            var i = 1;
            $("#dynamicTable tbody tr").each(function () { //循环tab tbody下的tr
                $(this).find("input[name='NO']").val(i++);//更新行号
            });
        }

        function deltr(opp) {
            var length = $("#dynamicTable tbody tr").length;
            //alert(length);
            if (length <= 1) {
                alert("至少保留一行");
            } else {
                $(opp).parent().parent().remove();//移除当前行
                changeIndex();
            }
        }
    </script>
    <style type="text/css" >

        .page{
            list-style: none;
        }
        .page>li{
            float: left;
            padding: 5px 10px;
            cursor: pointer;
        }
        .page .pageItem{
            border: solid thin #DDDDDD;
            margin: 5px;
        }
        .page .pageItemActive{
            border: solid thin #0099FF;
            margin: 5px;
            background-color: #0099FF;
            color:white;
        }
        .page .pageItem:hover{
            border: solid thin #0099FF;
            background-color: #0099FF;
            color:white;
        }
        .page .pageItemDisable{
            border: solid thin #DDDDDD;
            margin: 5px;
            background-color: #DDDDDD;
        }
    </style>
</head>
<body>

<%--    模态框--%>
<div class="modal fade" id="myModal" tabindex="2" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"	>
    <div class="modal-dialog">
        <div class="modal-content" style="width: 700px">
            <div class="modal-header">
                    <h2 class="modal-title "  >
                        <div class="text-center" id="myModalLabel"></div>
                    </h2>
                <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-12 col-lg-12">
                        <div class="text-left"><label><h3>案件详情</h3></label></div>
                        <form action="#" method="post"  id="??">
                            <div class="row">
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">案情日期
                                        </label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" readonly="readonly"id="issuestartdate">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">事发地点 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="issueaddress" readonly="readonly" >
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">接警人
                                        </label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" readonly="readonly" id="pickman">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">出警日期 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="actdate" readonly="readonly">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">案件号 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="modalissueid" readonly="readonly">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">报警方式 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="baojingfangshi" readonly="readonly">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">案件类型 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="issuetype">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">处理结果 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="chulijieguo" >
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">案情进展 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="issueproccess" >
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-12">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">报警内容 <span class="text-danger"></span></label>
                                        <div class="col-lg-12">
                                            <textarea type="text" class="form-control" id="issuedetail" readonly="readonly"></textarea>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-12" id="ptn">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label" >案件详情 <span class="text-danger"></span></label>
                                        <div class="col-lg-12" id="chose">
                                            <textarea type="text" class="form-control" id="puteventmanname" readonly="readonly"></textarea>
                                        </div>
                                        <div class="col-xl-12"><button type="button" class="btn btn-primary float-right" onclick="adddetail()" style="margin-left: 500px;">新增详情</button></div>

                                    </div>
                                </div>
<%--                                <div class="col-xl-12">--%>
<%--                                    <button type="button" class="btn btn-primary float-right" onclick="clone()" style="margin-left: 510px;">新增详情</button>--%>
<%--                                </div>--%>
                            </div>
                        </form>
                        <div class="text-left"><label><h3>案件相关人</h3></label></div>
                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                <tr>
                                    <td>姓名</td>
                                    <td>电话</td>
                                    <td>地址</td>
                                    <td>身份证号</td>
                                </tr>
                                </thead>
                                <tbody id="rlmlist">
                                </tbody>
                            </table>
                        </div>
                        <div class="col-xl-12"><button type="button" class="btn btn-primary float-right" onclick="addinfo()" style="margin-left: 500px;">新增相关人</button></div>
                        <div class="col-xl-12" id="newrow"></div>

                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-bs-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="updateinfo">
                    提交更改
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<%--模态框2--只能查看类型模态框--%>
<div class="modal fade" id="rdolModal" tabindex="2" role="dialog" aria-labelledby="rdolModalLabel" aria-hidden="true"	>
    <div class="modal-dialog">
        <div class="modal-content" style="width: 700px">
            <div class="modal-header">
                <h2 class="modal-title "  >
                    <div class="text-center" id="rdolModalLabel"></div>
                </h2>
                <button type="button" class="close" data-bs-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-12 col-lg-12">
                        <div class="text-left"><label><h3>案件详情</h3></label></div>
                        <form action="#" method="post">
                            <div class="row">
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">案情日期
                                        </label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" readonly="readonly"id="rdissuestartdate">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">事发地点 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="rdissueaddress" readonly="readonly" >
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">接警人
                                        </label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" readonly="readonly" id="rdpickman">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">出警日期 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="rdactdate" readonly="readonly">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">案件号 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="rdmodalissueid" readonly="readonly">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">报警方式 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" id="rdbaojingfangshi" readonly="readonly">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">案件类型 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" readonly="readonly" id="rdissuetype">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">处理结果 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" readonly="readonly"  id="rdchulijieguo" >
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-6">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">案情进展 <span class="text-danger"></span></label>
                                        <div class="col-xl-7">
                                            <input type="text" class="form-control" readonly="readonly" id="rdissueproccess" >
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-12">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label">报警内容 <span class="text-danger"></span></label>
                                        <div class="col-lg-12">
                                            <textarea type="text" class="form-control" id="rdissuedetail" readonly="readonly"></textarea>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-12" id="ptn">
                                    <div class="form-group row">
                                        <label class="col-xl-5 col-form-label" >案件详情 <span class="text-danger"></span></label>
                                        <div class="col-lg-12" id="rdchose">
                                            <textarea type="text" class="form-control" id="rdputeventmanname" readonly="readonly"></textarea>
                                        </div>
<%--                                        <div class="col-xl-12"><button type="button" class="btn btn-primary float-right" onclick="adddetail()" style="margin-left: 500px;">新增详情</button></div>--%>

                                    </div>
                                </div>
                                <%--                                <div class="col-xl-12">--%>
                                <%--                                    <button type="button" class="btn btn-primary float-right" onclick="clone()" style="margin-left: 510px;">新增详情</button>--%>
                                <%--                                </div>--%>
                            </div>
                        </form>
                        <div class="text-left"><label><h3>案件相关人</h3></label></div>
                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                <tr>
                                    <td>姓名</td>
                                    <td>电话</td>
                                    <td>地址</td>
                                    <td>身份证号</td>
                                </tr>
                                </thead>
                                <tbody id="rdrlmlist">
                                </tbody>
                            </table>
                        </div>
<%--                        <div class="col-xl-12"><button type="button" class="btn btn-primary float-right" onclick="addinfo()" style="margin-left: 500px;">新增相关人</button></div>--%>
                        <div class="col-xl-12" id="rdnewrow"></div>

                    </div>
                </div>
            </div>
            <div class="modal-footer">

            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
            <div class="warper container-fluid">
                <div class="main_container">


                    <div class="row page-titles mx-0">
                        <div class="col-sm-6 p-md-0">
                            <div class="welcome-text">
                                <h4 class="text-primary">Doctor Profile & Settings</h4>
                            </div>
                        </div>
                        <div class="col-sm-6 p-md-0 justify-content-sm-end mt-2 mt-sm-0 d-flex">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="main.jsp">Home</a></li>
                                <li class="breadcrumb-item active"><a href="javascript:;">Doctor Profile</a>
                                </li>
                            </ol>
                        </div>
                    </div>


                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">

                            </div>
                        </div>
                    </div>


                    <div class="row">
                        <div class="col-lg-12">
                            <div class="doctor-info-content">
                                <ul class="nav nav-tabs" id="myTab" role="tablist">
                                    <li class="nav-item col-md-6" role="presentation">
                                        <button class="nav-link" id="profile-tab" data-bs-toggle="tab" data-bs-target="#profile" type="button" role="tab" aria-controls="profile" aria-selected="false">
                                            案件进展统计
                                        </button>
                                    </li>
                                    <li class="nav-item col-md-6" role="presentation">
                                        <button class="nav-link" id="contact-tab" data-bs-toggle="tab" data-bs-target="#contact" type="button" role="tab" aria-controls="contact" aria-selected="false">新增警情</button>
                                    </li>
                                </ul>
                                <div class="tab-content" id="myTabContent">
                                    <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                                        <div class="card m-t-30">
                                            <div class="card-body">
<%--                                                画个表把--%>
                                                <div class="row">
                                                    <div style="width: 580px;height: 450px" id="proccesschart"></div>
<%--                                                    存放按进度查到的列表--%>
                                                    <div style="width: 500px;height: 450px" id="listframe">
                                                        <div class="panel-body widget-media main-scroll nicescroll-box">
                                                            <div class="table-responsive">
                                                                <table id="issuelist" class="table table-hover">
                                                                    <thead>
                                                                    <tr>
                                                                        <th>案件名</th>
                                                                        <th>案件类别</th>
                                                                        <th>创建日期</th>
                                                                        <th></th>
                                                                    </tr>
                                                                    </thead>

                                                                    <tbody id="listbody">
                                                                    </tbody>
                                                                </table>
                                                            </div>
                                                        </div>




                                                    </div>
                                                </div>


                                            </div>
                                        </div>
                                    </div>
                                    <div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="contact-tab">
                                        <div class="row m-t-30 m-l-0 m-r-0">
                                            <div class="card">
                                                <div class="card-header">
                                                    <h4 class="card-title">基本警情信息</h4>
                                                </div>
                                                <div class="card-body">
                                                    <div class="basic-form">
                                                        <form id="issueform" action="${pageContext.request.contextPath}/issue/insertissue.action" method="post">
                                                            <div class="row">
                                                                <div class="col-xl-4">
                                                                    <div class="brand-logo">
                                                                        <a><img src="${pageContext.request.contextPath}../../image/jh2.jpg"  style="width: 268px;" alt="img"></a>
                                                                        <%--                <a href=""><img class="brand-title" src="${pageContext.request.contextPath}../../image/logo.png" alt=""></a>--%>
                                                                    </div>

<!--获取相关的选中事件-->
                                                                </div>
                                                                <div class="col-xl-4">
                                                                    <div class="form-group">
                                                                        <select class="form-control form-select" name="issuetype">
                                                                            <option>请选择报警类别</option>
                                                                            <option>治安纠纷</option>
                                                                            <option>走失求助</option>
                                                                            <option>盗窃</option>
                                                                            <option>打架斗殴</option>
                                                                            <option>电信诈骗</option>
                                                                            <option>家庭纠纷</option>
                                                                            <option>溺水</option>
                                                                            <option>坠楼</option>
                                                                            <option>强奸</option>
                                                                            <option>公共设施险情</option>
                                                                            <option>自然灾害</option>
                                                                            <option>赌博/网络赌博</option>
                                                                            <option>扰乱公共秩序</option>
                                                                            <option>拐卖妇女儿童</option>
                                                                            <option>吸毒/容留他人吸毒</option>
                                                                            <option>其他</option>
                                                                        </select>
                                                                    </div>
                                                                    <div class="form-group">
                                                                        <input type="text" class="form-control" placeholder="出警地点" name="issueaddress">
                                                                    </div>
                                                                    <div class="form-group">
                                                                        <label>接警人</label>
                                                                        <input type="text" class="form-control" placeholder="" name="pickman">
                                                                    </div>
                                                                    <div class="form-group">
                                                                        <select class="form-control form-select" name="baojingfangshi">
                                                                            <option>报警方式</option>
                                                                            <option>110指挥中心</option>
                                                                            <option>执勤巡逻发现</option>
                                                                            <option>电话报警</option>
                                                                            <option>举报</option>
                                                                            <option>自首</option>
                                                                            <option>其他部门移送</option>
                                                                            <option>扭送现行</option>
                                                                            <option>口头报警</option>
                                                                            <option>其他</option>
                                                                        </select>

                                                                    </div>
                                                                </div>
                                                                <div class="col-xl-4">
                                                                    <div class="form-group">
                                                                        <select class="form-control form-select" name="issueproccess">
                                                                            <option>请选择案件进度</option>
                                                                            <option>不予立案</option>
                                                                            <option>已受理</option>
                                                                            <option>移交其他单位</option>
                                                                            <option>已调解</option>
                                                                            <option>受理中</option>
                                                                            <option>结案</option>
                                                                        </select>
                                                                    </div>
                                                                    <div class="form-group">
                                                                        <div class="col-lg-4">
                                                                            <div class="row">
                                                                                <div class="col-lg-9"><input type="text" id="issueid" name="issueid" class="form-control" placeholder="接警单号" onchange=getissueid() style="width: 200px"></div>
                                                                                <div class="col-lg-2"><input type="button" class="btn btn-primary" value="一键生成"style="margin-top: 20px;margin-left: 110px;" onclick=guid2()></div>


                                                                            </div>

                                                                        </div>

                                                                    </div>
                                                                    <div class="form-group">
                                                                        <label>出警时间</label>
                                                                        <input type="date" class="form-control" placeholder="Zip" name="actdate">
                                                                    </div>
                                                                    <div class="form-group">
                                                                        <input type="text" class="form-control" placeholder="处理结果" name="chulijieguo">
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="row">
                                                                <div class="col-xl-4">
                                                                </div>
                                                            </div>
                                                            <div class="row">
                                                                <div class="col-xl-4">
                                                                </div>
                                                                <div class="col-xl-8">
                                                                    <div class="form-group">
                                                                        <textarea class="form-control" placeholder="报警内容：" rows="4" name="issuedetail"></textarea>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="row">
                                                                <div class="col-xl-4">
                                                                    <div class="form-group">
                                                                        <textarea class="form-control" placeholder="案件名" rows="4" name="issuetitle"></textarea>
                                                                    </div>
                                                                </div>
                                                                <div class="col-xl-8">
                                                                    <div class="form-group">
                                                                        <textarea class="form-control" placeholder="警情详细信息：" rows="4" name="puteventman"></textarea>
                                                                    </div>

                                                                </div>
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                            </div>
<%--                                            相关人信息的新增和删除--%>
                                            <div class="card">
                                                <div class="card-header">
                                                    <h4 class="card-title">相关人信息</h4>
                                                </div>
                                                <div class="card-body">
                                                        <div class="fr w100">
<%--                                                            不显示tbody，在onclick事件触发后clone到下面标签--%>
                                                                <table  class="table_100 table table-hover"  id="tab11" style="display: none">
                                                                    <tbody>
                                                                    <tr>
<%--                                                                        <td><input type="text" name="NO"  value="1"  readonly="readonly"/></td>--%>
                                                                        <td><input type="text" placeholder="" class="expert_inp_w100" ></td>
                                                                        <td><input type="text" placeholder="" class="expert_inp_w100"></td>
                                                                        <td><input type="text" placeholder="" class="expert_inp_w100"></td>
                                                                        <td><input type="text" placeholder="" class="expert_inp_w100"></td>
                                                                        <td><input type="button" class="btn btn-primary" id="Button2" onClick=deltr(this) value="删除"></td>
                                                                        <input type="hidden" name="issueid" id="hdissueid" >
                                                                    </tr>
                                                                    </tbody>
                                                                </table>
                                                                <table class="table table-hover" id="dynamicTable">
                                                                    <thead>
                                                                    <tr>
<%--                                                                        <th width="5%">ID</th>--%>
                                                                        <th width="10%">相关人姓名</th>
                                                                        <th width="15%">相关人身份证号</th>
                                                                        <th width="10%">相关人住址</th>
                                                                        <th width="20%">相关人手机号码</th>
                                                                        <th width="10%">操作</th>
                                                                    </tr>
                                                                    </thead>
                                                                    <tbody id="valtable">
                                                                    <tr>
<%--                                                                        <td><input type="text" name="NO"  value="2"  readonly="readonly"/></td>--%>
                                                                        <td><input type="text" placeholder="" class="expert_inp_w100" name="puteventmanname"></td>
                                                                        <td><input type="text" placeholder="" class="expert_inp_w100" name="puteventmanid"></td>
                                                                        <td><input type="text" placeholder="" class="expert_inp_w100" name="puteventmanaddress"></td>
                                                                        <td><input type="text" placeholder="" class="expert_inp_w100" name="puteventmantel"></td>
                                                                        <td><input type="button" class="btn btn-primary" id="Button2" onClick=deltr(this) value="删除"></td>
                                                                        <input type="hidden" name="issueid" id="hdissueid" >
                                                                    </tr>

                                                                    </tbody>
                                                                </table>
                                                            <button type="button" class="btn btn-primary float-end" id="btn_addtr" >新增</button>
                                                            <button type="button" class="btn btn-danger " id="submittable" onclick=collectdata() >上报</button>
                                                        </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%--                                    警情记录--%>
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card shadow">
                                <div class="card-header fix-card">
                                    <div class="row">
                                        <div class="col-8">
                                            <h4 class="card-title">我的警情 </h4>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-body">
                                    <div class="col-lg-7">
                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-lg-5">
                                                    <input type="search" class="form-control" placeholder="请输入案件名" aria-controls="example1">
                                                </div>
                                                <div class="col-lg-2">
                                                    <input type="button" class="btn btn-danger" value="检索" style="margin-top: 10px;">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                    </div>

                                    <div class="table-responsive">
                                        <table id="example1" class="table table-hover">
                                            <thead>
                                                <tr>
                                                    <th>接警单号</th>
                                                    <th>案件名</th>
                                                    <th>案件类别</th>
                                                    <th>案件进度</th>
                                                    <th>创建日期</th>
                                                    <th></th>
                                                </tr>
                                            </thead>
                                            <tbody id="cordtbody">
                                            </tbody>
                                        </table>
                                        <div class="col-lg-12">
                                            <div class="zzsc">
                                                <!--currentpage="1" numbercount="100"-->
<%--                                                <ul class="page" maxshowpageitem="5" pagelistcount="5"  id="page"></ul>--%>
                                        </div>

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
    <script crossorigin="anonymous" integrity="sha512-6Fte/fZaeI/iDaKioXn3TY3ATgsaJGnZ7o0TstIENrnKXNLXTR5E6au08gvxasCDZ9k1gVElx6ME6+gcYvtNQw==" src="https://lib.baomitu.com/echarts/5.3.1/echarts.common.js"></script>
<%--            自动生成单号--%>
    <script type="text/javascript">
        function guid2() {
            function S4() {
                return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);
            }
            var idval=( S4() + "-" + S4() + "-" + S4() + "-" + S4());
            // var idval=(S4() + S4() + "-" + S4() + "-" + S4() + "-" + S4() + "-" + S4() + S4() + S4())
            // return idval;
            console.log(idval);
            $("[name='issueid']").val(idval);
        }
    </script>
<%--<script src="src=../../js/MyPage.js"></script>--%>

<script type="text/javascript">
    var rowdata=[];
    console.log("--------------------------------");
    $("#cordtbody").ready(function ajaxcord(){
        $.ajax({
            url:"${pageContext.request.contextPath}/issue/queryissue?pnum=${policeSession.pnum}&pageNum=1",
            // type:"post",
            success:function (data){

                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log(data);
                // 将返回的数据动态加载到tbody里面
                var tbody = document.getElementById("cordtbody")
                var thelist=[];
                rowdata=[];
                for (i in data){
                    rowdata.push(data[i]);
                    var tr=document.createElement("tr");
                    tbody.append(tr);
                    var tr ='<tr><td>'+data[i].issueid+'</td>'+
                        '<td>'+data[i].issuetitle+'</td>'+
                        '<td>'+data[i].issuetype+'</td>'+
                        '<td>'+data[i].issueproccess+'</td>'+
                        '<td>'+format(data[i].issuestartdate)+'</td>' +
                        '<td><button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal" onclick="showdetail('+i+')">查看详情</button></td></tr>'
                    //为每一行设置一个按钮
                    thelist.push(tr);
                    // console.log(i+"ook");
                }
                $("#cordtbody").html(thelist);
            }
        });
    });

    <%--    模态框获取函数--%>
    function showdetail(i) {
        {
            $("#myModal").modal("show");
            $("#myModalLabel").text(rowdata[i].issuetitle);
            $("#issuestartdate").val(format(rowdata[i].issuestartdate));
            $("#pickman").val(rowdata[i].pickman);
            $("#actdate").val(format(rowdata[i].actdate));
            $("#modalissueid").val(rowdata[i].issueid);
            $("#baojingfangshi").val(rowdata[i].baojingfangshi);
            $("#issuetype").val(rowdata[i].issuetype);
            $("#issueproccess").val(rowdata[i].issueproccess);
            $("#puteventmanname").val(rowdata[i].puteventmanname);
            $("#chulijieguo").val(rowdata[i].chulijieguo);
            $("#issueaddress").val(rowdata[i].issueaddress);
            $("#issuedetail").val(rowdata[i].issuedetail);
        }
        $.ajax({
            url:"${pageContext.request.contextPath}/issue/queryrlmbyissueid?issueid="+ $("#modalissueid").val(),
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log(data);
                var list=[];
                for (items in data){
                    list.push('<tr><td>'+data[items].relevantname+'</td>');
                    list.push('<td>'+data[items].relevanttel+'</td>');
                    list.push('<td>'+data[items].relevantaddress+'</td>');
                    list.push('<td>'+data[items].relevantidcard+'</td></tr>');
                }
                console.log(list);
                $("#rlmlist").html(list.join());

            }
        });
    }
</script>

<%--            得到地址--%>
    <script type="text/javascript">
        function format(date){
            var d=new Date(date);
            var val=d.getFullYear()+"-"+(d.getMonth()+1)+"-" +(d.getDate());
            return val ;
        };
        function getissueid(){
            var issueid=document.getElementById("issueid").value;
            console.log("issueid是------"+issueid);
            return issueid;
        }
        function collectdata(){
            // 收集表格数据并提交其与表单数据
            //遍历表的每一行
            var rlmlist=$("#valtable").children("tr");
            //创建一个list装对象要发送的js对象
            var list=[];
            for (var i=0;i<rlmlist.length;i++){
                var td=rlmlist.eq(i).find("td");
                var rlmname=td.eq(0).find("input").val();
                var rlmid=td.eq(1).find("input").val();
                var rlmaddress=td.eq(2).find("input").val();
                var rlmtel=td.eq(3).find("input").val();
                var issueid=getissueid();
                $("#hdissueid").val(issueid);
                //js对象
                var  rlmobj={
                    "relevantname":rlmname,
                    "relevantidcard":rlmid,
                    "relevantaddress":rlmaddress,
                    "relevanttel":rlmtel,
                    "isssueid":issueid
                }
                list.push(rlmobj);
            }
          console.log(list);
            list=JSON.stringify(list);
            console.log(list);
            // ajax传输json到后端
            $.ajax({
               url:"${pageContext.request.contextPath}/issue/insertrelevent",
                data:{data:list},
                contentType: "text",
                success: function (data){
                    console.log("success insertrlm");
                }
            });
            //提交表单
            $("#issueform").submit();

        }
</script>
</body>
<%--模态框相关--%>
<script>
    //模态框内添加相关人
    function addinfo(){
        var newrow=$('<tr id="add"><td><input class="form-control" type="text" name="name" style="height: 35px;width: 80px;"></td>' +
            '<td><input type="text " class="form-control" name="tel" style="height: 35px;width: 100px;"></td>' +
            '<td><input type="text" class="form-control" name="idcard" style="height: 35px;width: 100px;"></td>' +
            '<td><input type="text" class="form-control" name="address" style="height: 35px;width: 140px;">' +
            '<input type="hidden" id="newissueid"></td><td><button type="button" id="removerow">X</button></tr>');
        $("#rlmlist").append(newrow);
        newrow.find('#removerow').click(function (){
            newrow.remove();
        });
    }
    //单标志检查法小何魔改
    //模态框内添加案件详情
    var flag=1;
    function adddetail(){
        if (flag){
            var newtext=$('<div id="miaomiaomiao"><textarea type="text" class="form-control" ' +
                'id="newdetail" >' +
                '</textarea><button type="button" id="removetextarea">X</button></div>');
            $('#chose').append(newtext);
            flag=0;
        }
        newtext.find('#removetextarea').click(function (){
            newtext.remove();
            flag=1;
        });

    }
        //更新警情信息
        $("#updateinfo").click(function () {
            //加入新的案件详情
            //判断新的框是否存在，存在则更新详情加上日期提交非只读框的内容
            if ($("#miaomiaomiao").length>0) {
                var newdetail=$("#newdetail").val();
                var time=format(Date.now());
                var oldval=$("#puteventmanname").val();
                var submitval=oldval+'\n'+time+'\n'+newdetail;
                var data={
                    "issuetype":$("#issuetype").val(),
                    "chulijieguo":$("#chulijieguo").val(),
                    "issueproccess":$("#issueproccess").val(),
                    "puteventmanname":submitval,
                    "issueid":$("#modalissueid").val()
                }
                data=JSON.stringify(data);
                $.ajax({
                    url:"${pageContext.request.contextPath}/issue/updateissue",
                    data:{data:data},
                    contentType: "text"
                });
            }
        <%--        //加入新相关人--%>
                var inputlist=$("#rlmlist").find("input");
                var list=[];
                for (var temp=0;temp<inputlist.length;){
                        var rlmname=inputlist.eq(temp++).val();
                        var rlmid=inputlist.eq(temp++).val();
                        var rlmaddress=inputlist.eq(temp++).val();
                        var rlmtel=inputlist.eq(temp++).val();
                        var issueid=$("#modalissueid").val();
                        inputlist.eq(temp++).val(issueid);
                        var  rlmobj={
                            "relevantname":rlmname,
                            "relevantidcard":rlmid,
                            "relevantaddress":rlmaddress,
                            "relevanttel":rlmtel,
                            "isssueid":issueid
                        }
                        list.push(rlmobj);
                    }
                console.log("新增人列表"+list);
                // 防止提供空列表、验证名字和list长度是否为空
                if (($("#add").length==0)||(list.length>0&&rlmname!="")){
                    list=JSON.stringify(list);
                    $.ajax({
                        url:"${pageContext.request.contextPath}/issue/insertrelevent",
                        data:{data:list},
                        contentType: "text",
                        success:function (){
                            console.log("------前台提交------")
                        }
                    });
                    // 不空弹出警告
                }else {
                    alert("未新增内容，若不新增请删除输入框");
        }
            $("#myModal").modal('hide');
            $.ajax({
                // type: "post",
                url: "${pageContext.request.contextPath}/issue/issuepage.action",
                // dataType: "dataType",
                success: function (data) {
                    var html=data;
                    $("#ajaxrequest").html(html);

                }
            });
        });
</script>
<%--echarts--%>
<script type="text/javascript">
    function getdetail(i) {
        console.log("获取详情"+i);
        $.ajax({
           url:"${pageContext.request.contextPath}/issue/queryissuebyissueid?issueid="+i,
            success:function (data) {
                data=JSON.stringify(data);
                data=JSON.parse(data);
                {
                    $("#rdolModal").modal("show");
                    $("#rdolModalLabel").text(data.issuetitle);
                    $("#rdissuestartdate").val(format(data.issuestartdate));
                    $("#rdpickman").val(data.pickman);
                    $("#rdactdate").val(format(data.actdate));
                    $("#rdmodalissueid").val(data.issueid);
                    $("#rdbaojingfangshi").val(data.baojingfangshi);
                    $("#rdissuetype").val(data.issuetype);
                    $("#rdissueproccess").val(data.issueproccess);
                    $("#rdputeventmanname").val(data.puteventmanname);
                    $("#rdchulijieguo").val(data.chulijieguo);
                    $("#rdissueaddress").val(data.issueaddress);
                    $("#rdissuedetail").val(data.issuedetail);
                }
            }
        });

        $.ajax({
            url:"${pageContext.request.contextPath}/issue/queryrlmbyissueid?issueid="+ $("#rdmodalissueid").val(),
            async:true,
            success:function (data){
                data=JSON.stringify(data);
                data=JSON.parse(data);
                console.log(data+"相关人byissueid");
                var list=[];
                for (items in data){
                    list.push('<tr><td>'+data[items].relevantname+'</td>');
                    list.push('<td>'+data[items].relevanttel+'</td>');
                    list.push('<td>'+data[items].relevantaddress+'</td>');
                    list.push('<td>'+data[items].relevantidcard+'</td></tr>');
                }
                console.log(list);
                $("#rdrlmlist").html(list.join());

            }
        });
    }
    //=============================图表部分-=========================================
    //得到图表信息
    var piedata=[];
    $.ajax({
        url:"${pageContext.request.contextPath}/issue/issueProccessFromChart",
        async:false,
        success:function (data){
            // data=JSON.stringify(data);
            // console.log(data);
            piedata=data;
        }
    });
    var mycharts=echarts.init(document.getElementById("proccesschart"));
    // 指定图表的配置项和数据
    var option = {
        title: {
            // text: 'ECharts 入门示例'
        },
        tooltip: {
            trigger:"item",
            formatter:'{b}   现存{c}个'
        },
        legend: {
            data: ['销量']
        },
        // xAxis: {
        //     data: ['衬衫', '羊毛衫', '雪纺衫', '裤子', '高跟鞋', '袜子']
        // },
        // yAxis: {},
        series: [
            {
                // name: ,
                type: 'pie',
                data: piedata,
                label:{
                    show:true,
                    formatter:function (arg){
                        // console.log(arg);
                        return arg.name+arg.percent+"%";
                    }
                }
                // [5, 20, 36, 10, 10, 20]
            }
        ]
    };
    // 使用刚指定的配置项和数据显示图表。
    mycharts.setOption(option);
    mycharts.on('click',function(arg){
        console.log(arg.name);
        $.ajax({
            url:"${pageContext.request.contextPath}/issue/queryissueByProccess?proccess="+arg.name,
            success:function (data){
                var clickdata=[];
                data=JSON.stringify(data);
                data=JSON.parse(data);
                var tbody = document.getElementById("listbody");
                var list=[];
                for(i in data){
                    clickdata.push(data[i]);
                    var tr ='<tr>'+
                        '<td>'+data[i].issuetitle+'</td>'+
                        '<td>'+data[i].issuetype+'</td>'+
                        '<td>'+format(data[i].issuestartdate)+'</td>' +
                        '<td><button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal" onclick="getdetail(\''+data[i].issueid+'\')">查看详情</button></td></tr>';
                    list.push(tr);
                    $("#listbody").html(list);
                }
            }
        });
    })
</script>
</html