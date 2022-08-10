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

public class particular_row {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\005\\eclipse-workspace\\Maven_july_15\\sampleprg.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook work = new XSSFWorkbook(fis);
		Sheet s = work.getSheetAt(0);
			Row row = s.getRow(0);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue + " ");
				} 
				else if (cellType.equals(CellType.NUMERIC)) {
					double d = cell.getNumericCellValue();
					String s1 = String.valueOf(d);
					System.out.print(s1 + " ");
				}
			}
System.out.println();
		work.close();
	}
}
