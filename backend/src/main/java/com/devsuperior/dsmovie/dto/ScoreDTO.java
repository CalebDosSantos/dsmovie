package com.devsuperior.dsmovie.dto;


public class ScoreDTO {

  private Long id;
  //teste
  private Long movieId;
  private String email;
  private Double score;


  public ScoreDTO() {

  }

  public Long getId() {
    return id;
  }
  public void setId (Long id){
    this.id = id;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public Double getScore() {
    return score;
  }
  public void setScore(Double score) {
    this.score = score;
  }
  //teste
  public Long getMovieId() {
    return movieId;
  }
}
