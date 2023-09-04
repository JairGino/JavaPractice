package p05Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> integersSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um número para adicionar no Set: ");
            integersSet.add(input.nextInt());
        }


        System.out.printf("\nListar dados do Set: ");
        Iterator<Integer> iterator = integersSet.iterator();
        Integer value;

        while (iterator.hasNext()) {
            value = iterator.next();
            System.out.printf("\n%d ", value);
        }

    }
}
