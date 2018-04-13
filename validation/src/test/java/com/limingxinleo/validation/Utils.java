package com.limingxinleo.validation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class Utils {

    public static <T> String validator(T t) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);

        for (ConstraintViolation<T> constraintViolation : constraintViolations) {
            return constraintViolation.getMessage();
        }
        return null;
    }
}
