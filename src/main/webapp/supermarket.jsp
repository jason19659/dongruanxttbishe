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
<link href="css/style.css" rel="stylesheet">
<title>兼职</title>

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
					<a href="${basePath}"><img id="logo" title="兼职"
						src="images/home2.png"></a> -->
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
							<h3>职位列表</h3>
						</div>
					</div>
					<div class="row"></div>
				</div>
			</div>
			<div id="mainContent_ResultsContainer" class="results-container">
				<div id="mainContent_HasResultsContainer" class="container">
					<div class="row">
						<div id="search-results"
							class="col-md-8 col-md-push-4 clear-padding">

							<ul class="reset-list jobs">
								<c:forEach var="item" items="${data.rows}" varStatus="status">
									<li>
										<div class="featured-job-card">
											<div class="featured-job-card-title">
												<h3>
													<a class="res-jobtitle"
														href="${basePath }job/supermarket/${item.id }"
														target="_blank"> ${item.title}</a>
												</h3>
											</div>
											<div class="featured-job-card-body">
												<div class="text-primary">类别：超市兼职</div>
												<div>地址： ${item.address}</div>
												<div>公司： ${item.name}</div>
												<div class="text-success">薪资：${item.salary}</div>
												<div class="text-info">
													发布时间：
													<fmt:formatDate value="${item.pubDate}"
														pattern="yyyy-MM-dd HH:mm:ss" />
												</div>
											</div>
										</div>
									</li>

								</c:forEach>


							</ul>

							<nav>
							<ul id="pagination" class="pagination sm-padding">
								<c:choose>
										<c:when test="${current > 1 }">
											<li><a href="${basePath }supermarket?page=${current -1 }">上一页</a></li>
										</c:when>
										<c:otherwise>
											<li><span>« 上一页</span></li>
										</c:otherwise>
									</c:choose>
									<c:forEach var="p" begin="1" end="${data.total / 15 +1}">
										<li><a href="${basePath }supermarket?page=${p }">${p }</a></li>
									</c:forEach>
									<c:choose> 
										<c:when test="${current <= (data.total / 15)}"> 	
											<li><a href="${basePath }supermarket?page=${current+1 }">下一页  »</a></li>
										</c:when>
										<c:otherwise>
											<li><a href="#">下一页 »</a></li>
										</c:otherwise>
									</c:choose>
								<li><a href="${basePath }supermarket?page=<fmt:formatNumber type="number" value="${(data.total+1) / 15 }" maxFractionDigits="0"/>">末页</a></li>
								</ul>
							</nav>
						</div>
						<div id="search-sidebar"
							class="col-md-4 col-md-pull-8 clear-padding">
							<div class="filter-box">
								<div class="sidebar-head">
									<h3 id="filter-work-type">兼职类别</h3>
								</div>
								<div id="filter-work-type-list" class="sidebar-wrapper">
									<ul class="reset-list">
										<li class="filter-work-type-li"><a
											href="${basePath }repast"
											title="餐饮兼职">餐饮兼职</a></li>
										<li class="filter-work-type-li"><a
											href="${basePath }tutor"
											title="家教兼职">家教兼职</a></li>
										<li class="filter-work-type-li"><a
											href="${basePath }supermarket" title="超市兼职">超市兼职</a></li>
										<li class="filter-work-type-li"><a
											href="${basePath }flyer"
											title="传单兼职">传单兼职</a></li>
									</ul>
								</div>
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