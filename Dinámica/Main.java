public class Main
{

    public static void main(String[] args)
    {
    
        //Stands de Ga3ta
        Stand elasticHeart = new Stand("Elastic Heart", "Gaeta", "Negacion del Destino", 'D', 'B', 'A', 'E', 'E', 'A', "No se");

        //Stands de PythonDiego
        Stand youAndMe = new Stand("You & Me", "Python", "Construccion de Escudo Demoniaco", 'B', 'A', 'D', 'A', 'E', 'B', "Ka chin!");
        
        youAndMe.habilidadEspecial();
        
        elasticHeart.habilidadEspecial();

        youAndMe = new StandGolpes("You & Me", "Python", 'B', 'A', 'D', 'A', 'E', 'B', "Ka chin!");
        elasticHeart = new StandTiempo("Elastic Heart", "Gaeta", 'D', 'B', 'A', 'E', 'E', 'A', "No se");

        youAndMe.habilidadEspecial();
        //youAndMe.spam();

        elasticHeart.habilidadEspecial();
        //elasticHeart.spam();

    }

}
