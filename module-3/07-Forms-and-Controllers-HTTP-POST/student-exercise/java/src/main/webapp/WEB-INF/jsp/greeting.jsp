<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<c:url value="/css/site.css" var="cssHref" />
<link rel="stylesheet" href="${cssHref}">
<title>Squirrel Cigar Party!</title>
</head>
<body>
	<div class="headerText">
		<h1>
			Hello,
			<c:out value="${param.name}" />
			Welcome to Squirrel Cigar Party for Dummies!
		</h1>
		<h2>By Craig Castelaz</h2>
	</div>
	<c:url var="dummiesPic" value="/etc/forDummies.png" />
	<img class = "center" src="${dummiesPic}" alt="Squirrel party Dummies" />

	<div class="reviewHeader">
		<h3>Did you love Squirrel Cigar Party for Dummies?!</h3>
		<h3>Leave a review!</h3>
	</div>
	<div class="form">
		<c:url var="reviewSubmit" value="/reviewInput" />
		<form class="formContainer" action="${reviewSubmit}" method="POST">
			<div class="formInputGroup">
				<label for="userName">User Name:</label> <input class="form-control"
					type="text" name="username" id="userName" />
			</div>
			<div class="formInputGroup">
				<label for="rating">Rating:</label> <select class="form-control"
					name="rating" id="rating">
					<option value="1">1 Star</option>
					<option value="2">2 Stars</option>
					<option value="3">3 Stars</option>
					<option value="4">4 Stars</option>
					<option value="5">5 Stars</option>
				</select>
			</div>
			<div class="formInputGroup">
				<label for="reviewTitle">Review Title:</label> <input
					class="form-control" type="text" name="title"
					id="reviewTitle" />
			</div>
			<div class="formInputGroup">
				<label for="Review Text">Review:</label>
				<textarea class="form-control" name="reviewText" id="reviewText"
					cols="50" rows="10">
				</textarea>
			</div>
			<input class="btn btn-default" type="submit" value = "Submit Review!"/>
		</form>



	</div>

	<div class="reviewSection">
		<h2>Other People who loved Squirrel Cigar Party for Dummies!</h2>

		<c:url var="starPic" value="/etc/star.png" />
		<c:forEach var="review" items="${reviews}">
			<div class="reviewContainer">
				<div class="reviewBlock">
					<h3>
						<strong><c:out value="${review.title}" /></strong>
					</h3>

					<c:out value=" ${review.username} at ${review.dateSubmitted}" />
				</div>
				<div class="reviewBlock">
					<c:forEach begin="1" end="${review.rating}">
						<img src="${starPic}" alt="star" />
					</c:forEach>
				</div>
				<div class="reviewBlock">
					<p>${review.text}</p>

				</div>
			</div>
		</c:forEach>

	</div>

</body>
</html>