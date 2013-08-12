/**
 * 
 */
package ui.csdb;

import java.awt.BorderLayout;

import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.InternalFrame;
import org.openswing.swing.table.columns.client.TextColumn;
import org.openswing.swing.util.client.ClientSettings;

import control.csdb.UserController;

/**
 * @author Administrator
 *
 */
public class UserFrame extends InternalFrame {
	 GridControl grid = new GridControl();
	 TextColumn userID = new TextColumn();
     TextColumn userName = new TextColumn();
	/**
	 * 
	 */
	public UserFrame(UserController controller) {
		// TODO Auto-generated constructor stub
		this.init();
		
		 //this.setUniqueInstance(true);
		 
		 setSize(300,300);
	     grid.setController(controller);
	     grid.setGridDataLocator(controller);
	     setTitle(ClientSettings.getInstance().getResources().getResource("User"));
	}
	
	public void reloadData() {
		   grid.reloadData();
    }

	
	private void init()
	{
	    grid.setValueObjectClassName("entity.UserEn");
		userID.setColumnFilterable(true);
	    userID.setColumnName("userId");
	    userID.setColumnSortable(true);
	    userID.setEditableOnInsert(true);
	    userID.setMaxCharacters(5);
	    userID.setTrimText(true);
	    userID.setUpperCase(true);
	    userName.setColumnDuplicable(true);
	    userName.setColumnName("userName");
	    userName.setEditableOnEdit(true);
	    userName.setEditableOnInsert(true);
	    userName.setPreferredWidth(350);	   
	    this.setUniqueInstance(true);
	    this.getContentPane().add(grid, BorderLayout.CENTER);
	    grid.getColumnContainer().add(userID, null);
	    grid.getColumnContainer().add(userName, null);
	}
}
