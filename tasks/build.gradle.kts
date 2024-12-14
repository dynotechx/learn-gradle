// Custom tasks
abstract class HelloTask: DefaultTask() {
	@TaskAction
	fun hello() {
		println("Hello from custom tasks")
	}
}

tasks.register<HelloTask>("hello") {}

tasks.register<Copy>("moveGet") {
	from($rootDir/tasks/source)
	into($rootDir/tasks/target)
	include("*.txt")
}