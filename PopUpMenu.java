package cse22wh1a0559;
import java.awt.*;
import java.awt.event.*;
public class PopUpMenu {
	PopUpMenu(){
		Frame f = new Frame("BVRITH");
		MenuBar mb = new MenuBar();
		Menu menu1 = new Menu("CSE");
		Menu submenu = new Menu("Section");
		MenuItem i1 = new MenuItem("first");
		MenuItem i2 = new MenuItem("second");
		MenuItem i3 = new MenuItem("third");
		MenuItem i4 = new MenuItem("fourth");
		MenuItem i5 = new MenuItem("A");
		MenuItem i6 = new MenuItem("B");
		MenuItem i7 = new MenuItem("C");
		mb.add(menu1);
		menu1.add(i1);
		menu1.add(i2);
		menu1.add(i3);
		menu1.add(i4);
		submenu.add(i5);
		submenu.add(i6);
		submenu.add(i7);
		.add(submenu);
		f.setMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	public static void main(String args[]) {
		new PopUpMenu();
	}
}
