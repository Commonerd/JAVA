package mapex.day0125;

import java.util.Properties;

public class PropertiesEx1 {
	public static void main(String[] args) {

		Properties prop = System.getProperties();
		prop.list(System.out);
	}
}
