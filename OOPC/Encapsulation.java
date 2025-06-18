//Encapsulation is the process of wrapping data (variables)
// and code (methods) into a single unit (class)
// and making sure that the internal data of the object is hidden from outside access unless explicitly allowed.
//How Do We Achieve Encapsulation in Java?

//private keyword	To restrict direct access to fields
//public methods	To provide controlled access
//getters/setters	For reading and writing values safely

class student{
    private int age;          //private variable for data hiding
     public void setAge(int a){               //public setter method to set the value(age)
         if(a>0){
             age=a;
         }else {
             System.out.println("invalid age!");
         }

     }

     public int getAge(){
         return age;
     }
}



public class Encapsulation {
    public static void main(String[] args) {


        student s = new student();
        s.setAge(10);
        System.out.println(s.getAge());

    }
}
