
package animate;

import java.awt.Graphics;
import java.awt.Container;
import java.awt.Font;
import java.awt.Color;

public class MAGulbahce implements Animator {
    final static double DELTA = Math.PI/10;
    final Container pan = new Panel();
    final Font font = new Font("Times New Roman", Font.ITALIC, 35);
    double angle = 0; 
     static int counter=0;
    final static int A = MX-50, B = MY-50;
    public int doTick() {
        angle += DELTA;
        counter++;
        pan.repaint();
        return 200;
    }

    public Container container() {
        return pan;
    }

    public String description() {
        return "Dancing String";
    }

    public String author() {
        return "Muhammet Ali GULBAHCE";
    }

    class Panel extends javax.swing.JPanel { 

        @Override
        public void paint(Graphics g) {
            g.clearRect(0, 0, 2 * MX, 2 * MY);
            
            
            g.setFont(font);
            String s = "RoseGarden";
            double x = MX + A * Math.cos(angle);
          double y = MY + B * Math.sin(angle);
            g.setColor(Color.DARK_GRAY);
            
            int dance=counter%2+1;
            
            g.drawString(s, (int)x*dance,(int)y*dance);
        }
    }
}

