# Binary Search Tree (BST)

A **Binary Search Tree** is a binary tree where each node follows this rule:

- All values in the **left subtree** are smaller than the node value.
- All values in the **right subtree** are greater than the node value.
- Both left and right subtrees are also BSTs.

## Why BST is Useful

BST allows efficient operations (average case):

- **Search**: `O(log n)`
- **Insert**: `O(log n)`
- **Delete**: `O(log n)`

> Worst case can degrade to `O(n)` when tree becomes skewed.

## Common Operations in Java

```java
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class BinarySearchTree {
    TreeNode root;

    TreeNode insert(TreeNode node, int key) {
        if (node == null) return new TreeNode(key);

        if (key < node.val) {
            node.left = insert(node.left, key);
        } else if (key > node.val) {
            node.right = insert(node.right, key);
        }
        return node;
    }

    boolean search(TreeNode node, int key) {
        if (node == null) return false;
        if (node.val == key) return true;
        return key < node.val ? search(node.left, key) : search(node.right, key);
    }

    // Inorder traversal of BST returns sorted values
    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }
}
```

## Key Interview Points

- Inorder traversal of BST is always sorted.
- To validate BST, keep a valid range `(min, max)` for each node.
- Deletion has 3 cases:
  1. Node with no child
  2. Node with one child
  3. Node with two children (replace with inorder successor/predecessor)

## Popular LeetCode Problems on BST

- 98. Validate Binary Search Tree
- 700. Search in a Binary Search Tree
- 701. Insert into a Binary Search Tree
- 450. Delete Node in a BST
- 230. Kth Smallest Element in a BST
