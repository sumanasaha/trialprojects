package com.example.sumanasaha.googlemap;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        /**mMap = googleMap;

        * Add a marker in Sydney and move the camera
        *LatLng kerela = new LatLng(9.365296, 76.780886);
        *mMap.addMarker(new MarkerOptions().position(kerela).title("Marker in Kerela"));
        *mMap.moveCamera(CameraUpdateFactory.newLatLng(kerela));
         * To go to real time google map with all its features
         *

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:47.6,-122.3"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }*/


    }

    public void onSearch(View view)
    {
        /**EditText location_tf= (EditText) findViewById(R.id.TFaddress);
        String location=location_tf.getText().toString();
        List<Address> addressList=null;
        if(location!=null || !location.equals(""))
        {try {
            Geocoder geocoder = new Geocoder(this);
            try {
                addressList = geocoder.getFromLocationName(location, 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            Address address = addressList.get(0);
            LatLng latlng = new LatLng(address.getLatitude(), address.getLongitude());
            mMap.addMarker(new MarkerOptions().position(latlng).title("Marker"));
            mMap.animateCamera(CameraUpdateFactory.newLatLng(latlng));
        }
        catch(Exception e){
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("Invalid Location");
            builder1.setCancelable(true);
            builder1.setPositiveButton(
                    "Yes",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            builder1.setNegativeButton(
                    "No",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();
        }
        }*/

        /**Email Service
        EditText location_tf= (EditText) findViewById(R.id.TFaddress);
        String location=location_tf.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);*/
        //intent.setType("*/*");
       // intent.putExtra(Intent.EXTRA_EMAIL,location);
        //intent.putExtra(Intent.EXTRA_SUBJECT, "Test Email");
        //intent.putExtra(Intent.EXTRA_STREAM, attachment);
       // if (intent.resolveActivity(getPackageManager()) != null) {
       //     startActivity(intent);
       // }
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.search)
                        .setContentTitle("My notification")
                        .setContentText("Hello World!");
    }
}

