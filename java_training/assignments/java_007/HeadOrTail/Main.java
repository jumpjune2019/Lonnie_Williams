import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class Main implements ActionListener {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public GridLayoutDemo(){
      prepareGUI();
      HeadOrTail ht = new HeadOrTail(); //create instance 
   }
   
   private void prepareGUI(){
      mainFrame = new JFrame("Grid Layout Example");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        
      statusLabel.setSize(350,100);
      
      // old school way to close a window
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
             // this is the way to force a java application to gracefully exit
        	 // when not going to end via the main method entry point
        	 System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   
   private void showGridLayoutDemo() throws NullPointerException {
      headerLabel.setText("Heads or Tails Game");      
      statusLabel.setText("Press a button, I dare you...");
      JPanel panel = new JPanel();
      panel.setBackground(Color.GREEN);
      panel.setSize(200,200);
      GridLayout layout = new GridLayout(1,2);
      layout.setHgap(10);
      layout.setVgap(10);
      panel.setLayout(layout);
      int length = 2;
      
	  JButton f = new JButton("Flip");
	  JButton p = new JButton("Pause");
	  
	  f.addActionListener(this);
	  p.addActionListener(this);
	  panel.add(f);
	  panel.add(p);
      
      controlPanel.add(panel);
      mainFrame.setVisible(true);  
   }
 
   public void actionPerformed(ActionEvent ae) {
	   statusLabel.setText(ae.getActionCommand());
   }
   
   public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GridLayoutDemo gridLayoutDemo = new GridLayoutDemo();  
			    gridLayoutDemo.showGridLayoutDemo();
			}
		});      
   }
}