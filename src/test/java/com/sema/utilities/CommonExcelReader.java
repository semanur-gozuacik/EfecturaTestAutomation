package com.sema.utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CommonExcelReader {
    //excel den veri okumam gerektiği zaman
    public static void updateCellValue(String filePath, String colName, int rowIndex, String newValue) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // Başlık satırını al
        Row headerRow = sheet.getRow(0);

        // Sütun adını sütun indeksine çevir
        int colIndex = -1;
        for (Cell cell : headerRow) {
            if (cell.getStringCellValue().equalsIgnoreCase(colName)) {
                colIndex = cell.getColumnIndex();
                break;
            }
        }

        // Sütun bulunamazsa hata fırlat
        if (colIndex == -1) {
            workbook.close();
            fileInputStream.close();
            throw new IllegalArgumentException("Sütun adı bulunamadı: " + colName);
        }

        // İlgili satırı al
        Row row = sheet.getRow(rowIndex);

        if (row == null) {
            row = sheet.createRow(rowIndex);
        }

        // İlgili hücreyi al veya oluştur
        Cell cell = row.getCell(colIndex);
        if (cell == null) {
            cell = row.createCell(colIndex);
        }

        // Yeni değeri ayarla
        cell.setCellValue(newValue);

        // Değişiklikleri kaydet
        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream(new File(filePath));
        workbook.write(fileOutputStream);
        fileOutputStream.close();

        workbook.close();
    }

    public static String getCellValue(String filePath, String colName, int rowIndex) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        // Başlık satırını al
        Row headerRow = sheet.getRow(0);

        // Sütun adını sütun indeksine çevir
        int colIndex = -1;
        for (Cell cell : headerRow) {
            if (cell.getStringCellValue().equalsIgnoreCase(colName)) {
                colIndex = cell.getColumnIndex();
                break;
            }
        }

        // Sütun bulunamazsa hata fırlat
        if (colIndex == -1) {
            workbook.close();
            fileInputStream.close();
            throw new IllegalArgumentException("Sütun adı bulunamadı: " + colName);
        }

        // İlgili satırı al
        Row row = sheet.getRow(rowIndex);

        if (row == null) {
            workbook.close();
            fileInputStream.close();
            throw new IllegalArgumentException("Satır bulunamadı: " + rowIndex);
        }

        // İlgili hücreyi al
        Cell cell = row.getCell(colIndex);

        if (cell == null) {
            workbook.close();
            fileInputStream.close();
            throw new IllegalArgumentException("Hücre bulunamadı: " + colName + ", " + rowIndex);
        }

        // Hücre değerini oku ve doğru formatta dönüştür
        String cellValue;
        switch (cell.getCellType()) {
            case STRING:
                cellValue = cell.getStringCellValue();
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    cellValue = cell.getDateCellValue().toString();
                } else {
                    // Eğer hücredeki sayı çok büyükse, uzun (long) olarak almayı deneyin
                    double numericValue = cell.getNumericCellValue();
                    if (numericValue == (long) numericValue) {
                        cellValue = String.valueOf((long) numericValue);
                    } else {
                        cellValue = String.valueOf(numericValue);
                    }
                }
                break;
            case BOOLEAN:
                cellValue = String.valueOf(cell.getBooleanCellValue());
                break;
            case FORMULA:
                cellValue = cell.getCellFormula();
                break;
            default:
                cellValue = "";
        }

        fileInputStream.close();
        workbook.close();

        return cellValue;
    }
}





