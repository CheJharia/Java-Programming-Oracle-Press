import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldDemo {
	public static void main(String[] args) {
		MyFrame2 frame = new MyFrame2("Integer Adder");
		frame.setVisible(true);
		frame.setSize(500, 100);
	}
}

class MyFrame2 extends JFrame implements ActionListener, WindowListener {

	private JTextField number1 = new JTextField();
	private JTextField number2 = new JTextField();
	private JButton adder = new JButton("+");
	private JLabel result = new JLabel("0.0", JLabel.RIGHT);

	public MyFrame2(String title) {
		super(title);
		this.setLayout(new GridLayout(2, 4));
		add(new JLabel("Number 1", JLabel.CENTER));
		add(new JLabel("Number 2", JLabel.CENTER));
		add(new JLabel("Operator", JLabel.CENTER));
		add(new JLabel("Result", JLabel.CENTER));
		add(number1);
		add(number2);
		add(adder);
		add(result);
		adder.addActionListener(this);
		this.addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(adder)) {
			int num1 = Integer.parseInt(number1.getText());
			int num2 = Integer.parseInt(number1.getText());
			int answer = num1 + num2;
			result.setText(String.valueOf(answer));
		}
	}
}