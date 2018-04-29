package ShoppingOnline;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Hien Ho
 * This is my second frame for checkout 
 */
public class CheckOutFrameHo extends JFrame {
	public CheckOutFrameHo(GoodLinkedListHo goodList) {
		OrderHo order = new OrderHo();
		order.setGoodList(goodList);

		JPanel panelMain = new JPanel();
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));

		JTextArea txtCart = new JTextArea();
		txtCart.setLineWrap(true);
		txtCart.setText("Your cart:\n" + goodList.toString());

		panelMain.add(txtCart);

		JTextField txtCustomerName = new JTextField("Name");
		JTextField txtCustomerPhone = new JTextField("Phone");
		JTextField txtCustomerEmail = new JTextField("Email");
		JTextField txtCustomerAddress = new JTextField("Address");
		JButton btnOrder = new JButton("Order");

		panelMain.add(txtCustomerName);
		panelMain.add(txtCustomerPhone);
		panelMain.add(txtCustomerEmail);
		panelMain.add(txtCustomerAddress);
		panelMain.add(btnOrder);

		btnOrder.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CustomerHo customer = new CustomerHo();
				customer.setName(txtCustomerName.getText());
				customer.setPhone(txtCustomerPhone.getText());
				customer.setEmail(txtCustomerEmail.getText());
				customer.setAddress(txtCustomerAddress.getText());

				order.setCustomer(customer);
				order.setTax(6.0); // tax = 6%
				order.setShipping(5.0); // shipping $5

				EndOrderFrameHo endOrderFrame = new EndOrderFrameHo(order);
			}
		});

		this.getContentPane().add(panelMain);
		this.setTitle("Check Out");
		this.setVisible(true);
		this.pack();
	}
}
