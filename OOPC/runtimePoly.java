//its type of polymorphism
//its run time polymorphism
//method overriding
//method name are must be same and parameter must be same
//its happen in inheritence

class add{
int sum(int a, int b){
    return a+b;
}
}
class addition extends add{
    int sum(int a,int b){
        return a+b+3;

    }
}


public class runtimePoly {
public static void main(String[] args){
    add a=new addition();
    int ans=a.sum(1,2);
    System.out.println(ans);

}
}
