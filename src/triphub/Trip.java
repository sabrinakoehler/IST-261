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
public class Trip {
    private int Date;
    private int Time;
    private String firstName;
    private String lastName;
    private String Location;
    private String Accommodation; 
    private int tripRating;
    private String tripReview;
    
    public Trip (int newDate, int newTime, String newFirstName, String newLastName, String newLocation, String newAccommodation, int newTripRating, String newTripReview) {
        this.Date = newDate;
        this.Time = newTime;
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.Location = newLocation;
        this.Accommodation = newAccommodation;
        this.tripRating = newTripRating;
        this.tripReview = newTripReview;
    }
    
    public int getDate () {
        return Date;
    }
    public void setDate (int newDate) {
        this.Date = newDate;
    }
    
    public int getTime() {
       return Time; 
    }
    public void setTime (int newTime) {
        this.Time = newTime;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName (String newFirstName) {
        this.firstName = newFirstName;
    }
    
    public String getLastName () {
        return lastName;
    }
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    
    public String getLocation () {
        return Location;
    }
    public void setLocation (String newLocation) {
        this.Location = newLocation;
    }
    
    public String getAccommodation () {
        return Accommodation;
    }
    public void setAccommodation (String newAccommodation) {
        this.Accommodation = newAccommodation;
    }
    
    public int getTripRating() {
        return tripRating;
    }
    public void setTripRating (int newTripRating) {
        this.tripRating = newTripRating;
    }
    
    public String getTripReview() {
        return tripReview;
    }
    public void setTripReview(String newTripReview) {
        this.tripReview = newTripReview;
    }
}

