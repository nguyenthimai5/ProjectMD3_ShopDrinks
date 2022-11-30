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
  <link rel="stylesheet" href="<%=request.getContextPath()%>/css/signin.css">
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

<div class="content-wrapper">
  <div class="content">
    <div class="signup-wrapper shadow-box">
      <div class="company-details ">

        <div class="shadow"></div>
        <div class="wrapper-1">
          <div class="logo">
            <div class="icon-food">

            </div>
          </div>
          <h1 class="title">Drinks.</h1>
          <div class="slogan">
            Welcome to Drinks</div>
        </div>

      </div>
      <div class="signup-form ">
        <div class="wrapper-2">
          <div class="form-title">Sign up today!</div>
          <div class="form">
            <form action="<%=request.getContextPath()%>/UserServlet" method="post">
              <p class="content-item">
                <label> Name
                  <input type="text" name="userName" placeholder="Lorem ipsum"  required>
                </label>
              </p>
              <p class="content-item">
                <label> FullName
                  <input type="text" name="fullName" placeholder="Lorem ipsum"  required>
                </label>
              </p>

              <p class="content-item">
                <label>email
                  <input type="text"  name="email"  placeholder="lorem@loremipsum.com" name="email" required>
                </label>
              </p>

              <p class="content-item">

                <label>password
                  <input type="password"  name="passWords" placeholder="*****" name="psw" required>
                </label>
              </p>
              <p class="content-item">
                <label> ConfirmPassWord
                  <input type="password" name="confrimPassWords"  placeholder="*****" name="psw" required>
                </label>
              </p>
              <p class="content-item">
                <label> Address
                  <input type="text" name="address"  placeholder="Lorem ipsum"  required>
                </label>
              </p>
              <p class="content-item">
                <label> Phone
                  <input type="number" name="phone"  placeholder="123-4567-8901"  required>
                </label>
              </p>
              <p class="content-item">
                <label> Birthday
                  <input type="date" name="birthDate"  placeholder="brithdate"  required>
                </label>
              </p>
              <p class="content-item">
                <label> Image
                  <input type="file" name="imageUser">
                </label>
              </p>
              <input type="submit"  class="signup"  value="signup" name="action"/>
            </form>
          </div>
        </div>

      </div>

    </div>
  </div>
</div>


<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">


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
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
<script src="<%=request.getContextPath()%>/js/google-map.js"></script>
<script src="<%=request.getContextPath()%>/js/main.js"></script>
</body>
</html>