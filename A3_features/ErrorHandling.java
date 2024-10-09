// Class to demonstrate basic error handling in Java
class Errors {
    // Member variables
    int a;  // First number for division
    int b;  // Second number for division
    int k = 0;  // Variable to store the result

    // Method to perform division and handle errors
    void calculate() {
        try {
            // Attempt to divide a by b
            k = a / b;  
        } catch (ArithmeticException ae) {
            // Handle division by zero exception
            System.out.println("Cannot divide integer by zero");
        }
        // Print the result (will be 0 if exception occurs)
        System.out.println(k);
    }
}
public class ErrorHandling {
    public static void main(String[] args) {
        // Create an object of the Errors class
        Errors obj1 = new Errors();

        // Assign values to the member variables
        obj1.a = 3;  
        obj1.b = 0;  

        // Call the calculate method 
        obj1.calculate();  // Output: "Cannot divide integer by zero" and "0"
    }
}

