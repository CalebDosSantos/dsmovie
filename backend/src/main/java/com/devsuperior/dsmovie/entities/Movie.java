package com.devsuperior.dsmovie.entities;

import java.util.Set;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_movie")
public class Movie {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private Double score;
  private Integer count;
  private String image;

  @OneToMany(mappedBy = "id.movie")
  private Set<Score> scores = new HashSet<>();


  public Movie(){

  }

  public Movie(Long id, String title, Double score, Integer count, String image) {

    this.id    =   id;
    this.title =   title;
    this.score =   score;
    this.count =   count;
    this.image =   image;

  }

  public Long getId() {
    return id;
  }
  public String getTitle() {
    return title;
  }
  public Double getScore() {
    return score;
  }
  public Integer getCount() {
    return count;
  }
  public String getImage() {
    return image;
  }

  public void setId(Long id) {
    this.id = id;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public void setScore(Double score) {
    this.score = score;
  }
  public void setCount(Integer count) {
    this.count = count;
  }
  public void setImage(String image) {
    this.image = image;
  }

  public Set<Score> getScores() {
    return scores;
  }

}
