import java.util.Scanner;

//Import Statement above ^ 9/30
                     //  |   

/*
Comment Space
Notes 9/18:
Vocabulary:
Algorithm: A step by step process to accomplish a task.
ex: Morning routine, Cooking, School Schedule

Pseudocode: Simplified code to outline programs/algorithms
ex. add func()
         num1
         num2
         1+2 prints (not actual syntax)

Sequencing: the order of steps

Question: What is the difference between Java Script and Java?

Answer: Java is a programming language while JavaScript is a scripting language JavaScript resides inside HTML documents, and can provide levels of interactivity to web pages that are not achievable with simple HTML. Java is a versatile programming language, while JavaScript helps create interactive web pages. 

JavaScript is more popular

 In computer science, "programming language" is the umbrella term for any language used to give instructions to a computer. A scripting language is simply a specific subset of programming languages that is optimized for automation, rapid prototyping, and running inside a host environment without needing to be compiled first.


*/


/*

Notes 9/22

Object-oriented programming: programming built on classes and objects
ex.
public class MyClass{
~~~~~~~~~~~~~~~~~(numofStudent)
~~~~~~~~~~~~~(Subject)
}
Class: blueprint of an object (no memory)
Object: actual implementation(gets stored in memory) objects are built from classes

method: reusable chunk of code that accomplishes an action (function) blueprint/plan
ex. main method (entry point to our code)
-> main(){
}
we code in an IDE with a compiler
compilers translate our java to binary

/*.... */ /*bulk comment */

//......// line comment

//every action in java ends with a //;//



/* 
Notes 9/23

Primitibe Type - strong simple information/data (ex. int x = 5; )
Object(Refrence) Type - storing complex data/objects (ex. creature cat = new creature)

Primitive Variable Types to Know:
1. int - stores integers/positive or negative whole numbers
2. double - stores decimal numbers (ex. double x = 5.0;) (ex. double y = 4.25;)
3. boolean - stores logic only two options are "true" or "false"

Object Variable Type to Know:
1. String -  stores text (ex. "5.0" it's in quotes so it is read as text "Hello World")

Setting Up Variables In Code:
Declaring + Assigning go together
1. Declare Variable --> int x; , String name;
2. Assign Variable  --> x = 5 , name = "L'Oreal"

Or do it in one step! Combines 1. + 2.
3. Initialize Variable  -->  int x = 5; , String name = "L'Oreal"

*/


public class Main {

