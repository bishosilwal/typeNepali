import java.util.HashMap;

public class KeyMap {
	private HashMap<String, String> map;
	private HashMap<String, String> upperCaseMap, lowerCaseMap;
	private HashMap<String, Integer> imageIndexmap;

	KeyMap() {
		map = new HashMap<String, String>();
		upperCaseMap = new HashMap<String, String>();
		lowerCaseMap = new HashMap<String, String>();
		imageIndexmap=new HashMap<String,Integer>();
		initMap();
		initUpperMap();
		initLowerMap();
		initImageIndexMap();
	}

	private void initImageIndexMap() {
		imageIndexmap.put("`", 0);
		imageIndexmap.put("1", 1);
		imageIndexmap.put("2", 2);
		imageIndexmap.put("3", 3);
		imageIndexmap.put("4", 4);
		imageIndexmap.put("5", 5);
		imageIndexmap.put("6", 6);
		imageIndexmap.put("7", 7);
		imageIndexmap.put("8", 8);
		imageIndexmap.put("9", 9);
		imageIndexmap.put("0", 10);
		imageIndexmap.put("-", 11);
		imageIndexmap.put("=", 12);
		imageIndexmap.put("back", 13);
		imageIndexmap.put("tab", 14);
		imageIndexmap.put("q", 15);
		imageIndexmap.put("w", 16);
		imageIndexmap.put("e", 17);
		imageIndexmap.put("r", 18);
		imageIndexmap.put("t", 19);
		imageIndexmap.put("y", 20);
		imageIndexmap.put("u", 21);
		imageIndexmap.put("i", 22);
		imageIndexmap.put("o", 23);
		imageIndexmap.put("p", 24);
		imageIndexmap.put("[", 25);
		imageIndexmap.put("]", 26);
		imageIndexmap.put("\\", 27);
		imageIndexmap.put("caps", 28);
		imageIndexmap.put("a", 29);
		imageIndexmap.put("s", 30);
		imageIndexmap.put("d", 31);
		imageIndexmap.put("f", 32);
		imageIndexmap.put("g", 33);
		imageIndexmap.put("h", 34);
		imageIndexmap.put("j", 35);
		imageIndexmap.put("k", 36);
		imageIndexmap.put("l", 37);
		imageIndexmap.put(";", 38);
		imageIndexmap.put("'", 39);
		imageIndexmap.put("enter", 40);
		imageIndexmap.put("lshift", 41);
		imageIndexmap.put("z", 42);
		imageIndexmap.put("x", 43);
		imageIndexmap.put("c", 44);
		imageIndexmap.put("v", 45);
		imageIndexmap.put("b", 46);
		imageIndexmap.put("n", 47);
		imageIndexmap.put("m", 48);
		imageIndexmap.put(",", 49);
		imageIndexmap.put(".", 50);
		imageIndexmap.put("/", 51);
		imageIndexmap.put("rshift", 52);
		imageIndexmap.put("ctrl", 53);
		imageIndexmap.put("fn", 54);
		imageIndexmap.put("alt", 55);
		imageIndexmap.put("space", 56);
		imageIndexmap.put("alt", 57);
		imageIndexmap.put("ctrl", 58);
		imageIndexmap.put("larrow", 59);
		imageIndexmap.put("uarrow", 60);
		imageIndexmap.put("darrow", 61);
		imageIndexmap.put("rarrow", 62);
		
	}

