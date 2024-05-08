package com.example.myapplication2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication2.ui.theme.MyApplication2Theme
import com.example.mylibrary_demo_lib.MessageClas
import com.plcoding.image_preview.ImagePreview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
         Toast.makeText(this, "Hello Mahendra", Toast.LENGTH_SHORT).show()
        MessageClas.showMSDMessage(this, "Hello Mahendra, Welcome to Chaster IT Solutions!! ")
        setContent {
            MyApplication2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        setContent{
            MyApplication2Theme {
                Box(modifier = Modifier.fillMaxSize()){

                    Column {
                        ImagePreview(image = painterResource(id = R.drawable.mosqu),
                            description = "Hello 1",
                            modifier = Modifier
                                .size(150.dp))
                        ImagePreview(image = painterResource(id = R.drawable.girl),
                            description = "Hello 2",
                            modifier = Modifier
                                .size(150.dp))
                        ImagePreview(image = painterResource(id = R.drawable.cccc),
                            description = "Hello 3",
                            modifier = Modifier
                                .size(150.dp))
                    }


                }
            }
        }

    }



}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplication2Theme {
        Greeting("Android")
    }
}