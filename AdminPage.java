import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel levelTxt = new JLabel("Who will move to the next level?");
		levelTxt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		levelTxt.setBounds(10, 29, 170, 14);
		contentPane.add(levelTxt);
		
		JCheckBox firstBox = new JCheckBox("John Yap - FAILED");
		firstBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		firstBox.setBounds(6, 50, 125, 23);
		contentPane.add(firstBox);
		
		JCheckBox secondBox = new JCheckBox("Krisha Cruz - FAILED");
		secondBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		secondBox.setBounds(6, 71, 147, 23);
		contentPane.add(secondBox);
		
		JCheckBox thirdBox = new JCheckBox("Henry Go - FAILED");
		thirdBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		thirdBox.setBounds(6, 91, 147, 23);
		contentPane.add(thirdBox);
		
		JCheckBox fourthBox = new JCheckBox("Hailey Dailey - PASSED");
		fourthBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fourthBox.setBounds(6, 110, 147, 23);
		contentPane.add(fourthBox);
		
		JCheckBox fifthBox = new JCheckBox("Ashton Drake - PASSED");
		fifthBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		fifthBox.setBounds(6, 130, 155, 23);
		contentPane.add(fifthBox);
		
		JButton recommendBtn = new JButton("RECOMMEND STUDENT");
		recommendBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			   if(firstBox.isSelected() || secondBox.isSelected() || thirdBox.isSelected()) {
				   JOptionPane.showMessageDialog(null, "PLEASE REVIEW THE RESULTS AGAIN");
			   }
			   else {
				   JOptionPane.showMessageDialog(null, "Here's the list of students who passed the subject Hailey Dailey and Ashton Drake");
				   EndPage end = new EndPage();
				   end.setVisible(true);
				   dispose();
			   }
			}
		});
		recommendBtn.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		recommendBtn.setBounds(206, 162, 170, 23);
		contentPane.add(recommendBtn);
	}
}
