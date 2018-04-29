package ShoppingOnline;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Hien Ho
 * This is my last frame for ending order
 */
public class EndOrderFrameHo extends JFrame {
	public EndOrderFrameHo (OrderHo order) 
	{
		order.countPayment();
		
		JPanel panelMain = new JPanel();	
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
		
		JTextArea txtResultOrder = new JTextArea(order.toString());
		txtResultOrder.setLineWrap(true);
		JButton btnOk = new JButton("Ok");
		
		panelMain.add(txtResultOrder);
		panelMain.add(btnOk);
		
		btnOk.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				setVisible(false); 
				dispose(); // close this frame
			}
		});
		
		this.getContentPane().add(panelMain);
		this.setTitle("End Order");
		this.setVisible(true);
		this.pack();
	}
}
