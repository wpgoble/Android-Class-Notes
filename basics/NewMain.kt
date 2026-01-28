import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			MyApp()
		}
	}
}


@Composable
fun MyApp() {
	var count by remember { mutableStateOf(0) }
	
	Column(
		modifier = Modifier.padding(16.dp)
	) {
		Text(text = "Counter: $count", style = MaterialTheme.typography.bodyLarge)
		Spacer(modifier = Modifier.height(16.dp))
		Button(onClick = { count++ }) {
			Text("Increment")
		}
	}
}
