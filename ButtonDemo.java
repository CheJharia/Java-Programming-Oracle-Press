import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonDemo {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("Button demo");
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}

class MyFrame extends JFrame implements ActionListener, WindowListener {

	private JButton closeButton = new JButton("Close");
	private JButton messageButton = new JButton("Hide");
	private JLabel label = new JLabel("Java Programming is easy", JLabel.CENTER);

	public MyFrame(String str) {
		super(str);
		add(messageButton, "North");
		add(closeButton, "South");
		add(label, "Center");
		// (this) meaning the frame is listening to the buttons
		// and responsible in processing the generated ActionEvent object
		messageButton.addActionListener(this);
		closeButton.addActionListener(this);
		this.addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(messageButton)) {
			if (messageButton.getText().equals("Show")) {
				label.setVisible(true);
				messageButton.setText("Hide");
			} else {
				label.setVisible(false);
				messageButton.setText("Show");
			}
		} else if (e.getSource().equals(closeButton)) {
			System.exit(0);
		}

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}