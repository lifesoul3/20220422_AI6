package expri3;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class button {
	
	    public static void main(String[] args) {
	        JFrame fr = new JFrame("This «¡∑π¿”");
	        JPanel pn = new JPanel();
	        JButton[] bt = new JButton[2];
	        
	        for (int i = 0; i < bt.length; i++) {
	            bt[i] = new JButton("Button" + i);
	            pn.add(bt[i]);
	        }

	        fr.setContentPane(pn);

	        fr.setSize(400, 300);
	        fr.setVisible(true);
		
	}
}
