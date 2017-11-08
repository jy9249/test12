package java31_swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmEmail extends JFrame {
    
    private JPanel contentPane;
    private JPanel panel;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JLabel lblNewLabel;
    private JLabel label;
    private JLabel label_1;
    private JPanel panel_1;
    private JTextField TextEmail;
    private JTextField textField_4;
    private JLabel lblEmail;
    private JLabel label_3;
    private JRadioButton rdbtnNewRadioButton;
    private JRadioButton rdbtnNewRadioButton_1;
    private JRadioButton rdbtnNewRadioButton_2;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private JButton btnNewButton_3;
    private JButton button;
    private JButton btnCancle;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmEmail frame = new frmEmail();
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
    public frmEmail() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 465, 483);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getPanel());
        contentPane.add(getPanel_1());
        contentPane.add(getButton());
        contentPane.add(getBtnCancle());
    }
    private JPanel getPanel() {
        if (panel == null) {
        	panel = new JPanel();
        	panel.setBorder(new LineBorder(Color.BLUE, 4));
        	panel.setBounds(12, 10, 410, 118);
        	panel.setLayout(null);
        	panel.add(getTextField());
        	panel.add(getTextField_1());
        	panel.add(getTextField_2());
        	panel.add(getLblNewLabel());
        	panel.add(getLabel());
        	panel.add(getLabel_1());
        }
        return panel;
    }
    private JTextField getTextField() {
        if (textField == null) {
        	textField = new JTextField();
        	textField.setBounds(68, 24, 89, 15);
        	textField.setColumns(10);
        }
        return textField;
    }
    private JTextField getTextField_1() {
        if (textField_1 == null) {
        	textField_1 = new JTextField();
        	textField_1.setBounds(68, 68, 89, 15);
        	textField_1.setColumns(10);
        }
        return textField_1;
    }
    private JTextField getTextField_2() {
        if (textField_2 == null) {
        	textField_2 = new JTextField();
        	textField_2.setBounds(309, 24, 89, 15);
        	textField_2.setColumns(10);
        }
        return textField_2;
    }
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
        	lblNewLabel = new JLabel("이름");
        	lblNewLabel.setBounds(12, 24, 57, 15);
        }
        return lblNewLabel;
    }
    private JLabel getLabel() {
        if (label == null) {
        	label = new JLabel("직책");
        	label.setBounds(12, 68, 57, 15);
        }
        return label;
    }
    private JLabel getLabel_1() {
        if (label_1 == null) {
        	label_1 = new JLabel("아이디");
        	label_1.setBounds(224, 24, 57, 15);
        }
        return label_1;
    }
    private JPanel getPanel_1() {
        if (panel_1 == null) {
        	panel_1 = new JPanel();
        	panel_1.setBorder(new LineBorder(Color.BLUE, 4));
        	panel_1.setBounds(12, 154, 410, 234);
        	panel_1.setLayout(null);
        	panel_1.add(getTextField_4());
        	panel_1.add(getTextEmail());
        	panel_1.add(getLblEmail());
        	panel_1.add(getLabel_3());
        	panel_1.add(getRdbtnNewRadioButton());
        	panel_1.add(getRdbtnNewRadioButton_1());
        	panel_1.add(getRdbtnNewRadioButton_2());
        	panel_1.add(getBtnNewButton());
        	panel_1.add(getBtnNewButton_1());
        	panel_1.add(getBtnNewButton_2());
        	panel_1.add(getBtnNewButton_3());
        }
        return panel_1;
    }
    private JTextField getTextEmail() {
        if (TextEmail == null) {
        	TextEmail = new JTextField();
        	TextEmail.setBounds(86, 33, 193, 21);
        	TextEmail.setColumns(10);
        }
        return TextEmail;
    }
    private JTextField getTextField_4() {
        if (textField_4 == null) {
        	textField_4 = new JTextField();
        	textField_4.setBounds(22, 68, 257, 105);
        	textField_4.setColumns(10);
        }
        return textField_4;
    }
    private JLabel getLblEmail() {
        if (lblEmail == null) {
        	lblEmail = new JLabel("E-mail");
        	lblEmail.setBounds(12, 10, 57, 15);
        }
        return lblEmail;
    }
    private JLabel getLabel_3() {
        if (label_3 == null) {
        	label_3 = new JLabel("이메일주소");
        	label_3.setBounds(12, 36, 78, 15);
        }
        return label_3;
    }
    private JRadioButton getRdbtnNewRadioButton() {
        if (rdbtnNewRadioButton == null) {
        	rdbtnNewRadioButton = new JRadioButton("HTML");
        	rdbtnNewRadioButton.setBounds(22, 193, 121, 23);
        }
        return rdbtnNewRadioButton;
    }
    private JRadioButton getRdbtnNewRadioButton_1() {
        if (rdbtnNewRadioButton_1 == null) {
        	rdbtnNewRadioButton_1 = new JRadioButton("Plaun Text");
        	rdbtnNewRadioButton_1.setBounds(147, 193, 121, 23);
        }
        return rdbtnNewRadioButton_1;
    }
    private JRadioButton getRdbtnNewRadioButton_2() {
        if (rdbtnNewRadioButton_2 == null) {
        	rdbtnNewRadioButton_2 = new JRadioButton("Custom");
        	rdbtnNewRadioButton_2.setBounds(283, 193, 121, 23);
        }
        return rdbtnNewRadioButton_2;
    }
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("Add");
        	btnNewButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	    String email = textEmail.getText();
        	    String text = textArea.getText();
        	    }
        	});
        	btnNewButton.setBounds(301, 52, 97, 23);
        }
        return btnNewButton;
    }
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
        	btnNewButton_1 = new JButton("Edit");
        	btnNewButton_1.setBounds(301, 85, 97, 23);
        }
        return btnNewButton_1;
    }
    private JButton getBtnNewButton_2() {
        if (btnNewButton_2 == null) {
        	btnNewButton_2 = new JButton("Remove");
        	btnNewButton_2.setBounds(301, 118, 97, 23);
        }
        return btnNewButton_2;
    }
    private JButton getBtnNewButton_3() {
        if (btnNewButton_3 == null) {
        	btnNewButton_3 = new JButton("Default");
        	btnNewButton_3.setBounds(301, 150, 97, 23);
        }
        return btnNewButton_3;
    }
    private JButton getButton() {
        if (button == null) {
        	button = new JButton("Ok");
        	button.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	    messge += textArea.getText() + "\r\n";
        	    
        	    }
        	});
        	button.setBounds(85, 410, 97, 23);
        }
        return button;
    }
    private JButton getBtnCancle() {
        if (btnCancle == null) {
        	btnCancle = new JButton("cancle");
        	btnCancle.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	    }
        	});
        	btnCancle.setBounds(267, 410, 97, 23);
        }
        return btnCancle;
    }
}
