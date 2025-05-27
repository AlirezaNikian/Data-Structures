//*************************************************
// Author: Alireza Nikian
// Faculty of Computer Engineering
// Islamic Azad University, Najafabad Branch
//
// class TreeNode
//*************************************************

public class TreeNode{ // IntBinaryTreeNode
    // package visible data fields
    int data;
    TreeNode left; // left child or left subtree
    TreeNode right; // right child or right subtree

    public TreeNode(){
    }

    public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
