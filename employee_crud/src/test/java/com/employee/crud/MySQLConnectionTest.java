package com.employee.crud;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {

	private static final String DRIVER = "com.mysql.jdbc.Driver";

	private static final String URL = "jdbc:mysql://127.0.0.1:3306/members";

	private static final String USER = "MemberManagement";

	private static final String PW = "study123!";

	@Test
	public void testConn() throws ClassNotFoundException {
		Class.forName(DRIVER);

		try (Connection conn = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
