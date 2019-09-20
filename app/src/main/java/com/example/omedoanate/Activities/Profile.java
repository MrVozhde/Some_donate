package com.example.omedoanate.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.omedoanate.Adapters.Recycler_Adapter_profile;
import com.example.omedoanate.Model.Recycler_model_profile;
import com.example.omedoanate.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Hashtable;

public class Profile extends AppCompatActivity {

    Toolbar toolbar;
    private RecyclerView recyclerView;
    private ArrayList<Recycler_model_profile> items = new ArrayList<>();
    private Recycler_Adapter_profile adapter_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        toolbar = findViewById(R.id.toolbar_profile_id);
        recyclerView = findViewById(R.id.recycler_profile_id);

        adapter_profile = new Recycler_Adapter_profile(getApplicationContext() , items);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false);
        recyclerView.setLayoutManager(linearLayoutManager);
        //items.add(new Recycler_model_profile("amin","movafagh bashid"," 546666 تومان"));
        PostData();
        recyclerView.setAdapter(adapter_profile);

        toolbar.setTitle("پروفایل");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private void PostData() {
        final RequestQueue queue = Volley.newRequestQueue(Profile.this);
        String URL = "http://se7enf98.ddns.net/webservice/mpm7/fetch.php";

        final ProgressDialog dialog ;
        dialog = new ProgressDialog(Profile.this);
        dialog.setMessage("لطفا صبر کنید ..");
        dialog.setCancelable(false);
        dialog.show();

        Hashtable<String , String > params = new Hashtable<>();
        params.put("Name" , "Ali_Rn");

        JSONObject object = new JSONObject(params);

        final JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, URL, object, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                Toast.makeText(Profile.this, response.toString(), Toast.LENGTH_LONG).show();

                try {
                    String status = response.getString("status");
                    String name = response.getString("DName");
                    String mess = response.getString("Comment");
                    String cost = response.getString("Cost");

                    if (status.equals("success")){
                        items.add(new Recycler_model_profile(name,mess,cost));
                    }else {
                        Toast.makeText(Profile.this, "namovafagh", Toast.LENGTH_SHORT).show();
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                dialog.dismiss();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Profile.this, error.toString(), Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        queue.add(request);
    }
}
