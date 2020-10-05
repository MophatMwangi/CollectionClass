/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostel;

import java.util.ArrayList;

/**
 *
 * @author Mophat Njuhi
 */
public class TenantList {
    
   private ArrayList<Tenant>tList;
     int MAX;
   
     
     public TenantList(int maxIn)
     {
     tList = new ArrayList<>();
     MAX = maxIn;
     }
     
     public boolean addTenant(Tenant tIn)
     {
     if(!isFull())
     {
         tList.add(tIn);
         return true;
     }else{
     return false;
     }
     
     }
     
     public boolean removeTenant(int roomIn)
     {
     Tenant findT  = search(roomIn);
     if(findT != null)
     {
     tList.remove(findT);
     return true;
     }else
     {
     return false;
     }
     
     }

    Tenant search(int roomIn) {
       for(Tenant currentTenant: tList)
       {
       if(currentTenant.getRoom()==roomIn)
       {
       return currentTenant;
       }
       }
       return null;
    }

    public Tenant getTenant(int positionIn)
    {
    if(positionIn<1 || positionIn>getTotal())
    {
        return null;
    }else
    {
    
    return tList.get(positionIn-1);
    }
    
    
    }
    
    public boolean isEmpty()
    {
    return tList.isEmpty();
    }
    private boolean isFull() {
        return tList.size()==MAX;
    }

    int getTotal() {
       return tList.size();
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
    return tList.toString();
    }
   
   
}
