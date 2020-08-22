package tech.ibrokhimov.algorithms.unionfind;

public class QuickFindUF implements UF {
    private int[] id;

    private int count;

    public QuickFindUF(int N) {
        this.count = N;
        this.id = new int[N];
        for (int i = 0; i < N; i++)
            this.id[i] = i;
    }

    public void union(int p, int q) {
        int pid = this.id[p];
        int qid = this.id[q];
        for (int i = 0; i < this.id.length; i++) {
            if (this.id[i] == pid)
                this.id[i] = qid;
        }
        this.count--;
    }

    public boolean connected(int p, int q) {
        return (this.id[p] == this.id[q]);
    }

    public int count() {
        return this.count;
    }
}
