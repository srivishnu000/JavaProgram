public class SumOfNumbers
 {
    public static void main(String[] args) 
{
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};        
        int sum = 0;         
                for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; 
        }
        
                System.out.println("The sum of the 10 numbers is: " + sum);
    }
}
