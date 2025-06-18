//its type of polymorphism
//method overloading
//method name must be same but different parameter or different types of parameter
//its compile time polymorphism

class math{
    int sum(int a,int b){
         return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;

    }
}


public class compilePoly {
    public static void main(String[] args){
math m=new math();
System.out.println(m.sum(1,2));
        System.out.println(m.sum(1,2,3));
    }
}
