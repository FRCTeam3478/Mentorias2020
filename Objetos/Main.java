public class Main
{

    public static void main(String[] args)
    {

        Pokemones pikachu = new Pokemones("Pikachu", 25, "Electrico", 'm', true, false, "Rata");
        PokemonesAgua tentacool = new PokemonesAgua("Tentacool", 72, "Agua | Veneno", 'h', true, true, "Pulpo");

        pikachu.ataque();
        pikachu.sonido();
        pikachu.huir();

        pikachu.agarrar("Roca");

        
        //Con encapsulamiento
        System.out.println(pikachu.getNombre());
        pikachu.setNombre("Rata amarilla");
        System.out.println(pikachu.getNombre());

        //Sin encapsulamiento
        //System.out.println(pikachu.nombre);
        //pikachu.nombre = "Rata amarilla";
        //System.out.println(pikachu.nombre);

        tentacool.ataque();
        tentacool.sonido();
        tentacool.huir();

        tentacool.agarrar("Roca");
        
        //Con encapsulamiento
        System.out.println(tentacool.getNombre());
        tentacool.setNombre("Calamardo");
        System.out.println(tentacool.getNombre());

    }

}