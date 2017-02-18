import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class KeyBoardButtonListener implements ActionListener {
	private StringBuilder str;
	private static boolean capsKey = false;
	private static boolean shiftKey = false;
	private static JButton[] normalButton;
	private static BufferedImage img_unclick[] = new BufferedImage[65];
	private static BufferedImage img_click[] = new BufferedImage[65];
	private static int temp_prev_index = -1, temp_index;
	private KeyMap mapper;
	private String key;

	public KeyBoardButtonListener() {
		normalButton = NepaliKeyboard.getButtonList();
		img_unclick = NepaliKeyboard.getUnclickImage();
		img_click = NepaliKeyboard.getclickImage();
		mapper = new KeyMap();

	}

	public static boolean isCapsKey() {
		return capsKey;
	}

	public static void setCapsKey(boolean capsKey) {
		KeyBoardButtonListener.capsKey = capsKey;
	}

	public static boolean isShiftKey() {
		return shiftKey;
	}

	public static void setShiftKey(boolean shiftKey) {
		KeyBoardButtonListener.shiftKey = shiftKey;
	}

	public static void setIcon(int index, String state) {
		if (state.equalsIgnoreCase("click")) {
			normalButton[index].setIcon(new ImageIcon(img_click[index]));
		} else if (state.equalsIgnoreCase("unclick")) {
			normalButton[index].setIcon(new ImageIcon(img_unclick[index]));
		}
	}

	public static int getTemp_index() {
		return temp_index;
	}

	public static void setTemp_index(int temp_index) {
		KeyBoardButtonListener.temp_index = temp_index;
	}

	public static int getTemp_prev_index() {
		return temp_prev_index;
	}

	public static void setTemp_prev_index(int temp_prev_index) {
		KeyBoardButtonListener.temp_prev_index = temp_prev_index;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		str = new StringBuilder(DisplayNepali.getTextArea().getText());

		String temp = DisplayNepali.getTextArea().getText();
		temp_index = Integer.valueOf(e.getActionCommand());

		key = null;
		if (capsKey || shiftKey) {
			if (temp_index == 28) {
				capsKey = false;
				setIcon(temp_index, "unclick");
			} else if (temp_index == 41 || temp_index == 52) {
				shiftKey = false;
				setIcon(temp_index, "unclick");
			} else {
				if (shiftKey)
					shiftKey = false;
				if (temp_prev_index != -1)
					setIcon(temp_prev_index, "unclick");
				if (temp_prev_index != temp_index) {
					setIcon(temp_index, "click");
					temp_prev_index = temp_index;
				}

				switch (String.valueOf(temp_index)) {
				case "0":
					key = "~";
					break;
				case "1":
					key = "1";
					break;
				case "2":
					key = "2";
					break;
				case "3":
					key = "ksh";
					break;
				case "4":
					key = "s0";
					break;
				case "5":
					key = "om";
					break;
				case "6":
					key = "db";
					break;
				case "7":
					key = "ng";
					break;
				case "8":
					key = "8";
					break;
				case "9":
					key = "9";
					break;
				case "10":
					key = "ah";
					break;
				case "11":
					key = "am";
					break;
				case "12":
					key = "=";
					break;
				case "13":
					break;
				case "14":
					key = "tab";
					break;
				case "15":
					key = "Th";
					break;
				case "16":
					key = "Au";
					break;
				case "17":
					key = "ai";
					break;
				case "18":
					key = "rri";
					break;
				case "19":
					key = "th";
					break;
				case "20":
					key = "yn";
					break;
				case "21":
					key = "oo";
					break;
				case "22":
					key = "ii";
					break;
				case "23":
					key = "O";
					break;
				case "24":
					key = "ph";
					break;
				case "25":
					key = "ri";
					break;
				case "26":
					key = "]";
					break;
				case "27":
					key = "\\";
					break;

				case "29":
					key = "E";
					break;
				case "30":
					key = "sh";
					break;
				case "31":
					key = "dh";
					break;
				case "32":
					key = "Oo";
					break;
				case "33":
					key = "gh";
					break;
				case "34":
					key = "A";
					break;
				case "35":
					key = "jh";
					break;
				case "36":
					key = "kh";
					break;
				case "37":
					key = "l";
					break;
				case "38":
					key = "Ii";
					break;
				case "39":
					key = "";
					break;
				case "40":
					key = "\n";
					break;
				case "42":
					key = "Rri";
					break;
				case "43":
					key = "Dh";
					break;
				case "44":
					key = "ch";
					break;
				case "45":
					key = "chbn";
					break;
				case "46":
					key = "bh";
					break;
				case "47":
					key = "N";
					break;
				case "48":
					key = "m";
					break;
				case "49":
					key = "?";
					break;
				case "50":
					key = "tr";
					break;
				case "51":
					key = "ru";
					break;
				case "56":
					key = "space";
					break;
				case "59":
					// caret position return the cursor position in text field
					// .start from 0
				case "60":
				case "61":
				case "62":
					break;
				}

			}

		} else {

			/*
			 * temp_index and temp_prev_index is used for changing the image
			 * inside the button so that when user click the image of button it
			 * will change the image icon and thus button clicking effect is
			 * visible.
			 */
			key = null;
			if (temp_prev_index != temp_index) {
				setIcon(temp_index, "click");
				if (temp_prev_index != -1)
					setIcon(temp_prev_index, "unclick");
				if (temp_index != 28)
					temp_prev_index = temp_index;
			}
			if (temp_index > 0 && temp_index < 11) {
				int i;
				i = temp_index % 10;
				key = "" + i;

			}
			switch (String.valueOf(temp_index)) {
			case "0":
				key = "~";
				break;
			case "11":
				key = "nkt";
				break;
			case "12":
				key = "hlnt";
				break;
			case "13":
				break;
			case "14":
				key = "tab";
				break;
			case "15":
				key = "T";
				break;
			case "16":
				key = "au";
				break;
			case "17":
				key = "e";
				break;
			case "18":
				key = "r";
				break;
			case "19":
				key = "t";
				break;
			case "20":
				key = "y";
				break;
			case "21":
				key = "u";
				break;
			case "22":
				key = "i";
				break;
			case "23":
				key = "o";
				break;
			case "24":
				key = "p";
				break;
			case "25":
				key = "rri";
				break;
			case "26":
				key = "]";
				break;
			case "27":
				key = "\\";
				break;
			case "28":
				capsKey = true;
				break;
			case "29":
				key = "a";
				break;
			case "30":
				key = "s";
				break;
			case "31":
				key = "d";
				break;
			case "32":
				key = "U";
				break;
			case "33":
				key = "g";
				break;
			case "34":
				key = "h";
				break;
			case "35":
				key = "j";
				break;
			case "36":
				key = "k";
				break;
			case "37":
				key = "l";
				break;
			case "38":
				key = "I";
				break;
			case "39":
				key = "gyn";
				break;
			case "40":
				key = "\n";
				break;
			case "52":
			case "41":
				shiftKey = true;
				break;
			case "42":
				key = "Sh";
				break;
			case "43":
				key = "D";
				break;
			case "44":
				key = "chh";
				break;
			case "45":
				key = "v";
				break;
			case "46":
				key = "b";
				break;
			case "47":
				key = "n";
				break;
			case "48":
				key = "m";
				break;
			case "49":
				key = ",";
				break;
			case "50":
				key = "pb";
				break;
			case "51":
				key = "ru";
				break;
			case "56":
				key = "space";
				break;
			case "59":
				// caret position return the cursor position in text fild .start
				// from 0
				DisplayNepali.getTextArea().setCaretPosition(DisplayNepali.getTextArea().getCaretPosition() - 1);

				break;
			case "60":
			case "61":
			case "62":
				break;
			}

		}
		if (key == null) {
			if (temp_index == 13) {
				if (temp.length() > 0) {
					str.deleteCharAt(temp.length() - 1);
					DisplayNepali.getTextArea().setText(str.toString());
				}

			} else if (temp_index == 59) {
				DisplayNepali.getTextArea().setCaretPosition(DisplayNepali.getTextArea().getCaretPosition() - 1);

			} else if (temp_index == 60) {
			} else if (temp_index == 62) {
				DisplayNepali.getTextArea().setCaretPosition(DisplayNepali.getTextArea().getCaretPosition() + 1);
			}
		} else {
			DisplayNepali.getTextArea().insert(mapper.getUnicode(key), DisplayNepali.getTextArea().getCaretPosition());
		}

		DisplayNepali.getTextArea().requestFocus();
	}

}
