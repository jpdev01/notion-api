package com.jpdev.controller;

import com.jpdev.domain.BaseEntity;
import com.jpdev.domain.notes.Note;
import com.jpdev.service.NoteService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/note")
public class NoteController extends BaseController {

    private NoteService noteService;

    @RequestMapping(value = "addNote/{folderId}/{noteId}", method = RequestMethod.POST)
    public BaseEntity addNote(){
        Note note = n
    }
}
