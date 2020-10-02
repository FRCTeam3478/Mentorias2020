public class Main
{

    public static void main(String[] args)
    {
        
        Pokemones arceus = new Pokemones("Arceus", 493, "Yes", '-', false, false, "Jesus Christ");

        arceus.ataque();
        arceus.sonido();
        arceus.agarrar("Piedra filosofal");
        System.out.println(arceus.getTipo());

        arceus = new PokemonesAgua("Arceus", 493, "Agua", '-', false, false, "Jesus Christ");
        
        arceus.ataque();
        arceus.sonido();
        arceus.agarrar("Katana");
        System.out.println(arceus.getTipo());

        arceus = new PokemonesHada("Arceus", 493, "Hada", '-', false, false, "Jesus Christ");

        arceus.ataque();
        arceus.sonido();
        arceus.agarrar("Bola Smash");
        System.out.println(arceus.getTipo());

    }

}