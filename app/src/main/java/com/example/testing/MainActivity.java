package com.example.testing;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        EditText editText = findViewById(R.id.editTextNumber);
//        Button button=findViewById(R.id.button2);
//        TextView textViewResult=findViewById(R.id.textViewResult);
//        ListView listView=findViewById(R.id.listViewResult);
//        List<String> data=new ArrayList<>();
//        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
//        listView.setAdapter(stringArrayAdapter);
//button.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        double amount=Double.parseDouble(editText.getText().toString());
//        double result=amount*65;
//        textViewResult.setText(String.valueOf(result));
//        data.add(amount+"=>"+result);
//        stringArrayAdapter.notifyDataSetChanged();
//        editText.setText("");
//
//    }
//});
EditText editText1 = findViewById(R.id.edit1);
EditText editText2=findViewById(R.id.edit2);
TextView Resultat = findViewById(R.id.result);
Button add=findViewById(R.id.addition);
add.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Double nb1 = Double.parseDouble(editText1.getText().toString());
        Double nb2 = Double.parseDouble(editText2.getText().toString());
        try {
             nb1 = Double.parseDouble(editText1.getText().toString());
        }catch (NumberFormatException e){
          if (nb1 == null) {
              Resultat.setText("vide");
          }
            }

        try {
            nb2 = Double.parseDouble(editText2.getText().toString());
        }catch (NumberFormatException e){
            if (nb2 == null) {
                Resultat.setText("vide");
            }
        }
             double res= nb1+nb2;
        Resultat.setText(String.valueOf(res));
    }
});

Button sous = findViewById(R.id.sous);
sous.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Double nb1 = Double.parseDouble(editText1.getText().toString());
        Double nb2 = Double.parseDouble(editText2.getText().toString());

        try {
            nb1 = Double.parseDouble(editText1.getText().toString());
        }catch (NumberFormatException e){
            if (nb1 == null) {
                Resultat.setText("vide");
            }
        }


        try {
          nb2 = Double.parseDouble(editText2.getText().toString());
    }catch (NumberFormatException e){
        if (nb2 == null) {
            Resultat.setText("vide");
        }
    }

            double res= nb1-nb2;
        Resultat.setText(String.valueOf(res));
    }
});
Button mult=findViewById(R.id.mult);
mult.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Double nb1 = Double.parseDouble(editText1.getText().toString());
        Double nb2 = Double.parseDouble(editText2.getText().toString());
        try {
            nb1 = Double.parseDouble(editText1.getText().toString());
        }catch (NumberFormatException e){
            if (nb1 == null) {
                Resultat.setText("vide");
            }
        }


        try {
        nb2 = Double.parseDouble(editText2.getText().toString());
    }catch (NumberFormatException e){
        if (nb2 == null) {
            Resultat.setText("vide");
        }
    }
        double res= nb1*nb2;
        Resultat.setText(String.valueOf(res));
    }
});
Button div = findViewById(R.id.division);
div.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Double nb1 = Double.parseDouble(editText1.getText().toString());
        Double nb2 = Double.parseDouble(editText2.getText().toString());

        try {
            nb1 = Double.parseDouble(editText1.getText().toString());
        }catch (NumberFormatException e){
            if (nb1 == null) {
                Resultat.setText("vide");
            }
        }


        try {
            nb2 = Double.parseDouble(editText2.getText().toString());
        }catch (NumberFormatException e){
            if (nb2 == null) {
                Resultat.setText("vide");
            }
        }



        double res= nb1/nb2;

        Resultat.setText(String.valueOf(res));
    }
});





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}