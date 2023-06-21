# Java-Programming
## Content
1. [Introduction](#introduction)
2. [Key Features](#key-features)
3. [Usage](#usage)
4. [Installation Link](#installation-link)
5. [How to Run](#how-to-run)
6. [Hello World](#helloworldjava-file)
7. [Mathematical Calculations](#mathematical_calculationsjava-file)
8. [If Program](#if_programjava-file)
9. [If Else Program](#if_else_programjava-file)
10. [else_if_programjava-file](#else_if_programjava-file)
11. [Switch Cases](#switch_casesjava-file)
12. [While Loop](#while_loopjava-file)
13. [Do While Loop](#do_while_loopjava-file)
14. [For Loop](#for_loopjava-file)
15. [Nested For Loops](#nested_for_loopsjava-file)
16. [For Each Loop](#for_each_loopjava-file)
17. [Single Dimensional Arrays](#single_dimensional_arraysjava-file)
18. [Multi Dimentional Arrays](#multi_dimentional_arraysjava-file)
19. [Type Casting](#type_castingjava-file)
20. [Mathematical Functions](#mathematical_functionsjava-file)
21. [Basic Classes & Objects](#basic_classes_objectsjava-file)
22. [Multiple Classes1 with Multiple Classes2](#multiple_classes1java-file-with-multiple_classes2java-file)
    - [Multiple Classes1](#multiple_classes1java-file)
    - [Multiple Classes2](#multiple_classes2java-file)
23. [Default Constructors](#default_constructorsjava-file)
24. [Parameterized Constructor](#parameterized_constructorjava-file)
25. [Strings](#stringsjava-file)
26. [Scopes](#scopesjava-file)
27. [Methods](#methodsjava-file)
28. [Parameterized Methods](#parameterized_methodsjava-file)
29. [Method Overloading](#method_overloadingjava-file)
30. [This Keyword Program](#this_keywordjava-file)
31. [Garbage Collector](#garbage_collectorjava-file)
32. [Finalize Method](#finalize_methodjava-file)
33. [String Buffer Classes](#string_buffer_classesjava-file)
34. [Vectors](#vectorsjava-file)
35. [Wrapper Classes](#wrapper_classesjava-file)
36. [Custom Wrapper Classes](#custom_wrapper_classesjava-file)
37. [Enum Inside Main Class](#enum_inside_main_classjava-file)
38. [Enum with Constants](#enum_with_constantsjava-file)
39. [Simple Inheritance](#simple_inheritancejava-file)
40. [Multiple Inheritance](#multi-level_inheritancejava-file)
41. [Hierarchical Inheritance](#hierarchical_inheritancejava-file)
42. [License](#license)

## Introduction
Java is a high-level, general-purpose programming language that was developed by Sun Microsystems (now owned by Oracle Corporation) and released in 1995.
It was designed to be platform-independent, robust, and secure, making it a popular choice for developing a wide range of applications.

## Key Features
1. Platform-Independence: Java programs can run on any platform with a Java Virtual Machine (JVM), which acts as an intermediary between the Java code and the underlying operating system. This "write once, run anywhere" capability allows Java applications to be developed on one platform and executed on another without modification.
2. Object-Oriented: Java is an object-oriented programming (OOP) language, which means it emphasizes the use of objects and classes to represent and manipulate data. It supports concepts such as encapsulation, inheritance, and polymorphism, making it suitable for building modular and extensible applications.
3. Garbage Collection: Java manages memory allocation and deallocation automatically through a process called garbage collection. Developers don't have to manually allocate or free memory, which helps simplify memory management and reduces the risk of memory leaks.
4. Robustness and Safety: Java incorporates features like strong type checking, exception handling, and automatic memory management to ensure the reliability and safety of programs. It includes built-in mechanisms to catch and handle runtime errors, preventing crashes and offering more robust applications.
5. Large Standard Library: Java comes with a comprehensive standard library that provides a wide range of pre-built classes and methods for common programming tasks. This library simplifies development by offering ready-to-use functionality for tasks like input/output operations, networking, database connectivity, and much more.
6. Wide Adoption and Community Support: Java has gained widespread popularity and has a large and active developer community. This means there are numerous resources, forums, and libraries available to help with learning Java and solving programming challenges.

## Usage
To write and run Java programs, you need to install the Java Development Kit (JDK), which includes the Java compiler (javac) for compiling Java source code into bytecode, and the Java Virtual Machine (JVM) for executing the bytecode.

Once installed, you can use any text editor or Integrated Development Environment (IDE) to write your Java code.
Following are the steps to run the code.

## Installation Link
JDK v1.8: [Chick Here](https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html)

## How to Run

1. Make sure you have JDK installed and configured on your system.
2. Download the file you like from this repository.
3. Open a command prompt or terminal and navigate to the directory where you saved the file.
4. Compile the Java file.
```
javac File_Name.java
```
6. Once the compilation is successful, run the program.
```
java File_Name
```
8. The program will execute and display the calculated results in the console.

### HelloWorld.java File

This Java program prints the message "Hello, World!" to the console.

- We created a class `HelloWorld`

Syntax:
```
public class ClassName {
//body of the class
}
```

- This class contains a main function `public static void main()`

Syntax:
```
public static void main(String args[]) {
//body of the main function
}
```

- This main function is the function from where our program starts its execution. This main function contains a predefined function `System.out.println()` which is used to print/display the output the screen.

Syntax:
```
System.out.println("");
```

#### Output

The program will output the following message,

![image](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/f880f504-e939-4282-a08d-a6094e174c37)

### Mathematical_Calculations.java File

This Java program performs basic mathematical calculations using two variables, `A` and `B`. The calculations include addition, subtraction, multiplication, and division. The results are printed to the console.

#### Output

The program will output the following mathematical calculations:

- The Sum of `A` and `B`
- The Difference of `A` and `B`
- The Product of `A` and `B`
- The Quotient of `A` and `B`
- The Modulo(Remainder) of `A` and `B`
- The Exponentiation(Power) of `A` and `B`
- The Square Roots of both `A` and `B` respectively

The output will be displayed in the console window.

![image](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/1fa999fa-e313-4d74-9258-9a94204a0860)

### If_Program.java File

This program demonstrates the usage of an `if` statement in Java.

- The program will check if the value of `x` is equal to 10.
- Print the values of `x` and `y` if the condition is true.

#### Syntax

```
if (condition) {
  // block of code to be executed if the condition is true
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/8a6c3cb2-6096-4a78-b3b3-ddeae600fea3)

### If_Else_Program.java File

This program demonstrates the usage of an `if-else` statement in Java.

- The program checks the value of `time`.
- Prints "Good Day" if it is less than 18.
- Otherwise prints "Good Evening".

#### Syntax

```
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/8bc9bf45-3ff1-45c1-9d1f-0262ddc83ad7)

### Else_If_Program.java File

This program demonstrates the usage of an `if-else if-else` statement in Java.

- The program checks the value of `time`.
- Prints "Good morning" if it is less than 10.
- Prints "Good day" if it is less than 18.
- Prints "Good evening" otherwise.

#### Syntax

```
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/f9cfde0d-a018-4bf3-a47a-955c25503b04)

### Switch_Cases.java File

This program demonstrates the usage of a `switch` statement in Java.

The program checks the value of `day` and prints the corresponding day of the week based on the value:
- If `day` is 1, it prints "Monday".
- If `day` is 2, it prints "Tuesday".
- If `day` is 3, it prints "Wednesday".
- If `day` is 4, it prints "Thursday".
- If `day` is 5, it prints "Friday".
- If `day` is 6, it prints "Saturday".
- If `day` is 7, it prints "Sunday".
- If `day` is none of the above, it prints "Please enter a number between 1-7".

The switch expression is evaluated once.
The value of the expression is compared with the values of each case.
If there is a match, the associated block of code is executed.
The break and default keywords are optional, and will be described later in this chapter.

#### Syntax

```
switch(expression) {
  case 1:
    // code block
    break;
  case 2:
    // code block
    break;
  case n:
    // code block
    break;
  default:
    // code block
    break;
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/a4681a4a-f73c-4186-926f-47d0b5435965)

### While_Loop.java File

This program demonstrates the usage of a `while` loop in Java.

The program uses a `while` loop to repeatedly print the value of `i` as long as it is less than 6:
- Initialize `i` to 1.
- While `i` is less than 6, print the value of `i`.
- Increment `i` by 1.

#### Syntax

```
while (condition) {
  // code block to be executed
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/6d668317-ec9a-46d6-97e9-07afa66f97cf)

### Do_While_Loop.java File

This program demonstrates the usage of a `do-while` loop in Java.

The program uses a `do-while` loop to repeatedly print the value of `i` as long as it is less than 5:
- Initialize `i` to 0.
- Print the value of `i`.
- Increment `i` by 1.
- Repeat the above steps until `i` is no longer less than 5.

#### Syntax

```
do {
  // code block to be executed
}
while (condition);
```

#### Output

![image](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/4ddcfda6-2dfe-4a0c-b6a1-239c73955330)

### For_Loop.java File

This program demonstrates the usage of a `for` loop in Java.

The program uses a `for` loop to iterate from 0 to 4 and prints the value of `i` on each iteration:
- Initialize the variable `i` to 0.
- Repeat the loop as long as `i` is less than 5.
- Print the value of `i`.
- Increment the value of `i` by 1.

#### Syntax

```
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/d1b7b685-6368-463e-91f4-7640c5aac07c)

### Nested_For_Loops.java File

This program demonstrates the usage of nested `for` loops in Java.

The program uses nested `for` loops to print a sequence of numbers:
- The outer loop iterates from 0 to 2.
- On each iteration of the outer loop, it prints the current value of `i`.
- The inner loop iterates from 1 to 3.
- On each iteration of the inner loop, it prints the current value of `j`.

#### Syntax

```
for (initialization; condition; update) {
    // Outer loop statements

    for (initialization; condition; update) {
        // Inner loop statements
    }
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/93863cbb-e2da-4c52-a6c0-fbf9cf11b63d)

### For_Each_Loop.java File

This program demonstrates the usage of a for-each loop (enhanced for loop) in Java.

The program uses a for-each loop to iterate over each element in an array of cars and prints them:
- Declare and initialize a String array named `cars` with some car names.
- Use the for-each loop syntax to iterate over each element in the `cars` array.
- Print each car name using `System.out.println()`.

#### Syntax

```
for (type variableName : arrayName) {
  // code block to be executed
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/8f8542e2-4e32-478d-8fe8-202b4104512f)

### Single_Dimensional_Arrays.java File

This program demonstrates the usage of single dimensional arrays in Java.

The program showcases different aspects of single dimensional arrays:
- It creates a String array named `cars` with pre-defined car names.
- Prints them using individual `System.out.println()` statements.
- It modifies the first element of the `cars` array to "Opel".

Sntax:
```
arrayName[index] = newValue;
```
- Prints the updated array.
- It determines the length of the `cars` array using the `length` property.

Sntax:
```
arrayName.length;
```
- It creates a String array named `fruits`.
- Iterates over its elements using a traditional `for` loop.
- It creates an integer array named `numbers`.
- Iterates over its elements using a for-each loop.

Syntax within for loop or for-each loop:
```
arrayName[index];
```

#### Syntax
```
dataType[] arrayName;
```
OR
```
dataType arrayName[];
```
OR
```
arrayName = new dataType[arraySize];
```
OR
```
dataType[] arrayName = {value1, value2, value3, ...};
```
#### Output

![image](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/d1ada345-b5d2-4e75-9e43-c0cb2eea01d9)

### Multi_Dimentional_Arrays.java File

This program demonstrates the usage of multi-dimensional arrays in Java.

The code initializes multi-dimensional arrays and performs various operations on them.

- The `myNumbers` array is a two-dimensional array of integers, initialized with pre-defined values.
- The program iterates over the elements in the `myNumbers` array using nested `for` loops and prints each element.
- It demonstrates accessing and modifying a specific element in the `myNumbers` array.
- The program prints the `myNumbers` array after modifying the accessed element.
- The `myColors` array is a two-dimensional array of strings, initialized with pre-defined color names.
- The program iterates over the elements in the `myColors` array using nested `for` loops and prints each element.

#### Syntax

```
dataType[][] arrayName = { {value1, value2, value3,...}, {value4, value5, value6,...} };
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/21a23cad-d6f7-4957-a6ff-3afbcc335b6c)

### Type_Casting.java File

This Java program demonstrates implicit and explicit type casting between `int` and `double` data types.
The program will output the original values and the type-casted values, demonstrating the process of type casting.

#### Syntax

For both Implicit and Explicit Castings
```
destinationType variableName = (destinationType) sourceValue;
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/c6693286-15a1-4947-ac86-a336431421c3)

### Mathematical_Functions.java File

This Java program demonstrates various mathematical functions available in the `Math` class.

The program will output the results of different mathematical functions such as:
- Finding the minimum number. 
- Finding the maximum number.
- Finding the square root.
- Finding the absolute value.
- Random number generation.
- Finding the exponential value.
- Rounding of numbers.

#### Syntax

- Finding the minimum number.
  ```
  <dataType> variableName = Math.min(intVal1,intVal2);
  ```
- Finding the maximum number.
  ```
  <dataType> variableName = Math.max(intVal1,intVal2);
  ```
- Finding the square root.
  ```
  <dataType> variableName = Math.sqrt(intVal1);
  ```
- Finding the absolute value.
  ```
  <dataType> variableName = Math.abs(intVal1);
  ```
- Random number generation.
  ```
  <dataType> variableName = Math.random();
  ```
- Finding the exponential value.
  ```
  <dataType> variableName = Math.exp(intVal1);
  ```
- Rounding of numbers.
  ```
  <dataType> variableName = Math.round(doubleVal1);
  
  <dataType> variableName = Math.ceil(doubleVal1);
  
  <dataType> variableName = Math.floor(doubleVal1);
  
  <dataType> variableName = Math.rint(doubleVal1);
  ```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/2de60d73-3c71-4f32-85be-c2785a9c15ee)

### Basic_Classes_Objects.java File

This Java program demonstrates the usage of basic classes and objects.

- The program creates two objects of the `Basic_Classes_Objects` class
- Accesses the value of the variable `x` from each object.
- It demonstrates how objects can have their own independent copies of instance variables.
- It also determines that, are the objects instances of the classes.

#### Syntax

```
// Class declaration
class ClassName {
    // Class members (fields, methods, constructors, etc.)
    // ...
}

// Creating an object of the class
ClassName objectName = new ClassName();
```

Instance Of:
```
myObj instanceof Main;
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/ea1c8147-2762-4577-ad84-1d6f19823f2e)

### Multiple_Classes1.java File with Multiple_Classes2.java File

#### Multiple_Classes1.java File

This Java program demonstrates the use of multiple classes in Java.

- The program consists of a class `Multiple_Classes1`.
- It is the main class that contains the entry point of the program.
- It declares an instance variable `x` with a value of 5.

#### Multiple_Classes2.java File

This Java program demonstrates the use of multiple classes in Java.

The program consists of two classes: `Multiple_Classes1` and `Multiple_Classes2`.

- `Multiple_Classes1` declares an instance variable `x` with a value of 5.
- `Multiple_Classes2` is the main class that contains the entry point of the program.
- It creates an object of `Multiple_Classes1` and accesses the variable `x` from it.

The program demonstrates how you can access variables from one class in another class by creating objects and using the dot notation.

#### Syntax

```
// MainClass.java

// Import statements (if necessary)
// ...

// First class declaration
class FirstClass {
    // Class members (fields, methods, constructors, etc.)
    // ...
}

// Second class declaration
class SecondClass {
    // Class members (fields, methods, constructors, etc.)
    // ...
}

// Main class (containing the main method)
public class MainClass {
    public static void main(String[] args) {
        // Main method code
        // ...
    }
}
```
OR
```
//MainClass.java

public class MainClass {
  // Class members (fields, methods, constructors, etc.)
}
```
```
//SubClass.java

public class SubClass {
  public static void main(String[] args) {
  // Acessing the class members of MainClass
  ClassName ObjectName = new ClassDefualtConstructor();
  }
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/4fbf87d0-7073-41df-a3d7-1fd8b47ee9f7)

### Default_Constructors.java File

This Java program demonstrates the usage of a default constructor in a class.

- The program defines a class `Defualt_Constructors` with an instance variable `x` and a default constructor.
- The default constructor initializes `x` with a value of 5.
- The program creates an object of the `Defualt_Constructors` class
- Prints the value of `x` fetched from the constructor.

#### Syntax
```
public Constructors() {
// Constructor body
   }
```
AND
```
Constructors myConstructors = new Constructors();
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/7f84300c-a8ec-4986-b139-c67666fe7c25)

### Parameterized_Constructor.java File

This Java program demonstrates the usage of parameterized constructors in a class.

The program defines a class `Parameterized_Constructors` with two instance variables:
- `modelYear` and `modelName`. It also defines a parameterized constructor that takes `year` and `name` as input parameters.
- Assigns them to the corresponding instance variables.
- The program creates an object of the `Parameterized_Constructors` class by passing values to the constructor.
- It then prints the car's model year and name.

#### Syntax
```
public class ClassName {
    // Member variables
    
    // Parameterized constructor
    public ClassName(parameter1, parameter2, ...) {
        // Constructor body
        // Initialize member variables with the provided parameters
    }

    // Other methods and code

    public static void main(String[] args) {
        // Create objects and use the constructor
    }
}
```
AND
```
public ClassName(parameter1, parameter2, ...) {
    // Constructor body
    // Initialize member variables with the provided parameters
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/13a2516c-7ad2-40e2-92bf-0f836b33a7cb)

### Strings.java File

This Java program demonstrates the usage of strings in Java.

The program showcases various operations and manipulations on strings:

- It initializes and prints a string variable `greeting`.
- It calculates and prints the length of the string using the `length()` method.
- It converts the string to upper case using `toUpperCase()` and prints the result.
- It converts the string to lower case using `toLowerCase()` and prints the result.
- It locates the index of a character using `indexOf()` and prints the result.
- It concatenates strings using the `+` operator and the `concat()` method.
- It demonstrates the difference between using numbers as integers and strings when performing addition.
- It showcases the usage of special characters in strings, such as backslash, double quote, single quote, and others.

#### Syntax

Length:
```
str.length();
```

To Upper Case:
```
str.toUpperCase();
```

To Lower Case:
```
str.toLowerCase();
```

Index Of:
```
str.indexOf("");
```

Concatenation:
```
str1.concat(str2);
```
OR
```
String result = str1 + str2;
```

Special Characters:
```
\n
```
```
\t
```
```
\r
```
```
\f
```
```
\b
```
AND
```
\'
```
```
\"
```
```
\\
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/811b357c-7a72-4887-98fe-5a04f8248c92)

### Scopes.java File

This Java program demonstrates the concept of scopes in Java.

The program showcases different scopes of variables in Java:

- It attempts to print the value of `x` before declaring and initializing it, but encounters an error because the variable is not defined at that point.
- It declares and initializes the variable `x` with a value of 10 and then prints its value.
- It attempts to print the value of `y` outside of its block and encounters an error because the variable is not accessible outside of the block where it is declared.
- It declares and initializes the variable `y` with a value of 100 inside a block and then prints its value.

By running the program, you can observe how variables have different scopes and can only be accessed within their respective scopes.

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/e170ba30-57a7-478b-8cbc-9fa351d323ca)

### Methods.java File

This Java program demonstrates the usage of methods in Java.

The program defines a method `myMethod()` that prints a message when called. It also contains the `main()` method where the program execution starts.

The program showcases the following:

- It prints a message outside of any method call.
- It calls the `myMethod()` method, which prints a message inside the method.
- It prints a message outside of the method call again.

By running the program, you can observe how methods allow you to encapsulate a block of code that can be executed at different points in the program.

#### Syntax

```
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/13e75db7-77e7-4078-bfe8-84d27682498a)

### Parameterized_Methods.java File

This Java program demonstrates the usage of parameterized methods in Java.

The program defines a parameterized method `myMethod()` that takes a string parameter `fname` and prints a message with the provided name.

The program showcases the following:

- It calls the `myMethod()` method multiple times, passing different names as arguments.
- The method prints a message with the provided name.

By running the program, you can observe how parameterized methods allow you to pass data as arguments and perform specific actions based on the provided values.

#### Syntax

```
public class MyClass {
    public static void myMethod(Parameter1, Parameter2,...) {
        // Method body
    }
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/ef45a15a-2f92-4e7f-962a-9f5a234a12cd)

### Method_Overloading.java File

This Java program demonstrates the concept of method overloading in Java.

The program defines two methods named `plusMethod()` that have the same name but different parameter types. One method accepts two integers as parameters, while the other method accepts two doubles. Both methods return the sum of the provided numbers.

The program showcases the following:

- It calls the `plusMethod()` method twice, providing different arguments each time.
- The method with integer parameters returns an integer sum, while the method with double parameters returns a double sum.

By running the program, you can observe how method overloading allows you to define multiple methods with the same name but different parameter types, enabling more flexible and convenient method usage.

#### Syntax

```
int myMethod(int x)
{
// body of the method
}
```
```
float myMethod(float x)
{
// body of the method
}
```
```
double myMethod(double x, double y)
{
// body of the method
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/38dae08c-6be3-4812-8615-a48af0bb0a24)

### This_Keyword.java File

The this keyword is used in Java to refer to the current object. It is particularly useful when there is a need to differentiate between instance variables and method parameters or local variables that have the same name.

The This_Keyword class has:
- A private instance variable x.
- A constructor that takes an integer parameter x.
- Inside the constructor, the this keyword is used to assign the parameter value to the instance variable.

#### Syntax
```
this.variableName
```
AND
```
this(arguments)
```
AND
```
methodName(this)
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/d8666ddb-e5d1-4f6c-9dad-a1dcc587fe2f)

### Garbage_Collector.java File

This program demonstrates the use of the garbage collector in Java.

Objects that are no longer referenced are eligible for garbage collection.
The JVM automatically reclaims the memory occupied by these objects to free up resources.
The finalize() method is called by the garbage collector before an object is garbage collected.

- The Garbage_Collector class overrides the finalize() method to print a message when garbage collection is performed by the JVM.
- In the main() method, two Garbage_Collector objects s1 and s2 are created.
- After setting both objects to null, the System.gc() method is called to request garbage collection.
- The JVM decides when to actually perform garbage collection.

#### Syntax

```
System.gc();
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/72605e8f-4219-4f53-ae35-68723aabc24b)

### Finalize_Method.java File

This program demonstrates the usage of the finalize() method in Java.

The finalize() method is a special method that is called by the garbage collector before an object is garbage collected.
It gives the object an opportunity to perform any necessary cleanup actions.

The Finalize_Method class overrides the finalize() method to print a message when the finalize() method is called.

In the main() method:
- A Finalize_Method object objFinalize_Method is created.
- After setting objFinalize_Method to null, the System.gc() method is called to request garbage collection.
- The JVM decides when to actually perform garbage collection.

#### Syntax

```
protected void finalize() {
    // Code to be executed before object is garbage collected
    // ...
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/59c913f2-e1b2-4698-9e7b-0a9e7fa15966)

### String_Buffer_Classes.java File

This program demonstrates the usage of the StringBuffer class in Java.

The StringBuffer class is used to create mutable sequences of characters. It provides various methods to modify and manipulate strings.

In the main() method, several StringBuffer objects (sb, sb1, sb2, sb3, sb4) are created and used to perform various operations:

- append(): Appends the specified string to the StringBuffer object.
- insert(): Inserts the specified string at the specified position in the StringBuffer object.
- replace(): Replaces the characters in a substring of the StringBuffer object with the specified string.
- delete(): Deletes a substring from the StringBuffer object.
- reverse(): Reverses the characters in the StringBuffer object.

The program also demonstrates the capacity-related methods of the StringBuffer class:
- capacity(): Returns the current capacity of the StringBuffer object.
- ensureCapacity(): Increases the capacity of the StringBuffer object if it is less than the specified minimum capacity.

#### Syntax
- append():
  ```
  sb.append(str);
  ```
- insert():
  ```
  sb.insert(offset,str);
  ```
- replace():
  ```
  sb.replace(start,end,str);
  ```
- delete():
  ```
  sb.delete(start,end);
  ```
- reverse():
  ```
  sb.reverse();
  ```
- capacity():
  ```
  sb.capacity();
  ```
- ensureCapacity():
  ```
  sb.ensureCapacity(minimumCapacity);
  ```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/0531746d-a493-40df-9d8d-a1381738f844)

### Vectors.java File

This program demonstrates the usage of the Vector class in Java.

The Vector class is a dynamic array that provides methods to add, remove, and manipulate elements. It is similar to an ArrayList but has synchronized methods, making it thread-safe.

In the main() method, several Vector objects (vec, vec1, in) are created and used to perform various operations:

- add(): Adds elements to the Vector object.
- addElement(): Adds elements to the Vector object (deprecated method).
- size(): Returns the size (number of elements) of the Vector object.
- capacity(): Returns the current capacity of the Vector object.
- contains(): Checks if a specific element is present in the Vector object.
- indexOf(): Returns the index of the first occurrence of a specific element in the Vector object.
- firstElement(): Returns the first element of the Vector object.
- lastElement(): Returns the last element of the Vector object.
- remove(): Removes the first occurrence of a specific element from the Vector object.
- removeElementAt(): Removes an element at a specific index from the Vector object.
- hashCode(): Returns the hash code of the Vector object.
- get(): Returns the element at a specific index in the Vector object.

#### Syntax
- add():
  ```
  vec.add(str);
  ```
- addElement():
  ```
  vec.addElement(str);
  ```
- size():
  ```
  vec.size();
  ```
- capacity():
  ```
  vec.capacity();
  ```
- contains():
  ```
  vec.contains(str);
  ```
- indexOf():
  ```
  vec.indexOf(str);
  ```
- firstElement():
  ```
  vec.firstElement();
  ```
- lastElement():
  ```
  vec.lastElement();
  ```
- remove():
  ```
  vec.remove((Integer)vectorElementName);
  ```
  AND
  ```
  vec.remove(index);
  ```
- removeElementAt():
  ```
  vec.removeElementAt(index);
  ```
- hashCode():
  ```
  vec.hashCode();
  ```
- get():
  ```
  vec.get(index);
  ```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/41c7cd37-dfda-4f3d-afe9-5f693ce8a56f)

### Wrapper_Classes.java File

This program demonstrates the conversion between primitive types and their corresponding wrapper classes in Java.

The Wrapper_Classes class contains a main() method:
- Demonstrates the conversion between primitive types (int, byte, short, long, float, double, char, boolean) and their respective wrapper classes (Integer, Byte, Short, Long, Float, Double, Character, Boolean).
- Converting from primitive types to wrapper classes.
- Converting from wrapper classes to primitive types.

#### Syntax

1. Converting Wrapper Class to Primitive Type:
    ```
    WrapperClass obj = new WrapperClass(value);
    PrimitiveType var = obj. primitiveValue();
    ```
2. Converting Primitive Type to Wrapper Class:
    ```
    PrimitiveType var = value;
    WrapperClass obj = WrapperClass.valueOf(var);
    ```
3. Autoboxing (Automatic Conversion of Primitive Type to Wrapper Class):
    ```
    WrapperClass obj = value;
    ```
4. Unboxing (Automatic Conversion of Wrapper Class to Primitive Type):
    ```
    PrimitiveType var = obj;
    ```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/c6f27d37-4955-45d8-aa55-31260672ab88)

### Custom_Wrapper_Classes.java File

This program demonstrates the implementation of a custom wrapper class in Java.

- The CustomWrapper class is a custom wrapper class that wraps an int value.
- It provides methods to get and set the value, as well as override the toString() method to convert the value to a string representation.
- The Custom_Wrapper_Classes class contains the main() method, which creates an instance of the CustomWrapper class and assigns a value to it.
- It then prints the value using the System.out.println() statement, which internally calls the toString() method of the CustomWrapper class.

#### Syntax

There is no specific syntax for custom wrapper classes in Java, as the concept of wrapper classes is primarily associated with the built-in Java wrapper classes (Integer, Double, Boolean, etc.) that wrap primitive types.

However, you can create your own custom wrapper class by following these general guidelines:

1. Define a class that represents the custom wrapper.
2. Declare a private variable to hold the wrapped value.
3. Provide constructors to initialize the wrapper with a value.
4. Implement getter and setter methods to access and modify the wrapped value.
5. Optionally, override the toString() method to provide a string representation of the wrapped value.

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/01d8b507-d341-4006-b1f5-e9dd0f274d99)

### Enum_Inside_Main_Class.java File

This program demonstrates the implementation of a custom wrapper class in Java.

The CustomWrapper class is a custom wrapper class that wraps an int value.
- It provides methods to get and set the value, as well as override the toString() method to convert the value to a string representation.
- The Custom_Wrapper_Classes class contains the main() method, which creates an instance of the CustomWrapper class and assigns a value to it.
- It then prints the value using the System.out.println() statement, which internally calls the toString() method of the CustomWrapper class.

#### Syntax

```
enum enumName { constant1, constant2, constant3,... }
```
OR
```
enum enumName { constant1, constant2, constant3,...; }
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/c7e76696-b819-441f-b41a-ab2a9bf99664)

### Enum_With_Constants.java File

This program demonstrates the usage of enums with constants in Java.

- The Season enum represents different seasons, such as WINTER, SPRING, SUMMER, and FALL. Each season is associated with a numeric value.
- The enum declares a private variable value and provides a constructor to assign the value for each season.
- The Enum_With_Constants class contains the main() method, which iterates over all the values of the Season enum using the Season.values() method.
- It then prints each season along with its associated value using the System.out.println() statement.

#### Syntax

```
enum enumName {
        constant1(value), constant2(value), constant3(value)...;

        private int varaibleName;

        private constructorName(int variableName) {
            this.variableName = variableName;
        }
    }
```
#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/ad1875db-e1b4-470e-a4bd-24e85bf8e332)

### Simple_Inheritance.java File

This program demonstrates simple inheritance in Java.

- The Employee class represents an employee and has a salary variable that is calculated as the product of 34534 and 12.
- The Simple_Inheritance class extends the Employee class and adds a bonus variable that is calculated as the product of 3000 and 6.
- In the main() method of the Simple_Inheritance class, an object of the Simple_Inheritance class is created. The salary and bonus values are accessed using the object and printed using the System.out.println() statement.

#### Syntax
```
class Child extends Father   
{  
//functionality   
}  
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/1717bc1b-7509-4aee-af05-71926a4be052)

### Multi-level_Inheritance.java File

This program demonstrates multiple inheritance in Java.

The program defines three classes: Student, Marks, and Sports. Each class inherits from the previous class:
- The Student class has an instance variable reg_no and methods getNo() and putNo() to set and display the registration number.
- The Marks class extends the Student class and adds an instance variable marks and methods getMarks() and putMarks() to set and display the marks.
- The Sports class extends the Marks class and adds an instance variable score and methods getScore() and putScore() to set and display the score.
- In the main() method of the Multiple_Inheritance class, an object of the Sports class is created.
- The getNo(), getMarks(), and getScore() methods are called to set the values of reg_no, marks, and score, respectively.
- Then, the putNo(), putMarks(), and putScore() methods are called to display the values.

#### Syntax
```
class Child extends Father   
{  
//functionality   
}  
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/ae0820fd-43be-4fd7-88ab-ae21a4dc6d07)

### Hierarchical_Inheritance.java File

This program demonstrates hierarchical inheritance in Java.

The program defines four classes: Student1, Science, Commerce, and Arts. Each class extends the Student1 class:
- The Student1 class has a method methodStudent1() which prints a message indicating that the method of the Student class is invoked.
- The Science class extends the Student1 class and adds a method methodScience() which prints a message indicating that the method of the Science class is invoked.
- The Commerce class extends the Student1 class and adds a method methodCommerce() which prints a message indicating that the method of the Commerce class is invoked.
- The Arts class extends the Student1 class and adds a method methodArts() which prints a message indicating that the method of the Arts class is invoked.
- In the main() method of the Hierarchical_Inheritance class, objects of the Science, Commerce, and Arts classes are created.
- The methodStudent1() method is called on each object to demonstrate that the inherited method from the Student1 class is accessible.

#### Syntax
```
// Base class
class Parent {
    // Fields and methods of the Parent class
}

// Child class 1 inheriting from Parent class
class Child1 extends Parent {
    // Fields and methods of Child1 class
}

// Child class 2 inheriting from Parent class
class Child2 extends Parent {
    // Fields and methods of Child2 class
}

// Child class 3 inheriting from Parent class
class Child3 extends Parent {
    // Fields and methods of Child3 class
}

// Main class
class Main {
    public static void main(String[] args) {
        // Create objects of Child classes and access their members
        Child1 obj1 = new Child1();
        obj1.method1(); // Call method1 of Child1 class

        Child2 obj2 = new Child2();
        obj2.method2(); // Call method2 of Child2 class

        Child3 obj3 = new Child3();
        obj3.method3(); // Call method3 of Child3 class

        // Create object of Parent class and access its members
        Parent obj = new Parent();
        obj.method(); // Call method of Parent class
    }
}
```

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/8defed8b-a840-48b9-9ae1-ac9686020537)

## License

This project is licensed under the [MIT License](LICENSE).

![Thankyou](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/a267e3dd-26ac-4472-9c3e-54d8e0425868)
