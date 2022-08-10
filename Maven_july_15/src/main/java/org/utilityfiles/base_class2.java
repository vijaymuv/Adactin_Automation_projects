package org.utilityfiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class base_class2 {
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}

	public static void get_url(String url) {

		driver.get(url);
	}

	public static String get_title(String url) {
		String title = driver.getTitle();
		return title;
	}

	public static String get_page_source(String url) {
		String pageSource = driver.getPageSource();
		return pageSource;
	}

	public static String current_url(String url) {
		String url1 = driver.getCurrentUrl();
		return url1;
	}

	public static void close_page() {
		driver.close();
	}

	public static void quit_page() {
		driver.quit();
	}

	public static void navigate_to(String url) {
		driver.navigate().to(url);
	}

	public static void navigate_Back() {
		driver.navigate().back();
	}

	public static void navigate_Forward() {
		driver.navigate().forward();
	}

	public static void navigate_refresh() {
		driver.navigate().refresh();
	}

	public static void maximize_page() {
		driver.manage().window().maximize();
	}

	public static void full_screen() {
		driver.manage().window().fullscreen();
	}

	public static void get_size() {
		driver.manage().window().getSize();
	}

	public static void delete_all_cookies() {
		driver.manage().deleteAllCookies();
	}

	public static void set_size(int width, int height) {
		Dimension d = new Dimension(width, height);
		driver.manage().window().setSize(d);
	}

	public static void clears(WebElement element) {
		element.clear();
	}

	public static void send_keys(WebElement a, String b) {
		a.sendKeys(b);
	}

	public static void click_btn(WebElement ele) {
		ele.click();
	}

	public static String get_Attribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}

	public static String get_tagname(WebElement e) {
		String tagName = e.getTagName();
		return tagName;
	}

	public static Point get_location(WebElement e) {
		Point location = e.getLocation();
		return location;
	}

	public static String get_cssvalue(WebElement e, String a) {
		String tagName = e.getCssValue(a);
		return tagName;
	}

	public static Rectangle get_rectange(WebElement e) {
		Rectangle rect = e.getRect();
		return rect;
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
		} else if (b.equalsIgnoreCase("index")) {
			int parse = Integer.parseInt(data);
			s.selectByIndex(parse);
		}
	}

	public static void deselect_dropdown(WebElement a, String b, String data) {
		Select s = new Select(a);
		if (b.equalsIgnoreCase("text")) {
			s.deselectByVisibleText(data);
		} else if (b.equalsIgnoreCase("value")) {
			s.deselectByValue(data);
		} else if (b.equalsIgnoreCase("index")) {
			int parse = Integer.parseInt(data);
			s.deselectByIndex(parse);
		}
	}

	public static void deselect_all(WebElement a) {
		Select s = new Select(a);
		s.deselectAll();

	}

	public static void get_all_options(WebElement a) {
		Select s = new Select(a);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allSelected : allSelectedOptions) {
			System.out.println(allSelected.getText());
		}

	}

	public static void get_options(WebElement a) {
		Select s = new Select(a);
		List<WebElement> allOptions = s.getOptions();
		for (WebElement all : allOptions) {
			System.out.println(all.getText());
		}

	}

	public static void get_firstSelected_Options(WebElement a) {
		Select s = new Select(a);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

	public static void actions(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).build().perform();
	}

	public static void frames(String text, int  a) {
		driver.switchTo().frame(a);

	}
	public static void default_frames() {
driver.switchTo().defaultContent();
		
	}
	
	public static  WebDriver Actions_class(WebElement e) {

		Actions a = new Actions(driver);
		a.contextClick(e).perform();
		return driver;
	}
	
public static void right_click() throws AWTException {
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	}
	
	

	public static void TakeScreenshot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\005\\eclipse-workspace\\Seleniumjava\\snaps\\snaps.png");
		FileUtils.copyFile(s, dest);

	}

	public static String particular_cell(String location, int sheet, int row, int cell) throws IOException {

		File file = new File("C:\\Users\\005\\eclipse-workspace\\Maven_july_15\\Adactin_Hotel_app.xlsx");
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
