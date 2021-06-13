package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
         
         for (String number: args)
        {
            int fahrenheit;
            float celsius;
            
            try
            {
                fahrenheit = Integer.parseInt(number);
                celsius = fahrenheitEnCelsius(fahrenheit);
                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
            }
            catch(NumberFormatException nfe)
            {
                System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
            }
        }       
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius(int f) {

        double res;
        
        res = ( (int)( (5.0 / 9) * (f - 32)  * 10 ) ) / 10.0;
        
        return (float) res; 
    }

}
