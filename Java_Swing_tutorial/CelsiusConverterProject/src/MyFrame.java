import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener, ChangeListener, KeyListener, MouseListener {


    JButton button = new JButton(); //creates a new button (global)
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button9 = new JButton("9");
    JButton button8 = new JButton("8");
    JButton button7 = new JButton("7");
    JLabel label = new JLabel();
    ImageIcon icon = new ImageIcon("Cat.png");
    JButton textButton = new JButton("Submit");
    JTextField textField = new JTextField(); //creates a text field
    JRadioButton pizzaButton;
    JRadioButton burgerButton;
    JRadioButton hotDogButton;
    JComboBox comboBox;
    JSlider slider;
    JLabel sliderLabel;
    JProgressBar bar;
    JMenuItem saveItem;
    JMenuItem exitItem;
    JMenuItem loadItem;
    JLabel colorLabel;
    JLabel movingLabel;
    JLabel cookieLabel;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    JLabel squareLabel;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);


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

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);


    }

    @Override // this is how to make the program listen for a specific action listener
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){ // checks to see if the action was from the button
            System.out.println("hello there");
            button.setEnabled(false);//disables the button
            button.setVisible(false);
            //label.setVisible(true);

            //Border Layout
            this.setLayout(new BorderLayout(10,10));

            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            JPanel panel3 = new JPanel();
            JPanel panel4 = new JPanel();
            JPanel panel5 = new JPanel();

            panel1.setBackground(Color.red);
            panel2.setBackground(Color.green);
            panel3.setBackground(Color.yellow);
            panel4.setBackground(Color.magenta);
            panel5.setBackground(Color.blue);

            panel1.setPreferredSize(new Dimension(100,100)); //sets preferred width and height of panels
            panel2.setPreferredSize(new Dimension(100,100)); //that are placed in the Border Layout areas
            panel3.setPreferredSize(new Dimension(100,100));
            panel4.setPreferredSize(new Dimension(100,100));
            panel5.setPreferredSize(new Dimension(100,100));

            this.add(panel1,BorderLayout.NORTH); //adds the panels to the different Border Layout areas
            this.add(panel2,BorderLayout.WEST);
            this.add(panel3,BorderLayout.EAST);
            this.add(panel4,BorderLayout.SOUTH);
            this.add(panel5,BorderLayout.CENTER);

            //panel5.add(label);
            //label.setVisible(true);


            //Flow Layout
            //panel5.setLayout(new FlowLayout(FlowLayout.CENTER,10,5)); //sets the FlowLayout manager and also the spacing of the components

            //Grid Layout
            panel5.setLayout(new GridLayout(3,3,10,10)); //creates grid layout with the first number the number of rows
            // second number is the number of columns, third number the horizontal spacing, fourth number the vertical spacing


            panel5.add(button1);
            panel5.add(button2);
            panel5.add(button3);
            panel5.add(button4);
            panel5.add(button5);
            panel5.add(button6);
            panel5.add(button7);
            panel5.add(button8);
            panel5.add(button9);


            //JLayeredPanes
            //this.setLayout(null);
            JLayeredPane layeredPane = new JLayeredPane();
            layeredPane.setBounds(0,0,500,500);
            //this.add(layeredPane);

            JLabel label2 = new JLabel();
            label2.setOpaque(true);
            label2.setBackground(Color.red);
            label2.setBounds(50,50,200,200);

            JLabel label3 = new JLabel();
            label3.setOpaque(true);
            label3.setBackground(Color.green);
            label3.setBounds(100,100,200,200);

            JLabel label4 = new JLabel();
            label4.setOpaque(true);
            label4.setBackground(Color.blue);
            label4.setBounds(150,150,200,200);

            layeredPane.add(label2,Integer.valueOf(0));
            layeredPane.add(label3,Integer.valueOf(4));
            layeredPane.add(label4,Integer.valueOf(2));

            panel4.setLayout(new FlowLayout());

            //text fields
            textField.setPreferredSize(new Dimension(250,40));
            textField.setFont(new Font("Consolas",Font.PLAIN,35));
            textField.setForeground(Color.green);
            textField.setBackground(Color.black);
            textField.setCaretColor(Color.white);
            textField.setText("Username");
            panel4.add(textField);
            textButton.addActionListener(this);
            panel4.add(textButton);

            //JCheckBoxes
            JCheckBox checkBox = new JCheckBox();
            panel1.add(checkBox);
            checkBox.setText("Are you awesome?");
            checkBox.setFocusable(false);

            //JRadioButtons
            panel2.setLayout(new FlowLayout());
            pizzaButton = new JRadioButton("Pizza"); //creates a new Radio Button
            burgerButton = new JRadioButton("Burger");
            hotDogButton = new JRadioButton("HotDog");
            ButtonGroup group = new ButtonGroup();
            pizzaButton.addActionListener(this);
            burgerButton.addActionListener(this);
            hotDogButton.addActionListener(this);
            group.add(pizzaButton);
            group.add(burgerButton);
            group.add(hotDogButton);
            panel2.add(pizzaButton);
            panel2.add(burgerButton);
            panel2.add(hotDogButton);

            //JComboBoxes
            String[] animals = {"dog","cat","bird"};
            comboBox = new JComboBox(animals);
            panel2.add(comboBox);
            comboBox.addActionListener(this);
            //comboBox.setEditable(true);
            comboBox.addItem("horse");
            comboBox.insertItemAt("pig",0);
            comboBox.setSelectedIndex(0);
            comboBox.removeItem("pig");
            //comboBox.removeAllItems();


            //JSliders
            panel3.setLayout(new FlowLayout());
            slider = new JSlider(0,100);
            slider.setPreferredSize(new Dimension(50,170));
            panel3.add(slider);
            slider.setPaintTicks(true);
            slider.setMinorTickSpacing(10);
            slider.setPaintTrack(true);
            slider.setMajorTickSpacing(25);
            slider.setPaintLabels(true);
            slider.setOrientation(SwingConstants.VERTICAL);
            sliderLabel = new JLabel();
            sliderLabel.setPreferredSize(new Dimension(80,40));
            sliderLabel.setText("" + slider.getValue());
            sliderLabel.setVisible(true);
            sliderLabel.setFont(new Font("", Font.PLAIN, 30));
            panel3.add(sliderLabel);
            slider.addChangeListener(this);

            this.revalidate();
            this.repaint();

            //JProgressBar
            bar = new JProgressBar(0,100);
            bar.setValue(0);
            bar.setPreferredSize(new Dimension(200,50));
            bar.setStringPainted(true);
            panel1.add(bar);
            //fill();


            //JMenuBars
            JMenuBar menuBar = new JMenuBar();

            JMenu fileMenu = new JMenu("File");
            JMenu editMenu = new JMenu("Edit");
            JMenu helpMenu = new JMenu("Help");

            loadItem = new JMenuItem("Load");
            saveItem = new JMenuItem("Save");
            exitItem = new JMenuItem("Exit");

            menuBar.add(fileMenu);
            menuBar.add(editMenu);
            menuBar.add(helpMenu);

            fileMenu.add(loadItem);
            fileMenu.add(saveItem);
            fileMenu.add(exitItem);

            loadItem.addActionListener(this);
            saveItem.addActionListener(this);
            exitItem.addActionListener(this);

            //Keyboard shortcuts
            fileMenu.setMnemonic(KeyEvent.VK_F); //Alt + F for file
            loadItem.setMnemonic(KeyEvent.VK_L); //L for load
            saveItem.setMnemonic(KeyEvent.VK_S); //S for save
            exitItem.setMnemonic(KeyEvent.VK_E); //E for exit

            this.setJMenuBar(menuBar);

            //File selection --> in button7 clicked code

            //Color chooser
            colorLabel = new JLabel();
            colorLabel.setText("This is a nice colour!");
            colorLabel.setVisible(true);
            colorLabel.setPreferredSize(new Dimension(300,30));
            colorLabel.setFont(new Font(null,Font.PLAIN,30));
            panel1.add(colorLabel);


            this.revalidate();
            this.repaint();
        }
        else if((e.getSource()==button5)){
            this.getContentPane().removeAll();
            this.setLayout(null);
            this.getContentPane().setBackground(Color.black);

            squareLabel = new JLabel();
            squareLabel.setVisible(true);
            squareLabel.setBounds(0,0,100,100);
            squareLabel.setBackground(Color.red);
            squareLabel.setOpaque(true);
            this.add(squareLabel);

            upAction = new UpAction();
            downAction = new DownAction();
            leftAction = new LeftAction();
            rightAction = new RightAction();

            squareLabel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("UP"),"upAction");
            squareLabel.getActionMap().put("upAction",upAction);
            squareLabel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("DOWN"),"downAction");
            squareLabel.getActionMap().put("downAction",downAction);
            squareLabel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
            squareLabel.getActionMap().put("leftAction",leftAction);
            squareLabel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
            squareLabel.getActionMap().put("rightAction",rightAction);

        }
        else if((e.getSource()==button9)){
            JOptionPane.showMessageDialog(null,"This is some useless info", "Title", JOptionPane.PLAIN_MESSAGE);//creates a plain message pop up (no image icon)
            JOptionPane.showMessageDialog(null,"This is some useless info", "Title", JOptionPane.INFORMATION_MESSAGE);//information pop up (changes image icon)
            JOptionPane.showMessageDialog(null,"This is some useless info", "Title", JOptionPane.QUESTION_MESSAGE);//question pop up (changes image icon)
            JOptionPane.showMessageDialog(null,"This is some useless info", "Title", JOptionPane.WARNING_MESSAGE);//Warning pop up (changes image icon)
            JOptionPane.showMessageDialog(null,"This is some useless info", "Title", JOptionPane.ERROR_MESSAGE);//error pop up (changes image icon)

            System.out.println(JOptionPane.showConfirmDialog(null,"Pick yes or no", "another title", JOptionPane.YES_NO_CANCEL_OPTION));//lets you respond to the pop-up box

            System.out.println(JOptionPane.showInputDialog("What is your name?: ")); //lets you type into the pop-up box and return the text imputed

            String[] responses = {"No you're awesome","Thank you", "Blush"}; //this pop-up box is a customized version that takes the string list as the button option names
            System.out.println(JOptionPane.showOptionDialog(null,"You are awesome", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,icon,responses,0));
        }
        else if(e.getSource()==textButton){
            System.out.println(textField.getText());
            textField.setEditable(false);//stops you from editing the text field
            textButton.setEnabled(false);
        }
        else if(e.getSource()==pizzaButton){
            System.out.println("You ordered Pizza!");
        }
        else if(e.getSource()==burgerButton){
            System.out.println("You ordered a Burger!");
        }
        else if(e.getSource()==hotDogButton){
            System.out.println("You ordered a HotDog!");
        }
        else if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
        else if(e.getSource()==button8){
            bar.setString(null);
            button8.setEnabled(false);
            fill();
        }
        else if(e.getSource()==saveItem){
            System.out.println("Saved!");
        }
        else if(e.getSource()==loadItem){
            this.dispose(); //closes this window but not program
            MyFrame frame = new MyFrame();//opens a new window of this class if button 5 is pressed
        }
        else if(e.getSource()==exitItem){
            System.exit(0);
        }
        else if(e.getSource()==button7){ //File Choosers
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null); //select file to open

            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
        else if(e.getSource()==button6){ //JColorChooser
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null,"Pick a colour",Color.black);
            colorLabel.setForeground(color);
        }
        else if(e.getSource()==button4){ //Key Inputs
            this.getContentPane().removeAll();
            this.setLayout(null);
            this.getContentPane().setBackground(Color.black);
            this.addKeyListener(this);
            this.setFocusable(true);
            this.requestFocusInWindow();

            Image originalImage = icon.getImage();
            Image scaledImage = originalImage.getScaledInstance(100,100,Image.SCALE_SMOOTH);
            ImageIcon smallIcon = new ImageIcon(scaledImage);

            movingLabel = new JLabel();
            movingLabel.setIcon(smallIcon);
            movingLabel.setVisible(true);
            movingLabel.setBounds(0,0,100,100);
            this.add(movingLabel);


            this.revalidate();
            this.repaint();
        }
        else if(e.getSource()==button3){ //Key Inputs
            this.getContentPane().removeAll();
            this.setLayout(null);
            this.getContentPane().setBackground(Color.black);
            this.setFocusable(true);
            this.requestFocusInWindow();

            Image originalImage = icon.getImage();
            Image scaledImage = originalImage.getScaledInstance(100,100,Image.SCALE_SMOOTH);
            ImageIcon smallIcon = new ImageIcon(scaledImage);

            cookieLabel = new JLabel();
            cookieLabel.setIcon(smallIcon);
            cookieLabel.setVisible(true);
            cookieLabel.setBounds(180,170,100,100);
            cookieLabel.addMouseListener(this);
            this.add(cookieLabel);



            this.revalidate();
            this.repaint();
        }
        else if(e.getSource()==button2){
            this.getContentPane().removeAll();
            this.setLayout(null);
            DragPanel dragPanel = new DragPanel();
            this.add(dragPanel);

            this.revalidate();
            this.repaint();
        }
        else if(e.getSource()==button1){
            this.getContentPane().removeAll();
            this.setLayout(new BorderLayout());

            MyDrawingPanel drawingPanel = new MyDrawingPanel();
            this.add(drawingPanel);

            //MyDrawing drawing = new MyDrawing();
            //this.add(drawing);

            this.pack();

            this.revalidate();
            this.repaint();
        }

    }

    @Override
    public void stateChanged(ChangeEvent e){
        sliderLabel.setText("" + slider.getValue());
    }

    @Override
    public void keyTyped(KeyEvent e) { //called when a key is typed, it uses KeyChar with a char output
        switch(e.getKeyChar()) {
            case 'a':
                movingLabel.setLocation(movingLabel.getX() - 5,movingLabel.getY());
                break;
            case 'd':
                movingLabel.setLocation(movingLabel.getX() + 5,movingLabel.getY());
                break;
            case 'w':
                movingLabel.setLocation(movingLabel.getX(),movingLabel.getY() - 5);
                break;
            case 's':
                movingLabel.setLocation(movingLabel.getX(),movingLabel.getY() + 5);
                break;
        }
    }
    @Override
    public void keyPressed(KeyEvent e) { //called when a key is pressed down, it uses KeyCode with an int output

    }
    @Override
    public void keyReleased(KeyEvent e) { //called when a key is released
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }


    public void fill(){
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    // Simulate doing some work
                    Thread.sleep(50);

                    // Send the current progress to process()
                    publish(i);
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                // This runs on the EDT, safely updating the GUI
                int latestProgress = chunks.get(chunks.size() - 1);
                bar.setValue(latestProgress);
                if (latestProgress == 100){
                    button8.setEnabled(true);
                    bar.setString("Done");
                }
            }
        };

        worker.execute(); // Start the background task
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You clicked the cookie cat!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public class UpAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            squareLabel.setLocation(squareLabel.getX(), squareLabel.getY()-5);
        }
    }
    public class DownAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            squareLabel.setLocation(squareLabel.getX(), squareLabel.getY()+5);
        }
    }
    public class LeftAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            squareLabel.setLocation(squareLabel.getX()-5, squareLabel.getY());
        }
    }
    public class RightAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            squareLabel.setLocation(squareLabel.getX()+5, squareLabel.getY());
        }
    }

    class MyDrawingPanel extends JPanel implements ActionListener{

        Image originalImage = icon.getImage();
        Image scaledImage = originalImage.getScaledInstance(100,100,Image.SCALE_SMOOTH);
        final int PANEL_WIDTH = 500;
        final int PANEL_HEIGHT = 500;
        Timer timer;
        double xVelocity = 2.5;
        double yVelocity = 1;
        double x = 0;
        double y = 0;

        MyDrawingPanel(){
            this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
            timer = new Timer(10,this);
            timer.start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2D = (Graphics2D) g;
            g2D.setPaint(Color.blue);
            g2D.setStroke(new BasicStroke(5));
            g2D.drawLine(0, 0, 500, 500);
            g2D.drawRect(50,50,200,100);
            g2D.fillRect(270,50,200,100);
            g2D.setPaint(Color.orange);
            g2D.drawOval(0,0,100,100);
            g2D.fillOval(320,50,100,100);
            g2D.drawArc(50,300,200,200,0,180);

            g2D.setPaint(Color.red);
            g2D.setStroke(new BasicStroke(1));
            g2D.fillArc(200,250,200,200,0,180);
            g2D.setPaint(Color.black);
            g2D.fillArc(200,250,200,200,180,180);
            g2D.setPaint(Color.white);
            g2D.fillArc(205,255,190,190,180,180);

            g2D.setPaint(Color.yellow);
            g2D.setStroke(new BasicStroke(5));
            int[] xPoints = {150,250,350};
            int[] yPoints = {350,200,400};
            g2D.drawPolygon(xPoints, yPoints, 3);
            g2D.setPaint(Color.magenta);
            yPoints[0] = 190;
            yPoints[1] = 40;
            yPoints[2] = 190;
            g2D.fillPolygon(xPoints, yPoints, 3);

            g2D.setFont(new Font("Ink Free",Font.BOLD,50));
            g2D.drawString("Amazing",20,250);

            g2D.drawImage(scaledImage,380,180,this);

            //Animations
            g2D.drawImage(scaledImage,(int)x,(int)y,this);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if((x + scaledImage.getWidth(this)>= PANEL_WIDTH) || (x < 0) ){
                xVelocity = xVelocity * -1;
            }
            if((y + scaledImage.getHeight(this)>= PANEL_HEIGHT) || (y < 0) ){
                yVelocity = yVelocity * -1;
            }
            x = x + xVelocity;
            y = y + yVelocity;
            repaint();
        }
    }

    class MyDrawing extends JPanel{

        MyDrawing(){
            this.setPreferredSize(new Dimension(500,500));
        }

        public void paint(Graphics g){
            Graphics2D g2D = (Graphics2D) g;
            g2D.drawLine(0,0,500,500);
        }
    }
}