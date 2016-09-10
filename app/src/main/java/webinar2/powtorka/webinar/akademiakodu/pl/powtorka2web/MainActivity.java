package webinar2.powtorka.webinar.akademiakodu.pl.powtorka2web;

import android.app.Activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity {


    @BindView(R.id.textView2)
   public TextView text;

    @BindView(R.id.button)
    public Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //text = (TextView)findViewById(R.id.textView2);


    }
}
