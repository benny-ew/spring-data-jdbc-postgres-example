package project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories

@SpringBootApplication
@EnableJdbcRepositories
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}

//TODO actually this whole block is not needed, it works  also without it
//@Configuration
//@EnableJdbcRepositories
//class CustomerConfig : JdbcConfiguration() {
//
//	@Bean
//	fun operations(): NamedParameterJdbcOperations {
//		return NamedParameterJdbcTemplate(dataSource())
//	}
//
//	@Bean
//	fun transactionManager(): DataSourceTransactionManager {
//		return DataSourceTransactionManager(dataSource())
//	}
//
//	@Bean
//	fun dataSource(): DataSource {
//		return EmbeddedDatabaseBuilder()
//				.generateUniqueName(true)
//				.setType(EmbeddedDatabaseType.H2)
//				.addScript("project-schema.sql")
//				.build()
//	}
//}

