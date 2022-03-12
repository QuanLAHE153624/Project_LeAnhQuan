

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--Nav-->
<nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
    <div class="container">
        <a class="navbar-brand" href="home">Foody</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="oi oi-menu"></span> Menu
        </button>
        
        <div class="collapse navbar-collapse" id="ftco-nav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active "><a href="home" class="nav-link">Home</a></li>
                <li class="nav-item active "><a href="list" class="nav-link">Shop</a></li>
                <li class="nav-item active "><a href="about.jsp" class="nav-link">About</a></li>
                <li class="nav-item cta cta-colored"><a href="addtocart" class="nav-link"><span class="icon-shopping_cart"></span>Cart (${sessionScope.size})</a></li>


                <c:if test="${sessionScope.acc != null}">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">${sessionScope.acc.name}</a>
                        <div class="dropdown-menu" aria-labelledby="dropdown04"> 
                            <a class="dropdown-item" href="updateprofile?uid=${sessionScope.acc.id}">Profile Account</a>                         
                            <a class="dropdown-item" href="logout">Log out</a> 
                        </div>

                        <c:if test="${sessionScope.acc.isAdmin == 1}">
                            <div class="dropdown-menu" aria-labelledby="dropdown04">
                                <a class="dropdown-item" href="management">Management Product</a>   
                                <a class="dropdown-item" href="managementAcc">Management Account</a>  
                                <a class="dropdown-item" href="logout">Log out</a> 
                            </div>
                        </c:if>               
                    </li>
                </c:if>
                <c:if test="${sessionScope.acc == null}">
                    <li class="nav-item active"><a href="login" class="nav-link">Login</a></li>
                    </c:if>


            </ul>
        </div>
    </div>
</nav>
<!-- END nav -->

<section id="home-section" class="hero" style="margin-bottom: 5px ">
    <div class="home-slider owl-carousel">
        <div class="slider-item" style="background-image: url(images/bg_1.jpg);">
            <div class="overlay"></div>
            <div class="container">
                <div class="row slider-text justify-content-center align-items-center" data-scrollax-parent="true">



                </div>
            </div>
        </div>

        <div class="slider-item" style="background-image: url(images/bg_2.jpg);">
            <div class="overlay"></div>
            <div class="container">
                <div class="row slider-text justify-content-center align-items-center" data-scrollax-parent="true">

                    <div class="col-sm-12 ftco-animate text-center">
                        <h1 class="mb-2">100% Delicious &amp; Chinese Food</h1>
                        <h2 class="subheading mb-4">We deliver delicious food &amp; drinks</h2>
                        <p><a href="#" class="btn btn-primary">View Details</a></p>
                    </div>

                </div>
            </div>
        </div>
    </div>
</section>

