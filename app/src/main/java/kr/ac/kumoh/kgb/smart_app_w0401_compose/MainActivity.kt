package kr.ac.kumoh.kgb.smart_app_w0401_compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kr.ac.kumoh.kgb.smart_app_w0401_compose.ui.theme.Smart_app_w0401_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Smart_app_w0401_ComposeTheme {
                // A surface container using the 'background' color from the theme
                MyApp({Counter()})
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit ) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
//        Greeting("안녕하세요")
        Column {
            content()
            content()
            content()
        }

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
        Text(text = "어디서 본 겉 같은 예제", modifier = Modifier
            .background(Color.Magenta)
            .padding(8.dp))
    }
}

@Composable
fun Counter() {
//    var count by remember{
//        mutableStateOf(0)
//    }
    val (count, setCount) = remember{ mutableStateOf(0) }
    Column (modifier = Modifier
        .padding(8.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Text( text="$count", fontSize = 70.sp, modifier = Modifier.padding(12.dp))
        Row {
            Button(onClick = {
                setCount(count+1)
                Log.i("counter", count.toString())},
                modifier = Modifier.weight(1f)) {
                Text(text = "증가")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { setCount(count-1) }, modifier = Modifier.weight(1f)) {
                Text(text = "감소")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Smart_app_w0401_ComposeTheme {
        MyApp({Counter()})
    }
}