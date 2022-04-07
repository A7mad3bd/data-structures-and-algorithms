# Trees
Binary Tree is a data structure has elements and each elemnt
has at most 2 children and each child c
alled left and right child. Each Node contains:
Data and 2 pointer one to the left and one to the right
## Challenge

- This challenge about how to build a binary tree, store Nodes in it and apply Depth First methods. Also how to build binary search tree class contains add() method and contains method.
  postOrder(Node node)
- inOrder(Node node )
- preOrder(Node node)

- Node 

Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
- Binary Tree

Create a Binary Tree class
Define a method for each of the depth first traversals:
pre order
in order
post order which returns an array of the values, ordered appropriately.
Any exceptions or errors that come from your code should be semantic, capture-able errors. For example, rather than a default error thrown by your language, your code should raise/throw a custom, semantic error that describes what went wrong in calling the methods you wrote for this lab.
- Binary Search Tree

Create a Binary Search Tree class
This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:
Add
Arguments: value
Return: nothing
Adds a new node with that value in the correct location in the binary search tree.
Contains
Argument: value
Returns: boolean indicating whether or not the value is in the tree at least once.
## Approach & Efficiency
Binary Tree
Time: -add O(n). -Searching for a node O(n)
Space: -O(n), n depends the width of the tree