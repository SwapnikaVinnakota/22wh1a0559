package cse22wh1a0559;
import java.awt.*;
import java.awt.event.*;
public class Border_Layout{
	Border_Layout(){
		Frame frame = new Frame("BorderLayoutFrame");
		Panel pa = new Panel();
		Button ba1 = new Button("India");
		Button ba2 = new Button("Japan");
		Button ba3 = new Button("China");
		Button ba4 = new Button("Norway");
		Button ba5 = new Button("Countries");
		frame.add(pa);
		pa.setLayout(new BorderLayout());
		pa.add(ba1,BorderLayout.NORTH);
		pa.add(ba2,BorderLayout.SOUTH);
		pa.add(ba3,BorderLayout.EAST);
		pa.add(ba4,BorderLayout.WEST);
		pa.add(ba5,BorderLayout.CENTER);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);;
				
			}
		});


	}
public static void main(String args[]) {
	new Border_Layout();
	
}

}
