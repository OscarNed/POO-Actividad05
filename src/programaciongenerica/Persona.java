package programaciongenerica;

/**
 * @author OscarNedzelsky
 */
public class Persona {
    //Atributos
    private String nombre,sexo;
    private int edad;
    
    //Constructor
    public Persona (String nombre, String sexo, int edad){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }
    
    //Métodos
    public String getNombre(){
        return this.nombre;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String setNombre(String nombre){
        return this.nombre;
    }
    
    public String setSexo(String sexo){
        return this.sexo;
    }
    
    public int setEdad(int edad){
        return this.edad;
    }
    
    
}
