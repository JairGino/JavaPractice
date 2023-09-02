package p02ConditionalOperator;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] keywords = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("\nDigite a característica: ");
            keywords[i] = input.nextLine();
        }

        String result = "Não identificado!";

        if (keywords[0].equals("vertebrado")) {
            if (keywords[1].equals("ave")) {
                if (keywords[2].equals("carnívoro")) {
                    result = "Águia";
                } else if (keywords[2].equals("onívoro")) {
                    result = "Pomba";
                }
            } else if (keywords[1].equals("mamífero")) {
                if (keywords[2].equals("onívoro")) {
                    result = "Homem";
                } else if (keywords[2].equals("herbívoro")) {
                    result = "Vaca";
                }
            }
        } else if (keywords[0].equals("invertebrado")) {
            if (keywords[1].equals("inseto")) {
                if (keywords[2].equals("hematófago")) {
                    result = "Pulga";
                } else if (keywords[2].equals("herbívoro")) {
                    result = "Lagarta";
                }
            } else if (keywords[1].equals("anelídeo")) {
                if (keywords[2].equals("hematófago")) {
                    result = "Sanguessuga";
                } else if (keywords[2].equals("onívoro")) {
                    result = "Minhoca";
                }
            }
        }
        System.out.printf("\n%s\n", result);
    }
}
