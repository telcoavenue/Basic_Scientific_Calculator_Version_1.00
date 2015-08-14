
// source code by google code
// Web URL: https://code.google.com/p/emma5/source/browse/trunk/brain/src/main/java/main/test/SubtleSquareBorder.java?r=62
// the code presented in the SubtleSquareBorder.jave file, is responsible, to provide to the calculator buttons the 2D graphics capability.
// Also it rounded the corers, of the 2D buttons of the calculator.

// source code comments by Constantinos Constantinou
// Website: http://samples.site88.net/wordpress/
// date: 30/07/2015 , 21:05 p.m. 

// import the necessary java classes

import java.awt.Color;

import java.util.Random;

import java.awt.*;

import javax.swing.*;

import javax.swing.border.*;

// import the necessary java classes
 
public class SubtleSquareBorder implements Border
{
	
	// creates a random r-b-g color ;; uncommend lines 28 to 36, and commend line 39, in order
	// for each of the calculator buttons, to take different r-b-g color
	
//	Random rand = new Random();

//float r = rand.nextFloat();
//float b = rand.nextFloat();
//float g = rand.nextFloat();

	//Color color = new Color(r,b,g);
	
	
	Color color = Color.ORANGE;
	
	
	// the int m_w and the int m_h , set the shape of the rouded corners of the jbuttons ; 
	// if both integers set to the same value, the rounded corner will be uniformly in both sites.	
	
protected int m_w = 10;// set width 10
	
protected int m_h = 10;// set height 10
	
protected Color m_topColor = color; // set the color of the top button borders
	
protected Color m_bottomColor = color;// set the color of the bottom button borders
	
protected boolean roundc = false;  // do not create round borders
	
public SubtleSquareBorder(boolean round_corners)// set round_c value 
{
	
	roundc = round_corners;
	
}

public Insets getBorderInsets(Component c) // get Border Insets class
{
	
return new Insets(m_h, m_w, m_h, m_w);
	
}

public boolean isBorderOpaque()
{
	
return true;
	
}

public void paintBorder(Component c, Graphics g, int x, int y, int w, int h)
{
	
w = w - 5;
h = h - 5;
x ++;
y ++;
	
if(roundc) // if roundc == false
{
	
g.setColor(m_topColor);
g.drawLine(x, y + 2, x, y + h - 2);
g.drawLine(x + 2, y, x + w - 2, y);
g.drawLine(x, y + 2, x + 2, y); 
g.drawLine(x, y + h - 2, x + 2, y + h); 
g.setColor(m_bottomColor);
g.drawLine(x + w, y + 2, x + w, y + h - 2);
g.drawLine(x + 2, y + h, x + w -2, y + h);
g.drawLine(x + w - 2, y, x + w, y + 2);
g.drawLine(x + w, y + h - 2, x + w -2, y + h); 
	
}
else // if roundc == true
{
	
g.setColor(m_topColor);
g.drawLine(x, y, x, y + h);
g.drawLine(x, y, x + w, y);
g.setColor(m_bottomColor);
g.drawLine(x + w, y, x + w, y + h);
g.drawLine(x, y + h, x + w, y + h);
	
}

}

}
