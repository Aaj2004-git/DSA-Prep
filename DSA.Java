import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.*;




//        Q.1)TO PRINT THE SUM OF ARRAY
//        float sum = 0;
//        float [] marks ={45.6f,89.3f,47.9f,23.4f,99.0f};
//                for(float element:marks){
//                    sum = sum + element;
//                }
//        System.out.println("the sum is " +sum);

//        Q.2)TO CHECK THE VALUE IN AN ARRAY
//        float [] marks = {45.7f,98.0f,56.4f,23.8f,78.6f};
//        float num = 56.6f;
//        boolean isinarray= false;
//        for(float element:marks){
//            if(element==num){
//                isinarray = true;
//                break;
//            }
//        }
//        if(isinarray){
//            System.out.println("the value is present in the array");
//        }
//        else{
//            System.out.println("the value is not present the array");
//        }

//        Q.3)THE AVG. MARKS OF PHYSICS
//        float []marks ={34.6f,90.8f,78.5f,34.7f,99.9f};
//        float sum = 0;
//        for(float element:marks){
//            sum = sum + element;
//        }
//        System.out.println("the average marks of physics " +sum/marks.length);

    // Q.4) ADD TWO MATRICES OF SIZE 2X3
//        int [][] mat1= {{1,2,3},
//                        {4,5,6}};
//        int [][] mat2= {{2,4,3},
//                        {3,4,7}};
//        int [][] result= {{0,0,0},
//                          {0,0,0}};
//        for(int i=0; i<mat1.length; i++){
//            for(int j=0; j<mat1[i].length; j++){
//                System.out.format("setting the values i=%d and j=%d\n",i,j);
//                result[i][j]= mat1[i][j] + mat2[i][j];
//            }
//        }
//        for(int i=0; i<mat1.length; i++){
//            for(int j=0; j<mat1[i].length; j++) {
//                System.out.format(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//             }
//            System.out.println("");
//            }

    //Q.5)TO REVERSE AN ARRAY
//       int [] arr = {1,2,3,4,5,6};
//       int l= arr.length;
//       int n= Math.floorDiv(l,2);
//       int temp;
//       for(int i=0; i<n; i++){
//           temp = arr[i];
//           arr[i] = arr[l-1-i];
//           arr[l-1-i] = temp;
//       }
//       for(int element:arr){
//           System.out.print(element + " ");
//       }

    //Q.6) to find the max of array
//        int [] arr={12,455,566,78,34,45,2,98};
//        int max=0;
//        for(int e:arr){
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.println("maximum element in the array " +max);


    //Q,7) sort element of array
//        boolean isSorted = True;
//        int[] arr = {13, 45, 67, 34, 23, 8, 65};
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                isSorted = false;
//                break;
//            }
//        }
//        if (isSorted) {
//            System.out.println("The array is sorted");
//        } else {
//            System.out.println("Not Sorted");
//        }
//    }
//}
//
//    // methods:-
//     static int logic(int x,int y){
//         int z;
//         if(x>y){
//             z=x+y;
//         }
//         else{
//             z=(x+y)*5;
//         }
//         return z;
//     }
//    public static void main(String[] args) {
//         int a=5;
//         int b=6;
//         int c;
//         c=logic(a,b);
//         int a1=7;
//         int b1=9;
//         int c1;
//         c1=logic(a1,b1);
//        System.out.println(c);
//        System.out.println(c1);


//    static void foo(){
//        System.out.println("Good Morning bro");
//    }
//    static void foo(int a){
//        System.out.println("good morning " + a + " bro" );
//    }
//    static void foo(int a , int b){
//        System.out.println("good morning " + a + " bro" );
//        System.out.println("good morning " + b + " bro" );
//    }
//    static void change(int a){
//        a = 98;
//    }
//    static void change2(int [] arr) {
//        arr[0] = 98;
//    }
//
//      static void telljoke(){
//          System.out.println("I invented a new word " + "plagiarism");
//    }
//    public static void main(String[] args) {

//        telljoke();

//          Case 1 : changing the integer
//          int x = 45;
//          change(x);
//          System.out.println("The value of x after running change is: " + x);

//        Case 2: Changing the array
//        int [] marks = {46,98,76,56,34,23};
//        change2(marks);
//        System.out.println("The value of x after changing the array:" + marks[0]);

//        Method Overloading
//        foo();
//        foo(5000);
//        foo(4000,5000);           //Arguments are actual! i.e. here 4000 and 5000
//                                        // parameters here are a and b
//    }
//}


//      # Variable Arguments
    //    static int sum(int a , int b){
//    return a+b;
//    }
//    static int sum(int a , int b, int c){
//        return a+b+c;

    // Using VarArgs
//    static int sum(int...arr){
    //Available as int [] arr
//    static int sum( int x, int...arr){       //to get a compulsory argument(empty array will not return in this case
//    int result = 0;
//    for (int a : arr) {
//        result += a;
//    }
//    return result;
//}
//public static void main(String[] args){
//    System.out.println("the sum of nothing is " +sum());    //Since it is an empty array Hence,returns 0
//    System.out.println("Welcome to Varargs tutorials");
//    System.out.println("The sum of 4 and 5 is " +sum(4,5));
//    System.out.println("The sum of 4, 5 and 6 is "+sum(4,5,6));
//    System.out.println("The sum of 4, 5 and 6 is "+sum(4,5,6,7,8));//Similarly if we have to add more nos.
//    // then we have make more methods therefore
//    //for solving this issue we us Variable Arguments(VarArgs)
//}
//}


    //  # Recursion
//    static int factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
//    }
//        static int factorial_iterative(int n){
//            if(n == 0 || n == 1){
//                return 1;
//            }
//            else{
//                int product = 1;
//                for(int i = 1; i<=n; i++){
//                    product *= i;
//                }
//                return product;
//            }
//        }
//
//    public static void main(String[] args){
//        int x=0;
//        System.out.println("The value of factorial n is " +factorial(x));
//        System.out.println("The value of x is " +factorial_iterative(x));
//    }
//}


    // Practice Problem 1#
//    static void multiplication(int n){
//        for(int i=1; i<=10; i++){
//            System.out.format("%d x %d = %d\n", n, i, n*i);
//        }
//    }
//    public static void main(String[] args) {
//        multiplication(6);
//    }
//}


    //Problem 2#

//static void Pattern(int n){
//for(int i=0; i<n; i++){
//    for(int j=0; j<i+1; j++){
//        System.out.print("*");
//    }
//    System.out.println();
//}
//}
//
//public static void main(String[] args){
//    Pattern(7);
//
//}
//}


    // Problem 3# Recursive function to calculate the sum of first n natural numbers

//    static int SumRec(int n){
//        if(n==1){
//            return 1;
//        }
//            return n + SumRec(n-1);
//    }
//    public static void main(String[] args){
//    int c = SumRec(4);
//        System.out.println(c);
//    }
//}


//static void pattern1(int n){
//for(int i=n; i>=1; i--){
//    for(int j=1; j<i; j++){
//        System.out.println(" ");
//    }
//    for(int j=0; j<= n-i; j++){
//        System.out.println("*");
//    }
//    System.out.println();
//}
//
//}
//public static void main(String[] args){
//    pattern1(4);
//}
//}


    // Problem #4  to print nth term of fibonacci series using recursion
