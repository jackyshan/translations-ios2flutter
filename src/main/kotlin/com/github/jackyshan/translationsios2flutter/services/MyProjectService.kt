package com.github.jackyshan.translationsios2flutter.services

import com.intellij.openapi.project.Project
import com.github.jackyshan.translationsios2flutter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
