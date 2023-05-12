public class MyException extends Exception{

    private int code;

    MyException (int n) {
        super();
        code = n;
    }

    public String toString() {
        String txt = "Исключение класса MyException";
        txt += "Код ошибки " + code;
        return txt;
    }



}

