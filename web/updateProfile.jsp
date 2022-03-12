<%-- 
    Document   : updateProfile
    Created on : Mar 4, 2022, 2:24:35 PM
    Author     : anhqu
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>

        <title>Chinese-Foods&Drinks</title>
        <link rel="icon" href="images/logo.jpg">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
        <script src="js/jquery.min.js"></script>

    </head>
    <body class="goto-here">

        <div>
            <jsp:include page="header.jsp"/>
        </div>

        <div class="container">
            <div class="container-form">
                
                <h1 style="color: #88ac44">UPDATE PROFILE </h1>
                <hr>
                <h3 class="text-danger">${mess} </h3>
                <form action="updateprofile" method="post">

                    <c:set value="${requestScope.detail}" var="p"/>
                    <input type="hidden"  name="uid"  value="${p.id}">
                    <div class="form-group">
                        <label style="color: #88ac44">Name:</label>
                        <input type="text" class="form-control" placeholder="Enter Name" name="name"  value="${p.name}">

                    </div>
                    <div class="form-group">
                        <label style="color: #88ac44">Phone:</label>
                        <input type="text" class="form-control" placeholder="Enter Phone" name="phone" value="${p.phone}">

                    </div>
                    <div class="form-group">
                        <label style="color: #88ac44">Address:</label>
                        <input type="text" class="form-control" placeholder="Enter Name" name="address" value="${p.address}">

                    </div>
                    <div class="form-group">
                        <label style="color: #88ac44">Username:</label>
                        <input type="text" class="form-control" placeholder="Enter Username" name="user" value="${p.user}">

                    </div>                   
                    <div class="form-group ">
                        <label style="color: #88ac44">Password:</label>
                        <input type="text" class="form-control"  placeholder="Enter Password" name="pass"  value="${p.pass}">
                    </div>

                    <button type="submit" class="btn btn-primary">Update </button>
                    <p></p>

                </form>
            </div>
        </div>

        <div>
            <jsp:include page="footer.jsp"/>
        </div>

        <!-- loader -->
        <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>
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
        <script src="js/main.js"></script>

    </body>
</html>

