package data;

import java.sql.DriverManager;
import java.util.logging.Logger;

import java.sql.*;



public class DBManager {
	private Connection conn=null;
	private static Logger log=Logger.getLogger(DBManager.class.toString());;
	public DBManager(){
		// TODO Auto-generated constructor stub	
		try {  
            Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动                
            conn = DriverManager.getConnection(  
            		"jdbc:mysql://121.48.175.11:3306/ietmcsdb","root","12345");// 创建数据连接             
            log.info("数据库连接成功");
        } catch (Exception e) {  
        	log.warning("数据库连接失败");
        }  
		
	}
	
	public Connection getConn() {
		return conn;
	}
	
	public void closeConn() {
		try{
			 conn.close(); 
		}catch(Exception e){
			e.printStackTrace();
			log.warning("数据库关闭失败" );
		}
	}

}