//   static int fib(int n){
    /*if(n==1){
    return 0;
    }
    else if(n==2){
        return 1;
    }*/

    // Or

       /* if(n==1 || n==2){
            return n-1;
        }*/
//    else{
//        return fib(n-1) + fib(n-2);
//    }
//    }
//    public static void main(String[] args){
//        int result = fib(8);
//        System.out.println(result);
//    }
//}


    // Problem #5 To find avg. of set of numbers passed as arguments

    //Problem 8 form pattern using recursion
//    static void pattern1_rec(int n) {
//        if (n > 0) {
//            pattern1_rec(n - 1);
//            for (int i = 0; i < n; i++) {
//                System.out.println("*");
//            }
//            System.out.println();
//        }
//    }
//}
//public static void main(String[] args){
//    pattern1_rec(4);
//}

    // Q.) function to convert celsius to fahrenheit
//public static void main(String[] args){
//float Celsius,Fahrenheit;
//Celsius = 37;
//Fahrenheit = (9* Celsius/5) + 32;
//    System.out.println("the temperature in fahrenheit is " +Fahrenheit);
//}
//}
//    int id;
//    String name;
//    public void PrintDetails(){
//        System.out.println("My id is " +id);
//        System.out.println("My name is " +name);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("This is the custom class ");
//        Employee Harry = new Employee();  //Instantiating a new object
//        Employee john = new Employee();
//        // setting Attributes
//        Harry.id = 12;
//        Harry.name = "Aayushi";
//        john.id = 24;
//        john.name = "Sia";
////        System.out.println(Harry.id);
////        System.out.println(Harry.name);
//        Harry.PrintDetails();
//        john.PrintDetails();
//    }
//}