	private void initLowerMap() {

		lowerCaseMap.put("`",getUnicode("`"));
		lowerCaseMap.put("1",getUnicode("1"));
		lowerCaseMap.put("2",getUnicode("2"));
		lowerCaseMap.put("3",getUnicode("3"));
		lowerCaseMap.put("4",getUnicode("4"));
		lowerCaseMap.put("5",getUnicode("5"));
		lowerCaseMap.put("6",getUnicode("6"));
		lowerCaseMap.put("7",getUnicode("7"));
		lowerCaseMap.put("8",getUnicode("8"));
		lowerCaseMap.put("9",getUnicode("9"));
		lowerCaseMap.put("0",getUnicode("0"));
		lowerCaseMap.put("-",getUnicode("nkt"));
		lowerCaseMap.put("=",getUnicode("hlnt"));
		lowerCaseMap.put("back","");
		lowerCaseMap.put("tab","");
		lowerCaseMap.put("q",getUnicode("T"));
		lowerCaseMap.put("w",getUnicode("au"));
		lowerCaseMap.put("e",getUnicode("e"));
		lowerCaseMap.put("r",getUnicode("r"));
		lowerCaseMap.put("t",getUnicode("t"));
		lowerCaseMap.put("y",getUnicode("p"));
		lowerCaseMap.put("u",getUnicode("u"));
		lowerCaseMap.put("i",getUnicode("i"));
		lowerCaseMap.put("o",getUnicode("o"));
		lowerCaseMap.put("p",getUnicode("p"));
		lowerCaseMap.put("[",getUnicode("rri"));
		lowerCaseMap.put("]",getUnicode("]"));
		lowerCaseMap.put("\\",getUnicode("\\"));
		lowerCaseMap.put("caps","");		
		lowerCaseMap.put("a",getUnicode("a"));
		lowerCaseMap.put("s",getUnicode("s"));
		lowerCaseMap.put("d",getUnicode("d"));
		lowerCaseMap.put("f",getUnicode("U"));
		lowerCaseMap.put("g",getUnicode("g"));
		lowerCaseMap.put("h",getUnicode("h"));
		lowerCaseMap.put("j",getUnicode("j"));
		lowerCaseMap.put("k",getUnicode("k"));
		lowerCaseMap.put("l",getUnicode("l"));
		lowerCaseMap.put(";",getUnicode("I"));
		lowerCaseMap.put("'",getUnicode("gyn"));
		lowerCaseMap.put("enter","");
		lowerCaseMap.put("lshift","");
		
		lowerCaseMap.put("z",getUnicode("Sh"));
		lowerCaseMap.put("x",getUnicode("D"));
		lowerCaseMap.put("c",getUnicode("chh"));
		lowerCaseMap.put("v",getUnicode("v"));
		lowerCaseMap.put("b",getUnicode("b"));
		lowerCaseMap.put("n",getUnicode("n"));
		lowerCaseMap.put("m",getUnicode("m"));
		lowerCaseMap.put(",",getUnicode(","));
		lowerCaseMap.put(".",getUnicode("pb"));
		lowerCaseMap.put("/",getUnicode("ru"));
		lowerCaseMap.put("rshift","");
		
			
	}

	private void initUpperMap() {
		upperCaseMap.put("1",getUnicode("1"));
		upperCaseMap.put("2",getUnicode("2"));
		upperCaseMap.put("3",getUnicode("ksh"));
		upperCaseMap.put("4",getUnicode("s0"));
		upperCaseMap.put("5",getUnicode("om"));
		upperCaseMap.put("6",getUnicode("db"));
		upperCaseMap.put("7",getUnicode("ng"));
		upperCaseMap.put("8",getUnicode(""));
		upperCaseMap.put("9",getUnicode(""));
		upperCaseMap.put("0",getUnicode("ah"));
		upperCaseMap.put("-",getUnicode("am"));
		upperCaseMap.put("=",getUnicode("="));
		upperCaseMap.put("Q",getUnicode("Th"));
		upperCaseMap.put("W",getUnicode("Au"));
		upperCaseMap.put("E",getUnicode("ai"));
		upperCaseMap.put("R",getUnicode("rri"));
		upperCaseMap.put("T",getUnicode("th"));
		upperCaseMap.put("Y",getUnicode("yn"));
		upperCaseMap.put("U",getUnicode("oo"));
		upperCaseMap.put("I",getUnicode("ii"));
		upperCaseMap.put("O",getUnicode("O"));
		upperCaseMap.put("P",getUnicode("ph"));
		upperCaseMap.put("{",getUnicode("ri"));
		upperCaseMap.put("}",getUnicode(""));
		upperCaseMap.put("|",getUnicode(""));
		upperCaseMap.put("A",getUnicode("E"));
		upperCaseMap.put("S",getUnicode("sh"));
		upperCaseMap.put("D",getUnicode("dh"));
		upperCaseMap.put("F",getUnicode("Oo"));
		upperCaseMap.put("G",getUnicode("gh"));
		upperCaseMap.put("H",getUnicode("A"));
		upperCaseMap.put("J",getUnicode("jh"));
		upperCaseMap.put("K",getUnicode("kh"));
		upperCaseMap.put("L",getUnicode(""));
		upperCaseMap.put(":",getUnicode("Ii"));
		upperCaseMap.put("\"",getUnicode("'"));
		upperCaseMap.put("Z",getUnicode("Rri"));
		upperCaseMap.put("X",getUnicode("Dh"));
		upperCaseMap.put("C",getUnicode("ch"));
		upperCaseMap.put("V",getUnicode("chbn"));
		upperCaseMap.put("B",getUnicode("bh"));
		upperCaseMap.put("N",getUnicode("N"));
		upperCaseMap.put("M",getUnicode(""));
		upperCaseMap.put("<",getUnicode("?"));
		upperCaseMap.put(">",getUnicode(""));
		upperCaseMap.put("?",getUnicode("/"));
			
	}

