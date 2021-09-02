package com.github.boobiq.bookmarkrefresh.services

import com.github.boobiq.bookmarkrefresh.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
