package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	Properties pro;

	public ConfigReader() {

		try {
			File src = new File("Config.property");

			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();

			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is =" + e.getMessage());

		}

	}

	public String getUrl() {
		String path = pro.getProperty("link");
		return path;
	}

	public String getUrl2() {
		String path = pro.getProperty("LinkforSearch");
		return path;
	}
	public String getUsername() {
		String path = pro.getProperty("username");
		return path;
	}

	public String getPassword() {
		String path = pro.getProperty("password");
		return path;
	}
	
	public String getSearchText() {
		String path = pro.getProperty("searchfor");
		return path;
	}
	
}