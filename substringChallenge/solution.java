import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String temp="";
        int m,l;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        int len=s.length();

        for (int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){

                if((j-i)==k){
                    if((smallest.length()==0) && largest.length()==0){
                             largest=smallest=s.substring(i,j);
                                
                    }
                    else{
                           temp=s.substring(i,j);
                           m=temp.compareTo(smallest);
                           l=temp.compareTo(largest);

                           if(m<0){
                               smallest=temp;
                           }
                           if(l>0){
                               largest=temp;
                           }
                    }

                    
                }

            }
        }
        
        return smallest + "\n" + largest;
    }

