package training.geography.rotation

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardView = findViewById<CardView>(R.id.fourgroups)
        val textView2 = findViewById<TextView>(R.id.group2)
        val textView3 = findViewById<TextView>(R.id.group3)
        val textView4 = findViewById<TextView>(R.id.group4)

        val rotatetextview2animation =  RotateAnimation(0f, 270f, Animation.RELATIVE_TO_SELF, .5f, Animation.RELATIVE_TO_SELF, .5f)
            rotatetextview2animation.setDuration(1000)
            rotatetextview2animation.setFillAfter(true)
            textView2.setAnimation(rotatetextview2animation)
            textView2.startAnimation(rotatetextview2animation)
        val rotatetextview3animation =  RotateAnimation(0f, 180f, Animation.RELATIVE_TO_SELF, .5f, Animation.RELATIVE_TO_SELF, .5f)
        rotatetextview3animation.setDuration(1000)
        rotatetextview3animation.setFillAfter(true)
        textView3.setAnimation(rotatetextview3animation)
        textView3.startAnimation(rotatetextview3animation)
        val rotatetextview4animation =  RotateAnimation(0f, 90f, Animation.RELATIVE_TO_SELF, .5f, Animation.RELATIVE_TO_SELF, .5f)
        rotatetextview4animation.setDuration(1000)
        rotatetextview4animation.setFillAfter(true)
        textView4.setAnimation(rotatetextview4animation)
        textView4.startAnimation(rotatetextview4animation)


        val buttonrotateleft = findViewById<Button>(R.id.rotatebuttonleft)

        //val rotateanimation =  RotateAnimation(0f, 90f, Animation.RELATIVE_TO_SELF, .5f, Animation.RELATIVE_TO_SELF, .5f)

        buttonrotateleft.setOnClickListener {

            cardView.animate().apply {
                rotationBy(-90f)
                duration = 1000L
                start()
            }
        }

        val buttonrotateright = findViewById<Button>(R.id.rotatebuttonright)
        buttonrotateright.setOnClickListener {

            cardView.animate().apply {
                rotationBy(90f)
                duration = 1000L
                start()
            }
        }


        val buttonchoose= findViewById<Button>(R.id.choosebutton)

        buttonchoose.setOnClickListener {

            val intent = Intent(this, TripleRecyclerView::class.java)
            startActivity(intent)
        }
    }
}
