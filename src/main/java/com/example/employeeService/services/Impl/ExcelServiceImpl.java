package com.example.employeeService.services.Impl;

import com.example.employeeService.services.ExcelService;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@Component
public class ExcelServiceImpl implements ExcelService {
    @Override
    public byte[] generateEmployeesListExcel() {
        XSSFWorkbook workBook = new XSSFWorkbook();
        Sheet sheet = workBook.createSheet("sheet Java");

        Row headerRow = sheet.createRow(0);

        List<String> staticDate = List.of("№", "Name", "SurName", "Middle Name", "Birth Date", "Phone", "Position", "Department", "Salary", "Join Date");
        List<Integer> widthsHearderRow = List.of(1000,3000,3000,3000,2000,4000,4000,4000,3000,6000);

        for (int i = 0; i < staticDate.size(); i++){
            cellCreator(workBook,sheet,headerRow,staticDate.get(i), i , widthsHearderRow.get(i));
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try{
            workBook.write(out);
            out.close();
        }
        catch (IOException e){
            throw  new RuntimeException();
        }


        return out.toByteArray();
    }
    private  void cellCreator(XSSFWorkbook workbook, Sheet sheet, Row row, String value, int index, int width){
        sheet.setColumnWidth(index, width);

        Font font = workbook.createFont();
        font.setBold(true);

        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);
        cellStyle.setAlignment(HorizontalAlignment.CENTER);

        cellStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);


        Cell cell = row.createCell(index);
        cell.setCellValue(width);
        cell.setCellStyle(cellStyle);

    }
}
