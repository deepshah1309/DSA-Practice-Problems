public class TreeHeight{
    Node root=null;
    TreeHeight(){
        root=new Node(10);
    }
    public static void main(String args[]){
            TreeHeight t=new TreeHeight();
            Node r=t.root;
            r.left=new Node(5);
            r.left.left=new Node(2);
            r.left.left.left=new Node(1);
            r.right=new Node(20);

            Solution s=new Solution();
            int height=s.height(r);
            System.out.println();
            System.out.print(height);
            s.inorder(r);
    }
}
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        if(node==null) return 0;
        if(node.left==null){
            return height(node.right)+1;
        }
        if(node.right==null){
            return height(node.left)+1;
        }
        int lheight=height(node.left);
        int rheight=height(node.right);
        return Math.max(lheight,rheight)+1;
        
    }
    void inorder(Node node){
        if(node!=null){
            inorder(node.left);
        System.out.print(node.data);
        inorder(node.right);
        }
        
    }
}
