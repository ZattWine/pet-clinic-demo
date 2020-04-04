<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!--slider-->
<link href="css/slider.css" rel="stylesheet" type="text/css" media="all"/>
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="js/jquery.nivo.slider.js"></script>
<script type="text/javascript">
    $(window).load(function() {
        $('#slider').nivoSlider();
    });
    </script>
</head>
<body>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="wrap-box"> </div> 	
<div class="header">	
  <div class="wrap">
	<div class="header-top">

<div class="cssmenu">
			<ul>
				   
			   <li><a href="appointmentPath">Make Appointment</a></li>
				   <li><a href="ownerregisterPath">Register Owner</a></li>
				   <li><a href="updatepetPath">Update Pet</a></li>
				   <li><a href="drugtimePath">Drug Time</a></li>
				 	
				 </ul>
	          </div>
	          </div>
	          </div>
	          </div>
<br><br>
<div class="container">
 <div class="row">
   <h2>Register( Pet )</h2>
   
   
 </div>
</div>
		<form action="petregisterPath" method="post"  enctype="multipart/form-data">
			<div
				style="background-color: #091927; height: 600px; width: 400px; border-radius: 30px; text-align: center;"
				class="col-md-offset-4">
				<h1 style="text-align: center; padding-top: 30px; color: #ffffff;">Register
					Pet</h1>
				
				<div class="col-sm-12" style="padding-top: 10px;">
					<input type="text" class="form-control" id="firstname"
						placeholder="Pet Id Number" name="id" style="border-radius: 15px;">
				</div>
				<div class="col-sm-12" style="padding-top: 10px;">
					<input type="text" class="form-control" id="lastname"
						placeholder=" Name" name="name" style="border-radius: 15px;">
				</div>
				<h3>
					<font color="white">Gender<input type="radio" name="gender"
						value="M">Male<input type="radio" name="gender" value="F">Female
					</font>
				</h3>
				<br>
				<div class="col-sm-12" style="padding-top: 10px;">
					<input type="text" class="form-control" id="email"
						placeholder="Enter Birth" name="birth"
						style="border-radius: 15px;">
				</div>
				<div class="col-sm-12" style="padding-top: 10px;">
					<input type="text" class="form-control" id="mobileno"
						placeholder="Enter Death" name="death"
						style="border-radius: 15px;">
				</div>
				<h3>
					<font color="white">Species Name</font><select name="species">
						<c:forEach var="p" items="${speciesList.speciesName}"
							varStatus="s">

							<option>${p.speciesName}-${p.speciesId}</option>
						</c:forEach>
					</select>
				</h3>
				
	
	Select your Pet Photo:<input type="file" name="frmFile"/><br>
	
				<h4>
					<font color='red'>${requestScope.error}</font>
				</h4>
				
				<br> <br>
				<div class="col-sm-12" style="padding-top: 10px;">
					<input type="submit" value="Submit">
				</div>
			</div>
		</form>
		  <div class="main">
		 <div class="wrap">
			<div class="about">
				<div class="about-top">
					<div class="col span_1_of_about">
							<h3>About</h3>
							<div class="about-img">
								<img src="images/pic8.jpg" alt="">
							</div>
							<div class="about-desc">
								<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.</p>
								<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate.,</p>
							</div>
							<div class="clear"></div>
					</div>
					<div class="col span_1_of_about1">
						<h3>Recent Comments</h3>
						<ul class="comments-custom unstyled">			
					      <li class="comments-custom_li">
								<div class="icon"></div>
								<div class="right-text">	
									<h4 class="comments-custom_h">admin:</h4>
										<div class="comments-custom_txt">
											<a href="#" title="Go to this comment">Sed ut perspiciatis magna ...</a>
										</div>
										<time>November 16,2013</time>
								</div>
								<div class="clear"></div>
							</li>
							<li class="comments-custom_li">
								<div class="icon"></div>
								<div class="right-text">	
									<h4 class="comments-custom_h">admin:</h4>
										<div class="comments-custom_txt">
											<a href="#" title="Go to this comment">Sed ut perspiciatis magna ...</a>
										</div>
										<time>November 16,2013</time>
								</div>
								<div class="clear"></div>
							</li>
							<li class="comments-custom_li">
								<div class="icon"></div>
								<div class="right-text">	
									<h4 class="comments-custom_h">admin:</h4>
										<div class="comments-custom_txt">
											<a href="#" title="Go to this comment">Sed ut perspiciatis magna ...</a>
										</div>
										<time>November 16,2013</time>
								</div>
								<div class="clear"></div>
							</li>
					     </ul>
				    </div>
					<div class="clear"></div>
			</div>
			<div class="about-bottom">
	   		       <div class="about-topgrids">
						<div class="about-topgrid1">
							<h3>Who We Are</h3>
							   <img src="images/pic9.jpg" title="name">
							   <h5>LOREM IPM DOLOR SIT AMET, CONSECTETUER ADIPISCING ELIT. PRAESENT VESTIBULUM.</h5>
							   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Praesent vestibulum molestie lacus. Aeonummy hendrerit mauris..</p>
							   <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Praesent vestibulum molestie lacus. Aeonummy hendrerit mauris.Lorem ipsum</p>
						</div>
				   </div>
								<div class="about-histore">
									<h3>History</h3>
									<div class="historey-lines">
										<ul>
											<li><span>2010 &nbsp;-</span></li>
											<li><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Praesent vestibulum molestie lacus. Aeonummy hendrerit..</p></li>
											<div class="clear"> </div>
										</ul>
									</div>
									<div class="historey-lines">
										<ul>
											<li><span>2010 &nbsp;-</span></li>
											<li><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Praesent vestibulum molestie lacus. Aeonummy hendreri.</p></li>
											<div class="clear"> </div>
										</ul>
									</div>
									<div class="historey-lines">
										<ul>
											<li><span>2010 &nbsp;-</span></li>
											<li><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Praesent vestibulum molestie lacus. Aeonummy hendreri..</p></li>
											<div class="clear"> </div>
										</ul>
									</div>
									<div class="historey-lines">
										<ul>
											<li><span>2010 &nbsp;-</span></li>
											<li><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Praesent vestibulum molestie lacus. Aeonummy hendrerit mauris. Phasellus porta. Fusce suscipit.</p></li>
											<div class="clear"> </div>
										</ul>
									</div>
								   <div class="clear"> </div>
								</div>
								<div class="about-services">
									<h3>Why Choose Us</h3>
									<div class="questions">
							          <h4><img src="images/marker2.png" alt=""/>&nbsp;What is Lorem Ipsum?</h4>
	        				          <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 150 Phasellus porta. Fusce suscipit.</p>
	        		                </div>
	        		                <div class="questions">
							          <h4><img src="images/marker2.png" alt=""/>&nbsp;What is Lorem Ipsum?</h4>
	        				          <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p>
	        		                </div>
	        		                <div class="questions">
							          <h4><img src="images/marker2.png" alt=""/>&nbsp;What is Lorem Ipsum?</h4>
	        				          <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry..</p>
	        		                </div>
							   </div>
						      <div class="clear"></div> 
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