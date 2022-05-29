package Exceptions;

public class BadSortException extends RuntimeException {
    public BadSortException(String you_gice_bad_sort_type) {
        super(you_gice_bad_sort_type);
    }
}
