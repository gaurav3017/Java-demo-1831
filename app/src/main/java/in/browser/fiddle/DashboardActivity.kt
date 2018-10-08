package `in`.browser.fiddle

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.google.firebase.auth.FirebaseAuth

class DashboardActivity : AppCompatActivity() {
//    private var mAuthListener: FirebaseAuth.AuthStateListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

//        mAuthListener = FirebaseAuth.AuthStateListener { firebaseAuth ->
//            if (firebaseAuth.currentUser == null) {
//                startActivity(Intent(this@DashboardActivity, LoginActivity::class.java))
//            }
//        }
    }
}
