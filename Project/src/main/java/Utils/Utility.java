package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
public static void  captureScreenshot(WebDriver driver ,String testID) throws IOException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String str = sdf .format(new Date());
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti = new File ("\"E:\\ScreenShots\\nick"+str+".jpg");
		
		FileHandler.copy(src, desti);
			
		
	}
 
      public static String readExcelData(String sheetName,int rowNo, int cellNo) throws EncryptedDocumentException, IOException{
   
    	  String path="C:\\Users\\USER\\Downloads\\TestDataEx.xlsx";//locate the file
   
          FileInputStream file=new FileInputStream(path);//open the file
   
          Workbook wb =WorkbookFactory.create(file);//open the workbook
  
          Sheet s1 =  wb.getSheet(sheetName);// call sheet by its name
  
   //Sheet s2=wb.getSheetAt(0); // call sheet by its index number
  
       Row row1=s1.getRow(rowNo);
  
      Cell cell1=row1.getCell(cellNo);
 
      CellType a= cell1.getCellType();
 
     String data="";
     double value;


 try
 {data=cell1.getStringCellValue();}
 catch(IllegalStateException excep)
 {value=cell1.getNumericCellValue();
  long lon =(long) value;

 data=Long.toString(lon);}//convert double to long to string

 return data;	
 }

   

}
