package org.openswing.swing.miscellaneous.client;

import java.awt.*;
import javax.swing.*;


/**
 * <p>Title: OpenSwing Framework</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (C) 2006 Mauro Carniel</p>
 * <p> </p>
 * @author Mauro Carniel
 * @version 1.0
 */
public class TestOutlook extends JFrame {


  public TestOutlook() throws HeadlessException {
    this.setSize(800,600);
    JSplitPane s = new JSplitPane();
    s.setOrientation(s.HORIZONTAL_SPLIT);
    JPanel pp = new JPanel();
    pp.add(new JButton("Ok"));
    IconifableWindowsContainer p = new IconifableWindowsContainer();
//    p.setBackground(Color.red);
    p.setAutoExpandWindow(true);
    IconifableWindow w1 = new IconifableWindow();
    w1.setTitle("Calendar");
    w1.setTitleImageName("calendar.gif");
    w1.add(new JButton("Ciao!"));
    p.addIconifableWindow(w1);

    IconifableWindow w2 = new IconifableWindow();
    w2.setTitle("Email");
    w2.setTitleImageName("email3.gif");
    w2.add(new JButton("Ciaoo!"));
    p.addIconifableWindow(w2);

    IconifableWindow w3 = new IconifableWindow();
    w3.setTitle("Contacts");
    w3.setTitleImageName("men.gif");
    p.addIconifableWindow(w3);

    IconifableWindow w4 = new IconifableWindow();
    w4.setTitle("Activities");
    w4.setTitleImageName("exec.gif");
    p.addIconifableWindow(w4);

    JPanel ppp = new JPanel();
    ppp.setLayout(new BorderLayout());
    ppp.add(p,BorderLayout.CENTER);
    pp.setBorder(BorderFactory.createEtchedBorder());
    ppp.add(pp,BorderLayout.SOUTH);
    s.add(ppp,s.LEFT);
    JPanel c = new JPanel();
    s.add(c,s.RIGHT);

    s.setDividerLocation(250);
    this.getContentPane().add(s,BorderLayout.CENTER);

    setLocation(100,100);
    setVisible(true);
  }


  public static void main(String[] args) throws HeadlessException {
    TestOutlook testOutlook1 = new TestOutlook();
  }

}
