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
<meta charset="utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>用户管理</title>



</head>
<script language="JavaScript" type="text/javascript"
	src="${basePath}js/jquery.min.js" charset="utf-8"></script>
<!--(指定编码方式，防止出现乱码)引入EasyUI中使用的Jquery版本-->
<script language="JavaScript" type="text/javascript"
	src="${basePath}js/jquery.easyui.min.js" charset="utf-8"></script>
<!--(指定编码方式，防止出现乱码)引入EasyUi文件-->

<link rel="stylesheet" type="text/css" href="${basePath}css/easyui.css">
<!--引入CSS样式-->
<link rel="stylesheet" type="text/css" href="${basePath}css/icon.css">
<!--Icon引入-->

<script language="JavaScript" type="text/javascript"
	src="${basePath}js/easyui-lang-zh_CN.js"  charset="UTF-8"></script>
<script type="text/javascript">
	$(function() {
		$('#dg').datagrid({
			url : '${basePath}admin/getAllUser',
			pageSize : 20
		})
	});

	function destroyItem() {
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			$.messager.confirm('确认', '是否确认删除该条目？', function(r) {
				if (r) {
					$.post('${basePath}admin/deleteUser', {
						id : row.id
					}, function(result) {
						$('#dg').datagrid('reload'); // reload the user data
						var title = "";
						if (result.code == 200) {
							title = "成功"
						} else {
							title = "失败"
						}
						$.messager.show({ // show error message
							title : title,
							msg : result.message
						});
					}, 'json');
				}
			});
		}
	}

	function newItem() {
		$('#dlg').dialog('open').dialog('setTitle', '增加用户信息');
		$('#fm').form('clear');
	}

	function saveItem() {
		$('#fm').form('submit', {
			url : '${basePath}admin/saveOrEditUser?' + Math.random(),
			onSubmit : function() {
				return $(this).form('validate');
			},
			success : function(result) {
				var result = eval('(' + result + ')');
				if (result.code != 200) {
					$.messager.show({
						title : 'Error',
						msg : result.message
					});
				} else {
					$('#dlg').dialog('close'); // close the dialog
					$('#dg').datagrid('reload'); // reload the user data
					$.messager.show({ // show error message
						title : "成功",
						msg : "成功"
					});
				}
			}
		});
	}

	function editItem() {
		$('#dlg').dialog('open').dialog('setTitle', '修改用户信息');
		$('#fm').form('clear');
		var selectedRow = $("#dg").datagrid("getSelected");
		if (selectedRow == null) {
			$.messager.alert('提示消息', '请选择数据');
			return;
		}
		//带上原数据
		$("#fm").form('load', selectedRow)

	}
</script>

<script>
	
</script>
<body>
	<table id="dg" title="传单用户管理" class="easyui-datagrid" style=""
		toolbar="#toolbar" rownumbers="true" fitColumns="true"
		singleSelect="true" rownumbers="true" pagination="true">
		<thead>
			<tr>
				<th hidden="true" field="id">id</th>
				<th field="username">用户名</th>
				<th field="regDate">注册时间</th>
				<th field="role">权限</th>
				<th field="phone">联系电话</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="newItem()">增加用户</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-edit" plain="true" onclick="editItem()">修改用户</a> <a
			href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			onclick="destroyItem()">删除</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-back" plain="true" onclick="history.go(-1)">返回</a>
	</div>

	<div id="dlg" class="easyui-dialog"
		style="width: 350px; height: 250px; padding: 10px 20px" closed="true"
		buttons="#dlg-buttons">
		<div class="ftitle">用户信息:</div>
		<form id="fm" method="post">
			<input hidden="true" name="id"></input>
			<div class="fitem">
				<label>用户名:</label> <input name="username" class="easyui-textbox">
			</div>
			<div class="fitem">
				<label>权限(admin):</label> <input name="role" class="easyui-textbox"> 
			</div>
			<div class="fitem">
				<label>密码:</label> <input name="password" class="easyui-textbox">
			</div>
			<div class="fitem">
				<label>电话:</label> <input name="phone" class="easyui-textbox">
			</div>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
			onclick="saveItem()">保存</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">取消</a>
	</div>




</body>
</html>