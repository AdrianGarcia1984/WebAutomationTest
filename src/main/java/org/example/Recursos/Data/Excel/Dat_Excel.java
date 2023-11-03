package org.example.Recursos.Data.Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.table.DefaultTableModel;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

public class Dat_Excel {
    private DefaultTableModel dataTable; //crea tabla en java
    FileInputStream excelFile; // abre instancia a los metodos de
    Workbook workBook;
    Sheet sheet; //llamado a la hoja
    FileOutputStream fos; // escritura en columnas

    String sheetName = "Hoja1"; //nombre de la hoja a actualizar
    public String excelFilePath ="C:\\Users\\Cervi\\IdeaProjects\\WebAutomation\\src\\main\\Recursos\\Insumos\\Open_Alerts_Report2.xls";//Ruta del archivo excel
    int numeroFila = 0; //numero fila a actualizar

    //conexion excel
    //region
    public void ExcelAbrirConexion(Boolean actualizar){
        try {
            excelFile = new FileInputStream(excelFilePath);
            workBook = new XSSFWorkbook(excelFile);
            // Sheet sheet = workBook.getSheetAt(0);
            sheet = workBook.getSheet(excelFilePath);
            if (actualizar){
                fos = new FileOutputStream(excelFilePath);
            }
        }catch (Exception fallo){
            System.out.println(fallo.getMessage());
        }
    }

    public void ExcelCerrarConexion(){
        try {
            workBook.close();
            excelFile.close();
        }catch (Exception fallo){
            System.out.println(fallo.getMessage());
        }
    }

    //endregion

    //obtener informacion excel
    //region
    public DefaultTableModel excelTabla(){
        dataTable = new DefaultTableModel();//creamos la instancia del datatable
        Iterator<Row> rowIterator = sheet.iterator();
        Row headerRow = rowIterator.next();
        Iterator<Cell> headerCellIterator = headerRow.cellIterator();
        while (headerCellIterator.hasNext()){
            Cell cell = headerCellIterator.next();
            dataTable.addColumn(cell.getStringCellValue());
        }
        System.out.println(dataTable);
        return dataTable;
    }
    //endregion

}
