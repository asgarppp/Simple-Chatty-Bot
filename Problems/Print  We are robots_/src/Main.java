class Main {

        public static void method(int i, String s) {
            System.out.println("short arg: " + i);
        }


        public static void method(String s, int i) {
            System.out.println("short arg: " + i);
        }

        public static long method(long l) {
            return 1L;
        }

        public static void method(int i) {
            System.out.println("short arg: " + i);
        }

        public static short method(short j) {
        return 3;
        }
        public static void main(String[] args) {
            method(10);
        }


}