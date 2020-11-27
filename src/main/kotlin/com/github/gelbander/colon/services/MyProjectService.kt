package com.github.gelbander.colon.services

import com.intellij.openapi.project.Project
import com.github.gelbander.colon.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
