/**
 * 
 */
package control.csdb;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import org.openswing.swing.mdi.client.ClientFacade;
import org.openswing.swing.mdi.client.MDIController;
import org.openswing.swing.mdi.client.MDIFrame;
import org.openswing.swing.mdi.java.ApplicationFunction;
import org.openswing.swing.permissions.client.LoginDialog;
import org.openswing.swing.tree.java.OpenSwingTreeNode;

import data.DBManager;

import ui.csdb.CSDBMainFrame;

/**
 * @author Administrator
 *
 */
public class CSDBMainController implements MDIController {
	CSDBClientFacade client=null;
	CSDBMainFrame mainFrame=null;
	private DefaultTreeModel treeModel=null;
	public DefaultTreeModel getTreeModel() {
		return treeModel;
	}

	public void setTreeModel(DefaultTreeModel treeModel) {
		this.treeModel = treeModel;
	}

	private Connection conn=null;
	private DefaultMutableTreeNode treeRoot=null;	
	/**
	 * 
	 */
	public CSDBMainController() {
		// TODO Auto-generated constructor stub
		this.conn=(new DBManager()).getConn();
		this.client=new CSDBClientFacade(conn,this);
		this.mainFrame=new CSDBMainFrame(this);
		
		/*JButton buttonSelect = new JButton();
		this.mainFrame.addButtonToToolBar(buttonSelect);*/
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#afterMDIcreation(org.openswing.swing.mdi.client.MDIFrame)
	 */
	@Override
	public void afterMDIcreation(MDIFrame frame) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#getMDIFrameTitle()
	 */
	@Override
	public String getMDIFrameTitle() {
		// TODO Auto-generated method stub
		return "CSDB Management";
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#getExtendedState()
	 */
	@Override
	public int getExtendedState() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#getAboutText()
	 */
	@Override
	public String getAboutText() {
		// TODO Auto-generated method stub
		return "IETM CSDB Management是交互式电子手册公共源数据库管理平台";
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#getAboutImage()
	 */
	@Override
	public String getAboutImage() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#stopApplication()
	 */
	@Override
	public void stopApplication() {
		// TODO Auto-generated method stub
		if(this.conn!=null)
			try {
				this.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		finally{
	    	System.exit(0);
		}
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#viewChangeLanguageInMenuBar()
	 */
	@Override
	public boolean viewChangeLanguageInMenuBar() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#getLanguages()
	 */
	@Override
	public ArrayList getLanguages() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#viewLoginInMenuBar()
	 */
	@Override
	public boolean viewLoginInMenuBar() {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#viewLoginDialog(javax.swing.JFrame)
	 */
	@Override
	public JDialog viewLoginDialog(JFrame parentFrame) {
		// TODO Auto-generated method stub
		// JDialog d = new LoginDialog(parentFrame,true,this);
		 return null;
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#viewFunctionsInTreePanel()
	 */
	@Override
	public boolean viewFunctionsInTreePanel() {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#viewFunctionsInMenuBar()
	 */
	@Override
	public boolean viewFunctionsInMenuBar() {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#getClientFacade()
	 */
	@Override
	public ClientFacade getClientFacade() {
		// TODO Auto-generated method stub
		return client;
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#getApplicationFunctions()
	 */
	@Override
	public DefaultTreeModel getApplicationFunctions() {
		// TODO Auto-generated method stub
		DefaultMutableTreeNode root = new OpenSwingTreeNode();
	    DefaultTreeModel model = new DefaultTreeModel(root);
	    ApplicationFunction n1 = new ApplicationFunction("文件",null);
	    n1.setShortCut(new Character('F'));
	    ApplicationFunction n11 = new ApplicationFunction("退出","exitApp","","exitApp");
	    n11.setShortCut(new Character('E'));
	    n1.add(n11);
	  
	    ApplicationFunction n2 = new ApplicationFunction("项目",null);
	    n2.setShortCut(new Character('P'));
	    ApplicationFunction n21 = new ApplicationFunction("新建项目","newProject","","newProject");	 
	    n21.setShortCut(new Character('N'));
	    ApplicationFunction n22 = new ApplicationFunction("查看项目","viewProject","","viewProject");
	    n22.setShortCut(new Character('V'));
	    ApplicationFunction n23 = new ApplicationFunction("配置","configProject","","configProject");	
	    n23.setShortCut(new Character('C'));
	    n2.add(n21);
	    n2.add(n22);
	    n2.add(n23);
	    
	    ApplicationFunction n3 = new ApplicationFunction("任务",null);
	    n3.setShortCut(new Character('T'));
	    ApplicationFunction n31 = new ApplicationFunction("新建任务","configTask","","newTask");	   
	    n31.setShortCut(new Character('N'));
	    ApplicationFunction n32 = new ApplicationFunction("查看任务","configTask","","viewTask");
	    n32.setShortCut(new Character('V'));
	    ApplicationFunction n33 = new ApplicationFunction("配置","configTask","","configTask");
	    n33.setShortCut(new Character('C'));
	    n3.add(n31);
	    n3.add(n32);
	    n3.add(n33);	    
	    
	    ApplicationFunction n4 = new ApplicationFunction("环境",null);
	    n4.setShortCut(new Character('V'));
	    ApplicationFunction n41 = new ApplicationFunction("用户","userManage","","userManage");	    
	    n41.setShortCut(new Character('U'));
	    ApplicationFunction n42 = new ApplicationFunction("权限","privilegeManage","","privilegeManage");
	    n42.setShortCut(new Character('P'));
	    ApplicationFunction n43 = new ApplicationFunction("配置",null);
	    n43.setShortCut(new Character('C'));
	    ApplicationFunction n431 = new ApplicationFunction("系统","configEnv-S","","configEnv");
	    ApplicationFunction n432 = new ApplicationFunction("数据","configEnv-D","","configEnv");
	    ApplicationFunction n433 = new ApplicationFunction("自定义","configEnv-U","","configEnv");
	    n43.add(n431);
	    n43.add(n432);
	    n43.add(n433);
	    n4.add(n41);
	    n4.add(n42);
	    n4.add(n43);	
	    
	    root.add(n1);
	    root.add(n2);
	    root.add(n3);
	    root.add(n4);
	    return model;
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#viewOpenedWindowIcons()
	 */
	@Override
	public boolean viewOpenedWindowIcons() {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see org.openswing.swing.mdi.client.MDIController#viewFileMenu()
	 */
	@Override
	public boolean viewFileMenu() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DefaultTreeModel getTreeApplicationFunctions() {
		// TODO Auto-generated method stub
	    return treeModel;
	}

}
