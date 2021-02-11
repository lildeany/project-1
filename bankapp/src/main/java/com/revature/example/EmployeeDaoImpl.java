package com.revature.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Logger Log = Logger.getLogger(EmployeeMenu.class);
	@Override
	public Balance getAccountBalance(int id){
		Balance balance1 = null;
		try(Connection connection = ConnectionUtil.getConnection()){
			String sql  = "SELECT * FROM jdbc.account WHERE account.id = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int id1 = rs.getInt("id");
				int amount = rs.getInt("account_balance");
				
				balance1 = new Balance(id1, amount);
			}
			
		} catch (SQLException e) {
			Log.error(e.getMessage());
			
		}
		return balance1;
	}
@Override

	public Balance deleteAccountBalance(int id){
		Balance balance1 = null;
		try(Connection connection = ConnectionUtil.getConnection()){
			String sql  = "DELETE FROM jdbc.account WHERE account.id = ?";
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			 pstmt.executeUpdate();
			
		} catch (SQLException e) {
			Log.error(e.getMessage());
			
		}
		return balance1;
	}

	
}
