package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;
import java.sql.*;

import control.csdb.CSDBClientFacade;

import entity.UserEn;
import entity.UserEn;


public class UserManagerDAO {
	static Connection conn;
	private static Logger log=Logger.getLogger(CSDBClientFacade.class.toString());
	//构造函数
	public UserManagerDAO(Connection connection){
	       	conn=connection;
	}
	
	//查询allitem
		public ArrayList<UserEn> selectAllUserItem() throws SQLException{
			// TODO Auto-generated method stub
			PreparedStatement prep = null;
			ArrayList<UserEn> list=new ArrayList<UserEn>();
	        String sql2 = "SELECT user_id,user_name FROM t_user ";
	        prep = conn.prepareStatement(sql2);        
	        try{   
	            //执行SQL
	            ResultSet rs = prep.executeQuery();            
	            while(rs.next()){
	            	 /*
	                String id = rs.getString("pro_id");
	                String proname = rs.getString("pro_name");
	                int security=rs.getInt("pro_security");
	                String depart=rs.getString("pro_department");
	                String user=rs.getString("pro_user");
	                Date prodate=rs.getDate("pro_date");
	                */
	            	UserEn p=new UserEn();
	            	p.setUserId(rs.getString("user_id"));
	            	p.setUserName(rs.getString("user_name"));
	            	list.add(p);
	            }
	        }catch(SQLException e){
	        	log.info(e.getMessage());
	        }finally{
	            if(prep!=null){
	                prep.close();
	            }
	        }
			return list;
		}


}
