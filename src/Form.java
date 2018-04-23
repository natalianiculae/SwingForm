import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form {

	private JButton button1;
	private JPanel panel1;
	private JTextField textField1;
	private JTextField textField2;

	public Form() {
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nume = textField1.getText();
				String prenume = textField2.getText();
				
				if (nume == null || nume.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nume invalid");
				} else {
//				    session.execute("Insert into angajati (id, nume, prenume) values (" + id + ", " + nume + ", " + prenume);
					JOptionPane.showMessageDialog(null, "Hello, " + nume + " " + prenume);
				}
			}
		});
	}

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Form");
		jFrame.setContentPane(new Form().panel1);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.pack();
		jFrame.setVisible(true);
	}
}
