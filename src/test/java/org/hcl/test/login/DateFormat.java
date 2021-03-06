package org.hcl.test.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateFormat {
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\SOWMYA\\eclipse-workspace\\Samplee\\Excel\\Excel1.xlsx");
	FileInputStream stream=new FileInputStream(file);
	Workbook b=new XSSFWorkbook(stream);
	Sheet sheet = b.getSheet("Sheet2");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if(cellType==1) {
				String string = cell.getStringCellValue();
				System.out.println(string);
			}
			else if(DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat date=new SimpleDateFormat("dd-MM-yyyy");
				String f = date.format(d);
				System.out.println(f);
			}
			else {
				double n = cell.getNumericCellValue();
				long l=(long)n;
				System.out.println(l);
			}
		}
	}
}
}
