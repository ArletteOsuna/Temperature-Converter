package edu.esade.temperatureconverter

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun convertCtoF(view:View) {
        // Connect the graphic components to two variables that allow
        // access to the components programmatically.
        val text_view_temp_in = findViewById<TextView>(R.id.temp_in_id)
        val text_view_temp_out = findViewById<TextView>(R.id.temp_out_id)
        // Extracts and converts the text information provided by the user // in the text field to a numeric value.
        var temp_in = text_view_temp_in.text.toString().toDoubleOrNull() // Check that the conversion was successful and that the variable // temp_in contains a numeric value.
        if (temp_in == null) {
            temp_in = 0.0
        }
        // Variables to be used in the formula are declared.
        var temp_c = temp_in
        var temp_f = 0.0
        //Temperature scale conversion formula.
        temp_f = (temp_c * 9/5) + 32
        // Loc function that allows to show in the Android Studio console // the content of the temp_f variable. Just a check.
        Log.d("Temp out", "The temp conversion is: $temp_f ºF")
        // The text property of the button is loaded with what you
        // want to show. As we want to show the content of the variable // temp_f, we use the structure $variable_name to show
        // its content.
        text_view_temp_out.text = "$temp_f ºF"

        // Force hide the virtual keyboard after temperature conversion.
        hideKeyboard(view = view)
    }

    fun convertFtoC(view:View) {
        // Connect the graphic components to two variables that allow
        // access to the components programmatically.
        val text_view_temp_in = findViewById<TextView>(R.id.temp_in_id)
        val text_view_temp_out = findViewById<TextView>(R.id.temp_out_id)
        // Extracts and converts the text information provided by the user // in the text field to a numeric value.
        var temp_in = text_view_temp_in.text.toString().toDoubleOrNull() // Check that the conversion was successful and that the variable // temp_in contains a numeric value.
        if (temp_in == null) {
            temp_in = 0.0
        }
        // Variables to be used in the formula are declared.
        var temp_f = temp_in
        var temp_c = 0.0
        //Temperature scale conversion formula.
        temp_c = (temp_f - 32) * 5/9
        // Loc function that allows to show in the Android Studio console // the content of the temp_f variable. Just a check.
        Log.d("Temp out", "The temp conversion is: $temp_c ºC")
        // The text property of the button is loaded with what you
        // want to show. As we want to show the content of the variable // temp_f, we use the structure $variable_name to show
        // its content.
        text_view_temp_out.text = "$temp_c ºC"

        // Force hide the virtual keyboard after temperature conversion.
        hideKeyboard(view = view)
    }

    /*
    * Action function for C to K conversion.
    */
    fun convertCtoK(view: View) {
        // Connect the graphic components to two variables that allow
        // access to the components programmatically.
        val text_view_temp_in = findViewById<TextView>(R.id.temp_in_id)
        val text_view_temp_out = findViewById<TextView>(R.id.temp_out_id)

        // Extracts and converts the text information provided by the user
        // in the text field to a numeric value.
        var temp_in = text_view_temp_in.text.toString().toDoubleOrNull()
        // Check that the conversion was successful and that the variable
        // temp_in contains a numeric value.
        if (temp_in == null) {
            temp_in = 0.0
        }

        // Variables to be used in the formula are declared.
        var temp_c = temp_in
        var temp_k = 0.0

        //Temperature scale conversion formula.
        temp_k = temp_c + 273.15

        // Log function that allows to show in the Android Studio console
        // the content of the temp_f variable. Just a check.
        Log.d("Temp out", "The temp conversion is: $temp_k ºK")

        // The text property of the button is loaded with what you
        // want to show. As we want to show the content of the variable
        // temp_f, we use the structure $variable_name to show
        // its content.
        text_view_temp_out.text = "$temp_k ºK"

        // Force hide the virtual keyboard after temperature conversion.
        hideKeyboard(view = view)
    }

    fun convertKtoC(view:View) {
        // Connect the graphic components to two variables that allow
        // access to the components programmatically.
        val text_view_temp_in = findViewById<TextView>(R.id.temp_in_id)
        val text_view_temp_out = findViewById<TextView>(R.id.temp_out_id)
        // Extracts and converts the text information provided by the user // in the text field to a numeric value.
        var temp_in = text_view_temp_in.text.toString().toDoubleOrNull() // Check that the conversion was successful and that the variable // temp_in contains a numeric value.
        if (temp_in == null) {
            temp_in = 0.0
        }
        // Variables to be used in the formula are declared.
        var temp_k = temp_in
        var temp_c = 0.0
        //Temperature scale conversion formula.
        temp_c = temp_k - 273.15
        // Loc function that allows to show in the Android Studio console // the content of the temp_f variable. Just a check.
        Log.d("Temp out", "The temp conversion is: $temp_c ºC")
        // The text property of the button is loaded with what you
        // want to show. As we want to show the content of the variable // temp_f, we use the structure $variable_name to show
        // its content.
        text_view_temp_out.text = "$temp_c ºC"

        // Force hide the virtual keyboard after temperature conversion.
        hideKeyboard(view = view)
    }


    fun convertKtoF(view:View) {
        // Connect the graphic components to two variables that allow
        // access to the components programmatically.
        val text_view_temp_in = findViewById<TextView>(R.id.temp_in_id)
        val text_view_temp_out = findViewById<TextView>(R.id.temp_out_id)
        // Extracts and converts the text information provided by the user // in the text field to a numeric value.
        var temp_in = text_view_temp_in.text.toString().toDoubleOrNull() // Check that the conversion was successful and that the variable // temp_in contains a numeric value.
        if (temp_in == null) {
            temp_in = 0.0
        }
        // Variables to be used in the formula are declared.
        var temp_k = temp_in
        var temp_f = 0.0
        //Temperature scale conversion formula.
        temp_f = (temp_k * 9/5)- 459.67
        // Loc function that allows to show in the Android Studio console // the content of the temp_f variable. Just a check.
        Log.d("Temp out", "The temp conversion is: $temp_f ºF")
        // The text property of the button is loaded with what you
        // want to show. As we want to show the content of the variable // temp_f, we use the structure $variable_name to show
        // its content.
        text_view_temp_out.text = "$temp_f ºF"

        // Force hide the virtual keyboard after temperature conversion.
        hideKeyboard(view = view)
    }


    fun convertFtoK(view:View) {
        // Connect the graphic components to two variables that allow
        // access to the components programmatically.
        val text_view_temp_in = findViewById<TextView>(R.id.temp_in_id)
        val text_view_temp_out = findViewById<TextView>(R.id.temp_out_id)
        // Extracts and converts the text information provided by the user // in the text field to a numeric value.
        var temp_in = text_view_temp_in.text.toString().toDoubleOrNull() // Check that the conversion was successful and that the variable // temp_in contains a numeric value.
        if (temp_in == null) {
            temp_in = 0.0
        }
        // Variables to be used in the formula are declared.
        var temp_f = temp_in
        var temp_k = 0.0
        //Temperature scale conversion formula.
        temp_k = (temp_f + 459.67) * 5/9
        // Loc function that allows to show in the Android Studio console // the content of the temp_f variable. Just a check.
        Log.d("Temp out", "The temp conversion is: $temp_k ºK")
        // The text property of the button is loaded with what you
        // want to show. As we want to show the content of the variable // temp_f, we use the structure $variable_name to show
        // its content.
        text_view_temp_out.text = "$temp_k ºK"

        // Force hide the virtual keyboard after temperature conversion.
        hideKeyboard(view = view)
    }

    /*
     * Function that hides the virtual keyboard.
     */
    fun Context.hideKeyboard(view:View) {
        val inputMethodManager = getSystemService(
            Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken,0 )
    }

}




