import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora{
    public static void main(String args[]) throws IOException
    {
        double a,b,res=0;
        char sair = ' ';

        while(true){
            printa("Para para sair digite S ou s");
            sair = getchar();
            if(sair == 's' || sair == 'S')break;

            printa("Informe o valor do primeiro numero: ");
            a = getdouble();

            printa("Informe o valor do segundo numero: ");
            b = getdouble();

            printa("Digite qual operacao deseja fazer: + , - , / , *: ");
            char operacao = getchar();
            
            String msg = "Invalido";
            switch(operacao){
                case '+':
                    res = a + b;
                    msg = "A soma eh: ";
                break;
                case '-':
                    res = a-b;
                    msg = "A diferenca eh: ";
                break;
                case '/':
                    if(b==0){
                        res = 000000000000000;
                        msg = "Erro. Divisao por zero";
                    }else{
                        res = a/b;
                        msg = "A divisao eh igual a: ";
                    }
                break;
                case '*':
                    res = a * b;
                    msg = "O produto eh: ";
                break;
            }
            printa(msg+" "+res);
        }
        printa("Encerrado.\n");
    }

    static void printa(String str){
        System.out.println(str);
    }

    //funcao para ler uma string digitada no console, essa string ira para as demais funções de scan
    static String getstr() throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        String str = br.readLine();
        return str;
    }

    //funcao parar ler double
    static double getdouble() throws IOException{
        String str = getstr();
        double num = 0;
        int i = 0;
        while(i<str.length()){
            if((str.charAt(i) >= '0' && str.charAt(i) <='9') || str.charAt(i) == '.' || str.charAt(i)=='-'){
                i++;
                continue;
            }else return num;
        }
        num = Double.parseDouble(str);
        return num;
    }

    //ler char
    static char getchar() throws IOException{
        String str = getstr();
        char ch ='e';
        if(str.length()>= 1)
            ch = str.charAt(0);
        return ch;
    }

    //ler int, nao utilizada no código por isso nao é static, está aq para ser reaproveitada
    int getint() throws IOException{
        String str = getstr();
        int num = 0;
        int i = 0;
        while(i<str.length()){
            if((str.charAt(i) >= '0' && str.charAt(i) <='9') ||str.charAt(i)=='-'){
                i++;
                continue;
            }else return num;
        }
        num = Integer.parseInt(str);
        return num;
    }
}


