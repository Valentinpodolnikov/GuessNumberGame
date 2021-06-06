import java.util.Scanner;

public class Ded_moroz {
    public static void main(String[] args) {

        int mandarin;
        int iriska;
        int pryanik;
        int weight;
        int count = 0;
        int sum;


        Scanner input = new Scanner(System.in);
        System.out.println("Введите вес мандарина");
        mandarin = input.nextInt();

        System.out.println("Введите вес ириски");
        iriska = input.nextInt();

        System.out.println("Введите вес пряника");
        pryanik = input.nextInt();

        System.out.println("Введите общий вес");
        weight = input.nextInt();

        sum = pryanik + iriska + mandarin;


        if (weight - iriska == 0) {
            count += 1;
        } else if (weight - iriska - mandarin == 0) {
            count += 1;
        } else if (weight - iriska - mandarin - pryanik == 0) {
            count += 1;
        }
        System.out.println(+count);


//        for (mandarin = 0; mandarin < 100; mandarin++) {
//            for (iriska = 0; iriska < 100; iriska++) {
//                for (pryanik = 0; pryanik < 100; pryanik++) {
//
//                        if (sum == weight) {
//
//                            System.out.println(+count);
//                            count++;
//                        }
//
//                    }
//
//
//
//                }
//            }
    }

}
