package unicam.filieraAgricola_ids.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;

import java.util.List;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Integer> {

    List<Prodotto> findByNome(String nome);

    List<Prodotto> findByDescrizione(String descrizione);

    @Query("SELECT ps FROM Pacchetto p JOIN p.prodottiPacchetto ps WHERE TYPE(ps) = ProdottoSingolo")
    List<Prodotto> findProdottiSingoliInPacchetti();

}