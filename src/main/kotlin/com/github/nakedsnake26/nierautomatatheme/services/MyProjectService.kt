package com.github.nakedsnake26.nierautomatatheme.services

import com.intellij.openapi.project.Project
import com.github.nakedsnake26.nierautomatatheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
