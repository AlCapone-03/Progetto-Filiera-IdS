package unicam.filieraAgricola_ids.api;

import java.util.List;

public class Trasformatore extends Venditore{

    public Trasformatore(String nome, int p_IVA, List<Prodotto> prodottiCaricati) {
        super(nome, p_IVA, prodottiCaricati);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getP_IVA() {
        return super.getP_IVA();
    }

    @Override
    public void setP_IVA(int p_IVA) {
        super.setP_IVA(p_IVA);
    }

    @Override
    public List<Prodotto> getProdottiCaricati() {
        return super.getProdottiCaricati();
    }

    @Override
    public void setProdottiCaricati(List<Prodotto> prodottiCaricati) {
        super.setProdottiCaricati(prodottiCaricati);
    }

    @Override
    public void loadProduct() {
        super.loadProduct();
    }
}
