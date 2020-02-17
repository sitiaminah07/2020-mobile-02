package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HalamanRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_register);
    }

    public void postLogin(View view) {
        Intent intent = new Intent(this, HalamanLogin.class);
        startActivity(intent);
    }

    public void postNext(View view) {
        Intent intent = new Intent(this, ProfilActivity.class);
        startActivity(intent);
    }
}
