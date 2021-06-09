package com.example.aplikar

import android.content.Intent
import android.content.pm.ActivityInfo
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TahapDua : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionList:ArrayList<QuestionBank>?= Constant.getConstant()
    private var question:QuestionBank=mQuestionList!![mCurrentPosition - 1]
    //private var mSelectedOptionPosition:Int = 0

    private var soal1: Button = findViewById(R.id.btn_1)
    private var soal2: Button = findViewById(R.id.btn_2)
    private var soal3: Button = findViewById(R.id.btn_3)
    private var soal4: Button = findViewById(R.id.btn_4)
    private var soal5: Button = findViewById(R.id.btn_5)
    private var soal6: Button = findViewById(R.id.btn_6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahap_dua)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        setQuestion()
       // updateQuestion()


        //mQuestionList = Constant.getConstant()

        //mCurrentPosition = 1
        //val question:QuestionBank = mQuestionList!![mCurrentPosition!! - 1]

        /*
        soal1.text = question.opt1
        soal2.text = question.opt2
        soal3.text = question.opt3
        soal4.text = question.opt4
        soal5.text = question.opt5
        soal6.text = question.opt6
         */

        soal1.setOnClickListener(this)
        soal2.setOnClickListener(this)
        soal3.setOnClickListener(this)
        soal4.setOnClickListener(this)
        soal5.setOnClickListener(this)
        soal6.setOnClickListener(this)

       /* soal1.setText(question.opt1)
        soal2.setText(question.opt2)
        soal3.setText(question.opt3)
        soal4.setText(question.opt4)
        soal5.setText(question.opt5)
        soal6.setText(question.opt6)*/
    }

    private fun defaultOptionView(){
        val option = ArrayList<Button>()
        option.add(0,findViewById(R.id.btn_1))
        option.add(1,findViewById(R.id.btn_2))
        option.add(2,findViewById(R.id.btn_3))
        option.add(3,findViewById(R.id.btn_4))
        option.add(4,findViewById(R.id.btn_5))
        option.add(5,findViewById(R.id.btn_6))

        for (options in option){
            options.setTextColor(Color.parseColor("#000000"))
            options.setBackgroundColor(Color.parseColor("#987654"))
            options.typeface = Typeface.DEFAULT

        }

    }

    override fun onClick(v: View?) {
        when{
            mCurrentPosition < 15 -> {
                setQuestion()
                when (v?.id) {
                    R.id.btn_1 -> {
                        mCurrentPosition = +1
                        setQuestion()
                    }
                    R.id.btn_2 -> {
                        mCurrentPosition = +1
                        setQuestion()
                    }
                    R.id.btn_3 -> {
                        mCurrentPosition = +1
                        setQuestion()
                    }
                    R.id.btn_4 -> {
                        mCurrentPosition = +1
                        setQuestion()
                    }
                    R.id.btn_5 -> {
                        mCurrentPosition = +1
                        setQuestion()
                    }
                    R.id.btn_6 -> {
                        mCurrentPosition = +1
                        setQuestion()
                    }
                }
            }
            else -> {
                val intent = Intent(this, TahapTiga::class.java)
                startActivity(intent)
                finish()
            }
        }
        /*when (v?.id) {
            R.id.btn_1 -> {
                mCurrentPosition = +1
                when {
                    mCurrentPosition < 15 -> {
                        setQuestion()
                    }
                    else -> {
                        val intent = Intent(this, TahapTiga::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            R.id.btn_2 -> {
                mCurrentPosition = +1
                when {
                    mCurrentPosition < 15 -> {
                        setQuestion()
                    }
                    else -> {
                        val intent = Intent(this, TahapTiga::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            R.id.btn_3 -> {
                mCurrentPosition = +1
                when {
                    mCurrentPosition < 15 -> {
                        setQuestion()
                    }
                    else -> {
                        val intent = Intent(this, TahapTiga::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            R.id.btn_4 -> {
                mCurrentPosition = +1
                when {
                    mCurrentPosition < 15 -> {
                        setQuestion()
                    }
                    else -> {
                        val intent = Intent(this, TahapTiga::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            R.id.btn_5 -> {
                mCurrentPosition = +1
                when {
                    mCurrentPosition < 15 -> {
                        setQuestion()
                    }
                    else -> {
                        val intent = Intent(this, TahapTiga::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            R.id.btn_6 -> {
                mCurrentPosition = +1
                when {
                    mCurrentPosition < 15 -> {
                        setQuestion()
                    }
                    else -> {
                        val intent = Intent(this, TahapTiga::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }

         */
    }

    private fun setQuestion() {
        soal1.text = question.opt1
        soal2.text = question.opt2
        soal3.text = question.opt3
        soal4.text = question.opt4
        soal5.text = question.opt5
        soal6.text = question.opt6
    }


       /* soal1.setOnClickListener {
            val intent = Intent(this, TahapTiga::class.java)
            startActivity(intent)
            finish()
        }

        soal2.setOnClickListener {
            val intent = Intent(this, TahapTiga::class.java)
            startActivity(intent)
            finish()
        }

        soal3.setOnClickListener {
            val intent = Intent(this, TahapTiga::class.java)
            startActivity(intent)
            finish()
        }

        soal4.setOnClickListener {
            val intent = Intent(this, TahapTiga::class.java)
            startActivity(intent)
            finish()
        }

        soal5.setOnClickListener {
            val intent = Intent(this, TahapTiga::class.java)
            startActivity(intent)
            finish()
        }

        soal6.setOnClickListener {
            val intent = Intent(this, TahapTiga::class.java)
            startActivity(intent)
            finish()
        }
    }*/



    /*fun updateQuestion(){
        soal1.setOnClickListener {
            mCurrentPosition +=1
        }

        soal2.setOnClickListener {
            mCurrentPosition +=1
        }

        soal3.setOnClickListener {
            mCurrentPosition +=1
        }

        soal4.setOnClickListener {
            mCurrentPosition +=1
        }

        soal5.setOnClickListener {
            mCurrentPosition +=1
        }

        soal6.setOnClickListener {
            mCurrentPosition +=1
        }

        if(mCurrentPosition>15){
            val intent = Intent(this, TahapTiga::class.java)
            startActivity(intent)
            finish()
        }

        public int getLength(){

        }
    }*/

}