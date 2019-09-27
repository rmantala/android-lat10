package id.ac.poliban.mi.latihan10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etSong, etAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSong = findViewById(R.id.etSong);
        etAlbum = findViewById(R.id.etAlbum);

        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);

        btClear.setOnClickListener(v-> {
            etSong.setText("");
            etAlbum.setText("");
            etSong.requestFocus();
        });

        btSubmit.setOnClickListener(view -> {
            Intent intent = new Intent(this, PresentationActivity.class);
            if(!etSong.getText().toString().isEmpty() && !etAlbum.getText().toString().isEmpty()){
                intent.putExtra("song", etSong.getText().toString());
                intent.putExtra("album", etAlbum.getText().toString());
                startActivity(intent);
            }
            else
                Toast.makeText(this, "fill all fields pls...", Toast.LENGTH_SHORT).show();
        });
    }

    public void onStart(){
        super.onStart();
        etSong.setText("");
        etAlbum.setText("");
    }
}
