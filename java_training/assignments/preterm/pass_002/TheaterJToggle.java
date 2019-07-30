import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TheaterJToggle {

    private int rows = 10;
    private int columns = 10;
    private Icon res = (UIManager.getIcon("OptionPane.errorIcon"));

    public TheaterJToggle() {
        JPanel panel = new JPanel(new GridLayout(columns, rows));
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                 String mlb = "<html>" + "Vacant:" + "<br>" + "Row " + row +" Seat " + column
 + "</html>";
				final JToggleButton button = new JToggleButton(mlb);
                button.addActionListener(new ActionListener() {

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
        final JFrame frame = new JFrame("JToggleButton Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocation(150, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                TheaterJToggle theaterJToggle = new TheaterJToggle();
            }
        });
    }
}