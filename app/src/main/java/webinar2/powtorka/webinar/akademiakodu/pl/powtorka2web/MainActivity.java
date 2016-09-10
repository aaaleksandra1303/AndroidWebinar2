package webinar2.powtorka.webinar.akademiakodu.pl.powtorka2web;

import android.app.Activity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {


    @BindView(R.id.textView2)
   public TextView text;

   //@BindView(R.id.button)
    //public Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //text = (TextView)findViewById(R.id.textView2);


    }

    @OnClick(R.id.button)
    public void buttonClick(View view)
    {
        Toast.makeText(this,"Heeeej Ola, przycisk dziala :D",Toast.LENGTH_LONG).show();

    }

    //TODO all things to do :)

    private class NewTask extends AsyncTask<Void,Void,Void>
    {

        @Override
        protected Void doInBackground(Void... params) {
            return null;
        }
    }
}
