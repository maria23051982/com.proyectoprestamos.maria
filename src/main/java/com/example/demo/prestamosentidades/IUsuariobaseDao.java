package prestamosentidades;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuariobaseDao extends CrudRepository<Usuario, Long> {

}
