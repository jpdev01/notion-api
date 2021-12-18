package com.jpdev.service;

import com.jpdev.domain.BaseEntity;
import com.jpdev.domain.User;
import com.jpdev.utils.DomainUtils;
import com.jpdev.validation.BusinessValidation;
import com.jpdev.validation.group.CustomGroupValidator;
import com.jpdev.validation.group.OnCreate;
import com.jpdev.validation.group.OnUpdate;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

public abstract class BaseService implements BaseServiceInterface<User> {

    private Validator validator;

    private CustomGroupValidator validatorGroup;

    BaseService(Validator validator) {
        this.validator = validator;
    }

    BaseService(Validator validator, CustomGroupValidator customGroupValidator) {
        this.validator = validator;
        this.validatorGroup = customGroupValidator;
    }

    protected BusinessValidation validate(Object object, CustomGroupValidator customGroupValidator) {
        this.validatorGroup = customGroupValidator;
        return validate(object);
    }

    protected BusinessValidation validate(Object object) {
        BusinessValidation businessValidation = new BusinessValidation();

        Set<ConstraintViolation<Object>> violations = null;
        if (this.validatorGroup != null) {
            violations = validator.validate(object, getValidatorGroup(this.validatorGroup));
        } else {
            violations = validator.validate(object);
        }

        if (!violations.isEmpty()) {
            businessValidation.addError(buildCustomErrorCode(violations.iterator().next()));
        }
        return businessValidation;
    }

    protected BaseEntity validate(BaseEntity entity, Object object) {
        BusinessValidation businessValidation = validate(object);

        if (businessValidation.hasErrors()) DomainUtils.addError(entity, businessValidation.getFirstError());

        return entity;
    }

    protected BaseEntity validate(BaseEntity entity, Object object, CustomGroupValidator customGroupValidator) {
        this.validatorGroup = customGroupValidator;
        BusinessValidation businessValidation = validate(object);

        if (businessValidation.hasErrors()) DomainUtils.addError(entity, businessValidation.getFirstError());

        return entity;
    }

    private Class getValidatorGroup(CustomGroupValidator customGroupValidator) {
        if (CustomGroupValidator.ON_CREATE.equals(customGroupValidator)) return OnCreate.class;
        if (CustomGroupValidator.ON_UPDATE.equals(customGroupValidator)) return OnUpdate.class;

        return null;
    }

    private String buildCustomErrorCode(ConstraintViolation violation){
        String error = violation.getMessageTemplate()
                .replaceAll("\\{|\\}", "")
                .replace("javax.validation.constraints.", "")
                .replace(".message", "")
                .toLowerCase();

        return new StringBuilder(violation.getRootBeanClass().getSimpleName())
                .append(".")
                .append(violation.getPropertyPath().toString())
                .append(".")
                .append(error)
                .toString();
    }
}
