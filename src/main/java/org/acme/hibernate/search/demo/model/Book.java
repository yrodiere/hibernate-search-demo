package org.acme.hibernate.search.demo.model;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.search.mapper.pojo.mapping.definition.annotation.FullTextField;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Book extends PanacheEntity {

	@FullTextField(analyzer = "standard")
	public String title;

	@ManyToOne
	@JsonbTransient
	public Author author;
}
