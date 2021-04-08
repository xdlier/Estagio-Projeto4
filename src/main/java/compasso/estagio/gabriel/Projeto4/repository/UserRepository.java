package compasso.estagio.gabriel.Projeto4.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import compasso.estagio.gabriel.Projeto4.model.User;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, Long> {

	Optional<User> findByEmail(String username);
	
}
