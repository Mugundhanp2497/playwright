package filereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	private List<String> headers = new ArrayList();
	private File file;
	private Sheet currentsheet;
	
	public ExcelReader(File file) {
		this.file = file;
	}
	
	public ExcelReader(String filepath) {
		this.file = new File(filepath);
	}
	
	public String readExcel(String filePath, String sheetName, int rowNum, String headerName) throws EncryptedDocumentException, IOException {
		
		FileInputStream stream = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(stream);
		Sheet sheet = book.getSheet(sheetName);
		try {
			if(!currentsheet.getSheetName().equals(sheet.getSheetName()))
				getHeaders(sheet);
		}catch(NullPointerException e) {
			getHeaders(sheet);
		}
		
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(headers.indexOf(headerName));
		String getData = cell.getStringCellValue();
		stream.close();
		book.close();
		return getData;
	}
	
	public void getHeaders(Sheet sheet) {
		currentsheet = sheet;
		Row headerRow = sheet.getRow(0);
		if(!headers.isEmpty()) {
			for(int i = 0 ; i<headers.size() ; i++)
				headers.remove(i);
		}
		for(Cell cell: headerRow) {
			headers.add(cell.getStringCellValue());
		}
	}
	
	public List<Map<String, String>> getExcelDataMap(String sheetName){
		Workbook book = null;
		try {
			FileInputStream stream = new FileInputStream(file);
			book = WorkbookFactory.create(stream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<Map<String, String>> dataMap = new ArrayList<Map<String,String>>();
		
		Sheet sheet = book.getSheet(sheetName);
		for(int i = 1; i<=sheet.getLastRowNum(); i++) {
			Map<String , String> data = new HashMap<String, String>();
			for(int j = 0 ; j<sheet.getRow(0).getPhysicalNumberOfCells(); j++) {
				try {
					data.put(sheet.getRow(0).getCell(j).getStringCellValue(), sheet.getRow(i).getCell(j).getStringCellValue());
				}catch (NullPointerException e) {
					
				}
			}
			dataMap.add(data);
		}
		
		return dataMap;
		
	}
	
}