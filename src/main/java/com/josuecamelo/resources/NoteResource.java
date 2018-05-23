package com.josuecamelo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.josuecamelo.exception.NotFoundException;
import com.josuecamelo.model.Note;
import com.josuecamelo.repository.NoteRepository;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/notes")
//@Api(value = "Live API Rest - Notes Endpoint")
public class NoteResource {

	@Autowired
	private NoteRepository noteRepository;
	
	public NoteResource(NoteRepository noteRepository) {
		this.noteRepository = noteRepository;
	}
	
	
	@GetMapping
	@ResponseBody
	//@ApiOperation(value = "Find all Notes on Databases")
	public List<Note> findAll() {
		//return (List<Note>) this.noteRepository.findAll();
		return null;
	}
	
	/*@GetMapping("/{id}")
	public Note findById(@PathVariable(value = "id") Long id) {
		return this.noteRepository.findById(id).orElseThrow(() -> new NotFoundException("Note", "id", id));
	}
	
	@PostMapping
	@ResponseBody
	public Note create(@RequestBody Note note) {
		return this.noteRepository.save(note);
	}
	
	@PutMapping("/{id}")
	public Note update(@PathVariable(value = "id") Long id, @RequestBody Note newNote) {
		Note note = this.noteRepository.findById(id).orElseThrow(() -> new NotFoundException("Note", "id", id));
		
		note.setTitle(newNote.getTitle());
		note.setContent(newNote.getContent());
		
		Note updatedNote = this.noteRepository.save(note);
		
		return updatedNote;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remove(@PathVariable(value = "id") Long id) {
		Note note = this.noteRepository.findById(id).orElseThrow(() -> new NotFoundException("Note", "id", id));
		
		this.noteRepository.delete(note);
		
		return ResponseEntity.ok().build();
	}*/
}
