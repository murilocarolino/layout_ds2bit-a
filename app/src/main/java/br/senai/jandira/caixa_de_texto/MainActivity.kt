package br.senai.jandira.caixa_de_texto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.sharp.Add
import androidx.compose.material.icons.sharp.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.jandira.caixa_de_texto.ui.theme.Caixa_de_textoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Caixa_de_textoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize()
                .padding(8.dp),
            colors = CardDefaults
                .cardColors(containerColor = Color(0xFF3F51B5))
        ) {
            Column (
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ){
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                            Text(text = "Nome do usuário:")
                    },
                    leadingIcon = {
                                   Icon(
                                       imageVector = Icons.Filled.Person,
                                       contentDescription = "Icone de pessoa"
                                   )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            unfocusedTextColor = Color.White,
                            focusedTextColor = Color.Yellow,
                            unfocusedBorderColor = Color.Magenta,
                            focusedBorderColor = Color(0xFFFF5722)
                        )
                )
                Spacer(modifier = Modifier.height(16.dp))
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.Build,
                            contentDescription = "Icone de uma ferramenta"
                        )
                    },
                    placeholder = {
                        Text(text = "Digite alguma coisa")
                    }
                )
                Button(onClick = { /*TODO*/ }) {
                    
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Caixa_de_textoTheme {
        Greeting()
    }
}