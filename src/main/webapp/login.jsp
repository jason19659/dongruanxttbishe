<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("basePath", basePath);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8" />
<title>登录</title>
<link href="css/style.css" rel="stylesheet">

</head>

<body>

	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!-- 
					<a href="${basePath }"><img id="logo" title="兼职"
						src="images/home2.png"></a>
						-->
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="${basePath }index">主页</a></li>
					<li><a href="${basePath }repast">餐饮兼职</a></li>
					<li><a href="${basePath }tutor">家教兼职</a></li>
					<li><a href="${basePath }supermarket">超市兼职</a></li>
					<li><a href="${basePath }flyer">传单兼职</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li class="btn-group"><a href="${basePath }login"
						class="dropdown-toggle" data-toggle="dropdown" role="button">
							<img height="30" width="30" src="${basePath }images/login.png" />
							<c:if test="${username != null}">
									 	欢迎:${username}
									</c:if>
					</a>
						<ul class="dropdown-menu" role="menu">

						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<h2 class="text-center">登录</h2>
				<div id="jobseeker-login-form">
				<form action="${basePath }loginRequest" method="POST">
					<span id="mainContent_cvAuthentication" class="text-danger">${errMsg}</span> 
					<div class="form-group">
						<label for="loginEmail">用户名:</label> <input
							name="username" id="mainContent_loginEmail"
							class="form-control input-lg" placeholder="请输入用户名" type="text" />
					</div>
					<div class="form-group">
						<label for="loginPassword">密码:</label> <input  
							name="password" type="password"
							id="mainContent_loginPassword" class="form-control input-lg"
							placeholder="请输入密码" autocomplete="off" />
					</div>
					<input type="submit" name="ctl00$mainContent$btnLogin" value="登入"
						id="mainContent_btnLogin" class="btn btn-primary btn-lg btn-block">
				</form>
				</div>
			</div>
		</div>
	</div>
	<footer id="footer">
		<div class="container">
			<div class="row">
				<div class="col-md-9 clearfix">
					<div id="footer-links">
						<ul class="reset-list">
							<li>Dalian Neusoft University of Information© 2019</li>

						</ul>
					</div>
				</div>
				<div class="col-md-3 clearfix">
					<div id="footer-social">
						<ul class="reset-list">

						</ul>
					</div>
				</div>
			</div>
		</div>
	</footer>


</body>

</html>