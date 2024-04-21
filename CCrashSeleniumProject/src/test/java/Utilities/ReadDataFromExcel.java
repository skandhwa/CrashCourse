package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.constants;

public class ReadDataFromExcel {
	
	
	public static String getURL() throws IOException
	{
	
	FileInputStream fs=new FileInputStream(constants.ExcelPath);
	XSSFWorkbook workbook=new XSSFWorkbook(fs);
	XSSFSheet sheet=workbook.getSheetAt(0);
	XSSFCell value=sheet.getRow(1).getCell(0);
	 String URL=    value.toString();
	 return URL;
	
	
	
	
	
	}
	
	

}
