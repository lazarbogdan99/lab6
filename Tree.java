
    public class Tree {
    //variable used to hold the element
    private String element;
    //vriable used for the right side
    private Node right;
    //vriable used for the left side
    private Node left;
    /**
     * this is a constructor
     */
    public Tree(String element,Node right,Node left){
        setElement(element);
        setLeft(left);
        setRight(right);

    }
    /**
    * this is an empty constructor
     */
    public Tree(){

    }

        /**
         * this method sets the element
         * @param element
         */
    public void setElement(String element) {
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
         * this method gets the element
         * @return element
         */
    public String getElement() {
        return element;
    }

        /**
         * this method gets the left node
         * @return left
         */
    public Node getLeft() {
        return left;
    }

        /**
         * this method gets the right node
         * @return right
         */
    public Node getRight() {
        return right;
    }
}
