1. Anagram Checker in Java

Overview :
This Java program checks whether two input strings are anagrams of each other.
Two strings are called anagrams if they contain the same characters with the same frequency but arranged in a different order.
Example:
listen and silent → Anagram
evil and vile → Anagram
hello and world → Not Anagram

Program Logic :
The program follows these steps
1. Take two strings as input from the user.
2. Convert both strings to lowercase to avoid case mismatch (A vs a).
3. Check if the lengths are equal.
4. If not equal → they cannot be anagrams.
5. Convert both strings into character arrays.
6. Sort both arrays using Arrays.sort().
7. Compare both arrays using Arrays.equals().
8. If both arrays are equal → the strings are anagrams.

---

2. Find Longest Word in a Sentence (Java)

Overview :
This Java program finds the longest word in a given sentence.
The program takes a sentence from the user, splits it into words, and determines which word has the greatest length.

Program Logic : Steps used in the program

1. Take a sentence as input from the user.
2. Split the sentence into words using the "split()" method.
3. Traverse through each word.
4. Compare the length of each word.
5. Store the word with the maximum length.

---

3. Remove All Spaces from a String (Java)

Overview :
This Java program removes all spaces from a given string.
The program takes a string as input and returns the same string without any spaces.
Example:
Input
Java programming language
Output
Javaprogramminglanguage

Program Logic : The program performs the following steps

1. Take a string input from the user.
2. Traverse each character of the string.
3. Check whether the character is a space.
4. If it is not a space, append it to the result string.
5. Print the final string without spaces.

---

4. Check Balanced Parentheses (Java)
\
Overview :
This Java program checks whether the parentheses in a given string are balanced.
Balanced parentheses mean every opening bracket has a matching closing bracket in the correct order.
Examples:
Balanced
()
{}
({[]})
Not Balanced
(]
((()
{[}]

Logic Used :
The program uses a Stack data structure.
 Steps:
1. Traverse each character in the string.
2. Push opening brackets ( { [ into the stack.
3. When a closing bracket appears:
4. Check if the stack is empty.
5. Pop the top element.
6. Verify if it matches the closing bracket.
7. After traversal, if the stack is empty → parentheses are balanced.

---

5. Count Words in a Sentence (Java)

Overview :
This Java program counts the number of words in a sentence entered by the user.
The program reads a sentence, splits it into words using spaces, and prints the total word count.

Example :
Input
Enter a sentence:
Java programming is very powerful
Output
Total words in sentence:
5

Logic Used :
1. Take a sentence as input.
2. Remove extra spaces using trim().
3. Split the sentence using split("\\s+").
4. Count the number of words using the array length.

---
6. Print Duplicate Characters in a String (Java)

Overview :
This Java program prints duplicate characters present in a string along with their frequency.
A duplicate character is a character that appears more than once in the string.

Example :
Input
programming
Output
Duplicate characters are:
r : 2
g : 2
m : 2

Logic Used :
1. Convert the string to lowercase.
2. Convert the string into a character array.
3. Compare each character with the remaining characters.
4. Count occurrences of each character.
5. Print characters whose count is greater than 1.
