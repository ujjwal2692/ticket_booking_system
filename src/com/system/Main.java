package com.system;
import java.util.Date;

public class Booking{

public void Book(){
    Date d = new Date();
    if(status()){
        System.out.println("Ticket Booked at : "+d);
        n=n-1;
    }
    else{
        System.out.println("Unable to book");

    }
     
    
        
    }
}