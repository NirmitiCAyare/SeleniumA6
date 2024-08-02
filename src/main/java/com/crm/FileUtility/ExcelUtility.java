package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public static String getDataFromExcel(String Sheetname,int Rownum,int Cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("src\\test\\resources\\VTigerCredentials.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet(Sheetname);
//		 String row = sheet.getRow(Rownum).getCell(Cellnum).toString();
//		String pass=sheet.getRow(Rownum).getCell(Cellnum).toString();
//		
//		System.out.println(row);
//		System.out.println(pass);
		Row rw=sheet.getRow(Rownum);
		
		Cell c1=rw.getCell(Cellnum);
		
		String value=c1.getStringCellValue();
		return value;
		
	}

}
