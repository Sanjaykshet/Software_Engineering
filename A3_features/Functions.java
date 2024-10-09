class add{
	int num1;
	int num2;
//		method to add two numbers and print the sum
	void addNumbers(int num1,int num2) {
		int sum = num1 + num2;
        System.out.println("Sum: " + sum);
	}
}
//Main class that contains the main method to run the program
public class Functions {
		    public static void main(String[] args) {
		    	add obj1 = new add();
		        // Calling the function with arguments
		        obj1.addNumbers(5, 3);  // Output: Sum: 8
		        obj1.addNumbers(10, 20);  // Output: Sum: 30
		    }
		}




