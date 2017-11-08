package java31_swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class frmButton extends JFrame {
    
    private JPanel contentPane;
    private JButton btnNewButton_2;
    private JButton btnNewButton;
    private JTextField textField;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmButton frame = new frmButton();
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
    public frmButton() {
        setTitle("테스트 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 519, 444);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getBtnNewButton_2());
        contentPane.add(getBtnNewButton());
        contentPane.add(getTextField());
    }
    private JButton getBtnNewButton_2() {
        if (btnNewButton_2 == null) {
        	btnNewButton_2 = new JButton("click");
        	btnNewButton_2.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        
        	        String tmp = textField.getText();
        	        JOptionPane.showMessageDialog(null,"tmp");
        	    }
        	});
        	btnNewButton_2.setBounds(329, 85, 97, 52);
        }
        return btnNewButton_2;
    }
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("창 닫기");
        	btnNewButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	    
        	        System.exit(0);
        	    
        	    }
        	});
        	btnNewButton.setBounds(70, 259, 356, 110);
        }
        return btnNewButton;
    }
    private JTextField getTextField() {
        if (textField == null) {
        	textField = new JTextField();
        	textField.setBounds(49, 101, 187, 21);
        	textField.setColumns(10);
        }
        return textField;
    }
}
