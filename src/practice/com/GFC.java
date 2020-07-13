package practice.com;
// Java program to print all
// combinations of balanced parentheses
import java.io.*;

public class GFC
{

    static int _printParenthesis(char str[], int pos, int n, int open, int close, int count)
    {
        if(close == n)
        {
            // print the possible combinations
            for(int i=0;i<str.length;i++)
                System.out.print(str[i]);
            System.out.println();
            return count;
        }
        else
        {
            if(open > close) {
                str[pos] = '}';
                _printParenthesis(str, pos+1, n, open, close+1, count+1);
            }
            if(open < n) {
                str[pos] = '{';
                _printParenthesis(str, pos+1, n, open+1, close, count);
            }
        }
        return count;
    }

    // Wrapper over _printParenthesis()
    static void printParenthesis(char str[], int n)
    {
        int count =0;
        if(n > 0)
           count = _printParenthesis(str, 0, n, 0, 0, 0);
        return;
    }

    // driver program
    public static void main (String[] args)
    {
        int n = 3;
        char[] str = new char[2 * n];
        printParenthesis(str, n);

    }
}

