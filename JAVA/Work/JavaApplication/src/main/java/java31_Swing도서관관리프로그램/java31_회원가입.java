package java31_Swing도서관관리프로그램;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class java31_회원가입 {
    
    private JFrame frame;
    private JPanel panel;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JComboBox comboBox;
    private JTextField textField_4;
    private JComboBox comboBox_1;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    java31_회원가입 window = new java31_회원가입();
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
    public java31_회원가입() {
        initialize();
    }
    
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 513, 490);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(getPanel());
    }
    
    private JPanel getPanel() {
        if (panel == null) {
        	panel = new JPanel();
        	panel.setBounds(12, 10, 473, 432);
        	panel.setLayout(null);
        	panel.add(getLblNewLabel());
        	panel.add(getLblNewLabel_1());
        	panel.add(getLblNewLabel_2());
        	panel.add(getLblNewLabel_3());
        	panel.add(getBtnNewButton());
        	panel.add(getBtnNewButton_1());
        	panel.add(getTextField());
        	panel.add(getTextField_1());
        	panel.add(getTextField_2());
        	panel.add(getTextField_3());
        	panel.add(getComboBox());
        	panel.add(getTextField_4());
        	panel.add(getComboBox_1());
        }
        return panel;
    }
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
        	lblNewLabel = new JLabel("이름");
        	lblNewLabel.setBounds(35, 68, 57, 15);
        }
        return lblNewLabel;
    }
    private JLabel getLblNewLabel_1() {
        if (lblNewLabel_1 == null) {
        	lblNewLabel_1 = new JLabel("주민번호");
        	lblNewLabel_1.setBounds(35, 123, 57, 15);
        }
        return lblNewLabel_1;
    }
    private JLabel getLblNewLabel_2() {
        if (lblNewLabel_2 == null) {
        	lblNewLabel_2 = new JLabel("전화번호");
        	lblNewLabel_2.setBounds(35, 195, 57, 15);
        }
        return lblNewLabel_2;
    }
    private JLabel getLblNewLabel_3() {
        if (lblNewLabel_3 == null) {
        	lblNewLabel_3 = new JLabel("메일계정");
        	lblNewLabel_3.setBounds(35, 278, 57, 15);
        }
        return lblNewLabel_3;
    }
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("가입");
        	btnNewButton.setBounds(105, 345, 97, 23);
        }
        return btnNewButton;
    }
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
        	btnNewButton_1 = new JButton("취소");
        	btnNewButton_1.setBounds(248, 345, 97, 23);
        }
        return btnNewButton_1;
    }
    private JTextField getTextField() {
        if (textField == null) {
        	textField = new JTextField();
        	textField.setBounds(130, 65, 116, 21);
        	textField.setColumns(10);
        }
        return textField;
    }
    private JTextField getTextField_1() {
        if (textField_1 == null) {
        	textField_1 = new JTextField();
        	textField_1.setBounds(130, 120, 116, 21);
        	textField_1.setColumns(10);
        }
        return textField_1;
    }
    private JTextField getTextField_2() {
        if (textField_2 == null) {
        	textField_2 = new JTextField();
        	textField_2.setBounds(203, 192, 116, 21);
        	textField_2.setColumns(10);
        }
        return textField_2;
    }
    private JTextField getTextField_3() {
        if (textField_3 == null) {
        	textField_3 = new JTextField();
        	textField_3.setBounds(345, 192, 116, 21);
        	textField_3.setColumns(10);
        }
        return textField_3;
    }
    private JComboBox getComboBox() {
        if (comboBox == null) {
        	comboBox = new JComboBox();
        	comboBox.setBounds(96, 192, 95, 23);
        }
        return comboBox;
    }
    private JTextField getTextField_4() {
        if (textField_4 == null) {
        	textField_4 = new JTextField();
        	textField_4.setBounds(113, 275, 116, 21);
        	textField_4.setColumns(10);
        }
        return textField_4;
    }
    private JComboBox getComboBox_1() {
        if (comboBox_1 == null) {
        	comboBox_1 = new JComboBox();
        	comboBox_1.setBounds(269, 275, 124, 18);
        }
        return comboBox_1;
    }
}
