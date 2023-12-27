package cse22wh1a0559;
import java.awt.*;
import java.awt.event.*;
public class Grid_Layout {
	Grid_Layout(){
		Frame frame = new Frame();
		Panel pa = new Panel();
		Button ba1 = new Button("India");
		Button ba2 = new Button("Japan");
		Button ba3 = new Button("China");
		Button ba4 = new Button("Norway");
		Button ba5 = new Button("Countries");
		frame.add(pa);
		pa.setLayout(new GridLayout(3
				,2));
		pa.add(ba1);
		pa.add(ba2);
		pa.add(ba3);
		pa.add(ba4);
		pa.add(ba5);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);;
				
			}
		});


	}
public static void main(String args[]) {
	new Grid_Layout();
	
}

}
