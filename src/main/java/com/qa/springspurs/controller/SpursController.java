package com.qa.springspurs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springspurs.domain.Spurs;
import com.qa.springspurs.service.SpursService;

@RestController
@RequestMapping("/spurs") // This will make my server http://localhost:1882/spurs/.......

public class SpursController {

	private SpursService service;

	@Autowired
	public SpursController(SpursService service) {
		this.service = service;

	}

	@GetMapping("/test")
	public String test() {
		return "COYS";

	}

	@PostMapping("/create")
	public ResponseEntity<Spurs> create(@RequestBody Spurs player) {
		return new ResponseEntity<Spurs>(this.service.create(player), HttpStatus.CREATED);

	}

	@GetMapping("/read")
	public ResponseEntity<List<Spurs>> read() {
		return new ResponseEntity<List<Spurs>>(this.service.read(), HttpStatus.OK);

	}

	@PutMapping("/replace/{id}")
	public ResponseEntity<Spurs> update(@PathVariable Long id, @RequestBody Spurs player) {
		return new ResponseEntity<Spurs>(this.service.update(id, player), HttpStatus.ACCEPTED);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id) {
		return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);

	}

}
