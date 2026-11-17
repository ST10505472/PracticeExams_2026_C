
package com.mycompany.practice_exams_2026;


public class TicketSales implements ITicketSales{
    
     private int [][] sales = { //2D Array for storing ticket sales
    
        {420, 310, 180, 390},
        {450, 280, 220, 390},
    };

    @Override
    public int TotalTicketSales(int[][] ticketSales) { //calculate the sum of all ticket sales and return the total sum of tickets
        
        int total = 0;
        
        for (int row = 0; row < ticketSales.length; row++)
        {
            for (int col = 0; col< ticketSales[row].length; col++){
            
                total += ticketSales[row][col];
            }
        }
        return total;
    };

    @Override
    public double AverageTicketSales(int[][] ticketSales) {//calculate the average value of all ticket sales and return the average as a double
        
        int count = 0;
        
        for (int row = 0; row < ticketSales.length; row++)
        {
            for (int col =0; col < ticketSales[row].length; col++)
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
    public int HighestSale(int[][] ticketSales) { //finds and returns the highest ticket value and return the maximum value found
        
        int highest = ticketSales[0][0];
        
        for (int row = 0; row < ticketSales.length; row++)
        {
            for (int col = 0; col < ticketSales[row].length; col++)
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
    public int LowestSale(int[][] ticketSales) {//finds and returns the lowest ticket value and return the minimum value found
        
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
