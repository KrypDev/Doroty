package doroty;

import java.util.ArrayList;

/**
 *
 * @author Richard Hdez
 */
public class Sintactico {
    
    ArrayList<Token> tokens = null;
    
    public boolean validar(ArrayList<Token> tokens){
        if(tokens != null){
            this.tokens = tokens;
            return program();
        }else
            return false;
    }
    
    private boolean program(){
        if (tokens.get(0).getToken() == Sym.statt) {
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (instructions()) {
                if (tokens.get(0).getToken() == Sym.end) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        } else {
            return false;
        }
    }
    
    private boolean instructions(){
        if (tokens.get(0).getToken() == Sym.state) {
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (state()) 
                return instructions();
            else
                return false;
        }else if(tokens.get(0).getToken() == Sym.entra){
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (input()) 
                return instructions();
            else
                return false;
        }else if(tokens.get(0).getToken() == Sym.sale){
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (output()) 
                return instructions();
            else
                return false;
        }else if(tokens.get(0).getToken() == Sym.si){
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (si()) 
                return instructions();
            else
                return false;
        }else if(tokens.get(0).getToken() == Sym.loop){
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (loop()) 
                return instructions();
            else
                return false;
        }else if(tokens.get(0).getToken() == Sym.modifica){
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (assigment()) 
                return instructions();
            else
                return false;
        }else{
            return true;
        }
    }
    
    private boolean state(){
        if (tokens.get(0).getToken() == Sym.id) {
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (tokens.get(0).getToken() == Sym.punto) {
                System.out.println(tokens.get(0).toString());
                tokens.remove(0);
                if (tokens.get(0).getToken() == Sym.type) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                    if (tokens.get(0).getToken() == Sym.pesos) {
                        System.out.println(tokens.get(0).toString());
                        tokens.remove(0);
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else if(tokens.get(0).getToken() != Sym.statt){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean output(){
        if (tokens.get(0).getToken() == Sym.parentheseA) {
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (tokens.get(0).getToken() == Sym.id) {
                System.out.println(tokens.get(0).toString());
                tokens.remove(0);
                if (tokens.get(0).getToken() == Sym.parentheseB) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                        return true;
                }else{
                    return false;
                }
            }else if(tokens.get(0).getToken() == Sym.comilla){
                System.out.println(tokens.get(0).toString());
                tokens.remove(0);
                if (tokens.get(0).getToken() == Sym.letter) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                    if (tokens.get(0).getToken() == Sym.comilla) {
                        System.out.println(tokens.get(0).toString());
                        tokens.remove(0);
                        if (tokens.get(0).getToken() == Sym.parentheseB) {
                            System.out.println(tokens.get(0).toString());
                            tokens.remove(0);
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    private boolean input(){
        if (tokens.get(0).getToken() == Sym.parentheseA) {
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (tokens.get(0).getToken() == Sym.id) {
                System.out.println(tokens.get(0).toString());
                tokens.remove(0);
                if (tokens.get(0).getToken() == Sym.parentheseB) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                        return true;
                }else{
                    return false;
                }
            }else if(tokens.get(0).getToken() == Sym.comilla){
                System.out.println(tokens.get(0).toString());
                tokens.remove(0);
                if (tokens.get(0).getToken() == Sym.letter) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                    if (tokens.get(0).getToken() == Sym.comilla) {
                        System.out.println(tokens.get(0).toString());
                        tokens.remove(0);
                        if (tokens.get(0).getToken() == Sym.parentheseB) {
                            System.out.println(tokens.get(0).toString());
                            tokens.remove(0);
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    private boolean si(){
        if (decision()) {
            if (tokens.get(0).getToken() == Sym.parentheseA) {
                System.out.println(tokens.get(0).toString());
                tokens.remove(0);
                if (instructions()) {
                    if (tokens.get(0).getToken() == Sym.parentheseB) {
                        System.out.println(tokens.get(0).toString());
                        tokens.remove(0);
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    private boolean decision(){
        if (tokens.get(0).getToken() == Sym.corcheteA) {
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (tokens.get(0).getToken() == Sym.id) {
                System.out.println(tokens.get(0).toString());
                tokens.remove(0);
                if (tokens.get(0).getToken() == Sym.sign) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                    if (tokens.get(0).getToken() == Sym.id) {
                        System.out.println(tokens.get(0).toString());
                        tokens.remove(0);
                        if(tokens.get(0).getToken() == Sym.corcheteB){
                            System.out.println(tokens.get(0).toString());
                            tokens.remove(0);
                            return true;
                        }else{
                            return false;
                        }
                    }else if(tokens.get(0).getToken() == Sym.number){
                        System.out.println(tokens.get(0).toString());
                        tokens.remove(0);
                        if(tokens.get(0).getToken() == Sym.corcheteB){
                            System.out.println(tokens.get(0).toString());
                            tokens.remove(0);
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else if(tokens.get(0).getToken() == Sym.number){
                System.out.println(tokens.get(0).toString());
                tokens.remove(0);
                if (tokens.get(0).getToken() == Sym.sign) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                    if (tokens.get(0).getToken() == Sym.id) {
                        System.out.println(tokens.get(0).toString());
                        tokens.remove(0);
                        if(tokens.get(0).getToken() == Sym.corcheteB){
                            System.out.println(tokens.get(0).toString());
                            tokens.remove(0);
                            return true;
                        }else{
                            return false;
                        }
                    }else if(tokens.get(0).getToken() == Sym.number){
                        System.out.println(tokens.get(0).toString());
                        tokens.remove(0);
                        if(tokens.get(0).getToken() == Sym.corcheteB){
                            System.out.println(tokens.get(0).toString());
                            tokens.remove(0);
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    private boolean loop(){
        if (tokens.get(0).getToken() == Sym.corcheteA) {
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (tokens.get(0).getToken() == Sym.number) {
                System.out.println(tokens.get(0).toString());
                tokens.remove(0);
                if (tokens.get(0).getToken() == Sym.coma) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                    if (decision()) {
                        if (tokens.get(0).getToken() == Sym.corcheteB) {
                            System.out.println(tokens.get(0).toString());
                            tokens.remove(0);
                            if (tokens.get(0).getToken() == Sym.parentheseA) {
                                System.out.println(tokens.get(0).toString());
                                tokens.remove(0);
                                if (instructions()) {
                                    if (tokens.get(0).getToken() == Sym.parentheseB) {
                                        System.out.println(tokens.get(0).toString());
                                        tokens.remove(0);
                                        return true;
                                    }else{
                                        return false;
                                    }
                                }else{
                                    return false;
                                }
                            }else{
                                return false;
                            }
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    private boolean assigment(){
        if (tokens.get(0).getToken() == Sym.id) {
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (tokens.get(0).getToken() == Sym.deuxpoints) {
                System.out.println(tokens.get(0).toString());
                tokens.remove(0);
                if (tokens.get(0).getToken() == Sym.id) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                    if (tokens.get(0).getToken() == Sym.pesos) {
                        System.out.println(tokens.get(0).toString());
                        tokens.remove(0);
                        return true;
                    }else if(tokens.get(0).getToken() == Sym.algebra){
                        return operation();
                    }else{
                        return false;
                    }
                }else if (tokens.get(0).getToken() == Sym.letter) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                    if (tokens.get(0).getToken() == Sym.pesos) {
                        System.out.println(tokens.get(0).toString());
                        tokens.remove(0);
                        return true;
                    }else{
                        return false;
                    }
                }else if (tokens.get(0).getToken() == Sym.number) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                    if (tokens.get(0).getToken() == Sym.pesos) {
                        System.out.println(tokens.get(0).toString());
                        tokens.remove(0);
                        return true;
                    }else if(tokens.get(0).getToken() == Sym.algebra){
                        return operation();
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    private boolean operation(){
        if(tokens.get(0).getToken() == Sym.algebra){
            System.out.println(tokens.get(0).toString());
            tokens.remove(0);
            if (tokens.get(0).getToken() == Sym.id) {
                System.out.println(tokens.get(0).toString());
                tokens.remove(0);
                if (tokens.get(0).getToken() == Sym.pesos) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                    return true;
                }else if (tokens.get(0).getToken() == Sym.algebra) {
                    return operation();
                }else{
                    return false;
                }
            }else if (tokens.get(0).getToken() == Sym.number) {
                System.out.println(tokens.get(0).toString());
                tokens.remove(0);
                if (tokens.get(0).getToken() == Sym.pesos) {
                    System.out.println(tokens.get(0).toString());
                    tokens.remove(0);
                    return true;
                }else if (tokens.get(0).getToken() == Sym.algebra) {
                    return operation();
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
}
