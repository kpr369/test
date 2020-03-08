package javaclasses;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcel {
	
static int rowNum;
static int columnNum;
static Workbook wb;
static Sheet sheet;

public static void main(String[] args) throws IOException {
		
		 wb = new XSSFWorkbook("Z:\\Data.xlsx"); // WorkBook
		 sheet = wb.getSheetAt(1);	
		 getData("POLK","Department");

}

static void getData(String testcaseName, String coulmnName)
{
	for(int i =0;i<sheet.getLastRowNum()+1;i++)
	{
		if(sheet.getRow(i).getCell(0).getStringCellValue().equals(testcaseName))
		{
			rowNum = i;
		}
		
	}
	
	for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
	{
		if(sheet.getRow(0).getCell(j).getStringCellValue().equals(coulmnName))
		{
			columnNum = j;
		}
	}
	
	System.out.println(sheet.getRow(rowNum).getCell(columnNum).getStringCellValue());
}




}
