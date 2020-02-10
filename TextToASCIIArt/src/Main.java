import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File("config.properties")));
		
		
		AABanner.debug = Integer.parseInt((String) prop.get("debug")) > 0 ?  true : false; 
		AABanner.myFontName = (String) prop.get("font"); 
		AABanner.myFontStyle = Integer.parseInt((String) prop.get("fontStyle")) ; 
		AABanner.percent = 100 - Integer.parseInt((String) prop.get("thinkness")) ; 
		AABanner.clarity = Integer.parseInt((String) prop.get("size")); 
		AABanner.myChar = (String) prop.get("character"); 
		
		Scanner s = new Scanner(System.in);
		String line = "";
		
		line = s.nextLine();

		while(line.length() > 0) {
			
			System.out.println();
			
			AABanner.print(line);
			line = s.nextLine();
			
			System.out.println();
		}
		
		
				
		
		
		//s.nextLine();
		s.close();
		
	} 
	
}
