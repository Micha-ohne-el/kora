import com.github.ajalt.clikt.core.subcommands

fun main(args: Array<String>) {
	Kora().apply {
		subcommands(Execute())
		main(args)
	}
}
