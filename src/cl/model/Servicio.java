package cl.model;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;

/**
 * Session Bean implementation class Servicio
 */
@Singleton
@LocalBean
public class Servicio implements ServicioLocal {

	private ArrayList<Cliente> lista = new ArrayList<Cliente>();
	
    /**
     * Default constructor. 
     */
    public Servicio() {
        
    	lista.add(new Cliente("1-1","Juan","Perez"));
    	lista.add(new Cliente("2-2","Diego","Fuentes"));
    	
    }

	@Override
	public void addCliente(Cliente cli) {
		lista.add(cli);
		
	}

	@Override
	public ArrayList<Cliente> getClientes() {
		
		return lista;
	}

	@Override
	public Cliente buscar(String rut) {
		
		for(Cliente cli: lista) {
			
			if(cli.getRut().equals(rut)) {
				return cli;
			}
			
		}
		return null;
		
	}

	@Override
	public String eliminar(String rut) {
		
		Cliente cli = buscar(rut);
		
		if(cli == null) {
			
			return "rut no encontrado";
			
		}
		else {
			
			lista.remove(cli);
			return "cliente eliminado";
		}
		
		
	}
    
	
	
    

}
