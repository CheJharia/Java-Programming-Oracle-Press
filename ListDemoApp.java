import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

public class ListDemoApp {

	public static void main(String[] args) {
		MyFrame3 frame3 = new MyFrame3("List Demo");
		frame3.setBounds(20, 50, 400, 300);
		frame3.setVisible(true);
	}

}

class MyFrame3 extends JFrame implements ActionListener {
	private DefaultListModel sourceModel;
	private DefaultListModel destModel;
	private JList source;
	private JList dest = new JList();
	private JButton addButton = new JButton(">>");
	private JButton removeButton = new JButton("<<");

	public MyFrame3(String title) {
		super(title);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		sourceModel = new DefaultListModel();
		sourceModel.addElement("Banana");
		sourceModel.addElement("Apple");
		sourceModel.addElement("Mango");
		source = new JList(sourceModel);

		source.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		source.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.DARK_GRAY, 5),
				"" + "Shop", 0, 0, null, Color.RED));
		source.setSelectedIndex(0);
		source.setSelectionBackground(Color.BLACK);
		source.setSelectionForeground(Color.WHITE);
		destModel = new DefaultListModel();
		dest.setModel(destModel);
		dest.setSelectionBackground(Color.BLACK);
		dest.setSelectionForeground(Color.WHITE);
		dest.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.DARK_GRAY, 5), ""
						+ "Fruit Basket", 0, 0, null, Color.RED));

		// Building GUI
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 1, 20, 20));
		panel.add(new JLabel());
		panel.add(addButton);
		panel.add(removeButton);
		panel.add(new JLabel());
		this.setLayout(new GridLayout(1, 3, 20, 20));
		add(source);
		add(panel);
		add(dest);

		// Setting event handlers
		addButton.addActionListener(this);
		removeButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(addButton)) {
			if (source.getSelectedValue() != null) {
				String str = (String) source.getSelectedValue();
				if (str != null) {
					destModel.addElement(str);
					dest.setSelectedIndex(0);
					sourceModel.removeElement(str);
					source.setSelectedIndex(0);
				}
			}
		}
		if (e.getSource().equals(removeButton)) {
			if (dest.getSelectedValue() != null) {
				String str = (String) dest.getSelectedValue();
				if (str != null) {

					sourceModel.addElement(str);
					source.setSelectedIndex(0);
					destModel.removeElement(str);
					dest.setSelectedIndex(0);
				}
			}
		}
	}

}
