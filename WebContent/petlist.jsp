<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	          </div><c:if test="${requestScope.frmcontrol!=1}">
<center>Pet List</center>
<font color="white">Pet Name</font><center>
<form action="petupdatePath" method="post">
<select name="pet">

	<c:forEach var="p" items="${petList.totalpetList}"
							varStatus="s">

							<option>${p.petName}-${p.petId}</option>
						</c:forEach>
					</select><br>
			<input type="submit" value="Update Pet">
		
</form></center>
		</c:if>
		<c:if test="${requestScope.frmcontrol==1}">	
		<h2>Update Pet</h2>
		


	<c:forEach var="p" items="${updatepetList.totalpetList}"
							varStatus="s">
<center>
<form action="selectpetupdatePath" method="get">
			<div
				style="background-color: #091927; height: 400px; width: 400px; border-radius: 30px; text-align: center;"
				class="col-md-offset-4">
				<h1 style="text-align: center; padding-top: 30px; color: #ffffff;">Update
					Pet</h1>

			<font color="white">Pet Name</font><div class="col-sm-12" style="padding-top: 10px;">
					<input type="text" class="form-control" id="id"
						 name="name" value="${p.petName}" style="border-radius: 15px;" required="required">
				</div>
			<font color="white">Pet Gender</font>	<div class="col-sm-12" style="padding-top: 10px;">
					<input type="text" class="form-control" id="firstname"
						 name="sex"  value="${p.petSex}" style="border-radius: 15px;"  required="required">
				</div>
				
				
			
				<br> <br>
				<div class="col-sm-12" style="padding-top: 10px;">
					<input type="submit" value="Update">&nbsp;&nbsp;&nbsp;
					
				</div>
			</div>
		</form></center>
		</c:forEach>
</c:if>
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