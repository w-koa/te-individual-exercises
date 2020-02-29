<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Product Details" />
</c:import>

<!-- Container for the Product -->
<!-- The current product is available using the `product` variable -->



<div id="product-detail">


	<img
		src="<c:url value="/images/product-images/${product.imageName}" />" />
	<%-- Top seller banner is impossible with current CSS!
	
	<c:if test="${product.topSeller == true}">
		<span class="banner top-seller">Top Seller!</span>
	</c:if>
	 --%>
	<div class="product-description">
		<h3>
			<c:out value="${product.name}" />
		</h3>

		<!-- .filled will make the star solid -->
		<div class="rating">
			<c:forEach begin="1" end="${product.averageRating}">
				<span class="filled">&#9734;</span>
			</c:forEach>
			<c:forEach begin="${product.averageRating}" end="4">
				<span>&#9734;</span>
			</c:forEach>
		</div>

		<!-- Include this if the product has a Remaining Stock of 5 or less -->
		<c:if
			test="${product.remainingStock <= 5 && product.remainingStock > 0}">
			<p class="alert-remaining">BUY NOW! Only
				${product.remainingStock} left!</p>
		</c:if>

		<p class="description">${product.description}</p>
		<p class="price">
			<fmt:formatNumber type="currency" minFractionDigits="2"
				value="${product.price}" />
		</p>

		<!-- If item is in stock -->
		<c:if test="${product.remainingStock > 0}">
			<button class="action">Add to Cart</button>
		</c:if>
		<!-- OR if item is out of stock -->
		<c:if test="${product.remainingStock == 0}">
			<button disabled>Sold Out</button>
		</c:if>
		<!--<button disabled>Sold Out</button>-->
	</div>
</div>



<%--
<div id="product-detail">
	<img src="<c:url value="/images/product-images/grey-sofa.jpg" />" />
	<div class="product-description">
		<h3>Grey Sofa</h3>

		<!-- .filled will make the star solid -->
		<div class="rating">
			<span class="filled">&#9734;</span> <span class="filled">&#9734;</span>
			<span>&#9734;</span> <span>&#9734;</span> <span>&#9734;</span>
		</div>

		<!-- Include this if the product has a Remaining Stock of 5 or less -->
		<p class="alert-remaining">BUY NOW! Only 4 left!</p>
		<p class="description">Large four seater grey sofa.</p>
		<p class="price">$939.00</p>

		<!-- If item is in stock -->
		<button class="action">Add to Cart</button>
		<!-- OR if item is out of stock -->
		<!--<button disabled>Sold Out</button>-->
	</div>
</div>
 --%>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