// Problem Questions
//class Employee {
//    int salary;
//    String name;
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setname(String n) {
//        name = n;
//    }
//}
//        class  cellphone{
//            public void ring(){
//                System.out.println("ringing...");
//            }
//            public void vibrate(){
//                System.out.println("vibrating...");
//            }
//            public void callfriend(){
//                System.out.println("calling Mumma...");
//            }
//        }
//
//        class square{
//          int side;
//           public int area(){
//               return side * side;
//           }
//           public int perimeter(){
//               return 4 * side;
//           }
//        }
//
//        class Rectangle{
//    int length;
//    int breadth;
//    public int area(){
//        return length * breadth;
//    }
//    public int perimeter(){
//        return 2 * (length + breadth);
//    }
//        }
//
//        class TommyVecetti{
//    public void hit(){
//        System.out.println("Hitting the enemy");
//    }
//            public void run(){
//                System.out.println("Running from the enemy");
//            }
//            public void fire(){
//                System.out.println("firing on the enemy");
//            }
//        }
//
//        class circle{
//    int radius;
//    public int area(){
//        return(int) Math.PI *(radius * radius);
//    }
//    public int circumference(){
//        return(int) (2 *Math.PI* radius);
//    }
//        }
//public class Main{
//    public static void main(String[] args){
////        Employee harry = new Employee();
////        harry.setname("Thank you next");
////        harry.salary = 344;
////        System.out.println(harry.getSalary());
////        System.out.println(harry.getName());
////
////        // Problem 2
////        cellphone asus = new cellphone();
////        asus.callfriend();
////        asus.vibrate();
////        asus.ring();
//
//        // Problem 3
////        square sq = new square();
////        sq.side = 4;
////        System.out.println(sq.area());
////        System.out.println(sq.perimeter());
//
//
//        // Problem 4;
////        Rectangle rect = new Rectangle();
////        rect.length = 4;
////        rect.breadth = 5;
////        System.out.println(rect.area());
////        System.out.println(rect.perimeter());
//
//        //Problem 5
////        TommyVecetti player = new TommyVecetti();
////        player.hit();
////        player.run();
////        player.fire();
//
//        //Problem 6
//        circle circ = new circle();
//        circ.radius = 4;
//        System.out.println(circ.area());
//        System.out.println(circ.circumference());
//    }
//}
//
//
// Question for creating the game of rock,paper, and scissors
//import java.util.Random;
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        // 0 for rock
//        // 1 for paper
//        // 2for scissors
//      Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissors");
//        int userInput = sc.nextInt();
//        Random random = new Random();
//        int computerInput = random.nextInt();
//
//        if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
//        || userInput == 2 && computerInput == 1) {
//            System.out.println("You Win");
//        }
//        else{
//            System.out.println("Computer Win");
//        }
//        System.out.println("Computer's choice: " + computerInput);
//        if(computerInput == 0){
//            System.out.println("Computer's choice: Rock");
//        }
//        else if(computerInput == 1){
//            System.out.println("Computer's choice: Paper");
//        }
//       else if(computerInput == 2){
//            System.out.println("Computer's choice: scissors");
//        }
//    }
//}


// # Getters and Setters
//class MyEmployee{
//    private int id;
//    private String name;
//    public String getname(){
//        return name;
//    }
//    public void setname(String n){
//        this.name = n;
//    }
//    public void setId(int i){
//        this.id = i;
//    }
//    public int getId(){
//    return id;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        MyEmployee harry = new MyEmployee();
//        harry.setname("hello harry");
//        System.out.println(harry.getname());
//    }
//}
//
//// do this with circle area and perimeter using getter and setter


// # Constructors
//class MymainEmployee{
//    private int id;
//   private String name;
//
////   public MymainEmployee(){                       //Constructor gets automatically invoke
////      id = 34;                                    // same name of class whose object has been made get invoked.
////      name = "Thank you next";
////   }
//
//    public MymainEmployee(String Myname, int  Myid){      //You can also pass arguments
//        id = Myid;
//        name = Myname;
//    }
//   public String getname(){
//       return name;
//    }
//    public void setname(String n){
//        this.name = n;
//    }
//    public void setId(int i){
//        this.id = i;
//    }
//    public int getId(){
//    return id;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//       MymainEmployee harry = new MymainEmployee("Thankyou next",12);      // to do this in few lines we use constructors.
////       harry.setname("hello harry");                    // find same name of method
////       harry.setId(34);
//        System.out.println(harry.getname());
//        System.out.println(harry.getId());
//  }
//}


// Method overloading in constructor-> Constructor overloading
//class MymainEmployee{
//    private int id;
//    private String name;
//
//   public MymainEmployee(){                       //Constructor gets automatically invoke
//      id = 34;                                    // same name of class whose object has been made get invoked.
//      name = "Thank you next";
//   }
//
//    public MymainEmployee(String Myname, int  Myid){      //You can also pass arguments
//        id = Myid;
//        name = Myname;
//    }
//    public MymainEmployee(String Myname){
//       name = Myname;
//    }
//    public String getname(){
//        return name;
//    }
//    public void setname(String n){
//        this.name = n;
//    }
//    public void setId(int i){
//        this.id = i;
//    }
//    public int getId(){
//        return id;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        MymainEmployee harry = new MymainEmployee("Hello honey bunny");      // to do this in few lines we use constructors.
////       harry.setname("hello harry");                    // find same name of method
////       harry.setId(34);
//        System.out.println(harry.getname());
//        System.out.println(harry.getId());
//    }
//}




/* Create a class Game, which allow user to play the "Guess the number" game once
  game should have the following properties:
  1.Constructor to generate the random no.
  2.takeuserinput() to take take the user input of number
  3.isCorrectnumber() to detect whether the number entered by the user is true
  Use properties such as noofGuesses()
   */
//class Game {
//    public int number;
//    public int inputNumber;
//    public int noofGuesses = 0;
//
//    public int getNoofGuesses() {
//        return noofGuesses;
//    }
//
//    public void setNoofGuesses(int noofGuesses) {
//        this.noofGuesses = noofGuesses;
//    }
//
//     Game() {
//        Random rand = new Random();
//        this.number = rand.nextInt(100);
//    }
//
//    void takeuserinput() {
//        System.out.println("Guess the Number");
//        Scanner sc = new Scanner(System.in);
//        inputNumber = sc.nextInt();
//    }
//
//    boolean isCorrectnumber() {
//        noofGuesses++;
//        if(inputNumber == number){
//            System.out.format("Yes you guessed it right,  it was %d\n You guessed it in %d attempts", number,noofGuesses);
//            return true;
//        }
//        else if(inputNumber < number){
//            System.out.println("too low...");
//        }
//        else if(inputNumber > number){
//            System.out.println("too high...");
//        }
//        return false;
//    }
//  }
//  public class Main {
//    public static void main(String[] args) {
//        boolean b = false;
//        while(!b) {
//            Game g = new Game();
//            g.takeuserinput();
//            b = g.isCorrectnumber();
//            System.out.println(b);
//        }
//    }
//}




// Inheritance
//class Base{
//    int x;
//    public int getX(){
//        return x;
//    }
//    public void setX(int x){
//        System.out.println("I am in base and setting x now");
//        this.x = x;
//    }
//    public void printme(){
//        System.out.println("I am a constructor");
//    }
//}
//class Derived extends Base {
//    int y;
//
//    public int gety() {
//        return y;
//    }
//
//    public void sety(int y) {
//        this.y = y;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        //Creating an object of base class
//        Base b = new Base();
////    Derived b =  new Derived();
//        b.setX(45);
//        System.out.println(b.getX());
//
//        //Creating an object of Derived class
//        Derived d = new Derived();
//        d.setX(4);
//        System.out.println(d.getX());
////        d.sety(5);
////        System.out.println(d.gety());
//    }
//}


// Q.) Create a class Animal and derive another class dog from it

//class Animal {
//    String name;
//
//    public String getname(){
//        return name ;
//}
//    public void setname(String n){
//        this.name = n;
//
//    }
//}
//class Dog extends Animal {
//    String n;
//
//    public String getn() {
//        return n;
//    }
//
//    public void setn(String x) {
//        this.n = x;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
        // Base class
//        Animal A = new Animal();
//        A.setname("I am the national animal of india");
//        System.out.println(A.getname());

//     // Derived class
//        Dog D = new Dog();
//        D.setn("I am the best dog in the world");
//        System.out.println(D.getn());
//    }
//}



//Constructor in inheritance
//class Base1 {
//    Base1() {
//        System.out.println("I am a constructor");
//    }
//
//    Base1(int a) {
//        System.out.println("I am an overloaded constructor with value of a as: " + a);
//    }
//}
//    public int x;
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//class Derived1 extends Base1 {
//    Derived1() {
////            super(0);       //Use this keyword if want to take the argument constructor of Base class
//        System.out.println("I am a derived class constructor");
//    }
//
//    Derived1(int a, int b) {
//        super(a);
//        System.out.println("I am an overloaded constructor of derived class with value of b as: " + b);
//    }
//}
//class ChildofDerived extends Derived1 {
//    ChildofDerived() {
//        System.out.println("I am a Child of Derived class constructor");
//    }
//
//    ChildofDerived(int a, int b, int c) {
//        super(a,b);
//        System.out.println("I am an overloaded constructor of ChildofDerived with value of c as: " +c);
//    }
//}
//
////        public int y;
////
////        public int getY() {
////            return y;
////        }
////
////        public void setY(int y) {
////            this.y = y;
////        }
//
//    public class Main{
//        public static void main(String[] args) {
////      Base1 b = new Base1();
////      Derived1 d = new Derived1(4,9);
//        ChildofDerived child = new ChildofDerived(6,8,15);
//        }
//    }

    // METHOD OVERRIDING

//class A {
//    public int a;
//    public int harry(){
//        return 4;
//    }
//    public void meth2(){
//        System.out.println("I am a method 2 of class A");
//    }
//}
//class B extends A{
//    @Override
//    public void meth2(){
//        System.out.println("I am a method 2 of class B");
//    }
//    public void meth3(){
//        System.out.println("I am a method 3 of class B");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A a = new A();
//        a.meth2();
//
//        B b = new B();
//        b.meth2();
//    }
//
//
//}


  //DYNAMIC METHOD DISPATCH

//class Phone {
//    public void greet() {
//
//        System.out.println("Good morning sir");
//    }
//
//    public void on() {
//        System.out.println("Turning on Phone...");
//    }
//}
//    class Smartphone extends Phone{
//         public void swagat(){
//             System.out.println("Aapka swagat hai");
//         }
//        public void on(){
//
//            System.out.println("Turning on Smartphone");
//        }
//    }
//    public class Main{
//        public static void main(String[] args) {
////         Phone obj = new Phone();
////         Smartphone smobj = new Smartphone();
////         obj.name();
////
//         Phone obj = new Smartphone();//Super class reference can be equal to subclass obj (Allowed)
////         Smartphone obj2 = new Phone(); //Not Allowed
//            obj.greet();
//            obj.on();         //kyunki object subclass ka hai isliye whi return karega
//        }
//    }
//


  // Q.) You have to implement a library using java class library
   // Methods: addBook, issueBook, returnbook, showAvailableBooks
   // Properties: Array to store the available books,
   // Array to store the issued books

//Abstract classes


// Interfaces
//interface Bicycle{
////   public int a = 34;
//    void applyBrake(int decrement);
//    void speedUp(int increment);
//}

//interface HornCycle{
//    void blowHornK3G();
//    void blowHornmhn();
//}
//class AvonCycle implements Bicycle,HornCycle{
////    public int a= 34;
//    void blowHorn(){
//        System.out.println("Pee Pee Poo Poo");
//    }
//    public void applyBrake(int decrement){  //whenever we implement the interface and define its methods then the method will be public
//        System.out.println("Applying Brakes");
//    }
//    public void speedUp(int increment){
//        System.out.println("Applying speedUp");
//    }
//    public void blowHornK3G(){
//        System.out.println("Kabhi khushi kabhi gum");
//    }
//    public void blowHornmhn(){
//        System.out.println("Main hoon na");
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        AvonCycle Mycycle = new AvonCycle();
//        Mycycle.applyBrake(1);
//        //You can create properties in interfaces
////        System.out.println(Mycycle.a);
//        //You cannot modify properties in interfaces as they are final
////        Mycycle.a = 43; //not valid
////        System.out.println(Mycycle.a);
//
//        Mycycle.blowHornK3G();
//        Mycycle.blowHornmhn();   /*you can make more than one interfaces but cannot make more
//                                  than one abstract classes means more than one classes cannot
//                                  be extended*/
//    }
//}


//DEFAULT METHODS

//interface Camera{
//   void takeSnap();
//   void recordVideo();
////   private void greet(){
////       System.out.println("Good morning");
////   }
//   default void record4KVideo(){
////       greet();
//       System.out.println("Recording in 4k...");
//   }
//}
//interface wifi{
//    String[] getNetworks();
//    void connectToNetwork(String network);
//}
//class MyCellphone{
//    void callNumber(int phoneNumber){
//        System.out.println("Calling..."+ phoneNumber);
//    }
//    void pickCall(){
//        System.out.println("Connecting...");
//    }
//}
//class MySmartPhone extends MyCellphone implements Camera,wifi{
//    public void takeSnap(){
//        System.out.println("taking snap");
//    }
//    public void recordVideo(){
//        System.out.println("Recording Video");
//    }
//    public void record4KVideo(){
//        System.out.println("Taking Snap and recording in 4k...");
//    }
//    public String[] getNetworks(){
//        System.out.println("Getting list of Networks");
//        String[] networkList = {"Aayushi", "Shambhavi", "Harshit"};
//        return networkList;
//    }
//    public void connectToNetwork(String network){
//        System.out.println("connecting to " + network);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//MySmartPhone ms = new MySmartPhone();
//ms.record4KVideo();
//String[]ar = ms.getNetworks();
//for(String item: ar){
//    System.out.println(item);
//}
//    }
//}


//INHERITANCE in INTERFACES
// interface sampleInterface{
//     void meth1();
//     void meth2();
// }
// interface childSampleInterface extends sampleInterface{
//     void meth3();
//     void meth4();
// }
// class MySampleClass implements childSampleInterface{
//     public void meth1(){
//         System.out.println("meth1");
//     }
//     public void meth2(){
//         System.out.println("meth2");
//     }
//     public void meth3(){
//         System.out.println("meth3");
//     }
//     public void meth4(){
//         System.out.println("meth4");
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         MySampleClass obj = new MySampleClass();
//         obj.meth1();
//         obj.meth2();
//         obj.meth3();
//         obj.meth4();
//     }
//}


// Practice Questions on Abstract classes and methods

// abstract class Pen{
//     abstract void write();
//     abstract void refill();
// }
// class FountainPen extends Pen{
//     void write(){
//         System.out.println("writing...");
//     }
//     void refill(){
//         System.out.println("refilling...");
//     }
//     void ChangeNib(){
//         System.out.println("Changing the Nib...");
//     }
// }
// class Monkey {
//     void jump() {
//         System.out.println("Jumping...");
//     }
//
//     void bite() {
//         System.out.println("Biting...");
//     }
// }
//
//     interface BasicAnimal {
//         void eat();
//
//         void sleep();
//     }
//
//     class Human extends Monkey implements BasicAnimal{
//         void speak(){
//             System.out.println("Hello sir!");
//         }
//         public void eat(){
//             System.out.println("eating...");
//         }
//
//         @Override
//         public void sleep() {
//             System.out.println("sleeping");
//         }
//     }
// public class Main {
//     public static void main(String[] args) {
//         //Q1+Q2
//         FountainPen pen = new FountainPen();
//         pen.ChangeNib();
//
//         //Q3
//         Human Aayushi = new Human();
//         Aayushi.eat();
//         Aayushi.sleep();
//         Aayushi.speak();
//
//         //Q5 demoontrating polymorphism using class monkey
//         Monkey m1 = new Human();
//        // m1.speak(); --> cannot use speak method because the reference is monkey which does not have speak method
//         m1.bite();
//         m1.jump();
//
//         BasicAnimal harshit = new Human();
//         harshit.sleep();
//         harshit.eat();
//        // harshit.speak(); --> error
//     }
//}



//Access Modifiers

//class c1{
//    public int x = 4;
//    protected int y = 5;
//    int z = 6;
//    private int a = 8;
//    public void meth1(){
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(a);
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        c1 c = new c1();
//        c.meth1();
//        System.out.println(c.x);
//        System.out.println(c.y);
//        System.out.println(c.z);
////        System.out.println(c.a);  //not valid since it is private and from same package
//    }
//}


//Creating a thread :- By extending the thread
//class MyThread extends Thread{
//    @Override
//    public void run(){
//while(true){
//    System.out.println("My Thread is running");
//    System.out.println("I am Happy");
//       }
//    }
//}
//class MyThread2 extends Thread{
//    @Override
//    public void run(){
//        while(true){
//            System.out.println("Thread2 is good");
//            System.out.println("I am sad");
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args){
//   MyThread t1 = new MyThread();
//   MyThread2 t2 = new MyThread2();
//   t1.start();    //to run the thread we need start method, it internally calls run method
//   t2.start();    //All of this implementation is inside the Thread.java
//    }
//}

//Creating a thread :- By implementing Runnable interface

//class MyThreadRunnable implements Runnable{
//    public void run(){
//        System.out.println("I am a thread not a threat");
//    }
//}
//class MyThreadRunnable2 implements Runnable{
//    public void run(){
//        System.out.println("I am a thread2 not a threat2");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        MyThreadRunnable Bullet1 = new MyThreadRunnable();
//        Thread gun1 = new Thread(Bullet1);
//
//        MyThreadRunnable2 Bullet2 = new MyThreadRunnable2();
//        Thread gun2 = new Thread(Bullet2);
//
//        gun1.start();
//        gun2.start();
//    }
//}



//class MyThr extends Thread{
//    public MyThr(String name){
//        super(name);  //Calling the constructor of class Thread which takes a string name
//    }
//    public void run(){
//        while(true){
//            System.out.println("I am a Thread");
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//   MyThr t = new MyThr("aayushi");
//   t.start();
//    }
//}


//Java Thread Priorities
//class MyThr1 extends Thread{
//    public MyThr1(String name){
//        super(name);
//    }
//    public void run(){
//        int i = 34;
//        while(true) {
//            System.out.println("Thank you " + getName());
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        //Ready Queue: T1 T2 T3 T4 T5:-Threads ready to run
//        MyThr1 t1 = new MyThr1("aayushi1");
//        MyThr1 t2 = new MyThr1("aayushi2");
//        MyThr1 t3 = new MyThr1("aayushi3");
//        MyThr1 t4 = new MyThr1("aayushi4");
//        MyThr1 t5 = new MyThr1("aayushi5 (most important)");
//        t5.setPriority(Thread.MAX_PRIORITY);
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t3.setPriority(Thread.MIN_PRIORITY);
//        t4.setPriority(Thread.MIN_PRIORITY);
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//    }
//}


//Java Thread Methods

//public class Main {
//    // Functions to find leaders in an array
//    static ArrayList<integer> leaders(int[] arr) {
//        ArrayList<integer> result = new ArrayList<integer>();
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            int j;
//
//            //check the elements to the right
//            for (j = i + 1; j < n; j++) {
//
//                //if a larger element is found
//                if (arr[i] < arr[j])
//                    break;
//            }
//            //if no larger element is found
//            if (j == n)
//               integer add =  result.add(arr[i]);
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {16, 17, 4, 3, 5, 2};
//        ArrayList<integer> result = leaders(arr);
//
//        for (integer res : result) {
//            System.out.print(res + " ");
//        }
//        System.out.println();
//    }
//}



///************************************************************************************************8
//
//      //JAVA STRINGS ---- Strings are immutable in java
//
//     //concatenation
////   public class Main {
////         public static void main(String[] args) {
//             //concatenation
////           String firstName = "tony";
////           String lastName = "Stark";
////           String fullName = firstName + "@" + lastName;
//////           System.out.println(fullName);
////
////           //length
////           System.out.println(fullName.length());
////
////           //charAt
////           for(int i = 0; i<fullName.length(); i++){
////               System.out.println(fullName.charAt(i));
////           }
////
////           //compare
////           String name1 = "Tony";
////           String name2 = "Tony2";
//
//             //1. st1 > st2: +ve value
//             //2. st1 == st2: 0
//             //3. st1 < st2: -ve value
//
//             //eg. hello > cello or hello < wello
//
////           if(name1.compareTo(name2) == 0){
////               System.out.println("Strings are equal");        //we use this method to compare because '==' in some cases throws error
////           }else{
////               System.out.println("Strings are not equal");
////           }
//
////           if(name1==name2){
////               System.out.println("Strings are equal");
////           }else{
////               System.out.println("Strings are not equal");
////           }
//
////           if(new String("Tony") == new String("Tony")){        //here strings are not equal because strings are objects in java
////               System.out.println("Strings are equal");
////           }else{
////               System.out.println("Strings are not equal");
//
////           String sentence = "My name is Tony";
////           String name = sentence.substring(11, sentence.length());
////           System.out.println(name);
////           }
//
//
//
//             /**********STRINGBUILDER************
////             StringBuilder sb = new StringBuilder("Tony");
////             System.out.println(sb);
//
//             //char at index 0
////             System.out.println(sb.charAt(0));
//
//             //set char at index
////             sb.setCharAt(0,'P');
////             System.out.println(sb);
//
//             //Insert
////             sb.insert(0,'S');
////             System.out.println(sb);
//
////             sb.insert(2,'n');
////             System.out.println(sb);
////
////             //delete the extra 'n'
////             sb.delete(2,3);
////             System.out.println(sb);
////
////             //Append
////             sb.append("S");      // if done using string, str = str + "e"
////             sb.append("t");
////             sb.append("a");
////             sb.append("r");
////             sb.append("k");
////
////             System.out.println(sb);
////             System.out.println(sb.length());
//
//
//
//
//
//
//             //************Q.REVERSE A STRING************
//
////               for(int i = 0; i < sb.length() / 2; i++){      //O(n)
////                   int front = i;
////                   int back = sb.length() - 1 - i;
////
////                   char frontChar = sb.charAt(front);
////                   char backChar = sb.charAt(back);
////
////                   sb.setCharAt(front, backChar);
////                   sb.setCharAt(back, frontChar);
////               }
////             System.out.println(sb);
////         }
////     }
//
//
//
//
//         /**********LINKED LISTS*************
////         public class Main{
////         public static void main(String[] args){
////             LinkedList<String> list = new LinkedList<String>();
////
////             list.addFirst("a");
////             list.addFirst("is");
////
////             System.out.println(list);
////
////             list.addFirst("this");
////             System.out.println(list);
////
////             list.addLast("list");
////             System.out.println(list);
////
////             System.out.println(list.size());
////
////             for(int i = 0; i < list.size(); i++){
////                 System.out.print(list.get(i) + "->");
////             }
////             System.out.println("null");
////
//////             list.removeFirst();
//////             System.out.println(list);
//////
//////             list.removeLast();
//////             System.out.println(list);
////
////             list.remove(3);
////             System.out.println(list);
////         }
////         }
//
//
//    //IN DEPTH LINKED LISTS
////public class Main {
////    public static class Node{
////        int val;
////        Node next;
////        Node prev;
////        Node(int val){
////            this.val = val;
////        }
////    }
////    public static void display(Node head){
////        Node temp = head;
////        while(temp != null){
////            System.out.print(temp.val + " ");
////            temp = temp.next;
////        }
////        System.out.println();
////    }
////
////        public static void displayrev(Node tail) {
////        Node temp = tail;
////
////        while(temp != null){
////            System.out.print(temp.val + " ");
////            temp = temp.prev;
////        }
////            System.out.println();
////        }
////
////        public static void display2(Node random){      //if we want to display all the elements from any random position
////            Node temp = random;
////
////            //Move this temp backwards to the head
////            while(temp.prev != null) {
////                temp = temp.prev;
////            }
////                //Now temp is at head
////                //Print the list
////            while(temp != null){
////                System.out.print(temp.val + " ");
////                temp = temp.next;
////            }
////            System.out.println();
////        }
////
////        public static Node insertAtHead(Node head, int val){
////        Node t = new Node(30);
////        t.next = head;
////        head.prev = t;
////        head = t;
////        return head;
////        }
////
////        public static void insertAtTail(Node head, int x){
////        Node temp = head;
////        //temp lo tail tak le jaate hain
////            while(temp.next != null){
////                temp = temp.next;
////            }
////            Node t = new Node(x);
////            temp.next = t;
////            t.prev = temp;
////
////        }
////
////        public static void insertAtIdx(Node head, int idx, int x){
////        Node s = head;
////        for(int i = 0; i < idx - 1; i++){
////            s = s.next;
////        }
////          //s is at idx - 1 position
////          Node r = s.next;     //idx
////          Node t = new Node(x);
////          //s t r
////          s.next = t;
////          t.prev = s;
////          t.next = r;
////          r.prev = t;
////
////        }
////
////
////    public static void main(String[] args){
////        Node a = new Node(4);Node b = new Node(10);
////        Node c = new Node(2);
////        Node d = new Node(99);
////        Node e = new Node(13);
////
////        a.prev = null;
////        a.next = b;
////        b.prev = a;
////        b.next = c;
////        c.prev = b;
////        c.next = d;
////        d.prev = c;
////        d.next = e;
////        e.prev = d;
////        e.next = null;
//////        display(a);
//////        displayrev(e);
//////        display2(c);
////
//////        Node newHead = insertAtHead(a, 35);
//////        display(newHead);
////
//////        insertAtTail(a,90);
//////        display(a);
//////        insertAtIdx(a, 3, 56);
//////        display(a);
////
////
////
////
////    }
////}
//
//
//
//   /************************STACKS****************************/
//

   //Q. Copy contents of one stack to another in same order(three stacks are used)-O(3n)
//     public class Main {
//       public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//           Stack<Integer> st = new Stack<>();
//           int n;
//           System.out.println("Enter the number of elements you want to insert");
//           n = sc.nextInt();
//           System.out.println("Enter the next element: ");
//           for (int i = 1; i <= n; i++) {
//               int x = sc.nextInt();
//               st.push(x);
//
//           }
//           System.out.println(st);
//
//           //reverse order
//           Stack<Integer> gt = new Stack<>();
//           while (st.size() > 0) {
//               gt.push(st.pop());
//           }
//           System.out.println(gt);
//
//           Stack<Integer> rt = new Stack<>();
//           while (gt.size() > 0) {
//               rt.push(gt.pop());
//           }
//           System.out.println(rt);
//       }
//   }


    //INSERTION IN STACK
//   public class Main {
//        public static void main(String[] args) {
//            Stack<Integer> st = new Stack<>();
//            st.push(1);
//            st.push(2);
//            st.push(3);
//            st.push(4);
//            st.push(5);
//            System.out.println(st);
//
//            //insert
//            int idx = 2;
//            int x = 7;
//            Stack<Integer> temp = new Stack<>();
//            while(st.size() > idx){
//                temp.push(st.pop());
//            }
//           st.push(x);
//            while(temp.size() > 0){
//                st.push(temp.pop());
//            }
//            System.out.println(st);
//        }
//    }



      //Push at bottom
//      public class Main {
//
//          public static void displayreverse(Stack<Integer> st){  //recursion  display --> TC- O(n), SC-)(n)
//              if(st.size() == 0) return;                        //callstack is used which takes space
//              int top = st.pop();
//              System.out.print(top+" ");
//              displayreverse(st);
//              st.push(top);
//          }
//
//          public static void displayrec(Stack<Integer> st){  //recursion
//              if(st.size() == 0) return;
//              int top = st.pop();
//              displayrec(st);
//              System.out.print(top+" ");
//              st.push(top);
//          }
//          public static void main(String[] args) {
//              Stack<Integer> st = new Stack<>();
//              st.push(1);
//              st.push(2);
//              st.push(3);
//              st.push(4);
//              st.push(5);
//
//              displayrec(st);

//              System.out.println(st);


              //insert
//              Stack<Integer> rt = new Stack<>();
//              while(st.size() > 0){
//                  rt.push(st.pop());
//              }
//             while(rt.size() > 0){
//                 int x = rt.pop();
//                 System.out.print(x+" ");
//                 st.push(x);


              //with array
//             int n = st.size();
//              int[] arr = new int[n];
//              for(int i = n - 1; i >= 0; i--){
//                  arr[i] = st.pop();
//          }
//              for(int i = 0; i < n; i++){
//                  System.out.print(arr[i] + " ");
//                  st.push(arr[i]);
//              }
//          }
//      }




   //Q. REVERSE A STACK
 // iterative solution
//public class Main {
//       public static void main(String[] args) {
//           Stack<Integer> st = new Stack<>();
//           st.push(1);
//           st.push(2);
//           st.push(3);
//           st.push(4);
//           st.push(5);
//           System.out.println(st);
//
//           Stack<Integer> rt = new Stack<>();
//           while(st.size() > 0){
//               rt.push(st.pop());
//           }
//           System.out.println(rt);
//           Stack<Integer> qt = new Stack<>();
//           while(rt.size() > 0){
//               qt.push(rt.pop());
//           }
//           System.out.println(qt);
//           while(qt.size() > 0){
//               st.push(qt.pop());
//           }
//           System.out.println(st);
//       }
//   }


//RECURSIVE METHOD
//public class Main {
//
//    public static void pushAtBottom(Stack<Integer> st, int x){
//        if(st.size() == 0) {
//            st.push(x);
//            return;
//        }
//        int top = st.pop();
//        pushAtBottom(st, x);
//        st.push(top);
//    }
//    public static void reverse(Stack<Integer> st){
//        if(st.size() == 1) return;
//        int top = st.pop();
//        reverse(st);
//        pushAtBottom(st, top);
//    }
//    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        reverse(st);
//        System.out.println(st);
//    }
//}



     //STACK UNDERFLOW
//public class Main{
//    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);          //underflow

//}
//        }


   //ARRAY IMPLEMENTATION OF STACK

    //Q. REVERSE A LINKED LIST
//public class Main {
//    public static void main(String[] args){

//    }
//    }



   //*****************QUEUE*******************
//public class Main {
//    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        //rear --> 54321 <-- front
//        Queue<Integer> helper = new ArrayDeque<>();
//        while(q.size() > 0){
//            System.out.println(q.peek());
////            int x = q.poll();
//            helper.add(q.poll());
//        }
//        while(helper.size() > 0) {
//            q.add(helper.poll());
//        }
//     }
//   }




   //*********************S0rting*****************************


//public class Main {
//
//    public static void printArray(int arr[]){
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//
//        int[] arr = {7, 6, 5, 8, 9 };
//
//        //bubble sort --> O(n^2)
////        for(int i = 0; i < arr.length - 1; i++){
////            for(int j = 0; j < arr.length - i - 1; j++){
////                if(arr[j] > arr[j + 1]){
////                    int temp = arr[j];
////                    arr[j] = arr[j+1];
////                    arr[j+1] = temp;
////                }
////            }
////
////
////        }
//
//
//        //selection sort --> O(n^2)
//        for(int i = 0; i < arr.length - 1; i++){
//            int smallest = i;
//            for(int j = i + 1; j < arr.length; j++){
//                if(arr[smallest] > arr[j])
//                    smallest = j;
//            }
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }
//        printArray(arr);
//    }


