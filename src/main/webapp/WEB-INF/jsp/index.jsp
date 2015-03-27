<%-- 
    Document   : index
    Created on : Mar 7, 2015, 1:59:14 PM
    Author     : Niwoogaba_Joel
--%>

<%@page import="startek.util.Util"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>



<div class="login-wrapper">
    <a href="index.html">
        <img class="logo" src="<%=Util.T1_%>img/logo-white.png" alt="logo" />
    </a>

        <form class="form-vertical" action="<spring:url value="/"/>j_spring_security_check" method='POST'>
        <div class="box">
            <div class="content-wrap">
                <h6>Welcome To EMR System.</h6>

            </div>
        </div>

        <div class="no-account">
            <p>Don't have an account?</p>
            <a href="mailto:admin@starteckcrop.com">Contact Admin</a>
        </div>
    </form>
</div>                            