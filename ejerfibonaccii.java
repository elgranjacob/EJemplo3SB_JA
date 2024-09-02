public class ejerfibonaccii {
        public static void main(String[] args) {
                int a= 0;
                int b =1 ;
                int suma= 0;
                System.out.println(a);

                for (int index = 0; index < 50; index++) {
                        suma = a+ b;
                        System.out.println(suma);
                        a=b;
                        b= suma;
                }

        }

}
