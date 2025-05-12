
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Mejias Gonzalez Francisco
 */
public class Ud13Act5 {

    public static void main(String[] args) {
        //entorno
        String cad, pareja;
        Map<String, Integer> frecuencia;
        //algoritmo
        frecuencia = new LinkedHashMap<>();
        cad = "hola que tal la ola";
        cad = cad.toLowerCase().trim();

        for (int i = 0; i < cad.length() - 1; i++) {
            pareja = cad.substring(i, i + 2);
            if (pareja.matches("[a-z]{2}")) {
                if (frecuencia.containsKey(pareja)) {
                    frecuencia.put(pareja, frecuencia.get(pareja) + 1);
                } else {
                    frecuencia.put(pareja, 1);
                }//Fin Si
            }//Fin Si

        }//Fin Para
        for (Map.Entry<String, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " aparece "
                        + entry.getValue() + " veces");
            } else {
                System.out.println(entry.getKey() + " aparece "
                        + entry.getValue() + " vez");
            }//Fin Si
        }//Fin Para
    }//Fin Programa
}
