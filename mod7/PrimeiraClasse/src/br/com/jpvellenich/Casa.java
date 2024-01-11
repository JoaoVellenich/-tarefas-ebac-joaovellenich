package br.com.jpvellenich;

public class Casa {
    private int id; // Variavel privada da classe
    public int numQuartos;
    public int numBanheiros;
    public String nomeRua;

    public int getId() {
        return id;
    }

    /**
     * Aqui esta um set de id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get o numero de quartos
     * @return int numero de quartos
     */
    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public int getNumBanheiros() {
        return numBanheiros;
    }

    public void setNumBanheiros(int numBanheiros) {
        this.numBanheiros = numBanheiros;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }
}
