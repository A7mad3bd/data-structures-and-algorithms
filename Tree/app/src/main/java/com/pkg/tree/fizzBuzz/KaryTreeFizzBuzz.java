package com.pkg.tree.fizzBuzz;

public class KaryTreeFizzBuzz {


    public static KTree<String> fizzBuzz(KNode<Integer> inputTree) {
        if (inputTree.getParent() == null) return null;
        return preOrder(inputTree.getParent(), null);
    }

    private static KTree<String> preOrder(KNode<Integer> intNode, KNode<String> StringNode) {
        KTree<String> StringTree = null;
        if (StringNode != null) {
            if (intNode.data % 5 == 0 && intNode.data % 3 == 0) {
                KNode<String> newStrNode = new KNode<>("Fizz Buzz", intNode.getkMaxChildren());
                StringNode.addChild(newStrNode);
                StringNode = newStrNode;
            } else if (intNode.data % 5 == 0) {
                KNode<String> newStrNode = new KNode<>("Buzz", intNode.getkMaxChildren());
                StringNode.addChild(newStrNode);
                StringNode = newStrNode;
            } else if (intNode.data % 3 == 0) {
                KNode<String> newStrNode = new KNode<>("Fizz", intNode.getkMaxChildren());
                StringNode.addChild(newStrNode);
                StringNode = newStrNode;
            } else {
                KNode<String> newStrNode = new KNode<>(Integer.toString(intNode.data), intNode.getkMaxChildren());
                StringNode.addChild(newStrNode);
                StringNode = newStrNode;
            }


            return StringTree;
        }
        return StringTree;
    }
}