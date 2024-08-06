/*
Problem statement
Send feedback
You are given a string ‘S’ of length ‘N’.
A string is a valid parentheses if it satisfies one of the following conditions:
● If the string is empty.
● If the string can be represented as a concatenation of two strings such that both strings are valid parentheses.
● If the string can be represented as '(A)', where ‘A’ is a valid parenthesis.
A valid parentheses is called primitive if it cannot be divided into two strings, ‘A’ and ‘B’, such that ‘A’+’B’=’S’
and both ‘A’ and ‘B’ are valid parentheses.
Let ‘S’ be represented as ‘S’ = ‘P1’ + ‘P2’ + ‘P2’ + .. + ‘Pn’, where ‘Pi’ is a primitive valid parentheses.
Given a valid parenthesis ‘S’. You must return the string after removing the outermost parentheses of each primitive
parentheses. If the string after removing the outermost parentheses is empty, return ‘Empty String’.
Example:
For S = '(()()())(()())', N=14
The string returned is  "()()()()()"
Explanation: The given string ‘S’ can be divided into two primitive strings, ‘(()()())’ and ‘(()())’.
After removing the outermost parentheses of both the substring, we concatenate ‘()()()’ and ‘()()’.
Hence we return ‘()()()()()’
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
6
(())()
Sample Output 1:
()
Explanation Of Sample Input 1:
Input:
S = '(())()', N=6
Output:
'()'

Explanation: The given string ‘S’ can be divided into two primitive strings, ‘(())’ and ‘()’. After removing both substring's outermost parentheses, we concatenate ‘()’ and ‘’.

Hence we return ‘()’.
Sample Input 2:
6
()()()
Sample Output 2:
Empty String
Constraints:
1 <= N <= 10^5
’S’ consist of characters ‘(’ and ‘)’.
Time Limit: 1 sec
 */


package codingChallenges;

public class RemoveOutermostParentheses {
    public static String removeOuterMostParentheses(String s) {
        // Write your code here.
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for(char ch : s.toCharArray()){
            if(ch =='('){
                if(depth > 0){
                    result.append(ch);
                }
                depth++;
            } else if (ch == ')'){
                if(depth > 1) {
                    result.append(ch);
                }
                depth--;
            }
        }

        if(result.length() == 0){
            return "Empty String";
        }

        return result.toString();
    }

    public static void main(String[] args){
        System.out.println(removeOuterMostParentheses("(())()"));
        System.out.println(removeOuterMostParentheses("()()()"));
        System.out.println(removeOuterMostParentheses("(()()())(()())"));
    }
}
