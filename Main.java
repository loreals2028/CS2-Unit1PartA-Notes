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

*/

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
      System.out.println("It makes no sense to divide a number by zero!");
      System.out.println(3/0); //undefined cannot divided by 0 in Java//


   }
}
