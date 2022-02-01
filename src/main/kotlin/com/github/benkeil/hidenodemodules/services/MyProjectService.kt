package com.github.benkeil.hidenodemodules.services

import com.intellij.openapi.project.Project
import com.github.benkeil.hidenodemodules.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
