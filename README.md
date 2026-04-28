Alibayev Danial

IT-2504

Analysis Questions 

1)Which sorting algorithm performed faster? Why?

Merge Sort (Advanced) is significantly faster for larger datasets. While Selection Sort has a time complexity of O(n^2), Merge Sort operates at O(n logn), making it more efficient as the input size grows.

2)How does performance change with input size?

For Selection Sort, doubling the input size roughly quadruples the time. For Merge Sort, the time increases much more slowly, almost linearly.

3)How does sorted vs unsorted data affect performance?

Selection Sort always scans the remaining elements, so it performs the same regardless of initial order. Merge Sort is also consistent due to its divide-and-conquer nature. 

4)Do the results match the expected Big-O complexity?

Yes. The quadratic growth of Selection Sort and the logarithmic growth of Merge Sort and Binary Search become visible as the array size increases from 10 to 1000.

5)Which algorithm is more efficient? Why?

Binary Search is more efficient than Linear Search because it eliminates half of the remaining elements in each step, resulting in O(log n) complexity as Merge Sort (O(n log n)).
 
6)Why does Binary Search require a sorted array?

Binary Search relies on the principle that if the target is greater than the middle element, it must be in the right half. Without a sorted order, this logic fails as the target could be anywhere.

A.Project Overview

I used Selection Sort as basic sort and Merge Sort as Advanced Sort. I used Binary Search. Experiment was created on purpose to show which algorithm is faster with different size arrays. 

B.Algorithm Description

Selection Sort divides the input list into two parts a sorted sublist at the beginning and a remaining unsorted sublist. It repeatedly selects smallest element from the unsorted section and swaps it with the unsorted element. Time complexity - O(n^2).

Merge Sort splits the array into halves until each sub-array contains a single elment. It then merges those sub arrays back together in the correct order.Time complexity - O(n log n).

Binary Search jumps to the middle of the sorted array. If the target is smaller than the middle element, it eliminates the right half. If larger , it eliminates the left half. It repeats until the item is found. Time complexity - O(n log n).

C.Experimental Results

<img width="602" height="186" alt="image1" src="https://github.com/user-attachments/assets/bf711e91-eaed-4161-854f-f5f585ac177b" />

The following table represents the execution time (in milliseconds) of the test run. Over multiple test runs execution time changes because sorting and searching methods have their best and worse cases. For example, Binary Search's best case is if the element is in the middle because algorithm will use only 1 step of the loop. However, Merge Sort always has less execution time than Selection Sort because of the complexity.

D.Screenshots

<img width="602" height="186" alt="image1" src="https://github.com/user-attachments/assets/bf711e91-eaed-4161-854f-f5f585ac177b" />

<img width="608" height="163" alt="image2" src="https://github.com/user-attachments/assets/79837d08-1b5c-469f-93ac-bea74e94a991" />

<img width="604" height="165" alt="image3" src="https://github.com/user-attachments/assets/61a5da3f-5af6-4a43-b2a2-7d8d039f00a0" />


E.Reflection Section

Through this implementation I understand why O(n log n) is the gold standard for general-purpose sorting. Selection Sort is the simpliest code, so its performance went down as soon as the input reached 1000 elements. As the result, Selection Sort is practically useless for big data. Merge Sort is many times efficient than the Selection Sort for big data. This is because Merge Sort Time to Size graph increases slowly O(n log n). Binary Search is also powerful, but it can not be used without sorted array. 
