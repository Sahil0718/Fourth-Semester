//SUM OF TWO NUMBERS IN JAVA
package practise;
// public class LAB {

//   int first_number = 5 , second_number = 5; 
//   int result = first_number+second_number;
//     public static void main(String[] args) {
//         LAB add = new LAB();
//         System.out.println("THE SUM OF TWO NUMBERS IS: " + add.result);
//     }
// 
/*
class Test {
  public static void main(String args[]) {
    int x = 10;
    int y = 010;
    int z = 0x10;
    System.out.println("Integer value of x: " + x +" "+ "Integer value of y: " + y +" "+ "Integer value of z:" + z);
  }
}
*/

import java.util.Scanner;

class Sum {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int a, b;
    System.out.println("ENTER THE FIRST NUMBER: ");
    a = scan.nextInt();
    System.out.println("ENTER THE SECOND NUMBER:");
    b = scan.nextInt();
    int sum = a + b;
    System.out.println("THE SUM OF TWO NUMBERS IS: " + sum);

    scan.close();
  }
}

class OPERATOR {
  public static void main(String[] args) {
    System.out.println('x' + 'z');
    System.out.println('a' + 1);
    System.out.println('a' + 1.02); // ASCII value gets added.
  }
}

class DIVISION {
  public static void main(String[] args) {
    // char ch = 'a';
    // ch++;
    // System.out.println(ch);
    // byte b = 10;
    // b++;
    // b = (byte) b+1; //cannot convert integer type to integer type.
    // b = (byte)(b+1);
    // System.out.println(b);
    // double d = 10.5;
    // d++;
    // System.out.println(d);
    // System.out.println(10/0); //throws exception /by zero.
    // System.out.println(10/0.0); //result is infinity.
    // System.out.println(0/0); //throws an exception /by zero.
    // System.out.println(0.0/0.0); //result is not a number.
    // System.out.println(10<10.5);
    // System.out.println('a'>10);
    // System.out.println('b'>'a');
    // System.out.printlnn(true>false); //throws error because it is not defined
    // which is greater.
    // System.out.println(10>20>30); 10>20 is false and false>30 is error.
    // System.out.println('a' == 'b'); //result is false
    // System.out.println('a' == 97.0); //result is true
    // System.out.println(false == false); //result is true because equal cha chaina
    // bhane chehi check garna milcha
  }
}

class LogicalAndExample {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    if (a > 10 && b > 20) { // && is the short circuit logical operator //is first part is false then the
                            // logical and never checks the second part, verify nai gardaina
      System.out.println("NEPAL");
    } else {
      System.out.println("HELLO");
    }
  }
}

// WAP TO ENTER THE NUMBERS AND FIND ITS SUM
class Numbers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int anyNumber;
    int N;
    int Sum = 0;
    System.out.println("ENTER THE NUMBER: ");
    anyNumber = scan.nextInt();

    while (anyNumber != 0) {
      N = anyNumber % 10;
      Sum += N;
      anyNumber = anyNumber / 10;
    }
    System.out.println("THE SUM OF DIGITS IS: " + Sum);
    scan.close();
  }
}

// CALCULATING THE AREA OF A CIRCLE

class Circle {
  int radius;
  double area;

  int getData() {
    Scanner scan = new Scanner(System.in);
    System.out.println("ENTER THE RADIUS OF CIRCLE: ");
    radius = scan.nextInt();
    scan.close();
    return radius;
  }

  double calcArea() {
    area = Math.PI * radius * radius;
    return area;
  }

  void display() {
    System.out.printf("THE AREA OF A CIRCLE IS: %.2f", area);
  }

  public static void main(String[] args) {
    Circle c = new Circle();
    c.getData();
    c.calcArea();
    c.display();
  }
}

// WAP TO COMPUTE SQUARE OF A NUMBER USING CLASS NAMED SQAURE THAT CONTAINS A
// METHOD NAME SQUARE() WITH A PARAMETER

class Square {
  void square(int number) {
    int power;
    power = (int) Math.pow(number, 2);
    System.out.println("THE RESULT IS: " + power);

  }

  public static void main(String[] args) {
    int pow;
    Scanner scan = new Scanner(System.in);
    System.out.println("ENTER THE NUMBER TO SQUARE: ");
    pow = scan.nextInt();
    Square S = new Square();
    S.square(pow);

    scan.close();
  }
}