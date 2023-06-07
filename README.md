# Java-Programming

Java is a popular programming language, created in 1995.
It is owned by Oracle, and more than 3 billion devices run Java.

Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.).
It is one of the most popular programming language in the world.
It is easy to learn and simple to use.
It is open-source and free.
It is secure, fast and powerful.
It has a huge community support (tens of millions of developers).
Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs.
As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa.

## Uses
- Mobile applications (specially Android apps)
- Desktop applications
- Web applications
- Web servers and application servers
- Games
- Database connection and much more!

## Prerequisites

To run this program, you need to have Java Development Kit (JDK) installed on your machine. If you don't have JDK installed, you can download it from the official Oracle website: [Java SE Development Kit Downloads](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html)

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

#### Output

![image](https://github.com/Shubham-Diwadkar/Java-Programming/assets/125255910/b2d019d9-8926-4631-ba0a-7f96e1de43a1)

## License

This project is licensed under the [MIT License](LICENSE).

![Thankyou](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/a267e3dd-26ac-4472-9c3e-54d8e0425868)
