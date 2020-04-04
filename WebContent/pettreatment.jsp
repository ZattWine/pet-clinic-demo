<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!--slider-->
<link href="css/slider.css" rel="stylesheet" type="text/css" media="all"/>
<script type="text/javascript" src="js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="js/jquery.nivo.slider.js"></script>
</head>
<body background='pet2.jpg'>
	
<div class="wrap-box"> </div> 	
<div class="header">	
  <div class="wrap">
	<div class="header-top">

<div class="cssmenu">
				<ul>
				   
			   <li><a href="doctorupdatePath">Update Password</a></li>
				   <li><a href="pettreatmentPath">Pet Treatment Records</a></li>
				   <li><a href="pethistoryPath">Pet History</a></li>
				   <li class="last"><a href="logoutPath">Logout</a></li>
				 	<div class="clear"></div>
				 </ul>
	          </div>
	          </div>
	          </div>
	          </div>
<br><br><br>
<c:if test="${drug!=1}">
		<form action="petdrugPath" method="get">
			<div
				style="background-color: #091927; height: 600px; width: 400px; border-radius: 30px; text-align: center;"
				class="col-md-offset-4">
				<h1 style="text-align: center; padding-top: 30px; color: #ffffff;">Pet 
					Treatment Drug</h1>

				<div class="col-sm-12" style="padding-top: 10px;">
					<input type="text" class="form-control" id="id"
						placeholder=" Id" name="id" style="border-radius: 15px;"  required="required">
				</div>
					<div class="col-sm-12" style="padding-top: 10px;">
					<input type="text" class="form-control" id="id"
						placeholder="Drug Name" name="name" style="border-radius: 15px;"  required="required">
				</div>
				<div class="col-sm-12" style="padding-top: 10px;">
					<input type="number" class="form-control" id="id"
						placeholder="Drug Duration" name="duration" style="border-radius: 15px;"  required="required">
				</div>
			<font color="white">Duration Type:</font><select name="drugduration">
				<option>Day</option>
				<option>Month</option>
				<option>Year</option>
				</select><br>
				<font color="white">Drug Id:</font>
				<select name="drugid">
				<option>1</option>
				<option>2</option>
				<option>3</option>
				<option>4</option>
				<option>5</option>
				</select>
				<div class="col-sm-12" style="padding-top: 10px;">
					<input type="text" class="form-control" id="email"
						placeholder="Pet Id" name="petid"
						style="border-radius: 15px;"  required="required">
				</div>
				<div class="col-sm-12" style="padding-top: 10px;">
					<input type="text" class="form-control" id="email"
						placeholder="Doctor Id" name="doctorid"
						style="border-radius: 15px;"  required="required">
				</div>
				<div class="col-sm-12" style="padding-top: 10px;">
					<input type="date" class="form-control" id="mobileno"
						placeholder="Drug Date" name="drugdate"
						style="border-radius: 15px;"  required="required">
				</div>
				<div class="col-sm-12" style="padding-top: 10px;">
					<input type="date" class="form-control"
						placeholder="Drug Next Date" name="drugnextdate"
						style="border-radius: 15px;"  required="required">
				</div>
				<div class="col-sm-12" style="padding-top: 10px;">
					<textarea rows="5" columns="10"
						placeholder="Drug Description" name="drugdescription"></textarea>
				</div>
				<h4>
					<font color='red'>${requestScope.error}</font>
				</h4>
				<br> <br>
				<div class="col-sm-12" style="padding-top: 10px;">
					<input type="submit" value="Submit">&nbsp;&nbsp;&nbsp;
					
				</div>
			</div>
		</form>

	</c:if>
	<c:if test="${drug==1}">
	<table  class="table table-striped">
<tr><th>Id</th><th>Durg Date</th><th>Drug Description</th><th>Pet Id</th><th>Drug Id</th><th>Doctor Id</th></tr>
<c:forEach var="p" items="${drugList.drugList }">

<tr>
<td>${p.petdrugId}</td>
<td>${p.drugDate}</td>

<td>${p.drugDesc}</td>
<td>${p.petId}</td>
<td>${p.drugId}</td>
<td>${p.doctorId}</td>
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
	
</body>
</html>

