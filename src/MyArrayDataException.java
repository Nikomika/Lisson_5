public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message) {
        super("Неверные данные "+message);
    }
}
