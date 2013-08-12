/**
 * 
 */
package ui.csdb;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import org.openswing.swing.client.DeleteButton;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.client.InsertButton;
import org.openswing.swing.client.ReloadButton;
import org.openswing.swing.mdi.client.InternalFrame;
import org.openswing.swing.table.columns.client.TextColumn;

import control.csdb.ProjectController;

/**
 * @author Administrator
 *
 */
public class ProjectFrame extends InternalFrame {
	 GridControl grid = new GridControl();
	 JPanel buttonsPanel = new JPanel();
	 ReloadButton reloadButton = new ReloadButton();
	 DeleteButton deleteButton = new DeleteButton();
	 InsertButton insertButton = new InsertButton();
	 
	 
	 TextColumn proID = new TextColumn();
     TextColumn proName = new TextColumn();
     
     
	/**
	 * 
	 */
	public ProjectFrame(ProjectController controller) {
		// TODO Auto-generated constructor stub
		this.init();
		
		 //this.setUniqueInstance(true);
		
		 setSize(500,300);
	     grid.setController(controller);
	     grid.setGridDataLocator(controller);
	}
	private void init()
	{
	    grid.setValueObjectClassName("entity.ProjectEn");
		proID.setColumnFilterable(true);
	    proID.setColumnName("proId");
	    proID.setColumnSortable(true);
	    proID.setEditableOnInsert(true);
	    proID.setMaxCharacters(5);
	    proID.setTrimText(true);
	    proID.setUpperCase(true);
	    proName.setColumnDuplicable(true);
	    proName.setColumnName("proName");
	    proName.setEditableOnEdit(true);
	    proName.setEditableOnInsert(true);
	    proName.setPreferredWidth(350);	   
	    this.setUniqueInstance(false);
	    this.getContentPane().add(grid, BorderLayout.CENTER);
	    grid.getColumnContainer().add(proID, null);
	    grid.getColumnContainer().add(proName, null);
	}
}
