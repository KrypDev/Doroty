package doroty;

import java.util.ArrayList;
/**
 *
 * @author Richard Hdez.
 */
public class Main {

    public static void main(String[] args) {
        
        String datos = "statt#\n" +
"state _a.cad$\n" +
"si[12!_d2]{\n" +
"	modifica_a:12+23-43/_sd456*_asS1$\n" +
"	loop [12,[_s>543]]{\n" +
"		entra@{_ww}\n" +
"		sale@{'dfghjdkfvbhgbndfkj'}\n" +
"	}\n" +
"	state _as.cad$\n" +
"	entra@{'ASDFGHssdSDS'}\n" +
"	sale@{_cdew32ASEW12}\n" +
"}\n" +
"si[_s2=26]{\n" +
"	state _As.cad$\n" +
"}\n" +
"\n" +
"loop[1,[_Sa2X>_aaAA1]]{\n" +
"	 modifica _a:12$\n" +
"}\n" +
"end#";

        
        Lexico lex = new Lexico();
        Sintactico sin = new Sintactico();
        
        if (sin.validar(lex.GetTokens(datos)) ==true) {
            System.out.println("Codigo correcto");
        }else
            System.out.println("Error en sintactico");
    }
    
}
