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
public class TestFinestre extends JFrame {


  public TestFinestre() throws HeadlessException {
    this.setSize(800,600);
    JSplitPane s = new JSplitPane();
    s.setOrientation(s.HORIZONTAL_SPLIT);
    JPanel p = new JPanel();
    JButton b = new JButton("Premimi");
    b.setSize(200,200);
    b.setPreferredSize(new Dimension(200,200));
    p.add(b,null);
    IconifableWindow w1 = new IconifableWindow();
    w1.setTitle("Calendar");
    w1.setTitleImageName("calendar.gif");
    w1.anchorWindow(b,w1.TOP);
    w1.setPreferredSize(new Dimension(200,21));

    IconifableWindow w2 = new IconifableWindow();
    w2.setTitle("Email");
    w2.setTitleImageName("email3.gif");
    w2.anchorWindow(b,w1.BOTTOM);
    w2.setPreferredSize(new Dimension(200,21));

    IconifableWindow w3 = new IconifableWindow();
    w3.setTitle("Contacts");
    w3.setTitleImageName("men.gif");
    w3.anchorWindow(b,w1.INSIDE_TOP);
    w3.setPreferredSize(new Dimension(200,21));

    IconifableWindow w4 = new IconifableWindow();
    w4.setTitle("Activities");
    w4.setTitleImageName("exec.gif");
    w4.anchorWindow(b,w1.INSIDE_BOTTOM);
    w4.setPreferredSize(new Dimension(200,21));

    s.add(p,s.LEFT);
    JPanel c = new JPanel();
    s.add(c,s.RIGHT);

    s.setDividerLocation(250);
    this.getContentPane().add(s,BorderLayout.CENTER);

    setLocation(100,100);
    setVisible(true);


    w1.showWindow();
    w2.showWindow();
    w3.showWindow();
    w4.showWindow();

  }


  public static void main(String[] args) throws HeadlessException {
    TestFinestre testFinestre = new TestFinestre();
  }

}
