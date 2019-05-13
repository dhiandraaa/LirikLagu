package com.agsatria.liriklagu;

import com.agsatria.liriklagu.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);
}
