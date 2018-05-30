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
public class User {
    private String firstName = "";
    private String lastName = "";
    private int Age;
    private int Budget;
    private String wishList = ""; //Places user would want to visit/things user would want to do?
    private String Interest1 = "";
    private String Interest2 = "";
    

    public User (String newFirstName, String newLastName, int newAge, int newBudget, String newWishList, String newInterest1, String newInterest2) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.Age = newAge;
        this.Budget = newBudget;
        this.wishList = newWishList;
        this.Interest1 = newInterest1;
        this.Interest2 = newInterest2;
    }

    public String getfirstName() {
        return firstName;
    }
    public void setfirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getlastName() {
        return lastName;
    }
    public void setlastName(String newLastName) {
        this.lastName = newLastName;
    }

    public int getAge() {
        return Age;
    }
    public void setAge(int newAge) {
        this.Age = newAge;
    }
    
    public int getBudget() {
        return Budget;
    }
    public void setBudget(int newBudget) {
        this.Budget = newBudget;
    }
    
    public String getWishList() {
        return wishList;
    }
    public void setWishList(String newWishList) {
        this.wishList = newWishList;
    }
    
    public String getInterest1() {
        return Interest1;
    }
    public void setInterest1(String newInterest1) {
        this.Interest1 = newInterest1;
    }
    
    public String getInterest2() {
        return Interest2;
    }
    public void setInterest2(String newInterest2) {
        this.Interest2 = newInterest2;
    }
}