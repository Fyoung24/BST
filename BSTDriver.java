/** FY
 * BST DRIVER
 * AT
 * 3/5/24
 * **/
public class BSTDriver {
    public static void main(String[] args) {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        bst.put(5, "five");
        bst.put(3, "three");
        bst.put(7, "seven");
        bst.put(2, "two");
        bst.put(4, "four");
        bst.put(6, "six");
        bst.put(8, "eight");
        System.out.println(bst);
        System.out.println(bst.get(5));
        System.out.println(bst.get(3));
        System.out.println(bst.get(7));
        System.out.println(bst.get(2));
        System.out.println(bst.get(4));
        System.out.println(bst.get(6));
        System.out.println(bst.get(8));
        System.out.println(bst.contains(5));
        System.out.println(bst.contains(3));
        System.out.println(bst.contains(7));
        System.out.println(bst.contains(2));
        System.out.println(bst.contains(4));
        System.out.println(bst.contains(6));
        System.out.println(bst.contains(8));
        System.out.println(bst.min());
        System.out.println(bst.max());
        System.out.println(bst.remove(5) + " was removed.");
        System.out.println(bst);
        System.out.println(bst.remove(3) + " was removed.");
        System.out.println(bst);
        System.out.println(bst.remove(7) + " was removed.");
        System.out.println(bst);
        System.out.println(bst.remove(2) + " was removed.");
        System.out.println(bst);
        System.out.println(bst.remove(4) + " was removed.");
        System.out.println(bst);
        System.out.println(bst.remove(6) + " was removed.");
        System.out.println(bst);
        System.out.println(bst.remove(8) + " was removed.");
        System.out.println(bst);
    }
}
