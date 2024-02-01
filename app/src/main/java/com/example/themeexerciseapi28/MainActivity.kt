package com.example.themeexerciseapi28

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusTargetModifierNode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.themeexerciseapi28.ui.theme.OuasOrange
import com.example.themeexerciseapi28.ui.theme.ThemeExerciseAPI28Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemeExerciseAPI28Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    Column (
        verticalArrangement =  Arrangement.spacedBy(16.dp)
    ){
        Text(
            text = "My title",
            style = MaterialTheme.typography.headlineLarge,
            modifier = appModifier
        )
        OutlinedTextField(
            value = "",
            onValueChange = {/*TODO*/} ,
            modifier = appModifier,
     /*        color = OutlinedTextFieldDefaults.colors(
               focusedBorderColor = OuasOrange,
               unfocusedBorderColor = OuasOrange,
           )*/
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = appModifier
                .clip(MaterialTheme.shapes.medium),
            colors = ButtonDefaults.buttonColors(containerColor = OuasOrange)
            //colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)
        ) {
            Text(text = "Submit")
        }
    }
}


/*
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemeExerciseAPI28Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ThemeExercise()
                }
            }
        }
    }
}*/

/*
@Composable
fun ThemeExercise(){
    val appModifier = Modifier.fillMaxWidth().padding(8.dp)
    val buttonModifier = Modifier.padding(16.dp).fillMaxWidth(0.5f)
    // Use a fraction of max width for the button
    Column(
        verticalArrangement = Arrangement.spacedBy(14.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "My tittle",
            style = MaterialTheme.typography.headlineMedium,
            modifier = appModifier
        )

    }
    OutlinedTextField(
        value = "",
        //value = "",
        onValueChange ={/*TODO*/},
        modifier = appModifier
    )
    Button(
        onClick = { /*TODO*/ },
        modifier = buttonModifier
    )
    {
        Text(text = "Submit")

    }

}*/




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ThemeExerciseAPI28Theme {
        MyApp()
    }
}