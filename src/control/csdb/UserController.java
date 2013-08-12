package control.csdb;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;

import ui.csdb.UserFrame;
import data.UserManagerDAO;
import entity.UserEn;

public class UserController extends GridController implements GridDataLocator {
	private UserFrame u=null;
	private static Logger log=Logger.getLogger(UserController.class.toString());;
	private UserManagerDAO userDAO;
	
	public UserController(Connection conn) {
		// TODO Auto-generated constructor stub		
		userDAO=new UserManagerDAO(conn);
		u=new UserFrame(this);
		MDIFrame.add(u);
	}
	
	public Response loadData(int action, int startIndex, Map filteredColumns,
			ArrayList currentSortedColumns,
			ArrayList currentSortedVersusColumns, Class valueObjectType,
			Map otherGridParams) {
		
		
		// TODO Auto-generated method stub
		
		ArrayList<UserEn> p=new ArrayList<UserEn>();
        log.info("加载用户数据");
        
        Map attribute2dbField = new HashMap();
        attribute2dbField.put("userid","t_user.user_id");
        attribute2dbField.put("username","t_user.user_name");
      
        try {			
			p=userDAO.selectAllUserItem();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return new VOListResponse(p,false,p.size());
	}


}
