package edu.tecii.android.pitagoras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText CATA,CATB;
    private TextView Hipo,Peri,Area;
    private Button Acc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CATA=(EditText)findViewById(R.id.txtCA);
        CATB=(EditText)findViewById(R.id.txtCB);
        Hipo=(TextView)findViewById(R.id.TvHip);
        Peri=(TextView)findViewById(R.id.TvPeri);
        Area=(TextView)findViewById(R.id.TvArea);
        Acc=(Button)findViewById(R.id.button);

        Acc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            double Hi,Pe,Ar;
            String cata=CATA.getText().toString();
            String catb=CATB.getText().toString();
            Double A=Double.parseDouble(cata);
            Double B=Double.parseDouble(catb);

            Hi=Math.sqrt((Math.pow(A,2))+(Math.pow(B,2)));// H=raiz de a2+b2
            Pe=A+B+Hi;//perimetro= a+b+c
            Ar=((A*B)/2);// Area=a*b/2

                String RH,RP,RA="";
                RH="El valor de la hipotenusa es "+ Hi;
                RP="El perimetro es "+ Pe;
                RA="El area es "+ Ar;


                Hipo.setText(RH);
                Peri.setText(RP);
                Area.setText(RA);


            }
        });
    }
}
