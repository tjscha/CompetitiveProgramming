import java.util.Stack;
import java.util.Scanner;

class parenth {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String s = in.next();

        Stack<Character> stack = new  Stack<>();
        Stack<Character> hold = new Stack<>();
        
        for(int i = 0; i<s.length(); i++){

            System.out.println(s.charAt(i));
            stack.push(s.charAt(i));
            System.out.println(stack.peek());

        }

        while(!stack.empty()){
            if(stack.peek() == ')' || stack.peek() == '}' || stack.peek() == ']'){
                System.out.println(stack.peek());
                hold.push(stack.pop());
            }else{
                System.out.println("false");
            }
            
            if(hold.peek() == ')'){
                
                if(stack.peek() !='('){
                    System.out.println("false");
                }
            }else if(hold.peek() == '}'){
                if(stack.peek() != '}'){
                    System.out.println("false");
                }
            }else if(hold.peek() == '['){
                if(stack.peek() != ']'){
                    System.out.println("false");
                }
            }
            stack.pop();
            hold.pop();

            
        }
        in.close();
        System.out.println("true");

    }

}