package org.utilityfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class base_class {
	public static WebDriver driver;
	public static WebElement WebElement;
	public static String value;

	public static WebDriver Browser_launch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (name.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.egde.driver", System.getProperty("user.dir") + "\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		return driver;
	}

	public static void get_url(String url) {

		driver.get(url);
	}

	public static void send_keys(WebElement a, String b) {
		a.sendKeys(b);
	}

	public static void click_btn(WebElement ele) {
		ele.click();
	}

	public static void Select_dropdown(WebElement a, String A) {
		Select s = new Select(a);
		s.selectByVisibleText(A);
	}

	public static void select_dropdown(WebElement a, String b, String data) {
		Select s = new Select(a);
		if (b.equalsIgnoreCase("text")) {
			s.selectByVisibleText(data);
		} else if (b.equalsIgnoreCase("value")) {
			s.selectByValue(data);
		}else if (b.equalsIgnoreCase("index")) {
			int parse =Integer.parseInt(data);
			s.selectByIndex(parse);
		} 
	}

	public static String get_title(String title) {
		String title2 = driver.getTitle();
		return title2;
	}

	public static String current_url(String url) {
		String url1 = driver.getCurrentUrl();
		return url1;
	}

	public static void clears(WebElement element) {
		element.clear();
	}

	public static void actions(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).build().perform();
	} 
	
public static void frames(String text, String data) {
	if (text.equalsIgnoreCase("text")) {
		driver.switchTo().frame(data);
		
	}else if (text.equalsIgnoreCase("index")) {
		driver.switchTo().frame(data);
		
	}else if (text.equalsIgnoreCase("default")) {
		driver.switchTo().defaultContent();
	} 
	

	}
	public static void TakeScreenshot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\snaps\\snaps.png");
		FileUtils.copyFile(s, dest);
		
	} public static String particular_cell(String location, int sheet,int row,int cell ) throws IOException {
		
		File file= new File("C:\\Users\\005\\eclipse-workspace\\Maven_july_15\\Adactin_Hotel_app.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook work = new XSSFWorkbook(fis);
				Sheet s = work.getSheetAt(sheet);
				Row r = s.getRow(row);
				Cell c = r.getCell(cell);
				CellType cellType = c.getCellType();
				if (cellType.equals(CellType.STRING)) {
					value = c.getStringCellValue();
					System.out.println(value);
				} else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = c.getNumericCellValue();
					value = String.valueOf(numericCellValue);

					System.out.println(value);
					
				}
				work.close();
				return value;
	}
	
	




}
