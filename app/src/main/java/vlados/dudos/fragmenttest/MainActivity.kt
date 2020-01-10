package vlados.dudos.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var isFragmentPlanLoaded = true
    var isFragmentLessonsLoaded = false
    var isFragmentReportsLoaded = false
    var isFragmentProfileLoaded = false

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Change = findViewById<ImageView>(R.id.plan_btn)
        val Change1 = findViewById<ImageView>(R.id.lessons_btn)
        val Change2 = findViewById<ImageView>(R.id.reports_btn)
        val Change3 = findViewById<ImageView>(R.id.profile_btn)


        Change.setOnClickListener({showPlanFragment()})
        Change1.setOnClickListener({showLessonsFragment()})
        Change2.setOnClickListener({showReportsFragment()})
        Change3.setOnClickListener({showProfileFragment()})
    }

    fun showPlanFragment() {
        val transaction = manager.beginTransaction()
        val fragment = PlanFragment()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()


        isFragmentPlanLoaded = true
        isFragmentLessonsLoaded = false
        isFragmentReportsLoaded = false
        isFragmentLessonsLoaded = false
    }

    fun showLessonsFragment() {
        val transaction = manager.beginTransaction()
        val fragment = LessonsFragment()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()


        isFragmentPlanLoaded = false
        isFragmentLessonsLoaded = true
        isFragmentReportsLoaded = false
        isFragmentLessonsLoaded = false
    }

    fun showReportsFragment() {
        val transaction = manager.beginTransaction()
        val fragment = ReportsFragment()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()


        isFragmentPlanLoaded = false
        isFragmentLessonsLoaded = false
        isFragmentReportsLoaded = true
        isFragmentLessonsLoaded = false
    }

    fun showProfileFragment() {
        val transaction = manager.beginTransaction()
        val fragment = ProfileFragment()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()


        isFragmentPlanLoaded = false
        isFragmentLessonsLoaded = false
        isFragmentReportsLoaded = false
        isFragmentLessonsLoaded = true
    }

}
