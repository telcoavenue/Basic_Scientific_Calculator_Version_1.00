
/*
 *
 * Author: Constantinos < tinoC23 /> Constantinou
 * Program: Basic Scientific Calculator - version 1.00
 * Basic Scientific Calculator - version 1.00 - released on the: 21-07-2015
 *
 */
 
 			/*
			 *
			 *Explanation of the logic, behind the Basic Scientific Calculator Version 1.00 ... 
			 *
			 *Let assume that upon the program start - up, the user request the result of the following eguation:
			 *
			 *      3.334 * sin 67.89 + cos 0.00
			 *
			 *The calculator will perform the following:
			 *
			 * a) The sin symbol, will be stored in the dNUMsymbols[] array, in the memory [0] of the array and the cos symbol, 
			 *    will be stored in the memory[1] of the dNUMsymbols[] array
			 *
			 * b) The str string will store the following: 3.334 *  67.89 +  0.00 
			 * 
			 * c) The str will be tokenized accorting to the following symbols: +, -, *, / .
			 *    For instance, the number 3.334, 67.89, 0,00 will be stored on the numD[] array
			 *
			 *    The numrslt[] array will copy the contents of the numD[] array.
			 *
			 * d) The  symbols[] array, will store the following: *, +
			 * 
			 *    *** Caution: If the user enter more thatn three symbols( +, -, *. / ), then an error message will be displayed on a JOptionPane
			 *                 and therefor the calculator screen will erase the previous calculation, and the calculator buttons will be disabled.
			 *
			 *  The calculator can handle multible eguations, but the testing have been performed in a maximum of three eguations.
			 *  Each eguation is characterized by a symbol, either the +, -, /, or * .
			 * 
			 * e) At first, the sin 67.89 and the cos 0.00 are calculated through a switch() statement.
			 *    In essence, the sin 67.89 and the cos 0.00 is the following:
			 *    
			 *     sin 67.89 : dNUMsymbols[1] , numrslt[1]
			 *     cos 0.00 : dNUMsymbols[2] , numrslt[2]
			 *
			 *     The seperated result of the sin 67.89 and of the cos 0.00 will be stored in the numrslt[] array, along with the number 3.334
			 *
			 *  f) the double number result, will store the final calculation result.
			 *     The final calculation result is processed in a seperate switch statement, that process the result array numbers,
			 *     according to the symbols[] array contents.
			 *
			 *  g) The calculator display the result of the calculation, on the calculator screen. 
			 *
			 *
			 */
			 
			 /*
			  *JButtons code explanation ....
			  *
			  *The above explanation, is applicable to all JButtons of the program ....
			  *
			  *The example below, explains the code behind the cos sign button ....
			  *
			  */
		/*
		 *
	   cos=new JButton("cos"); // create a jbutton named cos  
	   	cos.setFont(f);// set the font value of the cos button, to the font f ....
	   		cos.setToolTipText("cos"); // set tool tip text for the jbutton, in order for the program, to quide more efficient the program user
	cos.setBorder(new SubtleSquareBorder(true));// set the shape of the jbutton
	cos.setBackground(color);// set the backround color of the jbutton
	randomColor = new Color(r, g, b);// set a random color
	randomColor=randomColor.brighter(); // make brighter the random color 
	cos.setForeground(randomColor);// set the foreground color of the jbutton 
	cos.setActionCommand("cos");// set an action command for the jbutton
	cos.addActionListener(         // add anaction listener 
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)       // add an action event .....
			{
				
				Font font=null;// null the font 
				
			if("cos".equals(e.getActionCommand())) 
			{
				
	
	dNUMsymbolsCounter++;// increment the  dNUMsymbolsCounter
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))// clear 
				{
					
					clc=" ";// clear clc string 
	  TA.setText( clc );// clear the text "CALCULATOR ACTIVATED !!!", on the calculator screen .... 
	  
	  
	  calculationCarrier=calculationCarrier.concat("cos ");// add the word cos on the calculator screen 
			 clc=clc.concat("");// add an additional character on the clc string
			 
			 	dNUMsymbols[dNUMsymbolsCounter]="cos";// add the scientific symbol on the dNUMsymbols[] array .... 
			 
		TA.setText( calculationCarrier );// add text to the calculator screen
			font = new Font("Serif", Font.PLAIN, 18);// add font 
			TA.setFont(font);// set the font of the calculator screen
	  
						
				}
				else
				{
					
					alculationCarrier=calculationCarrier.concat("cos ");// add the word cos on the calculator screen 
			 clc=clc.concat("");// add an additional character on the clc string
			 
			 dNUMsymbols[dNUMsymbolsCounter]="cos";// add the scientific symbol on the dNUMsymbols[] array ....
			 
			 
		TA.setText( calculationCarrier );// add text to the calculator screen
			font = new Font("Serif", Font.PLAIN, 18);// add font 
			TA.setFont(font);// set the font of the calculator screen
					
				}
				
							
				
			}
			
			}
		});
	   sciCLC.add(cos);// add cos to the sciCLC jpanel
	   
	   //=========================================================================================
	   */
 
 // imported classes space ........ 
 
 import java.lang.ArrayIndexOutOfBoundsException;
 
 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;

import java.awt.event.*;

 import javax.swing.Popup;

import java.awt.event.MouseMotionListener;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import java.lang.Object;
import java.util.StringTokenizer;
import java.lang.Math;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;

import javax.swing.JTextArea;

import javax.swing.JColorChooser;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;
import java.lang.NumberFormatException;
import java.lang.ArithmeticException;
import java.lang.RuntimeException;

import java.awt.Graphics;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.JRadioButton;

import javax.swing.ButtonGroup;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JLabel;

import javax.swing.border.*;

// imported classes space ........ 

public class Driver extends JFrame
{
	
	//
	
	private String str=""; // carries a string that includes all the numbers entered by the user through the calculator 
	                       // for example, if the user enters 13.3 + sin 3 - 0.01 , then the str string, will carry the following, 
	                       // 13.3 + 3 - 0.01
	
	//
	
		private static int key;// it is used, in order for the calculator to know, the calculation mode that should be displayed.
		                       // If key == 0, the arithmetic calculator is displayed, if key ==1, then the scientific calculator is displayed
    
    			private double rslt=0.0; //  it is not used
			
			private String handler=" "; // it is not used
    
    		    private int m=0; // it is not used
				
				private String hint=" "; // it is not used
			
			private String [] chars=new String[5];// used in the calculation of the final result
			
			private double [] db=new double[6];// it is not used
			
			private String symbol=" ";// used in the calculation of the final result
			
			private String temp=" "; // used in the calculation of the final result
			
	private double num1,num2,num3, num4,num5, num6, result=0; // the doubles num1,num2, num3,num4, num5 and num 6 are not used by the program.
	                                                          // the doule result, carries the final calculation that will be displayed on the calculator screen
	
	private double [] numD=new double[6]; // used in the calculation of the final result
	
	private double [] n2t=new double[6];// used in the calculation of the final result
	
			private int j=0; // it is not used
			
   		private double [] numrslt=new double[6]; // it is used in order to carry the total sum of numbers included in the str string
	
	private int count=0;// counts the times that the buttons: +, -, *, / , are pressed 
	
	private String calculationCarrier=" ";// responsible to carry the text that will be displayed on the jtextarea(calculator screen)
	
	private String clc=" "; // responsible to carry the text that will be displayed on the jtextarea(calculator screen)
	
	private	String [] dNUM=new String [6]; // an array that carries the numbers entered by the user, but it is not carrie the double value numbers( ex. 2.22 ) 
	                                       // It is not used by the program
	
		private	int dNUMcounter=-1; // counts the total number of the number buttons pressed by the user
		                            // it is start with the value of -1, in order for the array of dNUM[] to store numbers properly
		                            // it is driving the dNUM[] array cells, in order to store numbers properly, with the correct order.
		                            // For example, if the user press the number 1, then the dNUMcounter increments to 0, and the
		                            // dNUM[dNUMcounter] eguals to 1.
		                            // It is not used by the program
	
		private	String [] dNUMsymbols=new String [6]; // carries the following scientific symbols: sin, tan, cos, sqrt, cbrt, e, expm1, log10, log, log1p 
	
	private	int dNUMsymbolsCounter=-1; // it is start with the value of -1, in order for the array of dNUMsymbols[] to store the scientific symbols properly
		                            // it is driving the dNUMsymbols[] array cells, in order to store scientific symbols properly, with the correct order.
		                            // For example, if the user press the sqrt button, then the dNUMsymbolsCounter increments to 0, and the
		                            // dNUMsymbols[dNUMsymbolsCounter] eguals to the appropriate scientific symbol.
		                            
	
	private	String [] symbols=new String [5]; // carries the following calculation symbols: +, - , /, *   
	
	private	int symbolsCOUNTER=-1; // it is start with the value of -1, in order for the array of symbols[] to store calculation symbols properly
		                            // it is driving the symbols[] array cells, in order to store calculation symbols properly, with the correct order.
		                            // For example, if the user press the calculation symbol '+' , then the symbolsCOUNTER increments to 0, and the
		                            // symbols[symbolsCOUNTER] eguals to  '+' .
		                            
	
   	//
	
 private	JLabel infoJLabel; // add a jlabel on the program  
	
		
	//Buttons code goes here
	
	private JButton Button0; // adds the number 0 to the str string
	private JButton Button1;// adds the number 1 to the str string
	private JButton Button2;// adds the number 2 to the str string
	private JButton Button3;// adds the number 3 to the str string
	private JButton Button4;// adds the number 4 to the str string
	private JButton Button5;// adds the number 5 to the str string
	private JButton Button6;// adds the number 6 to the str string
	private JButton Button7;// adds the number 7 to the str string
	private JButton Button8;// adds the number 8 to the str string
	private JButton Button9;// adds the number 9 to the str string
	
	private JButton ButtonPlus;// provides the addition property to the calculator
	private JButton ButtonMinus;// provides the substraction property to the calculator
	private JButton ButtonMul;// provides the multiplication property to the calculator
	private JButton ButtonDiv;// provides the division property to the calculator
	private JButton ButtonClear; // clear the final calculated value ; clears the values carried on the calculator screen
	private JButton ButtonAnswear;// provides the eguation result property to the calculator
	
		private JButton dotSign; // returns the creation of a double  number
		private JButton leftBrucket;// Returns Euler's number e raised to the power of a double value of a given number
		private JButton rightBrucket;//Returns the natural logarithm (base e) of a double value of a given number
		private JButton sqrt; // returns the square root of a given number
		
		
		
			//=========================================================================================
	
	private JButton sin;// Returns the trigonometric sine of an angle of a given number
	private JButton tan;// Returns the trigonometric tangent of an angle of a given number
	private JButton cos;// returns the trigonometric cosine of an angle of a given number
	private JButton cbrt;// returns the cubic root of a given number
	
		private JButton expm1;// Returns Euler's number e raised to the power of a double value - 1, of a given number
	private JButton log10;// Returns the base 10 logarithm of a double value of a given number
	private JButton log1p;// Returns the natural logarithm of the sum of the argument and 1 of a given number

	
	
	private JButton on; // activates calculator
		private JButton off; // de-activates calculator
		
		
			//=========================================================================================
	
	private JMenuBar textEditorMenu; // creater a jmenu bar for the program
	
       private JMenu MENU;
	       private JMenu ABOUT;
	       
	      	//=========================================================================================
	      	
	     
	      	
	      		private static JTextArea TA; //calculations screen of the calculator 
	      		
	
	//
	
	private Color color=Color.GRAY;
	
	private Color randomColor;
	
	//
	
	private JRadioButton clc1;
	
	private JRadioButton clc2;
	
	private ButtonGroup BG;
	
