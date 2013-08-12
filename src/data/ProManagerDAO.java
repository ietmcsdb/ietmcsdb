package data;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.sql.*;

import entity.ProjectEn;

public class ProManagerDAO {
	
	static Connection conn;
	//构造函数
	public ProManagerDAO(Connection connection){
	       	conn=connection;
	}

	//插入条目
	public boolean insertProjectItem(ProjectEn item) throws SQLException{
		// TODO Auto-generated method stub
		 PreparedStatement prep = null;
		 
	        boolean res=true;
	        String sql = "INSERT INTO t_pro"
	            +"(pro_id,pro_name,pro_version,pro_format,pro_security,pro_department,pro_user,pro_dmtype,pro_date) VALUES"
	            +"(?,?,?,?,?,?,?,?,?)";
	        
	        try{
	            prep = conn.prepareStatement(sql);
	            prep.setString(1, item.getProId());
	            prep.setString(2, item.getProName());
	            prep.setString(3, item.getProVersion());
	            prep.setString(4, item.getProFormat());
	            prep.setString(5, item.getProSecurity());
	            prep.setString(6, item.getProDepartment());
	            prep.setString(7, item.getProUser());
	            prep.setString(8, item.getProDmtype());
	            prep.setString(9, item.getProDate());           
	            
	            //执行SQL
	            prep.executeUpdate();   
	          
	        }catch(SQLException e){
	        	res=false;
	            System.out.println(e.getMessage());
	        }finally{
	            if(prep!=null){
	                prep.close();
	            }
	        }
		return res;
	}

	//根据proid查询proitem
	public ArrayList<ProjectEn> selectProjectItem(String pro_id) throws SQLException{
		// TODO Auto-generated method stub
		PreparedStatement prep = null;
		ArrayList<ProjectEn> list=new ArrayList<ProjectEn>();
        String sql1 = "SELECT pro_id,pro_name,pro_security,pro_department,pro_user,pro_date FROM t_pro where pro_id = ?";
        String sql2 = "SELECT pro_id,pro_name,pro_security,pro_department,pro_user,pro_date FROM t_pro";
        try{
        	if(!pro_id.equals("")){
                prep.setString(1, pro_id);
        		prep = conn.prepareStatement(sql1);
        	}
        	else{
        		prep = conn.prepareStatement(sql2);
        	}           
           
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
            	ProjectEn p=new ProjectEn();
            	p.setProId(rs.getString("pro_id"));
            	p.setProName(rs.getString("pro_name"));
            	p.setProSecurity(rs.getString("pro_security"));
            	p.setProDepartment(rs.getString("pro_department"));
            	p.setProUser(rs.getString("pro_user"));
            	p.setProDate(rs.getString("pro_date"));
            	list.add(p);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            if(prep!=null){
                prep.close();
            }
        }
		return list;
	}

	//更新记录
	public void updateProjectItem(String pro_id,String pro_version)throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement prep = null;
        
        String sql = "update t_pro set pro_version= ? where pro_id = ?";
        
		try {  
			prep = conn.prepareStatement(sql);
            prep.setString(1, pro_version);
            prep.setString(2, pro_id);
            System.out.println(sql);
            //执行SQL
            prep.executeUpdate();
           

            System.out.println("项目记录增加成功");
		  }catch(SQLException e){
			  System.out.println(e.getMessage());
		  }finally{
			  if(prep!=null){
	                prep.close();
	            }
		  }
		
	
	}

	//删除记录
	public void deletProjectItem(String pro_id)throws SQLException {
		// TODO Auto-generated method stub
		 PreparedStatement prep = null; 
	     String sql = "DELETE FROM t_pro where pro_id=?";
	     try{    
	            prep = conn.prepareStatement(sql);
	            prep.setString(1,pro_id);
	            System.out.println(sql);
	            prep.executeUpdate();
	            
	        }catch(SQLException e){
	            System.out.println(e.getMessage());
	        }finally{
	            if(prep!=null){
	                prep.close();
	            }
	        }
		
		
	}
	
	

}
