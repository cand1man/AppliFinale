package com.example.alexis_oliveira.testappligooglemap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton basiliquebutton;
    private Monument monument;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView) findViewById(R.id.gridview);
        final MonumentAdapter monumentAdapter = new MonumentAdapter(this, monuments);
        gridView.setAdapter(monumentAdapter);
        // addListenerOnButton();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Monument monument = monuments[position];
                switch (monument.getNom()){
                    case R.string.basilique:
                        Intent myIntent0 = new Intent(MainActivity.this,BasiliqueActivity.class);
                        monumentAdapter.notifyDataSetChanged();
                        String addBasilique = getString(R.string.addr_basilique);
                        myIntent0.putExtra("address", addBasilique);
                        startActivity(myIntent0);
                        break;
                    case R.string.bergeret:
                        Intent myIntent1 = new Intent(MainActivity.this,BergeretActivity.class);
                        monumentAdapter.notifyDataSetChanged();
                        String addBergeret = getString(R.string.addr_bergeret);
                        myIntent1.putExtra("address", addBergeret);
                        startActivity(myIntent1);
                        break;
                    case R.string.cathedral:
                        Intent myIntent2 = new Intent(MainActivity.this,CathedralActivity.class);
                        monumentAdapter.notifyDataSetChanged();
                        String addCathedral = getString(R.string.addr_cathedral);
                        myIntent2.putExtra("address", addCathedral);
                        startActivity(myIntent2);
                        break;
                    case R.string.eglise:
                        Intent myIntent3= new Intent(MainActivity.this,EgliseActivity.class);
                        monumentAdapter.notifyDataSetChanged();
                        String addEglise = getString(R.string.addr_eglise);
                        myIntent3.putExtra("address", addEglise);
                        startActivity(myIntent3);
                        break;
                    case R.string.pepiniere:
                        Intent myIntent4 = new Intent(MainActivity.this,PepiniereActivity.class);
                        monumentAdapter.notifyDataSetChanged();
                        String addPepiniere = getString(R.string.addr_pepiniere);
                        myIntent4.putExtra("address", addPepiniere);
                        startActivity(myIntent4);
                        break;
                    case R.string.place:
                        Intent myIntent5 = new Intent(MainActivity.this,PlaceActivity.class);
                        monumentAdapter.notifyDataSetChanged();
                        String addPlace = getString(R.string.addr_place);
                        myIntent5.putExtra("address", addPlace);
                        startActivity(myIntent5);
                        break;
                    case R.string.porte:
                        Intent myIntent6 = new Intent(MainActivity.this,PorteActivity.class);
                        monumentAdapter.notifyDataSetChanged();
                        String addPorte = getString(R.string.addr_porte);
                        myIntent6.putExtra("address", addPorte);
                        startActivity(myIntent6);
                        break;
                    case R.string.tour:
                        Intent myIntent7 = new Intent(MainActivity.this,TourActivity.class);
                        monumentAdapter.notifyDataSetChanged();
                        String addTour = getString(R.string.addr_tour);
                        myIntent7.putExtra("address", addTour);
                        startActivity(myIntent7);
                        break;
                    case R.string.villa:
                        Intent myIntent8 = new Intent(MainActivity.this,VillaActivity.class);
                        monumentAdapter.notifyDataSetChanged();
                        String addVilla = getString(R.string.addr_villa);
                        myIntent8.putExtra("address", addVilla);
                        startActivity(myIntent8);
                        break;
                }
            }
        });
    }

    public String ChoixMonument(Monument monument){
        switch (monument.getNom())
        {
            case R.string.basilique:
                String addBasilique = getString(R.string.addr_basilique);
                return addBasilique;
            case R.string.cathedral:
                String addCathedral = getString(R.string.addr_cathedral);
                return addCathedral;
            case R.string.pepiniere:
                String addPepiniere = getString(R.string.addr_pepiniere);
                return addPepiniere;
            case R.string.place:
                String addPlace = getString(R.string.addr_place);
                return addPlace;
            case R.string.bergeret:
                String addBergeret = getString(R.string.addr_bergeret);
                return addBergeret;
            case R.string.tour:
                String addTour = getString(R.string.addr_tour);
                return addTour;
            case R.string.eglise:
                String addEglise = getString(R.string.addr_eglise);
                return addEglise;
            case R.string.villa:
                String addVilla = getString(R.string.addr_villa);
                return addVilla;
            case R.string.porte:
                String addPorte = getString(R.string.addr_porte);
                return addPorte;
            default:
                String addDefault = "Nancy";
                return addDefault;
        }
    }





   /* private void addListenerOnButton() {

        basiliquebutton = (ImageButton) findViewById(R.id.gridview);
        basiliquebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this,NextActivity.class);
            };
        });
    }*/

    private Monument[] monuments = {
            new Monument(R.string.basilique,R.string.addr_basilique,R.drawable.basiliquemm),
            new Monument(R.string.cathedral,R.string.addr_cathedral,R.drawable.cathedralmm),
            new Monument(R.string.pepiniere,R.string.addr_pepiniere,R.drawable.pepinieremm),
            new Monument(R.string.place,R.string.addr_place,R.drawable.placestanislasmm),
            new Monument(R.string.bergeret,R.string.addr_bergeret,R.drawable.bergeretmm),
            new Monument(R.string.tour,R.string.addr_tour,R.drawable.tourdelacommanderiemm),
            new Monument(R.string.eglise,R.string.addr_eglise,R.drawable.eglisemm),
            new Monument(R.string.villa,R.string.addr_villa,R.drawable.villamajorellemm),
            new Monument(R.string.porte,R.string.addr_porte,R.drawable.portedelacraffemm)
    };
}