package com.example.demo.controller;

import com.example.demo.entity.Note;
import com.example.demo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PostMapping("/note")
    public Note addNote(@RequestBody Note note) {
        return noteService.saveNote(note);
    }

    @GetMapping("/note/{id}")
    public Note getNote(@PathVariable int id) {
        return noteService.getNoteById(id);
    }

    @PutMapping("/note")
    public Note updateNote(@RequestBody Note note) {
        return noteService.updateNote(note);
    }

    @DeleteMapping("/note/{id}")
    public String deleteNote(@PathVariable int id) {
        return noteService.deleteNote(id);
    }

    @GetMapping("/notes")
    public List<Note> getNotes() {
        return noteService.getNotes();
    }

}
