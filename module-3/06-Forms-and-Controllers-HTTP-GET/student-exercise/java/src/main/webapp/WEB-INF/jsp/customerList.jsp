<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Customers List" />

<%@include file="common/header.jspf"%>

<c:url var="formAction" value="/customerSearchResults" />
<form class="formContainer" method="GET" action="${formAction}">
	<div class="formInputGroup">
		<input class="form-control" type="text" name="search" id="customerSearch"
			placeholder="Search" />
	</div>
	<div class="formInputGroup">
		<label>Sort</label> <select class="form-control" name="sort" id="sort">
			<option value="last_name">Last Name</option>
			<option value="email">Email</option>
			<option value="activebool">Active</option>
		</select>
	</div>
	<input class="btn btn-default" type="submit" value="Submit" />

</form>
<table class="table">
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Active</th>
	</tr>
	<c:forEach var="customer" items="${customers}">
		<tr>
			<td>${customer.firstName} ${customer.lastName}</td>
			<td>${customer.email}</td>
			<c:if test="${customer.active == true}">
				<c:set var="active" value="Yes" />
			</c:if>
			<td>${active}</td>
		</tr>
	</c:forEach>


</table>










<%@include file="common/footer.jspf"%>