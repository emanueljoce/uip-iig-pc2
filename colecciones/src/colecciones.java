import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by emanu on 10/13/2016.
 */
public class colecciones {
    public static void main(String[] args){
        List<Integer>lista = Arrays.asList(3,2,1,4,5,6);
        for (Integer entero : lista) {
            System.out.println(entero);
        }
        List<String> lista2=new ArrayList<>();
        lista2.add("juan");
        lista2.add("pedro");
        lista2.add("maria");
        for (String nombre : lista2){
           System.out.println(nombre);

        }
        List<String> lista3=Arrays.asList("Zoraida,","Cristina","manuela");
        lista3.sort(null);
        lista3.forEach(System.out::println);
        lista3.forEach((n1)->System.out.println("nombre:" +n1));
    }
}
