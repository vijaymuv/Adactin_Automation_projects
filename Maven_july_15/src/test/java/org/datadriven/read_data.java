package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_data {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\vijay\\write_data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		w.createSheet("data").createRow(0).createCell(0).setCellValue("Name");
		w.getSheet("data").getRow(0).createCell(1).setCellValue("Age");
		w.getSheet("data").createRow(1).createCell(0).setCellValue("Java");
		w.getSheet("data").getRow(1).createCell(1).setCellValue("25");
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();
		
	}

}
