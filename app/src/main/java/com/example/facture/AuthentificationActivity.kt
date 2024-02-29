import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_authentification.*
import kotlinx.android.synthetic.main.activity_authentification.view.*

class AuthentificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentification)

        btnConnecter.setOnClickListener {
            val login = etLogin.text.toString()
            val password = etPassword.text.toString()

            if (login == "etudiant" && password == "AzertY") {
                Toast.makeText(this, "Authentification réussie", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Authentification échouée", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
