package com.example.syct;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class LoadingTaskActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private ImageView imageView;
    private RelativeLayout loadingContainer;
    private ObjectAnimator rotateAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_task); // Charge le layout correct

        progressBar = findViewById(R.id.progressBar); // Initialise la ProgressBar
        imageView = findViewById(R.id.img); // Initialise l'ImageView
        loadingContainer = findViewById(R.id.loadingContainer); // Initialise le container

        // Create an ObjectAnimator to rotate the loading container
        rotateAnimator = ObjectAnimator.ofFloat(loadingContainer, "rotation", 0f, 360f);
        rotateAnimator.setDuration(1000); // Duration for one full rotation
        rotateAnimator.setRepeatCount(ObjectAnimator.INFINITE); // Infinite repeat
        rotateAnimator.setRepeatMode(ObjectAnimator.RESTART); // Restart the animation

        new LoadingTask().execute(); // Démarre la tâche en arrière-plan
    }

    // Classe interne pour la tâche en arrière-plan
    private class LoadingTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Initialisation avant le chargement
            progressBar.setVisibility(View.VISIBLE); // Affiche la ProgressBar
            rotateAnimator.start(); // Start rotating the container
        }

        @Override
        protected Void doInBackground(Void... voids) {
            // Chargement en arrière-plan
            try {
                Thread.sleep(4000); // Simule un chargement pendant 4 secondes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            // Actions après le chargement
            progressBar.setVisibility(View.GONE); // Cache la ProgressBar
            rotateAnimator.end(); // Stop rotating the container
            // Passe à l'activité suivante
            startActivity(new Intent(LoadingTaskActivity.this, SignUpActivity.class));
            finish(); // Termine l'activité actuelle
        }
    }
}