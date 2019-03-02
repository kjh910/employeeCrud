<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

	<div class="content">
		<article>
			<h3>ログイン画面</h3>
			<div class="form">
				<p></p>
				<form action="/crud/jsp/main/index/loginCheck" method="post">
					<div class="login_label">社員ID</div>
					<div class="login_input">
						<input type="text" name="empEmail" />
					</div>
					<div class="login_label">パスワード</div>
					<div class="login_input">
						<input type="password" name="empPw" />
					</div>
					<div class="login_label"></div>
					<div class="login_input">
						<input type="submit" value="ログイン" />
					</div>
				</form>
			</div>
		</article>
	</div>

<%@ include file="../include/footer.jsp"%>