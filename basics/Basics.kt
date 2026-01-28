class MainActivity: ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			WeekTwoTheme {
				Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding -> 
					Greeting(
						name = "Class",
						modifier = Modifier.padding(innerPadding)
					)
				}
			}
		}
	}
}

@Composable
fun Greeting(name:String, modifier:Modifier = Modifier) {
	Text(
		text = "Hello $name",
		modifier = modifier
	)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	WeekTwoTheme {
		Greeting("World")
	}
}