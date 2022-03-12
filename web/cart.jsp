<%-- 
    Document   : cart
    Created on : February 6, 2022, 9:20:27 PM
    Author     : cun
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Chinese-Foods&Drinks - Free Bootstrap 4 Template by Colorlib</title>
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

        <section class="ftco-section ftco-cart">

            <div class="container">
                <div class="row">
                    <div class="col-md-12 ftco-animate">
                        <div class="cart-list">
                            <a href="list" style="color: greenyellow; font-size: 50px;" >${mess}</a> 
                            <table class="table" width="60%">
                                <thead class="thead-primary">
                                    <tr class="text-center">
                                        <th>&nbsp;</th>
                                        <th>No</th>
                                        <th>Product name</th> 
                                        <th>Image</th>                                                                                 
                                        <th>Price</th>
                                        <th>Quantity</th>
                                        <th>Total</th>
                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:set value="${sessionScope.cart}" var="o"/>
                                    <c:set value="0" var="t"/>
                                    <c:forEach items="${o.items}" var="i">
                                        <c:set var="t" value="${t+1}"/>
                                        <tr class="text-center">

                                            <td class="product-remove">
                                                <form action="process" method="post">
                                                    <input type="hidden" name="id" value="${i.product.id}"/>
                                                    <input type="submit" value="X" style="background: white" />
                                                    
                                                </form>
                                            </td>
                                            
                                            <td class="no">${t}</td>

                                            <td class="product-name">
                                                <h3>${i.product.name}</h3>                                              
                                            </td>
                                            <td class="image-prod"><div class="img" style="background-image:url(${i.product.image});"></div></td>
                                            

                                            <td class="price"> <fmt:formatNumber pattern="##.#" value="${i.price}"/> </td>

                                            <td>                                            
                                                <button  class="quantity-left-minus btn" >
                                                    <a href="process?num=-1&id=${i.product.id}" ><i class="ion-ios-remove"></i></a>
                                                    
                                                </button>
                                                    <input style="text-align: center" type="text" readonly value="${i.quantity}"  /> 
                                                <button class="quantity-right-plus btn ">
                                                    <a  href="process?num=1&id=${i.product.id}" ><i class="ion-ios-add"></i></a>
                                                    
                                                </button>


                                            </td>

                                            <td class="total"><fmt:formatNumber pattern="##.#" value="${i.price*i.quantity}"/> </td>
                                            <td>

                                            </td>
                                        </tr><!-- END TR-->

                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                <div class="row justify-content-end">
                    <div class="col-lg-4 mt-5 cart-wrap ftco-animate">
                        <div class="cart-total mb-3">
                            <p class="d-flex total-price">
                                <span>VAT</span>
                                <span>10%</span>
                            </p>
                            <p class="d-flex total-price">
                                <span>Shipping</span>
                                <span>Free</span>
                            </p>
                            <p class="d-flex total-price">
                                <span>Total</span>

                                <span> <fmt:formatNumber pattern="##.#" value="${o.getTotalMoney()}"/></span>
                            </p>

                        </div>
                         <a href="payproduct"  class="btn btn-primary py-4 px-3">PAY FOR PRODUCT</a>
                    </div>
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



    </body>
</html>