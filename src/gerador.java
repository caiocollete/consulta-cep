import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class gerador {

    public static void salveJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter esc = new FileWriter(endereco.cep()+".json");
        esc.write(gson.toJson(endereco));
        esc.close();
    }
}
