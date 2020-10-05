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
public class Tenant {
    private String name;
    private int room;
    private PaymentList payments;
    public static final int MAX = 12;
    
    /*
    constructor initialises the name and the room number of the tenant
    and sets the payments made to the empty list
    @param nameIn:name of tenant
    @param roomIn:room number of tenant
    */
    public Tenant(String nameIn, int roomIn)
    {
    name = nameIn;
    room = roomIn;
    payments = new PaymentList(MAX);
    }
    /*
    *Records a payment for the tenant
    @param paymentIn:payment made by tenant
    */
    public void makePayment(Payment paymentIn)
    {
    payments.addPayment(paymentIn);//call PaymentList method
    }
    /*
    reads the name of the tenant
    @return Returns the room of the tenant
    */
    public String getName()
    {
    return name;
    }
    
    /*
    reads the room of the tenant
    @return Returns the room of the tenant
    */
    public int getRoom()
    {
    
    return room;
    }
    /*
    Reads the payments of the tenant
    @return the payments made by the tenant
    */
    public PaymentList getPayments()
    {
    return payments;
    }
    
    @Override
    public String toString()
    {
    return name+","+room+","+payments;
    
    }
    
}
