package com.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    Details details;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    String[] numberWord = {"Room One","Room Two","Room Three","Room Four","Room Five","Room Six","Room Seven","Room Eight","Room Nine"};

    int[] numberImage = {R.drawable.bed, R.drawable.bed,R.drawable.bed,R.drawable.bed,R.drawable.bed,R.drawable.bed,R.drawable.bed,R.drawable.bed,R.drawable.bed};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);
        details = new Details();

        MainAdapter adapter = new MainAdapter(MainActivity.this,numberWord,numberImage);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle = new Bundle();
                Toast.makeText(getApplicationContext(), "You Clicked " + numberWord[position], Toast.LENGTH_SHORT).show();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                details.setArguments(bundle);
                bundle.putString("room", numberWord[position]);


                fragmentTransaction.add(R.id.frame_layout, details);
                fragmentTransaction.commit();

            }
        });



    }
}