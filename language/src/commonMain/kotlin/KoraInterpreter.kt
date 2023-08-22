class KoraInterpreter {
	fun add(code: String) {
		sourceCode.append(code)
	}

	fun run(): String {
		return "(pretend like this is the result of '$sourceCode')"
	}


	private var sourceCode = StringBuilder()
}
