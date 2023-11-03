package org.example.testExcel;


import org.example.Recursos.Data.Excel.Dat_Excel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.table.DefaultTableModel;

public class EjecucionExcelTest {
    Dat_Excel dat_excel;
    private DefaultTableModel dataTable;

    @BeforeClass
    public void beforeClass() {

    }

    @BeforeMethod
    public void setUp() {

    }

    public  void InstanciasBasicas(){
        dat_excel = new Dat_Excel();
    }

    @Test
    public void testName() {
        InstanciasBasicas();
        dat_excel.ExcelAbrirConexion(false);
       // dat_excel.ExcelCerrarConexion();
    }
}
