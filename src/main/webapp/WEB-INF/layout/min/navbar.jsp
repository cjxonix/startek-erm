<%-- 
    Document   : css
    Created on : Mar 7, 2015, 2:39:14 PM
    Author     : Niwoogaba_Joel
--%>


<%@page import="startek.util.Util"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="../taglib.jsp"%>

<header class="navbar navbar-inverse" role="banner">
    <div class="navbar-header">
        <button class="navbar-toggle" type="button" data-toggle="collapse" id="menu-toggler">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index-2.html">
            <img height="26px" src="<%=Util.T1_%>img/logo.png" alt="logo" />
        </a>
    </div>
    <ul class="nav navbar-nav pull-right hidden-xs">
        <li class="hidden-xs hidden-sm">
            <input class="search" type="text" />
        </li>
        <li class="notification-dropdown hidden-xs hidden-sm">
            <a href="#" class="trigger">
                <i class="icon-warning-sign"></i>
                <span class="count">8</span>
            </a>
            <div class="pop-dialog">
                <div class="pointer right">
                    <div class="arrow"></div>
                    <div class="arrow_border"></div>
                </div>
                <div class="body">
                    <a href="#" class="close-icon"><i class="icon-remove-sign"></i></a>
                    <div class="notifications">
                        <h3>You have 6 new notifications</h3>
                        <a href="#" class="item">
                            <i class="icon-signin"></i> New user registration
                            <span class="time"><i class="icon-time"></i> 13 min.</span>
                        </a>
                        <div class="footer">
                            <a href="#" class="logout">View all notifications</a>
                        </div>
                    </div>
                </div>
            </div>
        </li>
        
        <li class="notification-dropdown hidden-xs hidden-sm">
            <a href="#" class="trigger">
                <i class="icon-envelope"></i>
            </a>
            <div class="pop-dialog">
                <div class="pointer right">
                    <div class="arrow"></div>
                    <div class="arrow_border"></div>
                </div>
                <div class="body">

                    <a href="#" class="close-icon"><i class="icon-remove-sign"></i></a>
                    <div class="messages">
                        <a href="#" class="item">
                            <img src="<%=Util.T1_%>img/contact-img.png" class="display" alt="user" />
                            <div class="name">Alejandra Galván</div>
                            <div class="msg">
                                There are many variations of available, but the majority have suffered alterations.
                            </div>
                            <span class="time"><i class="icon-time"></i> 13 min.</span>
                        </a>
                        
                        <div class="footer">
                            <a href="#" class="logout">View all messages</a>
                        </div>
                    </div>
                </div>
            </div>
        </li>
        
        <li class="dropdown">
            <a href="#" class="dropdown-toggle hidden-xs hidden-sm" data-toggle="dropdown">
                Your account
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
                <li><a href="personal-info.html">Personal info</a></li>
                <li><a href="#">Account settings</a></li>
                <li><a href="#">Billing</a></li>
                <li><a href="#">Export your data</a></li>
                <li><a href="#">Send feedback</a></li>
            </ul>
        </li>
        <li class="settings hidden-xs hidden-sm">
            <a href="personal-info.html" role="button">
                <i class="icon-cog"></i>
            </a>
        </li>
        <li class="settings hidden-xs hidden-sm">
            <a href="signin.html" role="button">
                <i class="icon-share-alt"></i>
            </a>
        </li>
    </ul>
</header>