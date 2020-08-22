package tech.ibrokhimov.datastructures.unionfind;

public interface UF {
     void unionFind();
     int find(int p);
     boolean connected(int p, int q);
     int count();
}
