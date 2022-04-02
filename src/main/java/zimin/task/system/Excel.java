package zimin.task.system;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import zimin.task.data.Item;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Excel {
    private Workbook book;

    public Excel () {
        this.book = new HSSFWorkbook();
    }

    public void writeValues (String path, List<? extends Item> items) {
        Sheet sheet = book.createSheet("sample");
        int j = 0;
        for (Item item :
                items) {

            Row row = sheet.createRow(j);
            Cell name = row.createCell(0);
            name.setCellValue(item.getName());
            Cell price = row.createCell(1);
            price.setCellValue(item.getPrice());
            sheet.autoSizeColumn(1);
            j++;
        }
        try {
            book.write(new FileOutputStream(path));
            book.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
