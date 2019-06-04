package doroty;

/**
 *
 * @author Richard Hdez
 */
public class Token {
    private int token;
    private String valor;
    
    Token(int token, String valor){
        this.token = token;
        this.valor = valor;
    }

    public int getToken() {
        return token;
    }
    
    public void setToken(int token) {
        this.token = token;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "TOKEN : "+token+" VALUE : "+valor;
    }
    
}
