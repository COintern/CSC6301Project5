Here's how the program works:
This code will read integers from the user, store them in a stack, sort them in ascending order, and then print the sorted list from smallest to largest.

Changes came with Project 5 Update:

We change LinkedList to Stack to use a stack data structure.

We use numbers.push(num) to push integers onto the stack instead of numbers.add(num).

After reading all integers, we sort the stack in ascending order using Collections.sort(numbers).

To display the sorted list, we use a while loop that pops elements from the stack using numbers.pop() until the stack is empty.


Took from Project 4:
Import the necessary classes from the Collections Framework, including LinkedList and Collections.

Create a LinkedList called numbers to store the input integers.

Use a Scanner to read integers from the user until a non-integer input is encountered.

The integers are added to the numbers LinkedList as they are read.

After reading all input, we use the Collections.sort() method to sort the numbers LinkedList in ascending order.

Finally, we iterate through the sorted list and display the sorted integers
