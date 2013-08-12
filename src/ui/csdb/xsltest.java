package ui.csdb;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import org.openswing.swing.client.EditButton;
import javax.swing.UIManager;
import javax.swing.JTextField;
import org.openswing.swing.client.TextControl;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTextArea;
import org.openswing.swing.table.columns.client.ComboColumn;
import org.openswing.swing.table.columns.client.SpinnerListColumn;
import org.openswing.swing.client.ListControl;
import org.openswing.swing.table.columns.client.SpinnerNumberColumn;
import org.openswing.swing.client.ComboBoxVOControl;

import data.DBManager;
import data.ProManagerDAO;
import entity.ProjectEn;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class xsltest extends JDialog {
	public static xsltest dialog;
	private JTextField textField2;
	private JTextField textField4;
	private JTextField textField3;
	private JTextField textField1;
	private JTextField textField31;
	private JTextField textField32;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	private JComboBox comboBox3;
	
	private Vector<JCheckBox> checkBoxs;
	private JCheckBox checkBox1;
	private JCheckBox checkBox2;
	private JCheckBox checkBox3;
	private JCheckBox checkBox4;
	private JCheckBox checkBox5;
	private JCheckBox checkBox6;
	private JCheckBox checkBox7;
	private JCheckBox checkBox8;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			
			Connection conn=null;
			conn=(new DBManager()).getConn();
			
			dialog = new xsltest(conn);
			
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public xsltest(final Connection conn) {

		setBounds(100, 100, 550, 502);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(10, 421, 514, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("确认");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						try {
							inseritem2protable(conn);
							dialog.dispose();
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}

				});
				okButton.setActionCommand("ok");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("取消");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dialog.dispose();					
					}
				});
				buttonPane.add(cancelButton);
			}
		}
		{
			JTextPane textPane1 = new JTextPane();
			textPane1.setBackground(UIManager.getColor("Button.background"));
			textPane1.setText("项目设置");
			textPane1.setBounds(23, 10, 65, 27);
			getContentPane().add(textPane1);
		}
		{
			JPanel panel1 = new JPanel();
			panel1.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel1.setBounds(10, 21, 514, 114);
			getContentPane().add(panel1);
			panel1.setLayout(null);
			{
				JTextPane textPane11 = new JTextPane();
				textPane11.setBackground(UIManager.getColor("Button.background"));
				textPane11.setText("项目名称：");
				textPane11.setBounds(10, 20, 70, 26);
				panel1.add(textPane11);
			}
			{
				JTextPane textPane12 = new JTextPane();
				textPane12.setText("创作时间：");
				textPane12.setBackground(SystemColor.menu);
				textPane12.setBounds(10, 56, 70, 26);
				panel1.add(textPane12);
			}
			{
				JTextPane textPane13 = new JTextPane();
				textPane13.setText("创作单位：");
				textPane13.setBackground(SystemColor.menu);
				textPane13.setBounds(181, 20, 67, 26);
				panel1.add(textPane13);
			}
			{
				JTextPane textPane14 = new JTextPane();
				textPane14.setText("创作人：");
				textPane14.setBackground(SystemColor.menu);
				textPane14.setBounds(181, 56, 61, 26);
				panel1.add(textPane14);
			}
			{
				JTextPane textPane15 = new JTextPane();
				textPane15.setText("S1000D版本：");
				textPane15.setBackground(SystemColor.menu);
				textPane15.setBounds(351, 20, 78, 26);
				panel1.add(textPane15);
			}
			{
				JTextPane textPane16 = new JTextPane();
				textPane16.setText("格式：");
				textPane16.setBackground(SystemColor.menu);
				textPane16.setBounds(377, 56, 52, 26);
				panel1.add(textPane16);
			}		
		
			textField1 = new JTextField();
			textField1.setColumns(10);
			textField1.setBounds(88, 25, 83, 21);
			panel1.add(textField1);
			
			textField2 = new JTextField();
			textField2.setBounds(88, 61, 83, 21);
			panel1.add(textField2);
			textField2.setColumns(10);
			
			textField3 = new JTextField();
			textField3.setColumns(10);
			textField3.setBounds(258, 25, 83, 21);
			panel1.add(textField3);
			
			textField4 = new JTextField();
			textField4.setColumns(10);
			textField4.setBounds(258, 61, 83, 21);
			panel1.add(textField4);
			
			Vector<String> Listvision=new Vector<String>();
			Listvision.add("3.0");
			Listvision.add("4.0");
			comboBox1 = new JComboBox(Listvision);
			comboBox1.setBounds(439, 20, 52, 21);
			panel1.add(comboBox1);
			
			Vector<String> Listtype=new Vector<String>();
			Listtype.add("XML");
			Listtype.add("XSL");
			comboBox2 = new JComboBox(Listtype);
			comboBox2.setBackground(UIManager.getColor("Button.disabledShadow"));
			comboBox2.setBounds(439, 56, 52, 21);
			panel1.add(comboBox2);
			
				
			
			
		}
		{
			JTextPane textPane2 = new JTextPane();
			textPane2.setBackground(UIManager.getColor("Button.background"));
			textPane2.setForeground(Color.BLACK);
			textPane2.setText("\u5141\u8BB8\u4F7F\u7528DM\u7C7B\u578B");
			textPane2.setBounds(20, 150, 90, 27);
			getContentPane().add(textPane2);
		}
		{
			JPanel panel2 = new JPanel();
			panel2.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel2.setBounds(10, 161, 514, 108);
			getContentPane().add(panel2);
			panel2.setLayout(null);
			
			
			checkBoxs=new Vector<JCheckBox>();
			
			checkBox1 = new JCheckBox("\u63CF\u8FF0\u7C7B");
			checkBox1.setBounds(21, 20, 103, 23);
			panel2.add(checkBox1);
			checkBoxs.add(checkBox1);
			
		    checkBox2 = new JCheckBox("\u64CD\u4F5C\u7C7B");
			checkBox2.setBounds(21, 61, 103, 23);
			panel2.add(checkBox2);
			checkBoxs.add(checkBox2);
			
			checkBox3 = new JCheckBox("\u7A0B\u5E8F\u7C7B");
			checkBox3.setBounds(142, 20, 103, 23);
			panel2.add(checkBox3);
			checkBoxs.add(checkBox3);
			
			checkBox4 = new JCheckBox("\u7EF4\u4FEE\u7C7B");
			checkBox4.setBounds(142, 61, 103, 23);
			panel2.add(checkBox4);
			checkBoxs.add(checkBox4);
			
			checkBox5 = new JCheckBox("\u63A5\u7EBF\u7C7B");
			checkBox5.setBounds(260, 20, 103, 23);
			panel2.add(checkBox5);
			checkBoxs.add(checkBox5);
			
			checkBox6 = new JCheckBox("\u8FC7\u7A0B\u7C7B");
			checkBox6.setBounds(260, 61, 103, 23);
			panel2.add(checkBox6);
			checkBoxs.add(checkBox6);
			
			checkBox7 = new JCheckBox("\u6545\u969C\u7C7B");
			checkBox7.setBounds(391, 20, 103, 23);
			panel2.add(checkBox7);
			checkBoxs.add(checkBox7);
			
			checkBox8 = new JCheckBox("\u56FE\u89E3\u96F6\u4EF6\u7C7B");
			checkBox8.setBounds(391, 61, 103, 23);
			panel2.add(checkBox8);
			checkBoxs.add(checkBox8);
		}
		
		JTextPane textPane3 = new JTextPane();
		textPane3.setBackground(UIManager.getColor("Button.background"));
		textPane3.setText("\u578B\u53F7\u8BC6\u522B\u7801");
		textPane3.setBounds(31, 298, 79, 33);
		getContentPane().add(textPane3);
		{
			JPanel panel3 = new JPanel();
			panel3.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel3.setBounds(10, 310, 514, 84);
			getContentPane().add(panel3);
			panel3.setLayout(null);
			
			JTextPane textPane = new JTextPane();
			textPane.setBackground(UIManager.getColor("Button.background"));
			textPane.setText("\u4EE3\u7801");
			textPane.setBounds(20, 25, 35, 21);
			panel3.add(textPane);
			
			JTextPane textPane_1 = new JTextPane();
			textPane_1.setBackground(UIManager.getColor("Button.background"));
			textPane_1.setText("\u540D\u79F0");
			textPane_1.setBounds(185, 25, 35, 21);
			panel3.add(textPane_1);
			
			textField31 = new JTextField();
			textField31.setBounds(65, 25, 98, 21);
			panel3.add(textField31);
			textField31.setColumns(10);
			
			textField32 = new JTextField();
			textField32.setBounds(230, 25, 93, 21);
			panel3.add(textField32);
			textField32.setColumns(10);
			
			JTextPane textPane_2 = new JTextPane();
			textPane_2.setBackground(UIManager.getColor("Button.background"));
			textPane_2.setText("\u5BC6\u7EA7");
			textPane_2.setBounds(353, 25, 30, 21);
			panel3.add(textPane_2);
			
			Vector<String> Listlevel=new Vector<String>();
			Listlevel.add("1");
			Listlevel.add("2");
			Listlevel.add("3");
			comboBox3 = new JComboBox(Listlevel);
			comboBox3.setBackground(UIManager.getColor("Button.disabledShadow"));
			comboBox3.setBounds(409, 25, 32, 21);
			panel3.add(comboBox3);
		}	
		
	}
	
	public void inseritem2protable(Connection conn) throws SQLException{
		//获取输入值
		ProjectEn proitem=new ProjectEn();
		proitem.setProName(textField1.getText());
		proitem.setProDate(textField2.getText());
		proitem.setProDepartment(textField3.getText());
		proitem.setProUser(textField4.getText());
		
		proitem.setProVersion((String)comboBox1.getSelectedItem());
		proitem.setProFormat((String)comboBox2.getSelectedItem());
		proitem.setProSecurity((String)comboBox3.getSelectedItem());
		
		Integer sum=0;
		if(checkBox1.isSelected())sum=sum+10000000;
		if(checkBox2.isSelected())sum=sum+1000000;
		if(checkBox3.isSelected())sum=sum+100000;
		if(checkBox4.isSelected())sum=sum+10000;
		if(checkBox5.isSelected())sum=sum+1000;
		if(checkBox6.isSelected())sum=sum+100;
		if(checkBox7.isSelected())sum=sum+10;
		if(checkBox8.isSelected())sum=sum+1;
		
		/*for(int i=0;i<8;++i)
			if(checkBoxs.get(i).isSelected())
				sum=pow_int(10,i);*/
		System.out.println(sum);
		
		String dmtype=String.valueOf(sum);
		proitem.setProDmtype(dmtype);
		proitem.setProId(textField31.getText());
		
		//触发插入操作
		ProManagerDAO proDAO;
		proDAO=new ProManagerDAO(conn);
		try {			
			if((proitem.getProId().equals(""))&&(proitem.getProName().equals("")))
				JOptionPane.showConfirmDialog(null,"请输入项目必要信息","警告", JOptionPane.ERROR_MESSAGE);
			else
				proDAO.insertProjectItem(proitem);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/*private Integer pow_int(int base,int n)
	{
		int res =1;
		int cal=7-n;
		for(int i=0;i<cal;++i)
			res*=base;
		return res;
	}*/
}
