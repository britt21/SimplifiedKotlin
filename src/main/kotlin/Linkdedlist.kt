import org.w3c.dom.Node


class ListNode(var data: Int) {
    var next: ListNode? = null
}

fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head

    while (fast?.next != null && fast.next?.next != null && slow?.next != null) {
        slow = slow.next
        fast = fast.next?.next

        if (slow == fast) {
            return true // Cycle detected
        }
    }

    return false // No cycle detected
}

fun main(args: Array<String>) {
    // Example usage:
    // Creating a linked list with a cycle
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    val node4 = ListNode(4)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node2 // Creating a cycle: node4 points back to node2

    val hasCycleResult = hasCycle(node1)
    println("Does the linked list have a cycle? $hasCycleResult")
}