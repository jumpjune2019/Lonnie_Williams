import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutChallenge extends JFrame {

  public static void main(String[] args) {
    int rows = 10;
    int cols = 10;
	GridLayoutChallenge gt = new GridLayoutChallenge(rows, cols);
    gt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gt.pack();
    gt.setVisible(true);
  }

  public GridLayoutChallenge(int rows, int cols) {
    Container pane = getContentPane();
    pane.setLayout(new GridLayout(rows, cols));
    for (int i = 0; i < 100; i++) {
      JButton button = new JButton(Integer.toString(i + 1));
      pane.add(button);
    }
  }
}