package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import Constants.constants;



public class ReadDataFromProperty {
	
	
	static FileReader reader;
	
	public static Properties readDatafromProperty() throws IOException
	{
	
		FileReader reader=new FileReader(constants.PropertyFilePath);
		Properties prop=new Properties();
		prop.load(reader);
		return prop;
	
	
	
	
	}
	
	
	
	

}
