class Car { 
             
    String make; 

    String model; 

    int year; 

  

    // No-argument constructor 

    public Car() { 

        this.make = "Toyota"; 

        this.model = "Corolla"; 

        this.year = 2022; 

    } 

  

    // Method to display car details 

    public void displayCarDetails() { 

        System.out.println("Make: " + make); 

        System.out.println("Model: " + model); 

        System.out.println("Year: " + year); 

    } 

  

    public static void main(String[] args) { 

        // Creating an object using the no-argument constructor 

        Car myCar = new Car(); 

        myCar.displayCarDetails(); 

    } 

} 