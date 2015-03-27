<%-- 
    Document   : css
    Created on : Mar 7, 2015, 2:39:14 PM
    Author     : Niwoogaba_Joel
--%>


<%@page import="startek.util.Util"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="../taglib.jsp"%>

<div id="sidebar-nav">
    <ul id="dashboard-menu">
        <li class="active">
            <div class="pointer">
                <div class="arrow"></div>
                <div class="arrow_border"></div>
            </div>
            <a href="index-2.html">
                <i class="icon-home"></i>
                <span>Home</span>
            </a>
        </li>            
        
        <li>
            <a class="dropdown-toggle" href="#">
                <i class="icon-group"></i>
                <span>Locations</span>
                <i class="icon-chevron-down"></i>
            </a>
            <ul class="submenu">
                <li><a href="<spring:url value="/location/"/>region.html">Regions</a></li>
                <li><a href="new-user.html">Districts</a></li>
                <li><a href="user-profile.html">Places</a></li>
            </ul>
        </li>
        <li>
            <a class="dropdown-toggle" href="#">
                <i class="icon-edit"></i>
                <span>Forms</span>
                <i class="icon-chevron-down"></i>
            </a>
            <ul class="submenu">
                <li><a href="form-showcase.html">Form showcase</a></li>
                <li><a href="form-wizard.html">Form wizard</a></li>
            </ul>
        </li>
        <li>
            <a href="gallery.html">
                <i class="icon-picture"></i>
                <span>Gallery</span>
            </a>
        </li>
        <li>
            <a href="calendar.html">
                <i class="icon-calendar-empty"></i>
                <span>Calendar</span>
            </a>
        </li>
        <li>
            <a class="dropdown-toggle" href="tables.html">
                <i class="icon-th-large"></i>
                <span>Tables</span>
                <i class="icon-chevron-down"></i>
            </a>
            <ul class="submenu">
                <li><a href="tables.html">Custom tables</a></li>
                <li><a href="datatables.html">DataTables</a></li>
            </ul>
        </li>
        <li>
            <a class="dropdown-toggle ui-elements" href="#">
                <i class="icon-code-fork"></i>
                <span>UI Elements</span>
                <i class="icon-chevron-down"></i>
            </a>
            <ul class="submenu">
                <li><a href="ui-elements.html">UI Elements</a></li>
                <li><a href="icons.html">Icons</a></li>
            </ul>
        </li>
        <li>
            <a href="personal-info.html">
                <i class="icon-cog"></i>
                <span>My Info</span>
            </a>
        </li>
        <li>
            <a class="dropdown-toggle" href="#">
                <i class="icon-share-alt"></i>
                <span>Extras</span>
                <i class="icon-chevron-down"></i>
            </a>
            <ul class="submenu">
                <li><a href="code-editor.html">Code editor</a></li>
                <li><a href="grids.html">Grids</a></li>
                <li><a href="signin.html">Sign in</a></li>
                <li><a href="signup.html">Sign up</a></li>
            </ul>
        </li>
    </ul>
</div>