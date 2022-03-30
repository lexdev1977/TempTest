public class Test {

   static class Man {     // создаем класс

        int dnaCode;           // поле

        public boolean equals(Man man) {           // переопределяем метод equals
            return this.dnaCode == man.dnaCode;
        }

        public static void main(String[] args) {

            Man man1 = new Man();
            man1.dnaCode = 1111222233;

            Man man2 = new Man();
            man2.dnaCode = 111122233;

            System.out.println(man1.equals(man2));

        }
    }
}

