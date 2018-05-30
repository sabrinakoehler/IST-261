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
public class Travel {
    private int departureDate;
    private int Time;
    private String Lodging;
    private String methodOfTravel; //If user is travelling by plane, train, boat, etc.
    private int travelPrice;
    
    public Travel (int newDepartureDate, int newTime, String newLodging, String newMethodOfTravel, int newTravelPrice) {
        this.departureDate = newDepartureDate;
        this.Time = newTime;
        this.Lodging = newLodging;
        this.methodOfTravel = newMethodOfTravel;
        this.travelPrice = newTravelPrice;
    }
    
    public int getDepartureDate () {
        return departureDate;
    }
    public void setDepartureDate (int newDepartureDate) {
        this.departureDate = newDepartureDate;
    }
    
    public int getTime () {
        return Time;
    }
    public void setTime (int newTime) {
        this.Time = newTime;
    }
    
    public String getLodging () {
        return Lodging;
    }
    public void setLodging (String newLodging) {
        this.Lodging = newLodging;
    }
    
    public String getMethodOfTravel() {
        return methodOfTravel;
    }
    public void setMethodOfTravel (String newMethodOfTravel) {
        this.methodOfTravel = newMethodOfTravel;
    }
    
    public int getTravelPrice () {
        return travelPrice;
    }
    public void setTravelPrice (int newTravelPrice) {
        this.travelPrice = newTravelPrice;
    }
}
