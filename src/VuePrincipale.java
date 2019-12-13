
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.io.UnsupportedEncodingException;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.SoftBevelBorder;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

public class VuePrincipale {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VuePrincipale window = new VuePrincipale();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VuePrincipale(Application application) {
		initialize();
	}

	public VuePrincipale() {
		initialize();
	}

	@SuppressWarnings("serial")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 723, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		//css choice between : (discontinued) 
		/*JFXPanel jfxPanel = new JFXPanel(); // Scrollable JCompenent
		Platform.runLater( () -> { // FX components need to be managed by JavaFX
		   WebView webView = new WebView();
		   webView.getEngine().loadContent( "<html> Hello World!" );
		   webView.getEngine().load( "http://www.stackoverflow.com/" );
		   jfxPanel.setScene( new Scene( webView ) );
		});
		*/
		/*
		 * (very old )

JEditorPane ep = new JEditorPane();
ep.setContentType("text/html");
ep.setText("html code");

*/
		JEditorPane message_zone = new JEditorPane();
		message_zone.setContentType("text/html");
	    message_zone.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    HTMLEditorKit kit = new HTMLEditorKit();
	    message_zone.setEditorKit(kit);
	    StyleSheet styleSheet = kit.getStyleSheet();
	    styleSheet.addRule(".alignleft{color : rgb(0,128,25); font-weight: bold;text-align: left;}");
	    styleSheet.addRule(".alignright{color : rgb(0,0,25); font-weight: bold;text-align: right;}");
	    message_zone.setText("<html>" +
	            "<center><b><font size=6>Important Information</font></b></center>" +
	            "<div id=textbox><p class='alignleft'>left</p><p class='alignright'>right</p></div>" +
	            "</html>");
	    message_zone.setEditable(false);
		JTextArea txtrText = new JTextArea();
		txtrText.setText("\r\nAs it currently stands, this question is not a good fit for our Q&A format. We expect answers to be supported by facts, references, or expertise, but this question will likely solicit debate, arguments, polling, or extended discussion. If you feel that this question can be improved and possibly reopened, visit the help center for guidance.\r\nClosed 8 years ago.\r\nLocked. This question and its answers are locked because the question is off-topic but has historical significance. It is not currently accepting new answers or interactions.\r\n\r\nI'm looking for a good GUI designer for swing in eclipse. My preference is for a free/open-source plugin.\r\njava eclipse swing gui-designer\r\nshare\r\nasked Aug 27 '08 at 3:06\r\njumar\r\n5,09577 gold badges3939 silver badges4242 bronze badges\r\n\r\n    11\r\n    The reason this question was closed is that it is effectively a poll. There rarely is one answer to the \"Best XXX for YYY\" style of question, so these don't fit well with the Stack Overflow question system. There are plenty of other sites to go to in order to find lists of products and subjective discussions about them, but we've found that they don't work here. \u2013 Brad Larson\u2666 Jul 2 '12 at 16:05\r\n    126 voted for the question. 70 voted for the chosen answer. Not constructive enough for you? Your comment received 7 votes. \u2013 Agnel Kurian Jul 2 '12 at 17:06 \r\n\r\n4\r\n@Agnel Kurian: \"asked Aug 27 '08\" \"answered Sep 28 '10\" Considering that the comment was posted just an hour ago... \u0CA0_\u0CA0 \u0CA0_\u0CA0 \u0CA0_\u0CA0 \u2013 BoltClock\u2666 Jul 2 '12 at 17:20\r\n2\r\nWhy not keep it as a CW? It's useful and the votes prove it, that's what's most important \u2013 Kos Jul 3 '12 at 8:54\r\n");
		frame.getContentPane().add(message_zone, BorderLayout.CENTER);
		
		JList<String> list = new JList<String>();
		list.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		list.setFont(new Font("Tahoma", Font.ITALIC, 18));
		list.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"aqzefrsdhb", "srgbsrhbs", "rsgbrshbrs", "rsdhbrdhber"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		
		frame.getContentPane().add(list, BorderLayout.WEST);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(200,35));
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Send ! 😎");
		btnNewButton.setFont(new Font("Arial Unicode MS", Font.BOLD, 18));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1;
			btnNewButton_1 = new JButton("Déconnexion 😥");
			btnNewButton_1.setFont(new Font("Arial Unicode MS", Font.BOLD, 18));
			panel.add(btnNewButton_1);
	}
}