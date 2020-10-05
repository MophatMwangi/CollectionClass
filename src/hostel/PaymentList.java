/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostel;

import java.util.ArrayList;

/**
 *collection class to hold a list of payment objects
 * @author morph
 */
public class PaymentList {
    //Attributes
    private ArrayList<Payment>pList;
    public final int MAX;
    
    /*
    
    constructor initilises the empty payment list and sets the maximum list size
   @param maxIn: the maximum number of payments in the list
    
    
    */
    
    public PaymentList(int maxIn)
    {
    
    pList = new ArrayList<>();
    MAX =maxIn;
    
    }
    
    /*
    Check if the payment list is full
    @return Returns true if the list is full amd false if otherwise
    */
    
    public boolean isFull()
    { 
    return pList.size()==MAX;
    }    
    
    /*
    
    gets the total number of payments
    @returns Returns the total number of payments currently in the list
    */
    
    
    
    public int getTotal()
    {
    
    return pList.size();
    
    }
    
    /*
    Add a new payment to the end of the list
   @param pIn:the payment to add
    @return Returns true if the object was added successfully and false otherwise
    */
    
    public boolean addPayment(Payment pIn)
    {
    if(!isFull())//ok to add Payment
    {
    pList.add(pIn);
    return true;
    }    
    else{
    // Payment not added to a full list
    return false;
    }
    }
    
    
    /*
    reads the payment at the given  position in the List
   @param positionIn:The logical position of the payment in the list
  @return  Returns the payment at the given logical position in the list
    or null if no payment at that logical position
    
    
    */
    public Payment getPayment(int positionIn)
    {
    
    if(positionIn < 1|| positionIn > getTotal())
    {
    //no object found at the given position
    return null;
    
    
    }else
    {
    //take one  off logical position to get ArrayList position
    return pList.get(positionIn = 1);
    
    
    }
    
    
    
    }
    
    /*
    calculate the total payments made by the tenant
    @return returns the total value of payments recorded
    */   
    public double calculateTotalPaid()
    {
    double totalPaid = 0;
    for(Payment p:pList)
    {
    totalPaid = totalPaid + p.getAmount();
    
    }
    
    return totalPaid;
    }    
    
   
    @Override
    public String toString()
    {
    return pList.toString();
    
    }
    
 }

