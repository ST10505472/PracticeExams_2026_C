/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.practice_exams_2026;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author reaganrichards
 */
public class TicketSalesTest {
    
    // Sample dataset matching the exam paper
    private final int[][] sampleSales = {
        {420, 310, 180, 390},
        {450, 280, 220, 390}
    };
 
    @Test
    public void CalculateTotalTicketSales_ReturnsTotalTicketSales() {
        TicketSales instance = new TicketSales();
        int expected = 2640;
        int actual = instance.TotalTicketSales(sampleSales);
        assertEquals(expected, actual);
    }
 
    @Test
    public void AverageTicketSales_ReturnsAverageTicketSales() {
        TicketSales instance = new TicketSales();
        double expected = 330.0;
        double actual = instance.AverageTicketSales(sampleSales);
        assertEquals(expected, actual, 0.001);
    }
    
    public TicketSalesTest() {
    }

    @Test
    public void testTotalTicketSales() {
    }

    @Test
    public void testAverageTicketSales() {
    }

    @Test
    public void testHighestSale() {
    }

    @Test
    public void testLowestSale() {
    }
    
}
