//Write a Program to implement Binary Search Tree operations.
package Binary_Trees;

public class Bst_Ops {
    public static void main(String[] args) {
        BinarySearchTree tanish = new BinarySearchTree();

                // Insert nodes
                tanish.insert(50);
                tanish.insert(30);
                tanish.insert(70);
                tanish.insert(20);
                tanish.insert(40);
                tanish.insert(60);
                tanish.insert(80);

                // In-order traversal
                System.out.print("Printing The Binary Search Tree: ");
                tanish.traverse();

                tanish.delete(20);
                tanish.delete(80);
        System.out.println("Printing The Binary Search Tree: ");
        tanish.traverse();


            }
        }
