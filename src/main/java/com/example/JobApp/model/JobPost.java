package com.example.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component

public class JobPost {
    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

    public <E> JobPost(int i, String javaDeveloper, String s, int i1, List<String> es) {
        this.postId=i;
        this.postProfile=javaDeveloper;
        this.postDesc=s;
        this.reqExperience=i1;
        this.postTechStack=es;
    }
}
