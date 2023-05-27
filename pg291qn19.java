import java.util.Scanner;
public class pg291qn19
{
    static void main(){ 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter String");
        String s=in.nextLine();
        s=s.toUpperCase()+" ";
        int b=0,c=0;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)==' '){
               String word=s.substring(b,i);
               b=i+1;
               for(int j=0;j<word.length()-1;j++){
                   if(word.charAt(j)== ((char)word.charAt(j+1))) {c++;System.out.println(word);break;} 
               }
           }
        
        }
        System.out.println("Number of words containing consecutive letters "+c);
    }
}
