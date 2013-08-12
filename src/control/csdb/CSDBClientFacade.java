/**
 * 
 */
package control.csdb;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

import org.openswing.swing.mdi.client.ClientFacade;
import org.openswing.swing.mdi.client.Tree;
import org.openswing.swing.mdi.java.ApplicationFunction;
import org.openswing.swing.tree.java.OpenSwingTreeNode;


/**
 * @author Administrator
 *
 */
public class CSDBClientFacade implements ClientFacade {
	private static Logger log=Logger.getLogger(CSDBClientFacade.class.toString());;
	private Connection conn=null;
	private CSDBMainController mainController;
	static int i=0;
	/**
	 * 
	 */
	public CSDBClientFacade(Connection conn,CSDBMainController controller) {
		// TODO Auto-generated constructor stub		
		this.conn=conn;
		this.mainController=controller;
	}
	public void viewProject()
	{
		//new ViewProWindowControl(conn);
		//new TestControler();
		//TestViewDirect t=new TestViewDirect();
		//MDIFrame.add(t);
		OpenSwingTreeNode treeRoot = new OpenSwingTreeNode();
	    DefaultTreeModel model = new DefaultTreeModel(treeRoot);
	   
	    ApplicationFunction n1 = new ApplicationFunction("项目1",null);
	    ApplicationFunction n11 = new ApplicationFunction("DM1","doDMnew1","","DoDM");
	    n1.add(n11);
	  
	    
	    ApplicationFunction n2 = new ApplicationFunction("项目2",null);
	    ApplicationFunction n21 = new ApplicationFunction("新建项目DM","doDMnew2","","DoDM");	    
	    
	    n2.add(n21);
	    
	    treeRoot.add(n1);
	    treeRoot.add(n2);		    
	    this.mainController.setTreeModel(model);
	    this.mainController.mainFrame.addTree();	
		new ProjectController(this.conn);
		log.info("查看项目");
	}

	public void newProject(){
		new ProjectCreateFrameController(this.conn);
		log.info("新建项目");
	}
	
	public void userManage()
	{
		new UserController(this.conn);
		log.info("查看所有用户");
	}

	public void exitApp(){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.exit(0);
	}
	public void configEnv(String id)
	{
		if(id.equals("configEnv-S")){
			log.info("configEnv-S");
			OpenSwingTreeNode treeRoot = new OpenSwingTreeNode();
		    DefaultTreeModel model = new DefaultTreeModel(treeRoot);
		   
		    ApplicationFunction n1 = new ApplicationFunction("项目1",null);
		    ApplicationFunction n11 = new ApplicationFunction("DM1","doDMnew1","","DoDM");
		    n1.add(n11);
		  
		    ApplicationFunction n2 = new ApplicationFunction("项目2",null);
		    ApplicationFunction n21 = new ApplicationFunction("新建项目DM","doDMnew2","","DoDM");	    
		  
		    n2.add(n21);
		    if(i%2==0){
		    	ApplicationFunction n22 = new ApplicationFunction("新建项目DM--2","doDMnew2","","DoDM");
		    	n2.add(n22);
		    }
		    i++;
		    
		    treeRoot.add(n1);
		    treeRoot.add(n2);		    
		    this.mainController.setTreeModel(model);
		    this.mainController.mainFrame.addTree();	
		    this.mainController.mainFrame.getContentPane().repaint();
		    this.mainController.mainFrame.getContentPane().validate();
		}
		else if(id.equals("configEnv-D")){
			Tree tree=this.mainController.mainFrame.getTree();
			ApplicationFunction node=(ApplicationFunction) tree.getLastSelectedPathComponent();
			DefaultTreeModel model=(DefaultTreeModel) tree.getModel();
			ApplicationFunction newNode=new ApplicationFunction("new node","doNothing1","","DoNothing");
			model.insertNodeInto(newNode, node, node.getChildCount());
			TreeNode[] nodes = model.getPathToRoot(newNode);  
			TreePath path = new TreePath(nodes);
			tree.scrollPathToVisible(path);
			log.info("configEnv-D");
		}
		else if(id.equals("configEnv-U")){
			log.info("configEnv-U");
		}
	}
	public void DoDM(String s)
	{
		log.info("do DM"+s);
	}
}
