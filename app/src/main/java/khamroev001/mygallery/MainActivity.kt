package khamroev001.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var img1: ImageView
    private lateinit var img2: ImageView
    private lateinit var img3: ImageView
    private lateinit var img4: ImageView
    private lateinit var img5: ImageView
    private lateinit var img6: ImageView

    var list: MutableList<ImageView> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadButton()
        loadList()

        for (i in 0 until  list.size) {
            list[i].setOnClickListener{
                sendResource(i)
            }
        }

    }

    private fun loadButton() {
        img1 = findViewById(R.id.img1)
        img2 = findViewById(R.id.img2)
        img3 = findViewById(R.id.img3)
        img4 = findViewById(R.id.img4)
        img5 = findViewById(R.id.img5)
        img6 = findViewById(R.id.img6)
    }

    private fun loadList(){
        list.add(img1)
        list.add(img2)
        list.add(img3)
        list.add(img4)
        list.add(img5)
        list.add(img6)
    }

    private fun sendResource(imageIndex: Int) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("picture", imageIndex)
        startActivity(intent)
    }
}