
public class Main
{
    public static void main(String[] args)
    {
        //Variables must be meaningful can include letters, numbers, _, $, &
        //It cannot start with a number age1, 1age - not ok
        //Case counts so Total is different from total
        //if words change color on you it is already used in java
        //Variables must also declare a variable type (what its going to store)
        //int - integers (whole numbers), double (decimal numbers), String (words)
        int num1 = 10; //Declaring and intilaizing the variable
        int num2 = 20;
        int sum;
        
        sum = num1+num2;
        
        System.out.println("The sum of both numbers is: "+ sum);
        System.out.println("=============================================");
        
        int radius =5;
        int height = 10;
        final double PI = 3.14159; //Constants are caps and final - cannot be changed
        double volume;
        
        volume = PI*radius*radius*height;
        System.out.println("The volume is: "+volume);
        
        radius = 20;
        height = 100;
        
        
        volume = PI*radius*radius*height;
        System.out.println("The new volume is: "+volume);
    }
}
        
    