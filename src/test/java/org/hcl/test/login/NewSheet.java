package org.hcl.test.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewSheet {
public static void main(String[] args) throws IOException  {
	File file = new File("C:\\Users\\SOWMYA\\eclipse-workspace\\Samplee\\Excel\\Excel1.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook b=new XSSFWorkbook(stream);
	Sheet createSheet = b.createSheet("Priyu");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(2);
createCell.setCellValue("Python");
	FileOutputStream Stream2=new FileOutputStream(file);
	b.write(Stream2);
}
}
