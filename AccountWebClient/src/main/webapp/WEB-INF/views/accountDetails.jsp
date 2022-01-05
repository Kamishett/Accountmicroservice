<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Details</title>
<link rel="stylesheet"
	href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap.min.css" />" />
<link rel="stylesheet"
	href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap-theme.min.css" />" />
<link rel="stylesheet"
	href="<c:url value="resources/styles/pivotal.css" />" />
</head>
<body>

<div class="container">
        <div class="row">
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                    <div class="navbar-header">
                    </div>
                    <div>
                        <ul class="nav navbar-nav navbar-right">
                            <li>
                                <a href="http://www.pivotal.io">
                                    <img alt="bank" title="Bank" height="120" src="<c:url value="/images/bank.webp" />" />
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
             <div style="text-align: right">[ <a href="<c:url value='/'/>">Home</a>
              | <a href="accountList">Accounts</a> ]</div> 
            <%-- <div style="text-align: right">[ <a href="<c:url value='/accounts/'/>">Home</a>
              | <a href="accountList">Accounts</a> ]</div> --%>
        </div>
        
        <div class="row">
            
            <h1>Account Details</h1>
            
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-3">
                        Account ID:
                    </div>
                    <div class="col-sm-9">
                        ${acc.id}
                    </div>
                </div>
                <br/>
                <div class="row">
                    <div class="col-sm-3">
                        Name:
                    </div>
                    <div class="col-sm-9">
                        ${acc.name}
                    </div>
                </div>
                <br/>
                <div class="row">
                    <div class="col-sm-3">
                        Account Type:
                    </div>
                    <div class="col-sm-9">
                        ${acc.type}
                    </div>
                </div>
                <br/>
                <div class="row">
                    <div class="col-sm-3">
                        Salary:
                    </div>
                    <div class="col-sm-9">
                        ${acc.salary}
                    </div>
                </div>
                                <div class="row">
                    <div class="col-sm-3">
                        createDate:
                    </div>
                    <div class="col-sm-9">
                        ${acc.createDate}
                    </div>
                </div>
            </div>
                                
        </div>

 

    </div>

</body>
</html>