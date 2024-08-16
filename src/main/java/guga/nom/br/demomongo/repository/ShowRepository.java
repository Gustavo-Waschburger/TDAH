package guga.nom.br.demomongo.repository;

import guga.nom.br.demomongo.model.Shows;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShowRepository extends MongoRepository<Shows, String> {
}