	//
			
			//
	
	public Driver()
	{
		
		//call to super class 
		
		super(" Basic Scientific Calculator - Version: 1.00 -"); // returns the title of the program in the JFrame window
		
		// init 
		
			for(int i=0;i<numD.length;i++)
			{
				
				numD[i]=0;
				
			}
		
			//=========================================================================================
		
		//initialize JPanels
		//
		
		
		JPanel header= new JPanel(); // creates the jpanel responsible to carry the menu of the program
		
		JPanel onoff=new JPanel(); // creates the jpanel that carries the on, off, and clear(CE) buttons
		
		JPanel sciCLC=new JPanel(); // Creates the jpanel that carries the scientific calculations buttons, which is the following
		                            // cos, sin, tan, sqrt, cbrt, e, expm1, log10, log, log1p
		
		JPanel panel1 = new JPanel();//not used
		
        JPanel panel2 = new JPanel();// carrie the arithmetic calculator symbols 
		
		JPanel carrier=new JPanel();// carrie theheader, onoff, sciCLC, panel JPanels
		
			JPanel carrier2=new JPanel();//not used
	

				 header.setLayout(new FlowLayout(FlowLayout.LEFT));// set header layout 
	
			header.setBackground(color);// set header bg color
			
			onoff.setLayout( new GridLayout(1,3,5,5)); // set on-off layout
			onoff.setBackground(color); // set on-off bg color 
			
			 sciCLC.setLayout(new GridLayout(2,5,5,5));// set sciCLC layout
			sciCLC.setBackground(color);// set sciCLC bg color
		
		// not used
		 panel1.setLayout(new FlowLayout(FlowLayout.CENTER));// set panel1 layout 
		panel1.setBackground(color);// set panel1 bg color
		
		 panel2.setLayout(new GridLayout(4,4,5,5));// set panel2 layout 
		panel2.setBackground(color);// set panel2 bg color
		 
		carrier.setLayout((new BoxLayout( carrier, BoxLayout.Y_AXIS)));// set carrier layout 
			carrier.setBackground(color);// set carrier bg color
			
			// not used
			carrier2.setLayout(new FlowLayout(5,5,5));// set carrier2 layout 
			carrier2.setBackground(color);// set carrier2 bg color
		
		//=========================================================================================
	
		//=========================================================================================
				
		//    Create the menu bar   
		
        textEditorMenu = new JMenuBar();
		
				//=========================================================================================

        //Build the first menu.
        
        MENU = new JMenu("MENU");
		MENU.setForeground(Color.BLACK);
		
		//Build the second menu.
		
	ABOUT = new JMenu("HELP");
	ABOUT.setForeground(Color.BLACK); 
			
		 textEditorMenu.add(MENU);
		
		//=========================================================================================

// creates a random r-b-g color

Random rand = new Random();

float r = rand.nextFloat();
float g = rand.nextFloat();
float b = rand.nextFloat();



	//=======================================================
	
		
	// calculator option: change jframe backround color, buttons backround and foreground color through a JColorChooser ...   
	
	   JLabel BGColor=new JLabel("Change Calculator Background Color");// set jlabel text
	   BGColor.setBackground(Color.WHITE);// set jlabel background
	   BGColor.setForeground(Color.BLACK);//set jlabel foreground
	BGColor.setEnabled(true);//set enable the jlabel
	      BGColor.addMouseListener(new MouseAdapter() //the mouse listener, handles the mouse entered and mouse exited classes
	{
         Color oldcolor = BGColor.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.CYAN;
				
            BGColor.setForeground(c.brighter());
         }
         public void mouseExited(MouseEvent me) 
	 {
          BGColor.setForeground(oldcolor);
         }
      }
      );
	BGColor.addMouseListener(new MouseAdapter() // allows to the user to change jframe backround color, buttons backround and foreground color through a JColorChooser ...  
	{
		 public void mousePressed(MouseEvent e)
		 	{
		 		
		 	color =JColorChooser.showDialog(Driver.this,"choose a background color",color);	
		 		
				if( color == null )
				{
					// initial color values
			header.setBackground(Color.blue);
		panel1.setBackground(Color.blue);
		panel2.setBackground(Color.blue);
			carrier.setBackground(Color.blue);	
				
				}
				else//custom color values ;;; color choosed from the JColorChooser
				{   // you are welcome to try a for loop ; 
				    // it changes the jframe backround color, buttons backround and foreground color for all the buttons on the calculator 
					
					header.setBackground(color);
		panel1.setBackground(color);
		panel2.setBackground(color);
			carrier.setBackground(color);
				
				randomColor = new Color(r, g, b);
				 Button1.setBackground(color);
				 randomColor=randomColor.brighter();
	Button1.setForeground(randomColor);
	
		randomColor = new Color(r, g, b);
	Button2.setBackground(color);
	randomColor=randomColor.brighter();
	Button2.setForeground(randomColor);
	
		randomColor = new Color(r, g, b);
	Button3.setBackground(color);
	randomColor=randomColor.brighter();
	Button3.setForeground(randomColor);
	
	randomColor = new Color(r, g, b);
	Button4.setBackground(color);
	randomColor=randomColor.brighter();
	Button4.setForeground(randomColor);
	
	randomColor = new Color(r, g, b);
	Button5.setBackground(color);
	randomColor=randomColor.brighter();
	Button5.setForeground(randomColor);
	
	randomColor = new Color(r, g, b);
	Button6.setBackground(color);
	randomColor=randomColor.brighter();
	Button6.setForeground(randomColor);
	
	randomColor = new Color(r, g, b);
	Button7.setBackground(color);
	randomColor=randomColor.brighter();
	Button7.setForeground(randomColor);
	
	randomColor = new Color(r, g, b);
	Button8.setBackground(color);
	randomColor=randomColor.brighter();
	Button8.setForeground(randomColor);
	
	randomColor = new Color(r, g, b);
	Button9.setBackground(color);
	randomColor=randomColor.brighter();
	Button9.setForeground(randomColor);
	
		randomColor = new Color(r, g, b);
	Button0.setBackground(color);
	randomColor=randomColor.brighter();
	Button0.setForeground(randomColor);
	
	randomColor = new Color(r, g, b);
	ButtonPlus.setBackground(color);
	randomColor=randomColor.brighter();
	ButtonPlus.setForeground(randomColor);
	
	randomColor = new Color(r, g, b);
	ButtonMinus.setBackground(color);
	randomColor=randomColor.brighter();
	ButtonMinus.setForeground(randomColor);
	
	randomColor = new Color(r, g, b);
	ButtonMul.setBackground(color);
	randomColor=randomColor.brighter();
	ButtonMul.setForeground(randomColor);
	
	randomColor = new Color(r, g, b);
	ButtonDiv.setBackground(color);
	randomColor=randomColor.brighter();
	ButtonDiv.setForeground(randomColor);
	
		randomColor = new Color(r, g, b);
	ButtonClear.setBackground(color);
	randomColor=randomColor.brighter();
	ButtonClear.setForeground(randomColor);
	
		randomColor = new Color(r, g, b);
	ButtonAnswear.setBackground(color);
	randomColor=randomColor.brighter();
	ButtonAnswear.setForeground(randomColor);
	
		randomColor = new Color(r, g, b);
	dotSign.setBackground(color);
	randomColor=randomColor.brighter();
	dotSign.setForeground(randomColor);
	
		randomColor = new Color(r, g, b);
leftBrucket.setBackground(color);
randomColor=randomColor.brighter();
	leftBrucket.setForeground(randomColor);
	
		randomColor = new Color(r, g, b);
rightBrucket.setBackground(color);
randomColor=randomColor.brighter();
	rightBrucket.setForeground(randomColor);
	
		randomColor = new Color(r, g, b);
	sqrt.setBackground(color); 
	randomColor=randomColor.brighter();
	sqrt.setForeground(randomColor);
	

	
	
		randomColor = new Color(r, g, b);
	sin.setBackground(color); 
	randomColor=randomColor.brighter();
	sin.setForeground(randomColor);
	
	
	
	
		randomColor = new Color(r, g, b);
	tan.setBackground(color); 
	randomColor=randomColor.brighter();
	tan.setForeground(randomColor);
	
	
	
	
		randomColor = new Color(r, g, b);
   cos.setBackground(color); 
	randomColor=randomColor.brighter();
	cos.setForeground(randomColor);
	
	
	
		randomColor = new Color(r, g, b);
	cbrt.setBackground(color); 
	randomColor=randomColor.brighter();
	cbrt.setForeground(randomColor);
	
	
			randomColor = new Color(r, g, b);
	expm1.setBackground(color); 
	randomColor=randomColor.brighter();
	expm1.setForeground(randomColor);
		
		
		
		randomColor = new Color(r, g, b);
	log10.setBackground(color); 
	randomColor=randomColor.brighter();
	log10.setForeground(randomColor);
	
	
		randomColor = new Color(r, g, b);
	log1p.setBackground(color); 
	randomColor=randomColor.brighter();
	log1p.setForeground(randomColor);
	
	
		randomColor = new Color(r, g, b);
	on.setBackground(color); 
	randomColor=randomColor.brighter();
	on.setForeground(randomColor);
	
	
	
		
			randomColor = new Color(r, g, b);
	 off.setBackground(color); 
	randomColor=randomColor.brighter();
	 off.setForeground(randomColor);
		 		
		 		
		 		
					}  }  }   );  
      MENU.add(BGColor);//add to menu
      MENU.add(new JSeparator());//add a seperator line
		
			//=========================================================================================

