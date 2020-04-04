<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!--slider-->
<link href="css/slider.css" rel="stylesheet" type="text/css" media="all"/>
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="js/jquery.nivo.slider.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
</head>
<!------ Include the above in your HEAD tag ---------->
<html>

   <body background="pet2.jpg">


	
<div class="header">	
  <div class="wrap">
	<div class="header-top">
			<div class="cssmenu">
				<ul>
				   <li><a href="homePath"><span>Home</span></a></li>
				   <li><a href="about.html"><span>About us</span></a></li>
				   <li class="has-sub"><a href="services.html"><span>Services</span></a></li>
				   <li><a href="gallery.html"><span>Gallery</span></a></li>
				   <li class="last"><a href="contact.html"><span>Contact</span></a></li>
				 	<div class="clear"></div>
				 </ul>
	          </div>
	          </div>
	          </div>
	          </div>
	       
<div class="container">
 <div class="row">
   <h2>Login Here (Admin or Doctor or Owner)</h2>
   
 
 </div>
</div>
	
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">


					<hr>

					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
								<form id="login-form" action="petloginPath" method="get"
									role="form" style="display: block;">
									<div class="form-group">
										<input type="text" name="id" id="username" tabindex="1"
											class="form-control" placeholder="Id" value="">
									</div>
									<div class="form-group">
										<input type="password" name="password" id="password"
											tabindex="2" class="form-control" placeholder="Password">
									</div>
									<div class="form-group text-center">
										<input type="checkbox" tabindex="3" class="" name="remember"
											id="remember"> <label for="remember">
											Remember Me</label>
									</div>
									<div class="form-group">
										<div class="row">
											<div class="col-sm-6 col-sm-offset-3">
												<input type="submit" name="login-submit" id="login-submit"
													tabindex="4" class="form-control btn btn-login"
													value="Log In">
											</div>
										</div>
									</div>
									<h4>
										<font color='red'>${requestScope.error}</font>
									</h4>
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<div class="text-center">
													<a href="https://phpoll.com/recover" tabindex="5"
														class="forgot-password">Forgot Password?</a>
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
	  <div class="main">
		<div class="wrap">
			<div class="about-top">
				<div class="about">
					<div class="heading4">
				 	<h2>Our Gallery</h2>
				</div>
				<div class="section group">
					<div class="grid_1_of_4 images_1_of_4">
						<a href="images/t-pic16.jpg" class="swipebox" title="Image Title"> <img src="images/pic16.jpg" alt=""><span class="zoom-icon"></span> </a>
						<h4>Aenean nonummy hendrerit</h4>
						<p>Praesent vestibulum molestie lacus. Aenean nonummy hendrerit mauris. Phasellus porta hendrerit mauris..</p>
						<a href="#" class="link">Read More</a>
					</div>
					<div class="grid_1_of_4 images_1_of_4">
						<a href="images/t-pic17.jpg" class="swipebox" title="Image Title"> <img src="images/pic17.jpg" alt=""><span class="zoom-icon"></span> </a>
						<h4>Aenean nonummy hendrerit</h4>
						<p>Praesent vestibulum molestie lacus. Aenean nonummy hendrerit mauris. Phasellus porta hendrerit mauris..</p>
						<a href="#" class="link">Read More</a>
					</div>
					<div class="grid_1_of_4 images_1_of_4">
						<a href="images/t-pic18.jpg" class="swipebox" title="Image Title"> <img src="images/pic18.jpg" alt=""><span class="zoom-icon"></span> </a>
						<h4>Aenean nonummy hendrerit</h4>
						<p>Praesent vestibulum molestie lacus. Aenean nonummy hendrerit mauris. Phasellus porta hendrerit mauris..</p>
						<a href="#" class="link">Read More</a>
					</div>
					<div class="grid_1_of_4 images_1_of_4">
						<a href="images/t-pic19.jpg" class="swipebox" title="Image Title"> <img src="images/pic19.jpg" alt=""><span class="zoom-icon"></span> </a>
						<h4>Aenean nonummy hendrerit</h4>
						<p>Praesent vestibulum molestie lacus. Aenean nonummy hendrerit mauris. Phasellus porta hendrerit mauris..</p>
						<a href="#" class="link">Read More</a>
					</div>
					<div class="clear"></div> 
		   		</div>
		   		<div class="section group">
					<div class="grid_1_of_4 images_1_of_4">
						<a href="images/t-pic20.jpg" class="swipebox" title="Image Title"> <img src="images/pic20.jpg" alt=""><span class="zoom-icon"></span> </a>
						<h4>Aenean nonummy hendrerit</h4>
						<p>Praesent vestibulum molestie lacus. Aenean nonummy hendrerit mauris. Phasellus porta hendrerit mauris..</p>
						<a href="#" class="link">Read More</a>
					</div>
					<div class="grid_1_of_4 images_1_of_4">
						<a href="images/t-pic21.jpg" class="swipebox" title="Image Title"> <img src="images/pic21.jpg" alt=""><span class="zoom-icon"></span> </a>
						<h4>Aenean nonummy hendrerit</h4>
						<p>Praesent vestibulum molestie lacus. Aenean nonummy hendrerit mauris. Phasellus porta hendrerit mauris..</p>
						<a href="#" class="link">Read More</a>
					</div>
					<div class="grid_1_of_4 images_1_of_4">
						<a href="images/t-pic22.jpg" class="swipebox" title="Image Title"> <img src="images/pic22.jpg" alt=""><span class="zoom-icon"></span> </a>
						<h4>Aenean nonummy hendrerit</h4>
						<p>Praesent vestibulum molestie lacus. Aenean nonummy hendrerit mauris. Phasellus porta hendrerit mauris..</p>
						<a href="#" class="link">Read More</a>
					</div>
					<div class="grid_1_of_4 images_1_of_4">
						<a href="images/t-pic23.jpg" class="swipebox" title="Image Title"> <img src="images/pic23.jpg" alt=""><span class="zoom-icon"></span> </a>
						<h4>Aenean nonummy hendrerit</h4>
						<p>Praesent vestibulum molestie lacus. Aenean nonummy hendrerit mauris. Phasellus porta hendrerit mauris..</p>
						<a href="#" class="link">Read More</a>
					</div>
					<div class="clear"></div> 
		   		</div>
			</div>
		</div>
	  </div>
	</div>
	<div class="footer">
		<div class="wrap">
		    <div class="footer-top">
				<div class="col_1_of_4 span_1_of_4">
					<h3>INFORMATION</h3>
					<ul class="first">
						<li><a href="#">Contact</a></li>
						<li><a href="#">Terms and conditions</a></li>
						<li><a href="#">Legal Notice</a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h3>CATEGORIES</h3>
					<ul class="first">
						<li><a href="#">New products</a></li>
						<li><a href="#">top sellers</a></li>
						<li><a href="#">Specials</a></li>
					</ul>
				</div>
				<div class="col_1_of_4 span_1_of_4">
					<h3>My ACCOUNT</h3>
					<ul class="first">
						<li><a href="#">Your Account</a></li>
						<li><a href="#">Personal info</a></li>
						<li><a href="#">Prices</a></li>
				    </ul>
				</div>
				<div class="col_1_of_4 span_1_of_4 footer-lastgrid">
					<h3>CONTACT US</h3>
					<ul class="follow_icon">
						<li><a href="#"><img src="images/fb.png" alt=""></a></li>
						<li><a href="#"><img src="images/rss.png" alt=""></a></li>
						<li><a href="#"><img src="images/tw.png" alt=""></a></li>
						<li><a href="#"><img src="images/g+.png" alt=""></a></li>
					</ul>
			    </div>
				<div class="clear"></div> 
		  </div>
		<div class="copy">
			<p>Design by <a href="#">Nyein Yadanar Tun</a></p>
		</div>
	</div>
</div>
</body>
</html>