package p05Collections;

import java.util.*;

public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("\nDigite o número que você deseja encontrar: ");
        Integer num = input.nextInt();

        Set<Integer> integerSet = new HashSet<>(Arrays.asList(2,5,1,3,4,9,7,8,10,6));
        Iterator<Integer> iterator = integerSet.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() == num) {
                System.out.printf("\nO número %d foi encontrado!", num);
                return;
            }
        }
        System.out.printf("\nO número %d não foi encontrado!", num);
    }
}
