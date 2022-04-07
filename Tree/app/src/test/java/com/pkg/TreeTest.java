package com.pkg;

import com.pkg.tree.BinaryTreeSearch;
import com.pkg.tree.Node;
import com.pkg.tree.Sum_Odd.sumodd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TreeTest {


    Node six = new Node();
    Node three = new Node();
    Node fifteen = new Node();

    @Test
    void testroot() {
        BinaryTreeSearch test = new BinaryTreeSearch();
        Node n1 = new Node();

        n1.setData(10);
        test.add(n1);
        assert (test.root.getData() == 10);
    }

    @Test
    void testcontain() {
        BinaryTreeSearch test = new BinaryTreeSearch();
        Node n1 = new Node();
        sumodd s1 = new sumodd();


        n1.setData(10);

        test.add(n1);

        assertTrue(test.ifcontains(10));
        System.out.println(s1.sumoddnumbers(test));

    }

    @Test
    void testodd() {
        BinaryTreeSearch sut = new BinaryTreeSearch();
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();

        sumodd s1 = new sumodd();

        n1.setData(3);
        n2.setData(5);
        n3.setData(8);//even

        sut.add(n1);
        sut.add(n2);
        sut.add(n3);


        assertEquals(s1.sumoddnumbers(sut), 8);

    }

//    @Test
//    void testmax() {
//        BinaryTreeSearch sut = new BinaryTreeSearch();
//        Node n1 = new Node();
//        Node n2 = new Node();
//        Node n3 = new Node();
//
//        sumodd s1 = new sumodd();
//
//        n1.setData(1);
//        n2.setData(3);
//        n3.setData(4);
//        n1.setLeft(n2);
//        n1.setRight(n3);
//
//        sut.add(n1);
//        sut.add(n2);
//        sut.add(n3);
////        System.out.println(sut.MaxBinarytree(sut.root));
//        System.out.println(s1.sumoddnumbers(sut));
//
//    }


//        @Test
//        void testInsertBst(){
//            BinarySearchTree sut = new BinarySearchTree();
//
//            ten.setLeftNode(null);
//            ten.setRightNode(null);
//            ten.setValue(10);
//
//            six.setValue(6);
//            three.setValue(3);
//            fifteen.setValue(15);
//
//            sut.add(ten);
//            sut.add(six);
//            sut.add(three);
//            sut.add(fifteen);
//
//
//
//            assert(sut.inOrderTraversal().size() == 4);
//        }
//
//        @Test
//        void testSetRightChildBst(){
//            BinarySearchTree sut = new BinarySearchTree();
//
//            ten.setLeftNode(null);
//            ten.setRightNode(null);
//            ten.setValue(10);
//
//            six.setValue(6);
//
//            sut.add(ten);
//            sut.add(six);
//
//            assert(ten.getLeftNode().value == 6);
//        }
//
//        @Test
//        void testSetLeftChildBst(){
//            BinarySearchTree sut = new BinarySearchTree();
//
//            ten.setLeftNode(null);
//            ten.setRightNode(null);
//            ten.setValue(10);
//
//            fifteen.setValue(15);
//            six.setValue(6);
//
//            sut.add(ten);
//            sut.add(six);
//            sut.add(fifteen);
//
//            assert(ten.getRightNode().value == 15);
//        }
//
//
//        @Test
//        void testContainsBst(){
//            BinarySearchTree sut = new BinarySearchTree();
//
//            ten.setLeftNode(null);
//            ten.setRightNode(null);
//            ten.setValue(10);
//
//            six.setValue(6);
//
//            sut.add(ten);
//            sut.add(six);
//
//            assert(sut.contains(6));
//        }
//
//
//        @Test
//        void testNegativeContainsBst(){
//            BinarySearchTree sut = new BinarySearchTree();
//
//            ten.setLeftNode(null);
//            ten.setRightNode(null);
//            ten.setValue(10);
//
//            six.setValue(6);
//
//            sut.add(ten);
//            sut.add(six);
//
//            assert(!sut.contains(15));
//        }
//
//
//    @Test
//    void testInsertBst(){
//        BinarySearchTree sut = new BinarySearchTree();
//
//        ten.setLeftNode(null);
//        ten.setRightNode(null);
//        ten.setValue(10);
//
//        six.setValue(6);
//        three.setValue(3);
//        fifteen.setValue(15);
//
//        sut.add(ten);
//        sut.add(six);
//        sut.add(three);
//        sut.add(fifteen);
//
//        assert(sut.inOrderTraversal().size() == 4);
//    }
//
//    @Test
//    void testSetRightChildBst(){
//        BinarySearchTree sut = new BinarySearchTree();
//
//        ten.setLeftNode(null);
//        ten.setRightNode(null);
//        ten.setValue(10);
//
//        six.setValue(6);
//
//        sut.add(ten);
//        sut.add(six);
//
//        assert(ten.getLeftNode().value == 6);
//    }
//
//    @Test
//    void testSetLeftChildBst(){
//        BinarySearchTree sut = new BinarySearchTree();
//
//        ten.setLeftNode(null);
//        ten.setRightNode(null);
//        ten.setValue(10);
//
//        fifteen.setValue(15);
//        six.setValue(6);
//
//        sut.add(ten);
//        sut.add(six);
//        sut.add(fifteen);
//
//        assert(ten.getRightNode().value == 15);
//    }
//
//
//    @Test
//    void testContainsBst(){
//        BinarySearchTree sut = new BinarySearchTree();
//
//        ten.setLeftNode(null);
//        ten.setRightNode(null);
//        ten.setValue(10);
//
//        six.setValue(6);
//
//        sut.add(ten);
//        sut.add(six);
//
//        assert(sut.contains(6));
//    }
//
//
//    @Test
//    void testNegativeContainsBst(){
//        BinarySearchTree sut = new BinarySearchTree();
//
//        ten.setLeftNode(null);
//        ten.setRightNode(null);
//        ten.setValue(10);
//
//        six.setValue(6);
//
//        sut.add(ten);
//        sut.add(six);
//
//        assert(!sut.contains(15));
//    }
}
