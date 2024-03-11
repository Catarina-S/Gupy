
public class InverterString {
    
    public static void main(String[] args) {
        //colocando um exemplo:
        String stringOriginal = "Entrevista Gupy";

        // funçãozinha:
        String stringInvertida = inverterString(stringOriginal);

        // mostrando o resultaddo:
        System.out.println("String original: " + stringOriginal);
        System.out.println("String invertida: " + stringInvertida);
    }

    public static String inverterString(String stringOriginal) {
        
        char[] caracteres = stringOriginal.toCharArray();

        // var pra armazenar a string invertida:
        String stringInvertida = "";


        for (int i = caracteres.length - 1; i >= 0; i--) {
            
            stringInvertida += caracteres[i];
        }


        return stringInvertida;
    }
}
