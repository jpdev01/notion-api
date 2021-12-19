package com.jpdev.controller;

import com.jpdev.domain.notes.Folder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class FolderController  extends BaseController<Folder>{
}
