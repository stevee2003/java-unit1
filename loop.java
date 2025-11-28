class LoopDemo {
    public static void main(String[] args) {

        int i = 1;
        System.out.println("While Loop:");
        while(i <= 5) {
            System.out.println(i);
            i++;
        }

        int j = 1;
        System.out.println("\nDo-While Loop:");
        do {
            System.out.println(j);
            j++;
        } while(j <= 5);

        System.out.println("\nFor Loop:");
        for(int k = 1; k <= 5; k++) {
            System.out.println(k);
        }
    }
}
