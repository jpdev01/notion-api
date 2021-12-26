package com.jpdev.repository;

import com.jpdev.domain.notes.Note;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends BaseRepository<Note> {

}
