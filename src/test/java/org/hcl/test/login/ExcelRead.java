package org.hcl.test.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead {
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\SOWMYA\\eclipse-workspace\\Samplee\\Excel\\Excel1.xlsx");
	FileInputStream stream=new FileInputStream(file);
	Workbook b =new XSSFWorkbook(stream);
    Sheet sheet = b.getSheet("Sheet1");
    Row row = sheet.getRow(2);
    Cell cell = row.getCell(0);
    String s = cell.getStringCellValue();
    System.out.println(s);
    
}
}
