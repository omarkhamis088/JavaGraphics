
package javagraphics;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JavaGraphics  extends JFrame{
    int h = 500;
    int w = 500;
    int size = 250;
    public JavaGraphics(){
        
        setTitle("osama");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(h,w);
        setVisible(true);
        setLocationRelativeTo(null);
    }
     //paintComponent
    public void paint(Graphics g){
        super.paint(g);
        
        g.setFont(new Font("Tahome", Font.BOLD, 32));
        g.drawString("osama ", 20, 60);
        
        
        for(int i = 0 ;i<h/size ; i++){
//        g.drawLine(0, 250, 500, 250);
//        g.drawLine(250, 0, 250, 500);
        g.drawLine(0, i*size, 500, i*size);
        g.drawLine(i*size, 0, i*size, 500);
        
        
//        g.drawLine(0,0, 500, 500);
//        g.drawLine(500, 0, 0, 500);
        }
        g.setColor(Color.blue);
        g.fillOval(250, 250, 90, 90);
        g.fillRect(250, 46, 90, 90);
       
      
        
    }

   
    public static void main(String[] args) {
        new JavaGraphics();
    }
    
}
