<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ include file="../include/header.jsp"%>

		<article>
			<h3>社員変更入力画面</h3>
			<div class="update">
				<form action="/crud/jsp/main/update/updateCheck" method="post">
					<div class="form">
						<div class="label">パスワード：</div>
						<div class="input">
							<input type="password" name="empPw" value="${employeeList.getEmpPw()}" />
						</div>
					</div>
					<div class="form">
						<div class="label">社員名：</div>
						<div class="input">
							<input type="text" name="empName" value="${employeeList.getEmpName()}" />
						</div>
					</div>
					<div class="form">
						<div class="label">性別：</div>
						<div class="input">
						<c:if test="${employeeList.getEmpGender() == 'man' }">
							<input type="radio" name="empGender" value="1" checked="checked" />man&nbsp;
							<input type="radio" name="empGender" value="2" />woman
						</c:if>
						<c:if test="${employeeList.getEmpGender() == 'women' }">
							<input type="radio" name="empGender" value="1"  />man&nbsp;
							<input type="radio" name="empGender" value="2" checked="checked"/>woman
						</c:if>
						</div>
					</div>
					<div class="form">
						<div class="label">住所：</div>
						<div class="input">
						
							<input type="text" name="empAddress" value="${employeeList.getEmpAddress()}" />
						</div>
					</div>
					<div class="form">
						<div class="label">生年月日：</div>
						<div class="input">
						<fmt:formatDate var = "fmtDate" pattern="yyyy/MM/dd" value="${employeeList.getEmpBirthday()}"/>
							<input type="text" name="empBirthday" value="${fmtDate}"/> (YYYY/MM/DD)
						</div>
					</div>
					<div class="form">
						<div class="label">権限：</div>
						<div class="input">
						<c:if test="${employeeList.getEmpPosition() == 'CEO' }">
							<input type="radio" name="empPosition" value="1" checked="checked" />1등급 관리자&nbsp;&nbsp;
							<input type="radio" name="empPosition" value="2" />2등급 관리자&nbsp;&nbsp;
							<input type="radio" name="empPosition" value="3" />일반사원
						</c:if>
						<c:if test="${employeeList.getEmpPosition() == 'manager' }">
							<input type="radio" name="empPosition" value="1"/>1등급 관리자&nbsp;&nbsp;
							<input type="radio" name="empPosition" value="2" checked="checked" />2등급 관리자&nbsp;&nbsp;
							<input type="radio" name="empPosition" value="3" />일반사원
						</c:if>
						<c:if test="${employeeList.getEmpPosition() == 'staff' }">
							<input type="radio" name="empPosition" value="1" />1등급 관리자&nbsp;&nbsp;
							<input type="radio" name="empPosition" value="2" />2등급 관리자&nbsp;&nbsp;
							<input type="radio" name="empPosition" value="3" checked="checked" />일반사원
						</c:if>
						</div>
					</div>
					<div class="form">
						<div class="label">部署名：</div>
						<div class="input">
						<c:if test="${employeeList.getDepId() == 1 }">
							<select name="depId">
								<option value="1" selected="selected">system</option>
								<option value="2">business</option>
								<option value="3">engineering</option>
							</select>
						</c:if>
						<c:if test="${employeeList.getDepId() == 2 }">
							<select name="depId">
								<option value="1" selected="selected">system</option>
								<option value="2">business</option>
								<option value="3">engineering</option>
							</select>
						</c:if>
						<c:if test="${employeeList.getDepId() == 3 }">
							<select name="depId">
								<option value="1" selected="selected">system</option>
								<option value="2">business</option>
								<option value="3">engineering</option>
							</select>
						</c:if>
						</div>
					</div>
					<div class="form">
						<div class="label"></div>
						<div class="input">
							<input type="hidden" name="empId" value="${employeeList.getEmpNum()}" />
							<input type="submit" value="変更" />
						</div>
					</div>
				</form>
				<form action="../list/list.html">
					<div class="form">
						<div class="label"></div>
						<div class="input">
							<input type="submit" value="戻る" />
						</div>
					</div>
				</form>
			</div>
		</article>
	</div>

<%@ include file="../include/footer.jsp"%>