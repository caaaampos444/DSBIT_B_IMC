package com.example.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.imc.ui.theme.IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMCTheme {
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
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            //verticalArrangement = Arrangement.SpaceEvenly,
            modifier= Modifier
                .background(color = Color(0xFFC24C4C))
                .fillMaxWidth()
                .height(230.dp)
                .padding(vertical = 20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.calculadora),
                contentDescription = "Calculadora",
                modifier = Modifier.height(100.dp)
            )
            Text(
                text = "Calculadora IMC",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                modifier = Modifier.padding(vertical = 20.dp)
            )
        }
        Card(
            elevation = CardDefaults.cardElevation(10.dp),
            modifier = Modifier
                .height(400.dp)
                .width(300.dp)
                .offset(x = 0.dp, y = -40.dp)
        ) {
            Column(
                //horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(
                    text = "Seus Dados",
                    fontWeight = FontWeight.Black,
                    fontSize = 30.sp,
                    color = Color(0xFFC24C4C),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .fillMaxWidth()

                )
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(20.dp)
                ){
                    Text(
                        text = "Seu peso:",
                        color = Color(0xFFC24C4C),
                        modifier = Modifier
                            .padding(
                                //start = 24.dp,
                                top = 20.dp
                            )
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                focusedContainerColor = Color.White,
                                unfocusedTextColor = Color.White,
                                focusedBorderColor = Color(0xFFC24C4C),
                                unfocusedBorderColor = Color(0xFFC24C4C)
                            ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp)
                            .height(44.dp)
                    )
                    Text(
                        text = "Seu peso:",
                        color = Color(0xFFC24C4C),
                        modifier = Modifier
                            .padding(
                                //start = 24.dp,
                                top = 20.dp
                            )
                            .fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        colors = OutlinedTextFieldDefaults
                            .colors(
                                focusedContainerColor = Color.White,
                                unfocusedTextColor = Color.White,
                                focusedBorderColor = Color(0xFFC24C4C),
                                unfocusedBorderColor = Color(0xFFC24C4C)
                            ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp)
                            .height(44.dp)
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = Color(0xFFC24C4C)
                            ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 40.dp)
                            .height(60.dp)
                    ) {
                        Text(
                            text = "CALCULAR",
                            fontSize = 16.sp
                        )
                    }
                }
            }
        }
        Card(
            colors = CardDefaults
                .cardColors(
                    containerColor = Color(0xFF4CAF50)
                ),
            modifier = Modifier
                .height(110.dp)
                .width(300.dp)
        ) {
            Row (
                //horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .width(200.dp)
                        .height(90.dp)
                ) {
                    Text(
                        text = "Resultado:",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Light
                    )
                    Text(
                        text = "Peso Ideal",
                        color = Color.White,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light
                    )
                }
                Text(
                    text = "21.3",
                    color = Color.White,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .height(90.dp)
                        //.align(Alignment.Bottom)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    IMCTheme {
        Greeting()
    }
}