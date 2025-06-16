// It allows a class (child/subclass) to inherit fields and methods from another class (parent/superclass),
// making code reusable and organized.
//In Java, inheritance is done using the extends keyword.

class Animal{
    void sound(){
        System.out.println("animal is barking");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("dog is barking");
    }
}


public class singleInheritence {
      public static void main(String[] args){
  Dog d=new Dog();
  d.bark();
  d.sound();

      }
}