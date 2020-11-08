package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity { //has id and name inherited from abstr

    @NotNull(message="Location is required")
    private String location;

    @OneToMany(mappedBy = "employer") // must be name of the ManyToOne
    private final List<Job> jobs = new ArrayList<>(); // dont add to constr bc created in field declaration


    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }


}
