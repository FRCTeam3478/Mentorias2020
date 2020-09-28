public class Pokemones
{

    /*
    //Atributos
    Nombre
    N. en pokedex
    Tipo
    Genero
    Evoluciona? S/N
    Shinny? S/N
    A que se parece?
    */

    private String nombre;
    private int numero; 
    private String tipo;
    private char genero;
    private boolean evolucion;
    private boolean shinny;
    private String parecido;

    //Funcion de inicio - Constructor
    public Pokemones(String nombre, int numero, String tipo, char genero, boolean evolucion, boolean shinny, String parecido)
    {

        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.genero = genero;
        this.evolucion = evolucion;
        this.shinny = shinny;
        this.parecido = parecido;

    }

    /*
    //Funciones
    Ataque
    Sonido
    Evolucionar
    Defensa/Esquiva
    Huir
    Agarrar objeto
    Comer
    */

    public void ataque()
    {

        System.out.println("*ataca*");

    }

    public void sonido()
    {

        System.out.println("Pika! Pika!");

    }

    public void evolucionar()
    {

        System.out.println(nombre + " ha evolucionado!");

    }

    public void esquivar()
    {

        System.out.println("Pika! Pika!");

    }

    public void huir()
    {

        System.out.println(nombre + " se retira de la batalla");

    }

    public void agarrar(String cosa)
    {

        System.out.println(nombre + " ha recibido " + cosa);

    }

    public void comer()
    {

        System.out.println("*nom nom nom*");

    }

    //Encapsulamiento

    public void setNombre(String nuevoNombre)
    {

        nombre = nuevoNombre;

    }

    public String getNombre()
    {

        return nombre;

    }

    public void setNumero(int nuevoNumero)
    {

        numero = nuevoNumero;

    }

    public int getNumero()
    {

        return numero;

    }

    public void setTipo(String nuevoTipo)
    {

        tipo = nuevoTipo;

    }

    public String tipo()
    {

        return tipo;

    }

    public void setGenero(char nuevoGenero)
    {

        genero = nuevoGenero;

    }

    public char getGenero()
    {

        return genero;

    }

    public void setEvolucion(boolean nuevoEvolucion)
    {

        evolucion = nuevoEvolucion;

    }

    public boolean getEvolucion()
    {

        return evolucion;

    }

    public void setShinny(boolean nuevoShinny)
    {

        shinny = nuevoShinny;

    }

    public boolean getShinny()
    {

        return shinny;

    }

    public void setParecido(String nuevoParecido)
    {

        parecido = nuevoParecido;

    }

    public String getParecido()
    {

        return parecido;

    }

}