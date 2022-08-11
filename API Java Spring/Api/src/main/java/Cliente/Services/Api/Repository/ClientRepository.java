package Cliente.Services.Api.Repository;

import Cliente.Services.Api.Model.Clients;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Clients, Integer>{
}
