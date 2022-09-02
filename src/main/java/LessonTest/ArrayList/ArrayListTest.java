package LessonTest.ArrayList;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        Lion my = new Lion("Антон", "lion");
        Lioness dinara = new Lioness("Dinara", "lion");
        Lioness jullmatt = new Lioness("Jull Matt", "lion");
        Lioness irinaPilatova = new Lioness("Irina Pilatova", "lion");

        ArrayList myPride = new ArrayList();
        myPride.add(my);

        getPride(myPride, dinara);
        getPride(myPride, jullmatt);
        getPride(myPride, irinaPilatova);
//        for (Object it: myPride) {
//            if (myPride.indexOf(it)==0) {
//                System.out.println("===== Мой прайд =====");
//                System.out.println("Глава прайда: ");
//            }
//        }
    }

    public static ArrayList getPride(ArrayList pride, Lioness lioness) {
        if (lioness.getZodiacSign().equals("lion")) {
            pride.add(lioness);
        } else {
            System.out.println("Не подходащая особь");
        }
        return pride;
    }
}
