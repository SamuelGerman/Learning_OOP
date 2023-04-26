import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrada {
    static String getstr() throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        String str = br.readLine();
        return str;
    }

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