	public void initMap() {
		map.put("0", "\u0966");
		map.put("1", "\u0967");
		map.put("2", "\u0968");
		map.put("3", "\u0969");
		map.put("4", "\u096A");
		map.put("5", "\u096B");
		map.put("6", "\u096C");
		map.put("7", "\u096D");
		map.put("8", "\u096E");
		map.put("9", "\u096F");

		map.put("k", "\u0915");
		map.put("kh", "\u0916");
		map.put("g", "\u0917");
		map.put("gh", "\u0918");
		map.put("ng", "\u0919");
		map.put("ch", "\u091A");
		map.put("chh", "\u091B");
		map.put("j", "\u091C");
		map.put("jh", "\u091D");
		map.put("yn", "\u091E");
		map.put("T", "\u091F");
		map.put("Th", "\u0920");
		map.put("D", "\u0921");
		map.put("Dh", "\u0922");
		map.put("N", "\u0923");
		map.put("t", "\u0924");
		map.put("th", "\u0925");
		map.put("d", "\u0926");
		map.put("dh", "\u0927");
		map.put("n", "\u0928");
		map.put("p", "\u092A");
		map.put("ph", "\u092B");
		map.put("b", "\u092C");
		map.put("bh", "\u092D");
		map.put("m", "\u092E");
		map.put("y", "\u092F");
		map.put("r", "\u0930");
		map.put("l", "\u0932");
		map.put("v", "\u0935");
		map.put("sh", "\u0936");
		map.put("Sh", "\u0937");
		map.put("s", "\u0938");
		map.put("h", "\u0939");
		map.put("ksh", "\u0915\u094D\u0937");
		map.put("tr", "\u0924\u094D\u0930");
		map.put("gyn", "\u091C\u094D\u091E");
		map.put("a", "\u093E");
		map.put("A", "\u0905");
		map.put("i", "\u093F");
		map.put("ii", "\u0940");
		map.put("u", "\u0941");
		map.put("oo", "\u0942");
		map.put("rri", "\u0943");
		map.put("e", "\u0947");
		map.put("ai", "\u0948");
		map.put("o", "\u094B");
		map.put("au", "\u094C");
		map.put("am", "\u0902");
		map.put("ah", "\u0903");
		map.put("I", "\u0907");
		map.put("Ii", "\u0908");
		map.put("U", "\u0909");
		map.put("Oo", "\u090A");
		map.put("Rri", "\u090B");
		map.put("E", "\u090F");
		map.put("Ai", "\u090F\u0947");
		map.put("O", "\u0913");
		map.put("Au", "\u0914");
		map.put("s0", "\u0970");
		map.put("om", "\u0950");
		map.put("pb", "\u0964");
		map.put("db", "\u0965");
		map.put("hlnt", "\u094D");
		map.put("nkt", "\u093C");
		map.put("tab", "    ");
		map.put("=", "=");
		map.put("ri", "\u0930\u094D");
		map.put("\\", "\\");
		map.put("]", "]");
		map.put("\n", "\n");
		map.put("chbn", "\u0901");
		map.put("?", "?");
		map.put("space", " ");
		map.put("ru", " ");
		map.put("~", "~");
		map.put(",", ",");
		map.put("AA", "\u0906");
		map.put("", "");
		map.put("'", "'");
		/*
		 * map.put("arrowleft","\u2190"); map.put("arrowright","\u2192");
		 * map.put("arrowup",); map.put("arrowdown","\u2193");
		 */

	}

	public String getUnicode(String key) {
		String value = null;
		if (map.containsKey(key)) {
			value = map.get(key);
		}
		return value;
	}
	public String getUpperCode(String key) {
		String value = null;
		if (upperCaseMap.containsKey(key)) {
			value = upperCaseMap.get(key);
		}
		return value;
	}
	public String getLowerCode(String key) {
		String value = null;
		if (lowerCaseMap.containsKey(key)) {
			value = lowerCaseMap.get(key);
		}
		return value;
	}
	public int getImageIndex(String key) {
		int value = 0 ;
		if (imageIndexmap.containsKey(key)) {
			value = imageIndexmap.get(key);
		}
		return value;
	}

}
