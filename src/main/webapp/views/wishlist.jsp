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
	  <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/animate.css">
    
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/owl.carousel.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/owl.theme.default.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/magnific-popup.css">
	  <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
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

    <div class="hero-wrap hero-bread" style="background-image: url(<%=request.getContextPath()%>/images/bgr66.jpg);">
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-9 ftco-animate text-center">
          	<p class="breadcrumbs"><span class="mr-2"><a href="<%=request.getContextPath()%>/index.jsp">Home</a></span> <span>Wishlist</span></p>
            <h1 class="mb-0 bread">My Wishlist</h1>
          </div>
        </div>
      </div>
    </div>

    <section class="ftco-section ftco-cart">
			<div class="container">
				<div class="row">
    			<div class="col-md-12 ftco-animate">
    				<div class="cart-list">
	    				<table class="table">
						    <thead class="thead-primary">
						      <tr class="text-center">
						        <th>&nbsp;</th>
						        <th>Product List</th>
						        <th>&nbsp;</th>
						        <th>Price</th>
								  <th>AddCart</th>

						      </tr>
						    </thead>
						    <tbody>
						      <tr class="text-center">
						        <td class="product-remove"><a href="#"><span class="ion-ios-close"></span></a></td>
						        
						        <td class="image-prod"><div class="img" style="background-image:url('<%=request.getContextPath()%>/images/n?????c ????o.jpg');"></div></td>
						        
						        <td class="product-name">
									<a href="<%=request.getContextPath()%>/views/product-single.jsp"><h3>N?????c ????o </h3></a>
						        	<p>C?? v??? thanh m??t ng???n nh??? </p>
						        </td>
						        
						        <td class="price">$7.60</td>
						        

								  <td class="addcart" ><a href="<%=request.getContextPath()%>/views/cart.jsp"><button style="border-radius: 1px" width="30px" height="10px" >Add Cart</button></a></td>


							  </tr><!-- END TR-->

						      <tr class="text-center">
						        <td class="product-remove"><a href="#"><span class="ion-ios-close"></span></a></td>
						        
						        <td class="image-prod"><div class="img" style="background-image:url('<%=request.getContextPath()%>/images/tr?? v???i.jpg');"></div></td>
						        
						        <td class="product-name">
									<a href="<%=request.getContextPath()%>/views/product-single.jsp"><h3>Tr?? V???i</h3></a>
						        	<p>
										Tr?? v???i hoa h???ng l?? s??? k???t h???p ho??n h???o c???a tr?? xanh hoa nh??i ????i Loan ?????m v???, c??ng m???t v???i hoa h???ng d???u d??ng th??m ng???t t???o n??n th??? th???c u???ng quy???n r?? ?????y t????i m??t. Topping v???i ng??m chua ng???t h???p d???n g??p ph???n ho??n thi???n h????ng v??? tuy???t h???o c???a m??n tr??. Th?????ng th???c m???t c???c tr?? v???i hoa h???ng m??t l???nh ch???c ch???n s??? l?? m???t s??? l???a ch???n ho??n h???o, gi??p xua tan ??i c??i n??ng oi ??? c???a ti???t tr???i m??a h??.</p>
						        </td>
						        
						        <td class="price">$15.70</td>
						        


								  <td class="addcart" ><a href="<%=request.getContextPath()%>/views/cart.jsp"><button style="border-radius: 1px" width="30px" height="10px" >Add Cart</button></a></td>

						      </tr><!-- END TR-->

						      <tr class="text-center">
						        <td class="product-remove"><a href="#"><span class="ion-ios-close"></span></a></td>
						        
						        <td class="image-prod"><div class="img" style="background-image:url('<%=request.getContextPath()%>/images/n?????c d???a.jpg');"></div></td>
						        
						        <td class="product-name">
									<a href="<%=request.getContextPath()%>/views/product-single.jsp"><h3>N?????c D???a</h3></a>
						        	<p>N?????c d???a l?? ch???t l???ng, trong, ch???a trong qu??? d???a. Khi qu??? d???a gi?? ??i, n?????c d???a ???????c thay th??? b???i c??i d???a v?? kh??ng kh??. Qu??? d???a non ch???a r???t ??t c??i d???a, v?? l???p c??i n??y m???ng, r???t m???m v?? kh?? trong. N?????c d???a ???????c d??ng l??m ????? u???ng ph??? bi???n ??? c??c n?????c nhi???t ?????i, ?????c bi???t l?? v??ng ????ng Nam ??, c??c ?????o Th??i B??nh D????ng v?? Caribe.
									</p>
						        </td>
						        
						        <td class="price">$10.60</td>
						        

								  <td class="addcart" ><a href="<%=request.getContextPath()%>/views/cart.jsp"><button style="border-radius: 1px" width="30px" height="10px" >Add Cart</button></a></td>


							  </tr><!-- END TR-->

						      <tr class="text-center">
						        <td class="product-remove"><a href="#"><span class="ion-ios-close"></span></a></td>
						        
						        <td class="image-prod"><div class="img" style="background-image:url('<%=request.getContextPath()%>/images/n?????c ??p d??a h???u.jpg');"></div></td>
						        
						        <td class="product-name">
									<a href="<%=request.getContextPath()%>/views/product-single.jsp"><h3>N?????c ??p d??a h???u</h3></a>
						        	<p>N??????c e??p d??a h????u ch????a kha?? nhi????u vitamin A co?? kha?? n??ng ch????ng la??i nhi????u ta??c ha??i t???? a??nh n????ng m????t tr????i, ??i????u ti????t ????????c l??????ng d????u kh??ng c????n thi????t tr??n khu??n m????t va?? giu??p thu nho?? l???? ch??n l??ng, ch????ng la??o ho??a ???? da??? r???t c???n thi???t cho s??? ph??t tri???n c???a t???t c??? c??c m?? c??, k??? c??? da v?? t??c.</p>
						        </td>
						        
						        <td class="price">$13.50</td>
						        

								  <td class="addcart" ><a href="<%=request.getContextPath()%>/views/cart.jsp"><button style="border-radius: 1px" width="30px" height="10px" >Add Cart</button></a></td>


							  </tr><!-- END TR-->

						      <tr class="text-center">
						        <td class="product-remove"><a href="#"><span class="ion-ios-close"></span></a></td>
						        
						        <td class="image-prod"><div class="img" style="background-image:url(<%=request.getContextPath()%>/images/dualuoi.JPG);"></div></td>
						        
						        <td class="product-name">
									<a href="<%=request.getContextPath()%>/views/product-single.jsp"><h3>N?????c ??p d??a l?????i</h3></a>
						        	<p>N?????c ??p D??a l?????i  ???????c y??u th??ch kh??ng ch??? b???i c?? v??? ng???t thanh, m??t l???nh gi??p gi???i t???a c??n kh??t c???c hi???u qu??? m?? c??n ch???a nhi???u vitamin r???t t???t cho c?? th??? n???a ?????y</p>
						        </td>
						        
						        <td class="price">$20.90</td>
						        

								  <td class="addcart" ><a href="<%=request.getContextPath()%>/views/cart.jsp"><button style="border-radius: 1px" width="30px" height="10px" >Add Cart</button></a></td>


							  </tr><!-- END TR-->

						      <tr class="text-center">
						        <td class="product-remove"><a href="#"><span class="ion-ios-close"></span></a></td>
						        
						        <td class="image-prod"><div class="img" style="background-image:url(<%=request.getContextPath()%>/images/nuoc-ep-xoai.jpg);"></div></td>
						        
						        <td class="product-name">
									<a href="<%=request.getContextPath()%>/views/product-single.jsp"><h3>N?????c ??p xo??i</h3></a>

						        	<p>Xo??i ch???a ??t calo nh??ng ch???a nhi???u n?????c v?? ch???t x?? gi??p t??ng c?????ng s???c kh???e h??? ti??u h??a. Ti??u th??? th???c ph???m gi??u ch???t x?? c?? li??n quan ?????n vi???c c???i thi???n gi???m c??n.s</p>
						        </td>
						        
						        <td class="price">$16.70</td>
						        

								  <td class="addcart" ><a href="<%=request.getContextPath()%>/views/cart.jsp"><button style="border-radius: 1px" width="30px" height="10px" >Add Cart</button></a></td>

							  </tr><!-- END TR-->
						    </tbody>
						  </table>
					  </div>
    			</div>
    		</div>
			</div>
		</section>

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
						  <li><a href="<%=request.getContextPath()%>/views/shop.jsp" class="py-2 d-block">Shop</a></li>
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