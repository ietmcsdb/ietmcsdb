/**
 * 
 */
package control.csdb;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;

import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;

import ui.csdb.ProjectFrame;
import data.ProManagerDAO;
import entity.ProjectEn;

/**
 * @author Administrator
 *
 */
public class ProjectController extends GridController implements GridDataLocator {
	private ProjectFrame v=null;
	private static Logger log=Logger.getLogger(ProjectController.class.toString());;
	private ProManagerDAO proDAO;
	/**
	 * 
	 */
	public ProjectController(Connection conn) {
		// TODO Auto-generated constructor stub		
		proDAO=new ProManagerDAO(conn);
		v=new ProjectFrame(this);
		MDIFrame.add(v);
	}

	@Override
	public Response loadData(int action, int startIndex, Map filteredColumns,
			ArrayList currentSortedColumns,
			ArrayList currentSortedVersusColumns, Class valueObjectType,
			Map otherGridParams) {
		// TODO Auto-generated method stub
		
		ArrayList<ProjectEn> p=new ArrayList<ProjectEn>();
        log.info("加载项目数据");
        try {			
			p=proDAO.selectProjectItem("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return new VOListResponse(p,false,p.size());
	}

}
