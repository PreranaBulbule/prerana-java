package com.xworkz.Assignment;

import java.util.List;

public class Experience {
    List<ExperienceDetail> details;

    public Experience(List<ExperienceDetail> details) {
        this.details = details;
    }

    public void display() {
        for (ExperienceDetail detail : details) {
            detail.display();
        }
    }
}

