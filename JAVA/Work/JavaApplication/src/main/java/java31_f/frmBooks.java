package java31_f;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmBooks extends JFrame {
    
    private JPanel            contentPane;
    // List
    private static List<Book> books = null;
    private JScrollPane       scrollPane;
    private static JTable     table;
    private JButton           btnNewButton;
    private JButton           btnNewButton_1;
    private JButton           btnNewButton_2;
    private JButton           btnNewButton_3;
    private JCheckBox         chkuseryn;
    private JTextField        textbookid;
    private JTextField        textbookname;
    private JTextField        textpubilsher;
    private JTextField        textyear;
    private JTextField        textprice;
    private JTextField        textauthid;
    private JLabel            lblNewLabel;
    private JLabel            lblNewLabel_1;
    private JLabel            lblNewLabel_2;
    private JLabel            lblNewLabel_3;
    private JLabel            lblNewLabel_4;
    private JLabel            lblNewLabel_5;
    private JLabel            lblNewLabel_6;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmBooks frame = new frmBooks();
                    frame.setVisible(true);
                    
                    inidData();
                    frame.refreshTable(books, table);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public static void inidData() {
        books = new ArrayList<>();
        books.add(new Book(1, "operating system", "wiley", "2003", 30700, false,
                1));
        books.add(new Book(2, "mysql", "oreilly", "2009", 58700, true, 2));
        books.add(new Book(3, "java", "hall", "2013", 40000, true, 3));
        books.add(new Book(4, "first sql", "wiley", "2015", 57700, true, 4));
        
    }
    
    /**
     * Create the frame.
     */
    public frmBooks() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 787, 513);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getScrollPane());
        contentPane.add(getBtnNewButton());
        contentPane.add(getBtnNewButton_1());
        contentPane.add(getBtnNewButton_2());
        contentPane.add(getBtnNewButton_3());
        contentPane.add(getChkuseryn());
        contentPane.add(getTextbookid());
        contentPane.add(getTextbookname());
        contentPane.add(getTextpubilsher());
        contentPane.add(getTextyear());
        contentPane.add(getTextprice());
        contentPane.add(getTextauthid());
        contentPane.add(getLblNewLabel());
        contentPane.add(getLblNewLabel_1());
        contentPane.add(getLblNewLabel_2());
        contentPane.add(getLblNewLabel_3());
        contentPane.add(getLblNewLabel_4());
        contentPane.add(getLblNewLabel_5());
        contentPane.add(getLblNewLabel_6());
    }
    
    private JScrollPane getScrollPane() {
        if (scrollPane == null) {
            scrollPane = new JScrollPane();
            scrollPane.setBounds(12, 10, 651, 103);
            scrollPane.setViewportView(getTable());
        }
        return scrollPane;
    }
    
    private JTable getTable() {
        if (table == null) {
            table = new JTable();
            table.addMouseListener(new MouseAdapter() {
                
                @Override
                public void mouseClicked(MouseEvent e) {
                    
                    int row = table.getSelectedRow();
                    String saveId = table.getValueAt(row, 0).toString();
                    String name = table.getValueAt(row, 1).toString();
                    String expr = table.getValueAt(row, 2).toString();
                    String year = table.getValueAt(row, 3).toString();
                    String price = table.getValueAt(row, 4).toString();
                    String authid = table.getValueAt(row, 6).toString();
                    
                    textbookid.setText(saveId);
                    textbookname.setText(name);
                    textpubilsher.setText(expr);
                    textyear.setText(year);
                    textprice.setText(price);
                    textauthid.setText(authid);
                }
            });
            table.setModel(new DefaultTableModel(new Object[][] {},
                    new String[] { "bookid", "bookname", "publisher", "year",
                            "price", "use_yn", "authid" }) {
                Class[] columnTypes = new Class[] { Integer.class, String.class,
                        Integer.class, Integer.class, Integer.class,
                        Boolean.class, Integer.class };
                
                public Class getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
        }
        return table;
    }
    
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
            btnNewButton = new JButton("조회");
            btnNewButton.setBounds(28, 143, 97, 23);
        }
        return btnNewButton;
    }
    
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
            btnNewButton_1 = new JButton("추가");
            btnNewButton_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
            btnNewButton_1.setBounds(180, 143, 97, 23);
        }
        return btnNewButton_1;
    }
    
    private JButton getBtnNewButton_2() {
        if (btnNewButton_2 == null) {
            btnNewButton_2 = new JButton("수정");
            btnNewButton_2.setBounds(326, 143, 97, 23);
        }
        return btnNewButton_2;
    }
    
    private JButton getBtnNewButton_3() {
        if (btnNewButton_3 == null) {
            btnNewButton_3 = new JButton("삭제");
            btnNewButton_3.setBounds(470, 157, 97, 23);
        }
        return btnNewButton_3;
    }
    
    private JCheckBox getChkuseryn() {
        if (chkuseryn == null) {
            chkuseryn = new JCheckBox("New check box");
            chkuseryn.setBounds(110, 370, 115, 23);
        }
        return chkuseryn;
    }
    
    private JTextField getTextbookid() {
        if (textbookid == null) {
            textbookid = new JTextField();
            textbookid.setBounds(110, 209, 116, 21);
            textbookid.setColumns(10);
        }
        return textbookid;
    }
    
    private JTextField getTextbookname() {
        if (textbookname == null) {
            textbookname = new JTextField();
            textbookname.setBounds(109, 240, 116, 21);
            textbookname.setColumns(10);
        }
        return textbookname;
    }
    
    private JTextField getTextpubilsher() {
        if (textpubilsher == null) {
            textpubilsher = new JTextField();
            textpubilsher.setBounds(109, 271, 116, 21);
            textpubilsher.setColumns(10);
        }
        return textpubilsher;
    }
    
    private JTextField getTextyear() {
        if (textyear == null) {
            textyear = new JTextField();
            textyear.setBounds(109, 302, 116, 21);
            textyear.setColumns(10);
        }
        return textyear;
    }
    
    private JTextField getTextprice() {
        if (textprice == null) {
            textprice = new JTextField();
            textprice.setBounds(109, 333, 116, 21);
            textprice.setColumns(10);
        }
        return textprice;
    }
    
    private JTextField getTextauthid() {
        if (textauthid == null) {
            textauthid = new JTextField();
            textauthid.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }
            });
            textauthid.setBounds(109, 399, 116, 21);
            textauthid.setColumns(10);
        }
        return textauthid;
    }
    
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
            lblNewLabel = new JLabel("bookid");
            lblNewLabel.setBounds(12, 212, 57, 15);
        }
        return lblNewLabel;
    }
    
    private JLabel getLblNewLabel_1() {
        if (lblNewLabel_1 == null) {
            lblNewLabel_1 = new JLabel("bookname");
            lblNewLabel_1.setBounds(12, 243, 57, 15);
        }
        return lblNewLabel_1;
    }
    
    private JLabel getLblNewLabel_2() {
        if (lblNewLabel_2 == null) {
            lblNewLabel_2 = new JLabel("pubilsher");
            lblNewLabel_2.setBounds(12, 274, 57, 15);
        }
        return lblNewLabel_2;
    }
    
    private JLabel getLblNewLabel_3() {
        if (lblNewLabel_3 == null) {
            lblNewLabel_3 = new JLabel("year");
            lblNewLabel_3.setBounds(12, 305, 57, 15);
        }
        return lblNewLabel_3;
    }
    
    private JLabel getLblNewLabel_4() {
        if (lblNewLabel_4 == null) {
            lblNewLabel_4 = new JLabel("price");
            lblNewLabel_4.setBounds(12, 333, 57, 15);
        }
        return lblNewLabel_4;
    }
    
    private JLabel getLblNewLabel_5() {
        if (lblNewLabel_5 == null) {
            lblNewLabel_5 = new JLabel("use_yn");
            lblNewLabel_5.setBounds(12, 374, 57, 15);
        }
        return lblNewLabel_5;
    }
    
    private JLabel getLblNewLabel_6() {
        if (lblNewLabel_6 == null) {
            lblNewLabel_6 = new JLabel("authid");
            lblNewLabel_6.setBounds(12, 402, 57, 15);
        }
        return lblNewLabel_6;
    }
    
    public void refreshTable(List<Book> list, JTable table) {
        Object[] tempObject = new Object[7]; // J테이블의 컬럼갯수 생성
        DefaultTableModel model = (DefaultTableModel) table.getModel(); // 테이블설정해논모델가져옴
        model.setRowCount(0); // 테이블 위치를 0부터 시작하도록 설정
        
        for (Book obj : list) { //
            tempObject[0] = obj.getBookid();
            tempObject[1] = obj.getBookname();
            tempObject[2] = obj.getPublisher();
            tempObject[3] = obj.getYear();
            tempObject[4] = obj.getPrice();
            
            tempObject[6] = obj.getAuthid();
            
            model.addRow(tempObject);
        }
        
        if (model.getRowCount() > 0)
            table.setRowSelectionInterval(0, 0);
        table.setModel(model);
        
    }
}
