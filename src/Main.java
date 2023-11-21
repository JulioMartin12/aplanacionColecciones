import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listaString = Arrays.asList("Prosperar","vivir", "soñar", "compartir","trabajar");
        TransformadorString trasformador = listaTextos ->  listaTextos.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println( trasformador.upperString(listaString).toString());
        System.out.println(concatenarString(listaString,5));

    }

    public  static  String concatenarString(List<String> lista, int n){

        return lista.stream().filter(palabra ->palabra.length()>n).collect(Collectors.joining(", "));
        }

}

//EJERCICIO 1
//        Implemente un método que reciba como parámetro una lista de strings y devuelva una nueva
//        lista con los strings en mayúscula.
//
//        EJERCICIO 2
//        Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
//        método debe devolver un String que concatene separando por coma y espacio todas las
//        palabras, en la lista, que tengan más de "n" caracteres.