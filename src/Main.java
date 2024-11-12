public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1");
        int[] payment = { 25000, 12000, 7000, 56000, 13500};
        int sum = 0;
        for (int element: payment) {
            sum += element;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n\n", sum);

        // Task 2
        System.out.println("Task 2");
        int minWaste = 100000000;
        int maxWaste = -1;
        int[] arrWaste = { 4500, 2300, 9000, 6100, 500 };
        for ( int element : arrWaste ){
            if ( element < minWaste ){
                minWaste = element;
            }
            if ( element > maxWaste ){
                maxWaste = element;
            }
        }

        System.out.printf("Минимальная сумма трат за неделю составила %d рублей\n", minWaste);
        System.out.printf("Максимальная сумма трат за неделю составила %d рублей\n\n", maxWaste);


        // Task 3
        System.out.println("Task 3");

        int[] sumWaste = { 23000, 31000, 6400, 4300, 1000 };
        int el = 0;
        for( int element: sumWaste ){
            el += element;
        }
        double avgWaste = (double) el / sumWaste.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n\n", avgWaste);

        // Task 4
        System.out.println("Task 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for ( int i = reverseFullName.length - 1; i >= 0; i-- ){
            System.out.print(reverseFullName[i]);
        }

        System.out.println();



    }
}