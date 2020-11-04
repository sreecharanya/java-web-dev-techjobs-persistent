package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {


    @NotBlank(message = "location required")
    @Size(min = 3, max = 50)
    private String location;

    @OneToMany
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();

    public Employer(@NotBlank(message = "location required") @Size(min = 3, max = 50) String location) {
        this.location = location;
    }
    public Employer() {
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
