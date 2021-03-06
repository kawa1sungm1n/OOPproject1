import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicketForm extends JFrame implements ActionListener {
	
	// Frame size
    private final int FRAME_WIDTH = 370;
    private final int FRAME_HEIGHT = 550;
    private final int FRAME_X = 700;
    private final int FRAME_Y = 150; 
    
    // Objects
    private JPanel topCount = new JPanel();
    private JPanel topPrice = new JPanel();
    private JLabel count;
    private JLabel price;
    private JTextField seatACount;
    private JTextField seatAPrice;
    private JLabel seatA;
    private JTextField seatBCount;
    private JTextField seatBPrice;
    private JLabel seatB;
    private JTextField seatCCount;
    private JTextField seatCPrice;
    private JLabel seatC;
    private JButton btnReport;
    private JButton btnReset;
    private JTextArea reportText;
    
	public TicketForm() {
		
		// setup
        this.setTitle("Concert Ticket Calculator");						// set Frame's name
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.setLocation(FRAME_X,FRAME_Y);
        this.setResizable(false);										// user cannot change sizes
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);			// Click " X ", then end this program

        
        // Setting up ContentPanel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10 , 10 , 10));
        this.add(contentPanel);
        
        // Count and Price bar, using setBorder()
        topCount.setBorder(BorderFactory.createEmptyBorder(0, 98, 0, 0));
        count = new JLabel("Count");
        topCount.add(count);
        topPrice.setBorder(BorderFactory.createEmptyBorder(0, 58, 0, 60));
        price = new JLabel("Price($)");
        topPrice.add(price);
        
        // Seat A 
        seatACount = new JTextField();
        seatACount.setColumns(12);
        seatACount.setFont(new Font("Courier", Font.PLAIN, 11));		// PLAIN == Default
        seatACount.addActionListener(this);
        
        seatAPrice = new JTextField();			
        seatAPrice.setColumns(12);
        seatAPrice.setFont(new Font("Courier", Font.PLAIN, 11));
        
        seatAPrice.addActionListener(this);
        
        seatA = new JLabel("Enter for Seat A:");
        
        // Seat B
        seatBCount = new JTextField();
        seatBCount.setColumns(12);
        seatBCount.setFont(new Font("Courier", Font.PLAIN, 11));
        seatBCount.addActionListener(this);
        
        seatBPrice = new JTextField();
        seatBPrice.setColumns(12);
        seatBPrice.setFont(new Font("Courier", Font.PLAIN, 11));
        
        seatBPrice.addActionListener(this);
        
        seatB = new JLabel("Enter for Seat B:");
        
        // Seat C
        seatCCount = new JTextField();
        seatCCount.setColumns(12);
        seatCCount.setFont(new Font("Courier", Font.PLAIN, 11));
        seatCCount.addActionListener(this);
        
        seatCPrice = new JTextField();
        seatCPrice.setColumns(12);
        seatCPrice.setFont(new Font("Courier", Font.PLAIN, 11));
        
        seatCPrice.addActionListener(this);
        
        seatC = new JLabel("Enter for Seat C:");
        
        // Enter Data Section
        // put into enterData panel
        JPanel enterData = new JPanel();
        enterData.setBorder(BorderFactory.createTitledBorder("Enter Data"));
        enterData.setPreferredSize(new Dimension(12, 140));
        enterData.setLayout(new FlowLayout());
        enterData.add(topCount);
        enterData.add(topPrice);
        enterData.add(seatA);
        enterData.add(seatACount);
        enterData.add(seatAPrice);
        enterData.add(seatB);
        enterData.add(seatBCount);
        enterData.add(seatBPrice);
        enterData.add(seatC);
        enterData.add(seatCCount);
        enterData.add(seatCPrice);
        
        // Report Text Area
        reportText = new JTextArea();
        reportText.setColumns(29);
        reportText.setRows(14);
        reportText.setFont(new Font("Courier", Font.PLAIN, 12));
        reportText.setLineWrap(true);		// auto new line
        reportText.setWrapStyleWord(true);	// To ensure that the last word in a row is not divided into two lines when crossing a line
        reportText.setEditable(false);		
        reportText.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        
        // Report Section
        JPanel report = new JPanel();
        report.setBorder(BorderFactory.createTitledBorder("Report"));
        report.setLayout(new FlowLayout());
        report.add(reportText);
        
        // Button
        btnReport = new JButton("Create Report");
        btnReport.addActionListener(this);
        
        btnReset = new JButton("Reset");
        btnReset.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        buttonPanel.add(btnReport);
        buttonPanel.add(btnReset);
        
        // put into contentPanel
        // and set location
        contentPanel.add(enterData, BorderLayout.NORTH);
        contentPanel.add(report, BorderLayout.CENTER);
		contentPanel.add(buttonPanel, BorderLayout.SOUTH);
		
	}
		
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if (event.getSource() == btnReport) {
			// Show Report
			Seat seatA = new Seat(Integer.parseInt(seatACount.getText()),Double.parseDouble(seatAPrice.getText()),'A');		// count = integer, price = decimal 
			Seat seatB = new Seat(Integer.parseInt(seatBCount.getText()),Double.parseDouble(seatBPrice.getText()),'B');
			Seat seatC = new Seat(Integer.parseInt(seatCCount.getText()),Double.parseDouble(seatCPrice.getText()),'C');
			Report report = new Report(seatA, seatB, seatC);		
			reportText.setText(report.toString());							// get information from Report.java, toString()
			reportText.setFont(new Font("Monospaced", Font.PLAIN, 12));		// set font Monospace	
		}
		
    	if (event.getSource() == btnReset) {
    		// interface clear
    		seatACount.setText("");
    		seatAPrice.setText("");
    		seatBCount.setText("");
    		seatBPrice.setText("");
    		seatCCount.setText("");
    		seatCPrice.setText("");
    		reportText.setText("");
    		seatACount.requestFocusInWindow();		// User will start to type at Seat A Count Section
    	}	
	}	
	
		
    // ------------------------------------------- main method
	public static void main(String[] args) {
		TicketForm jframeForm;
        jframeForm = new TicketForm();
        jframeForm.setVisible(true);
	}	
}
