package tech.ibrokhimov.algorithms.unionfind;

public class WeightedQuickUnionUF implements UF {
    private int[] id;

    private int[] size;

    private int count;

    public WeightedQuickUnionUF(int N) {
        this.count = N;
        this.id = new int[N];
        this.size = new int[N];
        for (int i = 0; i < N; i++) {
            this.id[i] = i;
            this.size[i] = 1;
        }
    }

    private int root(int i) {
        while (i != this.id[i])
            i = this.id[i];
        return i;
    }

    public void union(int p, int q) {
        int pRoot = root(p);
        int qRoot = root(q);
        if (pRoot == qRoot)
            return;
        if (this.size[pRoot] < this.size[qRoot]) {
            this.id[pRoot] = qRoot;
            this.size[qRoot] = this.size[qRoot] + this.size[pRoot];
        } else {
            this.id[qRoot] = pRoot;
            this.size[pRoot] = this.size[pRoot] + this.size[qRoot];
        }
        this.count--;
    }

    public boolean connected(int p, int q) {
        return false;
    }

    public int count() {
        return this.count;
    }
}
