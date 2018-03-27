package DDF_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readxl {
	public static String[][] setExcelFile(String Path,String SheetName) throws IOException{
		File file=new File("C:\\Lavanya gangisetty\\Selenium\\DDF_data.xlsx");
		FileInputStream fs = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet5");
		//Sheet sh = wb.getSheet(SheetName);
		//int totalNoOfRows = sh.getRow();
		int rowCount = sh.getLastRowNum()+1;
		int colcount=sh.getRow(0).getLastCellNum();
		String[][]data=new String[rowCount][colcount];
		for(int i=0;i<rowCount;i++){
			Row row=sh.getRow(i);
			for(int j=0;j<colcount;j++){
				String value=row.getCell(j).getStringCellValue();
				data[i][j]=value;
				//System.err.println(data);
				
			}
			
		}return data;
		
	}

}
