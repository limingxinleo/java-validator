package com.limingxinleo.validation;


import com.limingxinleo.validation.dto.UserDTO;
import org.junit.Assert;
import org.junit.Test;


public class CaseValidatorTest {

    @Test
    public void testCaseValidatorPass() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        userDTO.setCaseMode("XXX");

        String message = Utils.validator(userDTO);
        Assert.assertNull(message);
    }

    @Test
    public void testCaseValidatorNotPass() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        userDTO.setCaseMode("xx");
        String message = Utils.validator(userDTO);
        Assert.assertEquals("CaseMode is invalid", message);
    }
}
