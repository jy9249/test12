package java31_swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fffrma extends JFrame {
    
    private JPanel contentPane;
    private JButton btnNewButton;
    private JTextField textField;
    private static fffrma frame = null;
    private JButton btnNewButton_1;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        frame = new fffrma();
        frame.setVisible(true);
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    fffrma frame = new fffrma();
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
    public fffrma() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getBtnNewButton());
        contentPane.add(getTextField());
        contentPane.add(getBtnNewButton_1());
    }
    
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("새창 띄우기");
        	btnNewButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        
        	    }
        	});
        	btnNewButton.setBounds(5, 5, 196, 123);
        }
        return btnNewButton;
    }
    private JTextField getTextField() {
        if (textField == null) {
        	textField = new JTextField();
        	textField.setBounds(85, 175, 116, 21);
        	textField.setColumns(10);
        }
        return textField;
    }
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
        	btnNewButton_1 = new JButton("새창 띄우기");
        	btnNewButton_1.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	    }
        	});
        	btnNewButton_1.setBounds(80, 101, 97, 23);
        }
        return btnNewButton_1;
    }
}
