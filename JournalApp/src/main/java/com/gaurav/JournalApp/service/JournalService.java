package com.gaurav.JournalApp.service;


import com.gaurav.JournalApp.entity.JournalEntry;
import com.gaurav.JournalApp.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService {

    @Autowired
    private JournalRepository journalRepository;

    public List<JournalEntry> getAllEntries() {
        return journalRepository.findAll();
    }

    public JournalEntry addEntry(JournalEntry entry) {
        return journalRepository.save(entry);
    }

    public JournalEntry getEntryById(Long id) {
        return journalRepository.findById(id).orElse(null);
    }

    public void deleteEntry(Long id) {
        journalRepository.deleteById(id);
    }
}
