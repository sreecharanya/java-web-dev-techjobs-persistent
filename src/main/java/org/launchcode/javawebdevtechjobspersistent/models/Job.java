package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{


    @ManyToOne
    private Employer employer;
    @ManyToMany
    private List<Skill> skills=new ArrayList<>();


    public Job(Employer anEmployer) {
        super();
        this.employer = anEmployer;
        // this.skills = someSkills;
    }
    public Job() {
    }

    // Getters and setters.


    public List<Skill> getSkill() {
        return this.skills;
    }
public void setSkills(List<Skill> skills){this.skills= skills;}


public Employer getEmployer() {
        return this.employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

}
