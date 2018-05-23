package com.josuecamelo.repository;

import org.springframework.data.repository.CrudRepository;

import com.josuecamelo.model.Note;


public interface NoteRepository extends CrudRepository<Note, Long> {
	
}
