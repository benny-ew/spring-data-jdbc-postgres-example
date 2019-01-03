package project

import org.springframework.data.annotation.Id
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

data class Task(@Id val id: Int? = null,
                val color: String,
                val status: String,
                val project: Int)

interface TaskRepository: CrudRepository<Task, Int> {

    @Query("select * from task where name = :name")
    fun findByName(name: String): List<Task>
}
