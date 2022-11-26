<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Vegefoods - Free Bootstrap 4 Template by Colorlib</title>
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
				  <li class="nav-item active"><a href="<%=request.getContextPath()%>/index.jsp" class="nav-link">Home</a></li>
				  <li class="nav-item"><a href="<%=request.getContextPath()%>/views/shop.jsp" class="nav-link">Shop</a></li>
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
    <div class="hero-wrap hero-bread" style="background-image: url(<%=request.getContextPath()%>/images/bg333333333333.jpg);">
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-9 ftco-animate text-center">
          	<p class="breadcrumbs"><span class="mr-2"><a href="<%=request.getContextPath()%>/index.jsp">Home</a></span> <span class="mr-2"><a href="<%=request.getContextPath()%>/index.jsp">Product</a></span> <span>Product</span></p>
            <h1 class="mb-0 bread">Sản phẩm</h1>
          </div>
        </div>
      </div>
    </div>

    <section class="ftco-section">
    	<div class="container">
    		<div class="row">
    			<div class="col-lg-6 mb-5 ftco-animate">
    				<a href="<%=request.getContextPath()%>/images/trà sữa khoai môn.jpg" class="image-popup"><img src="<%=request.getContextPath()%>/images/trà sữa khoai môn.jpg" class="img-fluid" alt="Trà Sữa Khoai Môn"></a>
    			</div>
    			<div class="col-lg-6 product-details pl-md-5 ftco-animate">
    				<h3>Trà Sữa Khoai Môn</h3>
    				<p class="price"><span>$80.00</span></p>
					<p>Chất lượng đi đôi với giá thành</p>
					<p>Còn Hàng</p>
						<div class="row mt-4">
							<div class="col-md-6">
								<div class="form-group d-flex">
		              <div class="select-wrap">
	                  <div class="icon"><span class="ion-ios-arrow-down"></span></div>
	                  <select name="" id="" class="form-control">
	                  	<option value="">S</option>
	                    <option value="">M</option>
	                    <option value="">L</option>
	                    <option value="">XL</option>
						  <option value="">XXL</option>
					  </select>

	                </div>
		            </div>
							</div>
							<div class="w-100"></div>
							<div class="input-group col-md-6 d-flex mb-3">
	             	<span class="input-group-btn mr-2">
	                	<button type="button" class="quantity-left-minus btn"  data-type="minus" data-field="">
	                   <i class="ion-ios-remove"></i>
	                	</button>
	            		</span>
	             	<input type="text" id="quantity" name="quantity" class="form-control input-number" value="1" min="1" max="100">
	             	<span class="input-group-btn ml-2">
	                	<button type="button" class="quantity-right-plus btn" data-type="plus" data-field="">
	                     <i class="ion-ios-add"></i>
	                 </button>
	             	</span>
	          	</div>
	          	<div class="w-100"></div>
          	</div>
          	<p><a href="<%=request.getContextPath()%>/views/cart.jsp" class="btn btn-black py-3 px-5">Thêm vào giỏ hàng</a></p>
    			</div>
    		</div>
    	</div>
    </section>

    <section class="ftco-section">
    	<div class="container">
				<div class="row justify-content-center mb-3 pb-3">
          <div class="col-md-12 heading-section text-center ftco-animate">
          	<span class="subheading">Sản Phẩm</span>
            <h2 class="mb-4">Sản phẩm liên quan</h2>
            <p>Chất lượng,uy tín 100%</p>
          </div>
        </div>   		
    	</div>
    	<div class="container">
    		<div class="row">
    			<div class="col-md-6 col-lg-3 ftco-animate">
    				<div class="product">
    					<a href="<%=request.getContextPath()%>/views/product-single.jsp" class="img-prod"><img class="img-fluid" src="<%=request.getContextPath()%>/images/nước cam.jpg" alt="Nước Cam">
    						<div class="overlay"></div>
    					</a>
    					<div class="text py-3 pb-4 px-3 text-center">
    						<h3><a href="<%=request.getContextPath()%>/views/product-single.jsp">Nước Cam</a></h3>
    						<div class="d-flex">
    							<div class="pricing">
									<p class="price"><span>$60.00</span></p>
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
									<a href="<%=request.getContextPath()%>/views/about.jsp" class="heart d-flex justify-content-center align-items-center ">
										<span><i class="ion-ios-heart"></i></span>
									</a>
								</div>
							</div>
    					</div>
    				</div>
    			</div>
    			<div class="col-md-6 col-lg-3 ftco-animate">
    				<div class="product">
    					<a href="<%=request.getContextPath()%>/views/product-single.jsp" class="img-prod"><img class="img-fluid" src="<%=request.getContextPath()%>/images/kem socola.jpg" alt="Kem socola">
    						<div class="overlay"></div>
    					</a>
    					<div class="text py-3 pb-4 px-3 text-center">
    						<h3><a href="<%=request.getContextPath()%>/views/product-single.jsp">Kem socola</a></h3>
    						<div class="d-flex">
    							<div class="pricing">
		    						<p class="price"><span>$70.00</span></p>
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
									<a href="<%=request.getContextPath()%>/views/about.jsp" class="heart d-flex justify-content-center align-items-center ">
										<span><i class="ion-ios-heart"></i></span>
									</a>
								</div>
							</div>
    					</div>
    				</div>
    			</div>
    			<div class="col-md-6 col-lg-3 ftco-animate">
    				<div class="product">
    					<a href="<%=request.getContextPath()%>/views/product-single.jsp" class="img-prod"><img class="img-fluid" src="<%=request.getContextPath()%>/images/nước dứa.jpg" alt="Nước Dứa">
	    					<div class="overlay"></div>
	    				</a>
    					<div class="text py-3 pb-4 px-3 text-center">
    						<h3><a href="<%=request.getContextPath()%>/views/product-single.jsp">Nước Dứa</a></h3>
    						<div class="d-flex">
    							<div class="pricing">
		    						<p class="price"><span>$65.00</span></p>
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
									<a href="<%=request.getContextPath()%>/views/about.jsp" class="heart d-flex justify-content-center align-items-center ">
										<span><i class="ion-ios-heart"></i></span>
									</a>
								</div>
							</div>
    					</div>
    				</div>
    			</div>
    			<div class="col-md-6 col-lg-3 ftco-animate">
    				<div class="product">
    					<a href="<%=request.getContextPath()%>/views/product-single.jsp" class="img-prod"><img class="img-fluid" src="<%=request.getContextPath()%>/images/trà chanh.jpg" alt="Trà chanh">
    						<div class="overlay"></div>
    					</a>
    					<div class="text py-3 pb-4 px-3 text-center">
    						<h3><a href="<%=request.getContextPath()%>/views/product-single.jsp">Trà Chanh</a></h3>
    						<div class="d-flex">
    							<div class="pricing">
		    						<p class="price"><span>$50.00</span></p>
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
									<a href="<%=request.getContextPath()%>/views/about.jsp" class="heart d-flex justify-content-center align-items-center ">
										<span><i class="ion-ios-heart"></i></span>
									</a>
								</div>
							</div>
    					</div>
    				</div>
    			</div>
    		</div>
    	</div>
    </section>
  <section class="ftco-section ftco-degree-bg">
  <div class="pt-5 mt-5">
	  <h3 class="mb-5">5 Comments</h3>
	  <ul class="comment-list">
		  <li class="comment">
			  <div class="vcard bio">
				  <img src="<%=request.getContextPath()%>/images/avt2.jpg" alt="Image placeholder">
			  </div>
			  <div class="comment-body">
				  <h3>John Doe</h3>
				  <div class="meta">June 27, 2018 at 2:21pm</div>
				  <p>Mới đặt mà ship nhanh quá trời</p>
				  <p><a href="#" class="reply">Reply</a></p>
			  </div>
		  </li>

		  <li class="comment">
			  <div class="vcard bio">
				  <img src="<%=request.getContextPath()%>/images/avt3.jpg" alt="Image placeholder">
			  </div>
			  <div class="comment-body">
				  <h3>John Doe</h3>
				  <div class="meta">June 27, 2018 at 2:29pm</div>
				  <p>Nước ngon cốc còn đẹp nữa chứ</p>
				  <p><a href="#" class="reply">Reply</a></p>
			  </div>

			  <ul class="children">
				  <li class="comment">
					  <div class="vcard bio">
						  <img src="<%=request.getContextPath()%>/images/avt1.jpg" alt="Image placeholder">
					  </div>
					  <div class="comment-body">
						  <h3>John Doe</h3>
						  <div class="meta">June 27, 2018 at 2:21pm</div>
						  <p>Mua nhiều lần rồi mà lần nào cũng chất lượng hết á</p>
						  <p><a href="#" class="reply">Reply</a></p>
					  </div>


					  <ul class="children">
						  <li class="comment">
							  <div class="vcard bio">
								  <img src="<%=request.getContextPath()%>/images/avt44.jpg" alt="Image placeholder">
							  </div>
							  <div class="comment-body">
								  <h3>John Doe</h3>
								  <div class="meta">June 27, 2018 at 2:21pm</div>
								  <p>Tuyệt!!!!!</p>
								  <p><a href="#" class="reply">Reply</a></p>
							  </div>

							  <ul class="children">
								  <li class="comment">
									  <div class="vcard bio">
										  <img src="<%=request.getContextPath()%>/images/person_2.jpg" alt="Image placeholder">
									  </div>
									  <div class="comment-body">
										  <h3>John Doe</h3>
										  <div class="meta">June 27, 2018 at 2:21pm</div>
										  <p>Đỉnh!</p>
										  <p><a href="#" class="reply">Reply</a></p>
									  </div>
								  </li>
							  </ul>
						  </li>
					  </ul>
				  </li>
			  </ul>
		  </li>

		  <li class="comment">
			  <div class="vcard bio">
				  <img src="<%=request.getContextPath()%>/images/avt55.jpg" alt="Image placeholder">
			  </div>
			  <div class="comment-body">
				  <h3>Ngọc Hà</h3>
				  <div class="meta">June 27, 2018 at 6:45 pm</div>
				  <p>Dâu tây mùa này ngon quá đi^~^</p>
				  <p><a href="#" class="reply">Reply</a></p>
			  </div>
		  </li>
	  </ul>
	  <!-- END comment-list -->

	  <div class="comment-form-wrap pt-5">
		  <h3 class="mb-5">Để lại bình luận</h3>
		  <form action="#" class="p-5 bg-light">
			  <div class="form-group">
				  <label for="name">Name *</label>
				  <input type="text" class="form-control" id="name">
			  </div>
			  <div class="form-group">
				  <label for="email">Email *</label>
				  <input type="email" class="form-control" id="email">
			  </div>
			  <div class="form-group">
				  <label for="website">Website</label>
				  <input type="url" class="form-control" id="website">
			  </div>

			  <div class="form-group">
				  <label for="message">Message</label>
				  <textarea name="" id="message" cols="30" rows="10" class="form-control"></textarea>
			  </div>
			  <div class="form-group">
				  <input type="submit" value="Post Comment" class="btn py-3 px-4 btn-primary">
			  </div>

		  </form>
	  </div>
  </div>
  </section>
  <section class="ftco-section ftco-no-pt ftco-no-pb py-5 bg-light">
	  <div class="container py-4">
		  <div class="row d-flex justify-content-center py-5">
			  <div class="col-md-6">
				  <h2 style="font-size: 22px;" class="mb-0">Đăng Ký</h2>
				  <span>Nhận thông tin cập nhật qua email về các cửa hàng mới nhất và ưu đãi đặc biệt của chúng tôi</span>
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
					  <p>Chất lượng đi đôi với giá thành</p>
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
							  <li><a href="#" class="py-2 d-block">Thông tin vận chuyển</a></li>
							  <li><a href="#" class="py-2 d-block">Trả lại & Trao đổi</a></li>
							  <li><a href="#" class="py-2 d-block">Điều khoản & Các điều kiện</a></li>
							  <li><a href="#" class="py-2 d-block">Chính sách bảo mật</a></li>
						  </ul>
						  <ul class="list-unstyled">
							  <li><a href="#" class="py-2 d-block">Câu hỏi thường gặp</a></li>
							  <li><a href="#" class="py-2 d-block">Liên Hệ</a></li>
						  </ul>
					  </div>
				  </div>
			  </div>
			  <div class="col-md">
				  <div class="ftco-footer-widget mb-4">
					  <h2 class="ftco-heading-2">Câu hỏi của bạn?</h2>
					  <div class="block-23 mb-3">
						  <ul>
							  <li><span class="icon icon-map-marker"></span><span class="text">BUSAN-HÀN QUỐC</span>
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

  <script>
		$(document).ready(function(){

		var quantitiy=0;
		   $('.quantity-right-plus').click(function(e){
		        
		        // Stop acting like a button
		        e.preventDefault();
		        // Get the field name
		        var quantity = parseInt($('#quantity').val());
		        
		        // If is not undefined
		            
		            $('#quantity').val(quantity + 1);

		          
		            // Increment
		        
		    });

		     $('.quantity-left-minus').click(function(e){
		        // Stop acting like a button
		        e.preventDefault();
		        // Get the field name
		        var quantity = parseInt($('#quantity').val());
		        
		        // If is not undefined
		      
		            // Increment
		            if(quantity>0){
		            $('#quantity').val(quantity - 1);
		            }
		    });
		    
		});
	</script>
    
  </body>
</html>