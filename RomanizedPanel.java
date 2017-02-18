import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

public class RomanizedPanel extends JPanel {
	private Color c;
	private int KEYBOARD_LENGTH = 1320;
	private int KEYBOARD_BREADTH = 320;

	RomanizedPanel() {
		setBounds(20, 370, KEYBOARD_LENGTH, KEYBOARD_BREADTH);
		c = new Color(119, 136, 153);
		setBackground(c);
		setBorder(new BevelBorder(BevelBorder.RAISED, Color.black, Color.white, Color.black, Color.white));
		setLayout(null);

		JPanel numberPanel = new JPanel();
		numberPanel.setBounds(106, 12, 121, 296);
		add(numberPanel);
		numberPanel.setLayout(null);

		JLabel label = new JLabel("Number");
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		label.setBounds(29, 0, 80, 22);
		numberPanel.add(label);

		JLabel lblu = new JLabel("0=  \u0966 ");
		lblu.setFont(new Font("Dialog", Font.BOLD, 14));
		lblu.setBounds(12, 27, 70, 15);
		numberPanel.add(lblu);

		JLabel label_1 = new JLabel("1=  \u0967");
		label_1.setFont(new Font("Dialog", Font.BOLD, 14));
		label_1.setBounds(12, 49, 70, 15);
		numberPanel.add(label_1);

		JLabel label_2 = new JLabel("2=  \u0968");
		label_2.setFont(new Font("Dialog", Font.BOLD, 14));
		label_2.setBounds(12, 67, 70, 15);
		numberPanel.add(label_2);

		JLabel label_3 = new JLabel("3=  \u0969");
		label_3.setFont(new Font("Dialog", Font.BOLD, 14));
		label_3.setBounds(12, 90, 70, 15);
		numberPanel.add(label_3);

		JLabel label_4 = new JLabel("4=  \u096A");
		label_4.setFont(new Font("Dialog", Font.BOLD, 14));
		label_4.setBounds(12, 117, 70, 15);
		numberPanel.add(label_4);

		JLabel label_5 = new JLabel("5=  \u096B");
		label_5.setFont(new Font("Dialog", Font.BOLD, 14));
		label_5.setBounds(12, 144, 70, 15);
		numberPanel.add(label_5);

		JLabel label_6 = new JLabel("6=  \u096C");
		label_6.setFont(new Font("Dialog", Font.BOLD, 14));
		label_6.setBounds(12, 171, 70, 15);
		numberPanel.add(label_6);

		JLabel label_7 = new JLabel("7=  \u096D");
		label_7.setFont(new Font("Dialog", Font.BOLD, 14));
		label_7.setBounds(12, 198, 70, 15);
		numberPanel.add(label_7);

		JLabel label_8 = new JLabel("8=  \u096E");
		label_8.setFont(new Font("Dialog", Font.BOLD, 14));
		label_8.setBounds(12, 225, 70, 15);
		numberPanel.add(label_8);

		JLabel label_9 = new JLabel("9=  \u096F");
		label_9.setFont(new Font("Dialog", Font.BOLD, 14));
		label_9.setBounds(12, 252, 70, 15);
		numberPanel.add(label_9);

		JPanel consonantPanel = new JPanel();
		consonantPanel.setBounds(239, 12, 342, 296);
		add(consonantPanel);
		consonantPanel.setLayout(null);

		JLabel lblconsonant = new JLabel("	    \u0935\u094D\u092F\u0928\u094D\u091C\u0928 (consonant)");
		lblconsonant.setFont(new Font("Dialog", Font.BOLD, 14));
		lblconsonant.setBounds(52, 12, 199, 15);
		consonantPanel.add(lblconsonant);

		JTextArea txtrK = new JTextArea();
		txtrK.setEditable(false);
		txtrK.setBackground(UIManager.getColor("ComboBox.disabledBackground"));
		txtrK.setFont(new Font("Dialog", Font.BOLD, 14));
		txtrK.setText("k   =\nkh =\ng   =\ngh = \nng = \nch = \nchh= \nj    = \njh  = \nyn = \nT   = \nTh = ");
		txtrK.setBounds(34, 38, 38, 246);
		consonantPanel.add(txtrK);

		JTextArea txtrF = new JTextArea();
		txtrF.setEditable(false);
		txtrF.setBackground(UIManager.getColor("ComboBox.disabledBackground"));
		txtrF.setFont(new Font("Dialog", Font.BOLD, 15));
		txtrF.setText(
				" \u0915\n \u0916\n \u0917\n \u0918\n \u0919\n \u091A\n \u091B\n \u091C\n \u091D\n \u091E\n \u091F\n \u0920\n \u0921\n \u0922\n \u0923");
		txtrF.setBounds(84, 39, 30, 209);
		consonantPanel.add(txtrF);

		JTextArea textArea = new JTextArea(
				"D   =\nDh =\nN   =\nt    =\nth  =\nd   =\ndh =\nn   =\np   =\nph =\nb   =\nbh =");
		textArea.setEditable(false);
		textArea.setBackground(UIManager.getColor("ComboBox.disabledBackground"));
		textArea.setFont(new Font("Dialog", Font.BOLD, 14));
		textArea.setBounds(139, 38, 46, 230);
		consonantPanel.add(textArea);

		JTextArea txtrSdaa = new JTextArea();
		txtrSdaa.setEditable(false);
		txtrSdaa.setBackground(UIManager.getColor("ComboBox.disabledBackground"));
		txtrSdaa.setFont(new Font("Dialog", Font.BOLD, 15));
		txtrSdaa.setText(
				" \u0921\n \u0922\n \u0923\n \u0924\n \u0925\n \u0926\n \u0927\n \u0928\n \u092A\n \u092B\n \u092C\n \u092D");
		txtrSdaa.setBounds(186, 38, 38, 209);
		consonantPanel.add(txtrSdaa);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(164, 38, 1, 15);
		consonantPanel.add(textArea_1);

		JTextArea txtrM = new JTextArea();
		txtrM.setEditable(false);
		txtrM.setBackground(UIManager.getColor("CheckBox.background"));
		txtrM.setFont(new Font("Dialog", Font.BOLD, 14));
		txtrM.setText("m   =\ny    =\nr    =\nl     =\nv    =\nsh  =\nSh  =\ns    =\nh    =\nksh =\ntr    =\ngyn =");
		txtrM.setBounds(236, 38, 46, 209);
		consonantPanel.add(txtrM);

		JTextArea txtrK_1 = new JTextArea();
		txtrK_1.setEditable(false);
		txtrK_1.setBackground(UIManager.getColor("CheckBox.background"));
		txtrK_1.setFont(new Font("Dialog", Font.BOLD, 15));
		txtrK_1.setText(
				" \u092E\n \u092F\n \u0930\n \u0932\n \u0935\n \u0936\n \u0937\n \u0938\n \u0939\n \u0915\u094D\u0937\n \u0924\u094D\u0930\n \u091C\u094D\u091E");
		txtrK_1.setBounds(284, 38, 46, 209);
		consonantPanel.add(txtrK_1);

		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("CheckBox.background"));
		panel.setBounds(593, 12, 280, 296);
		add(panel);
		panel.setLayout(null);

