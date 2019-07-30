import javax.swing.border.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.util.*;
import java.util.Vector.*;
 
class Pass002 extends JFrame {
 
    public JTextField inputLogin;
    public JTextField inputDL;
    public JTextField inputFirst;
    public JTextField inputLast;
    public JTextField inputEmail;
    public JTextField inputPhone;
    public String firstname;
    public callingMethod transfer = new callingMethod();
    public Vector addClient = new Vector();
 
    public Pass002() {
 
        setTitle("Add Customer");
        Container con = getContentPane();
        setSize(300, 300);
        setLocationRelativeTo(null);
        con.setLayout(null);

        JLabel firstN = new JLabel("First Name:");
        JLabel lastN = new JLabel("Last Name:");
        JLabel DL = new JLabel("Driver Licence:");
        JLabel email = new JLabel("Email:");
        JLabel phone = new JLabel("Phone:");
 
        inputFirst = new JTextField(10);
        inputLast = new JTextField(10);
        inputDL = new JTextField(10);
        inputEmail = new JTextField(10);
        inputPhone = new JTextField(10);
        
        JButton enter = new JButton("Enter");
        enter.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e) {
                
               transfer.caller.addElement(inputFirst.getText());
               transfer.caller.addElement(inputLast.getText());
               transfer.caller.addElement(inputDL.getText());
               transfer.caller.addElement(inputEmail.getText());
               transfer.caller.addElement(inputPhone.getText());
               new HotelSystem(transfer.caller);
                setVisible(false);
                 
            }
        });
 
        this.addWindowListener(new PanelCloser());
 
        con.add(panelBgImg1);
        panelBgImg1.setBounds(0, 0, imh.getIconWidth(), imh.getIconHeight());
 
        GridBagLayout layout = new GridBagLayout();
        JPanel contentPane = new JPanel(layout);
        GridBagConstraints gc = new GridBagConstraints();
 
        gc.insets = new Insets(4, 4, 4, 4);
        gc.gridx = 1;
        gc.gridy = 1;
        contentPane.add(firstN, gc);
 
        gc.insets = new Insets(4, 4, 4, 4);
        gc.gridx = 2;
        gc.gridy = 1;
        JTextField txtName = new JTextField(10);
        contentPane.add(inputFirst, gc);
 
        gc.insets = new Insets(4, 4, 4, 4);
        gc.gridx = 1;
        gc.gridy = 2;
        contentPane.add(lastN, gc);
 
        gc.gridx = 2;
        gc.gridy = 2;
        contentPane.add(inputLast, gc);
 
        gc.insets = new Insets(4, 4, 4, 4);
        gc.gridx = 1;
        gc.gridy = 3;
        contentPane.add(DL, gc);
 
        gc.insets = new Insets(4, 4, 4, 4);
        gc.gridx = 2;
        gc.gridy = 3;
        contentPane.add(inputDL, gc);
 
        gc.insets = new Insets(4, 4, 4, 4);
        gc.gridx = 1;
        gc.gridy = 4;
        contentPane.add(email, gc);
 
        gc.gridx = 2;
        gc.gridy = 4;
        contentPane.add(inputEmail, gc);
 
        gc.insets = new Insets(4, 4, 4, 4);
        gc.gridx = 1;
        gc.gridy = 5;
        contentPane.add(phone, gc);
 
        gc.gridx = 2;
        gc.gridy = 5;
        contentPane.add(inputPhone, gc);
 
        gc.insets = new Insets(4, 4, 4, 4);
        gc.gridy = 6;
        contentPane.add(enter, gc);
 
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setBorder(new LineBorder(Color.WHITE));
 
        panelBgImg1.add(contentPane);
        panelBgImg1.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
 
        setResizable(false);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    class PanelCloser extends WindowAdapter {
 
        public void windowClosing(WindowEvent event) {
            setVisible(false);
        }
    }
}
 public void checkIn() {
        split1(caller);
        split2();
        buttonSplit();
        noteSplit();
        room();
        date();
 
        checkInPanel = new JPanel();
        store = new JPanel();
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setLeftComponent(left);
        splitPane.setRightComponent(right);
 
        JSplitPane splitPaneB = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPaneB.setLeftComponent(buttonPanel);
        splitPaneB.setRightComponent(notePanel);
 
        JSplitPane splitPaneM = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        splitPaneM.setLeftComponent(splitPane);
        splitPaneM.setRightComponent(splitPaneB);
 
        JSplitPane splitPaneR1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        splitPaneR1.setLeftComponent(roomPanel);
        splitPaneR1.setRightComponent(datePanel);
 
        JSplitPane splitPaneR = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPaneR.setLeftComponent(splitPaneM);
        splitPaneR.setRightComponent(splitPaneR1);
 
 
        checkInPanel.show();
        checkInPanel.setVisible(true);
        store.add(splitPaneR, BorderLayout.NORTH);
 
        // store.add(splitPaneB,BorderLayout.SOUTH);
        checkInPanel.add(store);
 
    }
 
    public void split1(Vector v1) {
        this.caller = v1;
        left = new JPanel();
        left.setLayout(new BorderLayout());
        DefaultListModel model = new DefaultListModel();
        customerList = new JList(model);
        String word = "hello";
        String[] entries = {"one", "two", "three",word};
        for (int i = 0; i < entries.length; i++) {
 
            model.addElement(entries[i]);
        }
        if (caller!=null){
            String hell= caller.get(0)+" "+caller.get(1);
            model.addElement(hell);
             
             
        }
         
        scroll = new JScrollPane(customerList);
 
        scroll.setPreferredSize(new Dimension(150, 500));
        left.add(scroll);
 
    }
 
    public void split2() {
        right = new JPanel();
        right.setLayout(new BorderLayout());
        infoPane = new JEditorPane();
        infoPane.setEnabled(false);
 
        scroll2 = new JScrollPane(infoPane);
        scroll2.setPreferredSize(new Dimension(500, 450));
        right.add(new JLabel("Customer:"), BorderLayout.NORTH);
        right.add(scroll2);
 
    }
 
    public void buttonSplit() {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());
 
        addCustomer = new JButton("Add Customer");
        addCustomer.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
                new addCust().setVisible(true);
 
            }
        });
 
        billing = new JButton("Billing");
        billing.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
                new bill().setVisible(true);
            }
        });
        remove = new JButton("Delete");
        remove.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
                new delete().setVisible(true);
 
            }
        });
        feature = new JButton("Features");
        feature.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
                new feature().setVisible(true);
 
            }
        });
        reserve = new JButton("Reserve");
        reserve.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
                callingMethod method = new callingMethod();
 
            }
        });
        buttonPanel.add(addCustomer, BorderLayout.NORTH);
        buttonPanel.add(billing, BorderLayout.WEST);
        buttonPanel.add(feature, BorderLayout.EAST);
        buttonPanel.add(reserve, BorderLayout.CENTER);
        buttonPanel.add(remove, BorderLayout.SOUTH);
 
    }
 
    public void noteSplit() {
        notePanel = new JPanel();
        notePanel.setLayout(new BorderLayout());
        notePanel.setPreferredSize(new Dimension(400, 100));
        notePanel.setMinimumSize(new Dimension(100, 100));
 
        notePanel.add(new JLabel("Notes:"), BorderLayout.NORTH);
        notePanel.add(new JTextArea(), BorderLayout.CENTER);
    }
    private String text = " ";
    private int max_rows = 20;
    private int max_cols = 5;
    private JToggleButton[][] buttonGrid = new JToggleButton[max_rows][max_cols];
 
    public void room() {
        roomPanel = new JPanel();
        JPanel buttonGridPanel = new JPanel();
 
        buttonGridPanel.setLayout(new GridLayout(max_rows, max_cols));
//            buttonGrid = new JToggleButton[max_cols][];
        int r = 100;
        for (int i = 0; i < max_cols; i++) {
            buttonGrid[i] = new JToggleButton[max_rows];
            for (int j = 0; j != max_rows; j++) {
                int z = r + j;
                buttonGrid[i][j] = new JToggleButton("" + (z + 1));
                //botton statement is
                buttonGrid[i][j].setSelected(true);
                buttonGrid[i][j].addActionListener(new ActionListener() {
 
                    public void actionPerformed(ActionEvent e) {
                        //Execute when button is pressed
                        AbstractButton abstractButton = (AbstractButton) e.getSource();
                        if (abstractButton.isEnabled()) {
                            abstractButton.setBackground(Color.red);
                        }
 
                    }
                });
//                    buttonGrid[i][j].addItemListener(new ItemListener() {
//                        public void itemStateChanged(ItemEvent e) {
//                            AbstractButton abstractButton = (AbstractButton) e.getSource();
//                            
//                            if (abstractButton.isEnabled()){
//                                abstractButton.setBackground(Color.red);
//                            }
//
//                        }
//                    });
                buttonGridPanel.add(buttonGrid[i][j]);
            }
            r = r + 100;
 
        }
 
        JScrollPane scroll3 = new JScrollPane(buttonGridPanel);
        scroll3.setPreferredSize(new Dimension(400, 500));
        roomPanel.add(scroll3, BorderLayout.SOUTH);
 
    }
 
    public void date() {
        datePanel = new JPanel();
        datePanel.setLayout(new BorderLayout());
        DateFormatSymbols symbols = new DateFormatSymbols(Locale.ENGLISH);
        String days[] = symbols.getWeekdays();
        SpinnerModel in = new SpinnerDateModel();
        JSpinner spinnerIn = new JSpinner(in);
        SpinnerModel out = new SpinnerDateModel();
        JSpinner spinnerOut = new JSpinner(out);
 
        GridBagLayout layout = new GridBagLayout();
        JPanel contentPane = new JPanel(layout);
        GridBagConstraints gc = new GridBagConstraints();
 
        gc.insets = new Insets(4, 4, 4, 4);
        gc.gridx = 1;
        gc.gridy = 1;
        contentPane.add(new JLabel("Check In Date:"), gc);
 
        gc.insets = new Insets(4, 4, 4, 4);
        gc.gridx = 2;
        gc.gridy = 1;
        contentPane.add(spinnerIn, gc);
 
        gc.insets = new Insets(4, 4, 4, 4);
        gc.gridx = 1;
        gc.gridy = 2;
        contentPane.add(new JLabel("Check Out Date:"), gc);
 
        gc.insets = new Insets(4, 4, 4, 4);
        gc.gridx = 2;
        gc.gridy = 2;
        contentPane.add(spinnerOut, gc);
 
        datePanel.add(contentPane);
    }