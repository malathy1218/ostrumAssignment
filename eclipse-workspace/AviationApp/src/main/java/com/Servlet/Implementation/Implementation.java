package com.Servlet.Implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Servlet.DBconnection.MySqlDBconnection;
import com.Servlets.Model.AviationModel;





public class Implementation {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet resultSet;
	public Implementation(){
		con=MySqlDBconnection.getInstance();
		}
		
		public int insertion(AviationModel aviation) {
			int result =0;
		String query = "insert into register values(?,?,?,?)";
		try {
		    pstmt = con.prepareStatement(query);
			pstmt.setString(1, aviation.getId());
			pstmt.setString(2, aviation.getFirstName());
			pstmt.setString(3, aviation.getLastName());
			pstmt.setString(3, aviation.getAddress());
			
			
			
			result = pstmt.executeUpdate(query);
		} catch (Exception e) {
			
			e.printStackTrace();
}
		
		return result;
	}
		 public List<AviationModel> Fetch() {
				AviationModel result = null;
				List<AviationModel> amp = new ArrayList<AviationModel>();
				String query = "select * from register ";
				try {
				pstmt = con.prepareStatement(query);
				
				resultSet = pstmt.executeQuery();
				while(resultSet.next()) {
				result = new AviationModel();
				result.setId(resultSet.getString(2));
				result.setFirstName(resultSet.getString(2));
				result.setLastName(resultSet.getString(3));
				result.setAddress(resultSet.getString(4));
				
				amp.add(result);
				}

				}

				catch (SQLException e) {
				e.printStackTrace();
				}
				return amp;

}
}
