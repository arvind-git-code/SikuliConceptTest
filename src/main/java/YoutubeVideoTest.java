import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YoutubeVideoTest {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
	
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=23");
		String UserPath ="C:\\Users\\Alpha_320\\eclipse-workspace\\SikuliConceptTest\\";
		Screen s = new Screen();
		
		
		Pattern playPattrn= new Pattern(UserPath+"src\\resource\\play.png");
		s.wait(playPattrn,6000);
		s.click();
		s.click();
		
		Pattern playPattrn1= new Pattern(UserPath+"src\\resource\\pause.png");
		s.wait(playPattrn1,5000);
		s.click();

		Pattern playPattrn2= new Pattern(UserPath+"src\\resource\\speaker.png");
		s.wait(playPattrn2,5000);
		s.click();
		
		Pattern playPattrn3= new Pattern(UserPath+"src\\resource\\setting.png");
		s.wait(playPattrn3,5000);
		s.click();
		
		Pattern playPattrn4= new Pattern(UserPath+"src\\resource\\auto.png");
		s.wait(playPattrn4,5000);
		s.click();
		s.click(); 
		
		Pattern playPattrn5= new Pattern(UserPath+"src\\resource\\Hd.png");
		s.wait(playPattrn5,5000);
		s.click();
		s.click();
		
		
		
		Thread.sleep(10000);
	}

}
// if you facing error image path not found put whole path or make a string varibale and initilise the path
