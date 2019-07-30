package pass002;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Pass002 {
  public static void main(String args[]) {
    String labels[] = { "A. Mellor-01", "A. Schalk-02", "A. Storey-03", "A. Montgomery-04", "A. Leighton-05", "B. Cedillo-06", 
    		"C. Catzin-07", "D. De Hoyas-08", "D. Loughran-08", "D. Sobers-09", "D. Hunter-10", "E. Buchanan-11", "I. Silva-12", 
    		"J. Guevara-13", "J. Mills-14", "J Pantiag-16", "J. Chacko-17", "L. Williams-18", "M. John-19", "R. Kirk-20", "H. Mao-21", 
    		"T. Hank-22", "V. Chielemski-23", "Y. Ubak-24", "C. Gauthier-25" };
    JFrame frame = new JFrame("Preterm Part 2");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane1 = frame.getContentPane();

    JList<?> jlist = new JList<Object>(labels);
    JScrollPane scrollPane1 = new JScrollPane(jlist);
    contentPane1.add(scrollPane1, BorderLayout.WEST);
    
    ListSelectionListener listSelectionListener = new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent listSelectionEvent) {
        boolean adjust = listSelectionEvent.getValueIsAdjusting();
        if (!adjust) {
          JList<?> list = (JList<?>) listSelectionEvent.getSource();
          int selections[] = list.getSelectedIndices();
          @SuppressWarnings("deprecation")
		Object selectionValues[] = list.getSelectedValues();
          for (int i = 0, n = selections.length; i < n; i++) {
            if (i == 0) {
            	System.out.print("Reservation processing... ");
            	System.out.print("Seat Reserved: ");
            }
            System.out.print(selections[i] + "  " + selectionValues[i] + " ");
          }
          System.out.println();
        }
     }
    };
    EventQueue.invokeLater (new Runnable() {
          @Override
          public void run() {
              new TheaterJToggle(frame);
          }
      });
    jlist.addListSelectionListener(listSelectionListener);

    MouseListener mouseListener = new MouseAdapter() {
      public void mouseClicked(MouseEvent mouseEvent) {
        JList<?> theList = (JList<?>) mouseEvent.getSource();
        if (mouseEvent.getClickCount() == 2) {
          int index = theList.locationToIndex(mouseEvent.getPoint());
          if (index >= 0) {
            Object o = theList.getModel().getElementAt(index);
            System.out.println("Double-clicked on: " + o.toString());
          }
        }
      }
    };
    jlist.addMouseListener(mouseListener);

    frame.setSize(350, 200);
    frame.setVisible(true);
  }
}

class TheaterJToggle {

    private int rows = 10;
    private int columns = 10;
    public TheaterJToggle(JFrame newFrame) {
        JPanel panel = new JPanel(new GridLayout(columns, rows));
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                 String mlb = "<html>" + "Vacant:" + "<br>" + "Row " + row +" Seat " + column + "</html>";
				final JToggleButton button = new JToggleButton(mlb);
                button.addActionListener((ActionListener) new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                        boolean selected = abstractButton.getModel().isSelected();
                        if (selected) {
                            button.setText("Book");
                        } else {
                            button.setText("Unbook");
                        }
                    }
                });
                panel.add(button);
            }
        }
        
        final JFrame frame = newFrame;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JScrollPane scrollPane2 = new JScrollPane(panel);
        Container contentPane1 = frame.getContentPane();
        contentPane1.add(scrollPane2, BorderLayout.EAST);
        frame.pack();
        frame.setLocation(150, 150);
        frame.setVisible(true);
        frame.validate();
    }

	
}