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
<title>兼职主页</title>
<link href="css/style.css" rel="stylesheet">

</head>

<body>
	<form method="post"
		action="http://www.parttime.hk/part-time-jobs.aspx?wt=P&amp;"
		id="webForm">

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
						<li class="btn-group">
						<a href="${basePath }login"class="dropdown-toggle" data-toggle="dropdown" role="button">
								<img  height="30" width="30" src="${basePath }images/login.png" />
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
		<div class="push-fixed">
			<div class="main-search">
				<div class="container">
					<div class="row">
						<div class="col-md-6 main-search-content">
							<h3>最新职位</h3>
						</div>
					</div>
					<div class="row"></div>
				</div>
			</div>
			<div id="mainContent_ResultsContainer" class="results-container">
				<div id="mainContent_HasResultsContainer" class="container">
					<div class="row">
						<div id="search-results"
							class="col-md-8 col-md-push-4 clear-padding" style="left: 0px;">

							<ul class="reset-list jobs" style="width: 1100px;">
								<c:forEach var="item" items="${data}" varStatus="status">
                                <li style="width: 500px; float: left; padding-left: 50px; padding-right: 50px; padding-top: 25px">
										<div class="featured-job-card">
											<div class="featured-job-card-title">
												<h3>
													<a class="res-jobtitle"href="${basePath }job/${item.code }/${item.id }" target="_blank"> ${item.title}</a>
												</h3>
											</div>
											<div class="featured-job-card-body">
												<div class="text-primary">类别：${item.type} </div>
												<div>地址： ${item.address} </div>
												<div>公司： ${item.name}</div>
												<div class="text-success">薪资：${item.salary}</div>
												<div class="text-info">发布时间：<fmt:formatDate value="${item.pub_date}" pattern="yyyy-MM-dd HH:mm:ss"/></div>
											</div>
										</div>
									</li>

								</c:forEach>
							</ul>

						</div>


					</div>
				</div>
			</div>
		</div>
		</div>
	</form>
	<footer id="footer">
		<div class="container">
			<div class="row">
				<div class="col-md-9 clearfix">
					<div id="footer-links">
						<ul class="reset-list">
							<li>© 2019</li>

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