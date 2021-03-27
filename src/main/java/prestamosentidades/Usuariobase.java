package prestamosentidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Usuariobase implements IUsuariobaseService{
	
	@Autowired
	private IUsuariobaseDao usuariobaseDao;
	
	/**
	 * Method to get all the task
	 * @return
	 */

	@Override
	public List<Usuariobase> getUsuariobase() {
		return getUsuariobase() ;
	}
}

