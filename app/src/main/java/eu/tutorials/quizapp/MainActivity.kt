package eu.tutorials.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import eu.tutorials.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val buttonStart = binding.btnStart
        val nameTxt = binding.etName

        buttonStart.setOnClickListener {
            if (nameTxt.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter Your Name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
                // TODO Pass the name through intent using the constant variable which we have created.
                intent.putExtra(Constants.USER_NAME, nameTxt.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}