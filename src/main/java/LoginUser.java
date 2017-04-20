import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginUser {
	
	public static int login(String username,String password) throws SQLException{

		Connection con= DBConnector.con;
	
		PreparedStatement ps;

			ps = con.prepareStatement("select * from NEWACCOUNT where USERNAME = ? and PASSWORD = ?");
			ps.setString(1,username);
			ps.setString(2,password);
		
			ResultSet rs = ps.executeQuery();
			int amount = -1;
			if(rs.next()){
				amount = rs.getInt("AMOUNT");
			}
			
			return amount;
	}

}
