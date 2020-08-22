package tech.ibrokhimov.algorithms.unionfind;

public class QuickUnionUF implements UF {
    private int[] id;

    private int count;

    public QuickUnionUF(int N) {
        this.count = N;
        this.id = new int[N];
        for (int i = 0; i < N; i++)
            this.id[i] = i;
    }

    private int root(int i) {
        while (i != this.id[i])
            i = this.id[i];
        return i;
    }

    public void union(int p, int q) {
        int pRoot = root(p);
        int qRoot = root(q);
        this.id[pRoot] = qRoot;
        this.count--;
    }

    public boolean connected(int p, int q) {
        return (root(p) == root(q));
    }

    public int count() {
        return this.count;
    }
}
