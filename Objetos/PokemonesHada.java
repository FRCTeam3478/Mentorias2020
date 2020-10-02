public class PokemonesHada extends Pokemones
{

    private String nombre;
    private int numero;
    private String tipo;
    private char genero;
    private boolean evolucion;
    private boolean shinny;
    private String parecido;
    private String color;

    public PokemonesHada(String nombre, int numero, String tipo, char genero, boolean evolucion, boolean shinny, String parecido)
    {

        super(nombre, numero, tipo, genero, evolucion, shinny, parecido);

        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.genero = genero;
        this.evolucion = evolucion;
        this.shinny = shinny;
        this.parecido = parecido;
        color = "Rosa";

    }

    @Override
    public void ataque()
    {

        System.out.println("*abajo + B*");

    }

    @Override
    public void sonido()
    {

        System.out.println("*puff puff*");

    }

    public void setColor(String nuevoColor)
    {

        color = nuevoColor;

    }

    public String getColor()
    {

        return color;

    }

}