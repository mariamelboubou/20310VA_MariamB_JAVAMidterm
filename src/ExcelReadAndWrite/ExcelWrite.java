package ExcelReadAndWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Sheet2");

        Object[][] bookData = {
                {"Head first Java", " Cathlien Sara", 6},
                {"Head Second Java", " Ab Mariam", 5},
                {"Head Third Java", " Aya Ola", 4},
                {" Head Forth Java", " Abdullah Ali", 3},

        };
        // row counting
        int rowCount = 0;

        for(Object[] aBook: bookData){

            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;

            for(Object field: aBook){
                Cell cell = row.createCell(++columnCount);
                // If= boolean condition true or false if true set value if not set another value.
                // second line setit as a string if true
                if(field instanceof String ) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer){ // two data types, for this instance we did integer.  we asked a boolean if it's string set value as integer if value set it as value
                    cell.setCellValue((Integer) field);
                }
            }

        }

        try(FileOutputStream outputStream = new FileOutputStream("DataTest/TestSheet.xlsx")){
            workbook.write(outputStream);
            System.out.println("\n Operation successful");

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("\n Operation is not successful");
        }

    }
}
