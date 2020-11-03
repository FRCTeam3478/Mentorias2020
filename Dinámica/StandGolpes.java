public class StandGolpes extends Stand
{
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

    public StandGolpes(String nombre, String usuario, char desP, char speed, char range, char persistence, char precision, char devP, String frase){
        super(nombre, usuario, "Dar golpes a lo loco", desP, speed, range, persistence, precision, devP, frase);
        this.nombre = nombre;
        this.usuario = usuario;
        this.habilidadEspecial = "Dar golpes a lo loco";
        this.desP = desP;
        this.speed = speed;
        this.range = range;
        this.persistence = persistence;
        this.precision = precision;
        this.devP = devP;
        this.frase = frase;
    }

    public void spam(){
        for(int i=0; i<50; i++){
            System.out.print(frase + " ");
        }
        System.out.println("");
    }

}