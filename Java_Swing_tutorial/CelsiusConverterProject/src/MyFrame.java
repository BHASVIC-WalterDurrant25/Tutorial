import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{


    JButton button = new JButton(); //creates a new button (global)
    JLabel label = new JLabel();

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);

        ImageIcon icon = new ImageIcon("Cat.png");

        button.setBounds(150,150,150,50);
        this.add(button); //adds the button to MyFrame
        button.addActionListener(this); //adds an action listener to the button
        button.setText("I am a button!"); //sets the text for the button
        button.setFocusable(false); //removes box around text
        //button.setIcon(icon); //sets the image icon
        //button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,10));//sets the text formating of the button.
        button.setForeground(Color.red); //sets the font color
        button.setBackground(Color.LIGHT_GRAY); //sets the background color

        Border border = BorderFactory.createLineBorder(Color.blue, 5);
        button.setBorder(border); //sets border of button

        label.setBounds(0,0,500,500);
        label.setVisible(false);
        label.setIcon(icon);
        this.add(label);
    }

    @Override // this is how to make the program listen for a specific action listener
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){ // checks to see if the action was from the button
            System.out.println("hello there");
            button.setEnabled(false);//disables the button
            label.setVisible(true);
        }
    }
}