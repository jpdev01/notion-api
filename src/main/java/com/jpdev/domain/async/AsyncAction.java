package com.jpdev.domain.async;

import com.jpdev.domain.BaseEntity;
import com.jpdev.domain.def.async.AsyncActionStatus;
import com.jpdev.domain.def.async.AsyncActionType;

import javax.persistence.Entity;

@Entity
public class AsyncAction extends BaseEntity {

    private String params;

    private AsyncActionType type;

    private AsyncActionStatus status;

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public AsyncActionType getType() {
        return type;
    }

    public void setType(AsyncActionType type) {
        this.type = type;
    }

    public AsyncActionStatus getStatus() {
        return status;
    }

    public void setStatus(AsyncActionStatus status) {
        this.status = status;
    }
}
