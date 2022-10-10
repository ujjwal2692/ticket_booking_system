// main method
package com.system;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t;
        
        USER_INFO ob2 = new USER_INFO();
        ob2.user_information();
        
        Cancel ob3 = new Cancel();
        Booking ob1 = new Booking();
        try{
            System.out.println("Enter 1 for booking a ticket and 0 for cancelling a ticket ");
            if(s.hasNextInt())
                t = s.nextInt();
            else
                t = 1;
            
            if(t == 1){
                
                ob1.Book();
            }
            else{
                
            
                ob3.cancel_ticket(1);
            }
        }
        catch(Exception ae) {
            System.out.println(ae);
            ob1.Book();
        }
        Status ob = new Status();
        ob.status();
        s.close();
        
    }
}
