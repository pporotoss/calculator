import java.util.Scanner;

public class Main {
    
    private static int num1, num2, result;
    private static String operator;
    
    public static void main(String[] args) {
    
        String input = getConsoleInput();
        
        String[] inputArray = input.split("\\s");
        num1 = Integer.parseInt(inputArray[0]);
        operator = inputArray[1];
        num2 = Integer.parseInt(inputArray[2]);
        
        result = calculate(num1, operator, num2);
    
        System.out.println("result : "+result);
    }
    
    public static String getConsoleInput() {
        try(Scanner scanner = new Scanner(System.in);) {
            while(true) {
                System.out.print("Please enter a expression : ");
                String input = scanner.nextLine();
                
                if(input.matches("\\d\\s[/*+\\-]\\s\\d")) {
                    return input;
                }
                
                System.out.println("Wrong expression");
            }
        }
    }
    
    public static int calculate(int num1, String operator, int num2) {
        
        switch (operator) {
            case "+" :
                return add(num1, num2);
                
            case "-" :
                return sub(num1, num2);
            
            case "*" :
                return multi(num1, num2);
            
            case "/" :
                return div(num1, num2);
                
            default:
                return 0;
        }
    }
    
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public static int sub(int num1, int num2) {
        return num1 - num2;
    }
    
    public static int multi(int num1, int num2) {
        return num1 * num2;
    }
    
    public static int div(int num1, int num2) {
        return num1 / num2;
    }
    
    
}