   JLabel i=new JLabel("calculator function");//show arithmetic calculator modes of operation ... 
   i.setEnabled(true);
	i.setVisible(true);
   randomColor = new Color(r, g, b);
   randomColor=randomColor.brighter();
	 i.setForeground(randomColor);
	 i.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor = i.getForeground();
        public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.BLUE;
          i.setForeground(c.brighter());
         }
     public void mouseExited(MouseEvent me) 
	 {
         i.setForeground(oldcolor);
         }
      }
      );
      
      //
	
	clc1=new JRadioButton("Basic Calculator",false); // disabled by default ;;;; displays only the basic calculator panel of the calculator .... 
	clc1.setEnabled(true);
	clc1.setVisible(true);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	 clc1.setForeground(randomColor);
	 clc1.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor = clc1.getForeground();
        public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.GRAY;
          clc1.setForeground(c.brighter());
         }
     public void mouseExited(MouseEvent me) 
	 {
         clc1.setForeground(oldcolor);
         }
      }
      );
      	clc1.addActionListener(
		new ActionListener()
		{
			 @Override
			public void actionPerformed(ActionEvent e)
			{
				
					// additional code goes here 
					
				sciCLC.setVisible(false);
				
			
               	carrier.remove(sciCLC);
                   
                carrier.revalidate();
                carrier.repaint();
                Driver.this.pack();
			 
				key=0;
				
			
			}});
      
      
      //
	
	clc2=new JRadioButton("Scientific Calculator",true);// enabled by default ;;; enables the scientific panel of the application .... 
	clc2.setEnabled(true);
	clc2.setVisible(true);
	randomColor=randomColor.brighter();
	 clc2.setForeground(randomColor);
	 clc2.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor = clc2.getForeground();
        public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.GRAY;
          clc2.setForeground(c.brighter());
         }
     public void mouseExited(MouseEvent me) 
	 {
         clc2.setForeground(oldcolor);
         }
      }
      );
      clc2.addActionListener(
		new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
					
						key=1;
					
					if(key==1)
					{
						
					carrier.remove(panel2);
								
                carrier.add(sciCLC);
                
                carrier.add(panel2);
                carrier.revalidate();
                carrier.repaint();
              Driver.this.pack();
              
					
			sciCLC.setVisible(true);
			
		setSize(330,465);
			
					}
			
			
			}});
	
	BG = new ButtonGroup();// add buttongroup
	
	BG.add(clc1);// add clc1 to buttongroup
	
	BG.add(clc2);// add clc2 to buttongroup
	
			
			
	 MENU.add(i);// add jlabel to menu
	  MENU.add(clc1);// add clc1 to menu
	   MENU.add(clc2);// add clc2 to menu 
	MENU.add(new JSeparator());// add a separator line
	
		//=========================================================================================
	
	
	  infoJLabel=new JLabel("Information");
	infoJLabel.setBackground(Color.WHITE);
	 infoJLabel.setForeground(Color.BLACK);
	 infoJLabel.setEnabled(true);
	      infoJLabel.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =infoJLabel.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.ORANGE;
            infoJLabel.setForeground(c.brighter());
         }
         public void mouseExited(MouseEvent me) 
	 {
          infoJLabel.setForeground(oldcolor);
         }
      }
      );
 infoJLabel.addMouseListener(new MouseAdapter() 
{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
		 		
    try {
    	
        File file = new File("D:/program_with_comments_clc_v_1/Basic Scientific Arithmetic Calculator Manual.pdf");// open a pdf file with information regarding the program usage  .... 
    if (file.toString().endsWith(".pdf"))
    {
    
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file);
        
    }
    else {
        Desktop desktop = Desktop.getDesktop();
        desktop.open(file);
}
        
    } 
    	catch (IOException ex) 
    	{
    		
        	JOptionPane.showMessageDialog(null,"\n ERROR !!! \n File Requested not Found !!! \n","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);// file not found error message ... 
        
    }
    
		 		
        }
		
      }
      );
		ABOUT.add(infoJLabel);
			ABOUT.add(new JSeparator());
		
		

		//=========================================================================================
	  
	  
	  
	  
	  JLabel EXITPROGRAM=new JLabel("EXIT");
	  EXITPROGRAM.setBackground(Color.WHITE);
	   EXITPROGRAM.setForeground(Color.BLACK);
	 EXITPROGRAM.setEnabled(true);
	  EXITPROGRAM.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =EXITPROGRAM.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.GREEN;
           EXITPROGRAM.setForeground(c.brighter());
         }
         public void mouseExited(MouseEvent me) 
	 {
          EXITPROGRAM.setForeground(oldcolor);
         }
      }
      );
		EXITPROGRAM.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
		 		System.exit(0);
		 		
        }
		
      }
      );
	 MENU.add(EXITPROGRAM);
	 
	 
	 
	 		//=========================================================================================

		 		textEditorMenu.add(ABOUT);
				 
				 //=========================================================================================
				 
				 
				 
				 JLabel aboutME=new JLabel("About");
				 aboutME.setBackground(Color.WHITE); 
				aboutME.setForeground(Color.BLACK);
				aboutME.setEnabled(true);
   aboutME.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor = aboutME.getForeground();
        public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.RED;
          aboutME.setForeground(c.brighter());
         }
     public void mouseExited(MouseEvent me) 
	 {
         aboutME.setForeground(oldcolor);
         }
      }
      );
   aboutME.addMouseListener(new MouseAdapter() 
	{
		 public void mousePressed(MouseEvent e)
		 	{
		 		
		 		try {
    	
        File file = new File("D:/program_with_comments_clc_v_1/author.pdf");// opens a pdf file, that is displaying information for the program creator ... 
    if (file.toString().endsWith(".pdf")) 
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file);
    else {
        Desktop desktop = Desktop.getDesktop();
        desktop.open(file);
}
        
    } 
    	catch (IOException ex) 
    	{
    		
        	JOptionPane.showMessageDialog(null,"\n ERROR !!! \n File Requested not Found !!! \n","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);// file not found, error window .... 
        
    }
		 		
		 	
		 		
        }
		
      }
      );
	ABOUT.add(aboutME);
				 	 
					
					//=========================================================================================
					
					header.add(textEditorMenu); 
					
				//=========================================================================================
				// calculator screen implementation .... 
		
		TA=new JTextArea(" ");
			TA.setEditable(false);
			  TA.setPreferredSize(new Dimension(310,100));
			  TA.setMaximumSize(getPreferredSize());
		Border border = BorderFactory.createLineBorder(Color.BLACK);
        TA.setBorder(BorderFactory.createCompoundBorder(border, 
            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
            TA.setLineWrap(true);
               TA.setWrapStyleWord(false);
		TA.setFont(new Font("Serif",Font.PLAIN,20));
		panel1.add(TA);
		
		
	//=========================================================================================
		
			Font f = new Font("Serif", Font.BOLD, 14);// default application font type and size ... 
			
	Color randomColor2;// not used 
	
		
		//=========================================================================================
		
		//Buttons code goes here
		
		//=========================================================================================
		// activation button, of the calculator.
		// enables all the buttons, that are included on the calculator, if the buttons are disabled.
		// reset all the arrays values.
		// reset the values of the integer numbers, double numbers and strings .... 
		
		on=new JButton("ON");
			on.setFont(f);
			on.setToolTipText("Activate Calculator");
       on.setBorder(new SubtleSquareBorder(true));
	on.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	on.setForeground(randomColor);
	on.setActionCommand("ON");
	on.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if( "ON".equals(e.getActionCommand()) && on.isEnabled() && off.isEnabled() )
				{
					
					clc="CALCULATOR Already ACTIVATED !!!";
					
				TA.setText( clc );
				
				
				//==================================================================================
				
				
			for(int i=0;i<n2t.length;i++)
			{
				
				n2t[i]=0.0;
				
			}
			
			for(int i=0;i<numrslt.length;i++)
			{
				
				numrslt[i]=0.0;
				
			}
				
				num1=0; 
					
					num2=0; 
						
						num3=0; 
							
							num4=0; 
								
								num5=0; 
									
									num6=0; 
										
										m=0;
					
					result=0; 
					
					count=0; 
						
						str=" ";
					
					dNUMcounter=-1; 
						
						symbolsCOUNTER=-1; 
							
							dNUMsymbolsCounter=-1;
					
					for(int i=0;i<numD.length;i++)
					{
						
						numD[i]=0; 
						
					}
					
					for(int i=0;i<dNUMsymbols.length;i++)
					{
						
						dNUMsymbols[i]=" ";
						
					}
					
					for(int i=0;i<symbols.length;i++)
					{
						
						symbols[i]=" ";
						
					}
					
					for(int i=0;i<dNUM.length;i++)
					{
						
						dNUM[i]=" "; 
						
					}
					
					for(int i=0;i<db.length;i++)
					{
						
						db[i]=0; 
						
					}
					
		//==================================================================================
		
		System.gc();// release system resources ... 
				
				
				}
			else if("ON".equals(e.getActionCommand())) 
			{
				
				Button0.setEnabled(true);
			Button1.setEnabled(true);
			Button2.setEnabled(true);
			Button3.setEnabled(true);
			Button4.setEnabled(true);
			Button5.setEnabled(true);
			Button6.setEnabled(true);
			Button7.setEnabled(true);
			Button8.setEnabled(true);
			Button9.setEnabled(true);
			ButtonPlus.setEnabled(true);
			ButtonMinus.setEnabled(true);
			ButtonMul.setEnabled(true);
			ButtonDiv.setEnabled(true);
			ButtonAnswear.setEnabled(true);
			dotSign.setEnabled(true);
			
	leftBrucket.setEnabled(true);
		
		rightBrucket.setEnabled(true);
		
		 sqrt.setEnabled(true);
		 
	 sin.setEnabled(true);
	 tan.setEnabled(true);
	cos.setEnabled(true);
	
	 cbrt.setEnabled(true);
	 
	 expm1.setEnabled(true);
	 
   log10.setEnabled(true);
   
    log1p.setEnabled(true);
	 
	 off.setEnabled(true);
	 ButtonClear.setEnabled(true);
	 
	 
	 	
	 					//==================================================================================
				
				
			for(int i=0;i<n2t.length;i++)
			{
				
				n2t[i]=0.0;
				
			}
			
			for(int i=0;i<numrslt.length;i++)
			{
				
				numrslt[i]=0.0;
				
			}
				
				num1=0; 
					
					num2=0; 
						
						num3=0; 
							
							num4=0; 
								
								num5=0; 
									
									num6=0; 
										
										m=0;
					
					result=0; 
					
					count=0; 
						
						str=" ";
					
					dNUMcounter=-1; 
						
						symbolsCOUNTER=-1; 
							
							dNUMsymbolsCounter=-1;
					
					for(int i=0;i<numD.length;i++)
					{
						
						numD[i]=0; 
						
					}
					
					for(int i=0;i<dNUMsymbols.length;i++)
					{
						
						dNUMsymbols[i]=" ";
						
					}
					
					for(int i=0;i<symbols.length;i++)
					{
						
						symbols[i]=" ";
						
					}
					
					for(int i=0;i<dNUM.length;i++)
					{
						
						dNUM[i]=" "; 
						
					}
					
					for(int i=0;i<db.length;i++)
					{
						
						db[i]=0; 
						
					}
					
		//==================================================================================
			
	
	System.gc();// release system resources
				
				
				clc="CALCULATOR ACTIVATED !!!";
				
				TA.setText( clc );
				
				
			}
			
			}
		});
		onoff.add(on);
		
		//=========================================================================================
		
	 off=new JButton("OFF");
	 	off.setFont(f);
	 		off.setToolTipText("De-Activate Calculator");
	off.setBorder(new SubtleSquareBorder(true));
 off.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	off.setForeground(randomColor);
	off.setActionCommand("off");
		off.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if( "off".equals(e.getActionCommand()) && on.isEnabled() && !off.isEnabled() )
				{
					
					clc="CALCULATOR Already DEACTIVATED !!!";
					
				TA.setText( clc );
				
				
								//==================================================================================
				
				
			for(int i=0;i<n2t.length;i++)
			{
				
				n2t[i]=0.0;
				
			}
			
			for(int i=0;i<numrslt.length;i++)
			{
				
				numrslt[i]=0.0;
				
			}
				
				num1=0; 
					
					num2=0; 
						
						num3=0; 
							
							num4=0; 
								
								num5=0; 
									
									num6=0; 
										
										m=0;
					
					result=0; 
					
					count=0; 
						
						str=" ";
					
					dNUMcounter=-1; 
						
						symbolsCOUNTER=-1; 
							
							dNUMsymbolsCounter=-1;
					
					for(int i=0;i<numD.length;i++)
					{
						
						numD[i]=0; 
						
					}
					
					for(int i=0;i<dNUMsymbols.length;i++)
					{
						
						dNUMsymbols[i]=" ";
						
					}
					
					for(int i=0;i<symbols.length;i++)
					{
						
						symbols[i]=" ";
						
					}
					
					for(int i=0;i<dNUM.length;i++)
					{
						
						dNUM[i]=" "; 
						
					}
					
					for(int i=0;i<db.length;i++)
					{
						
						db[i]=0; 
						
					}
					
		//==================================================================================
		
		System.gc();// release system resources ... 
				
				
				}	
			else if("off".equals(e.getActionCommand())) 
			{
				
				Button0.setEnabled(false);
			Button1.setEnabled(false);
			Button2.setEnabled(false);
			Button3.setEnabled(false);
			Button4.setEnabled(false);
			Button5.setEnabled(false);
			Button6.setEnabled(false);
			Button7.setEnabled(false);
			Button8.setEnabled(false);
			Button9.setEnabled(false);
			ButtonPlus.setEnabled(false);
			ButtonMinus.setEnabled(false);
			ButtonMul.setEnabled(false);
			ButtonDiv.setEnabled(false);
			ButtonAnswear.setEnabled(false);
			dotSign.setEnabled(false);
			
		leftBrucket.setEnabled(false);
		rightBrucket.setEnabled(false);
		 sqrt.setEnabled(false);
		 
	 
	 sin.setEnabled(false);
	 tan.setEnabled(false);
	cos.setEnabled(false);
	 cbrt.setEnabled(false);
	 expm1.setEnabled(false);
   log10.setEnabled(false);
    log1p.setEnabled(false);

	 off.setEnabled(false);
	  ButtonClear.setEnabled(false);
	  
	  
	  	 				//==================================================================================
				
				
			for(int i=0;i<n2t.length;i++)
			{
				
				n2t[i]=0.0;
				
			}
			
			for(int i=0;i<numrslt.length;i++)
			{
				
				numrslt[i]=0.0;
				
			}
				
				num1=0; 
					
					num2=0; 
						
						num3=0; 
							
							num4=0; 
								
								num5=0; 
									
									num6=0; 
										
										m=0;
					
					result=0; 
					
					count=0; 
						
						str=" ";
					
					dNUMcounter=-1; 
						
						symbolsCOUNTER=-1; 
							
							dNUMsymbolsCounter=-1;
					
					for(int i=0;i<numD.length;i++)
					{
						
						numD[i]=0; 
						
					}
					
					for(int i=0;i<dNUMsymbols.length;i++)
					{
						
						dNUMsymbols[i]=" ";
						
					}
					
					for(int i=0;i<symbols.length;i++)
					{
						
						symbols[i]=" ";
						
					}
					
					for(int i=0;i<dNUM.length;i++)
					{
						
						dNUM[i]=" "; 
						
					}
					
					for(int i=0;i<db.length;i++)
					{
						
						db[i]=0; 
						
					}
					
		//==================================================================================
			
	
	System.gc();// release system resources ... 
	  
	  clc="CALCULATOR DEACTIVATED !!!";
	  TA.setText( clc );
				
			}
			
			}
		});
	 onoff.add(off);
	 
	 //=========================================================================================
	 
	 //=========================================================================================
		
	ButtonClear=new JButton("CE"); //clear button ;;; clears the screen values and prepair the calculator for another calculation ... 
	ButtonClear.setFont(f);
	ButtonClear.setBorder(new SubtleSquareBorder(true));
		ButtonClear.setToolTipText("Clear Screen Values");
	//
		ButtonClear.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
 ButtonClear.setForeground(randomColor);
		//
	ButtonClear.setActionCommand("clear");
		ButtonClear.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("clear".equals(e.getActionCommand())) 
			{
				
							TA.setText("");
							
				font = new Font("Serif", Font.PLAIN, 18);
				
			TA.setFont(font); 
				
			calculationCarrier="";
			
			clc="";
			
			// set enable all of the calculator buttons 
			
			Button0.setEnabled(true);
			Button1.setEnabled(true);
			Button2.setEnabled(true);
			Button3.setEnabled(true);
			Button4.setEnabled(true);
			Button5.setEnabled(true);
			Button6.setEnabled(true);
			Button7.setEnabled(true);
			Button8.setEnabled(true);
			Button9.setEnabled(true);
			
			ButtonPlus.setEnabled(true);
			
			ButtonMinus.setEnabled(true);
			
			ButtonMul.setEnabled(true);
			
			ButtonDiv.setEnabled(true);
			
			ButtonAnswear.setEnabled(true);
			
			dotSign.setEnabled(true);
			
		leftBrucket.setEnabled(true);
		
		rightBrucket.setEnabled(true);
		
		 sqrt.setEnabled(true);
		 
	 sin.setEnabled(true);
	 tan.setEnabled(true);
	cos.setEnabled(true);
	
	 cbrt.setEnabled(true);
	 
	 expm1.setEnabled(true);
	 
   log10.setEnabled(true);
   
    log1p.setEnabled(true);
    
    
   
	 off.setEnabled(true);
	 ButtonClear.setEnabled(true);
			
			
			 				//==================================================================================
				//reset calculation values 
				
			for(int i=0;i<n2t.length;i++)
			{
				
				n2t[i]=0.0;
				
			}
			
			for(int i=0;i<numrslt.length;i++)
			{
				
				numrslt[i]=0.0;
				
			}
				
				num1=0; 
					
					num2=0; 
						
						num3=0; 
							
							num4=0; 
								
								num5=0; 
									
									num6=0; 
										
										m=0;
					
					result=0; 
					
					count=0; 
						
						str=" ";
					
					dNUMcounter=-1; 
						
						symbolsCOUNTER=-1; 
							
							dNUMsymbolsCounter=-1;
					
					for(int i=0;i<numD.length;i++)
					{
						
						numD[i]=0; 
						
					}
					
					for(int i=0;i<dNUMsymbols.length;i++)
					{
						
						dNUMsymbols[i]=" ";
						
					}
					
					for(int i=0;i<symbols.length;i++)
					{
						
						symbols[i]=" ";
						
					}
					
					for(int i=0;i<dNUM.length;i++)
					{
						
						dNUM[i]=" "; 
						
					}
					
					for(int i=0;i<db.length;i++)
					{
						
						db[i]=0; 
						
					}
					
		//==================================================================================
			
	
	System.gc();//release system resources ... 
				
			}
			
			}
		});
		onoff.add(ButtonClear);
		
		//=========================================================================================
		
	   cos=new JButton("cos");
	   	cos.setFont(f);
	   		cos.setToolTipText("cos");
	cos.setBorder(new SubtleSquareBorder(true));
	cos.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	cos.setForeground(randomColor);
	cos.setActionCommand("cos");
	cos.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("cos".equals(e.getActionCommand())) 
			{
				
	
	dNUMsymbolsCounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  
	  calculationCarrier=calculationCarrier.concat("cos ");
			 clc=clc.concat("");
			 
			 	dNUMsymbols[dNUMsymbolsCounter]="cos";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
	  
						
				}
				else
				{
					
					calculationCarrier=calculationCarrier.concat("cos ");
			 clc=clc.concat("");
			 
			 dNUMsymbols[dNUMsymbolsCounter]="cos";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
					
				}
				
							
				
			}
			
			}
		});
	   sciCLC.add(cos);
	   
	   //=========================================================================================
	   
	  sin=new JButton("sin");
	  	sin.setFont(f);
	  		sin.setToolTipText("sin");
	sin.setBorder(new SubtleSquareBorder(true));
	sin.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
     sin.setForeground(randomColor);
	sin.setActionCommand("sin");
     sin.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("sin".equals(e.getActionCommand())) 
			{
				
					
	
	dNUMsymbolsCounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  calculationCarrier=calculationCarrier.concat("sin ");
			 clc=clc.concat("");
			 
			 dNUMsymbols[dNUMsymbolsCounter]="sin";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);	
						
				}
				else
				{
					
					calculationCarrier=calculationCarrier.concat("sin ");
			 clc=clc.concat("");
			 
			 dNUMsymbols[dNUMsymbolsCounter]="sin";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);	
					
				}
				
						
				
			}
			
			}
		});
	  sciCLC.add(sin);
	  
	  //=========================================================================================
	  
	   tan=new JButton("tan");
	  	tan.setFont(f);
	tan.setBorder(new SubtleSquareBorder(true));
		tan.setToolTipText("tan");
	tan.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	tan.setForeground(randomColor);
	tan.setActionCommand("tan");
		tan.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("tan".equals(e.getActionCommand())) 
			{
				
					
	
	dNUMsymbolsCounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  calculationCarrier=calculationCarrier.concat("tan ");
			 clc=clc.concat("");
			 
			 dNUMsymbols[dNUMsymbolsCounter]="tan";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
						
				}
				else
				{
					
					calculationCarrier=calculationCarrier.concat("tan ");
			 clc=clc.concat("");
			 
			 dNUMsymbols[dNUMsymbolsCounter]="tan";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
					
				}
							
				
			}
			
			}
		});
	  sciCLC.add(tan);
	  
	  //=========================================================================================
	  
	 //=========================================================================================
		
		
	
	
		sqrt=new JButton("sqrt");
		sqrt.setFont(f);
		sqrt.setToolTipText("square root of a number");
			sqrt.setBorder(new SubtleSquareBorder(true));
			//
		sqrt.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	sqrt.setForeground(randomColor);
		//
	sqrt.setActionCommand("sqrt");
	sqrt.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			Font font=null;
				
			if("sqrt".equals(e.getActionCommand())) 
			{
				
			
	
	dNUMsymbolsCounter++;
			
			
			if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  calculationCarrier=calculationCarrier.concat("|/'''' ");	
				clc=clc.concat("");
				
				dNUMsymbols[dNUMsymbolsCounter]="sqrt";
				
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
						
				}
				else
				{
					
					calculationCarrier=calculationCarrier.concat("|/'''' ");	
				clc=clc.concat("");
				
				dNUMsymbols[dNUMsymbolsCounter]="sqrt";
				
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
					
				}	    
				
			
			
			
				
			}
			
			}
		});
		 sciCLC.add(sqrt);
		 
		 
		 
		 
		   //=========================================================================================
		 
		 	

	
		 leftBrucket=new JButton("exp");
		 leftBrucket.setToolTipText("Returns Euler's number e raised to the power of a double value");
		 	leftBrucket.setBorder(new SubtleSquareBorder(true));
		 	//
		leftBrucket.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
