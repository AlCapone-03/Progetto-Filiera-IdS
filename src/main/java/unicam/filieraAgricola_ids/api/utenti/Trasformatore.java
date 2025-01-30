package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.handler.ControllerProdotto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.List;

public class Trasformatore extends Venditore {

    public Trasformatore(String nome, int p_IVA, ControllerProdotto controllerProdotto) {
        super(nome, p_IVA, controllerProdotto);
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
    public ControllerProdotto getControllerProdotto() {
        return super.getControllerProdotto();
    }

    @Override
    public void setControllerProdotto(ControllerProdotto controllerProdotto) {
        super.setControllerProdotto(controllerProdotto);
    }

    @Override
    public void loadProduct(int id, List<String> certificazioni, Venditore venditore, String specifiche, String descrizione, float prezzo, int quantita, String nomeProdotto) {
        super.loadProduct(id, certificazioni, venditore, specifiche, descrizione, prezzo, quantita, nomeProdotto);
    }
}
