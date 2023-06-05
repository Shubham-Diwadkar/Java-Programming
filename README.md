# JAVA-Experiment

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
class HelloWorld {
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

## License

This project is licensed under the [MIT License](LICENSE).

![Thankyou](https://github.com/Shubham-Diwadkar/JAVA-EXPERIMENT/assets/125255910/a267e3dd-26ac-4472-9c3e-54d8e0425868)
