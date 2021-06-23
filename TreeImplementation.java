import java.util.Scanner;

public class TreeImplementation{
    public static Scanner sc=new Scanner(System.in);
    public static Node createTree()
    {
        System.out.println("Enter data..");
        int data=sc.nextInt();
        if(data==-1)
        return null;
        else
        {
            Node root=new Node();
            root.data=data;
            System.out.println("Left of "+data+"..");
            root.left=createTree();
            System.out.println("Right of "+data+"..");
            root.right=createTree();
            return root;
        }
    }
    public static void preOrder(Node node)
    {
        if(node==null)
            return;
        else{
            System.out.print(node.data+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public static void postOrder(Node node)
    {
        if(node==null)
        return;
        else{
            
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data+" ");
        }
    }
    public static void inOrder(Node node)
    {
        if(node==null)
        return;
        else{
            
            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }
    }
    public static void main(String[] args) {
        Node node=createTree();
         System.out.println("\nPreorder Traversal..");
        preOrder(node);
        System.out.println("\nPostorder Traversal..");
        postOrder(node);
        System.out.println("\nInorder Traversal..");
        inOrder(node);
    }
}
class Node{
    int data;
    Node left;
    Node right;
}