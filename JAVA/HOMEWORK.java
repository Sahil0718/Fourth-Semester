
//HOMEWORK 1
package practise;

import java.util.Scanner; //Scanner utility package is necessary for asking input from users.

class HOMEWORK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE PRINCIPLE AMOUNT: ");
        float principal = scanner.nextFloat();
        System.out.println("ENTER THE TIME: ");
        float time = scanner.nextFloat();
        System.out.println("ENTER THE RATE: ");
        float rate = scanner.nextFloat();
        float simpleInterest = (float) (principal * rate * time) / 100;
        System.out.println("THE SIMPLE INTEREST IS: " + simpleInterest);
        scanner.close();
    }
}

class HOMEWORK2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS OF A CIRCLE: ");
        float radius = scanner.nextFloat();
        float areaOfCircle = (float) (Math.PI * radius * radius);
        float perimeter = (float) (2 * Math.PI * radius);
        System.out.println("THE AREA OF CIRCLE IS:" + areaOfCircle);
        System.out.println("THE PERIMETER OF A CIRCLE IS:" + perimeter);
        scanner.close();
    }
}

// WAP that calls a function called getArea(). This function is respondible for
// reading the length and breadth and print the area of rectangle

class HOMEWORK3 {
    static void getArea(float length, float breadth) {
        float area = length * breadth;
        System.out.println("THE AREA OF RECTANGLE IS: " + area);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float l;
        float b;
        System.out.println("ENTER THE LENGTH OF RECTANGLE: ");
        l = scan.nextFloat();
        System.out.println("ENTER THE BREADTH OF RECTANGLE: ");
        b = scan.nextFloat();
        getArea(l, b);
        scan.close();
    }

}

// WAP that calls a function named interest(). This function takes the values of
// principal , number of years and rate of interest & returns the calculated
// interest.

class Homework4 {
    static void interest(float principal, float time, float rate) {
        float calculatedInterest = (principal * time * rate) / 100;
        System.out.println("THE CALCULATED INTEREST IS: " + calculatedInterest);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float P;
        float T;
        float R;
        System.out.println("ENTER THE PRINCIPAL: ");
        P = scan.nextFloat();
        System.out.println("ENTER THE TIME: ");
        T = scan.nextFloat();
        System.out.println("ENTER THE RATE: ");
        R = scan.nextFloat();
        interest(P, T, R);
        scan.close();
    }
}

class RECTANGLE { // Homework 3 using constructor
    // this is the instance variable
    float l;
    float b;

    public RECTANGLE() {
        // this is a default constructor
    }

    public RECTANGLE(float length, float breadth) { // user-defined or argument constructor
        l = length;
        b = breadth;
    }

    public void getArea() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF RECTANGLE: ");
        l = scan.nextFloat();
        System.out.println("ENTER THE BREADTH OF RECTANGLE: ");
        b = scan.nextFloat();
        scan.close();
    }

    public void print() { // printing the area of rectangle
        float area = l * b;
        System.out.println("THE AREA OF RECTANGLE IS: " + area);
    }

    // calling the functions
    public static void main(String[] args) {
        RECTANGLE R = new RECTANGLE();
        R.getArea();
        R.print();
    }

}

class Interest {
    float principle;
    float time;
    float rate;

    public Interest() {
        // default constructor
    }

    public Interest(float p, float t, float r) { // constructor having arguments
        principle = p;
        time = t;
        rate = r;
    }

    public void getTheData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE PRINCIPLE AMOUNT: ");
        principle = scan.nextFloat();
        System.out.println("ENTER THE TIME: ");
        time = scan.nextFloat();
        System.out.println("ENTER THE RATE: ");
        rate = scan.nextFloat();
        scan.close();
    }

    public void printData() {
        float calculatedinterest = (principle * time * rate) / 100;
        System.out.println("THE CALCULATED INTEREST WILL BE: " + calculatedinterest);
    }

    public static void main(String[] args) {
        Interest I = new Interest();
        I.getTheData();
        I.printData();
    }

}

// WAP that asks the name of the student and marks obtained by him\her in 5
// subjects.
// Display the percentage of the student assuming full marks 100 for each
// subjects.

