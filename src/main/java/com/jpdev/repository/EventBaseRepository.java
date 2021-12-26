package com.jpdev.repository;

import com.jpdev.domain.calendar.base.EventBase;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;


@NoRepositoryBean
public interface EventBaseRepository<T extends EventBase> extends BaseRepository<T> {

    @Query("from #{#entityName} entity where entity.owner.id = ?1")
    List<T> findByOwnerId(Long id);

    @Query("from #{#entityName} entity where entity.id = ?1 and entity.owner.id = ?2")
    T getById(Long id, Long userId);
}
