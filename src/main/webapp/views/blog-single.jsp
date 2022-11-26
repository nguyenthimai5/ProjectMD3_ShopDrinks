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
    <div class="hero-wrap hero-bread" style="background-image: url(<%=request.getContextPath()%>/images/bgr778.jpg);">
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-9 ftco-animate text-center">
          	<p class="breadcrumbs"><span class="mr-2"><a href="<%=request.getContextPath()%>/index.jsp">Home</a></span> <span>Blog</span></p>
            <h1 class="mb-0 bread">Blog</h1>
          </div>
        </div>
      </div>
    </div>

    <section class="ftco-section ftco-degree-bg">
      <div class="container">
        <div class="row">
          <div class="col-lg-8 ftco-animate">
						<h2 class="mb-3">Đồ uống tốt cho sức khỏe</h2>
            <p>Điều quan trọng là đảm bảo sức khỏe .Tuyển chọn các sản chất lượng hàng đầu</p>
            <p>
              <img src="<%=request.getContextPath()%>/images/bg33.jpg" alt="" class="img-fluid">
            </p>
            <p>Drinks luôn mong muốn nhận được nhưng phản hồi quý giá của quý khách hàng để có cơ hội hoàn thiện sản phẩm, dịch vụ hơn nữa. Những đóng góp của quý khách hàng luôn là tài sản vô giá đối với chúng tôi</p>
            <h2 class="mb-3 mt-5">#2.Sáng tạo</h2>
            <p>Qua những lần đóng góp ý kiến và sáng tạo của mọi người thì Drinks đã cải tạo đưa thương hiệu phát triển nhanh chóng trở thành một trong những điểm đến thân thuộc của các bạn trẻ yêu thích đồ uống.</p>
            <p>
              <img src="<%=request.getContextPath()%>/images/kem socola.jpg" alt="" class="img-fluid">
            </p>
            <p>
              Qua nhiều năm nỗ lực phát triển, Drinks đã trở nên phổ biến với khách hàng từ nhiều quốc gia và trở thành một trong những thương hiệu trà đáng tin cậy hàng đầu trên thế giới.
            </p>

<%--            <div class="pt-5 mt-5">--%>
<%--              <h3 class="mb-5">5 Comments</h3>--%>
<%--              <ul class="comment-list">--%>
<%--                <li class="comment">--%>
<%--                  <div class="vcard bio">--%>
<%--                    <img src="<%=request.getContextPath()%>/images/avt2.jpg" alt="Image placeholder">--%>
<%--                  </div>--%>
<%--                  <div class="comment-body">--%>
<%--                    <h3>John Doe</h3>--%>
<%--                    <div class="meta">June 27, 2018 at 2:21pm</div>--%>
<%--                    <p>Mới đặt mà ship nhanh quá trời</p>--%>
<%--                    <p><a href="#" class="reply">Reply</a></p>--%>
<%--                  </div>--%>
<%--                </li>--%>

<%--                <li class="comment">--%>
<%--                  <div class="vcard bio">--%>
<%--                    <img src="<%=request.getContextPath()%>/images/person_1.jpg" alt="Image placeholder">--%>
<%--                  </div>--%>
<%--                  <div class="comment-body">--%>
<%--                    <h3>John Doe</h3>--%>
<%--                    <div class="meta">June 27, 2018 at 2:29pm</div>--%>
<%--                    <p>Nước ngon cốc còn đẹp nữa chứ</p>--%>
<%--                    <p><a href="#" class="reply">Reply</a></p>--%>
<%--                  </div>--%>

<%--                  <ul class="children">--%>
<%--                    <li class="comment">--%>
<%--                      <div class="vcard bio">--%>
<%--                        <img src="<%=request.getContextPath()%>/images/avt55.jpg" alt="Image placeholder">--%>
<%--                      </div>--%>
<%--                      <div class="comment-body">--%>
<%--                        <h3>John Doe</h3>--%>
<%--                        <div class="meta">June 27, 2018 at 2:21pm</div>--%>
<%--                        <p>Mua nhiều lần rồi mà lần nào cũng chất lượng hết á</p>--%>
<%--                        <p><a href="#" class="reply">Reply</a></p>--%>
<%--                      </div>--%>


<%--                      <ul class="children">--%>
<%--                        <li class="comment">--%>
<%--                          <div class="vcard bio">--%>
<%--                            <img src="<%=request.getContextPath()%>/images/avt44.jpg" alt="Image placeholder">--%>
<%--                          </div>--%>
<%--                          <div class="comment-body">--%>
<%--                            <h3>John Doe</h3>--%>
<%--                            <div class="meta">June 27, 2018 at 2:21pm</div>--%>
<%--                            <p>Tuyệt!!!!!</p>--%>
<%--                            <p><a href="#" class="reply">Reply</a></p>--%>
<%--                          </div>--%>

<%--                            <ul class="children">--%>
<%--                              <li class="comment">--%>
<%--                                <div class="vcard bio">--%>
<%--                                  <img src="<%=request.getContextPath()%>/images/person_2.jpg" alt="Image placeholder">--%>
<%--                                </div>--%>
<%--                                <div class="comment-body">--%>
<%--                                  <h3>John Doe</h3>--%>
<%--                                  <div class="meta">June 27, 2018 at 2:21pm</div>--%>
<%--                                  <p>Đỉnh!</p>--%>
<%--                                  <p><a href="#" class="reply">Reply</a></p>--%>
<%--                                </div>--%>
<%--                              </li>--%>
<%--                            </ul>--%>
<%--                        </li>--%>
<%--                      </ul>--%>
<%--                    </li>--%>
<%--                  </ul>--%>
<%--                </li>--%>

