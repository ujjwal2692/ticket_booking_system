package com.system;
public class Main{
    public static void main(String[] args){
        USER_INFO ob2 = new USER_INFO();
        ob2.user_information();
        Booking ob1 = new Booking();
        ob1.Book();
        Status ob = new Status();
        ob.status();
        Cancel ob3 = new Cancel();
        ob3.cancel_ticket();
        

    }
}