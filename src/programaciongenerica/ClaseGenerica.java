package programaciongenerica;

import java.util.ArrayList;

/**
 * @author OscarNedzelsky
 */

public class ClaseGenerica <T> {
    //Atributos
    ArrayList <T> list = new ArrayList <T>(100);
    
    public void almacenarUltimoDisponible(T t){
        this.list.add(t);
        System.out.println("La información ha sido guardada con éxito.");
    }
    
    public void almacenarEnPosicion(T t, int n){
        try{
            this.list.add(n, t);
            System.out.println("La información ha sido guardada con éxito.");
        } catch (IndexOutOfBoundsException exc){
            System.out.println("Ya no quedan más posiciones.");
        }
    }
    
    public ArrayList<T> devuelveAlmacenados() {
        return this.list;
    }
    
    public T devuelvePrimero() {
        System.out.print("El primer dato es: ");
        return list.get(0);
    }
    
    public T devuelveUltimoExistente() {
        return this.list.get(this.list.size() - 1);
    }
}
