public class addandsubs{
    static int add(int a,int b){
        return(a+b);
    }
    static int subs(int a,int b)
{
    return (add(a,-b));
}
static void main(){
    int a=9;int b=5; System.out.println(subs(a,b));
}
}