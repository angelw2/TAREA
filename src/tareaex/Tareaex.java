
package tareaex;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adriam Angel
 */
public class Tareaex {

    public static void main(String[] args) {
        // Crear una lista de objetos personalizados
        List<CustomObject> list = new ArrayList<>();
        list.add(new CustomObject(3, "manzana"));
        list.add(new CustomObject(5, "banana"));
        list.add(new CustomObject(2, "cereza"));
        list.add(new CustomObject(1, "datil"));
        list.add(new CustomObject(4, "sauco"));

        System.out.println("Antes de ordenar:");
        PigeonholeSort.show(list);  // Llamada al método show para mostrar la lista

        // Aplicar el algoritmo de Pigeonhole Sort
        PigeonholeSort.pigeonholeSort(list);

        System.out.println("Despues de ordenar:");
        PigeonholeSort.show(list);  // Llamada al método show para mostrar la lista ordenada
    }
}