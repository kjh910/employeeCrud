<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
	
		<article class="main">
			<h3 class="page_title">社員一覧画面</h3>
			<div class="regist_link">
				<a href="../regist/regist_input.html">新規社員登録</a>
			</div>
			<table class="emp_list_table">
				<tr>
					<th class="empId">社員ID</th>
					<th class="empName">社員名</th>
					<th class="gender">性別</th>
					<th class="address">住所</th>
					<th class="birthday">生年月日</th>
					<th class="authority">権限</th>
					<th class="deptName">部署名</th>
					<th class="button" colspan="2">操作</th>
				</tr>
				<tr>
					<td>1</td>
					<td>鈴木太郎</td>
					<td>男性</td>
					<td>東京都</td>
					<td>1986/10/12</td>
					<td>一般</td>
					<td>営業部</td>
					<td class="button">
						<form action="../update/update_input.html">
							<input type="hidden" name="empId" value="1" />
							<input type="submit" value="変更" />
						</form>
					</td>
					<td class="button">
						<form action="../delete/delete_check.html">
							<input type="hidden" name="empId" value="1" />
							<input type="submit" value="削除" class="delete" />
						</form>
					</td>
				</tr>
				<tr>
					<td>2</td>
					<td>田中二郎</td>
					<td>男性</td>
					<td>千葉県</td>
					<td>1979/7/2</td>
					<td>管理者</td>
					<td>経理部</td>
					<td class="button">
						<form action="../update/update_input.html">
							<input type="hidden" name="empId" value="2" />
							<input type="submit" value="変更" />
						</form>
					</td>
					<td class="button">
						<form action="../delete/delete_check.html">
							<input type="hidden" name="empId" value="2" />
							<input type="submit" value="削除" class="delete" />
						</form>
					</td>
				</tr>
				<tr>
					<td>3</td>
					<td>渡辺花子</td>
					<td>女性</td>
					<td>大阪府</td>
					<td>1988/4/23</td>
					<td>管理者</td>
					<td>経理部</td>
					<td class="button">
						<form action="../update/update_input.html">
							<input type="hidden" name="empId" value="3" />
							<input type="submit" value="変更" />
						</form>
					</td>
					<td class="button">
						<form action="../delete/delete_check.html">
							<input type="hidden" name="empId" value="3" />
							<input type="submit" value="削除" class="delete" />
						</form>
					</td>
				</tr>
			</table>
		</article>
	</div>
<%@ include file="../include/footer.jsp"%>