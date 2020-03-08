package javaclasses;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting {

	static int rowNum;
	static int columnNum;
	static Workbook wb;
	static Sheet sheet;
	static FileOutputStream fos;
	

	public static void main(String[] args) throws IOException {
			
			 wb = new XSSFWorkbook(); // WorkBook
			 fos = new FileOutputStream("Z:\\\\Data1.xlsx");
			 
			Sheet sheet =  wb.createSheet("Test");
			 
			Row row = sheet.createRow(0);
			 
			 row.createCell(0).setCellValue("Hello");
			 row.createCell(1).setCellValue("Hello World");

			 wb.write(fos);
			 wb.close();
		
	}
}
