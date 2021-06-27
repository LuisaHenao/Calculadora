package com.lh.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonCero;
    Button buttonIgual;
    Button buttonUno;
    Button buttonDos;
    Button buttonTres;
    Button buttonMas;
    Button buttonCuatro;
    Button buttonCinco;
    Button buttonSeis;
    Button buttonMenos;
    Button buttonSiete;
    Button buttonOcho;
    Button buttonNueve;
    Button buttonPor;
    Button buttonBorrar;
    Button buttonDiv;
    TextView txtCal;
    int Numero1 = 0;
    int Numero2 = 0;
    double resultado = 0;
    String dato;
    int operacion = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCero = findViewById(R.id.buttonCero);
        buttonIgual = findViewById(R.id.buttonIgual);
        buttonUno = findViewById(R.id.buttonUno);
        buttonDos = findViewById(R.id.buttonDos);
        buttonTres = findViewById(R.id.buttonTres);
        buttonMas = findViewById(R.id.buttonMas);
        buttonCuatro = findViewById(R.id.buttonCuatro);
        buttonCinco = findViewById(R.id.buttonCinco);
        buttonSiete = findViewById(R.id.buttonSiete);
        buttonSeis = findViewById(R.id.buttonSeis);
        buttonOcho = findViewById(R.id.buttonOcho);
        buttonNueve = findViewById(R.id.buttonNueve);
        buttonPor = findViewById(R.id.buttonPor);
        buttonBorrar = findViewById(R.id.buttonBorrar);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonMenos = findViewById(R.id.buttonMenos);
        txtCal = findViewById(R.id.txtCal);

        buttonCero.setOnClickListener(this);
        buttonIgual.setOnClickListener(this);
        buttonUno.setOnClickListener(this);
        buttonDos.setOnClickListener(this);
        buttonTres.setOnClickListener(this);
        buttonMas.setOnClickListener(this);
        buttonCuatro.setOnClickListener(this);
        buttonCinco.setOnClickListener(this);
        buttonSeis.setOnClickListener(this);
        buttonSiete.setOnClickListener(this);
        buttonOcho.setOnClickListener(this);
        buttonNueve.setOnClickListener(this);
        buttonPor.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonBorrar.setOnClickListener(this);
        buttonMenos.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {



        if (v.getId() == R.id.buttonCero){
            if(txtCal.getText().toString() == "0"){
                txtCal.setText(txtCal.getText().toString());
                if(operacion >0){
                    Numero2 = 0;
                }else {
                    Numero1 = 0;
                }

            }else {

                if(operacion >0){
                    Numero2 = Integer.parseInt(txtCal.getText().toString() + "0");
                }else{
                    Numero1 = Integer.parseInt(txtCal.getText().toString() + "0");
                }
                txtCal.setText(txtCal.getText().toString() + "0");
            }
        }

        if (v.getId() == R.id.buttonUno){
            if(txtCal.getText().toString() == "0"){
                txtCal.setText("1");
                if(operacion >0){
                    Numero2 = 1;
                }else {
                    Numero1 = 1;
                }
            }else {

                if(operacion >0){
                    Numero2 = Integer.parseInt(txtCal.getText().toString() + "1");
                }else{
                    Numero1 = Integer.parseInt(txtCal.getText().toString() + "1");
                }
                txtCal.setText(txtCal.getText().toString() + "1");
            }
        }
        if (v.getId() == R.id.buttonDos){
            if(txtCal.getText().toString() == "0"){
                txtCal.setText("2");
                if(operacion >0){
                    Numero2 = 2;
                }else {
                    Numero1 = 2;
                }
            }else {

                if(operacion >0){
                    Numero2 = Integer.parseInt(txtCal.getText().toString() + "2");
                }else{
                    Numero1 = Integer.parseInt(txtCal.getText().toString() + "2");
                }
                txtCal.setText(txtCal.getText().toString() + "2");
            }
        }
        if (v.getId() == R.id.buttonTres){
            if(txtCal.getText().toString() == "0"){
                txtCal.setText("3");
                if(operacion >0){
                    Numero2 = 3;
                }else {
                    Numero1 = 3;
                }
            }else {

                if(operacion >0){
                    Numero2 = Integer.parseInt(txtCal.getText().toString() + "3");
                }else{
                    Numero1 = Integer.parseInt(txtCal.getText().toString() + "3");
                }
                txtCal.setText(txtCal.getText().toString() + "3");
            }
        }
        if (v.getId() == R.id.buttonCuatro){
            if(txtCal.getText().toString() == "0"){
                txtCal.setText("4");
                if(operacion >0){
                    Numero2 = 4;
                }else {
                    Numero1 = 4;
                }
            }else {

                if(operacion >0){
                    Numero2 = Integer.parseInt(txtCal.getText().toString() + "4");
                }else{
                    Numero1 = Integer.parseInt(txtCal.getText().toString() + "4");
                }
                txtCal.setText(txtCal.getText().toString() + "4");
            }
        }
        if (v.getId() == R.id.buttonCinco){
            if(txtCal.getText().toString() == "0"){
                txtCal.setText("5");
                if(operacion >0){
                    Numero2 = 3;
                }else {
                    Numero1 = 3;
                }
            }else {

                if(operacion >0){
                    Numero2 = Integer.parseInt(txtCal.getText().toString() + "5");
                }else{
                    Numero1 = Integer.parseInt(txtCal.getText().toString() + "5");
                }
                txtCal.setText(txtCal.getText().toString() + "5");
            }
        }
        if (v.getId() == R.id.buttonSeis){
            if(txtCal.getText().toString() == "0"){
                txtCal.setText("6");
                if(operacion >0){
                    Numero2 = 6;
                }else {
                    Numero1 = 6;
                }
            }else {

                if(operacion >0){
                    Numero2 = Integer.parseInt(txtCal.getText().toString() + "6");
                }else{
                    Numero1 = Integer.parseInt(txtCal.getText().toString() + "6");
                }
                txtCal.setText(txtCal.getText().toString() + "6");
            }
        }
        if (v.getId() == R.id.buttonSiete){
            if(txtCal.getText().toString() == "0"){
                txtCal.setText("7");
                if(operacion >0){
                    Numero2 = 7;
                }else {
                    Numero1 = 7;
                }
            }else {

                if(operacion >0){
                    Numero2 = Integer.parseInt(txtCal.getText().toString() + "7");
                }else{
                    Numero1 = Integer.parseInt(txtCal.getText().toString() + "7");
                }
                txtCal.setText(txtCal.getText().toString() + "7");
            }
        }
        if (v.getId() == R.id.buttonOcho){
            if(txtCal.getText().toString() == "0"){
                txtCal.setText("8");
                if(operacion >0){
                    Numero2 = 8;
                }else {
                    Numero1 = 8;
                }
            }else {

                if(operacion >0){
                    Numero2 = Integer.parseInt(txtCal.getText().toString() + "8");
                }else{
                    Numero1 = Integer.parseInt(txtCal.getText().toString() + "8");
                }
                txtCal.setText(txtCal.getText().toString() + "8");
            }
        }
        if (v.getId() == R.id.buttonNueve){
            if(txtCal.getText().toString() == "0"){
                txtCal.setText("9");
                if(operacion >0){
                    Numero2 = 9;
                }else {
                    Numero1 = 9;
                }
            }else {
                if(operacion >0){
                    Numero2 = Integer.parseInt(txtCal.getText().toString() + "9");
                }else{
                    Numero1 = Integer.parseInt(txtCal.getText().toString() + "9");
                }

                txtCal.setText(txtCal.getText().toString() + "9");
            }
        }
        if (v.getId() == R.id.buttonIgual){
            if(operacion == 1){
                resultado = Numero1 + Numero2;
            }
            if(operacion == 2) {
                resultado = Numero1 - Numero2;
            }
            if(operacion == 3) {
                if(Numero2 == 0){
                    resultado = 0;
                }else {
                    resultado = Numero1 / Numero2;
                }

            }
            if(operacion == 4) {
                resultado = Numero1 * Numero2;
            }
            if(operacion == 3 && Numero2 == 0){
                txtCal.setText("No se puede dividir entre 0");
            } else {
                txtCal.setText(""+ resultado);
            }

        }

        if (v.getId() == R.id.buttonBorrar){
            txtCal.setText("0");
            operacion = 0;
            Numero1 =0;
            Numero2 =0;
        }
        if (v.getId() == R.id.buttonPor){
            operacion = 4;
            txtCal.setText("0");
        }
        if (v.getId() == R.id.buttonDiv){
            operacion = 3;
            txtCal.setText("0");

        }
        if (v.getId() == R.id.buttonMenos){
            operacion = 2;
            txtCal.setText("0");

        }
        if (v.getId() == R.id.buttonMas){
            operacion = 1;
            txtCal.setText("0");


        }
    }
}