package project

import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component

@Component
class TestData(private val projectRepository: ProjectRepository,
			   private val taskRepository: TaskRepository) : ApplicationListener<ApplicationReadyEvent> {
	override fun onApplicationEvent(p0: ApplicationReadyEvent) {
		println("Creating test data...")
		val alphaId: Int = projectRepository.save(Project(name = "alpha")).id!!
		projectRepository.save(Project(name = "beta"))
		projectRepository.save(Project(name = "alpha"))
		taskRepository.save(Task(color = "blue", status = "go", project = alphaId))
		println("Querying test data...")
		projectRepository.findAll().forEach { println(it) }
		taskRepository.findAll().forEach { println(it) }
		println("Initialization phase finished")
	}
}