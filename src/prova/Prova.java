package prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * @author Arthur e Lucas
 */
public class Prova {

    ArrayList<String> arrayListArtista = new ArrayList();
    ArrayList<String> arrayListABC = new ArrayList();
    private String nomeArtista;

    // Botão de salvar o nome no array
    private void salvarNome() {
        arrayListArtista.add(nomeArtista);
    }

    private String InsNome(String nome1, String nome2) {
        String r;
        r = "nome1 " + "nome2";
        return r;
    }

    private String listarArtistas(int e) {
        e = 0;
        String r = "Lista de Famosos\n";
        if (e == 1) {
            if(!arrayListArtista.isEmpty()) {
                for (int i = 0; i < arrayListArtista.size(); i++) {
                    r = arrayListArtista.get(i) + "\n";
                }
            } else {
                r = "Primeiro insira o nome dos artistas";
            }
        } else {

            r = "Lista ordenada alfabeticamente";
            if (!arrayListABC.isEmpty()){
            Collections.sort(arrayListABC);
        }else{
                 r="Primeiro insira o nome dos artistas";   
        }
       
    }
         return r;
    }

    private String pesquisar() {

    }

    void excluir() {

    }

    private String editar() {

    }

    private void delete() {

    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

}
