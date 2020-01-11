package vlados.dudos.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var planFragment: PlanFragment
    lateinit var lessonsFragment: LessonsFragment
    lateinit var reportsFragment: ReportsFragment
    lateinit var profileFragment: ProfileFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val bottomNavigation: BottomNavigationView = findViewById(R.id.navigation_bar)


        bottomNavigation.setOnNavigationItemSelectedListener { item ->

            when (item.itemId){

                R.id.bn_plan -> {
                    planFragment = PlanFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_holder, planFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()

                }
                R.id.bn_lessons -> {
                    lessonsFragment = LessonsFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_holder, lessonsFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()

                }
                R.id.bn_reports -> {
                    reportsFragment = ReportsFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_holder, reportsFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()

                }
                R.id.bn_profile -> {
                    profileFragment = ProfileFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_holder, profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()

                }


            }

            true
        }
    }


}
