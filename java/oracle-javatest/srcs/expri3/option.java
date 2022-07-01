package expri3;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class option {
	public void op1() {
		Dimension dim=new Dimension(200,100);
		JFrame frame=new JFrame("hi");
		frame.setLocation(500,500);
		frame.setPreferredSize(dim);

		JButton button=new JButton("test");
		JButton button1=new JButton("tes1t");

		frame.add(button1);
		ActionListener act=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("go");
			}
		};
		button.addActionListener(act);

		frame.pack();
		frame.setVisible(true);
		

	}

}
