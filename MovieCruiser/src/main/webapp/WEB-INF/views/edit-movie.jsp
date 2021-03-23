<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Movie Cruiser</title>
<link rel="icon" type="image/ico" href="./images/logo.png" />
<link rel="stylesheet" type="text/css" href="./style/style.css">
<script src="./js/script.js"></script>
</head>
<body class="xyz">
	<header>
		<span class="header-title">Movie Cruiser</span> <img
			class="header-logo" src="./images/logo.png" alt="Movie Cruiser Logo"></img>
		<nav>
			<a class="nav-link" href="/movie">Movies</a>
		</nav>
	</header>
	<article>
		<h2 class="article-heading">Edit Movie</h2>
		<form:form name="editMovieForm" 
			action="/editstatus" method="get" modelAttribute="movie"> <!-- onsubmit="return validateForm();" -->
			<table class="form-table">
				<tr>
				<form:hidden path="id"  />  
					<td colspan="4"><label class="form-item" for="field-title">Title</label>
						<form:input path="title" class="form-input" type="text"
							name="title" id="field-title" />
						<p class="form-error-message" id="title-error"></p></td>
				</tr>
				<tr>
					<td><label class="form-item" for="field-boxOffice">Box
							Office ($)</label> <form:input path="boxOffice"
							class="form-input form-input-right" type="text" name="boxOffice"
							id="field-boxOffice"></form:input>
						<p class="form-error-message" id="boxOffice-error"></p></td>
					<th><label class="form-item" for="field-yes">Active</label><br>
						<form:radiobutton path="active" class="form-radiobutton"
							name="active" id="field-yes" value="Yes" /><label
						class="form-item" for="field-yes">Yes</label> <form:radiobutton
							path="active" class="form-radiobutton" name="active"
							id="field-no" value="No" /><label class="form-item"
						for="field-no">No</label></th>
						
						<!--  --> 
			
						
					<td><label class="form-item" for="field-dateOfLaunch">Date
							of Launch</label>
					    <form:input path="dateOfLaunch" class="form-input" type="text"
						name="dateOfLaunch" id="field-dateOfLaunch"
						placeholder="dd/mm/yyyy"></form:input>
						<p class="form-error-message" id="dateOfLaunch-error" />
					</td>
					<td>
					<label class="form-item" for="field-genre">Genre</label> 
					<!-- <select>
							<option value="select">--Select--</option>
							<option value="Science Fiction">Science Fiction</option>
							<option value="Superhero" selected>Superhero</option>
							<option value="Romance">Romance</option>
							<option value="Comedy">Comedy</option>
							<option value="Adventure">Adventure</option>
							<option value="Thriller">Thriller</option>
					</select>   -->
					<form:select path="genre" items="${genre}" class="form-input" name="genre" id="field-genre"/>
						<p class="form-error-message" id="genre-error"></p></td>
				</tr>
				<tr colspan=4>
					<td>
						<label class="form-item" for="field-hasTeaser">
					    <form:checkbox path="hasTeaser" class="form-checkbox" name="hasTeaser"
								id="field-hasTeaser" />
						Has Teaser
						</label>
						
					</td>
				</tr>
				<tr colspan=4>
				  <td>
					<input class="form-button" type="submit" name="submit"
						value="Save" />
				  </td>
				</tr>
			</table>
		</form:form>
	</article>
	<footer>
		<p>Copyright &copy; 2019</p>
	</footer>
</body>
</html>