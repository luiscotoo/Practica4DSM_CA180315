package sv.edu.udb.ejerciciortdatabase.datos;
//Fecha de nacimiento, genero, peso y altura

public class Persona {
    private String dui;
    private String nombre;
    private String fechanac;
    private String genero;
    private String peso;
    private String altura;
    String key;

    public Persona() {
    }

    public Persona(String dui,  String nombre, String fechanac,String genero, String peso, String altura) {
        this.dui = dui;
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.fechanac = fechanac;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }
}
