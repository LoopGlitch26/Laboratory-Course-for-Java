
// Program Power calculates a value to a power

import java.awt.*;         // Supplies layout manager
import java.awt.event.*;   // Supplies event classes
import javax.swing.*;      // Supplies class JApplet
import java.util.*;        // Supplies class Scanner
import java.applet.*;	  // Supplies class Applet

public class Power extends JApplet implements ActionListener
{
  public void actionPerformed(ActionEvent event)
  {
    int base;
    int exponent;
    int result;
    String inValue = inputField.getText();
    Scanner in = new Scanner(inValue);
    base = in.nextInt();
    exponent = in.nextInt();
   
    if (exponent == 0)
    	result = 1;
    else
    	result = base;
    for (int count = 2; count <= exponent; count++)
    	result = result * base;
    outLabel.setText(base + " to the power of " + exponent + " is " 
    	+ result);   
    inputField.setText("");  // Set input string back to null
  }
  // Setting up a button
  private static JTextField inputField; 
  private static JLabel outLabel;

  public void init()
  {
    JLabel label;
    label = new JLabel("Enter base, blank, exponent."); 
    outLabel = new JLabel("Answer");   
    inputField = new JTextField("Values here");
    
    JButton button; 
    button = new JButton("Enter");
    button.addActionListener(this);
    
    add(label);

    add(inputField);
    add(button);
    add(outLabel);

    //Specify a layout manager 
    setLayout(new GridLayout(0,1)); 

  }
}

