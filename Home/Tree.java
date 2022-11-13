import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(13, 
                            new BinaryTree(8, 
                                new BinaryTree(14, 
                                    new BinaryTree(6, 
                                        new BinaryTree(4), new BinaryTree(5), new BinaryTree(13)), null, null), null, 
                                new BinaryTree(1, new BinaryTree(9), null, new BinaryTree(5))), null, 
                            new BinaryTree(7, 
                                new BinaryTree(2, null, null, new BinaryTree(10)), 
                                new BinaryTree(3), new BinaryTree(8)));
    PreOrder(root, "");
    Print(root);
    System.out.printf("сумма = %d",root.sum());
    }
    
    /**
     * метод прохождения в глубину дерева через рекурсию
     */
    private static void PreOrder(Tree.BinaryTree root, String space) {
        if (root != null) {
            System.out.print(root.value + ", ");
        }
        else return;
        if (root.left != null || root.middle != null || root.right != null) {
            
            PreOrder(root.left, space);
            PreOrder(root.middle, space);
            PreOrder(root.right, space);
        }
    }
    
    /**
     * метод прохождения в ширину дерева 
     */
    public static void Print(BinaryTree root) {
        Queue<BinaryTree> queue = new LinkedList<BinaryTree>(); 
        queue.add(root);
        System.out.println("\nпо ширине ");
        while (!queue.isEmpty()) {
            BinaryTree node = queue.remove();
            System.out.print(node.value + " ");
            if (node.left != null){
                queue.add(node.left);
            }
            if (node.middle != null){
                queue.add(node.middle);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree middle;
        BinaryTree right;
        /**
         * модель без потомков
         * @param value
         */
        public BinaryTree(int value) {
            this.value = value;
        }

        /**
         * модель с потомками(-ом)
         * @param value
         * @param left
         * @param middle
         * @param right
         */
        public BinaryTree(int value, Tree.BinaryTree left, Tree.BinaryTree middle, Tree.BinaryTree right) {
            this.value = value;
            this.left = left;
            this.middle = middle;
            this.right = right;
        }
        
        /**
         * метод побсчёта суммы элементов дерева
         * @return
         */
        public int sum() {
            int sum = value;
            if (left != null) {
                sum += left.sum();
            }
            if (middle != null) {
                sum += middle.sum();
            }
            if (right != null) {
                sum += right.sum();
            }
            return sum;
        }
        
    }
}

// public class Tree {
//     public static void main(String[] args) {
//         BinaryTree root = new BinaryTree(13, 
//                         new BinaryTree(8, 
//                             new BinaryTree(14, new BinaryTree(6), null), 
//                             new BinaryTree(1, new BinaryTree(9), new BinaryTree(5))), 
//                         new BinaryTree(7, new BinaryTree(2, null, new BinaryTree(10)), null));
//         System.out.println(root.sum());
//                     }

//     static class BinaryTree {
//         int value; //узел
//         BinaryTree left;
//         BinaryTree right;
//         /**
//          * модель дерева с одним потомком или двумя
//          * @param value
//          * @param left
//          * @param right
//          */
//         public BinaryTree(int value, BinaryTree left, BinaryTree right) {
//             this.value = value; 
//             this.left = left;
//             this.right = right;
//         }
//     /**
//      * модель без потомков
//      * @param value
//      */
//         public BinaryTree(int value) {
//             this.value = value;
            
//         }
//         /**
//          * сумма всего дерева
//          * @return
//          */
//         public int sum(){
//             int sum = value;
//             if (left != null) {
//                 sum += left.sum();
//             }
//             if (right != null) {
//                 sum += right.sum();
//             }
//             return sum;
//         }
//     }
// }