//         //INSERTION SORT
//  public class InsertionSort {
//    void sort(int arr[])
//    {
//        int n = arr.length;
//        for (int i = 1; i < n; ++i) {
//            int key = arr[i];
//            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
              of their current position */
 //           while (j >= 0 && arr[j] > key) {
 //               arr[j + 1] = arr[j];
  //              j = j - 1;
  //          }
 //           arr[j + 1] = key;
        }
 //   }

 //   /* A utility function to print array of size n */
//    static void printArray(int arr[])
 //   {
 //       int n = arr.length;
 //       for (int i = 0; i < n; ++i)
 //           System.out.print(arr[i] + " ");

 //       System.out.println();
 //   }

    // Driver method
  //  public static void main(String args[])
  //  {
  //      int arr[] = { 12, 11, 13, 5, 6 };

  //      InsertionSort ob = new InsertionSort();
  //      ob.sort(arr);

  //      printArray(arr);
  //  }



    //QUICK SORT

import java.util.Arrays;

// class main {

//     // partition function
//     static int partition(int[] arr, int low, int high) {
        
//         // choose the pivot
//         int pivot = arr[high];
        
//         // index of smaller element and indicates 
//         // the right position of pivot found so far
//         int i = low - 1;

//         // traverse arr[low..high] and move all smaller
//         // elements to the left side. Elements from low to 
//         // i are smaller after every iteration
//         for (int j = low; j <= high - 1; j++) {
//             if (arr[j] < pivot) {
//                 i++;
//                 swap(arr, i, j);
//             }
//         }
        
