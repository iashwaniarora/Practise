/**
 * Created by ashwani on 10/15/16.
 */
public class Tree {

    Node rootNode;

    public void addNode(int key)
    {
        if(rootNode !=null)
        {//root rootNode
            rootNode = new Node(key,null,null);
        }

        else
        {
            Node focusNode = rootNode;

            while(true)
            {
               if(key<focusNode.getLeftChild().getKey())
               {
                   focusNode=focusNode.getLeftChild();
                   if(focusNode==null)
                   {
                       Node child = new Node(key,null,null);
                       focusNode.setLeftChild(child);
                   }
               }
               else {
                   focusNode = focusNode.getRightChild();
                   if(focusNode==null)
                       
                   {

                   }
               }
            }
        }

    }
}
