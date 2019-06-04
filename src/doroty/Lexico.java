package doroty;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Richard
 */
public class Lexico {
    ArrayList<Token> tokens = null;
    
    private String leng = "(statt#)|(end#)|(modifica)|(state)|(si)|(loop)"
            + "|(entra@)|(sale@)|(dig|cad)|([<>=!])|([-+*/])|(:)"
            + "|($)|([.])|(')|(\\[)|(\\])|(\\{)"
            + "|(\\})|(\\,)|(_[a-zA-Z][a-zA-Z0-9]*)|([a-zA-Z]+)|([0-9]+)";
    
    
    ArrayList<Token> GetTokens(String codigo){
        tokens = new ArrayList<Token>();
        
        Pattern p = Pattern.compile(leng);
        Matcher m = p.matcher(codigo);
        
        while (m.find()) {
            String p1 = m.group(1);
            if (p1 != null) {
                System.out.println("Val 1: "+p1);
                tokens.add(new Token(Sym.statt, "sttat#"));
            }
            String p2 = m.group(2);
            if (p2 != null) {
                System.out.println("Val 2: "+p2);
                tokens.add(new Token(Sym.end, "end#"));
            }
            String p3 = m.group(3);
            if (p3 != null) {
                System.out.println("Val 3: "+p3);
                tokens.add(new Token(Sym.modifica, "modifica"));
            }
            String p4 = m.group(4);
            if (p4 != null) {
                System.out.println("Val 4: "+p4);
                tokens.add(new Token(Sym.state, "state"));
            }
            String p5 = m.group(5);
            if (p5 != null) {
                System.out.println("Val 5: "+p5);
                tokens.add(new Token(Sym.si, "si"));
            }
            String p6 = m.group(6);
            if (p6 != null) {
                System.out.println("Val 6: "+p6);
                tokens.add(new Token(Sym.loop, "loop"));
            }
            String p7 = m.group(7);
            if (p7 != null) {
                System.out.println("Val 7: "+p7);
                tokens.add(new Token(Sym.entra, "entra@"));
            }
            String p8 = m.group(8);
            if (p8 != null) {
                System.out.println("Val 8: "+p8);
                tokens.add(new Token(Sym.sale, "sale@"));
            }
            String p9 = m.group(9);
            if (p9 != null) {
                System.out.println("Val 9: "+p9);
                tokens.add(new Token(Sym.type, "TYPE"));
            }
            String p10 = m.group(10);
            if (p10 != null) {
                System.out.println("Val 10: "+p10);
                tokens.add(new Token(Sym.sign, "SING"));
            }
            String p11 = m.group(11);
            if (p11 != null) {
                System.out.println("Val 11: "+p11);
                tokens.add(new Token(Sym.algebra, "ALGEBRA"));
            }
            String p12 = m.group(12);
            if (p12 != null) {
                System.out.println("Val 12: "+p12);
                tokens.add(new Token(Sym.deuxpoints, ":"));
            }
            String p13 = m.group(13);
            if (p13 != null) {
                System.out.println("Val 13: "+p13);
                tokens.add(new Token(Sym.pesos, "$"));
            }
            String p14 = m.group(14);
            if (p14 != null) {
                System.out.println("Val 14: "+p14);
                tokens.add(new Token(Sym.punto, "."));
            }
            String p15 = m.group(15);
            if (p15 != null) {
                System.out.println("Val 15: "+p15);
                tokens.add(new Token(Sym.comilla, "'"));
            }
            String p16 = m.group(16);
            if (p16 != null) {
                System.out.println("Val 16: "+p16);
                tokens.add(new Token(Sym.corcheteA, "["));
            }
            String p17 = m.group(17);
            if (p17 != null) {
                System.out.println("Val 17: "+p17);
                tokens.add(new Token(Sym.corcheteB, "]"));
            }
            String p18 = m.group(18);
            if (p18 != null) {
                System.out.println("Val 18: "+p18);
                tokens.add(new Token(Sym.parentheseA, "{"));
            }
            String p19 = m.group(19);
            if (p19 != null) {
                System.out.println("Val 19: "+p19);
                tokens.add(new Token(Sym.parentheseB, "}"));
            }
            String p20 = m.group(20);
            if (p20 != null) {
                System.out.println("Val 20: "+p20);
                tokens.add(new Token(Sym.coma, ","));
            }
            String p21 = m.group(21);
            if (p21 != null) {
                System.out.println("Val 21: "+p21);
                tokens.add(new Token(Sym.id, "ID"));
            }
            String p22 = m.group(22);
            if (p22 != null) {
                System.out.println("Val 22: "+p22);
                tokens.add(new Token(Sym.letter, "LETTER"));
            }
            String p23 = m.group(23);
            if (p23 != null) {
                System.out.println("Val 23: "+p23);
                tokens.add(new Token(Sym.number, "NUMBER"));
            }
        }
        
        return tokens;
    }
}