   public static void main(String []args) {
      // System.out.println("It makes no sense to divide a number by zero!");
      // System.out.println(3/0); //undefined cannot divided by 0 in Java

      int num;
      num = 4;
      System.out.println(num);

// Notes 9/28

      //declare a variable
      double myGradeAverage;
      //asign a value
      myGradeAverage = 95.0;

      //initialize a variable -- declare and assign in one statement

      double myDreamGrade = 100.0;

      // we can format strings using concatenation (+)

      System.out.println("My current grade is:" + myGradeAverage);

      System.out.println("My current grade is:" + myDreamGrade);

      //print statement for ideal graade

      int vacationsPerYear;

      vacationsPerYear = 7;

      System.out.println("My dream number of vacations per year is:" + vacationsPerYear);

      //Assignment 9/28
      System.out.print("Hi ");
      System.out.print("there");
      System.out.print("!");

      //printing a quote using an escape sequence
      //escape sequences always use a backslash \
      // backslash n gives a new line "\n"
      //if you want to print a backslash you write \\
      System.out.print("My teacher \\always says, \n\"Study for your test!\"");

      System.out.println("My mom always tells me to \"Aim for higher than a \"" + myGradeAverage + "\"");

      //arithmetic operations (+ - * /)
      //working with only ints, output will be an int
      // int/int does TRUNCATING DIVISION removes the decimal, does not round if you are dividing by two numbers that give you a decimal
      //System.out.println(12/10);
      //if we want to divide and get a decimal, we need to divided with a double
      //System.out.println(19/10.5);
      //System.out.println(10 + 12.0);
      // % gives us the remainder
      //System.out.println(12%10);

      //Notes 9/30
      
      int myNum = 7;
      int newNum = myNum;
      newNum = 8;

      System.out.println(myNum);
      System.out.println(newNum);

      //incrementing variable 
      myNum = myNum + 1;
      myNum = myNum + 1;

//This does the same thing
//This handles the assignment and the addition all at once
               
      myNum++;

      //decrementing
      myNum = myNum - 1;
      myNum--;

      System.out.println(myNum);
      //System.out.println(newNum);



int x = 0;
int y = 1;
int z = 2;
x = y;
y = y * 2;
z = 3;
System.out.println(x);
System.out.println(y);
System.out.println(z);

//working with Scanner class and text input
      System.out.println("Greetings human! What is your name?");
      // Scanner scan = new Scanner(System.in);


      /*

Notes Oct 5th 2026:

Lesson 1.5 - Casting
Casting allows us to change from one data type to another

We cast using a "cast operator" written in () before our expression/data type
      
      */

      double doubleNum = 5.0;
      System.out.println((int)doubleNum/2); // you can't divide a string by an int you have to change the data type(turn into double) you have to cast it

// cast from a double to an int, it will truncate our double
// casting from an int to a double will just add ".0" to the end

//example:

      System.out.println((int) 4.3);
      System.out.println((double) 8);

      double number; // positive value from somewhere
      double negNumber; // negative value from somewhere

      number = 4.9;
      negNumber = -3.6;

      int nearestInt = (int)(number + 0.5);
      int nearestNegInt= (int)(negNumber - 0.5);

      System.out.println(nearestInt);
      System.out.println(nearestNegInt);


      // 1) declare and initialize grades
      int grade1 = 65;
      int grade2 = 97;
      int grade3 = 86;

      // 2) declare sum
      int sum;

      // 3) declare average as double
      double average;

      // 4) compute sum
      int sum = grade1 + grade2 + grade3;

      // 5) compute average with casting
      average = ((double) sum )/ 3;

      // 6) print result
      System.out.println(average);

      // Notes 10/6/2026

      //Lesson 1.6 Compound Assignment Operators

      //Conpound assignment operators always have the mth symbol first, and then the equal sign

      average = average + 1;
      average+= 1; // These two lines do the exact same thing 
      average ++; // Most condensed version only increments one or decrements by 1.
      System.out.println(average);

      // we can do compound operators with any number, not just 1.

      average -= 2;
      average --; //Most condensed version only increments one or decrements by 1.
      System.out.println(average);

      // Task

      int score = 0;
      System.out.println(score); // 0

      score++;                   // +1
      System.out.println(score); // 1

      score *= 2;                // ×2
      System.out.println(score); // 2

      int penalty = 5;
      score -= penalty / 2;      // 2 - (5/2) -> 2 - 2 -> 0 (integer division)
      System.out.println(score); // 0


      // 1) Add 3 to score using a compound operator
      // score ...

      score = score + 3;


      // 2) Divide score by 2 using a compound operator
      // score ...

// Notes October 9th, 2026

/* 
Precondition*:
before the method runs
      what must be true  
      
Postcondition*:
after the method runs
  what must be true  

*/

/*
Notes Oct/20/2026

Method: A named block of code that performs a task/process when it is called.
ex. our main method ---> public static void main(String []args){~~~~~~~}
These blocks of code that are named is any section enclosed in { }. These named blocks of code go by many names in different programming languages: functions, procedures, subroutines, etc. In Java they are called methods, as in a method of doing something.

Procedural Abstraction
Allowing a programmer to use a method without knowing exactly how it works, i.e. "abstracting away" the details.

*/


/*

Notes 10/22
Methods:
ex. methodname(){
 execute a task
} 
 
Method Signature/Header
When using methods in a library or API, we can look up the method signature/header) in its documentation.

A method header is the first line of a method that defines:

Method name
Return type (e.g., void means no return value)
Parameter list (variables and data types in parentheses; may be empty, but parentheses are required)

Parameters vs. Arguments
We can make methods even more powerful and more abstract by giving them parameters for data that they need to do their job. This allows values, or arguments, to be passed and used by a method.

A parameter (“formal parameter”) is a placeholder variable declared in the method header.
An argument (“actual parameter”) is the value passed into the method when called.
The argument must be compatible with the parameter’s data type.
Example:

Signature: println(String x) → parameter is String x
Call: println("Hello World"); → argument is "Hello World"

*/

/*
Notes 1.10 HW  Static Methods

Calling Static (Class) Methods
Most methods we've used so far are static methods, also called class methods. They are associated with the general class, meaning there is only one copy of the method.
Ex. A school wide event or rule, like a fire drill procedure, has one set of instructions that applies to everyone.
An instance(non static) method is like a student's personal schedule.

Class methods are associated with the class (not instances of the class which we will see in later lessons).

The main method is always static, there can only be one copy per Java class.

Class methods include the keyword static in the header before the method name.

Template for static method definition
// static method header
public static returnType methodName(parameters) {
    // method body
}

(Non) Void Methods
Void methods: Use the keyword void as the return type and do not return a value. They perform an action
Ex. Turn on the light

Non void methods: Return a value (output) based on the given arguments.
Ex. What's the temperature outside?

The return statement in a non void method:
Sends a value back(output)
Must return a data type that matches the method's return type in the method header.
Ends method execution immediately.

When calling a non void method, you must do something with the return value:
      
store the output in a variable, or use it in an expression directly

int y = calcArea(3,5); // store return value
System.out.println(y); 
System.out.println(calcArea(4,2)); // use directly

Common Errors with Non Void Methods
Forgetting to use the return value: Assign it to a variable or use it in an expression.
Mismatched types: The variable's type must match the method's return type.
Incorrect argument types/order: Match the method signature exactly.

Calling Methods from Another Class
When calling a method defined in the same class, use the method name.
When calling a method from a different class, include the class name.
Static (class) methods are typically called using the class name and the dot operator (.).




*/

 

   }
}
