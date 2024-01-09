import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

class Leaf_Similar_Trees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        createLeaf(root1, list1);
        createLeaf(root2, list2);

        if(list1.size() != list2.size()){
            return false;
        }

        for(int i=0; i< list1.size(); i++){
            if(list1.get(i) != list2.get(i)){
                return false;
            }
        }
        return true;
    }

    public static void createLeaf(TreeNode root, List<Integer> list){
        if(root == null)return;
//        if(root.left == null && root.right == null){
//            list.add(root.val);
//            return;
//        }
//
//        createLeaf(root.left,list);
//        createLeaf(root.right,list);
    }
}


//872. Leaf-Similar Trees
//
//        Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
//
//
//
//        For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
//
//        Two binary trees are considered leaf-similar if their leaf value sequence is the same.
//
//        Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
//
//
//
//        Example 1:
//
//
//        Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
//        Output: true
//        Example 2:
//
//
//        Input: root1 = [1,2,3], root2 = [1,3,2]
//        Output: false
//
//
//        Constraints:
//
//        The number of nodes in each tree will be in the range [1, 200].
//        Both of the given trees will have values in the range [0, 200].