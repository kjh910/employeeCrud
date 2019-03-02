<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../../../resources/css/layout.css" />
<link rel="stylesheet" href="../../../resources/css/style.css" />
<title>社員管理システム</title>
</head>
<body>
	<header>
		<div class="content">
			<div class="title">社員管理システム</div>
		</div>
	</header>
<div class="content">
		<aside class="search">
			<div class="title">社員名検索</div>
			<div class="form">
				<form action="list.html">
					<input type="text" name="empName" />
					<input type="submit" value="検索" />
				</form>
			</div>
			<div class="title">部署名検索</div>
			<div class="form">
				<form action="list.html">
					<select name="deptId">
						<option value="1" selected="selected">営業部</option>
						<option value="2">経理部</option>
						<option value="3">総務部</option>
					</select>
					<input type="submit" value="検索" />
				</form>
			</div>
		</aside>
	