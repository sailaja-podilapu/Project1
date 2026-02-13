package page_S;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_excel1 {
	public static void main(String[]args)throws IOException{
		//String prjpath=System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream("/home/labuser/Desktop/Sailu.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(1).getCell(0).getNumericCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getRowIndex());
		sheet.createRow(5).createCell(2).setCellValue("FAIL");
		FileOutputStream fout = new FileOutputStream("/home/labuser/Desktop/Sailu.xlsx");
		wb.write(fout);
		wb.close();
				
	}

}


