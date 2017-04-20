package ru.baturina.anna.bakeryfrag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    public static final  String PRODUCT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_details);

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        detailsFragment.setProductID(getIntent().getIntExtra(PRODUCT_ID, 1));

    }
}
