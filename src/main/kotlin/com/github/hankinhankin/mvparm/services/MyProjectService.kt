package com.github.hankinhankin.mvparm.services

import com.github.hankinhankin.mvparm.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
