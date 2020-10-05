/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostel;

/**
 *
 * @author morph
 */
public class Payment {
    private String month;
    private double amount;
    /*
    Constructor initialises the payment month and the amount paid
    monthIn: month of payment
     amountIn: amount of payment
    
    */
    
    public Payment(String monthIn,double amountIn)
    {
    month=monthIn;
    amount=amountIn;
    
    
    
    }
    /*
    reads the month for which payment was made
    returns the months for which the payment was made
    */
    public String getMonth()
    {
    
    return month;
    
    }
    /*
    reads the amount paid
    returns the amount paid
    */
    public double getAmount()
    {
    
    return amount;
    
    }
    //this method is used to get information from both the get month and get amount
    @Override
    public String toString()
    {
    
    
    return"("+month+","+amount+")";
        
    }
    
    
    
}