class Student {
    public void getData(String name, float marks) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOU NAME:");
        name = scan.nextLine();
        for (int i = 1; i <= 5; i++) {
            System.out.println("ENTER THE MARKS OF " + i + " SUBJECTS:");
            marks += scan.nextFloat();
        }
        System.out.println("YOUR NAME IS: " + name);
        System.out.println("THE TOTAL PERCENTAGE THAT YOU OBTAINED IS: " + (marks / 500) * 100);
        scan.close();

    }

    public static void main(String[] args) {
        Student S = new Student();
        S.getData(null, 0);

    }
}

// WAP TO READ A NUMBER AND PRINT WHETHER THE NUMBER IS EVEN OR ODD

class Number {
    public void evenOrOdd(int number) {
        if (number % 2 == 0)
            System.out.println("THE NUMBER IS EVEN!");
        else {
            System.out.println("THE NUMBER IS ODD!");
        }
    }

    public static void main(String[] args) {
        int evenOdd;
        Number N = new Number();
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT TO TEST: ");
        evenOdd = scan.nextInt();
        N.evenOrOdd(evenOdd);
        scan.close();
    }
}

// WAP TO FIND WHETHER THE GIVEN NUMBER IS POSITIVE OR NEGATIVE

class NegativeOrPositive {
    public static void main(String[] args) {
        float number;
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER FOR CHECKING: ");
        number = scan.nextFloat();
        if (number >= 0)
            System.out.println(number + " NUMBER IS POSITIVE!");
        else
            System.out.println(number + " NUMBER IS NEGATIVE!");
        scan.close();

        int a[] = new int[10];
        for (int i = 0; i < 7; i++) {
            a[i] = i * 5;
        }
        // for (data type variable : array[list] );
        for (int b : a) {
            System.out.println(b);
        }
    }
}

// WAP TO FIND SUM OF ODD NUMBERS AND EVEN NUMBERS FROM 1 to 100

class OneToHundred {
    public void for_Numbers() {
        int even_Sum = 0;
        int odd_Sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                odd_Sum += i;
            } else if (i % 2 == 0) {
                even_Sum += i;
            }
        }
        System.out.println("THE SUM OF ODD NUMBERS FROM 1 TO 100 is: " + odd_Sum);
        System.out.println("\nTHE SUM OF EVEN NUMBERS FROM 1 TO 100 is: " + even_Sum);
    }

    public static void main(String[] args) {
        OneToHundred N = new OneToHundred();
        N.for_Numbers();
    }

}

// WAP TO DISPLAY THE SUM AND AVERAGE OF Nth NUMBER INPUT BY THE USERS

class Average {
    Scanner scan = new Scanner(System.in);

    public void Find_Sum_Average(int n) {
        int i;
        int sum = 0;
        int a;
        for (i = 1; i <= n; i++) {
            System.out.println("ENTER THE " + i + " VALUES");
            a = scan.nextInt();
            sum += a;
        }
        scan.close();
        System.out.println("THE SUM OF NTH NUMBER OF DIGITS INPUTED IS: " + sum);
        System.out.println("THE AVERAGE WILL BE: " + (double) sum / n);

    }

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        Average A = new Average();
        System.out.println("ENTER THE NTH VALUE: ");
        number = scan.nextInt();
        A.Find_Sum_Average(number);
        scan.close();
    }
}
// WAP IN JAVA TO DEMONSTRATE METHOD OVERLOADING.
// (DEFINE THE CLASS NAMED METHODOLOGY BY OVERLOADING THE METHOD ADD() WITH
// PARAMETERS OF DIFFERENT TYPES AND
// ALSO AS PER THE NUMBER OF PARAMETERS).

class MethodOverloading {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("THE SUM OF TWO NUMBERS IS: " + sum);

    }

    void add(float a, float b) {
        float sum = a + b;
        System.out.println("THE SUM OF TWO NUMBERS IS: " + sum);
    }

    void add(char a, char b) {
        int sum = a + b;
        System.out.println("THE SUM OF TWO CHARACTER IS : " + sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MethodOverloading M = new MethodOverloading();
        M.add(30, 20);
        M.add(2.5f, 3.5f);
        M.add('H', 'U');
        scan.close();
    }
}

