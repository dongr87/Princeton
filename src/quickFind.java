import java.util.Scanner;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by eli on 1/30/2017.
 */
public class quickFind {
    private int[] id;
    private int count;

    public quickFind(int N){
        count = N;
        id = new int[N];
        for (int i=0; i<N;i++) id[i] = i;
    }

    public int count() { return count;
    }

    public int find(int p) {
        validate(p);
        return id[p];
    }

    public void validate(int p){
        int n = id.length;
        if(p<0 || p>=n){
            throw new IndexOutOfBoundsException("index" + p + " is not between 0 and " + (n-1));
        }
    }

    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i=0; i<id.length; i++){
            if (id[i] == pid) id[i] = qid;
        }
    }

    public static void main (String[] args){
        StdOut.println("Hello World!");
    }
}
