package com.jpdev.service;

import com.jpdev.domain.notes.Folder;
import com.jpdev.domain.notes.Note;
import com.jpdev.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.validation.Validator;
import java.util.List;

@Service
public class NoteService extends BaseService implements BaseServiceInterface<Note> {

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private FolderService folderService;

    NoteService(Validator validator) {
        super(validator);
    }

    @Override
    public List<Note> getAll() {
        return noteRepository.findAll();
    }

    @Override
    public Page<Note> getAll(Pageable pageable) {
        return noteRepository.findAll(pageable);
    }

    @Override
    public Note get(Long id) {
        return noteRepository.getById(id);
    }

    public Folder moveFolder(Long folderId, Long noteId){
        Note note = noteRepository.getById(noteId);
        Folder folder = folderService.get(folderId);

        //if (folder == null || note == null) throw new Exception("Pasta ou nota não encontrada");
        note.setFolder(folder);
        return folder;
    }
}
