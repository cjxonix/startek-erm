<%@page import="startek.util.Util"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>
<!DOCTYPE html>
<html class="login-bg">

    <head>
        <title>Sign in - Startek Crop EMR</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- bootstrap -->
        <link href="<%=Util.T1_%>css/bootstrap/bootstrap.css" rel="stylesheet" />
        <link href="<%=Util.T1_%>css/bootstrap/bootstrap-overrides.css" type="text/css" rel="stylesheet" />

        <!-- global styles -->
        <link rel="stylesheet" type="text/css" href="<%=Util.T1_%>css/compiled/layout.css" />
        <link rel="stylesheet" type="text/css" href="<%=Util.T1_%>css/compiled/elements.css" />
        <link rel="stylesheet" type="text/css" href="<%=Util.T1_%>css/compiled/icons.css" />

        <!-- libraries -->
        <link rel="stylesheet" type="text/css" href="<%=Util.T1_%>css/lib/font-awesome.css" />

        <!-- this page specific styles -->
        <link rel="stylesheet" href="<%=Util.T1_%>css/compiled/signin.css" type="text/css" media="screen" />

        <!-- open sans font -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css' />

        <!--[if lt IE 9]>
          <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
    </head>
    <body>


        <tiles:insertAttribute name="body"/>

        <!-- scripts -->
        <script src="<%=Util.T1_%>js/jquery-latest.js"></script>
        <script src="<%=Util.T1_%>js/bootstrap.min.js"></script>
        <script src="<%=Util.T1_%>js/theme.js"></script>

        <!-- pre load bg imgs -->
        <script type="text/javascript">
            $(function () {
                // bg switcher
                var $btns = $(".bg-switch .bg");
                $btns.click(function (e) {
                    e.preventDefault();
                    $btns.removeClass("active");
                    $(this).addClass("active");
                    var bg = $(this).data("img");

                    $("html").css("background-image", "url('img/bgs/" + bg + "')");
                });

            });
        </script>
    </body>

</html>
