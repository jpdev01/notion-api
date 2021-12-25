package com.jpdev.repository;

import com.jpdev.domain.async.AsyncAction;
import com.jpdev.domain.def.async.AsyncActionStatus;
import com.jpdev.domain.def.async.AsyncActionType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsyncActionRepository extends BaseRepository<AsyncAction> {
    @Query("FROM AsyncAction where type = ?1 and status = ?2")
    List<AsyncAction> findAsyncActionByStatus(AsyncActionType type, AsyncActionStatus status);
}
