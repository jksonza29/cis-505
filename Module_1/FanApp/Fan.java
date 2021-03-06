/*
    Author: Janzal Karlo Sonza
    Date: 03/19/2022
    Purpose: Create a fan class that defines the properties of the fan object and possible actions
*/
public class Fan {
   // <add code here> - hint:  each comment line below tells you what should be on a corresponding code line
//declare all variables
//set as static so all like objects can access the fan's speeds
//set constants for fan speed (const ensures vars cannot change)
//set current speed to stopped
//var for check of fan status
//var for fan size
//var for fan color

static final int STOPPED = 0;
static final int SLOW = 1;
static final int MEDIUM = 2;
static final int FAST = 3;
private int speed;
private boolean isOn;
private double radius;
private String color;

/*set parameterless constructor that default values for each fan object*/
public Fan(){ 
    this.speed = STOPPED;
    this.isOn = false;
    this.radius = 6;
    this.color = "white";
}

/* constructor allowing custom fan object settings when instantiated. NOTE: must 
declare all four during object creation to invoke this constructor */
public Fan(int speed, boolean isOn, double radius, String color){
    this.speed = speed;
    this.isOn = isOn;
    this.radius = radius;
    this.color = color;
}

/*getter setter methods - this operator refers to object's instance variables above*/
public int getSpeed(){//get the fan speed
        return this.speed;
}
public void setSpeed(int speed){ 
    //set the fan speed if within range as dictated by ternary operator
        this.speed = speed;
}

public boolean getStatus(){ //get the fan's status
        return this.isOn;
}
public void setStatus(boolean isOn){ //set the fan's status
        this.isOn = isOn;
}

public double getRadius(){ //get the radius
        return this.radius;
}
public void setRadius(double radius){ //set the radius
        this.radius = radius;
}

public String getColor(){
        return this.color;
}
public void setColor(String color){
        this.color = color;
}
//  this is a completed override of toString - I want you to know how to do this right away
@Override //creation of override toString method that can be called from another class
public String toString(){
    String fanStatus = this.isOn ? "on" : "off"; //set boolean to custom text
    if(this.isOn)
        return "The fan speed is set to " + this.speed + " with a color of " + this.color + " and a radius of " + this.radius;
    else
        return "The fan is " + this.color + " with a radius of " + this.radius + " and the fan is " + fanStatus;
}
}