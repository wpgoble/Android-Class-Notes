import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
	private var count = 0
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val counterTextView: TextView = findViewById(R.id.counterTextView)
		val incrementButton: Button = findViewById(R.id.incrementButton)

		incrementButton.setOnClickListener {
			count++
			counterTextView.text = "Counter: $count"
		}
	}
}