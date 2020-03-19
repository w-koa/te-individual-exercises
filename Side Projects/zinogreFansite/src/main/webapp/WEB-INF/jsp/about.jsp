<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<c:import url="/WEB-INF/jsp/common/header.jsp" />

<html>
<head>
<meta charset="ISO-8859-1">
<title>About Zinogre</title>
</head>
<div>
	<h1>About Zinogre</h1>
</div>
<div>
	<c:url var="zinogrePic" value="/images/zinogre.jpg" />
	<img class="responsive" src="${zinogrePic}" alt="zinogrePic">
</div>
<div>
	<h2>Some Quick Facts:</h2>
	<ul>
		<li>Zinogre made its first appearance in Monster Hunter 3 (2011)</li>
		<li>Zinogre is a fanged wyvern</li>
		<li>Zinogre's electricity actually comes from the fulgurbugs it
			attracts!</li>
	</ul>


</div>
<div>
	<div>
		<h2>Zinogre's Weaknesses</h2>
		<c:url var="weaknessPic" value="/images/zinogre_weakness.jpg" />
		<img id="weaknessPic" src="${weaknessPic}" alt="weaknesses">
	</div>
	<div>
		<table>
			<tr>
				<th>Part</th>
				<th>Sever</th>
				<th>Blunt</th>
				<th>Ranged</th>
				<th>Fire</th>
				<th>Water</th>
				<th>Thunder</th>
				<th>Ice</th>
				<th>Dragon</th>
				<th>Stun</th>
			</tr>
			<%-- commented out temporarily
			<c:forEach var="hitzoneData" items="${AllHitzoneData}">
			<tr>
				<td><c:out value="${hitzoneData.part}"/></td>
				<td><c:out value="${hitzoneData.sever}"/></td>
				<td><c:out value="${hitzoneData.blunt}"/></td>
				<td><c:out value="${hitzoneData.ranged}"/></td>
				<td><c:out value="${hitzoneData.fire}"/></td>
				<td><c:out value="${hitzoneData.water}"/></td>
				<td><c:out value="${hitzoneData.thunder}"/></td>
				<td><c:out value="${hitzoneData.ice}"/></td>
				<td><c:out value="${hitzoneData.dragon}"/></td>
				<td><c:out value="${hitzoneData.stun}"/></td>
			
			</tr>
			
			</c:forEach>
			 --%>
			<p>Credit to Kiranico for data</p>
		
		
		</table>
	
	
	</div>

</div>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />