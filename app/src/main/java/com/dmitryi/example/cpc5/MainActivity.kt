package com.dmitryi.example.cpc5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val KEY_FOR_STATE = "KeyForState"
private const val TAG_FOR_PUSHKIN = "PushkinTag"
var indexPoem = 0

/* Стихотворение, которое мы будем выводить в Лог через жизненные циклы

НО, т.к. писать на русском(некрасиво):

The poem that we will output to the Log through the life cycles

 */
val thePoem = listOf(
    "Ты видел деву на скале",           //0
    "В одежде белой над волнами",       //1
    "Когда, бушуя в бурной мгле,",      //2
    "Играло море с берегами,",          //3
    "Когда луч молний озарял",          //4
    "Ее всечасно блеском алым",         //5
    "И ветер бился и летал",            //6
    "С ее летучим покрывалом?",         //7
    "Прекрасно море в бурной мгле",     //8
    "И небо в блесках без лазури;",     //9
    "Но верь мне: дева на скале",       //10
    "Прекрасней волн, небес и бури"     //11
)

class MainActivity : AppCompatActivity() {
    private lateinit var titleOfPoem: TextView

    fun nextStep () {
        indexPoem = indexPoem + 1
    }

    fun printText () {
        titleOfPoem.text = thePoem[indexPoem]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        titleOfPoem = findViewById(R.id.titleOfLine)

        if (savedInstanceState != null) {
            titleOfPoem.text = savedInstanceState.getString(KEY_FOR_STATE)
        }

        if (indexPoem == indexPoem) {
            printText()
        } else {
            titleOfPoem.text = thePoem[indexPoem + 1]
        }
        Log.d(TAG_FOR_PUSHKIN, "onCreate():${thePoem[indexPoem]}")
        nextStep()
    }

    override fun onStart() {
        super.onStart()

        if (indexPoem == indexPoem) {
            printText()
            Log.d(TAG_FOR_PUSHKIN, "onStart():${thePoem[indexPoem]}")
        }
        nextStep()
    }

    override fun onResume() {
        super.onResume()

        if (indexPoem == indexPoem) {
            printText()
            Log.d(TAG_FOR_PUSHKIN, "onResume():${thePoem[indexPoem]}")
        }
        nextStep()
    }

    override fun onPause() {
        super.onPause()

        if (indexPoem == indexPoem) {
            printText()
            Log.d(TAG_FOR_PUSHKIN, "onPause():${thePoem[indexPoem]}")
        }
        nextStep()
    }

    override fun onStop() {
        super.onStop()

        if (indexPoem == indexPoem) {
            printText()
            Log.d(TAG_FOR_PUSHKIN, "onStop():${thePoem[indexPoem]}")
        }
        nextStep()
    }

    override fun onDestroy() {
        super.onDestroy()

        if (indexPoem == indexPoem) {
            printText()
            Log.d(TAG_FOR_PUSHKIN, "onDestroy():${thePoem[indexPoem]}")
        }
        nextStep()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(KEY_FOR_STATE, titleOfPoem.text.toString())
        if (indexPoem >= 13) {
            indexPoem = 0
        }
    }
}