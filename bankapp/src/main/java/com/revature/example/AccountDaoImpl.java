package com.revature.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {


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
			System.out.println(e.getMessage());
			
		}
		return balance1;
	}
	


	@Override
	public void createNewAccount(int accountid, int starting_balance) {
		
		try(Connection connection = ConnectionUtil.getConnection()){
			String sql = "INSERT INTO jdbc.account(id,account_balance)"
					+ "VALUES (?,?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, accountid);
			preparedStatement.setInt(2, starting_balance);
			
			preparedStatement.executeUpdate();
			
		
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
	}
		
	@Override
	public int getWithdraw(int id, int new_balance_amount) {
		int amount = 0;
		try(Connection connection = ConnectionUtil.getConnection()){
			String sql = " update jdbc.account set account_balance = ? where id = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, new_balance_amount);
			preparedStatement.setInt(2, id);
			
			amount = preparedStatement.executeUpdate();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return new_balance_amount;
		
		
	}

	@Override
	public Balance setAccountBalance(int balance) {
Balance createCount = null;
		
		try(Connection connection = ConnectionUtil.getConnection()){
			String sql = "INSERT INTO jdbc.account(account_balance)"
					+ "VALUES (?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, balance);
			
			preparedStatement.executeUpdate();
			
		
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		return createCount;
	}
	public void updateBalance(int accountid, int balance) {
		
				
				try(Connection connection = ConnectionUtil.getConnection()){
					String sql = "UPDATE jdbc.account set account_balance = ? where account.id = ?";
							
					
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					
					preparedStatement.setInt(1, balance);
					preparedStatement.setInt(2, accountid);
					
					preparedStatement.executeUpdate();
					
				
					}catch (SQLException e) {
						System.out.println(e.getMessage());
					}

	}
}