leftBrucket.setForeground(randomColor);
		//
	 leftBrucket.setActionCommand("exp");
		leftBrucket.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("exp".equals(e.getActionCommand())) 
			{
				
					
	
	
			dNUMsymbolsCounter++;	
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  calculationCarrier=calculationCarrier.concat("e ");
				 clc=clc.concat("");
				 
				 	dNUMsymbols[dNUMsymbolsCounter]="exp";
				 
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
						
				}
				else
				{
					
					
					calculationCarrier=calculationCarrier.concat("e ");
				 clc=clc.concat("");
				 
				 	dNUMsymbols[dNUMsymbolsCounter]="exp";
				 
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
					
					
				}
						
				
			
			TA.setFont(font);
			
			
				
			}
			
			}
		});
		 sciCLC.add(leftBrucket);
	  
	 
	  	
	 
	
	  
	  //=========================================================================================
	  
	  	log10=new JButton("log10");
	  	log10.setFont(f);
	log10.setBorder(new SubtleSquareBorder(true));
	log10.setToolTipText("Returns the base 10 logarithm of a double value");
	log10.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	log10.setForeground(randomColor);
	log10.setActionCommand("log10");
	log10.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("log10".equals(e.getActionCommand())) 
			{
				
				
	
	dNUMsymbolsCounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  calculationCarrier=calculationCarrier.concat("log10 ");
			 clc=clc.concat("");
			 
			 dNUMsymbols[dNUMsymbolsCounter]="log10";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
						
				}
				else{
					
					calculationCarrier=calculationCarrier.concat("log10 ");
			 clc=clc.concat("");
			 
			  dNUMsymbols[dNUMsymbolsCounter]="log10";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
					
				}
				
							
				
			}
			
			}
		});
	  	sciCLC.add(log10);
	  	
	  	      //=========================================================================================
		
                
		rightBrucket=new JButton("log");
		rightBrucket.setBorder(new SubtleSquareBorder(true));
		rightBrucket.setToolTipText("Returns the natural logarithm (base e) of a double value");
		//
		rightBrucket.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
 rightBrucket.setForeground(randomColor);
		//
	 rightBrucket.setActionCommand("log");
		rightBrucket.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("log".equals(e.getActionCommand())) 
			{
				
				
		
		dNUMsymbolsCounter++;
				
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  calculationCarrier=calculationCarrier.concat("log ");
				 clc=clc.concat(" ");
				 
				 dNUMsymbols[dNUMsymbolsCounter]="log";
				 
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
						
				}
				else
				{
					
					
					calculationCarrier=calculationCarrier.concat("log ");
				 clc=clc.concat(" ");
				 
				 dNUMsymbols[dNUMsymbolsCounter]="log";
				 
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
					
					
				}
				
				
					
			 
			TA.setFont(font);
			
		
				
			}
				
			}
			
		});
		 sciCLC.add(rightBrucket);
	  	
	  	//=========================================================================================
	  	
	 log1p=new JButton("log1p");
	 	log1p.setFont(f);
	 	log1p.setToolTipText("Returns the natural logarithm of the sum of the argument and 1");
	log1p.setBorder(new SubtleSquareBorder(true));
	log1p.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	log1p.setForeground(randomColor);
	log1p.setActionCommand("log1p");
	log1p.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("log1p".equals(e.getActionCommand())) 
			{
				
	
	dNUMsymbolsCounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  calculationCarrier=calculationCarrier.concat("log1p ");
			 clc=clc.concat("");
			 
			 dNUMsymbols[dNUMsymbolsCounter]="log1p";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
						
				}
				else{
					
					calculationCarrier=calculationCarrier.concat("log1p ");
			 clc=clc.concat("");
			 
			 dNUMsymbols[dNUMsymbolsCounter]="log1p";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
					
				}
				
							
				
			}
			
			}
		});
	 sciCLC.add(log1p);
	 
	  //=========================================================================================
	  
	  	 cbrt=new JButton("cbrt");
	  	 	cbrt.setFont(f);
	  	 	cbrt.setToolTipText("Returns the cube root of a double value");
	cbrt.setBorder(new SubtleSquareBorder(true));
	cbrt.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	cbrt.setForeground(randomColor);
	cbrt.setActionCommand("cbrt");
	cbrt.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("cbrt".equals(e.getActionCommand())) 
			{
				
	
				dNUMsymbolsCounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  calculationCarrier=calculationCarrier.concat("cbrt ");
			 clc=clc.concat("");
			 
			 dNUMsymbols[dNUMsymbolsCounter]="cbrt";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
						
				}
				else
				{
					
					calculationCarrier=calculationCarrier.concat("cbrt ");
			 clc=clc.concat("");
			 
			 dNUMsymbols[dNUMsymbolsCounter]="cbrt";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
					
				}
				
				
							
				
			}
			
			}
		});
	  	 sciCLC.add(cbrt);
	  	 
	  	  
	  	 //=========================================================================================
	  	 
	 expm1=new JButton("expm1");
	 expm1.setFont(f);
	 expm1.setToolTipText("Returns e^x - 1");
	expm1.setBorder(new SubtleSquareBorder(true));
	expm1.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	expm1.setForeground(randomColor);
	expm1.setActionCommand("expm1");
	expm1.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("expm1".equals(e.getActionCommand())) 
			{
				
	
		dNUMsymbolsCounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  calculationCarrier=calculationCarrier.concat("expm1 ");
			 clc=clc.concat("");
			 
			 dNUMsymbols[dNUMsymbolsCounter]="expm1";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
						
				}
				else
				{
					
					calculationCarrier=calculationCarrier.concat("expm1 ");
			 clc=clc.concat("");
			 
			 dNUMsymbols[dNUMsymbolsCounter]="expm1";
			 
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
					
				}
				
							
				
			}
			
			}
		});
	 sciCLC.add(expm1);
		
		//=========================================================================================
	
	Button1=new JButton("1");
	Button1.setFont(f);
	Button1.setToolTipText("number 1");
	Button1.setBorder(new SubtleSquareBorder(true));
	Button1.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	Button1.setForeground(randomColor);
	Button1.setActionCommand("one");
		Button1.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("one".equals(e.getActionCommand())) 
			{
				
				dNUMcounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  str=str.concat("1");
	  
	  calculationCarrier=calculationCarrier.concat("1");
			 clc=clc.concat("1");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
						
				}
				else
				{
					
					 str=str.concat("1");
					
					calculationCarrier=calculationCarrier.concat("1");
			 clc=clc.concat("1");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
					
				}
				
			 
			
					
				
			}
			
			}
		});
		panel2.add(Button1);
      
      //=========================================================================================
		
	Button2=new JButton("2");
	Button2.setFont(f);
	Button2.setToolTipText("number 2");
		Button2.setBorder(new SubtleSquareBorder(true));
		Button2.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	Button2.setForeground(randomColor);
			Button2.setActionCommand("two");
				Button2.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("two".equals(e.getActionCommand())) 
			{
				
				dNUMcounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	   str=str.concat("2");
	  
	  calculationCarrier=calculationCarrier.concat("2");
			 clc=clc.concat("2");
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
						
				}
				else
				{
					
					 str=str.concat("2");
					
					calculationCarrier=calculationCarrier.concat("2");
			 clc=clc.concat("2");
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
					
				}
				
			 
			
						
				
			}
			
			}
		});
			panel2.add(Button2);
      
      //=========================================================================================

	Button3=new JButton("3");
	Button3.setFont(f);
	Button3.setToolTipText("number 3");
		Button3.setBorder(new SubtleSquareBorder(true));
		//
		Button3.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	Button3.setForeground(randomColor);
		//
	Button3.setActionCommand("three");
		Button3.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
					
					
				
			if("three".equals(e.getActionCommand())) 
			{
				
				
				dNUMcounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	   str=str.concat("3");
	  
	  calculationCarrier=calculationCarrier.concat("3");
			 clc=clc.concat("3");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
						
				}
				else
				{
					
					 str=str.concat("3");
					
					calculationCarrier=calculationCarrier.concat("3");
			 clc=clc.concat("3");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
					
				}
				
		      
			
						
				
			}
			
			}
		});
		panel2.add(Button3);
      
      
		
		//=========================================================================================
		
	ButtonPlus=new JButton("+");
		ButtonPlus.setFont(f);
		ButtonPlus.setToolTipText("addition button");
		ButtonPlus.setBorder(new SubtleSquareBorder(true));
		//
		ButtonPlus.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	ButtonPlus.setForeground(randomColor);
		//
	ButtonPlus.setActionCommand("plus");
	ButtonPlus.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("plus".equals(e.getActionCommand())) 
			{
				
				
			symbolsCOUNTER++;	
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  
	   str=str.concat("+");
	  
	  calculationCarrier=calculationCarrier.concat(" + ");
			 clc=clc.concat("+");
			 
			 symbols[symbolsCOUNTER]="+";
			 
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
						
				}
				else
				{
					
					str=str.concat("+");
					
					calculationCarrier=calculationCarrier.concat(" + ");
			 clc=clc.concat("+");
			 
			 symbols[symbolsCOUNTER]="+";
			 
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
					
				}
				
			
			count++;
			
			
		if(count>3)//error condition handling 
		{
			
			INVALID(count);//invoke if more than three symbols( +, -, /, * ), are pressed ...  
			
		}
			
				
			}
			
			}
		});
		panel2.add(ButtonPlus);
      
      //=========================================================================================
		
	Button4=new JButton("4");
	Button4.setFont(f);
	Button4.setToolTipText("number 4");
		Button4.setBorder(new SubtleSquareBorder(true));
		//
		Button4.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	Button4.setForeground(randomColor);
		//
	Button4.setActionCommand("four");
		Button4.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("four".equals(e.getActionCommand())) 
			{
				
				dNUMcounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	   str=str.concat("4");
	  
	  calculationCarrier=calculationCarrier.concat("4");
			 clc=clc.concat("4");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
						
				}
				else{
					
					 str=str.concat("4");
					
					calculationCarrier=calculationCarrier.concat("4");
			 clc=clc.concat("4");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
					
				}
				
				TA.setFont(font);
			
						
				
			}
			
			}
		});
		panel2.add(Button4);
      
      //=========================================================================================
		
	Button5=new JButton("5");
	Button5.setFont(f);
	Button5.setToolTipText("number 5");
		Button5.setBorder(new SubtleSquareBorder(true));
		//
		Button5.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	Button5.setForeground(randomColor);
		//
	Button5.setActionCommand("five");
		Button5.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("five".equals(e.getActionCommand())) 
			{
				
				dNUMcounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  str=str.concat("5");
	  
	  calculationCarrier=calculationCarrier.concat("5");	
			 clc=clc.concat("5");
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
						
				}
				else
				{
					
					str=str.concat("5");
					
					calculationCarrier=calculationCarrier.concat("5");	
			 clc=clc.concat("5");
		TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
					
				}
				
				
			TA.setFont(font);
			
						
				
			}
			
			}
		});
		panel2.add(Button5);
      
      //=========================================================================================
		
	Button6=new JButton("6");
	Button6.setFont(f);
	Button6.setToolTipText("number 6");
		Button6.setBorder(new SubtleSquareBorder(true));
		//
		Button6.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
	Button6.setForeground(randomColor);
		//
	Button6.setActionCommand("six");
		Button6.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
				dNUMcounter++;
				
			if("six".equals(e.getActionCommand())) 
			{
				
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  str=str.concat("6");
	  
	  calculationCarrier=calculationCarrier.concat("6");
			 clc=clc.concat("6");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
						
				}
				else
				{
					
					str=str.concat("6");
					
					calculationCarrier=calculationCarrier.concat("6");
			 clc=clc.concat("6");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
					
				}
				
				
				
				
			TA.setFont(font);
			
					
				
			}
			
			}
		});
		panel2.add(Button6);
      
      //=========================================================================================
	
		
		//=========================================================================================
		
	ButtonMinus=new JButton("-");
	ButtonMinus.setFont(f);
	ButtonMinus.setToolTipText("subtraction button");
	ButtonMinus.setBorder(new SubtleSquareBorder(true));
	//
		ButtonMinus.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
 ButtonMinus.setForeground(randomColor);
		//
	ButtonMinus.setActionCommand("minus");
		ButtonMinus.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("minus".equals(e.getActionCommand())) 
			{
			
	
			symbolsCOUNTER++;
					
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  str=str.concat("-");
	  
	  calculationCarrier=calculationCarrier.concat(" - ");
			 clc=clc.concat("-");
			 
			 symbols[symbolsCOUNTER]="-";
			 
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
						
				}
				else{
					
					calculationCarrier=calculationCarrier.concat(" - ");
			 clc=clc.concat("-");
			 
			 str=str.concat("-");
			 
			 symbols[symbolsCOUNTER]="-";
			 
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
					
				}
				
			
			TA.setFont(font);
			
			count++;
			
			if(count>3)//error condition handling 
		{
			
			INVALID(count);//invoke if more than three symbols( +, -, /, * ), are pressed ...  
			
		}
			
			}
			
			}
		});
		panel2.add(ButtonMinus);
      
      //=========================================================================================
		
	Button7=new JButton("7");
	Button7.setFont(f);
	Button7.setToolTipText("number 7");
	Button7.setBorder(new SubtleSquareBorder(true));
	//
		Button7.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
 Button7.setForeground(randomColor);
		//
	Button7.setActionCommand("seven");
		Button7.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("seven".equals(e.getActionCommand())) 
			{
				
				dNUMcounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  str=str.concat("7");
	  
	  	calculationCarrier=calculationCarrier.concat("7");
			 clc=clc.concat("7");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
						
				}
				else
					{
						
						str=str.concat("7");
					
						calculationCarrier=calculationCarrier.concat("7");
			 clc=clc.concat("7");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
					
				}
				
				
			
			TA.setFont(font);
			
						
				
			}
			
			}
		});
		panel2.add(Button7);
      
      //=========================================================================================
		
	Button8=new JButton("8");
	Button8.setFont(f);
	Button8.setToolTipText("number 8");
	Button8.setBorder(new SubtleSquareBorder(true));
	//
		Button8.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
 Button8.setForeground(randomColor);
		//
	Button8.setActionCommand("eight");
		Button8.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("eight".equals(e.getActionCommand())) 
			{
				
				
				
				dNUMcounter++;
				
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  str=str.concat("8");
	  
	  calculationCarrier=calculationCarrier.concat("8");	
			 clc=clc.concat("8");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
						
				}
				else
				{
					
					str=str.concat("8");
					
					calculationCarrier=calculationCarrier.concat("8");	
			 clc=clc.concat("8");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
					
				}
				
				
				
				
			TA.setFont(font);
			
						
				
			}
			
			}
		});
		panel2.add(Button8);
      
      //=========================================================================================
		
	Button9=new JButton("9");
	Button9.setFont(f);
	Button9.setToolTipText("number 9");
	Button9.setBorder(new SubtleSquareBorder(true));
	//
		Button9.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
 Button9.setForeground(randomColor);
		//
	Button9.setActionCommand("nine");
		Button9.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("nine".equals(e.getActionCommand())) 
			{
				
				
				dNUMcounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  str=str.concat("9");
	  
	  calculationCarrier=calculationCarrier.concat("9");
			 clc=clc.concat("9");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
						
				}
				else
				{
					
					str=str.concat("9");
					
					calculationCarrier=calculationCarrier.concat("9");
			 clc=clc.concat("9");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
					
				}
				
				
				
				
			TA.setFont(font);
			
						
				
			}
			
			}
		});
		panel2.add(Button9);
      

		
		//=========================================================================================
		
	ButtonMul=new JButton("*");
	ButtonMul.setFont(f);
	ButtonMul.setToolTipText("multiplication button");
	ButtonMul.setBorder(new SubtleSquareBorder(true));
		//
		ButtonMul.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
 ButtonMul.setForeground(randomColor);
		//
	ButtonMul.setActionCommand("mul");
		ButtonMul.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("mul".equals(e.getActionCommand())) 
			{
				
				
				symbolsCOUNTER++;
				
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  str=str.concat("*");
						
						calculationCarrier=calculationCarrier.concat(" * ");
			 clc=clc.concat("*");
			  symbols[symbolsCOUNTER]="*";
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
						
				}
				else
				{
					
					str=str.concat("*");
					
					calculationCarrier=calculationCarrier.concat(" * ");
			 clc=clc.concat("*");
			 
			 symbols[symbolsCOUNTER]="*";
			 
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
					
				}
				
				
			TA.setFont(font);

			count++;
			
			if(count>3)//error condition handling 
		{
			
			INVALID(count);//invoke if more than three symbols( +, -, /, * ), are pressed ...  
			
		}
				
			}
			
			}
		});
		panel2.add(ButtonMul);
      
      
      
      //=========================================================================================
		
	Button0=new JButton("0");
	Button0.setFont(f);
	Button0.setBorder(new SubtleSquareBorder(true));
	Button0.setToolTipText("number 0");
	//
		Button0.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
 Button0.setForeground(randomColor);
		//
	Button0.setActionCommand("zero");
		Button0.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("zero".equals(e.getActionCommand())) 
			{
				
				dNUMcounter++;
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  str=str.concat("0");
	  
	  calculationCarrier=calculationCarrier.concat("0");
			 clc=clc.concat("0");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
						
				}
				else
				{
					
					str=str.concat("0");
					
				calculationCarrier=calculationCarrier.concat("0");
			 clc=clc.concat("0");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);	
					
				}
				
				
					
			TA.setFont(font);
			
						
				
			}
			
			}
		});
		panel2.add(Button0);
      
      //=========================================================================================
		
	ButtonAnswear=new JButton("=");
	ButtonAnswear.setFont(f);
	ButtonAnswear.setBorder(new SubtleSquareBorder(true));
		ButtonAnswear.setToolTipText("Result Button");
		ButtonAnswear.setEnabled(true);
		//
		randomColor = new Color(r, g, b);
		ButtonAnswear.setBackground(color);
	randomColor=randomColor.brighter();
 ButtonAnswear.setForeground(randomColor);
		//
	ButtonAnswear.setActionCommand("answer");
		ButtonAnswear.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				Font font=null;
				
			if("answer".equals(e.getActionCommand())) 
			{
				
					
				
			if(count==0)
			{
				
			

			
				numD[0]=Double.parseDouble(str);
				
			
					
					if(dNUMsymbolsCounter==0) 
					{
					
				 hint = dNUMsymbols[0];
				
				switch(hint)
				{
					
					case "cos":
						
						rslt=cos(numD[0]);
						clc=Double.toString(rslt);
						
				
						
						break;
					
					case "sin":
						
							rslt=sin(numD[0]);
							clc=Double.toString(rslt);
						
						break;
						
						case "tan":
							
								rslt=tan(numD[0]);
								clc=Double.toString(rslt);
						
						break;
						
			
						
						case "sqrt":
							
								rslt=sqrt(numD[0]);
								clc=Double.toString(rslt);
						
						break;
						
						case "cbrt":
							
								rslt=cbrt(numD[0]);
								clc=Double.toString(rslt);
						
						break;
						
						case "log":
							
								rslt=log(numD[0]);
								clc=Double.toString(rslt);
						
						break;
						
						case "log10":
							
								rslt=log10(numD[0]);
								clc=Double.toString(rslt);
						
						break;
						
						case "log1p":
							
								rslt=log1p(numD[0]);
								clc=Double.toString(rslt);
						
						break;
						
						case "exp":
							
								rslt=exp(numD[0]);
								clc=Double.toString(rslt);
						
						break;
						
						case "expm1":
						
							rslt=expm1(numD[0]);
							clc=Double.toString(rslt);
						
						break;
						

					
				}
				
    		}
				
			
			TA.setText( clc );
			
			font = new Font("Serif", Font.PLAIN, 18);
			
			TA.setFont(font);
			
			
				//==================================================================================
				
				
			for(int i=0;i<n2t.length;i++)
			{
				
				n2t[i]=0.0;
				
			}
			
			for(int i=0;i<numrslt.length;i++)
			{
				
				numrslt[i]=0.0;
				
			}
				
				num1=0; 
					
					num2=0; 
						
						num3=0; 
							
							num4=0; 
								
								num5=0; 
									
									num6=0; 
										
										m=0;
					
					result=0; 
					
					count=0; 
						
						str=" ";
					
					dNUMcounter=-1; 
						
						symbolsCOUNTER=-1; 
							
							dNUMsymbolsCounter=-1;
					
					for(int i=0;i<numD.length;i++)
					{
						
						numD[i]=0; 
						
					}
					
					for(int i=0;i<dNUMsymbols.length;i++)
					{
						
						dNUMsymbols[i]=" ";
						
					}
					
					for(int i=0;i<symbols.length;i++)
					{
						
						symbols[i]=" ";
						
					}
					
					for(int i=0;i<dNUM.length;i++)
					{
						
						dNUM[i]=" "; 
						
					}
					
					for(int i=0;i<db.length;i++)
					{
						
						db[i]=0; 
						
					}
					
					result=0.0;
					
					frozenCLC();
					
		//==================================================================================
				
			}
			
			//=========================================================================================
			
			else if(count>0 && count<4)
			{
   
   // correct values testing jpanel	;;;; dNUMcounter, dNUMsymbolsCounter, symbolsCOUNTER 
  
  // JOptionPane.showMessageDialog(null,"dNUMcounter[numbers]:  "+dNUMcounter+" dNUMsymbolsCounter[scientific symbols]: "+dNUMsymbolsCounter+" symbolsCOUNTER[mathematical symbols]: "+symbolsCOUNTER,"", JOptionPane.INFORMATION_MESSAGE);
				
   	
   		for(int i=0;i<dNUM.length;i++)
			{
				
				// check dNUM[] array values
				
			//	JOptionPane.showMessageDialog(null,"number "+i+":"+dNUM[i] ,"", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
				for(int i=0;i<symbols.length;i++)
			{
				
				// check symbols[] array values
				
		//		JOptionPane.showMessageDialog(null, "mathematical symbol "+i+":"+symbols[i] ,"", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
				for(int i=0;i<dNUMsymbols.length;i++)
			{
				
			// check dNUMsymbols[] array values
				
			//	JOptionPane.showMessageDialog(null, "scientific symbol "+i+":"+dNUMsymbols[i] ,"", JOptionPane.INFORMATION_MESSAGE);
				
			}
   	
   	
   	
   	 //==================================================================================
   	
   		
   		// additional code goes here
   		
   					dNUMcounter=0; // code not used
			
			StringTokenizer tokens = new StringTokenizer(str,"+-*/"); // string tokkenizer
			
			int j=0; // not used
			
			
			while(tokens.hasMoreTokens())
			{
								
				handler=tokens.nextToken(); // the string that handles the tokkens of the tokkenized string str
								
				numD[j]=Double.parseDouble(handler); // the numD[] array, is responsible to carry the converted double values of the handler string
				
				//	JOptionPane.showMessageDialog(null,"number "+(j+1)+" : "+numD[j] ,"", JOptionPane.INFORMATION_MESSAGE);
					
					j++;// not used
					
					dNUMcounter++;// not used
				
			}
			
			//==================================================================================
			
			for(int i=0;i<numrslt.length;i++)
			{
				
				// the numD[] array values are copied to the numrslt[] array
				
				numrslt[i]=numD[i];
				
				
				// test the values of the two arrays
			//	JOptionPane.showMessageDialog(null,"number "+(i+1)+" : "+numrslt[i] ,"", JOptionPane.INFORMATION_MESSAGE);
				
			}
				
			
					 //==================================================================================
					
	if(dNUMsymbolsCounter>(-1))	// check if there are any scientific symbols on the equation. If yes proceed with the switch statement ; else proceed with the program.     
	  {
						
			for(int i=0;i<dNUMsymbols.length;i++)
			{
					
			if(dNUMsymbols[i]!=null) //  && numD[i]==null 
			{
				
			  hint = dNUMsymbols[i];// the string that carries the scientific symbol
				
				switch(hint)// scientific symbol directory
				{
					
					case "cos":// cos symbol
						
						rslt=cos(numD[i]);
						numrslt[i]=rslt;
						
					//display the result of the calculation	
				//			JOptionPane.showMessageDialog(null, numrslt[i] ,"", JOptionPane.INFORMATION_MESSAGE);
						
						break;
					
					case "sin":// sin symbol
						
							rslt=sin(numD[i]);
							numrslt[i]=rslt;
							
							//display the result of the calculation
				//			JOptionPane.showMessageDialog(null, numrslt[i] ,"", JOptionPane.INFORMATION_MESSAGE);
						
						break;
						
						case "tan"://tan symbol
							
								rslt=tan(numD[i]);
									numrslt[i]=rslt;
									
									//display the result of the calculation
				//					JOptionPane.showMessageDialog(null, numrslt[i] ,"", JOptionPane.INFORMATION_MESSAGE);
						
						break;
						
			
						
						case "sqrt":// sqrt symbol
							
								rslt=sqrt(numD[i]);
									numrslt[i]=rslt;
									
									//display the result of the calculation
						//			JOptionPane.showMessageDialog(null, numrslt[i] ,"", JOptionPane.INFORMATION_MESSAGE);
						
						break;
						
						case "cbrt":// cbrt symbol
							
								rslt=cbrt(numD[i]);
									numrslt[i]=rslt;
									
									//display the result of the calculation
						//			JOptionPane.showMessageDialog(null, numrslt[i] ,"", JOptionPane.INFORMATION_MESSAGE);
						
						break;
						
						case "log":// log symbol
							
								rslt=log(numD[i]);
									numrslt[i]=rslt;
								
								//display the result of the calculation	
						//			JOptionPane.showMessageDialog(null, numrslt[i] ,"", JOptionPane.INFORMATION_MESSAGE);
						
						break;
						
						case "log10":// log10 symbol
							
								rslt=log10(numD[i]);
									numrslt[i]=rslt;
								
								//display the result of the calculation	
							//		JOptionPane.showMessageDialog(null, numrslt[i] ,"", JOptionPane.INFORMATION_MESSAGE);
						
						break;
						
						case "log1p":// log1p symbol
							
								rslt=log1p(numD[i]);
								numrslt[i]=rslt;
								
								//display the result of the calculation
							//	JOptionPane.showMessageDialog(null, numrslt[i] ,"", JOptionPane.INFORMATION_MESSAGE);
						
						break;
						
						case "exp":// exp symbol
							
								rslt=exp(numD[i]);
									numrslt[i]=rslt;
								
								//display the result of the calculation	
						//			JOptionPane.showMessageDialog(null, numrslt[i] ,"", JOptionPane.INFORMATION_MESSAGE);
						
						break;
						
						case "expm1":// expm1 symbol
						
							rslt=expm1(numD[i]);
							numrslt[i]=rslt;	
						
						//display the result of the calculation	
					//		JOptionPane.showMessageDialog(null, numrslt[i] ,"", JOptionPane.INFORMATION_MESSAGE);
						
						break;
								
				}
				
			}
				
    		}
						
	}
				
   //==================================================================================
						
			for(int i=0;i<n2t.length;i++)
			{
				
				n2t[i]=0.0;// give zero value at all n2t[] array cells
				
				// n2t[] array values check
		//			JOptionPane.showMessageDialog(null,"number(n2t[i]) "+(i+1)+" : "+n2t[i] ,"", JOptionPane.INFORMATION_MESSAGE);
				
				//numrslt[] array values check
		//	JOptionPane.showMessageDialog(null,"number(numrslt[i]) "+(i+1)+" : "+numrslt[i] ,"", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			//==================================================================================
			
			for(int i=0;i<symbols.length;i++)
			{
				
				// check symbols[] array values
			//	JOptionPane.showMessageDialog(null,  "symbols[i] "+(i+1)+" : "+symbols[i]  ,"", JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			//==================================================================================
				
					result=0;// result ==  0 
					
					clc=" ";
					
					double k=0;
			
			int steps=0;
					
					//==================================================================================
					
					//	JOptionPane.showMessageDialog(null,"numrslt[i] "+(i)+": "+numrslt[i]+" || "+"numrslt[i+1] "+(i+1)+": "+numrslt[i+1] ,"", JOptionPane.INFORMATION_MESSAGE);
					
				//#########################################################################################		
				
				int tinoC23=0;// integer that handles the program run process.
				              // if tinoC23 == 0, then the final result code executed, else it is not executed( 0/0, num/0, o/num conditions )
				
				//
					
for(int i=0;i<symbols.length;i++)// final calculations switch() statement
{
					
   switch(symbols[i])
   	{
   	
   	case "+":// handles the eguations that include the + sign
   		
   		// case "+" access check
   		//	JOptionPane.showMessageDialog(null,  "plus accessed"  ,"", JOptionPane.INFORMATION_MESSAGE);
   			
   				if(i==0)
   				{
   					
   					k=plus(numrslt[steps], numrslt[steps+1]);
   					
   					result=k;
   					
   						n2t[i]=k;
   					
   			//		JOptionPane.showMessageDialog(null,  k  ,"", JOptionPane.INFORMATION_MESSAGE);
   					
   						steps++;
   						
   				}
   				else
   				{
   					
   					k=plus(n2t[steps-1], numrslt[steps+1]);
   					
   					result=k;
   					
   						n2t[i]=k;
   					
   				//	JOptionPane.showMessageDialog(null,  k  ,"", JOptionPane.INFORMATION_MESSAGE);
   					
   						steps++;
   					
   				}	
   				
   			//	System.exit(0);
   		
   		break;
   		
   		case "-":
   			
   			//	JOptionPane.showMessageDialog(null,  "sub accessed"  ,"", JOptionPane.INFORMATION_MESSAGE);
   				
   				if(i==0)
   				{
   					
   					k=minus(numrslt[steps], numrslt[steps+1]);
   					
   					result=k;
   					
   						n2t[i]=k;
   					
   				//	JOptionPane.showMessageDialog(null,  	k  ,"", JOptionPane.INFORMATION_MESSAGE);
   					
   						steps++;
   						
   				}
   				else
   				{
   					
   					k=minus(n2t[steps-1], numrslt[steps+1]);
   					
   					result=k;
   					
   						n2t[i]=k;
   					
   			//		JOptionPane.showMessageDialog(null,  	k  ,"", JOptionPane.INFORMATION_MESSAGE);
   					
   						steps++;
   					
   				}	
   				
   			//	System.exit(0);
   			
   			break;
   			
   			case "*":// handles the eguations that include the * sign
   		
   		// case "*" access check
   				//	JOptionPane.showMessageDialog(null,  "mul accessed"  ,"", JOptionPane.INFORMATION_MESSAGE);
   				
   				if(i==0)
   				{
   					
   					k=mul(numrslt[steps], numrslt[steps+1]);
   					
   					result=k;
   					
   						n2t[i]=k;
   					
   				//	JOptionPane.showMessageDialog(null,  	k  ,"", JOptionPane.INFORMATION_MESSAGE);
   					
   						steps++;
   						
   				}
   				else
   				{
   					
   					k=mul(n2t[steps-1], numrslt[steps+1]);
   					
   					result=k;
   					
   						n2t[i]=k;
   					
   				//	JOptionPane.showMessageDialog(null,  k  ,"", JOptionPane.INFORMATION_MESSAGE);
   					
   						steps++;
   					
   				}
   					
   				
   				break;
   				
   				case "/":// handles the eguations that include the / sign
   		
   		// case "+" access check
   				//		JOptionPane.showMessageDialog(null,  "div accessed"  ,"", JOptionPane.INFORMATION_MESSAGE);
   						
   	if(i==0)
   	{
   					
   		// 0/0 case
		if(numrslt[steps]==0 && numrslt[steps+1]==0) 
		{
			
			clc=clc.concat(" Math Error !!! \n Division of zero by zero. ");
	  
	        TA.setText( clc );
			
			font = new Font("Serif", Font.PLAIN, 18);
			
			TA.setFont(font);
						
			frozenCLC();
			
			tinoC23++;
			
			System.gc();
			
		}
	//	num/0 case 
	else if(numrslt[steps]!=0 && numrslt[steps+1]==0)
	{
		
		clc=clc.concat(" Math Error !!! \n Division of number by zero. ");
	  
	  TA.setText( clc );
			
			font = new Font("Serif", Font.PLAIN, 18);
			
			TA.setFont(font);
						
			frozenCLC();
			
			tinoC23++;
			
			System.gc();
						
	}		
	//	0/num case
		else if(numrslt[steps]==0 && numrslt[steps+1]!=0)
		{
			 
			 clc=clc.concat(" Division of zero by number \n The result is 0. ");
	  
	         TA.setText( clc );
			
			font = new Font("Serif", Font.PLAIN, 18);
			
			TA.setFont(font);
						
			frozenCLC();
			
			tinoC23++;
			
			System.gc();
			
		}
		//
		else
		{
			
				k=div(numrslt[steps], numrslt[steps+1]);
				
				result=k;
   					
   				n2t[i]=k;
   					
   		//		JOptionPane.showMessageDialog(null,  	k  ,"", JOptionPane.INFORMATION_MESSAGE);
   					
   				steps++;
			
		}
		//			
   		}
   	else  
   	{				
   		// 0/0 case
		if(numrslt[steps]==0 && numrslt[steps+1]==0) 
		{
			
			clc=clc.concat(" Math Error !!! \n Division of zero by zero. ");
	  
	        TA.setText( clc );
			
			font = new Font("Serif", Font.PLAIN, 18);
			
			TA.setFont(font);
						
			frozenCLC();
			
			tinoC23++;
			
			System.gc();
			
		}
	//	num/0 case 
	else if(numrslt[steps]!=0 && numrslt[steps+1]==0)
	{
		
		clc=clc.concat(" Math Error !!! \n Division of number by zero. ");
	  
	  TA.setText( clc );
			
			font = new Font("Serif", Font.PLAIN, 18);
			
			TA.setFont(font);
						
			frozenCLC();
			
			tinoC23++;
			
			System.gc();
						
	}		
	//	0/num case
		else if(numrslt[steps]==0 && numrslt[steps+1]!=0)
		{
			 
			 clc=clc.concat(" Division of zero by number \n The result is 0. ");
	  
	         TA.setText( clc );
			
			font = new Font("Serif", Font.PLAIN, 18);
			
			TA.setFont(font);
						
			frozenCLC();
			
			tinoC23++;
			
			System.gc();
			
		}
		//
		else
		{
			
				k=div(n2t[steps-1], numrslt[steps+1]);
				
				result=k;
   					
   			 n2t[i]=k;
   					
   			//	JOptionPane.showMessageDialog(null,  	k  ,"", JOptionPane.INFORMATION_MESSAGE);
   					
   				steps++;
			
		}
		//		
   					
   	}	
   			
   					
   					break;
   					
   					case " ":// handles the null case
   		
   		// case "null" accessing check ;;;; it is accessing, the null elements of the symbols[] array
   		// if you choose to implement the calculation with a while loop, then program, will return an error ...
   						
   						// the case " " , do nothing ... 
   						
   						// testing the case " " fuctionality .... 
   					//	JOptionPane.showMessageDialog(null,  "symbols["+(i+1)+"] : "+symbols[i]+" null array."  ,"", JOptionPane.INFORMATION_MESSAGE);
   						
   						break;
   		
   	}
}

	steps=0;

	
	//#########################################################################################	
			
   		//==================================================================================
			//
			// final result display.  
			// the program bi-pass this section of the code under three conditions:
			// a) in the condition 0/0 
			// b) in the condition 0 / number 
			// c) in the codition number / 0 
			// In all the condtitions, the value of the tinoC23 integer is grater than 0 .... 
			//
			
			if(tinoC23==0)
			{
				
				clc=Double.toString(result);
			
			 calculationCarrier=clc;
			
			TA.setText( calculationCarrier );
			
			font = new Font("Serif", Font.PLAIN, 18);
			
			TA.setFont(font);
				
			}
			
				//================================================================================== // values return at their initial state ...  
				
				tinoC23=0;
				
			for(int i=0;i<n2t.length;i++)
			{
				
				n2t[i]=0.0;
				
			}
			
			for(int i=0;i<numrslt.length;i++)
			{
				
				numrslt[i]=0.0;
				
			}
				
				num1=0; 
					
					num2=0; 
						
						num3=0; 
							
							num4=0; 
								
								num5=0; 
									
									num6=0; 
										
										m=0;
										
										steps=0;
					
					result=0; 
					
					count=0; 
						
						str=" ";
					
					dNUMcounter=-1; 
						
						symbolsCOUNTER=-1; 
							
							dNUMsymbolsCounter=-1;
					
					for(int i=0;i<numD.length;i++)
					{
						
						numD[i]=0; 
						
					}
					
					for(int i=0;i<dNUMsymbols.length;i++)
					{
						
						dNUMsymbols[i]=" ";
						
					}
					
					for(int i=0;i<symbols.length;i++)
					{
						
						symbols[i]=" ";
						
					}
					
					for(int i=0;i<dNUM.length;i++)
					{
						
						dNUM[i]=" "; 
						
					}
					
					for(int i=0;i<db.length;i++)
					{
						
						db[i]=0; 
						
					}
					
					result=0.0;
					
					frozenCLC();
					
		//==================================================================================
					
			}
			
			}
		}});
		panel2.add(ButtonAnswear);
      
      //=========================================================================================
		
		dotSign=new JButton(".");
		dotSign.setFont(f);
	dotSign.setToolTipText("value separator Button"); 
		dotSign.setBorder(new SubtleSquareBorder(true));
			//
		dotSign.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
 dotSign.setForeground(randomColor);
		//
	dotSign.setActionCommand("dotSign");
		dotSign.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			Font font=null;
				
			if("dotSign".equals(e.getActionCommand())) 
			{
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					clc=" ";
	  TA.setText( clc );
	  
	  str=str.concat(".");
	  
	  calculationCarrier=calculationCarrier.concat(".");
				 clc=clc.concat(".");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
						
				}
				else
				{
					
					str=str.concat(".");
					
					calculationCarrier=calculationCarrier.concat(".");
				 clc=clc.concat(".");
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
					
				}
				
			 
			TA.setFont(font);
			
				
			}
			
			}
		});
		panel2.add(dotSign);
		
		//=========================================================================================
		
		String Division = " Division button";
		
	ButtonDiv=new JButton("/");
	ButtonDiv.setFont(f);
	ButtonDiv.setBorder(new SubtleSquareBorder(true));
	//
	ButtonDiv.setToolTipText("Division Button");
		//
		ButtonDiv.setBackground(color);
	randomColor = new Color(r, g, b);
	randomColor=randomColor.brighter();
 ButtonDiv.setForeground(randomColor);
		//
	ButtonDiv.setActionCommand("div");
		ButtonDiv.addActionListener(
		new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
			Font font=null;
				
			if("div".equals(e.getActionCommand())) 
			{
	
	
				symbolsCOUNTER++;
				
				
				if((clc).equals("CALCULATOR ACTIVATED !!!"))
				{
					
					str=str.concat("/");
					
					clc=" ";
	  TA.setText( clc );
	  
	  calculationCarrier=calculationCarrier.concat(" / ");
			 clc=clc.concat("/");
			 
			 
			 symbols[symbolsCOUNTER]="/";
			 
			 
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);
						
				}
				else
				{
					
				calculationCarrier=calculationCarrier.concat(" / ");
			 clc=clc.concat("/");
			 
			 symbols[symbolsCOUNTER]="/";
			 
			 str=str.concat("/");
			 
			TA.setText( calculationCarrier );
			font = new Font("Serif", Font.PLAIN, 18);	
					
				}
				
				
			TA.setFont(font);

			count++;
			
		if(count>3)//error condition handling 
		{
			
			INVALID(count);//invoke if more than three symbols( +, -, /, * ), are pressed ...  
			
		}
				
			}
			
			}
		});
		panel2.add(ButtonDiv);
      
      //=========================================================================================   
		
		//=========================================================================================
	
	       // Add sub - panels to frame
	 
	  this.getContentPane().add(header);    
	this.getContentPane().add(panel1);	
	this.getContentPane().add(onoff);
	this.getContentPane().add(sciCLC);
	this.getContentPane().add(panel2);
	
	
