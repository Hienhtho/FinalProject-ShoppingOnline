package ShoppingOnline;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Hien Ho
 * This is my main and first frame including all information about goodlist
 */
public class MainFrameHo extends JFrame {

	private GoodLinkedListHo goodList = new GoodLinkedListHo();

	public MainFrameHo() {
		String name[] = { "Hoodies", "Sweaters", "Jackets", "Blouses", "Dresses" }; // name of goods
		String color[] = { "Red", "Blue", "Green", "Black", "White" }; // color of goods
		String size[] = { "S", "M", "L", "XL", "XXL" }; // size
		Double price[] = { 30.00, 25.00, 45.00, 20.00, 40.00 }; // price $

		JPanel panelMain = new JPanel();
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));

		JTextArea txtCart = new JTextArea("Your cart: ");
		txtCart.setLineWrap(true);

		for (int i = 0; i < 5; i++) {
			JPanel panel = new JPanel();

			GoodHo good = new GoodHo();
			good.setName(name[i]);
			good.setPrice(price[i]);

			JLabel lblName = new JLabel(good.getName());
			JLabel lblPrice = new JLabel(" price: " + "$" + good.getPrice());
			JComboBox<String> cbColor = new JComboBox<String>(color);
			JComboBox<String> cbSize = new JComboBox<String>(size);
			JButton btnAdd = new JButton("Add to cart");

			panel.add(lblName);
			panel.add(lblPrice);
			panel.add(cbColor);
			panel.add(cbSize);
			panel.add(btnAdd);

			btnAdd.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {

					good.setSize(size[cbSize.getSelectedIndex()]);
					good.setColor(color[cbColor.getSelectedIndex()]);

					goodList.insertFirst(good);
					txtCart.setText(txtCart.getText() + "\n" + good.toString());
				}
			});

			panelMain.add(panel);
		}

		panelMain.add(txtCart);

		JButton btnCheckOut = new JButton("Check out");
		panelMain.add(btnCheckOut);

		btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CheckOutFrameHo outFrame = new CheckOutFrameHo(goodList);
			}
		});

		this.getContentPane().add(panelMain);
		this.setTitle("Shopping Online Manager");
		this.setVisible(true);
		this.pack();
	}
}
