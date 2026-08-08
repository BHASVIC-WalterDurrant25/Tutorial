import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

public class DragPanel extends JPanel{

    ImageIcon icon = new ImageIcon("Cat.png");
    Image originalImage = icon.getImage();
    Image scaledImage = originalImage.getScaledInstance(100,100,Image.SCALE_SMOOTH);
    ImageIcon smallIcon = new ImageIcon(scaledImage);

    final int WIDTH = smallIcon.getIconWidth();
    final int HEIGHT = smallIcon.getIconHeight();
    Point imageCorner;
    Point previousPoint;
    boolean validDrag = false;

    DragPanel(){
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();


        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

        this.setBounds(0,0,500,500);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        smallIcon.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            if (e.getX() >= (int)imageCorner.getX() && e.getX() <= ((int)imageCorner.getX()+WIDTH)
                    && e.getY() >= (int)imageCorner.getY() && e.getY() <= ((int)imageCorner.getY()+HEIGHT)) {
                validDrag = true;
                previousPoint = e.getPoint();
            }
            else {
                validDrag = false;
            }
        }
    }

    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            if(validDrag) {
                Point currentPoint = e.getPoint();
                imageCorner.translate(
                        (int) (currentPoint.getX() - previousPoint.getX()),
                        (int) (currentPoint.getY() - previousPoint.getY()));
                previousPoint = currentPoint;
                repaint();
            }
        }
    }
}