//	Add sub - panels to the main panel
// add the main panel to the jframe
	
	carrier.add(header);
			carrier.add(panel1);
		carrier.add(onoff);
	carrier.add(sciCLC);
	carrier.add(panel2);
    this.getContentPane().add(carrier);
    
				System.gc();// release system resources 
		
	}
	
	//=========================================================================================
	
	
	
	//=========================================================================================
	// the main method of the program .... 
	
	public static void main(String [] tinoC23)
	{
		
		
			SwingUtilities.invokeLater(new Runnable() 
			{

            @Override
            public void run() 
            	{
            		
            		
            		
                Driver mycalc=new Driver(); // invoke a new instance of the Driver constructor class 
                                            // and set it parameters .... 
		
        mycalc.setDefaultLookAndFeelDecorated(true);
		
		mycalc.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		mycalc.setVisible(true);
		
		mycalc.setResizable(false);
		
		mycalc.setLocationRelativeTo(null);
		
	mycalc.pack();
                
                
                
            }
            
        });
		
		
	
		
	}
	
	
	//=========================================================================================
	// disable calculator buttons except the on button and  null the  calculation arrays
	
	
	public void frozenCLC()
	{
		
		Button0.setEnabled(false);
			Button1.setEnabled(false);
			Button2.setEnabled(false);
			Button3.setEnabled(false);
			Button4.setEnabled(false);
			Button5.setEnabled(false);
			Button6.setEnabled(false);
			Button7.setEnabled(false);
			Button8.setEnabled(false);
			Button9.setEnabled(false);
			ButtonPlus.setEnabled(false);
			ButtonMinus.setEnabled(false);
			ButtonMul.setEnabled(false);
			ButtonDiv.setEnabled(false);
			ButtonAnswear.setEnabled(false);
			dotSign.setEnabled(false);
		leftBrucket.setEnabled(false);
		rightBrucket.setEnabled(false);
		 sqrt.setEnabled(false);
		 
		
	 
	 sin.setEnabled(false);
	 tan.setEnabled(false);
	cos.setEnabled(false);
	 cbrt.setEnabled(false);
	 expm1.setEnabled(false);
   log10.setEnabled(false);
    log1p.setEnabled(false);

	 off.setEnabled(false);
	  ButtonClear.setEnabled(false);
	  
	  
	  				//================================================================================== 
	  				// reset all the resources, related to the calculations of the calculator //
				
				
			for(int i=0;i<n2t.length;i++)
			{
				
				n2t[i]=0.0;
				
			}
			
			for(int i=0;i<numrslt.length;i++)
			{
				
				numrslt[i]=0.0;
				
			}
				
				num1=0; 
					
					num2=0; 
						
						num3=0; 
							
							num4=0; 
								
								num5=0; 
									
									num6=0; 
										
										m=0;
					
					result=0; 
					
					count=0; 
						
						str=" ";
					
					dNUMcounter=-1; 
						
						symbolsCOUNTER=-1; 
							
							dNUMsymbolsCounter=-1;
					
					for(int i=0;i<numD.length;i++)
					{
						
						numD[i]=0; 
						
					}
					
					for(int i=0;i<dNUMsymbols.length;i++)
					{
						
						dNUMsymbols[i]=" ";
						
					}
					
					for(int i=0;i<symbols.length;i++)
					{
						
						symbols[i]=" ";
						
					}
					
					for(int i=0;i<dNUM.length;i++)
					{
						
						dNUM[i]=" "; 
						
					}
					
					for(int i=0;i<db.length;i++)
					{
						
						db[i]=0; 
						
					}
					
		//==================================================================================		
			
			System.gc();		// un-release system resources
			
			//==================================================================================
					
		
	}
	
	//==================================================================================
	// disable calculator buttons except the on button ,  null calculation arrays and display error message(JOprionPane) 
	
	public void INVALID(int count)
	{
		

			
				Font font=null;
			
			clc="ERROR !!!";
			TA.setText( clc );
			font = new Font("Serif", Font.PLAIN, 18);
			TA.setFont(font);
			
						Button0.setEnabled(false);
			Button1.setEnabled(false);
			Button2.setEnabled(false);
			Button3.setEnabled(false);
			Button4.setEnabled(false);
			Button5.setEnabled(false);
			Button6.setEnabled(false);
			Button7.setEnabled(false);
			Button8.setEnabled(false);
			Button9.setEnabled(false);
			ButtonPlus.setEnabled(false);
			ButtonMinus.setEnabled(false);
			ButtonMul.setEnabled(false);
			ButtonDiv.setEnabled(false);
			ButtonAnswear.setEnabled(false);
			dotSign.setEnabled(false);
		leftBrucket.setEnabled(false);
		rightBrucket.setEnabled(false);
		 sqrt.setEnabled(false);
		 
		
	 
	 sin.setEnabled(false);
	 tan.setEnabled(false);
	cos.setEnabled(false);
	 cbrt.setEnabled(false);
	 expm1.setEnabled(false);
   log10.setEnabled(false);
    log1p.setEnabled(false);
	
	 off.setEnabled(false);
	  ButtonClear.setEnabled(false);
			
		
						
	JOptionPane.showMessageDialog(null,"\n Are not allowed more than three arithmetic operations per time.\n For that reason, the calculator JButtons have been disabled. \n Please click the ON button of the calculator, in order for the JButtons to be enabled and \n in order for you to get the allowance to invoke another arithmetic calculation. \n","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
			
			
			
			 				//==================================================================================
			 				// reset all the resources, related to the calculations of the calculator //
				
				
			for(int i=0;i<n2t.length;i++)
			{
				
				n2t[i]=0.0;
				
			}
			
			for(int i=0;i<numrslt.length;i++)
			{
				
				numrslt[i]=0.0;
				
			}
				
				num1=0; 
					
					num2=0; 
						
						num3=0; 
							
							num4=0; 
								
								num5=0; 
									
									num6=0; 
										
										m=0;
					
					result=0; 
					
					count=0; 
						
						str=" ";
					
					dNUMcounter=-1; 
						
						symbolsCOUNTER=-1; 
							
							dNUMsymbolsCounter=-1;
					
					for(int i=0;i<numD.length;i++)
					{
						
						numD[i]=0; 
						
					}
					
					for(int i=0;i<dNUMsymbols.length;i++)
					{
						
						dNUMsymbols[i]=" ";
						
					}
					
					for(int i=0;i<symbols.length;i++)
					{
						
						symbols[i]=" ";
						
					}
					
					for(int i=0;i<dNUM.length;i++)
					{
						
						dNUM[i]=" "; 
						
					}
					
					for(int i=0;i<db.length;i++)
					{
						
						db[i]=0; 
						
					}
					
		//==================================================================================
			
			System.gc();// un-release system resources
			
			//==================================================================================
		
	}
	
	
	
		//==================================================================================
	
	
	public static double plus(double a, double b) // addition method
	{
		
		double result=a+b;
		
		return result;
		
	}
	
	public static double minus(double a, double b)// substraction method
	{
		
		double result=a-b;
		
		return result;
		
	}
	
	public static double mul(double a, double b)// multiplication method
	{
		
		double result=a*b;
		
		return result;
		
	}
	
	public static double div(double a, double b)// division method
	{
						
				double result=a/b;		
						
		return result;
		
	}
	
	
	
	

	
		public static double cos(double a)//cos calculation method
	{
		
			double x=Math.cos(a);
		
		
		
		return x;
		
	}
	
		public static double sin(double a)//sin calculation method
	{
		
			double x=Math.sin(a);
		
		
		
		return x;
		
	}
	
		public static double tan(double a)//tanlculation method
	{
		
			double x=Math.tan(a);
		
		
		
		return x;
		
	}
	
		public static double sqrt(double a)//sqrt  calculation method              
	{
		
		double x=Math.sqrt(a);
		
	
		
		return x;
		
	}
	
		public static double cbrt(double a)//cbrt  calculation method
	{
		
			double x=Math.cbrt(a);
		
		
		
		return x;
		
	}
	
		public static double log(double a)//log  calculation method
	{
		
			double x=Math.log(a);
			
		return x;
		
	}
	
		public static double log10(double a)//log10 calculation method
	{
		
			double x=Math.log10(a);
			
		return x;
		
	}
	
		public static double log1p(double a)// log1p  calculation method
	{
		
			double x=Math.log1p(a);
			
		return x;
		
	}
	
		public static double exp(double a)//exp  calculation method
	{
		
			double x=Math.exp(a);
		
		return x;
		
	}
	
		public static double expm1(double a)// expm1  calculation method
	{
		
			double x=Math.expm1(a);
		
		return x;
		
	}
	

	
}



//================================================================================



