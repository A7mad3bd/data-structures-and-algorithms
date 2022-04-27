package com.pkg.tree.fizzBuzz;

import java.util.ArrayList;

public class KTree<T> {
    int k;
    public KNode<String> root;
    ArrayList<String> Datas = new ArrayList<>();


    public KTree(int k, KNode<String> root) {
        this.k = k;
        this.root = root;
    }


    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public KNode<String> getRoot() {
        return root;
    }

    public void setRoot(KNode<String> root) {
        this.root = root;
    }

    public ArrayList getDatas() {
        return Datas;
    }

    public void setValues(ArrayList Datas) {
        this.Datas = Datas;
    }
}