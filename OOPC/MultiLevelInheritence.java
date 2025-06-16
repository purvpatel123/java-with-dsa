//level1-level2-level3
//Child class inherits from a class which is also a child of another class.

class vihicle{
    void sound(){
System.out.println("hight sound");
    }
}

class car extends vihicle{
    void speed(){
        System.out.println("high speed car");
    }
}

class bike extends car{
    void size(){
        System.out.println("small size");
    }
}


public class MultiLevelInheritence {
    public static void main(String[] args){
        bike b=new bike();
        b.size();
        b.speed();
        b.sound();
    }
}
