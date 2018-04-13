package com.limingxinleo.validation.constraints;

import com.limingxinleo.validation.enums.CaseMode;
import com.limingxinleo.validation.impl.CaseValidatorImpl;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = CaseValidatorImpl.class)
@Documented
public @interface CaseValidator {

    String message() default "{com.limingxinleo.validation.constraints.CaseValidator.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    CaseMode value();

}