//         // Move pivot after smaller elements and
//         // return its position
//         swap(arr, i + 1, high);  
//         return i + 1;
//     }

//     // swap function
//     static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     // the QuickSort function implementation
//     static void quickSort(int[] arr, int low, int high) {
//         if (low < high) {
            
//             // pi is the partition return index of pivot
//             int pi = partition(arr, low, high);

//             // recursion calls for smaller elements
//             // and greater or equals elements
//             quickSort(arr, low, pi - 1);
//             quickSort(arr, pi + 1, high);
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {10, 7, 8, 9, 1, 5};
//         int n = arr.length;
      
//         quickSort(arr, 0, n - 1);
        
//         for (int val : arr) {
//             System.out.print(val + " ");  
//         }
//     }
// }



    //HEAP SORT


// import java.util.Arrays;

// class main {
  
//     // To heapify a subtree rooted with node i
//     // which is an index in arr[].
//     static void heapify(int arr[], int n, int i) {

//         // Initialize largest as root
//         int largest = i; 

//         // left index = 2*i + 1
//         int l = 2 * i + 1; 

//         // right index = 2*i + 2
//         int r = 2 * i + 2;

//         // If left child is larger than root
//         if (l < n && arr[l] > arr[largest]) {
//             largest = l;
//         }

//         // If right child is larger than largest so far
//         if (r < n && arr[r] > arr[largest]) {
//             largest = r;
//         }

