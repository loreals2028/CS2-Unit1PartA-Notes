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

   }
}
