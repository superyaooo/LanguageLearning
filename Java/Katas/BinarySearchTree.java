/*
Definition:
The height of a binary search tree is the number of edges between the tree's root and its furthest leaf.

Task:
Given a binary search tree, get the height of the tree;

Sample Input:
7  (number of nodes in the tree)
3
5
2
1
4
6
7
Sample Output:
3
*/

class Node {
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int T=sc.nextInt();
         Node root=null;
         while(T-->0){
             int data=sc.nextInt();
             root=insert(root,data);
         }
         int height=getHeight(root);
         System.out.println(height);
     }


     public static Node insert(Node root,int data){
         if(root==null){
             return new Node(data);
         }
         else{
             Node cur;
             if(data<=root.data){
                 cur=insert(root.left,data);
                 root.left=cur;
             }
             else{
                 cur=insert(root.right,data);
                 root.right=cur;
             }
             return root;
         }
     }

      public static int getHeight(Node root) {
          if(root == null) {
              return -1;
          }

          int left = 1 + getHeight(root.left);
          int right = 1 + getHeight(root.right);

          return Math.max(left, right);
      }
}
