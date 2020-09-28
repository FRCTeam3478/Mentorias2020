public class PokemonesAgua extends Pokemones
{

    private String nombre;
    private int numero; 
    private String tipo;
    private char genero;
    private boolean evolucion;
    private boolean shinny;
    private String parecido;

    public PokemonesAgua(String nombre, int numero, String tipo, char genero, boolean evolucion, boolean shinny, String parecido)
    {

        super(nombre, numero, tipo, genero, evolucion, shinny, parecido);
    
    }

    public void ataque()
    {

        System.out.println("*usa chorro de agua*");

    }

}