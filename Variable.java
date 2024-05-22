// This program demonstrates basic arithmetic operations in Java.
class Operation {
    public static void main(String[] args) {
        int num1 = 15;               // Initialize first number
        int num2 = 5;                // Initialize second number
        int num3 = 10;               // Initialize third number
        int addition = num1 + num2;  // Addition operation
        int subtraction = num1 - num2;  // Subtraction operation
        int multiplication = num1 * num2;  // Multiplication operation
        int division = num1 / num2;  // Division operation
        int modulus = num1 % num2;  // Modulus operation
        num3++;  // Increment num3

        // 2 ways to increment - 
        // num1 += 1 or num1++
        // num1++ (post - increment) - first fetch the value and then increment
        // ++num1 (pre - increment)  - increment first and the fetch the value 
        // we can do the same with subtraction operation (--num3 and num3--)

        // Output the results
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(modulus);
        System.out.println(num3);
    }
}
    
        
   
