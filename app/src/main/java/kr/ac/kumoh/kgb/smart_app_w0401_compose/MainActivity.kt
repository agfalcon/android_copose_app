package kr.ac.kumoh.kgb.smart_app_w0401_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.leanback.widget.Row
import kotlinx.coroutines.NonDisposableHandle.parent
import kr.ac.kumoh.kgb.smart_app_w0401_compose.ui.theme.Smart_app_w0401_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Smart_app_w0401_ComposeTheme {
                // A surface container using the 'background' color from the theme
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
//        Greeting("안녕하세요")
        MyLinearLayout()
    }
}

@Composable
fun MyLinearLayout() {
    Column {
        Row {
            Text(text = "안녕하세요", modifier = Modifier
                .background(Color.Yellow)
                .padding(8.dp))
            Text(text = "저는 김근범입니다" , modifier = Modifier
                .background(Color.Cyan)
                .padding(8.dp))
        }
        Text(text = "어디서 본 겉 같은 예제", modifier =  Modifier
            .background(Color.Magenta)
            .padding(8.dp))
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Smart_app_w0401_ComposeTheme {
        MyApp()
    }
}