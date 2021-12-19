package com.jpdev.controller;

import com.jpdev.domain.BaseEntity;
import com.jpdev.domain.notes.Folder;
import com.jpdev.domain.notes.Note;
import com.jpdev.service.NoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/note")
public class NoteController extends BaseController {

    private NoteService noteService;

    @RequestMapping(value = "addNote/{folderId}/{noteId}", method = RequestMethod.POST)
    public ResponseEntity moveFolder(@PathVariable Long folderId, @PathVariable Long noteId) {
        Folder folder = noteService.moveFolder(folderId, noteId);
        return buildResponse(folder);
    }
}
