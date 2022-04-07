package com.pkg.tree.Sum_Odd;

import com.pkg.tree.BinaryTree;
import com.pkg.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class sumodd {

    public int sumoddnumbers(BinaryTree t1) {
        int sum = 0;
        if (t1.root == null)
            return 0;
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(t1.root);

        int count = 0;
        while (!queue.isEmpty()) {

            Node temp = queue.poll();
            if (temp.getLeft() != null && temp.getRight() != null)
                count++;
            if (temp.getData() % 2 != 0)
                sum += temp.getData();
            if (temp.getRight() != null) {
                queue.add(temp.getRight());

            }

            if (temp.getRight() != null) {
                queue.add(temp.getRight());

            }
        }
        return sum;

    }

}
