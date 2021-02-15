package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        
        PersonaDAO personaDao = new PersonaDAO();
        
        //InsertaR objeto de tipo persona
        Persona personaNueva = new Persona("Sherman ", "Fisher", "ShermanAFisher@superrito.com", "718-422-0592");
        personaDao.insertar(personaNueva);
        
        //Listar personas
        List<Persona> personas = personaDao.seleccionar();
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
        
        //Actualizar Persona
        Persona personaActualizar = new Persona(3, "Sherman", "A. Fisher", "ShermanAFisher@superrito.com", "718-422-0592");
        personaDao.actualizar(personaActualizar);
        
        //Listar personas
        System.out.println("");
        personas = personaDao.seleccionar();
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
       //Eliminar persona
        Persona personaEliminar = new Persona(4);
        personaDao.eliminar(personaEliminar);
        
        //Listar personas
        System.out.println("");
        personas = personaDao.seleccionar();
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
