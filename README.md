
# LeetCode Challenge D5
## Achievements
[![image.png](https://i.postimg.cc/pTMcrxNC/image.png)](https://postimg.cc/xkg3pw1N)

This solution outperformed 100% of Java users on LeetCode according to runtime metrics and 83.36% according to memory metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by  [13.  Roman to Integer](https://leetcode.com/problems/roman-to-integer/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement

This task involves converting a Roman numeral, represented by symbols I, V, X, L, C, D, and M, into its equivalent integer value. Roman numerals follow specific rules, including additive and subtractive combinations, with exceptions for numerals like IV (4) and IX (9). The goal is to implement a solution that accurately performs this conversion.


**Example**

> **Input:** s = "III"
> 
> **Output:** 3
>
> **Explanation:** III = 3.

**Language Used**
> Java

**Difficulty**

> Easy



## Solution Overview

First the solution initializes arrays for characters and their corresponding values. It then iterates through the string, assigning values based on Roman numeral rules. The second loop calculates the total integer, considering additive and subtractive combinations.

```cpp
class Solution {  
    public int romanToInt(String s) {  
        char[] charArray = s.toCharArray();  
        int[] intArray = new int[s.length()];  
        int value = 0;  
  
        for(int i=0; i<s.length(); i++){  
            switch(charArray[i]){  
                case 'I':  
                    intArray[i] = 1;  
                    break;  
                case 'V':  
                    intArray[i] = 5;  
                    break;  
                case 'X':  
                    intArray[i] = 10;  
                    break;  
                case 'L':  
                    intArray[i] = 50;  
                    break;  
                case 'C':  
                    intArray[i] = 100;  
                    break;  
                case 'D':  
                    intArray[i] = 500;  
                    break;  
                case 'M':  
                    intArray[i] = 1000;  
            }  
        }  
        int j = 0;  
        for(j = 0; j<intArray.length - 1; j++){  
            if(intArray[j] >= intArray[j+1]){  
                value = value + intArray[j];  
            }  
            else if(intArray[j+1]>intArray[j]){  
                value = value + intArray[j+1] - intArray[j];  
                j++;  
            }  
        }  
        if(j==intArray.length - 1){  
            value = value + intArray[j];  
        }  
        return value;  
    }  
}
```




