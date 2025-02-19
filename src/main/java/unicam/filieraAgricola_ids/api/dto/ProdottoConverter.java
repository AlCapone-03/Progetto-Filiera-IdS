package unicam.filieraAgricola_ids.api.dto;

import unicam.filieraAgricola_ids.api.prodotti.Pacchetto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;
import java.util.ArrayList;
import java.util.List;

public class ProdottoConverter {

    public static ProdottoSingolo convertDtoToProdotto(ProdottoDto dto) {
        ProdottoSingolo prodotto = new ProdottoSingolo();
        prodotto.setNome(dto.getNome());
        prodotto.setDescrizione(dto.getDescrizione());
        prodotto.setQuantita(dto.getQuantita());
        prodotto.setPrezzo(dto.getPrezzo());
        return prodotto;
    }

    public static List<Prodotto> convertDtoListToProdottoList(List<ProdottoDto> dtoList) {
        List<Prodotto> prodottoList = new ArrayList<>();
        for (ProdottoDto dto : dtoList) {
            prodottoList.add(convertDtoToProdotto(dto));
        }
        return prodottoList;
    }

    public static Pacchetto convertDtoToPacchetto(PacchettoDto dto) {
        Pacchetto pacchetto = new Pacchetto();
        pacchetto.setNome(dto.getNome());
        pacchetto.setDescrizione(dto.getDescrizione());
        pacchetto.setQuantita(dto.getQuantita());
        pacchetto.setPrezzo(dto.getPrezzo());
     //   List<Prodotto> prodotti = convertDtoListToProdottoList(dto.getProdottiPacchetto());
//        pacchetto.setProdottiPacchetto(prodotti);
        return pacchetto;
    }

    public static ProdottoDto convertProdottoToDto(Prodotto prodotto) {
        ProdottoDto dto = new ProdottoDto(prodotto.getNome(), prodotto.getDescrizione(),
                prodotto.getQuantita(), prodotto.getPrezzo());
        return dto;
    }

    public static List<ProdottoDto> convertProdottoListToDtoList(List<Prodotto> prodottoList) {
        List<ProdottoDto> dtoList = new ArrayList<>();
        for (Prodotto prodotto : prodottoList) {
            dtoList.add(convertProdottoToDto(prodotto));
        }
        return dtoList;
    }






}
