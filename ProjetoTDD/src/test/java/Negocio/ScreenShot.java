package Negocio;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;


public class ScreenShot {

	public static void tirar(WebDriver navegador, String arquivo){
		File screenshot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(arquivo));		
			
		} catch(Exception e ){
			System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
			
		}
		
	}
}
