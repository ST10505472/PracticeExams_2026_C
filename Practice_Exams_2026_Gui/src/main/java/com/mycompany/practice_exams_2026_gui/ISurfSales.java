/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.practice_exams_2026_gui;

/**
 *
 * @author reaganrichards
 */
public interface ISurfSales {
        int[][] GetProductSales();
        int GetTotalSales();
        int GetSalesOverTarget();
        int GetSalesUnderTarget();
        int GetYearsProcessed();
        double GetAverageSales();
    
}
