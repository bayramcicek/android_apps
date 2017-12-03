package com.cicek.app002;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    Main    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    Button buton;
    @Override

    protected void onCreate(Bundle savedInstanceState) {//------------------------------------------------
        super.onCreate(savedInstanceState);
/* setContentView*/   setContentView(R.layout.activity_main); //MainActivity sınıfımızın hangi View'i kullanacağını set ediyoruz
        //setContentView metotu ile hangi XML dosyamızı kullanacağımızı bildiriyoruz.


        //activity_main.xml içine koyduğumuz butonu Java dosyamızda kullanabilmek için buton referansına atıyoruz
        //buton ismindeki referansımız artık view içindeki butonu temsil etmektedir, butona action ekleyebilir tasarımın java dosyamız içinden
        // düzenleyebiliriz
        buton = (Button) findViewById(R.id.button);/* activity_main.xml içindeki butonumuzu buton adındaki referansa atıyoruz.*/
/*findViewById*/
/*findViewById ise setContentView ile set ettiğimiz view’lerin içindeki Android componentlarını (button, edittext,textview ..)
 referanslara atıyoruz. Artık java kodu içinden bu referanslarla bu componentları yönetebiliriz.*/



        buton.setOnClickListener(new View.OnClickListener() { //butona tıklandığı an yapılacaklar-/-/-/-/-/-/-//-/-/-/-//
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Merhaba Android")
                        .setMessage("I want to become an EXPERT :))")
                        .setPositiveButton("OK bro.", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Tamam butonuna basılınca yapılacak olanlar
                            }
                        })
                        .setNegativeButton("İptal", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // İptal butonuna basınca yapılacak olanlar
                            }
                        })
                        .show();
            }
        });//butona tıklandığı an yapılacaklar-/-/-/-/-/-/-//-/-/-/-//-/-/-/--//-/-/-/--/-/-/-/-/-/-//-/-/-/-//-/-/-/--//

    }//------------------------------------------------------------------------------------------------------


//    Main    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
