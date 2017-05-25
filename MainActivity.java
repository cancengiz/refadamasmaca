package asd.can.com.refadamasmaca;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends Activity implements View.OnClickListener {

    //  String[] kelime = {"L", "E", "O", "P", "A", "R"};

    Random r;
    String[] s;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    static int sayac = 0, anlikskor =0, toplamskor=0, hak = 0, harfsayaci=0;

    public static boolean bol;

    TextView textanlikskor;
    TextView texttoplamskor;

    MediaPlayer bosharf;
    MediaPlayer dogruharf;
    MediaPlayer oyunsonu;
    MediaPlayer yenioyun;


    ImageView imageview;

    ArrayList<Integer> ımageArrayList;

    ArrayList<TextView> textViewArrayList;
    ArrayList<Button> buttonArrayList;

    Button btnsonrakikelime;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // text ler icin referans olusturuldu.
        text1 = (TextView) findViewById(R.id.harf1);
        text2 = (TextView) findViewById(R.id.harf2);  //referansların tanımlanması
        text3 = (TextView) findViewById(R.id.harf3);
        text4 = (TextView) findViewById(R.id.harf4);
        text5 = (TextView) findViewById(R.id.harf5);
        text6 = (TextView) findViewById(R.id.harf6);

        textanlikskor = (TextView) findViewById(R.id.textanlikskor);
        texttoplamskor = (TextView) findViewById(R.id.texttoplamskor);

        imageview = (ImageView) findViewById(R.id.imageadam);

        bosharf = MediaPlayer.create(getApplicationContext(), R.raw.bosharf);
        dogruharf = MediaPlayer.create(getApplicationContext(), R.raw.dogruharf);
        yenioyun = MediaPlayer.create(getApplicationContext(), R.raw.yenioyun);
        oyunsonu = MediaPlayer.create(getApplicationContext(), R.raw.oyunsonu);




        final Button a = (Button) findViewById(R.id.button1);
        final Button b = (Button) findViewById(R.id.button2);
        final Button c = (Button) findViewById(R.id.button3);
        final Button ç = (Button) findViewById(R.id.button4);
        final Button d = (Button) findViewById(R.id.button5);
        final Button e = (Button) findViewById(R.id.button6);
        final Button f = (Button) findViewById(R.id.button7);
        final Button g = (Button) findViewById(R.id.button8);
        final Button ğ = (Button) findViewById(R.id.button9);
        final Button h = (Button) findViewById(R.id.button10);
        final Button ı = (Button) findViewById(R.id.button11);
        final Button i = (Button) findViewById(R.id.button12);
        final Button j = (Button) findViewById(R.id.button13);
        final Button k = (Button) findViewById(R.id.button14);
        final Button l = (Button) findViewById(R.id.button15);
        final Button m = (Button) findViewById(R.id.button16);
        final Button n = (Button) findViewById(R.id.button17);
        final Button o = (Button) findViewById(R.id.button18);
        final Button ö = (Button) findViewById(R.id.button19);
        final Button p = (Button) findViewById(R.id.button20);
        final Button r = (Button) findViewById(R.id.button21);
        final Button s = (Button) findViewById(R.id.button22);
        final Button ş = (Button) findViewById(R.id.button23);
        final Button t = (Button) findViewById(R.id.button24);
        final Button u = (Button) findViewById(R.id.button25);
        final Button ü = (Button) findViewById(R.id.button26);
        final Button v = (Button) findViewById(R.id.button27);
        final Button y = (Button) findViewById(R.id.button28);
        final Button z = (Button) findViewById(R.id.button29);

        btnsonrakikelime = (Button) findViewById(R.id.buttonsonrakikelime);

        btnsonrakikelime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toplamskor = toplamskor + (70-(10*(sayac+1))) ;
                anlikskor = 0;
                skorTabelasiniYazdir();


                ekranıYenile();

                btnsonrakikelime.setEnabled(false);





            }

            private void ekranıYenile() {
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                ç.setEnabled(true);
                d.setEnabled(true);
                e.setEnabled(true);
                f.setEnabled(true);
                g.setEnabled(true);
                ğ.setEnabled(true);
                h.setEnabled(true);
                ı.setEnabled(true);
                i.setEnabled(true);
                j.setEnabled(true);
                k.setEnabled(true);
                l.setEnabled(true);
                m.setEnabled(true);
                n.setEnabled(true);
                o.setEnabled(true);
                ö.setEnabled(true);
                p.setEnabled(true);
                r.setEnabled(true);
                s.setEnabled(true);
                ş.setEnabled(true);
                t.setEnabled(true);
                u.setEnabled(true);
                ü.setEnabled(true);
                v.setEnabled(true);
                y.setEnabled(true);
                z.setEnabled(true);

                kelimesec();

                text1.setVisibility(View.INVISIBLE);
                text2.setVisibility(View.INVISIBLE);
                text3.setVisibility(View.INVISIBLE);
                text4.setVisibility(View.INVISIBLE);
                text5.setVisibility(View.INVISIBLE);
                text6.setVisibility(View.INVISIBLE);

                sayac =0; harfsayaci=0;

                imageview.setBackgroundColor(Color.WHITE);
            }
        });

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        ç.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        ğ.setOnClickListener(this);
        h.setOnClickListener(this);
        ı.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        ö.setOnClickListener(this);
        p.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        ş.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        ü.setOnClickListener(this);
        v.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);

        ımageArrayList = new ArrayList<>();
        ımageArrayList.add(R.drawable.hangman_0);
        ımageArrayList.add(R.drawable.hangman_1);
        ımageArrayList.add(R.drawable.hangman_2);
        ımageArrayList.add(R.drawable.hangman_3);
        ımageArrayList.add(R.drawable.hangman_4);
        ımageArrayList.add(R.drawable.hangman_5);
        ımageArrayList.add(R.drawable.hangman_6);

        textViewArrayList = new ArrayList<>();

        textViewArrayList.add(text1);
        textViewArrayList.add(text2);    // aray liste textlerin atanması
        textViewArrayList.add(text3);
        textViewArrayList.add(text4);
        textViewArrayList.add(text5);
        textViewArrayList.add(text6);
        kelimesec();







    }



    public void kelimesec() {

        String[] kelime1 = {"L", "E", "O", "P", "A", "R"};
        String[] kelime2 = {"M", "A", "Y", "M", "U", "N"};
        String[] kelime3 = {"K", "A", "P", "L", "A", "N"};
        String[] kelime4 = {"Z", "Ü", "R", "A", "F", "A"};  //kelimelerin arraya atanması
        String[] kelime5 = {"Y", "E", "N", "G", "E", "Ç"};
        String[] kelime6 = {"T", "İ", "M", "S", "A", "H"};
        String[] kelime7 = {"T", "I", "R", "T", "I", "L"};
        String[] kelime8 = {"S", "İ", "N", "C", "A", "P"};
        String[] kelime9 = {"J", "A", "G", "U", "A", "R"};
        String[] kelime10 = {"T", "A", "V", "Ş", "A", "N"};

        ArrayList<String[]> arrayList = new ArrayList<>();
        arrayList.add(kelime1);
        arrayList.add(kelime2);
        arrayList.add(kelime3);    // aray liste kelimlerin atanması
        arrayList.add(kelime4);
        arrayList.add(kelime5);
        arrayList.add(kelime6);
        arrayList.add(kelime7);
        arrayList.add(kelime8);
        arrayList.add(kelime9);
        arrayList.add(kelime10);

        r = new Random();      //randomun oluşturulması
        int a = r.nextInt(arrayList.size());

        kelimeata(arrayList.get(a));


    }

    public void kelimeata(String[] s) {

        this.s = s;

        ArrayList<TextView> textViewArrayList = new ArrayList<>();
        textViewArrayList.add(text1);
        textViewArrayList.add(text2);
        textViewArrayList.add(text3);     //aray liste textlerin atanması
        textViewArrayList.add(text4);
        textViewArrayList.add(text5);
        textViewArrayList.add(text6);

        for (int i = 0; i < textViewArrayList.size(); i++) {
            textViewArrayList.get(i).setText(s[i].toString());
            textViewArrayList.get(i).setTextColor(Color.parseColor("#f00b0b"));

        }


    }

    @Override
    protected void onResume() {

        sayac = 0; anlikskor =0; toplamskor=0; hak=0; harfsayaci=0;
        onRestart();
    }



    @Override
    public void onClick(View view) {
        int i;
        TextView temptext = (TextView) view;
        boolean b = true;
        view.setEnabled(false);

        for (i = 0; i < textViewArrayList.size(); i++) {
            if (textViewArrayList.get(i).getText().toString().equalsIgnoreCase(temptext.getText().toString())) {
                b = false;

                textViewArrayList.get(i).setVisibility(View.VISIBLE);
                anlikskor +=10;
                toplamskor +=10;
                harfsayaci++;
                skorTabelasiniYazdir();
                playSounds(dogruharf);
                if(harfsayaci>5){


                    playSounds(yenioyun);
                    bosharf.stop();
                    btnsonrakikelime.setEnabled(true);
                }

            }
        }
        if (b) {
            if(ımageArrayList.size()>sayac){
                imageview.setBackgroundResource(ımageArrayList.get(sayac));
                sayac++;
                playSounds(bosharf);

                if(ımageArrayList.size()<=sayac){

                    playSounds(oyunsonu);
                    bosharf.stop();
                    oyunBitti();
                }
            }

        }

    }

    private void skorTabelasiniYazdir() {


        textanlikskor.setText(String.valueOf(anlikskor));
        texttoplamskor.setText(String.valueOf(toplamskor));


    }

    private void oyunBitti() {
        finish();


        Intent intent = new Intent(getApplicationContext(), Skor.class);
        intent.putExtra("skor", toplamskor);
        startActivity(intent);

    }

    private void playSounds (MediaPlayer playingsound){


        playingsound.start();




    }


}
