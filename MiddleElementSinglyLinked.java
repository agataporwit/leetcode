//solution 1

class Node {
    int data;
    Node next;
};

class LinkedList {
    Node head;
    //Constructor to create an empty LinkedList
    LinkedList() {
        head = null;
    }

    // Middle returns the middle node in the given linked list
    Node MiddleNode() {
        // Get the total node count
        int nodeCount = 0;
        Node currentNode = new Node();
        currentNode = head;
        while (currentNode != null) {
            nodeCount++;
            currentNode = currentNode.next;
        }

        int middleNodeCount = nodeCount / 2;

        // Reach the middle node
        currentNode = head;
        int currentCount = 0;
        while (currentCount < middleNodeCount) {
            currentCount++;
            currentNode = currentNode.next;
        }
        return currentNode;
    }
}

//solution 2 
class Node {
    int data;
    Node next;
};

class LinkedList {
    Node head;
    //Constructor to create an empty LinkedList
    LinkedList() {
        head = null;
    }

    // Middle returns the middle node in the given linked list
    Node MiddleNode() {
        // Define slow and fast pointers to initially pointing to head node
        // Move slow by one step and fast by 2 steps in each iteration
        // At the end of the loop slow points to the middle of the list
        Node slow = new Node();
        slow = head;

        Node fast = new Node();
        fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
