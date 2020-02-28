<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product List View" />
</c:import>

<div id="card-page">
	<c:import url="/WEB-INF/jsp/common/filters.jsp">
		<%-- Modify the baseRoute to apply filters to the current route. --%>
		<c:param name="baseRoute" value="#" />
	</c:import>

	<div class="main-content">
		<!-- Container for Sorting Choices
         
         Each link should take the user to this current page and use any combination of the following
         querystring parameters to sort the page:
            - sortOrder (string) - PriceLowToHigh,PriceHighToLow,RatingHighToLow
    	-->
		<div id="sorting-options">
			<h3>Sort By</h3>
			<ul>
				<li><a href="#">Price - Low to High</a></li>
				<li><a href="#">Price - High to Low</a></li>
				<li><a href="#">Rating - High to Low</a></li>
			</ul>
		</div>

		<!-- Container for all of the Products -->
		<!-- The list of products is available using the `products` variable -->
		<div id="grid">

			<!-- 
			The following HTML shows different examples of what HTML could be rendered based on different rules. 
			For purposes of demonstration we've written it out so you can see it when you load the page up. 
			-->


			<c:forEach var="product" items="${products}">

				<div class="tile ${soldOut}">
					<c:if
						test="${product.topSeller == true && product.remainingStock > 0 }">
						<span class="banner top-seller">Top Seller!</span>
					</c:if>
					<c:if test="${product.remainingStock == 0}">
						<span class="banner">Sold Out</span>
					</c:if>

					<!-- Link to the Detail page using the product id (e.g. products/detail?id=1) -->
					<a class="product-image" href="#"> <img
						src="<c:url value="/images/product-images/${product.imageName}" />" />
					</a>
					<div class="details">

						<p class="name">
							<c:out value="${product.name}" />
						</p>

						<!-- .filled will make the star solid -->
						<div class="rating">
							<c:forEach begin = "1" end = "${product.averageRating}">
								<span class="filled">&#9734;</span>
							</c:forEach>
							<c:forEach begin = "${product.averageRating}" end = "4">
								<span>&#9734;</span>
							</c:forEach>
							
						</div>
						<c:if test="${product.remainingStock <= 5 && product.remainingStock >= 1}">
							<span class="product-alert">Only ${product.remainingStock} left!</span>
						</c:if>
						<p class="price">
							<fmt:formatNumber type = "currency" minFractionDigits = "2" value = "${product.price}"/>
						</p>
					</div>
				</div>


			</c:forEach>

			
			
			
		</div>
	</div>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />