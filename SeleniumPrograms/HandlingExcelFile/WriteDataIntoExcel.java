package HandlingExcelFile;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("F:\\testFile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Hello");
		Row row1 = sheet.createRow(0);
		
		Cell cell1 = row1.createCell(0);
	    cell1.setCellValue("Saisharan");
	   
	    Cell cell2 = row1.createCell(1);
	    cell2.setCellValue("Rangasube");
	    
	    Cell cell3 = row1.createCell(2);
	    cell3.setCellValue(03);
	    
	    Row row2= sheet.createRow(1);
	    
	    Cell cell01 = row2.createCell(0);
	    cell01.setCellValue("Ghost");
	    
	    Cell cell02 = row2.createCell(1);
	    cell02.setCellValue("Summer");
	    
	    Cell cell03 = row2.createCell(2);
	    cell03.setCellValue(4);
	   
	    wb.write(file);
	    
		System.out.println("Data written to testFile");
	}
}
