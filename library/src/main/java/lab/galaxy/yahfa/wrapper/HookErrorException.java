package lab.galaxy.yahfa.wrapper;

/**
 * create by Swift Gan on 16/01/2019
 */

public class HookErrorException extends Exception {
    public HookErrorException(String s) {
        super(s);
    }

    public HookErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
