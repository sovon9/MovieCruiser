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
</head>
<body>
	<header>
		<span class="header-title">Movie Cruiser</span> <img
			class="header-logo" src="./images/logo.png" alt="Movie Cruiser Logo"></img>
		<nav>
			<a class="nav-link" href="/movie">Movies</a>
		</nav>
	</header>
	<article>
		<h2 class="article-heading">Movies</h2>
		<table>
			<tr>
				<th class="col-left">Title</th>
				<th class="col-right">Box Office</th>
				<th>Active</th>
				<th>Date of Launch</th>
				<th>Genre</th>
				<th>Has Teaser</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${ movieList }" var="mlist">
			<tr>
				<td class="col-left">${ mlist.getTitle() }</td>
				<td class="col-right">$${ mlist.getBoxOffice() }</td>
				<td>${ mlist.isActive() }</td>
				<td>${ mlist.getDateOfLaunch() }</td>
				<td>${ mlist.getGenre() }</td>
				<td>${ mlist.isHasTeaser() }</td>
				<td><a class="action-link" href="./edit-movie?title=${ mlist.getTitle() }">Edit</a></td>
			</tr>
			</c:forEach>
		</table>
	</article>
	<footer>
		<p>Copyright &copy; 2019</p>
	</footer>
</body>

</html>