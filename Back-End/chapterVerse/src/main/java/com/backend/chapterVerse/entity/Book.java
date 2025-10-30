package com.backend.chapterVerse.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	private String author;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String image;
	
	@Column(nullable = false)
	private Double prize;
	
	@Column(length = 1000) // Added description field with longer length for text
	private String description;
	
	@ElementCollection
	@CollectionTable(name = "book_genres", joinColumns = @JoinColumn(name = "book_id"))
	@Column(name = "genre")
	private List<String> genres = new ArrayList<String>();

	// Updated constructor with description
	public Book(String author, String title, String image, Double prize, String description, List<String> genres) {
		super();
		this.author = author;
		this.title = title;
		this.image = image;
		this.prize = prize;
		this.description = description;
		this.genres = genres;
	}

	public Book() {
		super();
	}

	// Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getPrize() {
		return prize;
	}

	public void setPrize(Double prize) {
		this.prize = prize;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
}