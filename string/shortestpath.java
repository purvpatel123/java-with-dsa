//given a route containing 4 direction (E,W,S,N) find the shortest path to reach destination.
import java.util.*;
public class shortestpath {
    public static float getshortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if (dir=='S') {
                y--;
            } else if (dir=='E') {
                x++;
            }
            else {
                x--;
            }
        }
        int X=x*x;
        int Y=y*y;
        return (float)Math.sqrt(X+Y);

    }
    public static void main(String args[]){
        String path="SNWWWNW";
        System.out.println(getshortestpath(path));
    }
}
