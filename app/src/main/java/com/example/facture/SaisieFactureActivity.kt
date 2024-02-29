import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_saisie_facture.*

class SaisieFactureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saisie_facture)

        remise.isEnabled = false
        btnCalculerTTC.isEnabled = false

    }
}
