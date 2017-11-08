package java31_swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class frma extends JFrame
{
    public frma() {
        getContentPane().setLayout(null);
        getContentPane().add(getButton());
        getContentPane().add(getTextField());
    }
    
    private JPanel contentPane;
    
    
    private static frma frame = null;
    private JButton button;
    private JTextField textField;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame= new frma();
                 
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the frame.
     * @return 
     */
    public void fr() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }
    
    private JButton getButton() {
        if (button == null) {
        	button = new JButton("새창 띄우기");
        	button.setBounds(130, 10, 189, 101);
        	button.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	    }
        	});
        }
        return button;
    }
    private JTextField getTextField() {
        if (textField == null) {
        	textField = new JTextField();
        	textField.setBounds(221, 153, 116, 21);
        	textField.setColumns(10);
        }
        return textField;
    }
}
