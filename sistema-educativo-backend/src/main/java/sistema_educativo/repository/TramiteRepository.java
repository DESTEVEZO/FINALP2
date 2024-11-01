package sistema_educativo.repository;

import sistema_educativo.model.Tramite;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TramiteRepository extends MongoRepository<Tramite, String> {
}
