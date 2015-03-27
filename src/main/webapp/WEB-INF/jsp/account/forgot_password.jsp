<%-- 
    Document   : index
    Created on : Mar 7, 2015, 1:59:14 PM
    Author     : Niwoogaba_Joel
--%>

<%@page import="startek.util.Util"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="row">

    <div class="col-sm-12">
        <h1>Forgot Your Password </h1>

        <hr />
        <div class="row">
            <div class="col-sm-12 col-md-6">

                <div class="row"> 
                    <div class="modal-body col-sm-12">
                        <p>Enter your email to continue</p>
                        <form role="form">
                            <div class="form-group">
                                <input type="email" class="form-control" placeholder="Your email address">
                            </div>

                            <div class="row">
                                <div class="col-md-12">
                                    <a href="my_account.html" class="btn btn-primary pull-left">Continue</a>
                                </div>
                            </div>
                        </form>

                    </div>
                </div>

            </div>

            <div class="col-md-6 col-sm-12 account-sidebar hidden-sm">

                <div class="row">
                    <br/><br/>
                    <div class="col-sm-3" style="text-align: center;">
                        <img src="<%=Util.T1_%>css/images/icons/Crest.png" width="50"/>
                    </div>
                    <div class="col-sm-8">
                        <h3>Why Email?</h3>
                        <p>We're going to send account/ password recovery link to your email.<p>
                    </div>
                </div>
                <br />


            </div>

        </div>
        <br />



    </div>
</div>
<br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
