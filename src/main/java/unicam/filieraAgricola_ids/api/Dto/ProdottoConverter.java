package unicam.filieraAgricola_ids.api.Dto;

import unicam.filieraAgricola_ids.api.Prodotti.Pacchetto;
import unicam.filieraAgricola_ids.api.Prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.Prodotti.ProdottoSingolo;
import java.util.ArrayList;
import java.util.List;

public class ProdottoConverter {

    public static ProdottoSingolo DtoToProdotto(ProdottoSingoloDto dto) {
        ProdottoSingolo prodotto = new ProdottoSingolo();
        prodotto.setNome(dto.getNome());
        prodotto.setDescrizione(dto.getDescrizione());
        prodotto.setQuantita(dto.getQuantita());
        prodotto.setPrezzo(dto.getPrezzo());
        prodotto.setIdProduttore(dto.getIdProduttore());
        prodotto.setCertificazioni(dto.getCertificazioni());
        return prodotto;
    }

    public static Pacchetto DtoToPacchetto(PacchettoDto dto) {
        Pacchetto pacchetto = new Pacchetto();
        pacchetto.setNome(dto.getNome());
        pacchetto.setDescrizione(dto.getDescrizione());
        pacchetto.setQuantita(dto.getQuantita());
        pacchetto.setPrezzo(dto.getPrezzo());
        pacchetto.setIdProduttore(dto.getIdProduttore());
        List<Prodotto> prodotti = DtoListToProdottoList(dto.getProdottiPacchetto());
        pacchetto.setProdottiPacchetto(prodotti);
        return pacchetto;
    }

    public static List<Prodotto> DtoListToProdottoList(List<ProdottoDto> dtoList) {
        List<Prodotto> prodottoList = new ArrayList<>();
        for (ProdottoDto dto : dtoList) {
            if (dto instanceof ProdottoSingoloDto) {
                prodottoList.add(DtoToProdotto((ProdottoSingoloDto) dto));
            } else if (dto instanceof PacchettoDto) {
                prodottoList.add(DtoToPacchetto((PacchettoDto) dto));
            }
        }
        return prodottoList;
    }

    public static List<ProdottoDto> ProdottiToDtoList(List<Prodotto> prodotti) {
        List<ProdottoDto> dtoList = new ArrayList<>();
        for (Prodotto prodotto : prodotti) {
            if (prodotto instanceof ProdottoSingolo) {
                ProdottoSingoloDto dto = new ProdottoSingoloDto();
                dto.setNome(prodotto.getNome());
                dto.setDescrizione(prodotto.getDescrizione());
                dto.setQuantita(prodotto.getQuantita());
                dto.setPrezzo(prodotto.getPrezzo());
                dto.setIdProduttore(prodotto.getIdProduttore());
                dto.setCertificazioni(((ProdottoSingolo) prodotto).getCertificazioni());
                dtoList.add(dto);
            } else if (prodotto instanceof Pacchetto) {
                PacchettoDto dto = new PacchettoDto();
                dto.setNome(prodotto.getNome());
                dto.setDescrizione(prodotto.getDescrizione());
                dto.setQuantita(prodotto.getQuantita());
                dto.setPrezzo(prodotto.getPrezzo());
                dto.setIdProduttore(prodotto.getIdProduttore());
                List<ProdottoDto> prodottiPacchetto =
                        ProdottiToDtoList(((Pacchetto) prodotto).getProdottiPacchetto());
                dto.setProdottiPacchetto(prodottiPacchetto);
                dtoList.add(dto);
            }
        }
        return dtoList;
    }

}