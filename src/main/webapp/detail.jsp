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
    <link href="${basePath }css/style.css" rel="stylesheet">
    <title>职位详情</title>

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
					<a href="${basePath}"><img id="logo" title="兼职"
						src="${basePath }images/home2.png" height="20" width="20"></a>  -->
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
            <div class="jobdetails">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8 clear-padding">
                            <div id="jobdetails-box">
                                <div id="jobdetails-title">
                                    <h1>${title}</h1>
                                </div>
                              
                                <div id="jobdetails-body">
                                    ${requirement }
                                </div>
                            </div>
                            
                          
                           
                            <div id="jobdetails-summary" class="margin-top">
                                <table class="job-details-summary-table">
                                    <tbody>
                                    	 <tr>
                                            <td>类别:</td>
                                            <td>${ctype }</td>
                                        </tr>
                                        <tr>
                                            <td>公司:</td>
                                            <td>${name }</td>
                                        </tr>
                                        <tr>
                                            <td>发布日期:</td>
                                            <td>${pubDate }</td>
                                        </tr>
                                        <tr>
                                            <td>电话:</td>
                                            <td>${phone }</td>
                                        </tr>
                                        <tr>
                                            <td>薪金:</td>
                                            <td>${salary }</td>
                                        </tr>
                                        <tr>
                                            <td>地址:</td>
                                            <td>${address }</td>
                                        </tr>
                                        <tr>
                                            <td>需求人数:</td>
                                            <td>${personCount }</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        
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