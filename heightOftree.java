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
public class heightOftree {
    public static int height(Node node)
    {
        if(node==null){
            return 0 ;
        }
        return 1+ Math.max(height(node.left), height(node.right));
    }
    public static void main(String[] args) {
        Node node= new Node(6);
        node.left= new Node(5);
        node.right= new Node(2);
        System.out.println(height(node));
    }
}
