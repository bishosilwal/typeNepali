import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

 public class DisplayNepali extends JPanel {

	static  JTextArea TextArea;
	Color c;
	JScrollPane scroll;
	static int displayPanelLength=1320;
	static int displayPanelBreadth=305;
	DisplayNepali(){
		TextArea= new JTextArea(10,59);
		setLayout(new FlowLayout());
		setBounds(20,15,displayPanelLength,displayPanelBreadth);
		c=new Color(122, 122, 122);

		setBackground(c);
		TextArea.setEditable(true);
		setBorder(new BevelBorder(BevelBorder.RAISED,Color.black, Color.white,Color.black, Color.white));
		TextArea.setFont(new Font(null,Font.PLAIN,23));	
		TextArea.addKeyListener(new TextAreaKeyListener());

  		scroll =new JScrollPane(TextArea);
		add(scroll);
		setVisible(true);
	}
	public static void setText(String nep_ch){
			TextArea.insert(nep_ch, TextArea.getCaretPosition());
	}
	public static JTextArea getTextArea(){
		return TextArea;
		
	}

}