<%--                <li class="comment">--%>
<%--                  <div class="vcard bio">--%>
<%--                    <img src="<%=request.getContextPath()%>/images/avt2.jpg" alt="Image placeholder">--%>
<%--                  </div>--%>
<%--                  <div class="comment-body">--%>
<%--                    <h3>Ngọc Hà</h3>--%>
<%--                    <div class="meta">June 27, 2018 at 6:45 pm</div>--%>
<%--                    <p>Dâu tây mùa này ngon quá đi^~^</p>--%>
<%--                    <p><a href="#" class="reply">Reply</a></p>--%>
<%--                  </div>--%>
<%--                </li>--%>
<%--              </ul>--%>
<%--              <!-- END comment-list -->--%>
<%--              --%>
<%--              <div class="comment-form-wrap pt-5">--%>
<%--                <h3 class="mb-5">Để lại bình luận</h3>--%>
<%--                <form action="#" class="p-5 bg-light">--%>
<%--                  <div class="form-group">--%>
<%--                    <label for="name">Name *</label>--%>
<%--                    <input type="text" class="form-control" id="name">--%>
<%--                  </div>--%>
<%--                  <div class="form-group">--%>
<%--                    <label for="email">Email *</label>--%>
<%--                    <input type="email" class="form-control" id="email">--%>
<%--                  </div>--%>
<%--                  <div class="form-group">--%>
<%--                    <label for="website">Website</label>--%>
<%--                    <input type="url" class="form-control" id="website">--%>
<%--                  </div>--%>

<%--                  <div class="form-group">--%>
<%--                    <label for="message">Message</label>--%>
<%--                    <textarea name="" id="message" cols="30" rows="10" class="form-control"></textarea>--%>
<%--                  </div>--%>
<%--                  <div class="form-group">--%>
<%--                    <input type="submit" value="Post Comment" class="btn py-3 px-4 btn-primary">--%>
<%--                  </div>--%>

<%--                </form>--%>
<%--              </div>--%>
<%--            </div>--%>
          </div> <!-- .col-md-8 -->
          <div class="col-lg-4 sidebar ftco-animate">
            <div class="sidebar-box">
              <form action="#" class="search-form">
                <div class="form-group">
                  <span class="icon ion-ios-search"></span>
                  <input type="text" class="form-control" placeholder="Search...">
                </div>
              </form>
            </div>
            <div class="sidebar-box ftco-animate">
            	<h3 class="heading">Thể loại</h3>
              <ul class="categories">
                <li><a href="#">Trà sữa <span>(12)</span></a></li>
                <li><a href="#">Kem <span>(22)</span></a></li>
                <li><a href="#">Đồ ăn vặt <span>(37)</span></a></li>
                <li><a href="#">Điểm tâm <span>(42)</span></a></li>
              </ul>
            </div>

            <div class="sidebar-box ftco-animate">
              <h3 class="heading">Blog gần đây</h3>
              <div class="block-21 mb-4 d-flex">
                <a class="blog-img mr-4" style="background-image: url(<%=request.getContextPath()%>/images/bgr.jpg);"></a>
                <div class="text">
                  <h3 class="heading-1"><a href="#">Even the all-powerful Pointing has no control about the blind texts</a></h3>
                  <div class="meta">
                    <div><a href="#"><span class="icon-calendar"></span> April 09, 2019</a></div>
                    <div><a href="#"><span class="icon-person"></span> Admin</a></div>
                    <div><a href="#"><span class="icon-chat"></span> 19</a></div>
                  </div>
                </div>
              </div>
              <div class="block-21 mb-4 d-flex">
                <a class="blog-img mr-4" style="background-image: url(<%=request.getContextPath()%>/images/backg.jpg);"></a>
                <div class="text">
                  <h3 class="heading-1"><a href="#">Nước táo tốt cho sức khỏe...</a></h3>
                  <div class="meta">
                    <div><a href="#"><span class="icon-calendar"></span> April 09, 2019</a></div>
                    <div><a href="#"><span class="icon-person"></span> Admin</a></div>
                    <div><a href="#"><span class="icon-chat"></span> 19</a></div>
                  </div>
                </div>
              </div>
              <div class="block-21 mb-4 d-flex">
                <a class="blog-img mr-4" style="background-image: url('<%=request.getContextPath()%>/images/nước hoa quả.jpg');"></a>
                <div class="text">
                  <h3 class="heading-1"><a href="#">Nước hoa quả phù hợp cho những ngày nóng oi bức..</a></h3>
                  <div class="meta">
                    <div><a href="#"><span class="icon-calendar"></span> July 09, 2019</a></div>
                    <div><a href="#"><span class="icon-person"></span> Admin</a></div>
                    <div><a href="#"><span class="icon-chat"></span> 19</a></div>
                  </div>
                </div>
              </div>
            </div>

            <div class="sidebar-box ftco-animate">
              <h3 class="heading">Lựa chọn khác</h3>
              <div class="tagcloud">
                <a href="#" class="tag-cloud-link">
                  hoa quả</a>
                <a href="#" class="tag-cloud-link">nho</a>
                <a href="#" class="tag-cloud-link">đào</a>
                <a href="#" class="tag-cloud-link">táo</a>
                <a href="#" class="tag-cloud-link">cà rốt</a>
                <a href="#" class="tag-cloud-link">cam</a>
              </div>
            </div>
          </div>

        </div>
      </div>
    </section> <!-- .section -->

    <footer class="ftco-footer ftco-section bg-light">
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
    
  </body>
</html>