//         // If largest is not root
//         if (largest != i) {
//             int temp = arr[i];
//             arr[i] = arr[largest];
//             arr[largest] = temp;

//             // Recursively heapify the affected sub-tree
//             heapify(arr, n, largest);
//         }
//     }

//     // Main function to do heap sort
//     static void heapSort(int arr[]) {
//         int n = arr.length;

//         // Build heap (rearrange array)
//         for (int i = n / 2 - 1; i >= 0; i--) {
//             heapify(arr, n, i);
//         }

//         // One by one extract an element from heap
//         for (int i = n - 1; i > 0; i--) {

//             // Move current root to end
//             int temp = arr[0]; 
//             arr[0] = arr[i];
//             arr[i] = temp;

//             // Call max heapify on the reduced heap
//             heapify(arr, i, 0);
//         }
//     }

//     // A utility function to print array of size n
//     static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     // Driver's code
//     public static void main(String args[]) {
//         int arr[] = {9, 4, 3, 8, 10, 2, 5}; 
//         heapSort(arr);
//         System.out.println("Sorted array is ");
//         printArray(arr);
//     }
// }



//     //MERGE SORT
// import java.io.*;

// class main {

//     // Merges two subarrays of arr[].
//     // First subarray is arr[l..m]
//     // Second subarray is arr[m+1..r]
//     static void merge(int arr[], int l, int m, int r){
        
