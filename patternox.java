
public class patternox
{static void main(){
    char x='*',y='#';
    for(int i=0;i<5;i++){
        for(int j=0;j<=i;j++){
            if(j%2==0)System.out.print(x);else System.out.print(y);
        }System.out.println("");
    }
    for(int i=1;i<6;i++){
        for(int j=5;j>=i;j--){
            System.out.print(j);
        }System.out.println();
    }
}
}
