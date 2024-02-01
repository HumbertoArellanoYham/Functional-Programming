import com.arellano.entity.Persona;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos");
        Persona persona2 = new Persona("Jose");
        Persona persona3 = new Persona("Juan");
        Persona persona4 = new Persona("Jose");

        List<Persona> myList = new ArrayList<>();
        myList.add(persona1);
        myList.add(persona2);

        myList.sort(Comparator.comparing(Persona::getNombre));

        myList.forEach(System.out::println);
    }


}
