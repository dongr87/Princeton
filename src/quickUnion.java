/**
 * Created by eli on 1/30/2017.
 */
public class quickUnion {
    private int[] id;
    public void quickUnionInit(int N){
        id = new int[N];
        for(int i=0; i<N; i++) id[i]=i;
    }
    public int root(int i){
        while(i != id[i]) i = id[i];
        return i;
    }
    public boolean connected (int p, int q){
        return id[p] == id[q];
    }
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
