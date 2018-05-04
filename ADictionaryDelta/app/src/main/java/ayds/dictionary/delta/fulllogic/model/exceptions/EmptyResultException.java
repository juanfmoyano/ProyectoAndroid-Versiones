package ayds.dictionary.delta.fulllogic.model.exceptions;

public class EmptyResultException extends CustomizedException {
    final String message = "There is no result for the search";

    public EmptyResultException(){
        showMessage = message;
    }
}
