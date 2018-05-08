/**
 * Created by ashwani on 11/13/16.
 */
public class TreeDS {
    private static Node rootNode;


    public void addNode(int data) {
        if (rootNode == null) {
            rootNode = new Node(data);
        } else {
            Node currentNode = rootNode;
            Node parent = null;
            while (true) {
                parent = currentNode;
                if (data < currentNode.getData()) {
                    currentNode = currentNode.left;
                    if (currentNode == null) {
                        parent.left = new Node(data);
                        return;
                    }

                } else {
                    currentNode = currentNode.right;
                    if (currentNode == null) {
                        parent.right = new Node(data);
                        return;
                    }
                }
            }
        }

    }

    void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public static void main(String[] args) {
        TreeDS treeDS = new TreeDS();
        treeDS.addNode(5);
        treeDS.addNode(3);
        treeDS.addNode(6);
        treeDS.addNode(8);
        treeDS.addNode(1);
        treeDS.preOrder(rootNode);

    }
}
