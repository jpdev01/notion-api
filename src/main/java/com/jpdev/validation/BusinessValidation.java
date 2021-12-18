package com.jpdev.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BusinessValidation {

    List<CustomError> errors = new ArrayList<>();

    public Boolean isValid() {
        return this.errors.isEmpty();
    }

    public Boolean hasErrors(){
        return !isValid();
    }

    public void addError(String code) {
        this.errors.add(new CustomError(code));
    }

    public void addError(String code, List arguments) {
        this.errors.add(new CustomError(code, arguments));
    }

    public void addErrors(List<CustomError> asaasErrorList) {
        this.errors.addAll(asaasErrorList);
    }

    public String getFirstErrorMessage() {
        return this.errors.get(0).getMessage();
    }

    public String getAllErrorMessage() {
        // testar.
        String messages = this.errors.stream().map(CustomError::getMessage).collect(Collectors.joining());
        return messages;
    }
}
