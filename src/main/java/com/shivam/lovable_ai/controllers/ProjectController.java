package com.shivam.lovable_ai.controllers;


import com.shivam.lovable_ai.entity.Project;
import com.shivam.lovable_ai.entity.ProjectFile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {


    @GetMapping
    public List<Project> handleReturnAllProjects() {
        return new ArrayList<>();
    }


    @GetMapping("/{id}/files")
    public ProjectFile handleReturnProjectFile(@RequestParam("id") String id) {
        return null;
    }
}
