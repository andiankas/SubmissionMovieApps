package com.example.submissionmovieapps;

import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MovieDetail extends AppCompatActivity {
    public static final String EXTRA_TITLE = "extra_title";
    public static final String EXTRA_REMARK = "extra_remark";
    public static final String EXTRA_IMG = "extra_img";
    public static final String EXTRA_CONTENT = "extra_content";
    public static final String EXTRA_DIRECT = "extra_direct";
    public static final String EXTRA_RILIS = "extra_rilis";
    public static final String EXTRA_DURASI = "extra_durasi";
    public static final String EXTRA_GENRE = "extra_genre";

    TextView titleMovie;
    TextView contentMovie;
    TextView remarkMovie;
    TextView directMovie;
    TextView rilisMovie;
    TextView durasiMovie;
    TextView genreMovie;
    ImageView imgMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        titleMovie = findViewById(R.id.movie_title);
        imgMovie = findViewById(R.id.movie_photo);
        remarkMovie = findViewById(R.id.movie_remark);
        contentMovie = findViewById(R.id.movie_content);
        directMovie = findViewById(R.id.movie_sutradara);
        rilisMovie = findViewById(R.id.rilis_movie);
        durasiMovie = findViewById(R.id.durasi_movie);
        genreMovie = findViewById(R.id.genre_movie);

        String name = getIntent().getStringExtra(EXTRA_TITLE);
        String remark = getIntent().getStringExtra(EXTRA_REMARK);
        String img = getIntent().getStringExtra(EXTRA_IMG);
        String content = getIntent().getStringExtra(EXTRA_CONTENT);
        String direct = getIntent().getStringExtra(EXTRA_DIRECT);
        String rilis = getIntent().getStringExtra(EXTRA_RILIS);
        String durasi = getIntent().getStringExtra(EXTRA_DURASI);
        String genre = getIntent().getStringExtra(EXTRA_GENRE);

        String title = name ;
        String note = remark ;
        String mainContent = content ;
        String sutradara = direct ;
        String realease = rilis ;
        String hours = durasi ;
        String genres = genre ;

        titleMovie.setText(title);
        remarkMovie.setText(note);
        contentMovie.setText(mainContent);
        directMovie.setText(sutradara);
        rilisMovie.setText(realease);
        durasiMovie.setText(hours);
        genreMovie.setText(genres);

        Glide.with(this).load(img).into(imgMovie);


    }
}
