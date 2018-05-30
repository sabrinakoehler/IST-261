/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triphub;

/**
 *
 * @author sabrinakoehler
 */
public class Accommodation {
    String Hotel = "";
    String hotelAddress = "";
    int bookingDate;
    int checkIn;
    int checkOut;
    int Price;
    
    
    public Accommodation(String newHotel, String newHotelAddress, int newBookingDate, int newCheckIn, int newCheckOut, int newPrice) {
        this.Hotel = newHotel;
        this.hotelAddress = newHotelAddress;
        this.bookingDate = newBookingDate;
        this.checkIn = newCheckIn;
        this.checkOut = newCheckOut;
        this.Price = newPrice;
    }
    
    public String getHotel () {
        return Hotel;
    }
    public void setHotel(String newHotel) {
        this.Hotel = newHotel;
    }
    
    public String getHotelAddress() {
        return hotelAddress;
    }
    public void setHotelAddress (String newHotelAddress) {
        this.hotelAddress = newHotelAddress;
    }
    
    public int getBookingDate() {
        return bookingDate;
    }
    public void setBookingDate(int newBookingDate) {
        this.bookingDate = newBookingDate;
    }
    
    public int getCheckIn() {
        return checkIn;
    }
    public void setCheckIn(int newCheckIn) {
        this.checkIn = newCheckIn;
    }
    
    public int getCheckOut() {
        return checkOut;
    }
    public void setCheckout (int newCheckOut) {
        this.checkOut = newCheckOut;
    }
    
    public int getPrice () {
        return Price;
    }
    public void setPrice(int newPrice) {
        this.Price = newPrice;
    }
}
