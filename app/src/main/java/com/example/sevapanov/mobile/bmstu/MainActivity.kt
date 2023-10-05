package com.example.sevapanov.mobile.bmstu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.LinearLayout
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.example.sevapanov.mobile.bmstu.ui.theme.MobileBmstuTheme
import com.example.todolist.AddButton
import com.example.todolist.TodoList
import com.example.todolist.Todo
import java.util.Date

class MainActivity : ComponentActivity() {

    private val todoList = mutableStateListOf<Todo>()

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MobileBmstuTheme {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    TodoList(todoList)
                    AddButton(onClick = { /* TODO */})
                }
            }
        }
        todoList.add(Todo("Purchase of products", "Buy groceries for lunch", Date()))
        todoList.add(Todo("Recording a video tutorial", "Record a programming lesson", Date()))
        todoList.add(Todo("Cleaning", "Clean up the room", Date()))
    }
}


//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MobileBmstuTheme {
//        Greeting("Android")
//    }
//}