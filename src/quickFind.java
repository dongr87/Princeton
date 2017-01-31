/**
 * Created by eli on 1/30/2017.
 */
public class quickFind {
    private int[] id;
    public void quickFindInit(int N){
        id = new int[N];
        for (int i=0; i<N;i++) id[i] = i;
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

    public static void main(String[] args){
        System.out.println("Hello, World!");
    }
}
