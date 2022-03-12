<%-- 
    Document   : login
    Created on : February 6, 2022, 5:41:29 PM
    Author     : cun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

                <h1 style="margin: auto; color: #88ac44">LOGIN</h1>
                <hr>
                <form action="login" method="post">
                    
                    <p class="text-danger">${mess}<p/>               
                   
                    <div class="form-group">
                        <label style="color: #88ac44">Username:</label>
                        <input type="text" class="form-control" placeholder="Enter Name" name="username" value="${cookie.user.value}">
                    </div>
                    <div class="form-group">
                        <label style="color: #88ac44">Password:</label>
                        <input type="password" class="form-control" placeholder="Password" name="password" value="${cookie.pass.value}">
                    </div>                                       
                    <input type="checkbox"  name="rem" value="ON" ${(cookie.rem.value eq 'ON')? "checked":""} /> Remember account! <br>
                    <button type="submit" class="btn btn-primary">Login</button>
                    <p></p>
                    
                </form>
                    
                     <form action="register.jsp"> 
                         <button type="submit" class="btn btn-primary">Registes</button>
                     </form> 
                    <h4>Don't have account?</h4>
                    
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