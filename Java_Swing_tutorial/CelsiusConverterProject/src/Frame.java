import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Frame extends JFrame{
}

public static void main(String[] args){

    /*JFrame frame = new JFrame();//creates a frame
    frame.setVisible(true); //makes the frame visible
    frame.setSize(420,420); //sets the size of the frame
    frame.setTitle("This is a JFrame!"); //sets title of the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits out of application
    //frame.setResizable(false); //makes it so you can't resize the frame

    ImageIcon image = new ImageIcon("Cat.png"); //creates an ImageIcon (must be located outside the src file)
    frame.setIconImage(image.getImage()); //change icon of frame
    Border border = BorderFactory.createLineBorder(Color.GREEN, 5); //creates a border

    frame.getContentPane().setBackground(new Color(120,50,210)); //change color of background

    //MyFrame myFrame = new MyFrame(); //Create a frame using Inheritance

    JLabel label = new JLabel(); //creates a new label
    label.setText("This is a string for my label"); //sets the text of the label
    //frame.add(label);// adds the label to the frame
    label.setIcon(image);//adds an image icon to the label
    label.setHorizontalTextPosition(JLabel.CENTER); // set text position LEFT, CENTER, or RIGHT of image icon
    label.setVerticalTextPosition(JLabel.BOTTOM); //set text TOP, CENTER, or BOTTOM of image icon
    label.setForeground(new Color(190,100,12));// change the font color
    label.setFont(new Font("MV Boli",Font.PLAIN,25)); //change the font type and size
    label.setIconTextGap(30);//changes the gap between the text and the image icon
    label.setBackground(Color.BLACK); //sets the background color of the label
    label.setOpaque(true);// sets the opacity of the label
    label.setBorder(border);//adds the border to the label
    label.setVerticalAlignment(JLabel.CENTER); //sets the vertical position of Icon and text within the label
    label.setHorizontalAlignment(JLabel.CENTER); //sets the horizontal position of Icon and text within the label

    frame.setLayout(null); //sets the layout manager to be null
    label.setBounds(0,0,600,600); //sets the x,y position and size of the label
    //frame.pack(); // makes frame size adjust to fit all elements in the frame


    JPanel redPanel = new JPanel(); //creates a JPanel
    redPanel.setBackground(Color.RED); //sets background color of panel
    redPanel.setBounds(0,0,150,150); //sets the size and position of the panel
    redPanel.setLayout(new BorderLayout());
    frame.add(redPanel); //adds the panel to the frame

    JPanel bluePanel = new JPanel();
    bluePanel.setBackground(Color.BLUE);
    bluePanel.setBounds(150,0,150,150);
    frame.add(bluePanel);

    JPanel greenPanel = new JPanel();
    greenPanel.setBackground(Color.GREEN);
    greenPanel.setBounds(0,150,300,150);
    frame.add(greenPanel);

    JLabel panelLabel = new JLabel("Hello");
    panelLabel.setVerticalAlignment(JLabel.BOTTOM);
    panelLabel.setHorizontalAlignment(JLabel.CENTER);
    redPanel.add(panelLabel);


    frame.revalidate(); // updates the frame's layout
    frame.repaint();    // makes frame redraw itself on screen
     */
    JFrame myFrame = new MyFrame();
}