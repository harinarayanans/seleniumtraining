package Seleniumclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\Hari\\workspace\\Seleniumsession\\src\\Seleniumclasses\\config.properties");
		prop.load(ip);
System.out.println(prop.getProperty("name"));	
	
	
	
	}
	

}