		JLabel lblvowels = new JLabel(" \u0938\u094D\u0935\u0930 (Vowels)");
		lblvowels.setFont(new Font("Dialog", Font.BOLD, 14));
		lblvowels.setBounds(32, 0, 121, 24);
		panel.add(lblvowels);

		JTextArea txtrA = new JTextArea();
		txtrA.setEditable(false);
		txtrA.setBackground(UIManager.getColor("CheckBox.background"));
		txtrA.setFont(new Font("Dialog", Font.BOLD, 14));
		txtrA.setText(
				"A    =\na    =\nAA  =\ni     =\nii    =\nu    =\noo  =\nrri  =\ne    =\nai   =\no    =\nau   =\nam  =\nah  =\n");
		txtrA.setBounds(42, 25, 46, 248);
		panel.add(txtrA);

		JTextArea textArea_2 = new JTextArea(
				" \u0905\n \u093E\n \u0906\n \u093F\n \u0940\n \u0941\n \u0942\n \u0943\n \u0947\n \u0947\n \u0948\n \u094B\n \u094C\n \u0902");
		textArea_2.setEditable(false);
		textArea_2.setFont(new Font("Dialog", Font.BOLD, 15));
		textArea_2.setBackground(UIManager.getColor("CheckBox.background"));
		textArea_2.setBounds(87, 25, 35, 248);
		panel.add(textArea_2);

		JTextArea txtrI = new JTextArea();
		txtrI.setEditable(false);
		txtrI.setBackground(UIManager.getColor("CheckBox.background"));
		txtrI.setFont(new Font("Dialog", Font.BOLD, 14));
		txtrI.setText("I   =\nIi  =\nU  =\nOo=\nRri=\nE =\nAi =\nO  =\nAu=");
		txtrI.setBounds(153, 25, 35, 169);
		panel.add(txtrI);

		JTextArea txtrF_1 = new JTextArea();
		txtrF_1.setEditable(false);
		txtrF_1.setBackground(UIManager.getColor("CheckBox.background"));
		txtrF_1.setFont(new Font("Dialog", Font.BOLD, 15));
		txtrF_1.setText(" \u0907\n \u0908\n \u0909\n \u090A\n \u090B\n \u090F\n \u0947\n \u0913\n \u0914");
		txtrF_1.setBounds(188, 25, 35, 185);
		panel.add(txtrF_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(885, 12, 285, 296);
		add(panel_1);
		panel_1.setLayout(null);

		JTextArea textArea_3 = new JTextArea(
				" S0    =\n om   =\n pb    =\n db    =\n hlnt  =\n ri     =\n chbn=\n ~     =\n =     =\n ?      =\n nkt  =\n");
		textArea_3.setEditable(false);
		textArea_3.setBackground(UIManager.getColor("CheckBox.background"));
		textArea_3.setFont(new Font("Dialog", Font.BOLD, 14));
		textArea_3.setBounds(83, 27, 63, 186);
		panel_1.add(textArea_3);

		JTextArea txtrDhsj = new JTextArea();
		txtrDhsj.setEditable(false);
		txtrDhsj.setBackground(UIManager.getColor("CheckBox.background"));
		txtrDhsj.setFont(new Font("Dialog", Font.BOLD, 15));
		txtrDhsj.setText(" \u0970\n \u0950\n \u0964\n \u0965\n \u094D\n \u0930\u094D\n \u0901\n ~\n =\n ?\n \u093C\n ");
		txtrDhsj.setBounds(146, 27, 51, 186);
		panel_1.add(txtrDhsj);

		JTextArea txtrPleasePressSpace = new JTextArea();
		txtrPleasePressSpace.setEditable(false);
		txtrPleasePressSpace.setFont(new Font("Dialog", Font.BOLD, 14));
		txtrPleasePressSpace.setBackground(UIManager.getColor("CheckBox.background"));
		txtrPleasePressSpace.setText("\n  Please press space for \n completion of every letter");
		txtrPleasePressSpace.setBounds(12, 220, 261, 64);
		panel_1.add(txtrPleasePressSpace);

		setVisible(true);

	}
}
