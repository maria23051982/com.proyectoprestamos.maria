package Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import prestamosentidades.IUsuariobaseDao;

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

