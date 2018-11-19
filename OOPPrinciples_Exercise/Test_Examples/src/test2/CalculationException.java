package test2;


class CalculationException extends Exception {

    CalculationException(String message) {
        super(message);
    }

    CalculationException(String message, Throwable cause) {
        super(message, cause);
    }

}