//         // Find sizes of two subarrays to be merged
//         int n1 = m - l + 1;
//         int n2 = r - m;

//         // Create temp arrays
//         int L[] = new int[n1];
//         int R[] = new int[n2];

//         // Copy data to temp arrays
//         for (int i = 0; i < n1; ++i)
//             L[i] = arr[l + i];
//         for (int j = 0; j < n2; ++j)
//             R[j] = arr[m + 1 + j];

//         // Merge the temp arrays

//         // Initial indices of first and second subarrays
//         int i = 0, j = 0;

//         // Initial index of merged subarray array
//         int k = l;
//         while (i < n1 && j < n2) {
//             if (L[i] <= R[j]) {
//                 arr[k] = L[i];
//                 i++;
//             }
//             else {
//                 arr[k] = R[j];
//                 j++;
//             }
//             k++;
//         }

//         // Copy remaining elements of L[] if any
//         while (i < n1) {
//             arr[k] = L[i];
//             i++;
//             k++;
//         }

//         // Copy remaining elements of R[] if any
//         while (j < n2) {
//             arr[k] = R[j];
//             j++;
//             k++;
//         }
//     }

//     // Main function that sorts arr[l..r] using
//     // merge()
//     static void mergeSort(int arr[], int l, int r){
        
//         if (l < r) {

//             // Find the middle point
//             int m = l + (r - l) / 2;

//             // Sort first and second halves
//             mergeSort(arr, l, m);
//             mergeSort(arr, m + 1, r);

//             // Merge the sorted halves
//             merge(arr, l, m, r);
//         }
//     }

//     // Driver code
//     public static void main(String args[]){
        
//         int arr[] = {38, 27, 43, 10};
        
//         mergeSort(arr, 0, arr.length - 1);
        
//         int n = arr.length;
//         for (int i = 0; i < n; ++i)
//             System.out.print(arr[i] + " ");
//         System.out.println();
//     }
// }



//             //BUCKET SORT
// import java.util.ArrayList;
// import java.util.List;

// public class Main {
//     // Insertion sort function to sort individual buckets
//     public static void insertionSort(List<Float> bucket) {
//         for (int i = 1; i < bucket.size(); ++i) {
//             float key = bucket.get(i);
//             int j = i - 1;
//             while (j >= 0 && bucket.get(j) > key) {
//                 bucket.set(j + 1, bucket.get(j));
//                 j--;
//             }
//             bucket.set(j + 1, key);
//         }
//     }

//     // Function to sort arr[] of size n using bucket sort
//     public static void bucketSort(float[] arr) {
//         int n = arr.length;

//         // 1) Create n empty buckets
//         List<Float>[] buckets = new ArrayList[n];
//         for (int i = 0; i < n; i++) {
//             buckets[i] = new ArrayList<>();
//         }

//         // 2) Put array elements in different buckets
//         for (int i = 0; i < n; i++) {
//             int bi = (int) (n * arr[i]);
//             buckets[bi].add(arr[i]);
//         }

//         // 3) Sort individual buckets using insertion sort
//         for (int i = 0; i < n; i++) {
//             insertionSort(buckets[i]);
//         }

//         // 4) Concatenate all buckets into arr[]
//         int index = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < buckets[i].size(); j++) {
//                 arr[index++] = buckets[i].get(j);
//             }
//         }
//     }

//     // Driver program to test above function
//     public static void main(String[] args) {
//         float[] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};
//         bucketSort(arr);

//         System.out.println("Sorted array is:");
//         for (float num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }


//          //COUNTING SORT
// import java.util.ArrayList;

// class main {
//     public static ArrayList<Integer> countsort(int arr[]) {
//         int n = arr.length;

//         // find the maximum element
//         int maxval = 0;
//         for (int i = 0; i < n; i++)
//             if (arr[i] > maxval) maxval = arr[i];

//         // create and initialize count array
//         int[] count = new int[maxval + 1];

//         // count frequency of each element
//         for (int i = 0; i < n; i++)
//             count[arr[i]]++;

//         // compute prefix sum
//         for (int i = 1; i <= maxval; i++)
//             count[i] += count[i - 1];

//         // build output array
//         int[] ans = new int[n];
//         for (int i = n - 1; i >= 0; i--) {
//             ans[count[arr[i]] - 1] = arr[i];
//             count[arr[i]]--;
//         }

//         // convert to ArrayList
//         ArrayList<Integer> result = new ArrayList<>();
//         for (int x : ans)
//             result.add(x);

//         return result;
//     }

//     public static void main(String[] args) {
//         int arr[] = {2,5,3,0,2,3,0,3};
//         ArrayList<Integer> sorted = countsort(arr);

//         for (int x : sorted)
//             System.out.print(x + " ");
//     }
// }




//   //RADIX SORT
// import java.io.*;
// import java.util.*;

// class main {

//     // A utility function to get maximum value in arr[]
//     static int getMax(int arr[], int n)
//     {
//         int mx = arr[0];
//         for (int i = 1; i < n; i++)
//             if (arr[i] > mx)
//                 mx = arr[i];
//         return mx;
//     }

