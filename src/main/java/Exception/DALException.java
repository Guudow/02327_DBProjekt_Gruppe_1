package Exception;

public class DALException extends Exception {

    private static final long serialVersionUID = 2523570347288049072L;

    public DALException(String msg, Throwable e) {
        super(msg, e);
    }

    public DALException(String msg) {
        super(msg);
    }

}
