import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите любимое число:");
        ArrayList<Integer> listA = new ArrayList<>();
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer c = scanner.nextInt();
        Integer d = scanner.nextInt();
        Integer g = scanner.nextInt();
        listA.add(a);
        listA.add(b);
        listA.add(c);
        listA.add(d);
        listA.add(g);
        System.out.println(listA);
        ArrayList<Integer> listB = new ArrayList<>();
        System.out.println("Ведите число:");
        Integer i = scanner.nextInt();
        Integer l = scanner.nextInt();
        Integer m = scanner.nextInt();
        Integer n = scanner.nextInt();
        Integer p = scanner.nextInt();
        listB.add(i);
        listB.add(l);
        listB.add(m);
        listB.add(n);
        listB.add(p);
        System.out.println(listB);
        System.out.println("--------------------");
        Collections.reverse(listB);
        System.out.println(listB);
        Integer length = listA.size();
        ArrayList<Integer> listC = new ArrayList<>();
        for (int j = 0; j < length; j++) {
            listC.add(listA.get(j));
            listC.add(listB.get(j));
        }
            System.out.println(listC);
            Collections.sort(listC);
            System.out.println(listC);



    }

}