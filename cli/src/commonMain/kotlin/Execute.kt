import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument

class Execute : CliktCommand() {
	private val code by argument()

	override fun run() {
		val interpreter = KoraInterpreter()

		interpreter.add(code)

		echo(interpreter.run())
	}
}
