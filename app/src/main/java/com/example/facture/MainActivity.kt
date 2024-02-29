import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSeConnecter.setOnClickListener {
            val intent = Intent(this, AuthentificationActivity::class.java)
            startActivity(intent)
        }

        btnSaisirFacture.setOnClickListener {
            val intent = Intent(this, SaisieFactureActivity::class.java)
            startActivity(intent)
        }

        btnCalculerFacture.setOnClickListener {
            val intent = Intent(this, CalculFactureActivity::class.java)
            startActivity(intent)
        }
    }
}
