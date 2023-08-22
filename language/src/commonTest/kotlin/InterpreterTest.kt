import expressions.LiteralExpression
import kotlin.test.Test
import kotlin.test.assertEquals

class InterpreterTest {
	@Test
	fun `calling run passes source code to parser`() {
		val parser = SpyParser()

		val interpreter = Interpreter(parser)

		interpreter.run("test source code")

		assertEquals("NOT CORRECT", parser.receivedSourceCode)
	}


	private class SpyParser : CanParseExpression {
		var receivedSourceCode = ""

		override fun parseExpression(sourceCode: String): Expression<*> {
			receivedSourceCode = sourceCode

			return LiteralExpression(sourceCode)
		}
	}
}
