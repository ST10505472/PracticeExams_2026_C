/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.practice_exams_2026_gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author reaganrichards
 */
public class SurfSalesTest {
        private int [][] sales = {
        
        {520, 380, 150},
        {610, 340, 210},
        {450, 290, 200},
    
    };
 
    @Test
    public void GetSalesOverTarget_ReturnsNumberOfSales() {
        SurfSales instance = new SurfSales();
        int expected = 3;
        int actual = instance.GetSalesOverTarget();
        assertEquals(expected, actual);
    }
 
    @Test
    public void GetSalesUnderTarget_ReturnsNumberOfSales() {
        SurfSales instance = new SurfSales();
        double expected = 6;
        double actual = instance.GetSalesUnderTarget();
        assertEquals(expected, actual);
    }
    
    public SurfSalesTest() {
    }

    @Test
    public void testGetProductSales() {
    }

    @Test
    public void testGetTotalSales() {
    }

    @Test
    public void testGetSalesOverTarget() {
    }

    @Test
    public void testGetSalesUnderTarget() {
    }

    @Test
    public void testGetYearsProcessed() {
    }

    @Test
    public void testGetAverageSales() {
    }
    
}
