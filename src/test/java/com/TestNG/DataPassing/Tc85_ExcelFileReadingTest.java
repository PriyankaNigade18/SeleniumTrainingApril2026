package com.TestNG.DataPassing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

import org.testng.annotations.Test;

public class Tc85_ExcelFileReadingTest {
  @Test
  public void testForFileRead() throws IOException 
  {
	  
	  //set the file path:File
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  
	  //read file in a stream: FileInputStream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Wb--->sheet--->row--->cell--->value
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  String password=wb.getSheet("userData").getRow(2).getCell(1).getStringCellValue();
	  System.out.println(password);
	  
	  
	  /*
	  XSSFSheet sheet1=wb.getSheet("userData");
	  
	  XSSFRow row3=sheet1.getRow(2);
	  
	  XSSFCell cell=row3.getCell(0);
	  
	  String username=cell.getStringCellValue();
	  
	  System.out.println(username);
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
