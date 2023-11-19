package nl.novi.techiteasy.repositories;

import nl.novi.techiteasy.models.Television;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// We gebruiken hier een JpaRepository. Vergeet niet tussen de diamantjes "<>" als eerst het type van je entiteit
// mee te geven en vervolgens het type van het @Id-geannoteerde veld in die entiteit.
@Repository // NOVI werkt zonder de @Repository
public interface TelevisionRepository extends JpaRepository<Television, Long> {
    List<Television> findAllTelevisionsByBrandEqualsIgnoreCase(String brand);
}
