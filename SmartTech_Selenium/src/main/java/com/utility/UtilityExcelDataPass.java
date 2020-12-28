package com.utility;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityExcelDataPass {
	
	
	public static ArrayList<String>readExcelData(int colum) throws Throwable{
		FileInputStream file = new FileInputStream("C:\\Users\\marup\\git\\repository\\SmartTech_Selenium\\ExcelTestData\\Excel pass data.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		Iterator<Row>it = sheet.iterator();
		it.next();
		ArrayList<String>list = new ArrayList<String>();
		while(it.hasNext()) {
			list.add(it.next().getCell(colum).getStringCellValue());
		}
		System.out.println("List of data : "+list);
		
		return list;
		
	}

}
