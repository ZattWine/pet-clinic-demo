<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>



  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!--slider-->
<link href="css/slider.css" rel="stylesheet" type="text/css" media="all"/>
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="js/jquery.nivo.slider.js"></script>
</head>
<body>
<div class="wrap-box"> </div> 	
<div class="header">	
  <div class="wrap">
	<div class="header-top">

<div class="cssmenu">
				<ul>
				   
			   <li><a href="checkappointmentPath?appointment=1">Check Appointment</a></li>
				   <li><a href="checkspeciesPath?species=1">All Species</a></li>
				  
				   <li><a href="checkSchedulePath">Schedule</a></li>
				    <li><a href="logoutPath">Logout</a></li>
				 	
				 </ul>
	          </div>
<div class="container">
 <div class="row">
   <h2>Left side Navigation bar (Fixed)</h2>
   
   <p>Left side Navigation</p>
 </div>
</div>

</div>
</div>
</div>
<c:if test="${appointment==1}">
<table  class="table table-striped">
<tr><th>Appointment Id</th><th>Owner Id</th><th>Appointment Date</th><th>Appointment Time</th></tr>
<c:forEach var="p" items="${appointmentList.appList }">

<tr>
<td>${p.appId }</td>
<td>${p.ownerId}</td>
<td>${p.appDate}</td>
<td>${p.appTime}</td>
</tr>

</c:forEach>
</table>
</c:if>
<c:if test="${schedule==1}">
<table  class="table table-striped">
<tr><th>Schedule Id</th><th>Day Name</th><th>Start Time</th><th>End Time</th><th>Doctor Id</th></tr>

<c:forEach var="p" items="${scheduleList.scheduleList }">

<tr>
<td>${p.scheduleId}</td>
<td>${p.dayName}</td>
<td>${p.startTime}</td>
<td>${p.endTime}</td>
<td>${p.doctorId}</td>

</tr>

</c:forEach>
</table>
</c:if>
<c:if test="${species==1}">
<table  class="table table-striped">
<tr><th>Species Id</th><th>Species Name</th></tr>
<c:forEach var="p" items="${speciesList.speciesName }">

<tr>
<td>${p.speciesId}</td>
<td>${p.speciesName}</td>

</tr>

</c:forEach>
</table>
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