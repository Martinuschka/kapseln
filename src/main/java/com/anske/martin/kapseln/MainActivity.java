package com.anske.martin.kapseln;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button ButtonCalculate,ButtonReset;
    TextView Durchschnitt,Standardabweichung,Abweichung1,Abweichung2,Abweichung3,Abweichung4,Abweichung5,Abweichung6,Abweichung7,Abweichung8,Abweichung9,Abweichung10;
    EditText Edit1,Edit2,Edit3,Edit4,Edit5,Edit6,Edit7,Edit8,Edit9,Edit10;
    double m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,durchschnitt,standardabweichung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonCalculate=(Button)findViewById(R.id.buttonCalculate);
        ButtonReset=(Button)findViewById(R.id.buttonReset);
        Edit1=(EditText)findViewById(R.id.editText1);
        Edit2=(EditText)findViewById(R.id.editText2);
        Edit3=(EditText)findViewById(R.id.editText3);
        Edit4=(EditText)findViewById(R.id.editText4);
        Edit5=(EditText)findViewById(R.id.editText5);
        Edit6=(EditText)findViewById(R.id.editText6);
        Edit7=(EditText)findViewById(R.id.editText7);
        Edit8=(EditText)findViewById(R.id.editText8);
        Edit9=(EditText)findViewById(R.id.editText9);
        Edit10=(EditText)findViewById(R.id.editText10);
        Durchschnitt=(TextView)findViewById(R.id.textViewResult);
        Standardabweichung=(TextView)findViewById(R.id.textViewStandardabweichung);
        Abweichung1=(TextView)findViewById(R.id.textViewAbweichung1);
        Abweichung2=(TextView)findViewById(R.id.textViewAbweichung2);
        Abweichung3=(TextView)findViewById(R.id.textViewAbweichung3);
        Abweichung4=(TextView)findViewById(R.id.textViewAbweichung4);
        Abweichung5=(TextView)findViewById(R.id.textViewAbweichung5);
        Abweichung6=(TextView)findViewById(R.id.textViewAbweichung6);
        Abweichung7=(TextView)findViewById(R.id.textViewAbweichung7);
        Abweichung8=(TextView)findViewById(R.id.textViewAbweichung8);
        Abweichung9=(TextView)findViewById(R.id.textViewAbweichung9);
        Abweichung10=(TextView)findViewById(R.id.textViewAbweichung10);

        ButtonCalculate.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        m1=Double.valueOf(Edit1.getText().toString());
                        m2=Double.valueOf(Edit2.getText().toString());
                        m3=Double.valueOf(Edit3.getText().toString());
                        m4=Double.valueOf(Edit4.getText().toString());
                        m5=Double.valueOf(Edit5.getText().toString());
                        m6=Double.valueOf(Edit6.getText().toString());
                        m7=Double.valueOf(Edit7.getText().toString());
                        m8=Double.valueOf(Edit8.getText().toString());
                        m9=Double.valueOf(Edit9.getText().toString());
                        m10=Double.valueOf(Edit10.getText().toString());

                        durchschnitt=(m1+m2+m3+m4+m5+m6+m7+m8+m9+m10)/10;
                        standardabweichung=100*Math.sqrt((Math.pow((m1-durchschnitt),2)+Math.pow((m2-durchschnitt),2)+Math.pow((m3-durchschnitt),2)+Math.pow((m4-durchschnitt),2)+Math.pow((m5-durchschnitt),2)+Math.pow((m6-durchschnitt),2)+Math.pow((m7-durchschnitt),2)+Math.pow((m8-durchschnitt),2)+Math.pow((m9-durchschnitt),2)+Math.pow((m10-durchschnitt),2))/9)/durchschnitt;

                        Durchschnitt.setText(String.format(Locale.ENGLISH,"%.4f", durchschnitt));
                        Standardabweichung.setText(String.format(Locale.ENGLISH,"%.4f",standardabweichung)+"%");

                        Abweichung1.setText(String.format(Locale.ENGLISH,"%.2f",((m1-durchschnitt)/durchschnitt)*100)+"%");
                        Abweichung2.setText(String.format(Locale.ENGLISH,"%.2f",((m2-durchschnitt)/durchschnitt)*100)+"%");
                        Abweichung3.setText(String.format(Locale.ENGLISH,"%.2f",((m3-durchschnitt)/durchschnitt)*100)+"%");
                        Abweichung4.setText(String.format(Locale.ENGLISH,"%.2f",((m4-durchschnitt)/durchschnitt)*100)+"%");
                        Abweichung5.setText(String.format(Locale.ENGLISH,"%.2f",((m5-durchschnitt)/durchschnitt)*100)+"%");
                        Abweichung6.setText(String.format(Locale.ENGLISH,"%.2f",((m6-durchschnitt)/durchschnitt)*100)+"%");
                        Abweichung7.setText(String.format(Locale.ENGLISH,"%.2f",((m7-durchschnitt)/durchschnitt)*100)+"%");
                        Abweichung8.setText(String.format(Locale.ENGLISH,"%.2f",((m8-durchschnitt)/durchschnitt)*100)+"%");
                        Abweichung9.setText(String.format(Locale.ENGLISH,"%.2f",((m9-durchschnitt)/durchschnitt)*100)+"%");
                        Abweichung10.setText(String.format(Locale.ENGLISH,"%.2f",((m10-durchschnitt)/durchschnitt)*100)+"%");
                    }
                });

        ButtonReset.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Edit1.setText("0.3");
                        Edit2.setText("0.3");
                        Edit3.setText("0.3");
                        Edit4.setText("0.3");
                        Edit5.setText("0.3");
                        Edit6.setText("0.3");
                        Edit7.setText("0.3");
                        Edit8.setText("0.3");
                        Edit9.setText("0.3");
                        Edit10.setText("0.3");

                        Abweichung1.setText("0.00%");
                        Abweichung2.setText("0.00%");
                        Abweichung3.setText("0.00%");
                        Abweichung4.setText("0.00%");
                        Abweichung5.setText("0.00%");
                        Abweichung6.setText("0.00%");
                        Abweichung7.setText("0.00%");
                        Abweichung8.setText("0.00%");
                        Abweichung9.setText("0.00%");
                        Abweichung10.setText("0.00%");

                        Durchschnitt.setText("0.0000");
                        Standardabweichung.setText("0.0000%");
                    }
                });

    }
}
