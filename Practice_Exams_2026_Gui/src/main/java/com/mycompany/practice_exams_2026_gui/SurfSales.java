/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_exams_2026_gui;

/**
 *
 * @author reaganrichards
 */
public class SurfSales implements ISurfSales{
    
    private static final int SALES_TARGET = 400;
    
    private int [][] ProductSales = {
    
        {520, 380, 150},
        {610, 340, 210},
        {450, 290, 200},
    };

    @Override
    public int[][] GetProductSales() {

        return ProductSales;
    }

    @Override
    public int GetTotalSales() {
        
        int TotalSales = 0;
        
        for (int row = 0; row < ProductSales.length; row++)
        {
            for (int col = 0; col < ProductSales[row].length; col++)
            {
             TotalSales += ProductSales[row][col];
            }
        } 
        return TotalSales;
    }

    @Override
    public int GetSalesOverTarget() {
        
        int Count = 0;
        
        for (int row = 0; row < ProductSales.length; row++)
        {
            for (int col = 0; col < ProductSales[row].length; col++)
            {
                if (ProductSales[row][col] > SALES_TARGET) 
                {
                     Count++;
                }
            }
        }
        return Count;
    }

    @Override
    public int GetSalesUnderTarget() {

            int Count = 0;
            
            for (int row = 0; row < ProductSales.length; row++)
            {
                for (int col = 0; col < ProductSales[row].length; col++ )
                {
                    if (ProductSales[row][col] < SALES_TARGET)
                    {
                        Count++;
                    }
                }
            }
        return Count;
    }

    @Override
    public int GetYearsProcessed() {

            return ProductSales.length;
    }

    @Override
    public double GetAverageSales() {
        
        int Count = 0;
                    
            for (int row = 0; row < ProductSales.length; row++)
            {
                for (int col = 0; col < ProductSales[row].length; col++ )
                {
                Count++;

               }
         }
            if (Count == 0)
            {
                return  0;
            }
            return (double) GetTotalSales()  / Count;
    }
}
