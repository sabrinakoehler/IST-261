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
public class Destination {
    private String destinationName = "";
    private String destinationAddress = "";
    private String Activity = "";
    private int arrivalDate;
    private int Time;
    private int Price;
    
    public Destination (String newDestinationName, String newDestinationAddress, String newActivity, int newArrivalDate, int newTime, int newPrice) {
        this.destinationName = newDestinationName;
        this.destinationAddress = newDestinationAddress;
        this.Activity = newActivity;
        this.arrivalDate = newArrivalDate;
        this.Time = newTime;
        this.Price = newPrice;
    }
    
    public String getDestinationName() {
        return destinationName;
    }
    public void setDestinationName (String newDestinationName) {
        this.destinationName = newDestinationName;
    }
    
    public String getDestinationAddress() {
        return destinationAddress;
    }
    public void setDestinationAddress (String newDestinationAddress) {
        this.destinationAddress = newDestinationAddress;
    }
    
    public String getActivity() {
        return Activity;
    }
    public void setActivity(String newActivity) {
        this.Activity = newActivity;
    }
    
    public int getArrivalDate() {
        return arrivalDate;
    }
    public void setArrivalDate(int newArrivalDate) {
        this.arrivalDate = newArrivalDate;
    }
    
     public int getTime() {
        return Time;
    }
    public void setTime(int newTime) {
        this.Time = newTime;
    }
    
    public int getPrice() {
        return Price;
    }
    public void setPrice(int newPrice) {
        this.Price = newPrice;
    }
}
