import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicketForm extends JFrame implements ActionListener {
	
    private final int FRAME_WIDTH = 370;
    private final int FRAME_HEIGHT = 620;
    private final int FRAME_X = 700;
    private final int FRAME_Y = 150; 
    
    // object
    private JPanel enterData;
    private JLabel blank;
    private JPanel count;
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
        this.setTitle("Concert Ticket Calculator");
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.setLocation(FRAME_X,FRAME_Y);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Setting up ContentPanel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout()); 
        this.add(contentPanel);
        
        //
        JPanel count = new JPanel();
        JPanel price = new JPanel();
        
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
        JPanel enterData = new JPanel();
        enterData.setBorder(BorderFactory.createTitledBorder("Enter Data"));
        enterData.setPreferredSize(new Dimension(12, 120));
        enterData.setLayout(new FlowLayout());
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
        reportText.setColumns(28);
        reportText.setRows(17);
        reportText.setFont(new Font("Courier", Font.BOLD, 14));
        reportText.setLineWrap(true);
        reportText.setWrapStyleWord(true);
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
        contentPanel.add(enterData, BorderLayout.NORTH);
        contentPanel.add(report, BorderLayout.CENTER);
		contentPanel.add(buttonPanel, BorderLayout.SOUTH);
		
	}
		
	@Override
	public void actionPerformed(ActionEvent event) {
		
    	if (event.getSource() == btnReset) {
    		seatACount.setText("");
    		seatAPrice.setText("");
    		seatBCount.setText("");
    		seatBPrice.setText("");
    		seatCCount.setText("");
    		seatCPrice.setText("");
    		seatACount.requestFocusInWindow();

    	}
	}	
	
	
	
    // ------------------------------------------- main method
	public static void main(String[] args) {
		TicketForm jframeForm;
        jframeForm = new TicketForm();
        jframeForm.setVisible(true);
	}	
}
