import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.*;

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

    public static String checkOp(char[] str){
        String[] parse_str = new String[str.length];
        int i = 0;
        System.out.println(parse_str.length);
        System.out.println(str.length);
        while (str.length > i){
            parse_str[i] = String.valueOf( str[i] );
            i++;
        }
        String op = "";
        for (int j = 0; parse_str.length > j; j++ ){
            if (!parse_str[j].equals( "+" ) || !parse_str[j].equals( "-" ) || !parse_str[j].equals( "*" ) || !parse_str[j].equals( "/" ))
                j++;
            else
                op = parse_str[j];
        }
        return op;
    }


    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        /*String term1 = bufferedReader.readLine();
        String op = bufferedReader.readLine();
        String term2 = bufferedReader.readLine();

        System.out.println(calc( term1, op, term2 ));
        */
        String str = bufferedReader.readLine();
        char[] cs = str.toCharArray();

        String[] str_array = str.split( "\\W" );
        System.out.println(calc( str_array[0],checkOp( cs ), str_array[1] ));



        /*if(str.matches("^[0-9]*\\s*[\\D]\\s*[0-9]*$")) {
            int i = 0;
            while (cs.equals( "\\d" ){


            }
        }*/
        //System.out.println(calc(split[0], split[1],split[2]));



    }


}
