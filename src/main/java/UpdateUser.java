import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateUser {
	
	public static void update(String username,String password, int amount) throws SQLException{

		Connection con= DBConnector.con;
	
		PreparedStatement ps;

			ps = con.prepareStatement("Update NEWACCOUNT set amount = ? where USERNAME = ? and PASSWORD = ?");
			ps.setInt(1,amount);
			ps.setString(2,username);
			ps.setString(3,password);
		
		    ps.executeUpdate();
	}

}
