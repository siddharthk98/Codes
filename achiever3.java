import java.util.*;
class achiever3
{
    static void in()
    {
        String brackets;
        Scanner sc = new Scanner(System.in);
        brackets = sc.next();
        check(brackets);
    }
    static void check(String brackets)
    {
        Stack<Character> s = new Stack<Character>();
        int i=0;
        for(i=0;i<brackets.length();i++)
        {
            if(brackets.charAt(i) == '(' || brackets.charAt(i) == '[' || brackets.charAt(i) == '{')
            {
                s.push(brackets.charAt(i));
            }
            if((brackets.charAt(i) == ')' && s.peek() == '(') || (brackets.charAt(i) == ']' && s.peek() == '[' ) || ( brackets.charAt(i) == '}' && s.peek()=='{'))
            {
                 s.pop();
            }
        }
        if(s.isEmpty())
        System.out.print("Balanced");
        else
        System.out.println("unbalanced");
    }
    public static void main(String args[])
    {
        in();
    }
}