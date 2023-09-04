package p05Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> colors = new ArrayList<>();
        String color;

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite uma cor: ");
            color =  input.nextLine();
            colors.add(color);
        }

        System.out.println("\nListar todas as cores: ");
        colors.stream().forEach(c -> System.out.println(c));
        System.out.println("\nOrdenar as cores: ");
        Collections.sort(colors);
        colors.stream().forEach(c -> System.out.println(c));
    }
}
