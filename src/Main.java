import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner let = new Scanner(System.in);
        String cep = let.nextLine();
        try{
            Endereco endereco = ConsultaCEP.consulta(cep);
            System.out.println(endereco);
            gerador.salveJson(endereco);
        }
        catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }
    }
}