package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
private Properties prop;	
	
public Properties readproperties(String filename ) {
	
	prop=new Properties();
	try {
		FileInputStream file= new FileInputStream(filename);
		prop.load(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	  return prop;
	}

}
