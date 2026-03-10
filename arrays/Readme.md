1.Rotate Array by K Positions (Java)
📌 Overview :
This Java program rotates an array by k positions to the left.
Array rotation means shifting the elements of an array by a given number of positions.
Example:
Original Array: [1, 2, 3, 4, 5]
Rotate by k = 2
Result: [3, 4, 5, 1, 2]

🧠 Program Logic :
The program performs the following steps:
Take the array size from the user.
Accept array elements as input.
Ask the user for rotation value k.
Adjust k using k % n to handle cases where k > n.
Copy elements from index k to the end into a new array.
Copy the first k elements to the end of the new array.
Print the rotated array.

---

2.Find Missing Numbers from 1 to 100 (Java)
📌 Overview :
This Java program finds missing numbers from 1 to 100.
The user can enter numbers continuously.
When the user enters -1, the program stops taking input and prints all missing numbers.

🧠 Program Features :
Accepts numbers dynamically
Uses -1 as a stop signal
Tracks numbers using a boolean array
Prints all numbers missing from the range 1–100

---
3.Second Largest Number in an Array (Java)
📌 Overview :
This Java program finds the second largest number in an array entered by the user.
The program:
Takes array size as input
Accepts array elements from the user
Determines the second largest number using a single loop
Prints the result
This program demonstrates basic Java array handling, loops, and conditional logic.

🧠 Logic Used :
The program maintains two variables:
largest
secondLargest
Steps:
1. Traverse the array.
2. If the current number is greater than largest: Move largest to secondLargest Update largest.
3. If the number is smaller than largest but greater than secondLargest, update secondLargest.
4. This approach avoids sorting and works in O(n) time complexity.


