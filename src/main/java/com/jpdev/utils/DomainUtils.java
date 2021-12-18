package com.jpdev.utils;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.jpdev.domain.BaseEntity;
import com.jpdev.validation.CustomError;

public class DomainUtils {

    public static String getFirstErrorMessage(BaseEntity entity){
        return entity.getErrors().get(0).getMessage();
    }

    public static void addError(BaseEntity entity, CustomError customError){
        entity.addError(customError);
    }
}
