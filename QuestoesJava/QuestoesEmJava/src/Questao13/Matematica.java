package Questao13;

public class Matematica {

    public static int fatorial(int n){
        if(n==1){
            return 1;
        }
        return n*fatorial(n-1);
    }

}
