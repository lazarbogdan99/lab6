

    public class Node{
    //variable used to hold the element
    private String element;
    //vriable used for the left side
    private Node left;
    //vriable used for the right side
    private Node right;

        /**
         * this is a constructor
         * @param element
         * @param left
         * @param right
         */
    public Node(String element,Node left,Node right){
        setElement(element);
        setLeft(left);
        setRight(right);
    }

        /**
         * this method sets the element
         * @param element
         */
    public void setElement(String element){
        this.element = element;
    }

        /**
         * this method sets the left node
         * @param left
         */
    public void setLeft(Node left) {
        this.left = left;
    }

        /**
         * this method sets the right node
         * @param right
         */
    public void setRight(Node right) {
        this.right = right;
    }

        /**
         * this method gets the element and returns it
         * @return element
         */
    public String getElement() {
        return element;
    }

        /**
         * this method gets the left node and returns it
         * @return left
         */
    public Node getLeft() {
        return left;
    }

        /**
         * this method gets the right node and returns it
         * @return right
         */
    public Node getRight() {
        return right;
    }
}
