package com.gaurav.JournalApp.controller;

import com.gaurav.JournalApp.entity.JournalEntry;
import com.gaurav.JournalApp.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/journals")
public class JournalController {

    @Autowired
    private JournalService journalService;

    @GetMapping
    public List<JournalEntry> getAllEntries() {
        return journalService.getAllEntries();
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry entry) {
        return journalService.addEntry(entry);
    }

    @GetMapping("/{id}")
    public JournalEntry getEntryById(@PathVariable Long id) {
        return journalService.getEntryById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEntry(@PathVariable Long id) {
        journalService.deleteEntry(id);
    }
}
