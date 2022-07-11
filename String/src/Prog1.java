/*Valid parenthesis */

public class Prog1 {

        static class s{
            char[] a =new char[(int)Math.pow(10,4)];
            int top=-1;

            public boolean push(char x ){
                if(top==-1)
                {a[++top]=x;
                    System.out.println(a[top]);return true;}

            else if(top==a.length-1){
                    return false;
                }
            else{
                a[++top]=x;
                    System.out.println(a[top]);
                return true;
                }
        }
            public char pop(){
            if(top<0)
                return '1';
            else
            {
                return a[top--];
            }
            }
        }

        s ss= new s();

        public boolean isValid(String str){
            char[] ch =str.toCharArray();
            //char c=ss.pop();
            System.out.println(ch);
            if(ch.length%2==1)
            {
                System.out.println(ch); return false;}
            else {
                for (char cha : ch)
                {
                    System.out.println(cha);
                    switch (cha) {
                        case '(':
                        case '{':
                        case '[':
                            ss.push(cha);
                            break;
                        case ')':
                            char ge= ss.pop();
                            if (ge== 1 || ge != '(') {
                                return false;
                            }break;
                        case '}':
                            char gi= ss.pop();
                            if (gi== 1 || gi != '{') {
                                return false;
                            }break;
                        case ']':
                            char g= ss.pop();
                            if (g == 1 || g != '[') {
                               System.out.println("a"+g);
                                return false;
                            }break;                   //it was falling through and getting false for every answer,
                                                      //I forgot to use break after if

                    }}
            }
            return true;
        }

    public static void main(String[] args) {
            String s="(){";
            Prog1 ob=new Prog1();
        System.out.println(ob.isValid(s));
    }


/*   Better leet code solution
               Stack<Character> stack = new Stack<Character>();
                for (char c : s.toCharArray()) {
                    if (c == '(')
                        stack.push(')');
                    else if (c == '{')
                        stack.push('}');
                    else if (c == '[')
                        stack.push(']');
                    else if (stack.isEmpty() || stack.pop() != c)
                        return false;
                }
                return stack.isEmpty();*/
}
