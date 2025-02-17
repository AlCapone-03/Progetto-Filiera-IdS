package unicam.filieraAgricola_ids.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.List;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Integer> {

    List<Prodotto> findByNomeContainingIgnoreCase(String nome);
    
}
