package com.gaurav.JournalApp.repository;


import com.gaurav.JournalApp.entity.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepository extends JpaRepository<JournalEntry, Long> {
    // Additional custom query methods if needed
}
