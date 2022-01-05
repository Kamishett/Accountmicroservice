<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account List Page  </title>
<link rel="stylesheet" href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap.min.css" />" />
    <link rel="stylesheet" href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap-theme.min.css" />" />
    <link rel="stylesheet" href="<c:url value="resources/styles/pivotal.css" />" />
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
                                    <img alt="bank" title="Bank" height="120" src="<c:url value="images/bank.webp" />" />
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
              <div style="text-align: right">[ <a href="/">Home</a> ]</div>  
        </div>
        
        <div class="row">
            
            <h1>Account List</h1>

 

           <%--  <ul>
                <c:forEach items="${accList}" var="account">
                    <li><a href="accountDetails?number=${account.id}">${account.name}</a></li>
                </c:forEach>
            </ul>--%>
            
            <table border="1">
             <tr>
             <th>Account Id</th>
             <th>Name</th>
             <th>Type</th>
             <th>Salary</th>
             <th>Create Date</th>
             </tr>
             
             <c:forEach items="${accList }" var="account">
             <tr>
             <td><a href="/accountDetails/${account.id}">${account.id}</a></td>
             <td>${account.name}</td>
             <td>${account.type}</td>
             <td>${account.salary}</td>
             <td>${account.createDate}</td>
             </tr>
             </c:forEach>
            </table>
                    
        </div>
        
    </div>

</body>
</html>