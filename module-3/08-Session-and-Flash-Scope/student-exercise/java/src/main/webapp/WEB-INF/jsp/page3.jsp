<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorite Season" />
</c:import>

<c:url var="page3Input" value="/FavoriteThings/Page3" />

<form action="${page3Input}" method="POST">
	<label>What is your favorite season?</label>
	<div>
		<label><input class="radioButton" type="radio"
			name="favoriteSeason" value="Spring" checked>Spring</label>
	</div>
	<div>
		<label><input class="radioButton" type="radio"
			name="favoriteSeason" value="Summer">Summer</label>
	</div>
	<div>
		<label><input class="radioButton" type="radio"
			name="favoriteSeason" value="Fall">Fall</label>
	</div>
	<div>
		<label><input class="radioButton" type="radio"
			name="favoriteSeason" value="Winter">Winter</label>
	</div>
	<button type="submit">Next >>></button>
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />