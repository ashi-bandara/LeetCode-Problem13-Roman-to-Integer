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