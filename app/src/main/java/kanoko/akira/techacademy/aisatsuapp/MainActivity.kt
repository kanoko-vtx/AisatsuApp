package kanoko.akira.techacademy.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.app.DatePickerDialog

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.Button -> showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { _, hour, minute ->
                Log.d("Aisatsu", "$hour:$minute")

                if (hour in 0..1)
                    Log.d("Aisatsu", "こんばんは")

                if (hour in 2..9)
                    Log.d("Aisatsu", "おはよう")

                if (hour in 10..17)
                    Log.d("Aisatsu", "こんにちは")

                if (hour in 18..24)
                    Log.d("Aisatsu", "こんばんは")

            },
            13, 0, true)
        timePickerDialog.show()
    }
}
