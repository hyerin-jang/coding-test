package inflearn.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
    public String solution(String str){
        String answer="YES";
        Stack<Character> stack=new Stack<>();
        for(char x : str.toCharArray()){
            if(x=='(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args){
        Parenthesis T = new Parenthesis();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
}