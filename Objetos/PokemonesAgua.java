public class PokemonesAgua extends PokemonesAbstracto
{

    private String nombre;
    private int numero; 
    private String tipo;
    private char genero;
    private boolean evolucion;
    private boolean shinny;
    private String parecido;
    private String color;

    public PokemonesAgua(String nombre, int numero, String tipo, char genero, boolean evolucion, boolean shinny, String parecido)
    {

        //super();
        super(nombre, numero, tipo, genero, evolucion, shinny, parecido);

        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.genero = genero;
        this.evolucion = evolucion;
        this.shinny = shinny;
        this.parecido = parecido;
        color = "Azul";

    }

    @Override
    public void ataque()
    {

        System.out.println(nombre + " ha usado chorro de agua");

    }

    @Override //Esta funcion esta sobreescrita
    public void sonido()
    {

        System.out.println("*glu glu*");

    }

}