package programaciongenerica;

import java.util.ArrayList;
import java.util.List;

/**
 * @author OscarNedzelsky
 */
public class ProgramacionGenerica {

    public static void main(String[] args) {
        
        ClaseGenerica<String> s = new ClaseGenerica <String>();
        s.almacenarUltimoDisponible("Calamardo");
        s.almacenarUltimoDisponible("Bob Esponja");
        s.almacenarEnPosicion("Lolo", 2);
        System.out.println(s.devuelvePrimero());
        System.out.println(s.devuelveAlmacenados() + "\n");
        
        ClaseGenerica<Integer> intg = new ClaseGenerica <Integer>();
        intg.almacenarUltimoDisponible(80);
        intg.almacenarEnPosicion(1997, 0);
        System.out.println(intg.devuelvePrimero());
        System.out.println(intg.devuelveAlmacenados() + "\n");
        
        ClaseGenerica<Float> f = new ClaseGenerica <Float>();
        f.almacenarUltimoDisponible(2407.1997f);
        f.almacenarUltimoDisponible(1202.1974f);
        f.almacenarUltimoDisponible(1212.2001f);
        f.almacenarEnPosicion(2109.1969f, 102);
        System.out.println(f.devuelvePrimero());
        System.out.println(f.devuelveUltimoExistente());    
        System.out.println(f.devuelveAlmacenados() + "\n");
        
        ClaseGenerica<Persona> p = new ClaseGenerica <Persona>();
        Persona p1 = new Persona("Barbra Streisand", "femenino", 74);
        Persona p2 = new Persona("Patti LuPone", "femenino", 67);
        Persona p3 = new Persona("Jonathan Groff", "masculino", 31);
        p.almacenarUltimoDisponible(p1);
        p.almacenarUltimoDisponible(p2);
        p.almacenarEnPosicion(p3, 0);
        System.out.println("");
        List<Persona> t = new ArrayList();
        t = p.devuelveAlmacenados();
        for (int i = 0; i < t.size(); i++) {
            System.out.println("Nombre: " + t.get(i).getNombre() + "\nSexo: " + t.get(i).getSexo() + "\nEdad: " + t.get(i).getEdad() + "\n");
        }
    }
    
       
    
}
