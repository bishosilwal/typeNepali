import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	static int WINDOWS_LENGTH;
	static int WINDOWS_BREADTH;
	static DisplayNepali display;
	static JPanel panel;
	private static JMenu fileMenu;
	private static JMenu helpMenu;
	private static JMenuBar menu;
	private static JMenuItem open;
	private static JMenuItem save;
	private static JMenuItem about;
	private static JMenuItem help;
	private static JMenuItem exit;
	static Dimension screenSize;
	static Container container = null;
	static MainFrame mainFrame;
	Button button;

	MainFrame() {
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		WINDOWS_LENGTH = (int) screenSize.getWidth();
		WINDOWS_BREADTH = (int) screenSize.getHeight();
		setTitle("Nepali Keyboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(25, 25);
		setSize(screenSize);
		setLayout(null);
		container = this.getContentPane();
		display = new DisplayNepali();
		menu = new JMenuBar();
		panel = new JPanel(); // outer panel with little darke color
		fileMenu = new JMenu("File");
		helpMenu = new JMenu("Help");
		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		exit = new JMenuItem("Exit");
		about = new JMenuItem("About");
		help = new JMenuItem("Help");
		button = new Button();
		fileMenu.add(open);
		fileMenu.add(save);
		fileMenu.add(exit);
		helpMenu.add(help);
		helpMenu.add(about);
		button.roman_panel.setVisible(false);
		panel.setBounds(0, 0, WINDOWS_LENGTH, WINDOWS_BREADTH);
		panel.setBackground(new Color(200, 200, 200));
		menu.add(fileMenu);
		menu.add(helpMenu);
		setJMenuBar(menu);
		container.add(button.choose_keyboard);
		container.add(display);
		container.add(button.roman_panel);
		container.add(button.keyboard);
		container.add(panel);
	}

	public void start() {
		mainFrame = new MainFrame();
		mainFrame.setVisible(true);

	}

	public static MainFrame getMainFrame() {
		return mainFrame;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame m = new MainFrame();
		m.start();
	}

}
