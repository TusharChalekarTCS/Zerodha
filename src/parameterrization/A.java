package parameterrization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
	public static void main(String[] args) throws  Throwable  {
		FileInputStream file= new FileInputStream ("C:\\Users\\Tushar.7350\\Desktop\\Tset Case sample sheet (1).xlsx");
		double data = WorkbookFactory.create(file).getSheet("AAA").getRow(0).getCell(0).getNumericCellValue();
		
		System.out.println(data);
	}

}
