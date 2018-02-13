package calculator;

import oracle.jrockit.jfr.StringConstantPool;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Calculator {

    public String calculate(String[] expression) {
        String a = expression[0];
        String b = expression[2];
        String op = expression[1];

        double da = Double.parseDouble(a);
        double db = Double.parseDouble(b); // 0.0

        double result;
        switch (op){
            case "+": // mozhno dobavit' case "3": knopka dlja nazhatija
            result = da + db;
            break; // bez etogo srazu peredet k return "error";
            case "-":
                result = da - db;
                break;
            case "*":
                result = da * db;
                break;
            case "/":
                result = da / db;
                break;
            default:
                return "Error"; // na slu4ai oshibki

        }

        return String.valueOf(result); // viklu4aet stroki

    }

}
