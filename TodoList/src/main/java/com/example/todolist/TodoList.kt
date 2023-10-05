package com.example.todolist

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todolist.ui.theme.MobileBmstuTheme
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class Todo(val task: String, val description: String, val createDate: Date)

@ExperimentalFoundationApi
@Composable
fun TodoList(todoList: List<Todo>) {
    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        items(todoList) { todo ->
            Card (
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .fillMaxWidth()
                    .background(Color.LightGray),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ){
                Column (
                    modifier = Modifier.padding(8.dp)
                ){
                    Text(text = todo.task, style = MaterialTheme.typography.titleLarge)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = todo.description, style = MaterialTheme.typography.bodyMedium)
                    Spacer(modifier = Modifier.height(8.dp))
                    val date = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(todo.createDate)
                    Text(text = "Created on: $date", style = MaterialTheme.typography.bodySmall)
                }
            }
        }
    }
}

@Composable
fun AddButton(onClick: () -> Unit) {
    FloatingActionButton(
        onClick = onClick,
        modifier = Modifier
            .padding(bottom = 16.dp)
            .size(56.dp)
            //.align(Alignment.BottomEnd)
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Add Button",
            modifier = Modifier.size(24.dp)
        )
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
    MobileBmstuTheme {
        Greeting("TodoList")
    }
}