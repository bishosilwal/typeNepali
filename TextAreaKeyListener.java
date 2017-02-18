import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TextAreaKeyListener extends KeyAdapter {
	private KeyMap mapper;
	private int tempIndex;
	private String typedKey, temp;
	private boolean actionKey;
	private static String romanWord = "";
	private static boolean space;

	TextAreaKeyListener() {
		mapper = new KeyMap();
		actionKey = false;
		space = false;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (!Button.isROMANIZED()) {
			if (e.isShiftDown()) {
				if (KeyBoardButtonListener.isShiftKey()) {
					KeyBoardButtonListener.setShiftKey(false);
					KeyBoardButtonListener.setIcon(41, "unclick");
				} else {
					KeyBoardButtonListener.setIcon(41, "click");
					KeyBoardButtonListener.setShiftKey(true);
				}

			} else if (Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {

				return;

			} else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				typedKey = mapper.getUnicode("space");
				tempIndex = mapper.getImageIndex("space");
				KeyBoardButtonListener.setIcon(tempIndex, "click");
				DisplayNepali.setText(typedKey);
				if (KeyBoardButtonListener.getTemp_prev_index() != -1
						&& KeyBoardButtonListener.getTemp_prev_index() != tempIndex)
					KeyBoardButtonListener.setIcon(KeyBoardButtonListener.getTemp_prev_index(), "unclick");
				KeyBoardButtonListener.setTemp_prev_index(tempIndex);
				actionKey = true;

			} else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				tempIndex = mapper.getImageIndex("enter");
				KeyBoardButtonListener.setIcon(tempIndex, "click");
				if (KeyBoardButtonListener.getTemp_prev_index() != -1)
					KeyBoardButtonListener.setIcon(KeyBoardButtonListener.getTemp_prev_index(), "unclick");
				KeyBoardButtonListener.setTemp_prev_index(tempIndex);
				actionKey = true;

			}
		} else {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {

				actionKey = true;

			} else if (e.getKeyCode() == KeyEvent.VK_SPACE) {

				if (!space) {

					if (mapper.getUnicode(romanWord) != null) {
						typedKey = mapper.getUnicode(romanWord);
						DisplayNepali.setText(typedKey);
						space = true;
					}
					romanWord = "";

				} else {
					space = false;
				}
				actionKey = true;
				return;
			} else if (e.getKeyCode() == KeyEvent.VK_TAB) {
				actionKey = true;

			} else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
				romanWord = "";
				actionKey = true;

			}
			space = false;
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {

		if (actionKey) {
			actionKey = false;

			if (Button.isROMANIZED()) {
				if (space) {
					e.consume();
				}
			}
			return;
		}

		char ch = e.getKeyChar();
		if (Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK)) {
			ch = Character.toLowerCase(ch);
		}
		temp = Character.toString(ch);
		e.consume();

		if (!Button.isROMANIZED()) {
			if (temp.equals("#")) {
				tempIndex = mapper.getImageIndex("3");
				typedKey = mapper.getUpperCode("3");
			} else if (temp.equals("$")) {
				tempIndex = mapper.getImageIndex("4");
				typedKey = mapper.getUpperCode("4");

			} else if (temp.equals("%")) {

				tempIndex = mapper.getImageIndex("5");
				typedKey = mapper.getUpperCode("5");

			} else if (temp.equals("^")) {
				tempIndex = mapper.getImageIndex("6");
				typedKey = mapper.getUpperCode("6");

			} else if (temp.equals("&")) {
				tempIndex = mapper.getImageIndex("7");
				typedKey = mapper.getUpperCode("7");

			} else if (temp.equals(")")) {
				tempIndex = mapper.getImageIndex("0");
				typedKey = mapper.getUpperCode("0");

			} else if (temp.equals("_")) {
				tempIndex = mapper.getImageIndex("-");
				typedKey = mapper.getUpperCode("-");

			} else if (temp.equals("+")) {
				tempIndex = mapper.getImageIndex("=");
				typedKey = mapper.getUpperCode("=");

			} else if (temp.equals("<")) {
				tempIndex = mapper.getImageIndex(",");
				typedKey = mapper.getUpperCode("<");

			} else if (Character.isUpperCase(ch)) {

				tempIndex = mapper.getImageIndex(temp.toLowerCase());
				typedKey = mapper.getUpperCode(temp);

			} else {
				if (KeyBoardButtonListener.isShiftKey() || KeyBoardButtonListener.isCapsKey()) {

					typedKey = mapper.getUpperCode(temp.toUpperCase());

				} else {
					typedKey = mapper.getLowerCode(temp);

				}
				tempIndex = mapper.getImageIndex(temp.toLowerCase());

			}
			if (KeyBoardButtonListener.isShiftKey()) {

				KeyBoardButtonListener.setShiftKey(false);
				KeyBoardButtonListener.setIcon(mapper.getImageIndex("lshift"), "unclick");
				KeyBoardButtonListener.setIcon(mapper.getImageIndex("rshift"), "unclick");
			}
			if (KeyBoardButtonListener.getTemp_prev_index() != tempIndex) {

				KeyBoardButtonListener.setIcon(tempIndex, "click");
				if (KeyBoardButtonListener.getTemp_prev_index() != -1)
					KeyBoardButtonListener.setIcon(KeyBoardButtonListener.getTemp_prev_index(), "unclick");
				KeyBoardButtonListener.setTemp_prev_index(tempIndex);

			}

			DisplayNepali.setText(typedKey);

		} else {
			romanWord = romanWord + temp;

		}
	}

}
