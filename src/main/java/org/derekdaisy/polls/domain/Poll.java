package org.derekdaisy.polls.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Integer votesNum;

    public Poll() {}

    public Poll(Long id, String name, String description, Integer votesNum) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.votesNum = votesNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVotesNum() {
        return votesNum;
    }

    public void setVotesNum(Integer votesNum) {
        this.votesNum = votesNum;
    }

    @Override
    public String toString() {
        return super.toString() + "name: " + name + ", description: " + description +
                ", votesNum: " + votesNum;
    }

}
