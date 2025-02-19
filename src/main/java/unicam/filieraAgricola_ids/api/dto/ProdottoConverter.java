package unicam.filieraAgricola_ids.api.dto;

import unicam.filieraAgricola_ids.api.prodotti.Pacchetto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;
import java.util.ArrayList;
import java.util.List;

public class ProdottoConverter {

    public static ProdottoSingolo convertDtoToProdotto(ProdottoSingoloDto dto) {
        ProdottoSingolo prodotto = new ProdottoSingolo();
        prodotto.setNome(dto.getNome());
        prodotto.setDescrizione(dto.getDescrizione());
        prodotto.setQuantita(dto.getQuantita());
        prodotto.setPrezzo(dto.getPrezzo());
        prodotto.setIdProduttore(dto.getIdProduttore());
        prodotto.setCertificazioni(dto.getCertificazioni());
        return prodotto;
    }

    public static List<Prodotto> convertDtoListToProdottoList(List<ProdottoDto> dtoList) {
        List<Prodotto> prodottoList = new ArrayList<>();
        for (ProdottoDto dto : dtoList) {
            if(dto instanceof ProdottoSingoloDto){
                prodottoList.add(convertDtoToProdotto((ProdottoSingoloDto) dto));
            }else if(dto instanceof PacchettoDto){
                prodottoList.add(convertDtoToPacchetto((PacchettoDto) dto));
            }
        }
        return prodottoList;
    }

    public static Pacchetto convertDtoToPacchetto(PacchettoDto dto) {
        Pacchetto pacchetto = new Pacchetto();
        pacchetto.setNome(dto.getNome());
        pacchetto.setDescrizione(dto.getDescrizione());
        pacchetto.setQuantita(dto.getQuantita());
        pacchetto.setPrezzo(dto.getPrezzo());
        pacchetto.setIdProduttore(dto.getIdProduttore());
        List<Prodotto> prodotti = convertDtoListToProdottoList(dto.getProdottiPacchetto());
        pacchetto.setProdottiPacchetto(prodotti);
        return pacchetto;
    }

    public static ProdottoSingoloDto convertProdottoToDto(ProdottoSingolo prodotto) {
        ProdottoSingoloDto dto = new ProdottoSingoloDto(prodotto.getNome(), prodotto.getDescrizione(),
                prodotto.getQuantita(), prodotto.getPrezzo(), prodotto.getIdProduttore(), prodotto.getCertificazioni());
        return dto;
    }

    public static List<ProdottoDto> convertProdottoListToDtoList(List<Prodotto> prodottoList) {
        List<ProdottoDto> dtoList = new ArrayList<>();
        for (Prodotto prodotto : prodottoList) {
            if(prodotto instanceof ProdottoSingolo){
                dtoList.add(convertProdottoToDto((ProdottoSingolo) prodotto));
            }else if(prodotto instanceof Pacchetto){
                dtoList.add(convertPacchettoToDto((Pacchetto) prodotto));
            }
        }
        return dtoList;
    }

    public static PacchettoDto convertPacchettoToDto(Pacchetto pacchetto) {
        PacchettoDto dto = new PacchettoDto(pacchetto.getNome(), pacchetto.getDescrizione(),
                pacchetto.getQuantita(), pacchetto.getPrezzo(), pacchetto.getIdProduttore(), convertProdottoListToDtoList(pacchetto.getProdottiPacchetto()));
        return dto;
}
}