import java.util.*;

public class ContagemRepetidaNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

//declare as variaveis corretamente e continue a sua solução

        ArrayList<Integer> lista = new ArrayList<>();

        int  temporario  = sc.nextInt();
        int i = 0;
        while(   temporario > i ) {
            lista.add(sc.nextInt());
            temporario--;
        }

        SortedMap<Integer, Integer> contaQuant = new TreeMap<>();
        lista.forEach(id -> contaQuant.compute(id, ( key, value) -> (  value  == null ? 1 : value + 1)));


        contaQuant.forEach((key, value) -> System.out.printf("%d aparece %d vez(es)\n", key, value));

        sc.close();
    }
}