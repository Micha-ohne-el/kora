import expressions.LiteralExpression
import kotlin.js.JsName
import kotlin.test.Test
import kotlin.test.assertEquals

class InterpreterTest {
	@Test
	@JsName("calling_run_passes_source_code_to_parser")
	fun `calling run passes source code to parser`() {
		val parser = SpyParser()

		val interpreter = Interpreter(parser)

		interpreter.run("test source code")

		assertEquals("test source code", parser.receivedSourceCode)
	}


	private class SpyParser : CanParseExpression {
		var receivedSourceCode = ""

		override fun parseExpression(sourceCode: String): Expression<*> {
			receivedSourceCode = sourceCode

			return LiteralExpression(sourceCode)
		}
	}
}
