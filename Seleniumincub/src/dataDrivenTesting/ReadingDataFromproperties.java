package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromproperties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./testdata/datas.properties");
		Properties ppt=new Properties();
		ppt.load(fis);
		String value = ppt.getProperty("un");
		System.out.println(value);

	}

}
