package com.TestNG.DataPassing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData 
{
	@DataProvider(name="MyArrayData")
	public Object[][] testData()
	{
		Object[][] data= {{"Admin","admin123"},{"Snehal","snehal123"},{"Kiran","kiran123"}};
		return data;
	}
	
	@DataProvider(name="ExcelData")
	public Object[][] excelFile()
	{
		//set the file path:File
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		  
		  //read file in a stream: FileInputStream
		  FileInputStream fs;
		  Object data[][]=null;
		try {
			fs = new FileInputStream(f1);
			//Wb--->sheet--->row--->cell--->value
			  
			  XSSFWorkbook wb=new XSSFWorkbook(fs);
			  
			  //number of rows
			  int rows=wb.getSheet("userData").getPhysicalNumberOfRows();
			  System.out.println("Total number of rows: "+rows);//6
			  
			  //number of columns
			  int cells=wb.getSheet("userData").getRow(0).getPhysicalNumberOfCells();
			  System.out.println("Total columns are: "+cells);//2
			  
			  //create array of same size
			  data=new Object[rows-1][cells];//only 5 rows
			  
			  //read data from file and maitain it into array
			  
			  for(int i=1;i<rows;i++)//skip heading
			  {
				  for(int j=0;j<cells;j++)
				  {
					  //array start index with 0
					  data[i-1][j]=wb.getSheet("userData").getRow(i).getCell(j).getStringCellValue();
					  System.out.print(data[i-1][j]+"\t");
				  }
				  System.out.println();
			  }
			  
			  
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return data;
		  
	}

}
