<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Name List Example</title>
	</head>
	<body>
		<p>We are getting a list from Java called personList.</p>
		<style>
		table, th, td {
		padding: 10px;
		border: 1px solid;
		border-collapse: collapse;
		text-align: center;
		}
		
		
		</style>
		<table>
			<tr>
				<th>First</th>
				<th>Last</th>
				<th>Age</th>
				<th>Adult</th>
			</tr>
			
			<c:forEach var = "person" items = "${personList}">
			<tr>
				<td><c:out value="${person.firstName}"></c:out></td>
				<td><c:out value="${person.lastName}"></c:out></td>
				<td><c:out value="${person.age}"></c:out></td>
				<td><c:out value="${person.adult}"></c:out></td>
			</tr>
			
			
			</c:forEach>
		
		</table>
		
		
	</body>
</html>