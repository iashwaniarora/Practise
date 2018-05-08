/**
 * Created by ashwani on 11/21/16.
 */
public class TreePostOrder {
    static Node rootNode;

    TreePostOrder() {


    }

    public void add(int data) {
        if (rootNode == null) {
            rootNode = new Node(data);
        } else {
            Node parentNode = rootNode;
            Node currentNode = null;
            while (true) {
                currentNode = parentNode.leftNode;
                if (currentNode == null) {
                    parentNode.leftNode = new Node(data);
                    return;
                } else {
                    currentNode = parentNode.rightNode;
                    if (currentNode == null) {
                        parentNode.rightNode = new Node(data);
                        return;
                    }
                    parentNode= parentNode.leftNode;
                }
            }
        }
    }

    public void showPostOrderTraversal(Node root) {
        if (root != null) {

            showPostOrderTraversal(root.getLeftNode());
            showPostOrderTraversal(root.getRightNode());
            System.out.print(root.data);
        }
    }

    public static void main(String[] args) {
        TreePostOrder treePostOrder = new TreePostOrder();
        treePostOrder.add(3);
        treePostOrder.add(5);
        treePostOrder.add(2);
        treePostOrder.add(1);
        treePostOrder.add(4);
        treePostOrder.add(6);
        treePostOrder.showPostOrderTraversal(rootNode);
    }

}
