package org.acme.hibernate.search.demo.model;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Book extends PanacheEntity {

	public String title;

	@ManyToOne
	@JsonbTransient
	public Author author;
}
