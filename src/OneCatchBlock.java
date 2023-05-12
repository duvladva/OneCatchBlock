public class OneCatchBlock {
    static void alfa(int n) throws MyException {
//        throw new MyException(n);
    }


    public static void main(String[] args) {
        int x=0, y=10;
        try {
            y = y/x;
            System.out.println("y = " + y);
            alfa(123);


        } catch (ArithmeticException | MyException e) {
            System.out.println("Нужно обработать исключение ArithmeticException или MyException");
            System.out.println(e);


        }

    }
}