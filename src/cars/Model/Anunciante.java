package cars.Model;

public class Anunciante {

    private String nomeAnunciante;
    private String telefoneAnunciante;
    
    public Anunciante(){
    
    }
    
    public Anunciante(String nomeAnunciante, String telefoneAnunciante) {
    this.nomeAnunciante = nomeAnunciante;
    this.telefoneAnunciante = telefoneAnunciante;

    }



    public String getNomeAnunciante() {
        return nomeAnunciante;
    }

    public void setNomeAnunciante(String nomeAnunciante) {
        this.nomeAnunciante = nomeAnunciante;
    }

    public String getTelefoneAnunciante() {
        return telefoneAnunciante;
    }

        public void setTelefoneAnunciante(String telefoneAnunciante) {
        this.telefoneAnunciante = telefoneAnunciante;
    }
}