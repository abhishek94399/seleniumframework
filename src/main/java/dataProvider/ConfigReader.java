package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader  {
	
		
	public String getvalue(String input) throws IOException
	{
		
		File file = new File(System.getProperty("user.dir")+"/Configuration/config.properties");
		
		FileInputStream fis = new FileInputStream(file);
		
		Properties pro = new Properties();
		
		pro.load(fis);
		
		String value = pro.getProperty(input);
		
		//System.out.println(value);
		return value;
		
		
	}

}
