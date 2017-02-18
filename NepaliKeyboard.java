import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class NepaliKeyboard extends JPanel {
	private static JButton normalButton[];
	private int NBUTTON_LENGTH = 50;
	private int NBUTTON_BREADTH = 50;
	private int TOTAL_BUTTON = 63;
	private int UPPER_PADDING = 15; // for vertical position of whole keyboard
									// .eg in y-axis
	private int RIGHT_PADDING = 200; // for horizontal position of whole
										// keyboard .eg in x-axis
	private int ROW_MULTIPLY = 60;
	private int COLUMN_MULTIPLY = 60;
	private int KEYBOARD_LENGTH = 1320;
	private int KEYBOARD_BREADTH = 320;
	private static BufferedImage img_unclick[] = new BufferedImage[65];
	private static BufferedImage img_click[] = new BufferedImage[65];
	private Color c;
	private String temp_unclick, temp_click;

	NepaliKeyboard() {
		setLayout(null);
		setBounds(20, 370, KEYBOARD_LENGTH, KEYBOARD_BREADTH);
		c = new Color(119, 136, 153);
		setBackground(c);
		normalButton = new JButton[TOTAL_BUTTON];
		for (int i = 0; i < 63; i++) {
			temp_unclick = "./button/unclick/" + String.valueOf(i) + ".png";
			temp_click = "./button/click/" + String.valueOf(i) + ".png";
			try {
				img_unclick[i] = ImageIO.read(getClass().getResource(temp_unclick));
				img_click[i] = ImageIO.read(getClass().getResource(temp_click));

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		setBorder(new BevelBorder(BevelBorder.RAISED, Color.black, Color.white, Color.black, Color.white));
		initButton();
		initButtonListener();
		setVisible(true);
	}

	public void initButton() {
		int butNum = 0;
		int temp = 0;
		int imageIndex = 0;
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 14; column++) {
				temp++;
				if (temp == 42 || temp == 44 || temp == 56 || temp == 67 || temp == 68 || temp == 69 || temp == 70) {
					continue;
				}
				normalButton[butNum] = new JButton();
				switch (temp) {
				case 14:
					normalButton[butNum].setBounds(RIGHT_PADDING + COLUMN_MULTIPLY * column,
							UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH + 72, NBUTTON_BREADTH); // backspace
					break;
				case 28:
					normalButton[butNum].setBounds(RIGHT_PADDING + 40 + COLUMN_MULTIPLY * column,
							UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH + 30, NBUTTON_BREADTH); // \
					break;
				case 15:
					normalButton[butNum].setBounds(RIGHT_PADDING + COLUMN_MULTIPLY * column,
							UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH + 40, NBUTTON_BREADTH); // tab
					break;
				case 29:
					normalButton[butNum].setBounds(RIGHT_PADDING + COLUMN_MULTIPLY * column,
							UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH + 60, NBUTTON_BREADTH); // caps
																										// lock
					break;
				case 41:
					normalButton[butNum].setBounds(RIGHT_PADDING + 60 + COLUMN_MULTIPLY * column,
							UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH + 70, NBUTTON_BREADTH); // enter
					break;
				case 43:
					normalButton[butNum].setBounds(RIGHT_PADDING + COLUMN_MULTIPLY * column,
							UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH + 100, NBUTTON_BREADTH); // left
																										// shift
					break;
				case 55:
					normalButton[butNum].setBounds(RIGHT_PADDING + 40 + COLUMN_MULTIPLY * column,
							UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH + 90, NBUTTON_BREADTH); // right
																										// shift
					break;
				case 57:
					normalButton[butNum].setBounds(RIGHT_PADDING + COLUMN_MULTIPLY * column,
							UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH + 60, NBUTTON_BREADTH); // left
																										// ctrl
					break;
				case 60:
					normalButton[butNum].setBounds(RIGHT_PADDING + 60 + COLUMN_MULTIPLY * column,
							UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH + 340, NBUTTON_BREADTH); // space
					break;
				case 63:
					normalButton[butNum].setBounds(RIGHT_PADDING + 420 + COLUMN_MULTIPLY * column,
							UPPER_PADDING + 10 + ROW_MULTIPLY * row, NBUTTON_LENGTH - 25, NBUTTON_BREADTH - 25);
					break;
				case 64:
					normalButton[butNum].setBounds(RIGHT_PADDING + 400 + COLUMN_MULTIPLY * column,
							UPPER_PADDING + -5 + ROW_MULTIPLY * row, NBUTTON_LENGTH - 25, NBUTTON_BREADTH - 25);
					break;
				case 65:
					normalButton[butNum].setBounds(RIGHT_PADDING + 340 + COLUMN_MULTIPLY * column,
							UPPER_PADDING + 35 + ROW_MULTIPLY * row, NBUTTON_LENGTH - 25, NBUTTON_BREADTH - 25);
					break;
				case 66:
					normalButton[butNum].setBounds(RIGHT_PADDING + 320 + COLUMN_MULTIPLY * column,
							UPPER_PADDING + 10 + ROW_MULTIPLY * row, NBUTTON_LENGTH - 25, NBUTTON_BREADTH - 25);
					break;
				default:
					if (temp > 15 && temp < 28) { // from Q to enter button
						normalButton[butNum].setBounds(RIGHT_PADDING + 40 + COLUMN_MULTIPLY * column,
								UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH, NBUTTON_BREADTH);
					} else if (temp > 28 && temp < 41) { // from Q to enter
															// button
						normalButton[butNum].setBounds(RIGHT_PADDING + 60 + COLUMN_MULTIPLY * column,
								UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH, NBUTTON_BREADTH);
					} else if (temp > 43 && temp < 55) { // from left shift to
															// right shift
						normalButton[butNum].setBounds(RIGHT_PADDING + 40 + COLUMN_MULTIPLY * column,
								UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH, NBUTTON_BREADTH);
					} else if (temp > 57 && temp < 60) { // for left fn and Alt
						normalButton[butNum].setBounds(RIGHT_PADDING + 60 + COLUMN_MULTIPLY * column,
								UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH, NBUTTON_BREADTH);
					} else if (temp > 60 && temp < 63) { // for right Alt and
															// ctrl
						normalButton[butNum].setBounds(RIGHT_PADDING + 400 + COLUMN_MULTIPLY * column,
								UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH, NBUTTON_BREADTH);
					} else {
						normalButton[butNum].setBounds(RIGHT_PADDING + COLUMN_MULTIPLY * column,
								UPPER_PADDING + ROW_MULTIPLY * row, NBUTTON_LENGTH, NBUTTON_BREADTH);
					}
					break;
				}
				normalButton[butNum].setIcon(new ImageIcon(img_unclick[imageIndex]));
				normalButton[butNum]
						.setBorder(new BevelBorder(BevelBorder.RAISED, Color.black, Color.RED, Color.red, Color.black));
				normalButton[butNum].setActionCommand(String.valueOf(butNum));
				add(normalButton[butNum]);
				imageIndex++;
				butNum++;
			}

		}

	}

	public void initButtonListener() {
		for (JButton b : normalButton) {
			b.addActionListener((ActionListener) new KeyBoardButtonListener());
		}
	}

	public static JButton[] getButtonList() {
		return normalButton;
	}

	public static BufferedImage[] getUnclickImage() {
		return img_unclick;
	}

	public static BufferedImage[] getclickImage() {
		return img_click;
	}

}