// CREATE A CLASS TIME WITH INSTANCE VARIABLES HOUR AND MINUTE. OTHER
// SPECIFICATIONS ARE:
// b) DEFINE A PARAMTERIZED CONSTRUCTOR THAT INITIALIZES TIME OBJECT TO FIX THE
// VALUE
// c) DEFINE A MEMBER METHOD THAT ADDS TWO TIME OBJECTS AND RETURN THE RESULTANT
// OBJECTS
// d) MAIN METHOD SHOULD CREATE TWO OBJECTS t1 AND t2 INITIALIZED TO FIX VALUE
// AND THIRD NON-INITIALIZED TIME OBJECT t3 AND PERFORM t3 = t1 + t2.

class Time {
    int hour;
    int minute;

    Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Time addingTime(Time t) {
        int newHour = this.hour + t.hour;
        int newMinute = this.minute + t.minute;

        if (newMinute >= 60) {
            newHour += newMinute / 60;
            newMinute %= 60;
        }
        if (newHour >= 24) {
            newHour %= 24; // 24 bhanda badhi halera try garnu parcha ahile
        }

        return new Time(newHour, newMinute);
    }

    public int gettingHour() {
        return hour;
    }

    public int gettingMinute() {
        return minute;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first_hour, first_minute;
        int second_hour, second_minute;
        System.out.println("ENTER FIRST HOUR: ");
        first_hour = scan.nextInt();
        System.out.println("ENTER FIRST MINUTES: ");
        first_minute = scan.nextInt();

        System.out.println("ENTER SECOND HOUR: ");
        second_hour = scan.nextInt();
        System.out.println("ENTER SECOND MINUTES: ");
        second_minute = scan.nextInt();
        Time t1, t2, t3;
        t1 = new Time(first_hour, first_minute);
        t2 = new Time(second_hour, second_minute);

        t3 = t1.addingTime(t2);

        System.out.println("THE SUM OF TIME 1 and TIME 2 WILL BE: " + t3.gettingHour() + " : " + t3.gettingMinute());
        scan.close();

    }
}

// IMAGINE A TICKET SELLING BOOTH AT A FAIR. PEOPLE PASSING BY ARE REQUESTED TO
// PURCHASE A TICKET. A TICKET IS PRICED AT 2.50.
// THE BOOTH KEEPS THE TRACK OF THE NUMBER OF PEOPLE THAT HAVE VISITED , AND THE
// TOTAL AMOUNT OF MONEY COLLECTED.

class TicketBooth {
    int noOfPeopleVisited;
    int count = 0;
    float totalAmount = 0.0f;
    final float price = 2.25f;

    TicketBooth() {
        // default constructor              //life is good..
    }

    void Ticket(int noOfPeopleVisited) {
        this.noOfPeopleVisited = noOfPeopleVisited;
        Scanner scan = new Scanner(System.in);
        boolean ticket = false;
        for (int i = 1; i <= noOfPeopleVisited; i++) {
            System.out.println("HAS " + i + " st Person Bought The Ticket?");
            ticket = scan.nextBoolean();
            if (ticket == true) {
                totalAmount += price;
            } else {
                count++;
            }
        }
        scan.close();
    }

    void Display() {
        System.out.println("THE TOTAL AMOUNT OF MONEY COLLECTED FROM THE PEOPLE WHO BOUGHT THE TICKET: " + totalAmount);
        System.out.println("THE NUMBER OF PEOPLE WHO JUST VISITED BUT NEVER BOUGHT THE TICKET IS: " + count);
    }

    public static void main(String[] args) {
        int noOfPeopleVisited;
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE TOTAL NUMBER OF PERSON WHO VISITED THE BOOTH: ");
        noOfPeopleVisited = scan.nextInt();
        TicketBooth T = new TicketBooth();
        T.Ticket(noOfPeopleVisited);
        T.Display();
        scan.close();

    }
}

