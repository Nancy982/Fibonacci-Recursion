//Name: Nancy Medina
//Date: 11/18/18
//Description: lab 8
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FibonacciRecursionGUI extends JFrame {

  
   //private fields 
   private JPanel panel;
   private JButton button1;
   private JLabel label1;
   private JLabel label2;
   private JTextField textField1;
   private JTextField textField2;
   private JTextArea display;
    
   private int numInvocations = 0;
   private final int WINDOW_WIDTH = 350;
   private final int WINDOW_HEIGHT = 260;
    
    // Components
   public FibonacciRecursionGUI() {
      // Set the window title
      setTitle("Fibonacci series");
      
      // Build a panel and add it to the frame
      buildPanel();
      
      // Add the panel to the frame's contect pane
      add(panel);
      
      // Set the size of the window
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      // Declare what happens when the close button is clicked
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Display the window
      setVisible(true);
   }

    ////The buildPanel method adds a label, a text field, and a button to a panel
   private void buildPanel() {
       
   
      button1 = new JButton ("Calculate Fibonacci Number");
      ActionListener button = new ButtonListener();
      
   
      
      label1 = new JLabel("Which Fibonacci Number: ");
      label2 = new JLabel("The Fibonacci Number: ");
      
      textField1 = new JTextField(5);
      textField2 = new JTextField(5);
      textField2.setEditable(false);
      
      display = new JTextArea(5,15);
      display.setEditable(false);
      
      JScrollPane scroll = new JScrollPane(display);
      scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      
      // Create a JPanel object and let the panel field reference it.
      panel = new JPanel();
      textField1 = new JTextField(10);
      button1 = new JButton("Calculate Fibonacci Number");
      
      // Need to add an action listener to the button.
      button1.addActionListener(new ButtonListener());
      label2 = new JLabel("The Fibonacci Number: ");
      textField2 = new JTextField(10);
      scroll = new JScrollPane(display);
      
      // Add the labels, text fields, and button to panel.
      panel.add(label1);
      panel.add(textField1);
      panel.add(button1);
      panel.add(label2);
      panel.add(textField2);
      panel.add(scroll);
      
            
   }

    // fibonacci recursive method
   public int fibonacci(int n) {
      numInvocations++;
      display.append("invocation " + numInvocations + "\n");
      if(n == 0){
         return 0;
      } else if(n == 1){
         return 1;
      } else {
         return fibonacci(n - 1) + fibonacci(n - 2);
      }
   }

   // the inner class, the action listener
   private class ButtonListener implements ActionListener {
   
      public void actionPerformed(ActionEvent e) {
          
         //int fibonacci123;
         int fibonacci123 = Integer.parseInt(textField1.getText());
         int fibNum = fibonacci(fibonacci123);
          
            
         String number = Integer.toString(fibNum);
         textField2.setText(number);
            
      }
   }

   // the main method
   public static void main(String[] args) {
      FibonacciRecursionGUI fibonacci = new FibonacciRecursionGUI();
   }
}
      
