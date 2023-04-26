import java.io.IOException;

public class Calculadora{
    public static void main(String args[]) throws IOException
    {
        double a,b,res=0;
        char sair = ' ';

        while(true){
            Saida.printa("Para para sair digite S ou s");
            sair = Entrada.getchar();
            if(sair == 's' || sair == 'S')break;

            Saida.printa("Informe o valor do primeiro numero: ");
            a = Entrada.getdouble();

            Saida.printa("Informe o valor do segundo numero: ");
            b = Entrada.getdouble();

            Saida.printa("Digite qual operacao deseja fazer: + , - , / , *: ");
            char operacao = Entrada.getchar();
            
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
            Saida.printa(msg+" "+res);
        }
        Saida.printa("Encerrado.\n");
    }
}

   

    //funcao para ler uma string digitada no console, essa string ira para as demais funções de scan
    

   

