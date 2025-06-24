# 🔁 LeetCode 141: Linked List Cycle

## 📘 Problem Statement

Given the `head` of a linked list, determine if the list has a **cycle**.

A linked list has a cycle if there exists a node in the list that can be reached again by continuously following the `next` pointer.

> Note: The `pos` value (used to denote the index of the node that the tail connects to) is used internally and is **not** passed as a parameter.

---

## 📊 Examples

### ✅ Example 1
**Input:** `head = [3,2,0,-4]`, `pos = 1`  
**Output:** `true`  
**Explanation:** Tail connects to the 1st node (0-indexed).

### ✅ Example 2
**Input:** `head = [1,2]`, `pos = 0`  
**Output:** `true`  
**Explanation:** Tail connects to the 0th node.

### ✅ Example 3
**Input:** `head = [1]`, `pos = -1`  
**Output:** `false`  
**Explanation:** No cycle in the list.

---

## 📌 Constraints

- `0 <= n <= 10⁴` (Number of nodes)
- `-10⁵ <= Node.val <= 10⁵`
- `pos` is `-1` or a valid index in the linked list.

---

## 🧠 Approach – Floyd’s Cycle Detection (Tortoise and Hare)

- Use two pointers: `slow` moves 1 step, `fast` moves 2 steps.
- If a cycle exists, they will meet.
- If `fast` reaches the end (`null`), there is **no cycle**.

---

## ✅ Java Code

```java
// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
