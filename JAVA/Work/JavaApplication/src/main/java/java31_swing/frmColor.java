package java31_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmColor extends JFrame {
    
    private static final Color[] Color = null;
    private JPanel               contentPane;
    private JButton              btnNewButton;
    private JButton              btnNewButton_1;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmColor frame = new frmColor();
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
    public frmColor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getBtnNewButton());
        contentPane.add(getBtnNewButton_1());
    }
    
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
            btnNewButton = new JButton("노란색");
            btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    contentPane.setBackground(getBackground().YELLOW);
                    
                }
            });
            
            btnNewButton.setBounds(59, 83, 97, 23);
        }
        return btnNewButton;
    }
    
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
            btnNewButton_1 = new JButton("핑크색");
            btnNewButton_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    contentPane.setBackground(getBackground().pink);
                }
            });
            btnNewButton_1.setBounds(255, 83, 97, 23);
        }
        return btnNewButton_1;
    }
}
