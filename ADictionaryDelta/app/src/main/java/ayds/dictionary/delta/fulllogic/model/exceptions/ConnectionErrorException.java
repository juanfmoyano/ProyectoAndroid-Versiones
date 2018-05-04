package ayds.dictionary.delta.fulllogic.model.exceptions;

public class ConnectionErrorException extends CustomizedException {
    private final String message = "There was an error with the connection";

    public ConnectionErrorException(){
        showMessage = message;
    }
}
