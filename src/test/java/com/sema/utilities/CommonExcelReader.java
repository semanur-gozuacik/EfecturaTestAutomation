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

    // Yeni method: Değer alma
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

        // Hücre değerini oku
        String cellValue = cell.toString();

        fileInputStream.close();
        workbook.close();

        return cellValue;
    }
}





