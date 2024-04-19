package Percobaan3;

public class PostFix20 {
    int n,top;
    char[] stack;

    public PostFix20(int total){
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char c){
        top++;
        stack[top] = c;
    }

    public char pop(){
        char item = stack[top];
        top--;
        return item;
    }

    //is operand
    public boolean isOperand(char c){
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ||
        (c >= '0' && c <= '9') || c == ' ' || c == '.'){
            return true;
        }else{
            return false;
        }
    }

    //is operator
    public boolean isOperator(char c){
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^'|| c=='%');

    }

    //derajat
    public int derajat(char c){
        switch (c) {
            case '^':
                return 3;
            case '*':
            case '/':
            case '%':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    //konversi
    public String konversi (String Q){
        String P = "";
        char c;
        for (int i =0 ; i<n; i++){
            c = Q.charAt(i);
            if(isOperand(c)){
                P += c;
            } if(c == '('){
                push(c);
            } if(c == ')'){
                while(stack[top] != '('){
                    P += pop();
                }
                pop();
            }if(isOperator(c)){
                while(derajat(stack[top]) >= derajat(c)){
                    P += pop();
                }
                push(c);
            }
        }
        return P;
    }
}
