<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="title" value="Favorites Summary" />
</c:import>

<body>

<p>Favorite Color: <c:out value="${favoriteThings.favoriteColor}"/></p>
<p>Favorite Food: <c:out value="${favoriteThings.favoriteFood}"/></p>
<p>Favorite Season: <c:out value="${favoriteThings.favoriteSeason}"/></p>

</body>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />