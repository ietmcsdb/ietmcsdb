import internationalization.ChineseOnlyResourceFactory;

import java.util.Hashtable;
import java.util.Properties;

import javax.swing.SwingUtilities;

import org.openswing.swing.mdi.client.DefaultToolBar;
import org.openswing.swing.util.client.ClientSettings;

import control.csdb.CSDBMainController;

/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class IETM {

	/**
	 * 
	 */
	public IETM() {
		// TODO Auto-generated constructor stub
		 Hashtable domains = new Hashtable();
		 Properties props = new Properties();
		 props.setProperty("Find Function", "搜索");
		 props.setProperty("Functions", "搜索");
		 props.setProperty("Project", "项目");
		 props.setProperty("proId", "项目编号");
		 props.setProperty("proName", "项目名称");
		 props.setProperty("userId", "用户编号");
		 props.setProperty("userName", "用户名称");
		 
		 ClientSettings clientSettings = new ClientSettings(new ChineseOnlyResourceFactory("$",props,true),domains);
		 ClientSettings.SHOW_SCROLLBARS_IN_MDI=true;
		 //设置ToolBar为默认
		 ClientSettings.MDI_TOOLBAR=new DefaultToolBar();
		 CSDBMainController mainController=new CSDBMainController();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
		      public void run() {
		        new IETM();
		      }
		    });
	}

}
