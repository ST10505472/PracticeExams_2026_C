/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_exams_2026;

/**
 *
 * @author reaganrichards
 */
public class TicketSales implements ITicketSales{
    
     private int [][] sales = {
    
        {420, 310, 180, 390},
        {450, 280, 220, 390},
    };

    @Override
    public int TotalTicketSales(int[][] ticketSales) {
        
        int total = 0;
        
        for (int row = 0; row < sales.length; row++)
        {
            for (int col = 0; col< sales[row].length; col++){
            
                total += ticketSales[row][col];
            }
        }
        return total;
    };

    @Override
    public double AverageTicketSales(int[][] ticketSales) {
        
        int count = 0;
        
        for (int row = 0; row < sales.length; row++)
        {
            for (int col =0; col < sales[row].length; col++)
            {
                count++;
            }
            if (count == 00)
            {
                return 0;
            }
        }
            return (double) TotalTicketSales(ticketSales) / count;
    }

    @Override
    public int HighestSale(int[][] ticketSales) {
        
        int highest = ticketSales[0][0];
        
        for (int row = 0; row < sales.length; row++)
        {
            for (int col = 0; col < sales[row].length; col++)
            {
                if (ticketSales[row][col] > highest)
                {
                    highest = ticketSales[row][col];
                }
            }
               
            }
        return highest;

    }

    @Override
    public int LowestSale(int[][] ticketSales) {
        
        int lowest = ticketSales[0][0];
        
        for (int row = 0; row < sales.length; row++)
        {
            for (int col = 0; col < sales[row].length; col++)
            {
            if (ticketSales[row][col] < lowest)
            {
                lowest = ticketSales[row][col];
            }
            }
        }
        return lowest;
    }
    
}
