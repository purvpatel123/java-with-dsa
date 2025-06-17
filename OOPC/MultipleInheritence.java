//using interface
//does not support extend
// its abstract method so its method does not have body
interface girls{
    void girl();


};

interface boys{
    void boy();
}


class child implements girls,boys{
    public void girl(){
        System.out.println("girld are good");
    }
    public void boy(){
        System.out.println("boys are also good");
    }
}


public class MultipleInheritence {
    public static void main(String[] args){

   child c=new child();
   c.girl();
   c.boy();
    }
}
