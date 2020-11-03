//Programa creado por DiegoPython y Ga3ta yeah yeah hermano
public class Stand implements StandInterface{
    private String nombre;
    private String usuario;
    private String habilidadEspecial;
    private char desP;
    private char speed;
    private char range;
    private char persistence;
    private char precision;
    private char devP;
    private String frase;

    public Stand(String nombre, String usuario, String habilidadEspecial, char desP, char speed, char range, char persistence, char precision, char devP, String frase){
        this.nombre = nombre;
        this.usuario = usuario;
        this.habilidadEspecial = habilidadEspecial;
        this.desP = desP;
        this.speed = speed;
        this.range = range;
        this.persistence = persistence;
        this.precision = precision;
        this.devP = devP;
        this.frase = frase;
    }

    @Override
    public void ataque()
    {
        String mensaje = "";
        //Usamos 'switch' para evitar escribir muchos 'if'
        switch(desP)
        {
            case 'A':
                mensaje = "Golpe que te hace dona";
            break;
            case 'B':
                mensaje = "El rompe caras";
            break;
            case 'C':
                mensaje = "Si te saca el aire :o";
            break;
            case 'D':
                mensaje = "Duele tantito, sana sana";
            break;
            case 'E':
                mensaje = "Hasta Erina Oba-chan lo aguanta xd";
            break;
        }
        System.out.println(mensaje);
    }
    
    @Override
    public void sonido(){
        System.out.println(frase);
    }
    
    @Override
    public void habilidadEspecial(){
        System.out.println(nombre + " ha usado su habilidad especial, " + habilidadEspecial);
    }

    //Encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public char getDesP() {
        return desP;
    }

    public void setDesP(char desP) {
        this.desP = desP;
    }

    public char getSpeed() {
        return speed;
    }

    public void setSpeed(char speed) {
        this.speed = speed;
    }

    public char getRange() {
        return range;
    }

    public void setRange(char range) {
        this.range = range;
    }

    public char getPersistence() {
        return persistence;
    }

    public void setPersistence(char persistence) {
        this.persistence = persistence;
    }

    public char getPrecision() {
        return precision;
    }

    public void setPrecision(char precision) {
        this.precision = precision;
    }

    public char getDevP() {
        return devP;
    }

    public void setDevP(char devP) {
        this.devP = devP;
    }

}