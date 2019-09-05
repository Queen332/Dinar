package ke.ac.dinar;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import ke.ac.dinar.Adapter.DinarAdapter;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

    // Homedinar.dinar();
        GlobalVars.dinars.add(new dinars("Pearl chambers","0765453653",R.mipmap.mipmap_c_two));
        GlobalVars.dinars.add(new dinars("Michael Simon","0798765432",R.mipmap.mipmap_c_two));
        GlobalVars.dinars.add(new dinars("Mildred Gregory","0786755443",R.mipmap.mipmap_c_two));
        GlobalVars.dinars.add(new dinars("Seth Day","0745676767",R.mipmap.mipmap_c_two));
        GlobalVars.dinars.add(new dinars("Evans Mbithi","0718666563",R.mipmap.mipmap_c_two));

        initdinars();
    }
    public  void initdinars(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView =findViewById(R.id.dinar);
        recyclerView.setLayoutManager(linearLayoutManager);
       /* recyclerView.hasFixedSize();
        recyclerView.setNestedScrollingEnabled(false);*/

         //DinarAdapter adapter= new DinarAdapter();
        DinarAdapter adapter= new DinarAdapter(getApplicationContext(),GlobalVars.dinars);
        recyclerView.setAdapter(adapter);
    }

}

