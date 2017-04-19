import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by mikhailovra on 18.04.2017.
 */
public class tictok {



    public static int calc(String term1, String op, String term2) {
        switch ( op ) {
            case "+":
                return Integer.parseInt( term1 ) + Integer.parseInt( term2 );

            case "-":
                return Integer.parseInt( term1 ) - Integer.parseInt( term2 );

            case "*":
                return Integer.parseInt( term1 ) * Integer.parseInt( term2 );

            case "/":
                return Integer.parseInt( term1 ) / Integer.parseInt( term2 );

            default:
                return 0;

        }
    }


    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String term1 = bufferedReader.readLine();
        String op = bufferedReader.readLine();
        String term2 = bufferedReader.readLine();

        System.out.println(calc( term1, op, term2 ));
    }


}
