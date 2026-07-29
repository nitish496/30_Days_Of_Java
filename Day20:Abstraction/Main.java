// Problem 1
abstract class Animal{
    abstract void sound();

    
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks.");
    }

}

// Problem 2
abstract class Animal2{
    void eat(){
        System.out.println("Animals eat food.");

    }
    abstract void sound();

}
class Dog2 extends Animal2{
    @Override
    void sound(){
        System.out.println("Dog2 barks");
    }
}
// Problem 3
abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("The car starts working.");
    }
}
// Problem 4
abstract class Employee{
    abstract void work();
}
class SoftwarePerson extends Employee{
    @Override
    void work(){
        System.out.println("The person is working");
    }
}
// Problem 5
abstract class Employee1{
   Employee1(){
    System.out.println("Employee constructor is called.");
   }
   abstract void work();
}
class SoftwareEngineer1 extends Employee1{
    @Override
    void work(){
        System.out.println("Your work is to develop the backend or frontend.");
    }
}
// Problem 6
interface Call{
    void calling();
}
interface Music{
    void playMusic();
}
class Smartphone implements Call, Music{
    @Override
    public void calling(){
        System.out.println("Your phone is calling...");
    }
    @Override
    public void playMusic(){
        System.out.println("Your phone is playing music.");
    }
}
// Problem 7
abstract class Vehicle2{
    public void start(){
        System.out.println("Vehicle started.");
    }
    abstract void drive();
}
interface MusicSystem{
    void playMusic();
}

class Car2 extends Vehicle2 implements MusicSystem{
    @Override
    void drive(){
        System.out.println("Car is moving");
    }
    @Override
    public void playMusic(){
        System.out.println("Playing music");
    }
}
// Problem 8
abstract class BankAccount{
    public void deposit(){
        System.out.println("Money deposited successfully.");
    }
    abstract void withdraw();
}
class SavingsAccount extends BankAccount{
    @Override
    void withdraw(){
        System.out.println("Money successfully withdrawn from the savings account.");
    }
}
class CurrentAccount extends BankAccount{
    @Override
    void withdraw(){
        System.out.println("Money successfully withdrawn from the current account.");
    }
}

//p-9:
abstract class vechile4{
    abstract void start();
    abstract void stop();
}
class car3 extends vechile4{
    @Override
    void start(){
        System.out.println("The car has been started.");
    }
    @Override
    void stop(){
        System.out.println("The car has been stop.");
    }
}
class bike3 extends car3{
    @Override
    void start(){
        System.out.println("The bike has been self started.");
    }
    @Override
    void stop(){
        System.out.println("The bike has been stoped.");
    }
}
// Problem 9
abstract class Vehicle3{
    abstract void start();
    abstract void stop();
}

class Car3 extends Vehicle3{
    @Override
    void start(){
        System.out.println("Car started.");
    }

    @Override
    void stop(){
        System.out.println("Car stopped.");
    }
}

class Bike3 extends Vehicle3{
    @Override
    void start(){
        System.out.println("Bike started.");
    }

    @Override
    void stop(){
        System.out.println("Bike stopped.");
    }
}
// Problem 10
abstract class Payment1{
   abstract void processPayment();
}
class UPI1 extends Payment1{
    @Override
    void processPayment(){
        System.out.println("Payment processed using UPI.");
    }
}
class CreditCard1 extends Payment1{
    @Override
    void processPayment(){
        System.out.println("Payment processed using a credit card.");
    }
}

class NetBanking1 extends Payment1{
    @Override
    void processPayment(){
        System.out.println("Payment processed using net banking.");
    }
}

public class Main{
    public static void main(String[]args){
        Dog d1 = new Dog();
        d1.sound();
        Dog2 d2 = new Dog2();
        d2.eat();
        d2.sound();
        Car c1 = new Car();
        c1.start();
        SoftwareEngineer1 e1 = new SoftwareEngineer1();
        e1.work();
        System.out.println();
        Smartphone p1 = new Smartphone();
        p1.playMusic();
        p1.calling();
        System.out.println();

      System.out.println();
      Car2 car = new Car2();
      car.start();
      car.drive();
      car.playMusic();
      System.out.println();

BankAccount account;

account = new SavingsAccount();
account.deposit();
account.withdraw();

System.out.println();

account = new CurrentAccount();
account.deposit();
account.withdraw();
account.withdraw();
System.out.println();
System.out.println();
Vehicle3 vehicle;
vehicle = new Car3();
vehicle.start();
vehicle.stop();
System.out.println();
vehicle = new Bike3();
vehicle.start();
vehicle.stop();
System.out.println();
Payment1 payment;
payment = new CreditCard1();
payment.processPayment();
payment = new UPI1();
payment.processPayment();
payment = new NetBanking1();
payment.processPayment();
    }
}
