package com.github.munger100.aldoextensionidea.services

import com.intellij.openapi.project.Project
import com.github.munger100.aldoextensionidea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
