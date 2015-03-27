<%-- 
    Document   : index
    Created on : Mar 7, 2015, 1:59:14 PM
    Author     : Niwoogaba_Joel
--%>

<%@page import="startek.util.Util"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


    <div class="col-sm-12">
        <h1>Create an account</h1>
        <hr />
        <div class="row">
            <div class="col-sm-12 col-md-6">




                <div class="row"> 
                    <form class="form-vertical">
                        <div class="col-sm-12" >

                            <div class="well">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Full name</label>
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <select class="form-control">
                                                <option value="1">Mr</option>
                                                <option value="2">Mrs</option>
                                                <option value="3">Miss</option>
                                                <option value="4">Ms</option>
                                                <option value="5">Dr</option>
                                            </select>
                                        </div>
                                        <div class="col-sm-4">
                                            <input type="email" class="form-control " id="exampleInputEmail1" placeholder="First name">
                                        </div>
                                        <div class="col-sm-5">
                                            <input type="email" class="form-control " id="exampleInputEmail1" placeholder="Last name">
                                        </div>
                                    </div>

                                </div>


                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" class="form-control " id="exampleInputEmail1" placeholder="Enter email">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Make sure your password is longer than 6 characters">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Confirm password</label>
                                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Confirm your password">
                                </div>							  

                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox"> We can contact you with relevant properties, offers and news
                                    </label>
                                </div>
                                <br />
                                <a href="account_dashboard.html" class="btn btn-primary">Create account</a>


                            </div>
                        </div>
                    </form>
                </div>

            </div>

        </div>
        <br />

