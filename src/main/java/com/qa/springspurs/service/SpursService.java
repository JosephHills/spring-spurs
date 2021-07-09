package com.qa.springspurs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.springspurs.domain.Spurs;
import com.qa.springspurs.repo.SpursRepo;

@Service

public class SpursService {

	private SpursRepo repo;

	public SpursService(SpursRepo repo) {
		this.repo = repo;

	}

	public Spurs create(Spurs player) {
		return this.repo.saveAndFlush(player);

	}

	public List<Spurs> read() {
		return this.repo.findAll();

	}

	public Spurs update(Long id, Spurs newPlayer) {
		Spurs existing = this.repo.getById(id);
		existing.setName(newPlayer.getName());
		existing.setShirtNumber(newPlayer.getShirtNumber());
		existing.setPosition(newPlayer.getPosition());
		existing.setApps(newPlayer.getApps());
		existing.setGoals(newPlayer.getGoals());
		
		Spurs updated = this.repo.save(existing);
		return updated;
		
	}

	public boolean delete(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);
		
	}
	
}
