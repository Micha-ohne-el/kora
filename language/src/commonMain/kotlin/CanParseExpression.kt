interface CanParseExpression {
	fun parseExpression(sourceCode: String): Expression<*>
}
