package grokkingpatterns.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNodeNext {
    int val;
    TreeNodeNext left;
    TreeNodeNext right;
    TreeNodeNext next;

    TreeNodeNext(int x) {
        val = x;
        left = right = next = null;
    }

    // level order traversal using 'next' pointer
    void printLevelOrder() {
        TreeNodeNext nextLevelRoot = this;
        while (nextLevelRoot != null) {
            TreeNodeNext current = nextLevelRoot;
            nextLevelRoot = null;
            while (current != null) {
                System.out.print(current.val + " ");
                if (nextLevelRoot == null) {
                    if (current.left != null)
                        nextLevelRoot = current.left;
                    else if (current.right != null)
                        nextLevelRoot = current.right;
                }
                current = current.next;
            }
            System.out.println();
        }
    }
};

class ConnectLevelOrderSiblings {
    public static void connect(TreeNodeNext root) {
        if (root == null)
            return;

        Queue<TreeNodeNext> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<TreeNodeNext> list = new ArrayList<>();
            while (levelSize > 0) {
                TreeNodeNext node = queue.poll();
                if (node == null)
                    continue;
                list.add(node);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                levelSize--;
            }

            for (int i = 0; i < list.size() - 1; i++) {
                TreeNodeNext currentNode = list.get(i);
                currentNode.next = list.get(i + 1);
            }


        }

    }

    public static void main(String[] args) {
        TreeNodeNext root = new TreeNodeNext(12);
        root.left = new TreeNodeNext(7);
        root.right = new TreeNodeNext(1);
        root.left.left = new TreeNodeNext(9);
        root.right.left = new TreeNodeNext(10);
        root.right.right = new TreeNodeNext(5);
        ConnectLevelOrderSiblings.connect(root);
        System.out.println("Level order traversal using 'next' pointer: ");
        root.printLevelOrder();
    }
}
