package control.csdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.message.receive.java.ErrorResponse;
import org.openswing.swing.message.receive.java.Response;
import org.openswing.swing.message.receive.java.VOListResponse;
import org.openswing.swing.message.receive.java.ValueObject;
import org.openswing.swing.server.QueryUtil;
import org.openswing.swing.table.client.GridController;
import org.openswing.swing.table.java.GridDataLocator;

import data.ProManagerDAO;
import ui.csdb.ProjectCreateFrame;

public class ProjectCreateFrameController {
	private static final int DISPOSE_ON_CLOSE = 0;
	private ProjectCreateFrame v=null;
	private Connection conn = null;
	private static Logger log=Logger.getLogger(ProjectCreateFrameController.class.toString());;
	private ProManagerDAO proDAO;
	/**
	 * 
	 */
	public ProjectCreateFrameController(Connection conn) {
		// TODO Auto-generated constructor stub		
		this.conn = conn;
		proDAO=new ProManagerDAO(conn);
		v=new ProjectCreateFrame(conn);
		
		v.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		v.setVisible(true);
		
	}


}
