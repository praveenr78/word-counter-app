# Word Counter App

This is implementation of the word counter application to allow to add words
and return count of how many times the same word is added in any language.

## Solution
 On analysis of different possible approach the optimal solution was to build a binary search
 tree(BST) and node encapsulated with word and count. And search node by depth-first giving the
 best performance.  
 
 ```
 Note : Java 8 features,  Streams & Optional degrades the performance with high volumes of word added.
 Also regex degrades performance though it is precompiled. Hence not used in here.
```
