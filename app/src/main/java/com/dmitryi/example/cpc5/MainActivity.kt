package com.dmitryi.example.cpc5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView


private const val TAG_FOR_PUSHKIN = "PushkinTag"

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
    "Прекрасней волн, небес и бури")    //11

class MainActivity : AppCompatActivity() {

    val titleOfPoem: TextView= findViewById(R.id.titleOfLine)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        titleOfPoem.text= thePoem[0]

        Log.d(TAG_FOR_PUSHKIN, "onCreate():${thePoem[0]}")
    }

    override fun onStart() {
        super.onStart()

        titleOfPoem.text= thePoem[1]

        Log.d(TAG_FOR_PUSHKIN, "onStart():${thePoem[1]}")
    }

    override fun onResume() {
        super.onResume()

        titleOfPoem.text= thePoem[2]

        Log.d(TAG_FOR_PUSHKIN, "onResume():${thePoem[2]}")
    }

    override fun onPause() {
        super.onPause()

        titleOfPoem.text= thePoem[3]

        Log.d(TAG_FOR_PUSHKIN, "onPause():${thePoem[3]}")
    }

    override fun onStop() {
        super.onStop()

        titleOfPoem.text= thePoem[4]

        Log.d(TAG_FOR_PUSHKIN, "onStop():${thePoem[4]}")
    }

    override fun onDestroy() {
        super.onDestroy()

        titleOfPoem.text= thePoem[5]

        Log.d(TAG_FOR_PUSHKIN, "onDestroy():${thePoem[5]}")
    }

}