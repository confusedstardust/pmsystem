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
<div class="warper container-fluid">
    <div class="all-patients main_container">
        <div class="row page-titles mx-0">
            <div class="col-sm-6 p-md-0">
                <div class="welcome-text">
                    <h4 class="text-primary">Doctors List</h4>
                </div>
            </div>
            <div class="col-sm-6 p-md-0 justify-content-sm-end mt-2 mt-sm-0 d-flex">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item"><a href="main.jsp">Home</a></li>
                    <li class="breadcrumb-item active"><a href="javascript:;">Doctors List</a></li>
                </ol>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="widget-media list-doctors best-doctor">
                    <div class="timeline row">
                        <div class="col-sm-6 col-lg-4">
                            <div class="timeline-panel card p-4 mb-4">
                                <div class="media">
                                    <img alt="image" src="${pageContext.request.contextPath}../../picture/avatar1.jpg">
                                </div>
                                <div class="media-body">
                                    <a href="#">
                                        <h4 class="mb-2">Dr. Michael Sullivan</h4>
                                    </a>
                                    <p class="mb-2">Endocrinologist</p>
                                    <div class="star-review">
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-gray"></i>
                                        <i class="fa fa-star text-gray"></i>
                                    </div>
                                </div>
                                <div class="btn-group-style-1">
                                    <div class="btn-content">
                                        <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v"></i>
                                        </button>
                                        <div class="dropdown-menu">
                                            <div class="form-content">
                                                <a href="#">
                                                    <span class="ml-2">View Profile</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Edit</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Delete </span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-4">
                            <div class="timeline-panel card p-4 mb-4">
                                <div class="media">
                                    <img alt="image" src="${pageContext.request.contextPath}../../picture/avatar2.jpg">
                                </div>
                                <div class="media-body">
                                    <a href="#">
                                        <h4 class="mb-2">Dr. Michael Sullivan</h4>
                                    </a>
                                    <p class="mb-2">Endocrinologist</p>
                                    <div class="star-review">
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-gray"></i>
                                        <i class="fa fa-star text-gray"></i>
                                    </div>
                                </div>
                                <div class="btn-group-style-1">
                                    <div class="btn-content">
                                        <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v"></i>
                                        </button>
                                        <div class="dropdown-menu">
                                            <div class="form-content">
                                                <a href="#">
                                                    <span class="ml-2">View Profile</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Edit</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Delete </span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-4">
                            <div class="timeline-panel card p-4 mb-4">
                                <div class="media">
                                    <img alt="image" src="${pageContext.request.contextPath}../../picture/avatar5.jpg">
                                </div>
                                <div class="media-body">
                                    <a href="#">
                                        <h4 class="mb-2">Dr. Michael Sullivan</h4>
                                    </a>
                                    <p class="mb-2">Endocrinologist</p>
                                    <div class="star-review">
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-gray"></i>
                                        <i class="fa fa-star text-gray"></i>
                                    </div>
                                </div>
                                <div class="btn-group-style-1">
                                    <div class="btn-content">
                                        <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v"></i>
                                        </button>
                                        <div class="dropdown-menu">
                                            <div class="form-content">
                                                <a href="#">
                                                    <span class="ml-2">View Profile</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Edit</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Delete </span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-4">
                            <div class="timeline-panel card p-4 mb-4">
                                <div class="media">
                                    <img alt="image" src="${pageContext.request.contextPath}../../picture/avatar3.jpg">
                                </div>
                                <div class="media-body">
                                    <a href="#">
                                        <h4 class="mb-2">Dr. Michael Sullivan</h4>
                                    </a>
                                    <p class="mb-2">Endocrinologist</p>
                                    <div class="star-review">
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-gray"></i>
                                        <i class="fa fa-star text-gray"></i>
                                    </div>
                                </div>
                                <div class="btn-group-style-1">
                                    <div class="btn-content">
                                        <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v"></i>
                                        </button>
                                        <div class="dropdown-menu">
                                            <div class="form-content">
                                                <a href="#">
                                                    <span class="ml-2">View Profile</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Edit</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Delete </span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-4">
                            <div class="timeline-panel card p-4 mb-4">
                                <div class="media">
                                    <img alt="image" src="${pageContext.request.contextPath}../../picture/avatar4.jpg">
                                </div>
                                <div class="media-body">
                                    <a href="#">
                                        <h4 class="mb-2">Dr. Michael Sullivan</h4>
                                    </a>
                                    <p class="mb-2">Endocrinologist</p>
                                    <div class="star-review">
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-gray"></i>
                                        <i class="fa fa-star text-gray"></i>
                                    </div>
                                </div>
                                <div class="btn-group-style-1">
                                    <div class="btn-content">
                                        <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v"></i>
                                        </button>
                                        <div class="dropdown-menu">
                                            <div class="form-content">
                                                <a href="#">
                                                    <span class="ml-2">View Profile</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Edit</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Delete </span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-4">
                            <div class="timeline-panel card p-4 mb-4">
                                <div class="media">
                                    <img alt="image" src="${pageContext.request.contextPath}../../picture/avatar1.jpg">
                                </div>
                                <div class="media-body">
                                    <a href="#">
                                        <h4 class="mb-2">Dr. Michael Sullivan</h4>
                                    </a>
                                    <p class="mb-2">Endocrinologist</p>
                                    <div class="star-review">
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-gray"></i>
                                        <i class="fa fa-star text-gray"></i>
                                    </div>
                                </div>
                                <div class="btn-group-style-1">
                                    <div class="btn-content">
                                        <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v"></i>
                                        </button>
                                        <div class="dropdown-menu">
                                            <div class="form-content">
                                                <a href="#">
                                                    <span class="ml-2">View Profile</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Edit</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Delete </span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-4">
                            <div class="timeline-panel card p-4 mb-4">
                                <div class="media">
                                    <img alt="image" src="${pageContext.request.contextPath}../../picture/avatar2.jpg">
                                </div>
                                <div class="media-body">
                                    <a href="#">
                                        <h4 class="mb-2">Dr. Michael Sullivan</h4>
                                    </a>
                                    <p class="mb-2">Endocrinologist</p>
                                    <div class="star-review">
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-gray"></i>
                                        <i class="fa fa-star text-gray"></i>
                                    </div>
                                </div>
                                <div class="btn-group-style-1">
                                    <div class="btn-content">
                                        <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v"></i>
                                        </button>
                                        <div class="dropdown-menu">
                                            <div class="form-content">
                                                <a href="#">
                                                    <span class="ml-2">View Profile</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Edit</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Delete </span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-4">
                            <div class="timeline-panel card p-4 mb-4">
                                <div class="media">
                                    <img alt="image" src="${pageContext.request.contextPath}../../picture/avatar3.jpg">
                                </div>
                                <div class="media-body">
                                    <a href="#">
                                        <h4 class="mb-2">Dr. Michael Sullivan</h4>
                                    </a>
                                    <p class="mb-2">Endocrinologist</p>
                                    <div class="star-review">
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-gray"></i>
                                        <i class="fa fa-star text-gray"></i>
                                    </div>
                                </div>
                                <div class="btn-group-style-1">
                                    <div class="btn-content">
                                        <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v"></i>
                                        </button>
                                        <div class="dropdown-menu">
                                            <div class="form-content">
                                                <a href="#">
                                                    <span class="ml-2">View Profile</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Edit</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Delete </span>
                                                </a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-4">
                            <div class="timeline-panel card p-4 mb-4">
                                <div class="media">
                                    <img alt="image" src="${pageContext.request.contextPath}../../picture/avatar4.jpg">
                                </div>
                                <div class="media-body">
                                    <a href="#">
                                        <h4 class="mb-2">Dr. Michael Sullivan</h4>
                                    </a>
                                    <p class="mb-2">Endocrinologist</p>
                                    <div class="star-review">
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-orange"></i>
                                        <i class="fa fa-star text-gray"></i>
                                        <i class="fa fa-star text-gray"></i>
                                    </div>
                                </div>
                                <div class="btn-group-style-1">
                                    <div class="btn-content">
                                        <button type="button" class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v"></i>
                                        </button>
                                        <div class="dropdown-menu">
                                            <div class="form-content">
                                                <a href="#">
                                                    <span class="ml-2">View Profile</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Edit</span>
                                                </a>
                                                <a href="#">
                                                    <span class="ml-2">Delete </span>
                                                </a>
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
    </div>
</div>


    <!-- JQuery v3.5.1 -->
    <script src="${pageContext.request.contextPath}../../js/jquery3-2.1.min.js"></script>

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

</html>