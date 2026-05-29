import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.HashMap;
import java.time.LocalDate;

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

        System.out.print("Do you want to test calculator: ");
        String answer2 = scanner.nextLine();
        if (answer2.equals("yes")) {

            //conditional statements
            //calculator exercise (for if statements)
            System.out.print("Enter the first number:");
            double input1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the second number:");
            double input2 = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("What operation do you want to perform?");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("sum") || operation.equals("+")) {
                System.out.printf("%.2f + %.2f = %.2f\n", input1, input2, input1 + input2);
            } else if (operation.equalsIgnoreCase("sub") || operation.equals("-")) {
                System.out.printf("%.2f - %.2f = %.2f\n", input1, input2, input1 - input2);
            } else if (operation.equalsIgnoreCase("div") || operation.equals("/")) {
                if (input2 != 0) {
                    System.out.printf("%.2f / %.2f = %.2f\n", input1, input2, input1 / input2);
                } else {
                    System.out.println("You can't divide by zero!");
                }
            } else if (operation.equalsIgnoreCase("mul") || operation.equals("*")) {
                System.out.printf("%.2f * %.2f = %.2f\n", input1, input2, input1 * input2);
            } else {
                System.out.printf("%s is not a supported operation", operation);
            }

            //Calculator exercise for switch case statement
            switch (operation) {
                case "+":
                case "sum":
                    System.out.printf("%.2f + %.2f = %.2f\n", input1, input2, input1 + input2);
                    break;
                case "-":
                case "sub":
                    System.out.printf("%.2f - %.2f = %.2f\n", input1, input2, input1 - input2);
                    break;
                case "/":
                case "div":
                    if (input2 != 0) {
                        System.out.printf("%.2f / %.2f = %.2f\n", input1, input2, input1 / input2);
                    } else {
                        System.out.println("You can't divide by zero!");
                    }
                    break;
                case "*":
                case "mul":
                    System.out.printf("%.2f * %.2f = %.2f\n", input1, input2, input1 * input2);
                    break;
                default:
                    System.out.printf("%s is not a supported operation", operation);
                    break;
            }
        }

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

        //Arrays
        char vowels[] = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        char vowels2[] = {'e', 'i', 'u', 'a', 'o'}; // can also declare and initialize at same time (length of array is automatically capped to the number of items it is declared with)

        System.out.println(vowels[2]); // prints a single index
        System.out.println(Arrays.toString(vowels)); // prints whole array as a string

        // find length of an array
        System.out.println(vowels2.length); // array.length (property)

        //Sort an array
        System.out.println(Arrays.toString(vowels2));
        Arrays.sort(vowels2, 1,4); // sorts the array in a specified range
        System.out.println(Arrays.toString(vowels2));
        Arrays.sort(vowels2); // changes the actual array
        System.out.println(Arrays.toString(vowels2));

        // search for a value in a sorted array
        char key = 'o';
        int foundItemIndex = Arrays.binarySearch(vowels2, key); // returns the index number if found, or a negative value if it can't find it in the array
        System.out.println("The letter " + vowels2[foundItemIndex] + " was found at index " + foundItemIndex);
        int foundItemIndexInRange = Arrays.binarySearch(vowels2, 1, 4, key); // search within a specified range and returns a negative value if it can't find it in the range
        System.out.println("The letter " + vowels2[foundItemIndexInRange] + " was found at index " + foundItemIndexInRange);

        //Fill an array
        Arrays.fill(vowels, 'x');
        System.out.println(Arrays.toString(vowels));
        Arrays.fill(vowels, 1, 4, '0'); // fills the array in a specified range
        System.out.println(Arrays.toString(vowels));

        // To make an actual copy of an array without it being a reference only
        int numbers[] = {1,2,3,4,5};
        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length); // length of array can be greater or smaller e.g. 10 in the second parameter
        int copyOfNumbersInRange[] = Arrays.copyOfRange(numbers, 2, 10); // copy the array within a specified range
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
        System.out.println(Arrays.toString(copyOfNumbersInRange));

        // compare Arrays
        System.out.println(numbers == copyOfNumbers); // is false as they are not the same object
        System.out.println(Arrays.equals(numbers, copyOfNumbers)); // compares the contents of the arrays

        // ways to loop through arrays
        for (int i = 0; i < numbers.length; i++){ // normal way to loop through an array
            System.out.println(numbers[i]);
        }

        for (int i = 0; i <= 15; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }

        for (int number : numbers){ // another way to loop through an array
            System.out.println(number);
        }

        int counter = 0;
        while (counter <= 10){
            System.out.println(counter);
            counter++;
        }
        counter = 0;
        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 10);

        //Array lists
        ArrayList<Integer> numbersArrayList = new ArrayList<Integer>(); // Integer is the reference type for int

        // Add values to the Array List
        numbersArrayList.add(5);
        numbersArrayList.add(2);
        numbersArrayList.add(3);
        numbersArrayList.add(4);
        numbersArrayList.add(1);

        System.out.println(numbersArrayList.toString()); // prints out whole array list
        System.out.println(numbersArrayList.get(2)); // Prints the value in a specified index

        //Check the size of an array list
        System.out.println(numbersArrayList.size());

        //check if the array list contains a specified value
        System.out.println(numbersArrayList.contains(Integer.valueOf(1)));

        //check if the array list contains anything
        System.out.println(numbersArrayList.isEmpty());

        // change values in the Array list
        numbersArrayList.set(2, 30); // sets the value at the specified index to the specified value
        System.out.println(numbersArrayList.toString());

        //Sort the array list
        numbersArrayList.sort(Comparator.naturalOrder()); // in natural order
        System.out.println(numbersArrayList.toString());

        numbersArrayList.sort(Comparator.reverseOrder()); // in reverse order
        System.out.println(numbersArrayList.toString());

        //Loop through the Array list
        numbersArrayList.forEach(number -> { // One way to loop through an array list
            numbersArrayList.set(numbersArrayList.indexOf(number), number * 2); // .index() returns the index of the specified number
            System.out.println(number);
        });

        for (int number : numbersArrayList){ // another way to loop through an array list
            System.out.println(number);
        }

        //Remove values from the Array list
        numbersArrayList.remove(1); // removes the value at specified index
        System.out.println(numbersArrayList.toString());

        numbersArrayList.remove(Integer.valueOf(4)); // removes the specified value
        System.out.println(numbersArrayList.toString());

        numbersArrayList.clear(); // removes all the items
        System.out.println(numbersArrayList.toString());
        System.out.println(numbersArrayList.isEmpty());

        //HashMaps
        HashMap<String, Integer> examScores = new HashMap<String, Integer>(); //declares a hashMap

        //to add a value pair to a HashMap
        examScores.put("Maths", 90);
        examScores.put("Computer Science", 100);
        examScores.put("Physics", 82);

        //To add a value pair if the key does not already exist inside the HashMap
        examScores.putIfAbsent("Maths", 10); //does nothing as already exists inside the hashMap
        System.out.println(examScores.toString());

        //to replace the value of a specified key
        examScores.replace("Maths", 20);
        System.out.println(examScores.toString());

        System.out.println(examScores.toString()); //Prints the whole HashMap
        System.out.println(examScores.get("Maths")); //Prints the value associated with the specified key

        //specify return values if key not found
        System.out.println(examScores.get("English")); //returns null if not found
        System.out.println(examScores.getOrDefault("English",-1)); //returns specified value (-1) if key not found

        //To check if a hashMap contains a specified key
        System.out.println(examScores.containsKey("Maths"));

        //To check if a hashMap contains a specified Value
        System.out.println(examScores.containsValue(100));

        //To remove a value pair from a HashMap
        examScores.remove("Physics");
        System.out.println(examScores.toString());

        //To return the number of value pairs in a HashMap
        System.out.println(examScores.size());

        //To loop thought a HashMap
        examScores.forEach((subject, score) -> {
            examScores.replace(subject,(score * 2));
        });
        System.out.println(examScores.toString());



        //Clear out the entire hashMap
        examScores.clear();
        System.out.println(examScores.toString());

        //To check if a hashMap is empty
        System.out.println(examScores.isEmpty());

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

        //Object-Oriented Programming
        //To instantiate an object from one of the other classes
        User youngerUser = new User("Walter", "2009-04-09"); //Instantiates a User object
        //youngerUser.name = "Walter"; --> used if the attributes are public
        //youngerUser.birthday = LocalDate.parse("2009-04-09");

        System.out.printf("%s was born back in %s\n", youngerUser.getName(), youngerUser.getBirthday().toString());
        System.out.printf("He is now %d years old\n", youngerUser.age());

        User olderUser = new User("Gary", "1920-01-01"); //instantiate another User object
        //olderUser.name = "Gary"; --> used if the attributes are public
        //olderUser.birthday = LocalDate.parse("1920-01-01");

        System.out.printf("%s was born back in %s\n", olderUser.getName(), olderUser.getBirthday().toString());
        System.out.printf("He is now %d years old\n", olderUser.age());

        Book book = new Book("Good Omens", "Terry Pratchett", 500);
        //book.title = "Good Omens";
        //book.author = "Terry Pratchett";

        youngerUser.borrow(book);
        System.out.printf("%s currently has the books:\n", youngerUser.getName());
        youngerUser.getBooks();

        System.out.printf("%s currently has the books: %s\n", youngerUser.getName(), youngerUser.borrowedBooks());

        AudioBook HarryPotter = new AudioBook("Harry Potter", "Someone",  28000);
        System.out.println(HarryPotter.toString());

        Ebook jeeves = new Ebook("Carry On Jeeves", "P.G.Wodehouse", 280, "PDF");
        System.out.println(jeeves.toString());
    }
}
