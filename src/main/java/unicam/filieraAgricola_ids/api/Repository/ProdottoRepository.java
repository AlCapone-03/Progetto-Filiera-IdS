package unicam.filieraAgricola_ids.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import unicam.filieraAgricola_ids.api.Prodotti.Prodotto;

import java.util.List;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Integer> {

    List<Prodotto> findByNome(String nome);

    List<Prodotto> findByNomeAndDescrizioneAndPrezzo(String nome, String descrizione, double prezzo);

    @Query("SELECT ps FROM Pacchetto p JOIN p.prodottiPacchetto ps WHERE TYPE(ps) = ProdottoSingolo")
    List<Prodotto> findProdottiSingoliInPacchetti();

}