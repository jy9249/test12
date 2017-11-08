package java31_Swing도서관관리프로그램;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class java31_로그인창 {
    
    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JButton btnNewButton;
    private JPasswordField passwordField;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    java31_로그인창 window = new java31_로그인창();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the application.
     */
    public java31_로그인창() {
        initialize();
    }
    
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(getPanel());
    }
    private JPanel getPanel() {
        if (panel == null) {
        	panel = new JPanel();
        	panel.setBounds(26, 10, 287, 179);
        	panel.setLayout(null);
        	panel.add(getTextField());
        	panel.add(getLblNewLabel());
        	panel.add(getLblNewLabel_1());
        	panel.add(getBtnNewButton());
        	panel.add(getPasswordField());
        }
        return panel;
    }
    private JTextField getTextField() {
        if (textField == null) {
        	textField = new JTextField();
        	textField.setBounds(44, 34, 116, 21);
        	textField.setColumns(10);
        }
        return textField;
    }
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
        	lblNewLabel = new JLabel("ID");
        	lblNewLabel.setBounds(23, 37, 57, 15);
        }
        return lblNewLabel;
    }
    private JLabel getLblNewLabel_1() {
        if (lblNewLabel_1 == null) {
        	lblNewLabel_1 = new JLabel("PW");
        	lblNewLabel_1.setBounds(23, 99, 57, 15);
        }
        return lblNewLabel_1;
    }
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("Login");
        	btnNewButton.setBounds(178, 61, 97, 23);
        }
        return btnNewButton;
    }
    private JPasswordField getPasswordField() {
        if (passwordField == null) {
        	passwordField = new JPasswordField();
        	passwordField.setBounds(44, 96, 116, 21);
        }
        return passwordField;
    }
}
