package project

import org.springframework.data.annotation.Id
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository


data class Project(@Id val id: Int? = null, val name: String)

interface ProjectRepository: CrudRepository<Project,Int>{

    @Query("select * from project where name = :name")
    fun findByName(name: String): List<Project>
}

