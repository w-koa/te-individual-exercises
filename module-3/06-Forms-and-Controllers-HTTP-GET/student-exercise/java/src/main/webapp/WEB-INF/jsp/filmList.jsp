<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Films List" />

<%@include file="common/header.jspf"%>

<c:url var="formAction" value="/filmSearchResults" />

<form class="formContainer" method="GET" action="${formAction}">
	<div class="formInputGroup">
		<label>Minimum Length:</label> <input class="form-control" type="text"
			name="minLength" id="minLength" />
	</div>
	<div class="formInputGroup">

		<label>Maximum Length:</label> <input class="form-control" type="text"
			name="maxLength" id="maxLength" />
	</div>
	<div class="formInputGroup">
		<label>Genre</label> <select class="form-control" name="genre"
			id="genre">
			<%--
			I wish we could just loop it, but i guess i'll do this with copypasta
			<forEach var="category" items="categoryList">
			<option value="${category.name}">${category.name}</option>
			</forEach>
			Action
Animation
Children
Classics
Comedy
Documentary
Drama
Family
Foreign
Games
Horror
Music
New
Sci-Fi
Sports
Travel
			 --%>
			<option value="Animation">Animation</option>
			<option value="Children">Children</option>
			<option value="Classics">Classics</option>
			<option value="Comedy">Comedy</option>
			<option value="Documentary">Documentary</option>
			<option value="Drama">Drama</option>
			<option value="Family">Family</option>
			<option value="Foreign">Foreign</option>
			<option value="Games">Games</option>
			<option value="Horror">Horror</option>
			<option value="Music">Music</option>
			<option value="New">New</option>
			<option value="Sci-Fi">Sci-Fi</option>
			<option value="Sports">Sports</option>
			<option value="Travel">Travel</option>

		</select>
	</div>



	<input class="btn btn-default" type="submit" value="Submit" />
</form>

<div>
	<table class="table">
		<tr>
			<th>Title</th>
			<th>Description</th>
			<th>Release Year</th>
			<th>Length</th>
			<th>Rating</th>
		</tr>
		<c:forEach var="film" items="${matchingFilms}">
			<tr>
				<td><c:out value="${film.title}" /></td>
				<td>${film.description}</td>
				<td>${film.releaseYear}</td>
				<td>${film.length}</td>
				<td>${film.rating}</td>
			</tr>
		</c:forEach>

	</table>
</div>

<%@include file="common/footer.jspf"%>