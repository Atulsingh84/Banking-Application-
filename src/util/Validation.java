package util;

import Exceptions.ValidationException;

public interface Validation<T> {
    void validate(T value) throws ValidationException;
}
