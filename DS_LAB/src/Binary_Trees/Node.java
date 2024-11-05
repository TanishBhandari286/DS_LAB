package Binary_Trees;
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class BinarySearchTree {
    Node root;
    public void insert(int data) {
        root = find_add_node(root, data);
    }
    public Node find_add_node(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = find_add_node(root.left, data);
        }
        else if (data > root.data){
            root.right = find_add_node(root.right, data);
        }
        return root;
    }
    public void delete(int data) {
        root = find_delete_node(root, data);
    }
    public Node find_delete_node(Node delete, int data) {
        if (delete == null) {
            return null;
        }
        if (data < delete.data){
            delete.left = find_delete_node(delete.left, data);
        }
        else if (data > delete.data) {
            delete.right = find_delete_node(delete.right, data);
        }
        else {
            if (delete.left == null) {
                return delete.right;
            }
            if (delete.right == null) {
                return delete.left;
            }

            delete.data = findMin(delete.right);
            delete.right = find_delete_node(delete.right, delete.data);
        }
        return delete;
    }
    public int findMin(Node delete) {
        while (delete.left != null) {
            delete = delete.left;
        }
        return delete.data;
    }
    public void traverse() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node !=null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }
}