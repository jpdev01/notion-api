package com.jpdev.validation;

import org.springframework.validation.Errors;

import java.util.List;

public class DomainUtils {

//    public static Object addError(Object entity, String message) {
//        entity.reject("", null, message);
//        return entity
//    }
//
//    public static Object copyAllErrorsFromObject(Object fromObject, Object toObject) {
//        if (!fromObject.hasErrors()) return toObject
//
//        for (String domainError : DomainUtils.getValidationMessages(fromObject.errors)) {
//            DomainUtils.addError(toObject, domainError)
//        }
//
//        return toObject
//    }
//
//    private static List<String> getValidationMessages(Errors domainErrorList){
//        if (!domainErrorList) return []
//
//        List<String> errorMessageList = domainErrorList.getAllErrors().collect { error -> error.defaultMessage ? error.defaultMessage : MessageUtils.getMessage(error.codes[0]) }
//        return errorMessageList
//    }
}
