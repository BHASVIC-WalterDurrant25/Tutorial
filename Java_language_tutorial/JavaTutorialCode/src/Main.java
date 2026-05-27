import java.util.Scanner;

class Main {
    static int aged; //static methods can only access static variables
                     //variables declared outside the methods are given a default value of 0
    public static void main(String[] args){ //main method
        System.out.println("Hello World");
        int myAge = 17;
        System.out.println("I am " + myAge + " years old!"); //how to print a line and concatenate
        System.out.println("I was once " + aged + " years old");

        // implicit conversion
        int number1 = 5;
        double number2 = number1;

        System.out.println(number2);

        // to go the other way (explicit conversion)

        double number3 = 7.8;
        int number4 = (int)number3;

        System.out.println(number4); // truncates the value during conversion

        // Can use operators inside the print statement
        System.out.println(number3 + number2);
        //operators are +, -, *, /, <, >, <=, >=, !=, ==, && (AND), || (OR), % (MOD)

        // if dividing with doubles, result is a double
        System.out.println(number3 / number1);
        // if dividing integers, result is always an integer (truncated)
        System.out.println(number4 / number1);

        // can change a variable's value using the following
        number1 ++;
        number1 --;
        number1 += 10;
        number1 -= 10;
        number1 %= 2;

        //if you use ++ inside a print statement after the variable, the value is changed after the previous was printed
        System.out.println(number1++);
        System.out.println(number1);
        //If they are placed before the variable, then the value is changed before it is printed
        System.out.println(++number1);
        System.out.println(number1);

        // can use a not operator to change boolean value (only works for one variable at a time)
        boolean bool = true;
        System.out.println(!bool);

        //Inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to test inputs: ");
        String answer = scanner.nextLine();
        System.out.println(answer);

        switch (answer){
            case "Yes":
                System.out.print("Please enter a word: "); // print instead of println means that there is no new line character at the end
                String enteredWord = scanner.nextLine();
                System.out.println("Your word was: " + enteredWord);
                System.out.printf("Your word was: %s\n", enteredWord); // printf means that you can format it inside the print statement

                System.out.print("Please enter a Number: ");
                int enteredNumber = scanner.nextInt(); // other examples: nextDouble(), nextFloat(), ect...
                System.out.printf("Your Number was: %d\n", enteredNumber);

                System.out.print("Please enter another word: ");
                scanner.nextLine(); // clears the input buffer so that it can read another line (use if a scanner.nextLine() is used after another type e.g. scanner.nextInt)
                String enteredWord2 = scanner.nextLine();
                System.out.printf("Your second word was: %s\n", enteredWord2);

                //Can convert when using scanner.nextLine() so there is no need to clear the input buffer (as only using .nextLine())
                System.out.print("Please enter Your age: ");
                int yourAge = Integer.parseInt(scanner.nextLine());
                System.out.printf("Your Number was: %d", yourAge);

                scanner.close(); // reduces memory use
                break;

            default:
                break;
        }

        //Data types
        // integer types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; // -32768 to 32767
        int anInteger = 2147483647; // -2147483648 to 2147483647
        long aLargeNumber = 100000000000000000L; // 'L' is required otherwise is taken as integer

        // decimal types
        double aDouble = 1.8399432; // Double is a floating point number with a very large range
        float aFloat = 3.141F;  // 'F' is required otherwise is taken as Double;
        // float is a floating point number with a smaller range

        // booleans
        boolean isWeekend = false;

        // characters
        char c = 'h'; // any Unicode character

        // strings
        String name = "John"; // requires a capital letter for String
        String location = new String("Lewes");
        String formattedString = String.format("My name is %s. I am from from %s",name,location);
        // Formatting specifiers: %s --> string, %d --> integer, %f --> double or float, %c --> character, %b --> boolean
        System.out.println(formattedString);
        // can also go straight in the print statement:
        System.out.println(String.format("My name is %s. I am from from %s", name, location));


        // Find length of a string (string.length() (Method))
        String word = "Hello There";
        System.out.println(word.length());

        //Check if a string is empty
        System.out.println(word.isEmpty());

        //Make a string Upper Case / lower case (does not change the original string)
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        //Compare two strings ((string1).equals(string2))
        String word2 = "hello there";
        System.out.println(word.equals(word2));
        //Ignore cases of letters
        System.out.println(word.equalsIgnoreCase(word2));

        //Replace a part of a string (does not change the original string)
        System.out.println(word.replace("There","World"));

        //Check if a string contains a substring
        System.out.println(word.contains("There"));


    }
}
