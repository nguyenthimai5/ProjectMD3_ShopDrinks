
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Shop Drinks</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/animate.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/login.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/owl.carousel.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/owl.theme.default.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/magnific-popup.css">

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/aos.css">

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/ionicons.min.css">

    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/jquery.timepicker.css">


    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/flaticon.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/icomoon.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>
<body class="goto-here">
<div class="container" id="container">
    <div class="form-container sign-in-container">
        <form action="<%=request.getContextPath()%>/UserServlet" method="post">
            <h1>Sign in</h1>
            <div class="social-container">
                <a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
                <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
                <a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
            </div>
            <span>ho???c s??? d???ng t??i kho???n kh??c c???a b???n</span>
            <input type="text" name="userName" placeholder="User Name" />
            <input type="password" name="passWords" placeholder="Password" />
            <input type="submit"  value="signin" name="action"/>
        </form>
    </div>
    <div class="overlay-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>Drinks Welcome Back!</h1>
                <p>????? gi??? k???t n???i v???i ch??ng t??i, vui l??ng ????ng nh???p b???ng th??ng tin c?? nh??n c???a b???n</p>
                <button class="ghost" id="signIn"><a href="<%=request.getContextPath()%>/UserServlet?action=signin">Sign In</a></button>
            </div>
            <div class="overlay-panel overlay-right">
                <h1>Hello, Friend!</h1>
                <p>Nh???p th??ng tin c?? nh??n c???a b???n v?? b???t ?????u h??nh tr??nh v???i ch??ng t??i!</p>
                <button class="ghost" id="signUp"><a href="<%=request.getContextPath()%>/views/sign in.jsp?action=signup">Sign Up</a></button>
            </div>
        </div>
    </div>
</div>

<div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery-migrate-3.0.1.min.js"></script>
<script src="<%=request.getContextPath()%>/js/popper.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.easing.1.3.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.waypoints.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.stellar.min.js"></script>
<script src="<%=request.getContextPath()%>/js/owl.carousel.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.magnific-popup.min.js"></script>
<script src="<%=request.getContextPath()%>/js/aos.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.animateNumber.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap-datepicker.js"></script>
<script src="<%=request.getContextPath()%>/js/scrollax.min.js"></script>
<script src="<%=request.getContextPath()%>/js/login.js"></script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
<script src="<%=request.getContextPath()%>/js/google-map.js"></script>
<script src="<%=request.getContextPath()%>/js/main.js"></script>
</body>
</html>