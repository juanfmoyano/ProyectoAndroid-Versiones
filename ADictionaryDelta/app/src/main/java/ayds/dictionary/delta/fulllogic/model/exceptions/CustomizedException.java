package ayds.dictionary.delta.fulllogic.model.exceptions;

public abstract class CustomizedException extends Exception {
    String showMessage;

    public String getMessageError(){
        return showMessage;
    }
}
