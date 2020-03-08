package javaclasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReading {

	List al = new ArrayList<String>();
	
	
	public static void main(String[] args) throws IOException {
		
		Workbook wb = new XSSFWorkbook("Z:\\Data.xlsx"); // WorkBook
		Sheet sheet = wb.getSheetAt(0);
		/*
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
*/
		
		int numOfRows =sheet.getLastRowNum()+1;
		
		for(int i=0;i<numOfRows;i++)
		{
			Row row = sheet.getRow(i);
			
			int numofCells= row.getLastCellNum();
			
				for(int j=0;j<numofCells;j++)  //2<2
				{
					Cell cell = row.getCell(j);
					getData(cell);
				}
		}
		
	}
	
	public static void getData(Cell cell)
	{
		if(cell.getCellType()==CellType.NUMERIC)
		{
			System.out.println(cell.getNumericCellValue());
		}else if(cell.getCellType()==CellType.STRING)
		{
			System.out.println(cell.getStringCellValue());
		}else if(cell.getCellType()==CellType.BOOLEAN)
		{
			System.out.println(cell.getBooleanCellValue());
		}
	}
}
