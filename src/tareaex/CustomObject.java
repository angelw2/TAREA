
package tareaex;

/**
 *
 * @Adriam Angel
 */
import java.util.ArrayList;
import java.util.List;

class CustomObject {
    int Numero; // Clave utilizada para ordenar
    String Valor; // Valor asociado

    public CustomObject(int key, String value) {
        this.Numero = key;
        this.Valor = value;
    }

    @Override
    public String toString() {
        return "{numero=" + Numero + ", valor='" + Valor + "'}";
    }
}

class PigeonholeSort {

    // Método que realiza el algoritmo Pigeonhole Sort
    public static void pigeonholeSort(List<CustomObject> list) {
        // Encontrar el valor mínimo y máximo en las claves de los objetos
        int min = list.get(0).Numero;
        int max = list.get(0).Numero;

        for (CustomObject obj : list) {
            if (obj.Numero < min) {
                min = obj.Numero;
            }
            if (obj.Numero > max) {
                max = obj.Numero;
            }
        }

        int range = max - min + 1;
        // Crear un array de listas para los "pigeonholes"
        List<List<CustomObject>> pigeonholes = new ArrayList<>(range);

        // Inicializar las listas dentro del array
        for (int i = 0; i < range; i++) {
            pigeonholes.add(new ArrayList<>());
        }

        // Distribuir los objetos en los pigeonholes
        for (CustomObject obj : list) {
            pigeonholes.get(obj.Numero - min).add(obj);
        }

        // Recoger los objetos de los pigeonholes en orden
        int index = 0;
        for (List<CustomObject> hole : pigeonholes) {
            for (CustomObject obj : hole) {
                list.set(index++, obj);
            }
        }
    }

    // Método para mostrar el estado actual de la lista
    public static void show(List<CustomObject> list) {
        for (CustomObject obj : list) {
            System.out.println(obj);
        }
        System.out.println();
    }
}

