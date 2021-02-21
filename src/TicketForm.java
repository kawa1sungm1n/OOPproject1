import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicketForm extends JFrame implements ActionListener {
	
    private final int FRAME_WIDTH = 370;
    private final int FRAME_HEIGHT = 600;
    private final int FRAME_X = 700;
    private final int FRAME_Y = 150; 
    
    // object
    private JPanel enterData;
    private JLabel count;
    private JLabel price;
    private JTextField seatACount;
    private JTextField seatAPrice;
    private JLabel seatA;
    private JTextField seatBCount;
    private JTextField seatBPrice;
    private JLabel seatB;
    private JButton btnReport;
    private JButton btnReset;
    
	public TicketForm() {
		
		// setup
        this.setTitle("Concert Ticket Calculator");
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.setLocation(FRAME_X,FRAME_Y);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Setting up ContentPanel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout()); 
        this.add(contentPanel);
        
        // Seat A
        seatACount = new JTextField();
        seatACount.setColumns(12);
        seatACount.setFont(new Font("Courier", Font.PLAIN, 11));
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
        
        // Enter Data Section
        JPanel enterData = new JPanel();
        enterData.setBorder(BorderFactory.createTitledBorder("Enter Data"));
        enterData.setLayout(new FlowLayout());
        enterData.add(seatA);
        enterData.add(seatACount);
        enterData.add(seatAPrice);
        enterData.add(seatB);
        enterData.add(seatBCount);
        enterData.add(seatBPrice);
        
        JLabel count = new JLabel("Count");
        JLabel price = new JLabel("Price ($)");
        
        // Report Section
        JPanel report = new JPanel();
        report.setBorder(BorderFactory.createTitledBorder("Report"));
        report.setLayout(new FlowLayout());
        
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
        contentPanel.add(enterData, BorderLayout.NORTH);
        contentPanel.add(report, BorderLayout.CENTER);
		contentPanel.add(buttonPanel, BorderLayout.SOUTH);
		
	}
		
	@Override
	public void actionPerformed(ActionEvent event) {
		
    	if (event.getSource() == btnReset) {
    		
    	}
	}	
	
	
	
    // ------------------------------------------- main method
	public static void main(String[] args) {
		TicketForm jframeForm;
        jframeForm = new TicketForm();
        jframeForm.setVisible(true);
	}	
}
