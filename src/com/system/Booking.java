package com.system;
import java.util.Date;

public class Booking extends  Status{

public void Book(){
    Date d = new Date();
    if(status()==1){
        System.out.println("Ticket Booked at : "+d);
        n=n-1;
    }
    else{
        System.out.println("Unable to book");

    }    
    }
}