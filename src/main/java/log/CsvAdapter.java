package log;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Pedro Henrique Passos Rocha
 * @author Joao Victor Mascarenhas
 * @author Catterina Vittorazzi Salvador
 */

public class CsvAdapter implements Log {

    private CsvLog csvLog;

    public CsvAdapter(CsvLog csvLog) {
        this.csvLog = csvLog;
    }


    @Override
    public void gravarLog(String operacao, String nome, String usuario, boolean sucesso, String mensagemFalha) {
        try {
            if (sucesso) {
                csvLog.gravarLogCsv(operacao, nome, usuario);
            } else {
                csvLog.gravarLogCsv("Erro: " + operacao, nome, usuario);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JsonAdapter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JsonAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
