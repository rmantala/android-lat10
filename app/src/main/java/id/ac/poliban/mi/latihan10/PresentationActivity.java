package id.ac.poliban.mi.latihan10;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PresentationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation);

        TextView tvSong = findViewById(R.id.tvSong);
        TextView tvAlbum = findViewById(R.id.tvAlbum);

        if(getIntent()!=null) {
            tvSong.setText(getIntent().getStringExtra("song"));
            tvAlbum.setText(getIntent().getStringExtra("album"));
        }

    }
}
