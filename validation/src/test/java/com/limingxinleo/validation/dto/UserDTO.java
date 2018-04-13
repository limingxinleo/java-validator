package com.limingxinleo.validation.dto;

import com.limingxinleo.validation.constraints.CaseValidator;
import com.limingxinleo.validation.enums.CaseMode;

public class UserDTO {
    private Long id;

    @CaseValidator(value = CaseMode.UPPER, message = "CaseMode is invalid")
    private String caseMode;

    public Long getId() {
        return id;
    }

    public String getCaseMode() {
        return caseMode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCaseMode(String caseMode) {
        this.caseMode = caseMode;
    }
}
