/**
 * Created by ashwani on 11/22/16.
 */
public class TreeDS {

    static Node rootNode;

    public void addNode(int data) {
        if (rootNode == null) {
            rootNode = new Node(data);
        } else {
            Node currentNode = rootNode;
            while (true) {
                if (data < currentNode.data) {
                    if (currentNode.left == null) {
                        currentNode.left = new Node(data);
                        return;
                    }
                    currentNode = currentNode.left;
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = new Node(data);
                        return;

                    }
                    currentNode = currentNode.right;
                }
            }
        }

    }

    /*public int calculateHeight(Node rootNode) {
        System.out.println();
        while(true)
        {

        }
        return 0;
    }*/

    public void showPreOder(Node rootNode) {
        if (rootNode != null) {
            System.out.print(rootNode.data + " ");
            showPreOder(rootNode.left);
            showPreOder(rootNode.right);
        }
    }

    public static void main(String[] args) {
        TreeDS treeDS = new TreeDS();
        treeDS.addNode(5);
        treeDS.addNode(3);
        treeDS.addNode(6);
        treeDS.addNode(8);
        treeDS.addNode(1);
        treeDS.showPreOder(rootNode);
    }
}
