package ch11.lecture.p01exception;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class C08CheckedException {
	public static void main(String[] args) throws SQLException {
		DataSource ds = null;
		Connection con = ds.getConnection();
		
		System.out.println("continue....");
	}
}
