package com.LumensSite.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;

	public WebDriver launchBrowser() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\LumensSite\\Base\\constants.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.gecko.driver", "src\\\\main\\\\resources\\\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static String getData(int row, int cell) throws Throwable {

		File filepath = new File(System.getProperty("user.dir") + "\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(filepath);
		wb = new XSSFWorkbook(stream);
		sheet = wb.getSheetAt(0);
		String data = sheet.getRow(row).getCell(cell).getStringCellValue();
		return data;

	}

	
}
