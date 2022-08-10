package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class particular_column {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\005\\eclipse-workspace\\Maven_july_15\\sampleprg.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook work = new XSSFWorkbook(fis);
				Sheet s = work.getSheetAt(0);
				int physicalNumberOfRows = s.getPhysicalNumberOfRows();
				for (int i = 0; i < physicalNumberOfRows; i++) {
					Row row = s.getRow(i);
						Cell cell = row.getCell(0);
						CellType cellType = cell.getCellType();
						if (cellType.equals(CellType.STRING)) {
							String stringCellValue = cell.getStringCellValue();
							System.out.print(stringCellValue+" ");
						} else if (cellType.equals(CellType.NUMERIC)) {
							double d = cell.getNumericCellValue();
String s1 = String.valueOf(d);
System.out.print(s1+ " ");
						}	
				}
				System.out.println();
				work.close();
	}
}
