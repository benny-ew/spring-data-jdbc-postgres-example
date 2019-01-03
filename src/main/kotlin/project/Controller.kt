package project

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller (private val projectRepository: ProjectRepository, private val taskRepository: TaskRepository){

	@GetMapping("/projects")
	fun projects() = projectRepository.findAll()

	@GetMapping("/projects/name/{name}")
	fun projectsByName(@PathVariable name: String) = projectRepository.findByName(name)

	@PutMapping("/projects/{id}/{name}")
	fun addTaskToProject(@PathVariable name: String, @PathVariable id: String) = {
		projectRepository.findByName(name)
	}

	@GetMapping("/projects/{id}")
	fun project(@PathVariable id: Int) = projectRepository.findById(id)

	@GetMapping("/test")
	fun test() = Project(1, "Alpha")

	@GetMapping("/tasks/{id}")
	fun task(@PathVariable id: Int) = taskRepository.findById(id)
}
