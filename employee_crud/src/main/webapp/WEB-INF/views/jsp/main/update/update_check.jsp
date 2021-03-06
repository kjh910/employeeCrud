<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ include file="../include/header.jsp"%>
	
		<article>
			<h3>社員変更確認画面</h3>
			<div class="update">
				<div class="form">
					<div class="label">パスワード：</div>
					<div class="input">${employeeList.getEmpPw()} </div>
				</div>
				<div class="form">
					<div class="label">社員名：</div>
					<div class="input">${employeeList.getEmpName()}</div>
				</div>
				<div class="form">
					<div class="label">性別：</div>
					<div class="input">${employeeList.getEmpGender()}</div>
				</div>
				<div class="form">
					<div class="label">住所：</div>
					<div class="input">${employeeList.getEmpAddress()}</div>
				</div>
				<div class="form">
					<div class="label">生年月日：</div>
					<div class="input">1979/7/2</div>
				</div>
				<div class="form">
					<div class="label">権限：</div>
					<div class="input">${employeeList.getEmpPosition()}</div>
				</div>
				<div class="form">
					<div class="label">部署名：</div>
					<div class="input">${employeeList.getDepId()}</div>
				</div>
				<form action="update_complete.html">
					<div class="form">
						<div class="label"></div>
						<div class="input">
							<input type="hidden" name="empId" value="2" />
							<input type="hidden" name="empPass" value="2222" />
							<input type="hidden" name="empName" value="大谷二郎" />
							<input type="hidden" name="gender" value="1" />
							<input type="hidden" name="address" value="千葉県" />
							<input type="hidden" name="birthday" value="1979/7/2" />
							<input type="hidden" name="authority" value="2" />
							<input type="hidden" name="deptId" value="3" />
							<input type="submit" value="変更" />
						</div>
					</div>
				</form>
				<form action="update_input.html">
					<div class="form">
						<div class="label"></div>
						<div class="input">
							<input type="hidden" name="empId" value="2" />
							<input type="hidden" name="empPass" value="2222" />
							<input type="hidden" name="empName" value="大谷二郎" />
							<input type="hidden" name="gender" value="1" />
							<input type="hidden" name="address" value="千葉県" />
							<input type="hidden" name="birthday" value="1979/7/2" />
							<input type="hidden" name="authority" value="2" />
							<input type="hidden" name="deptId" value="3" />
							<input type="submit" value="戻る" />
						</div>
					</div>
				</form>
			</div>
		</article>
	</div>
<%@ include file="../include/footer.jsp"%>