package org.openswing.swing.miscellaneous.client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * <p>Title: OpenSwing Framework</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (C) 2006 Mauro Carniel</p>
 * <p> </p>
 * @author Mauro Carniel
 * @version 1.0
 */

public class TestAlertWindow {
  public TestAlertWindow() {
    JFrame f = new JFrame();

    final AlertWindow a = new AlertWindow();
//    a.setTitleImageName("node.gif");
//    a.setTopPanelBackground(new Color(245,245,245));

//    a.setTimeout(2000);

    final JButton b = new JButton("Premimi");
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        a.setBackground(new Color(240,240,240));
        a.anchorWindow(b,a.TOP);
        a.setShowCloseButton(true);
        a.setShowReduceToIconButton(true);
        a.setMainText("Feature Requests item #1857534, was opened at 2007-12-24 14:15\nMessage generated for change (Comment added) made by mcarniel");
        a.setTitle("[ oswing-Feature Requests-1857534 ] alert window");
        a.setImageName("mail.gif");
        a.setWindowMaximumSize(new Dimension(350,120));
        a.setFadeInTime(1000);
//        a.setTimeout(2000);
        a.setReduceToIconOnTimeout(true);
        a.showWindow();
      }
    });
    f.getContentPane().add(b,BorderLayout.SOUTH);
    f.getContentPane().add(new JPanel(),BorderLayout.CENTER);

    f.setSize(500,500);
    f.setVisible(true);

//    a.showAlert();

  }


  public static void main(String[] a) {
    new TestAlertWindow();
  }

}
