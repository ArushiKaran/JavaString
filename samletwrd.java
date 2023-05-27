import java.util.Scanner;
public class samletwrd
{    static void main(){
           Scanner in=new Scanner(System.in);
           String s=in.nextLine();int b=0;s=s.toUpperCase()+" ";
           for(int i=0;i<s.length();i++){
               if(s.charAt(i)==' '){String st=s.substring(b,i);b=i+1;if (st.charAt(0)== st.charAt(st.length()-1))System.out.println(st);else continue;}
           }
        }
}
