package ExceptionBasics;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class RuntimeException {
    public static void main(String[] args) throws CustomException {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            try {
                throw new CustomException("An error occurred: " + e.getMessage());
            } catch (CustomException customException) {
                System.out.println(customException.getMessage());
            }
        }
    }
}

