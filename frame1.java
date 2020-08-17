import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame1 extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtSENHA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 frame = new frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("LOGIN");
		label.setBounds(64, 70, 62, 22);
		contentPane.add(label);
		
		TextField textLOGIN = new TextField();
		textLOGIN.setBounds(132, 70, 108, 22);
		contentPane.add(textLOGIN);
		
		Label label_1 = new Label("SENHA");
		label_1.setBounds(64, 98, 62, 22);
		contentPane.add(label_1);
		
		txtSENHA = new JPasswordField();
		txtSENHA.setBounds(132, 98, 108, 20);
		contentPane.add(txtSENHA);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(checkLogin(textLOGIN.getText(), new String (txtSENHA.getPassword()))) 
					
					JOptionPane.showMessageDialog(null, " Acesso permitido!");
					
					else 
						
						JOptionPane.showMessageDialog(null, " Acesso Negado!");
				}
				
			public boolean checkLogin (String login, String senha) {
				return login.equals ("admin") && senha.equals ("swordfish");
				
				
				
			}
			
			
			
			
			
		});
		
		btnNewButton.setBounds(142, 129, 89, 23);
		contentPane.add(btnNewButton);
	}
}
