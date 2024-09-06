//given a "2*n" board and tiles of size "2*1" ,count the number of
//ways to tile the given board using the 2*1 tiles.
//(A tile can either be placed horizontally or vertically)
import java.util.*;
public class tiling {

public static int tilingProblem(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    //vertical tiling
    int fnm1 = tilingProblem(n - 1);
    //horizontal tiling
    int fnm2 = tilingProblem(n - 2);
    int totWays = fnm1 + fnm2;

    return totWays;
}

public static void main(String args[]){
System.out.println(tilingProblem(5));
}
}