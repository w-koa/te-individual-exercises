<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Container for Filter Choices
        Each link should take the user to this current page and use any combination of the following
        querystring parameters to filter the page:
        - maxPrice (number)
        - minPrice (number)
        - minRating (number)
        - category (string) - Home, Apparel, Jewelry, Garden

        NOTE: A parameter is passed to this view that is called `baseRoute`. `baseRoute`
        refers to the page that the filters should be associated with. For instance, if you are on the products
        page, the value of the `baseRoute` should be the route for products and on the tiles page, should be the
        route for tiles.
        -->
<div id="filter-options">
	<h3>Refine By</h3>

	<c:url value="${baseRoute}" var="under25">
		<c:param name="minPrice" value="0" />
		<c:param name="maxPrice" value="25" />
	</c:url>

	<c:url value="${baseRoute}" var="filter25To50">
		<c:param name="minPrice" value="25" />
		<c:param name="maxPrice" value="50" />
	</c:url>

	<c:url value="${baseRoute}" var="filterAbove50">
		<c:param name="minPrice" value="50" />

	</c:url>
	<ul>
		<li><a href="${under25}">Under $25</a></li>
		<li><a href="${filter25To50}">$25 to $50</a></li>
		<li><a href="${filterAbove50}">$50 &amp; Above</a></li>
	</ul>
	<p>Avg. Review</p>
	<ul>
		<li><c:url value="${baseRoute}" var="filter4StarsUp">
				<c:param name="minRating" value="4" />
			</c:url> <a class="rating" href="${filter4StarsUp}"> <span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span> <span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span> <span>&#9734;</span> &amp; Up
		</a></li>
		<li><c:url value="${baseRoute}" var="filter3StarsUp">
				<c:param name="minRating" value="3" />
			</c:url> <a class="rating" href="${filter3StarsUp}"> <span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span> <span class="filled">&#9734;</span>
				<span>&#9734;</span> <span>&#9734;</span> &amp; Up
		</a></li>
		<li><c:url value="${baseRoute}" var="filter2StarsUp">
				<c:param name="minRating" value="2" />
			</c:url> <a class="rating" href="${filter2StarsUp}"> <span class="filled">&#9734;</span>
				<span class="filled">&#9734;</span> <span>&#9734;</span> <span>&#9734;</span>
				<span>&#9734;</span> &amp; Up
		</a></li>
		<li><c:url value="${baseRoute}" var="filter1StarsUp">
				<c:param name="minRating" value="1" />
			</c:url> <a class="rating" href="${filter1StarsUp}"> <span class="filled">&#9734;</span>
				<span>&#9734;</span> <span>&#9734;</span> <span>&#9734;</span> <span>&#9734;</span>
				&amp; Up
		</a></li>
	</ul>
	<p>Category</p>
	<ul>
		<c:url value="${baseRoute}" var="filterHome">
			<c:param name="category" value="Home" />
		</c:url>
		<li><a href="${filterHome}">Home</a></li>
		
		<c:url value="${baseRoute}" var="filterApparel">
			<c:param name="category" value="Apparel" />
		</c:url>
		<li><a href="${filterApparel}">Apparel</a></li>
		<c:url value="${baseRoute}" var="filterJewelry">
			<c:param name="category" value="Jewelry" />
		</c:url>
		<li><a href="${filterJewelry}">Jewelry</a></li>
		<c:url value="${baseRoute}" var="filterGarden">
			<c:param name="category" value="Garden" />
		</c:url>
		<li><a href="${filterGarden}">Garden</a></li>
	</ul>
</div>
