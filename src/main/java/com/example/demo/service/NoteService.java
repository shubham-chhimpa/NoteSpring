package com.example.demo.service;

import com.example.demo.entity.Note;
import com.example.demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    public List<Note> getNotes() {
        return noteRepository.findAll();
    }

    public Note getNoteById(int id) {
        return noteRepository.findById(id).orElse(null);
    }

    public String deleteNote(int id) {
        noteRepository.deleteById(id);
        return "Note Deleted : " + id;
    }

    public Note updateNote(Note newNote) {
        Note oldNote = noteRepository.findById(newNote.getId()).orElse(null);
        assert oldNote != null;
        oldNote.setText(newNote.getText());
        return noteRepository.save(oldNote);
    }

}
