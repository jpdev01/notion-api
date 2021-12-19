package com.jpdev.service;

import com.jpdev.domain.notes.Folder;
import com.jpdev.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Validator;

@Service
public class FolderService extends BaseService {

    @Autowired
    private FolderRepository folderRepository;

    FolderService(Validator validator) {
        super(validator);
    }

    public Folder get(Long id) {
        return folderRepository.getById(id);
    }
}
