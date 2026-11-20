import java.util.*;

class A {
    public static void main(String args[]) {

        class Node {
            int data;
            Node left, right;

            Node(int data) {
                this.data = data;
            }
        }

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Stack<Node> st = new Stack<>();

        Node curr = root;
        Node lastVisited = null;

        while (curr != null || !st.isEmpty()) {

            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            else {
                Node peekNode = st.peek();

                if (peekNode.right != null &&
                    lastVisited != peekNode.right) {

                    curr = peekNode.right;
                }
                else {
                    System.out.println(peekNode.data);

                    lastVisited = st.pop();
                }
            }
        }
    }
}