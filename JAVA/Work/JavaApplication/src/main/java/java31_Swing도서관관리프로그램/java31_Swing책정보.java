package java31_Swing도서관관리프로그램;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class java31_Swing책정보 {
    
    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JComboBox comboBox;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JLabel lblNewLabel_5;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    java31_Swing책정보 window = new java31_Swing책정보();
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
    public java31_Swing책정보() {
        initialize();
    }
    
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 481, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(getPanel());
    }
    
    private JPanel getPanel() {
        if (panel == null) {
        	panel = new JPanel();
        	panel.setBounds(12, 36, 413, 357);
        	panel.setLayout(null);
        	panel.add(getTextField());
        	panel.add(getTextField_1());
        	panel.add(getTextField_2());
        	panel.add(getTextField_3());
        	panel.add(getLblNewLabel());
        	panel.add(getLblNewLabel_1());
        	panel.add(getLblNewLabel_2());
        	panel.add(getLblNewLabel_3());
        	panel.add(getLblNewLabel_4());
        	panel.add(getComboBox());
        	panel.add(getBtnNewButton());
        	panel.add(getBtnNewButton_1());
        	panel.add(getLblNewLabel_5());
        }
        return panel;
    }
    private JTextField getTextField() {
        if (textField == null) {
        	textField = new JTextField();
        	textField.setBounds(101, 42, 116, 21);
        	textField.setColumns(10);
        }
        return textField;
    }
    private JTextField getTextField_1() {
        if (textField_1 == null) {
        	textField_1 = new JTextField();
        	textField_1.setBounds(101, 105, 116, 21);
        	textField_1.setColumns(10);
        }
        return textField_1;
    }
    private JTextField getTextField_2() {
        if (textField_2 == null) {
        	textField_2 = new JTextField();
        	textField_2.setBounds(101, 168, 116, 21);
        	textField_2.setColumns(10);
        }
        return textField_2;
    }
    private JTextField getTextField_3() {
        if (textField_3 == null) {
        	textField_3 = new JTextField();
        	textField_3.setBounds(101, 231, 116, 21);
        	textField_3.setColumns(10);
        }
        return textField_3;
    }
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
        	lblNewLabel = new JLabel("책 제목");
        	lblNewLabel.setBounds(12, 47, 57, 15);
        }
        return lblNewLabel;
    }
    private JLabel getLblNewLabel_1() {
        if (lblNewLabel_1 == null) {
        	lblNewLabel_1 = new JLabel("출판사");
        	lblNewLabel_1.setBounds(12, 109, 57, 15);
        }
        return lblNewLabel_1;
    }
    private JLabel getLblNewLabel_2() {
        if (lblNewLabel_2 == null) {
        	lblNewLabel_2 = new JLabel("저자");
        	lblNewLabel_2.setBounds(12, 171, 57, 15);
        }
        return lblNewLabel_2;
    }
    private JLabel getLblNewLabel_3() {
        if (lblNewLabel_3 == null) {
        	lblNewLabel_3 = new JLabel("가격");
        	lblNewLabel_3.setBounds(12, 233, 57, 15);
        }
        return lblNewLabel_3;
    }
    private JLabel getLblNewLabel_4() {
        if (lblNewLabel_4 == null) {
        	lblNewLabel_4 = new JLabel("장르");
        	lblNewLabel_4.setBounds(12, 295, 57, 15);
        }
        return lblNewLabel_4;
    }
    private JComboBox getComboBox() {
        if (comboBox == null) {
        	comboBox = new JComboBox();
        	comboBox.setBounds(97, 294, 124, 21);
        }
        return comboBox;
    }
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("등록");
        	btnNewButton.setBounds(262, 103, 97, 23);
        }
        return btnNewButton;
    }
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
        	btnNewButton_1 = new JButton("취소");
        	btnNewButton_1.setBounds(262, 229, 97, 23);
        }
        return btnNewButton_1;
    }
    private JLabel getLblNewLabel_5() {
        if (lblNewLabel_5 == null) {
        	lblNewLabel_5 = new JLabel("책 정보 입력");
        	lblNewLabel_5.setBounds(173, 0, 57, 15);
        }
        return lblNewLabel_5;
    }
}
