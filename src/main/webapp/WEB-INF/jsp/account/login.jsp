<%-- 
    Document   : index
    Created on : Mar 7, 2015, 1:59:14 PM
    Author     : Niwoogaba_Joel
--%>

<%@page import="startek.util.Util"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="../../layout/taglib.jsp"%>



<div class="login-wrapper">
    <a href="index.html">
        <img class="logo" src="<%=Util.T1_%>img/logo-white.png" alt="logo" />
    </a>

        <form class="form-vertical" action="<spring:url value="/"/>j_spring_security_check" method='POST'>
        <div class="box">
            <div class="content-wrap">
                <h6>Log in</h6>
                <input  type="text" name='j_username'  class="form-control" type="text" placeholder="Username">
                <input name='j_password'  class="form-control" type="password" placeholder="Your password">
                <a href="mailto:admin@starteckcrop.com" class="forgot">Forgot password?</a>
                <div class="remember">
                    <input id="remember-me" type="checkbox">
                    <label for="remember-me">Remember me</label>
                </div>
                <button type="submit"  class="btn btn-primary">Login</button>
            </div>
        </div>

        <div class="no-account">
            <p>Don't have an account?</p>
            <a href="mailto:admin@starteckcrop.com">Contact Admin</a>
        </div>
    </form>
</div>                            