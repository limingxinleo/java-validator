package com.limingxinleo.validation.impl;

import com.limingxinleo.validation.constraints.CaseValidator;
import com.limingxinleo.validation.enums.CaseMode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CaseValidatorImpl implements ConstraintValidator<CaseValidator, String> {

    private CaseMode caseMode;

    public void initialize(CaseValidator constraintAnnotation) {
        this.caseMode = constraintAnnotation.value();
    }

    public boolean isValid(String object, ConstraintValidatorContext constraintContext) {

        if (object == null) return true;

        if (caseMode == CaseMode.UPPER) return object.equals(object.toUpperCase());
        else return object.equals(object.toLowerCase());
    }

}
