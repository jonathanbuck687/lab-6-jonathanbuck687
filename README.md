# Lab 6: Writing Classes
## Part 1: Gas Mileage Simulation

Create a class `Automobile` with  the **private instance variables**:
- `String make`: Describes the make of the car
- `String model`: Describes the model of the car
- `double mileage`: Represents the car's gas mileage in miles per gallon
- `double fuelTank`: Represents the maximum capacity of the car's fuel tank in gallons
- `double fuel`: Represents the car's current fuel level in gallons
`Automobile ` also has the following **methods**:
- `Automobile(String mk, String mdl, double m, double fT)`: This constructor should set all of the instance variables. Assume the tank is full.
- `fillUp(double gallons)`: Adds `gallons` gallons of fuel to the tank. If a user tries to overfill the tank, only fill it to its maximum capacity.
- `takeTrip(double miles)`: Removes gas from the tank as  result of driving a `miles` miles. 
- `reportFuel()`: Returns how much fuel is remaining in the car.

Test your `Automobile` class by creating a `TestAutomobile` class as follows:

```Java
public class TestAutomobile {  
    public static void main(String[] args) {  
  
		// Creates a car with 35mpg and a max capacity of 8 gallons of gas. 
        Automobile myCar = new Automobile("Toyota", "Prius", 35, 8);  
  
		// Uses myCar to call takeTrip method. Passes argument of 100 miles driven  
	    myCar.takeTrip(100);  
	    
        // Uses myCar to call fillUp method. Passes argument of 2 gallons  
        myCar.fillUp(2);  
  
        // Uses myCar to call the reportFuel method. It returns a double of the amount of gas remaining in the tank  
        double fuelLeft = myCar.reportFuel();  
  
        // Prints the fuelLeft variable. For this example, it is equal to 7.14285714286
        System.out.println(fuelLeft);  
    }  
}
```


## Part 2: National Park Layout Planner

You work for a national parks department planning new recreational areas. Shapes represent campsites (circular) and picnic zones or paths (rectangular). Your software computes total usable space.

### Step 1: Campsite and Trail Classes

In this section, you will create two classes: `Campsite` and `Trail`. `Campsite` represents circular campsites and have one instance variable, `radius`. `Trail` represents rectangular trails with two instance variables, `length` and `width`. Each class needs two methods, `area()` and `perimeter()`, in addition to appropriate "getters" and "setters" for the private instance variables. Each class needs one constructor that initializes the private instance variables. Write the classes `Campsite` and `Trail` before continuing. *Hint: You will need to use another class to use Pi in your calculations.*
### Step 2: Reading from a File

For this section, you will calculate the total area of the park described by `park.txt`. Each line contains either 'campsite' and the campsite's radius or 'trail' and the trails length and width. The park contains all of the campsites and trails listed in the file. 

As an example, if `park.txt` contained the following: 
```
campsite 10.0    // campsite radius
trail 25.0 6.0   // trail length width
```
Your program should produce the following:
```
Park Area: 464.15927
```
