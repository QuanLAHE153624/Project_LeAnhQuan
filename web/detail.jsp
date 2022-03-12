<%-- 
    Document   : product-single
    Created on : February 6, 2022, 8:41:29 PM
    Author     : cun
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Chinese-Foods&Drinks</title>
        <link rel="icon" href="images/logo.jpg">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
        <link rel="stylesheet" href="css/animate.css">

        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">
        <link rel="stylesheet" href="css/magnific-popup.css">

        <link rel="stylesheet" href="css/aos.css">

        <link rel="stylesheet" href="css/ionicons.min.css">

        <link rel="stylesheet" href="css/bootstrap-datepicker.css">
        <link rel="stylesheet" href="css/jquery.timepicker.css">


        <link rel="stylesheet" href="css/flaticon.css">
        <link rel="stylesheet" href="css/icomoon.css">
        <link rel="stylesheet" href="css/style.css">

    </head>
    <body class="goto-here">

        <div>
            <jsp:include page="header.jsp"/>
        </div>

        <section class="ftco-section">
            <div class="container">
                <div class="row">                   

                    <div class="main">
                        <div class="grid wide">
                            <div class="productInfo">
                                <div class="row">
                                    <p class="text-danger">${mess}</p>

                                    <div class="col-lg-6 mb-5 ftco-animate">
                                        <a href="${detail.image}" class="image-popup">
                                            <img src="${detail.image}" class="img-fluid" alt="Colorlib Template"></a>
                                    </div>

                                    <div class="col-lg-6 product-details pl-md-5 ftco-animate">
                                        <h3 style="color: #88ac44;">${detail.name}</h3>
                                        <div class="rating d-flex">
                                            <p class="text-left mr-4">
                                                <a href="#" class="mr-2">${detail.quantity} <span style="color: #bbb;">Available</span></a>


                                            </p>
                                            <p class="text-left mr-4">
                                                <a href="#" class="mr-2" style="color: #88ac44;">100 <span style="color: #bbb;">Rating</span></a>
                                            </p>
                                            <p class="text-left">
                                                <a href="#" class="mr-2" style="color: #88ac44;">500 <span style="color: #bbb;">Sold</span></a>
                                            </p>
                                        </div>
                                        <p class="price"><span>$${detail.price}</span></p>
                                        <p>${detail.description}</p>

                                        <form name="f" action="addtocart"  method="post">
                                            <input type="hidden" name="id" value="">
                                            <div class="row mt-4">

                                                <div class="w-100"></div>
                                                <div class="input-group col-md-6 d-flex mb-3">
                                                    <span class="input-group-btn mr-2">
                                                        <button type="button" class="quantity-left-minus btn"  data-type="minus" data-field="" 
                                                                onClick="var result = document.getElementById('quantity');
                                                                        var quantity = result.value;
                                                                        if (quantity > 0) {
                                                                            result.value--;
                                                                            return false;

                                                                        }">
                                                            <i class="ion-ios-remove"></i>
                                                        </button>
                                                    </span>

                                                    <input type="text" id="quantity" name="num" class="form-control input-number" value="1"  >

                                                    <span class="input-group-btn ml-2">
                                                        <button type="button" class="quantity-right-plus btn"  data-type="plus"
                                                                data-field="" onClick="
                                                                   var result = document.getElementById('quantity');
                                                                        var quantity = result.value;
                                                                        if (${detail.quantity} > quantity ) {
                                                                            result.value++;
                                                                            return false;

                                                                        }">
                                                            <i class="ion-ios-add"></i>
                                                        </button>
                                                    </span>
                                                </div> 

                                                <div class="w-100"></div>
                                                <div class="col-md-12">
                                                    <c:if test="${detail.quantity <= 0}"><p style="color: #88ac44;">UnAvailable</p></c:if>
                                                    <c:if test="${detail.quantity > 0}"><p style="color: #88ac44;">Available</p></c:if>
                                                    </div>

                                                <c:if test="${detail.quantity <= 0}"><a href="home" class="btn btn-black py-3 px-5" >Add to Cart</a></c:if>
                                                <c:if test="${detail.quantity > 0}"><input  class="btn btn-black py-3 px-5" type="submit" onclick="buy('${detail.id}')" value="Add to Cart"/></c:if>


                                                </div>
                                            </form>
                                        </div>


                                    </div>
                                </div>
                                </section>

                                <section class="ftco-section">
                                    <div class="container">
                                        <div class="row justify-content-center mb-3 pb-3">
                                            <div class="col-md-12 heading-section text-center ftco-animate">
                                                <span class="subheading">Products</span>
                                                <h2 class="mb-4">Related Products</h2>
                                                <p>Far far away, behind the word mountains, far from the countries Chinese</p>
                                            </div>
                                        </div>   		
                                    </div>
                                    <div class="container">
                                        <div class="row">

                                        <c:forEach items="${requestScope.listP}" var="p">
                                            <div class="col-md-6 col-lg-3 ftco-animate">
                                                <div class="product">

                                                    <a href="detail?pid=${p.id}" class="img-prod">
                                                        <img class="img-fluid" src="${p.image}" alt="Colorlib Template">                         
                                                        <div class="overlay"></div>
                                                    </a>
                                                    <div class="text py-3 pb-4 px-3 text-center">
                                                        <h3><a href="detail?pid=${p.id}">${p.name}</a></h3>
                                                        <div class="d-flex">
                                                            <div class="pricing">
                                                                <p class="price"><span>$${p.price}</span></p>
                                                            </div>
                                                        </div>

                                                        <div class="bottom-area d-flex px-3">
                                                            <div class="m-auto d-flex">                                
                                                                <a onclick="buy('${p.id}')"  class="add-to-cart d-flex justify-content-center align-items-center text-center">
                                                                    <span><i class="ion-ios-cart"></i></span>
                                                                </a>                       
                                                            </div>
                                                        </div>

                                                    </div>
                                                </div>
                                            </div> 

                                        </c:forEach>
                                    </div>
                                </div>
                            </section>

                            <div>
                                <jsp:include page="footer.jsp"/>
                            </div>
                            <!-- loader -->
                            <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


                            <script src="js/jquery.min.js"></script>
                            <script src="js/jquery-migrate-3.0.1.min.js"></script>
                            <script src="js/popper.min.js"></script>
                            <script src="js/bootstrap.min.js"></script>
                            <script src="js/jquery.easing.1.3.js"></script>
                            <script src="js/jquery.waypoints.min.js"></script>
                            <script src="js/jquery.stellar.min.js"></script>
                            <script src="js/owl.carousel.min.js"></script>
                            <script src="js/jquery.magnific-popup.min.js"></script>
                            <script src="js/aos.js"></script>
                            <script src="js/jquery.animateNumber.min.js"></script>
                            <script src="js/bootstrap-datepicker.js"></script>
                            <script src="js/scrollax.min.js"></script>
                            <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
                            <script src="js/google-map.js"></script>
                            <script src="js/main.js"></script>

                            <script type="text/javascript">
                                                                    function buy(id) {
                                                                        var m = document.f.num.value;
                                                                        document.f.action = "addtocart?pid=" + id;
                                                                        document.f.submit();

                                                                    }

                            </script>

                            </body>
                            </html>
