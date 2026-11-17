/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practice_exams_2026;

/**
 *
 * @author reaganrichards
 */
public class Practice_Exams_2026 {

    public static void main(String[] args) {
         TicketSales ts = new TicketSales();
       
       int [][] ticketSales = {
    
        {420, 310, 180, 390},
        {450, 280, 220, 390},
    };

       
       
       
        System.out.println("\n---------------------------------------");
        System.out.println("THEATRE TICKET SALES REPORT - 2026");
        System.out.println("---------------------------------------");
        System.out.printf("%-8s%-8s%-8s%-8s%-8s%n", "YEAR", "SUMMER", "AUTUMN", "WINTER", "SPRING");
        System.out.printf("%-8s%-8d%-8d%-8d%-8d%n", "YEAR 1", 420, 310, 180, 390);
        System.out.printf("%-8s%-8d%-8d%-8d%-8d%n", "YEAR 2", 450, 280, 220, 390);
        System.out.println("---------------------------------------");
        
        System.out.printf("Total tickets sold: %d%n" , ts.TotalTicketSales(ticketSales));
        System.out.printf("Average per season: %.0f%n" , ts.AverageTicketSales(ticketSales));
        System.out.printf("Highest season: %d%n" , ts.HighestSale(ticketSales));
        System.out.printf("Lowest season: %d%n" , ts.LowestSale(ticketSales));
        System.out.println("---------------------------------------\n");
    }
}

/*

import org.junit.Test;
import static org.junit.Assert.*;
 

* Unit tests for the TicketSales class.

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
} 

*/