//     // A function to do counting sort of arr[] according to
//     // the digit represented by exp.
//     static void countSort(int arr[], int n, int exp)
//     {
//         int output[] = new int[n]; // output array
//         int i;
//         int count[] = new int[10];
//         Arrays.fill(count, 0);

//         // Store count of occurrences in count[]
//         for (i = 0; i < n; i++)
//             count[(arr[i] / exp) % 10]++;

//         // Change count[i] so that count[i] now contains
//         // actual position of this digit in output[]
//         for (i = 1; i < 10; i++)
//             count[i] += count[i - 1];

//         // Build the output array
//         for (i = n - 1; i >= 0; i--) {
//             output[count[(arr[i] / exp) % 10] - 1] = arr[i];
//             count[(arr[i] / exp) % 10]--;
//         }

//         // Copy the output array to arr[], so that arr[] now
//         // contains sorted numbers according to current
//         // digit
//         for (i = 0; i < n; i++)
//             arr[i] = output[i];
//     }

//     // The main function to that sorts arr[] of
//     // size n using Radix Sort
//     static void radixsort(int arr[], int n)
//     {
//         // Find the maximum number to know number of digits
//         int m = getMax(arr, n);

//         // Do counting sort for every digit. Note that
//         // instead of passing digit number, exp is passed.
//         // exp is 10^i where i is current digit number
//         for (int exp = 1; m / exp > 0; exp *= 10)
//             countSort(arr, n, exp);
//     }

//     // A utility function to print an array
//     static void print(int arr[], int n)
//     {
//         for (int i = 0; i < n; i++)
//             System.out.print(arr[i] + " ");
//     }

//     // Main driver method
//     public static void main(String[] args)
//     {
//         int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
//         int n = arr.length;

//         // Function Call
//         radixsort(arr, n);
//         print(arr, n);
//     }
// }



//     COMB SORT

// import java.io.*;
// public class main
// {
//     // To find gap between elements
//     int getNextGap(int gap)
//     {
//         // Shrink gap by Shrink factor
//         gap = (gap*10)/13;
//         if (gap < 1)
//             return 1;
//         return gap;
//     }

//     // Function to sort arr[] using Comb Sort
//     void sort(int arr[])
//     {
//         int n = arr.length;

//         // initialize gap
//         int gap = n;

//         // Initialize swapped as true to make sure that
//         // loop runs
//         boolean swapped = true;

//         // Keep running while gap is more than 1 and last
//         // iteration caused a swap
//         while (gap != 1 || swapped == true)
//         {
//             // Find next gap
//             gap = getNextGap(gap);

//             // Initialize swapped as false so that we can
//             // check if swap happened or not
//             swapped = false;

//             // Compare all elements with current gap
//             for (int i=0; i<n-gap; i++)
//             {
//                 if (arr[i] > arr[i+gap])
//                 {
//                     // Swap arr[i] and arr[i+gap]
//                     int temp = arr[i];
//                     arr[i] = arr[i+gap];
//                     arr[i+gap] = temp;

//                     // Set swapped
//                     swapped = true;
//                 }
//             }
//         }
//     }

//     // Driver method
//     public static void main(String args[])
//     {
//         CombSort ob = new CombSort();
//         int arr[] = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
//         ob.sort(arr);

//         System.out.println("sorted array");
//         for (int i=0; i<arr.length; ++i)
//             System.out.print(arr[i] + " ");

//     }
// }
// /* This code is contributed by Rajat Mishra */



//       SHELL SORT

//  class main
// {
//     /* An utility function to print array of size n*/
//     static void printArray(int arr[])
//     {
//         int n = arr.length;
//         for (int i=0; i<n; ++i)
//             System.out.print(arr[i] + " ");
//         System.out.println();
//     }

//     /* function to sort arr using shellSort */
//     int sort(int arr[])
//     {
//         int n = arr.length;

//         // Start with a big gap, then reduce the gap
//         for (int gap = n/2; gap > 0; gap /= 2)
//         {
//             // Do a gapped insertion sort for this gap size.
//             // The first gap elements a[0..gap-1] are already
//             // in gapped order keep adding one more element
//             // until the entire array is gap sorted
//             for (int i = gap; i < n; i += 1)
//             {
//                 // add a[i] to the elements that have been gap
//                 // sorted save a[i] in temp and make a hole at
//                 // position i
//                 int temp = arr[i];

//                 // shift earlier gap-sorted elements up until
//                 // the correct location for a[i] is found
//                 int j;
//                 for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
//                     arr[j] = arr[j - gap];

//                 // put temp (the original a[i]) in its correct
//                 // location
//                 arr[j] = temp;
//             }
//         }
//         return 0;
//     }

//     // Driver method
//     public static void main(String args[])
//     {
//         int arr[] = {12, 34, 54, 2, 3};
//         System.out.println("Array before sorting");
//         printArray(arr);

//         ShellSort ob = new ShellSort();
//         ob.sort(arr);

//         System.out.println("Array after sorting");
//         printArray(arr);
//     }
// } 



//      CYCLE SORT
// import java.util.*;
// import java.lang.*;

// class main {
//     // Function sort the array using Cycle sort
//     public static void cycleSort(int arr[], int n)
//     {
//         // count number of memory writes
//         int writes = 0;

//         // traverse array elements and put it to on
//         // the right place
//         for (int cycle_start = 0; cycle_start <= n - 2; cycle_start++) {
//             // initialize item as starting point
//             int item = arr[cycle_start];

//             // Find position where we put the item. We basically
//             // count all smaller elements on right side of item.
//             int pos = cycle_start;
//             for (int i = cycle_start + 1; i < n; i++)
//                 if (arr[i] < item)
//                     pos++;

//             // If item is already in correct position
//             if (pos == cycle_start)
//                 continue;

//             // ignore all duplicate elements
//             while (item == arr[pos])
//                 pos += 1;

//             // put the item to it's right position
//             if (pos != cycle_start) {
//                 int temp = item;
//                 item = arr[pos];
//                 arr[pos] = temp;
//                 writes++;
//             }

//             // Rotate rest of the cycle
//             while (pos != cycle_start) {
//                 pos = cycle_start;

//                 // Find position where we put the element
//                 for (int i = cycle_start + 1; i < n; i++)
//                     if (arr[i] < item)
//                         pos += 1;

//                 // ignore all duplicate elements
//                 while (item == arr[pos])
//                     pos += 1;

//                 // put the item to it's right position
//                 if (item != arr[pos]) {
//                     int temp = item;
//                     item = arr[pos];
//                     arr[pos] = temp;
//                     writes++;
//                 }
//             }
//         }
//     }

//     // Driver program to test above function
//     public static void main(String[] args)
//     {
//         int arr[] = { 1, 8, 3, 9, 10, 10, 2, 4 };
//         int n = arr.length;
//         cycleSort(arr, n);

//         System.out.println("After sort : ");
//         for (int i = 0; i < n; i++)
//             System.out.print(arr[i] + " ");
//     }
// }

// // Code Contributed by Mohit Gupta_OMG <(0_o)>




