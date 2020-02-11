import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Test class for NaturalNumber calculator GUI (view in MVC).
 * 
 * @author Put your name here
 */
public final class NNCalcViewLab extends JFrame implements ActionListener {

    /**
     * Text areas.
     */
    private final JTextArea tTop, tBottom;

    /**
     * Operator and related buttons.
     */
    private final JButton bClear, bSwap, bEnter, bAdd, bSubtract, bMultiply,
            bDivide, bPower, bRoot;

    /**
     * Digit entry buttons.
     */
    private final JButton[] bDigits;

    /**
     * Useful constants.
     */
    private static final int TEXT_AREA_HEIGHT = 5, TEXT_AREA_WIDTH = 20,
            DIGIT_BUTTONS = 10, MAIN_BUTTON_PANEL_GRID_ROWS = 4,
            MAIN_BUTTON_PANEL_GRID_COLUMNS = 4,
            SIDE_BUTTON_PANEL_GRID_ROWS = 3,
            SIDE_BUTTON_PANEL_GRID_COLUMNS = 1, CALC_GRID_ROWS = 3,
            CALC_GRID_COLUMNS = 1;

    /**
     * No-argument constructor.
     */
    public NNCalcViewLab() {

        // Create the JFrame being extended

        /*
         * Call the JFrame (superclass) constructor with a String parameter to
         * name the window in its title bar
         */
        super("Natural Number Calculator");

        // Set up the GUI widgets --------------------------------------------

        // TODO: fill in rest of body, following outline in comments

        /*
         * Create widgets
         */

        // Set up the GUI widgets --------------------------------------------

        /*
         * Text areas should wrap lines, and should be read-only; they cannot be
         * edited because allowing keyboard entry would require checking whether
         * entries are digits, which we don't want to have to do
         */
        
        this.tTop = new JTextArea("", TEXT_AREA_HEIGHT, TEXT_AREA_WIDTH);
        this.tBottom = new JTextArea("", TEXT_AREA_HEIGHT, TEXT_AREA_WIDTH);
        
        
        /*
         * Initially, the following buttons should be disabled: divide (divisor
         * must not be 0) and root (root must be at least 2) -- hint: see the
         * JButton method setEnabled
         */
        
        /*
         * Create scroll panes for the text areas in case number is long enough
         * to require scrolling
         */
        
        JScrollPane tTopScroll = new JScrollPane(this.tTop);
        
        JScrollPane tBottomScroll = new JScrollPane(this.tBottom);
        
//        JScrollPane inputTextScrollPaneTop = 
//        		new JScrollPane(this.tTop);
//        JScrollPane inputTextScrollPaneBottom =
//        		new JScrollPane(this.tBottom);
        
        
        /*
         * Create main button panel
         */
        
        JPanel mainButtonPanel =
        		new JPanel(
        		new GridLayout(
        				MAIN_BUTTON_PANEL_GRID_ROWS,
        				MAIN_BUTTON_PANEL_GRID_COLUMNS));
        
        /*
         * Add the buttons to the main button panel, from left to right and top
         * to bottom
         */
        bDigits = new JButton[10];
        for(Integer i = 0; i < 10; i ++){
        	bDigits[i] = new JButton(i.toString());
        }
        
       bAdd = new JButton("+");
       bSubtract = new JButton("-");
       bMultiply = new JButton("*");
       bPower = new JButton("Power");
       bRoot = new JButton("Root");
       bDivide = new JButton("/");
       bClear = new JButton("Clear");
       bSwap = new JButton("Swap");
       bEnter = new JButton("Enter");
    		   
        
        
        mainButtonPanel.add(this.bDigits[7]);
        mainButtonPanel.add(this.bDigits[8]);
        mainButtonPanel.add(this.bDigits[9]);
        mainButtonPanel.add(bAdd);
        
        mainButtonPanel.add(this.bDigits[4]);
        mainButtonPanel.add(this.bDigits[5]);
        mainButtonPanel.add(this.bDigits[6]);
        mainButtonPanel.add(bSubtract);
        
        mainButtonPanel.add(this.bDigits[1]);
        mainButtonPanel.add(this.bDigits[2]);
        mainButtonPanel.add(this.bDigits[3]);
        mainButtonPanel.add(bMultiply);
        
        mainButtonPanel.add(this.bDigits[0]);
        mainButtonPanel.add(bPower);
        mainButtonPanel.add(bRoot);
        mainButtonPanel.add(bDivide);
        
        
        /*
         * Create side button panel
         */
        
        JPanel sidePanel = new JPanel(
        		new GridLayout(
        				SIDE_BUTTON_PANEL_GRID_ROWS, 
        				SIDE_BUTTON_PANEL_GRID_COLUMNS));
        
        /*
         * Add the buttons to the side button panel, from left to right and top
         * to bottom
         */
        
        sidePanel.add(bClear);
        sidePanel.add(bSwap);
        sidePanel.add(bEnter);

        /*
         * Create combined button panel organized using flow layout, which is
         * simple and does the right thing: sizes of nested panels are natural,
         * not necessarily equal as with grid layout
         */
        JPanel combinedPanel = 
        		new JPanel(new FlowLayout());
        /*
         * Add the other two button panels to the combined button panel
         */
        combinedPanel.add(mainButtonPanel);
        combinedPanel.add(sidePanel);
        /*
         * Organize main window
         */
        
        JPanel mainWindow = 
        		new JPanel(new GridLayout(3,1));
        
        mainWindow.add(tTopScroll);
        mainWindow.add(tBottomScroll);
        mainWindow.add(combinedPanel);
     
       
        /*
         * Add scroll panes and button panel to main window, from left to right
         * and top to bottom
         */
        
        JScrollPane inputTextScrollPane2 = 
        		new JScrollPane(mainWindow);
        this.add(mainWindow);
       
        
        	
        // Set up the observers ----------------------------------------------
        
        this.bClear.addActionListener(this);
        this.bSwap.addActionListener(this);
        this.bEnter.addActionListener(this);
        this.bAdd.addActionListener(this);
        this.bSubtract.addActionListener(this);
        this.bMultiply.addActionListener(this);
        this.bDivide.addActionListener(this);
        this.bPower.addActionListener(this);
        this.bRoot.addActionListener(this);
        this.bDigits[0].addActionListener(this);
        this.bDigits[1].addActionListener(this);
        this.bDigits[2].addActionListener(this);
        this.bDigits[3].addActionListener(this);
        this.bDigits[4].addActionListener(this);
        this.bDigits[5].addActionListener(this);
        this.bDigits[6].addActionListener(this);
        this.bDigits[7].addActionListener(this);
        this.bDigits[8].addActionListener(this);
        this.bDigits[9].addActionListener(this);
        
        /*
         * Register this object as the observer for all GUI events
         */
        
        this.pack();
        this.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        
        // Set up the main application window --------------------------------

        /*
         * Make sure the main window is appropriately sized, exits this program
         * on close, and becomes visible to the user
         */

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JOptionPane.showMessageDialog(this,
                "You pressed: " + event.getActionCommand());
    }

    /**
     * Main method.
     * 
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        NNCalcViewLab view = new NNCalcViewLab();
    }

}