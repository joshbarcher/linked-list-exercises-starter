package lists;

/**
 * This class contains a group of linked list operations
 *
 * @author Josh Archer
 * @author <your-name>
 * @version 1.0
 */
public class ListOperations
{
    /**
     * Joins together three linked lists into a single linked
     * list. The elements in the first list come first, then
     * the elements in the second, and finally the elements in
     * the third list.
     *
     * @param first the head of the first list
     * @param second the head of the second list
     * @param third the head of the third list
     * @return the head reference of the new list
     */
    public Node join(Node first, Node second, Node third)
    {
        return null;
    }

    /**
     * Merges elements from two linked lists into a new list,
     * where elements are alternating between the two lists.
     *
     * Note: You can assume that the lists are of the same length
     *
     * @param first the head of the first list
     * @param second the head of the second list
     * @return the head reference of the new list
     */
    public Node merge(Node first, Node second)
    {
        return null;
    }

    /**
     * Reports whether a linked list is circular or not.
     *
     * @param head the head reference of a linked list
     * @return returns true if the list is circular or false otherwise
     */
    public boolean isCircular(Node head)
    {
        return false;
    }

    /**
     * Returns the element in the central element in a linked list.
     *
     * Note: The central position in a list with an odd number of elements
     * is self-explanatory. For even sized lists, you should pick the
     * lower index at the splitting point.
     *
     * Hint: You will need to first count the number of elements in
     * the list before you can find the middle element. This problem
     * requires multiple traversals of the list
     *
     * @param head the head reference of a linked list
     * @return the element found in the central Node
     */
    public int findMiddle(Node head)
    {
        return 0;
    }

    /**
     * Accepts a list of sorted elements in linked list nodes
     * and inserts a new value into the list in sorted order.
     *
     * Note: To make things easier for this method, you can assume
     * that the list is only working with integer elements.
     *
     * @param head the head of a sorted linked list, each element in
     *             the list should store an integer
     * @return returns the head of the linked list after the insert
     * has completed
     */
    public Node insertSorted(Node head, int newValue)
    {
        return null;
    }

    /**
     * Finds the first occurrence of an element in the linked list,
     * then removes the Node containing that element and moves the
     * Node to the end of the list.
     *
     * Note: You can assume that the search value exists somewhere
     * in the list.
     * Note: This method should only move the first occurrence of
     * the search value when found.
     *
     * @param head the head reference of a linked list
     * @param searchValue the element to search for
     * @return returns the head of the list after the element has
     * moved
     */
    public Node moveToEnd(Node head, int searchValue)
    {
        return null;
    }

    /**
     * Accepts a reference to a linked list of sorted values, then
     * reports whether the elements are in sorted order.
     *
     * Note: To make things easier for this method, you can assume
     * that the list is only working with integer elements.
     *
     * @param head the head reference of the sorted list
     * @return returns true if the list is sorted, or otherwise false
     */
    public boolean isSorted(Node head)
    {
        return false;
    }

    /**
     * Removes the first Node from the linked list and moves
     * it to the end of the list. The new head reference of
     * the list is then returned.
     *
     * @param head the head reference of the list
     * @return the new head reference after moving the front
     * Node to the end of the list
     */
    public Node firstToLast(Node head)
    {
        return null;
    }

    /**
     * Accepts a linked list of sorted elements and removes
     * all duplicate elements from the list.
     *
     * Note: To make things easier for this method, you can assume
     * that the list is only working with integer elements.
     *
     * @param head the head reference of the linked list
     * @return returns the head reference of the list after removing
     * all duplicate elements
     */
    public Node removeDuplicates(Node head)
    {
        return null;
    }

    /**
     * A recursive method that prints out the elements of a
     * link lists in reverse order. Elements at higher indices
     * should be printed before lower indices in the list.
     *
     * @param head the head reference to a linked list
     */
    public void printBackwards(Node head)
    {

    }

    /**
     * Reports whether two linked lists contain the same elements
     * at the same positions in each list.
     *
     * @param first the reference to the first linked list
     * @param second the reference to the second linked list
     * @return returns true if both lists contain the same elements
     * at the same positions in each list, otherwise it returns false
     *
     * Note: Comparisons between elements should be made using
     * the equals() method.
     */
    public boolean areEqual(Node first, Node second)
    {
        return false;
    }

    /**
     * Swaps the positions of two elements in a linked list.
     *
     * Hint: You do not need to adjust any Node references in the list.
     * Only the elements in two Nodes need to be swapped.
     *
     * @param head the reference to a linked list
     * @param firstIndex the first index of an element in the list
     * @param secondIndex the second index of an element in the list
     */
    public void swap(Node head, int firstIndex, int secondIndex)
    {

    }

    /**
     * Accepts a linked list of integers and returns a partition of
     * the elements in the list around a pivot value. The method returns
     * two linked lists, in an array, where the first linked list has
     * elements found in the input list smaller than the pivot and
     * the second linked list has elements found larger than the pivot.
     * Elements equal to the pivot should be ignored.
     *
     * @param head the reference to a linked list
     * @param pivot the element to pivot around
     * @return two linked lists in an array
     */
    public Node[] partition(Node head, int pivot)
    {
        return null;
    }

    /**
     * Accepts a linked list and removes the element in the list
     * at the specified position.
     *
     * Note: You can assume that you are given a valid index in the
     * list.
     *
     * @param head the reference to a linked list
     * @param index the position of an element to remove in the linked list
     * @return the head reference of the list after the removal
     */
    public Node removeAt(Node head, int index)
    {
        return null;
    }

    /**
     * Accepts a circular linked list and reports whether the list
     * has the same number of elements as the input size value.
     *
     * @param head the reference to a linked list
     * @param size the size value
     * @return returns true if the number of elements in the list is
     * equal to size, otherwise false
     */
    public boolean isSizeAccurate(Node head, int size)
    {
        return false;
    }
}
