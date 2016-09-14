# FindSumPathInBinaryTree
Given a binary tree, find all the paths that sums to a given value

create an array with size of the depth of the root

write data into the array, sum the array from index level to index 0, if sum==value, print it, keep adding and checking until index 0 since there maybe negative value, differnt paths may cover each other

*Calculate from the end node to root, use int level to pass the information and recursion


