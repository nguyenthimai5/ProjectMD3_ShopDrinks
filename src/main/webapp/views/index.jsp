<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

  <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
	  <div class="container">
		  <a class="navbar-brand" href="<%=request.getContextPath()%>/index.jsp">Drinks</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
			  <span class="oi oi-menu"></span> Menu
		  </button>

		  <div class="collapse navbar-collapse" id="ftco-nav">
			  <ul class="navbar-nav ml-auto">
				  <li class="nav-item active"><a href="<%=request.getContextPath()%>/HomeServlet?action=home" class="nav-link">Home</a></li>
				  <li class="nav-item"><a href="<%=request.getContextPath()%>/HomeServlet?action=shop" class="nav-link">Shop</a></li>
				  <li class="nav-item"><a href="<%=request.getContextPath()%>/views/wishlist.jsp" class="nav-link">WishList</a></li>
				  <li class="nav-item"><a href="<%=request.getContextPath()%>/views/about.jsp" class="nav-link">About</a></li>
				  <li class="nav-item"><a href="<%=request.getContextPath()%>/views/blog.jsp" class="nav-link">Blog</a></li>
				  <li class="nav-item"><a href="<%=request.getContextPath()%>/views/contact.jsp" class="nav-link">Contact</a></li>
				  <li class="nav-item cta cta-colored"><a href="<%=request.getContextPath()%>/views/cart.jsp" class="nav-link"><span class="icon-shopping_cart"></span>[0]</a></li>
				  <li class="nav-item"><a href="<%=request.getContextPath()%>/views/checkout.jsp" class="nav-link">Check Out</a></li>
				  <li class="nav-item cta cta-colored"><a href="<%=request.getContextPath()%>/views/log%20in%20sign%20up.jsp" class="nav-link"><i class="icon-user"></i></a></li>

			  </ul>
		  </div>
	  </div>
  </nav>


	<section id="home-section" class="hero-wrap hero-bread">
		<div class="home-slider owl-carousel">
			<div class="slider-item" style="background-image: url(<%=request.getContextPath()%>/images/bground.jpg);">
				<div class="overlay"></div>
				<div class="container">
					<div class="row slider-text justify-content-center align-items-center" data-scrollax-parent="true">

						<div class="col-md-12 ftco-animate text-center">
							<h1 class="mb-2">Ch??ng t??i ph???c v??? ????? u???ng ch???t l?????ng cao</h1>
							<h2 class="subheading mb-4"></h2>
							<p><a href="<%=request.getContextPath()%>/views/blog-single.jsp" class="btn btn-primary">Xem chi ti???t</a></p>
						</div>

					</div>
				</div>
			</div>

			<div class="slider-item" style="background-image: url(<%=request.getContextPath()%>/images/bg.jpg);">
				<div class="overlay"></div>
				<div class="container">
					<div class="row slider-text justify-content-center align-items-center" data-scrollax-parent="true">

						<div class="col-sm-12 ftco-animate text-center">
							<h1 class="mb-2">100% T??? Thi??n Nhi??n</h1>
							<h2 class="subheading mb-4">Cung c???p ????? u???ng ?????m b???o v??? sinh</h2>
							<p><a href="<%=request.getContextPath()%>/views/blog-single.jsp" class="btn btn-primary">Xem chi ti???t</a></p>
						</div>

					</div>
				</div>
			</div>
		</div>
	</section>


    <section class="ftco-section">
    	<div class="container">
				<div class="row justify-content-center mb-3 pb-3">
          <div class="col-md-12 heading-section text-center ftco-animate">
          	<span class="subheading">S???n ph???m n???i b???t</span>
            <h2 class="mb-4">S???n Ph???m</h2>
            <p> Nh???p kh???u s??? tinh t???, ph??n ph???i ni???m ??am m?? </p>
          </div>
        </div>
    	</div>
    	<div class="container">
    		<div class="row">
                <c:forEach items="${productListOn}" var="pro">
                    <div class="col-md-6 col-lg-3 ftco-animate">
                        <div class="product">
                            <a href="<%=request.getContextPath()%>/views/product-single.jsp" id="anh" class="img-prod"><img class="img-fluid" src="<%=request.getContextPath()%>/images/${pro.image}" alt="${pro.productName}">
                                <div class="overlay"></div>
                            </a>
                            <div class="text py-3 pb-4 px-3 text-center">
                                <h3><a href="<%=request.getContextPath()%>/views/product-single.jsp">${pro.productName}</a></h3>
                                <div class="d-flex">
                                    <div class="pricing">
                                        <p class="price"><span>${pro.price} VND</span></p>
                                    </div>
                                </div>
                                <div class="bottom-area d-flex px-3">
                                    <div class="m-auto d-flex">
                                        <a href="<%=request.getContextPath()%>/views/product-single.jsp" class="add-to-cart d-flex justify-content-center align-items-center text-center">
                                            <span><i class="ion-ios-menu"></i></span>
                                        </a>
                                        <a href="<%=request.getContextPath()%>/views/cart.jsp" class="buy-now d-flex justify-content-center align-items-center mx-1">
                                            <span><i class="ion-ios-cart"></i></span>
                                        </a>
                                        <a href="<%=request.getContextPath()%>/views/wishlist.jsp" class="heart d-flex justify-content-center align-items-center ">
                                            <span><i class="ion-ios-heart"></i></span>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>


    		</div>
    	</div>
    </section>
		<section class="ftco-section img" style="background-image: url(<%=request.getContextPath()%>/images/bgr55.jpg);">
    	<div class="container">
				<div class="row justify-content-end">
          <div class="col-md-6 heading-section ftco-animate deal-of-the-day ftco-animate">
          	<span class="subheading">????? U???NG</span>
            <h2 class="mb-4">TH?????NG H???NG</h2>
			  <p>Chuy??n cung c???p c??c ????? u???ng ?????m b???o dinh d?????ng
				  h???p v??? sinh ?????n ng?????i d??ng,ph???c v??? ng?????i d??ng 1 c??i
				  ho??n h???o nh???t</p>
            <h3><a href="<%=request.getContextPath()%>/views/blog-single.jsp"></a></h3>
            <span class="price">$10 <a href="<%=request.getContextPath()%>/views/product-single.jsp">now $5 only</a></span>
            <div id="timer" class="d-flex mt-5">
						  <div class="time" id="days"></div>
						  <div class="time pl-3" id="hours"></div>
						  <div class="time pl-3" id="minutes"></div>
						  <div class="time pl-3" id="seconds"></div>
						</div>
          </div>
        </div>
    	</div>
    </section>

    <section class="ftco-section testimony-section">
      <div class="container">
        <div class="row justify-content-center mb-5 pb-3">
          <div class="col-md-7 heading-section ftco-animate text-center">
          	<span class="subheading">?? Ki???n</span>
            <h2 class="mb-4">Ph???n h???i c???a kh??ch h??ng</h2>
          </div>
        </div>
        <div class="row ftco-animate">
          <div class="col-md-12">
            <div class="carousel-testimony owl-carousel">
              <div class="item">
                <div class="testimony-wrap p-4 pb-5">
                  <div class="user-img mb-5" style="background-image: url(<%=request.getContextPath()%>/images/avt11.jpg)">
                    <span class="quote d-flex align-items-center justify-content-center">
                      <i class="icon-quote-left"></i>
                    </span>
                  </div>
                  <div class="text text-center">
                    <p class="mb-5 pl-4 line">????? u???ng th??m ngon c???c k??? lu??n.???ng h??? shop nh??!</p>
                    <p class="name">Vuy</p>
                    <span class="position">Marketing Manager</span>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="testimony-wrap p-4 pb-5">
                  <div class="user-img mb-5" style="background-image: url(<%=request.getContextPath()%>/images/avt2.jpg)">
                    <span class="quote d-flex align-items-center justify-content-center">
                      <i class="icon-quote-left"></i>
                    </span>
                  </div>
                  <div class="text text-center">
                    <p class="mb-5 pl-4 line">M??nh c???m nh???n n?? ???????c l??m ho??n to??n t??? hoa qu??? t????i.</p>
                    <p class="name">Nguy???n Th??? Uy??n</p>
                    <span class="position">Interface Designer</span>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="testimony-wrap p-4 pb-5">
                  <div class="user-img mb-5" style="background-image: url(<%=request.getContextPath()%>/images/avt3.jpg)">
                    <span class="quote d-flex align-items-center justify-content-center">
                      <i class="icon-quote-left"></i>
                    </span>
                  </div>
                  <div class="text text-center">
                    <p class="mb-5 pl-4 line">Gi?? c??ng kh??ng ?????t m?? ch???t l?????ng c???c k???</p>
                    <p class="name">Nguy???n Th??? Lan ??nh</p>
                    <span class="position">UI Designer</span>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="testimony-wrap p-4 pb-5">
                  <div class="user-img mb-5" style="background-image: url(<%=request.getContextPath()%>/images/avt44.jpg)">
                    <span class="quote d-flex align-items-center justify-content-center">
                      <i class="icon-quote-left"></i>
                    </span>
                  </div>
                  <div class="text text-center">
                    <p class="mb-5 pl-4 line">????ng g??i c???n th???n l???m lun.</p>
                    <p class="name">Bepo</p>
                    <span class="position">Web Developer</span>
                  </div>
                </div>
              </div>
              <div class="item">
                <div class="testimony-wrap p-4 pb-5">
                  <div class="user-img mb-5" style="background-image: url(<%=request.getContextPath()%>/images/avt55.jpg)">
                    <span class="quote d-flex align-items-center justify-content-center">
                      <i class="icon-quote-left"></i>
                    </span>
                  </div>
                  <div class="text text-center">
                    <p class="mb-5 pl-4 line">Shop uy t??n nha m???i ng?????i.Giao h??ng nhanh n???a</p>
                    <p class="name">Nguy???n Thanh Huy???n</p>
                    <span class="position">System Analyst</span>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

    <hr>



		<section class="ftco-section ftco-no-pt ftco-no-pb py-5 bg-light">
      <div class="container py-4">
        <div class="row d-flex justify-content-center py-5">
          <div class="col-md-6">
          	<h2 style="font-size: 22px;" class="mb-0">????ng K??</h2>
          	<span>Nh???n th??ng tin c???p nh???t qua email v??? c??c c???a h??ng m???i nh???t v?? ??u ????i ?????c bi???t c???a ch??ng t??i</span>
          </div>
          <div class="col-md-6 d-flex align-items-center">
            <form action="#" class="subscribe-form">
              <div class="form-group d-flex">
                <input type="text" class="form-control" placeholder="Enter email address">
                <input type="submit" value="Subscribe" class="submit px-3">
              </div>
            </form>
          </div>
        </div>
      </div>
    </section>
    <footer class="ftco-footer ftco-section">
      <div class="container">
      	<div class="row">
      		<div class="mouse">
						<a href="#" class="mouse-icon">
							<div class="mouse-wheel"><span class="ion-ios-arrow-up"></span></div>
						</a>
					</div>
      	</div>
        <div class="row mb-5">
          <div class="col-md">
            <div class="ftco-footer-widget mb-4">
              <h2 class="ftco-heading-2">Drinks</h2>
              <p>Ch???t l?????ng ??i ????i v???i gi?? th??nh</p>
              <ul class="ftco-footer-social list-unstyled float-md-left float-lft mt-5">
                <li class="ftco-animate"><a href="#"><span class="icon-twitter"></span></a></li>
                <li class="ftco-animate"><a href="#"><span class="icon-facebook"></span></a></li>
                <li class="ftco-animate"><a href="#"><span class="icon-instagram"></span></a></li>
              </ul>
            </div>
          </div>
			<div class="col-md">
				<div class="ftco-footer-widget mb-4 ml-md-5">
					<h2 class="ftco-heading-2">Menu</h2>
					<ul class="list-unstyled">
						<li><a href="<%=request.getContextPath()%>/views/index.jsp" class="py-2 d-block">Shop</a></li>
						<li><a href="<%=request.getContextPath()%>/views/about.jsp" class="py-2 d-block">About</a></li>
						<li><a href="<%=request.getContextPath()%>/views/product-single.jsp" class="py-2 d-block">Products</a></li>
						<li><a href="<%=request.getContextPath()%>/views/blog-single.jsp" class="py-2 d-block">Blog </a></li>
					</ul>
				</div>
			</div>
			<div class="col-md-4">
				<div class="ftco-footer-widget mb-4">
					<h2 class="ftco-heading-2">Help</h2>
					<div class="d-flex">
						<ul class="list-unstyled mr-l-5 pr-l-3 mr-4">
							<li><a href="#" class="py-2 d-block">Th??ng tin v???n chuy???n</a></li>
							<li><a href="#" class="py-2 d-block">Tr??? l???i & Trao ?????i</a></li>
							<li><a href="#" class="py-2 d-block">??i???u kho???n & C??c ??i???u ki???n</a></li>
							<li><a href="#" class="py-2 d-block">Ch??nh s??ch b???o m???t</a></li>
						</ul>
						<ul class="list-unstyled">
							<li><a href="#" class="py-2 d-block">C??u h???i th?????ng g???p</a></li>
							<li><a href="#" class="py-2 d-block">Li??n H???</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="col-md">
				<div class="ftco-footer-widget mb-4">
					<h2 class="ftco-heading-2">C??u h???i c???a b???n?</h2>
					<div class="block-23 mb-3">
						<ul>
							<li><span class="icon icon-map-marker"></span><span class="text">BUSAN-H??N QU???C</span>
							</li>
							<li><a href="#"><span class="icon icon-phone"></span><span
									class="text">+2 392 3929 210</span></a></li>
							<li><a href="#"><span class="icon icon-envelope"></span><span class="text">info@maivdomain.com</span></a>
							</li>
						</ul>
					</div>
				</div>
			</div>
        </div>
        <div class="row">
          <div class="col-md-12 text-center">

            <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart color-danger" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
						  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						</p>
          </div>
        </div>
      </div>
    </footer>



  <!-- loader -->
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