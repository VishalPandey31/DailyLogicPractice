
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

        class Pair {
            Node node;
            int state;

            Pair(Node node, int state) {
                this.node = node;
                this.state = state;
            }
        }

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Stack<Pair> st = new Stack<>();

        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();

        st.push(new Pair(root, 1));

        while (!st.isEmpty()) {

            Pair top = st.peek();

            if (top.state == 1) {

                pre.add(top.node.data);

                top.state = 2;

                if (top.node.left != null) {
                    st.push(new Pair(top.node.left, 1));
                }
            }

            else if (top.state == 2) {

                in.add(top.node.data);

                top.state = 3;

                if (top.node.right != null) {
                    st.push(new Pair(top.node.right, 1));
                }
            }

            else {

                post.add(top.node.data);

                st.pop();
            }
        }

        System.out.println("Preorder: " + pre);
        System.out.println("Inorder: " + in);
        System.out.println("Postorder: " + post);
    }
}
