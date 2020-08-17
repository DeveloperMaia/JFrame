import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 frame = new frame2();
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
	public frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 222, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("A");
		label.setBounds(44, 71, 24, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("B");
		label_1.setBounds(44, 106, 24, 22);
		contentPane.add(label_1);
		
		TextField jtext1 = new TextField();
		jtext1.setBounds(74, 71, 86, 22);
		contentPane.add(jtext1);
		
		TextField jtext2 = new TextField();
		jtext2.setBounds(74, 106, 86, 22);
		contentPane.add(jtext2);
		
		JButton btnNewButton = new JButton("Mostrar N\u00FAmeros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			String text1 = jtext1.getText();	
			String text2 = jtext2.getText();	
			int i = Integer.parseInt (text1);
			int j = Integer.parseInt (text2);	
			String value = "";
			
			for (int x = i; x<= j; x++) {{
				
				if ( x> i && x<j ) {
					value = value + x + ",";
			
				}}
			
			JOptionPane.showMessageDialog(rootPane,"Valores entre " +i+ " e " + j + " : " + value);
			
			
				
			}
			}});
		btnNewButton.setBounds(44, 146, 115, 23);
		contentPane.add(btnNewButton);}}
		


