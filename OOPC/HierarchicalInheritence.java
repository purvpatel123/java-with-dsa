//1 parent class ->  child1,child2
//multiple child from 1 parent class

class cricket{
    void play(){
        System.out.println("can play cricket");
    }

}

class ball extends cricket{
    void bowling(){
        System.out.println("bowler can do bowling");
    }
}

class bat extends cricket{
    void bating(){
        System.out.println("batter can do bating");
    }
}


public class HierarchicalInheritence {
    public static void main(String[] args){
        bat b=new bat();
        b.bating();
        b.play();
        ball bw=new ball();
        bw.bowling();
        bw.play();
    }
}
