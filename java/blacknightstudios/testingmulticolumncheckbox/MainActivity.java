package blacknightstudios.testingmulticolumncheckbox;

import static blacknightstudios.testingmulticolumncheckbox.Constants.FIRST_COLUMN;
import static blacknightstudios.testingmulticolumncheckbox.Constants.SECOND_COLUMN;
import static blacknightstudios.testingmulticolumncheckbox.Constants.THIRD_COLUMN;
import static blacknightstudios.testingmulticolumncheckbox.Constants.FOURTH_COLUMN;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ArrayList<HashMap<String, String>> list;

    ListView lv;
    ArrayList<Model> modelItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listView1);
        modelItems.add(new Model(0, "Black", "Male", "26", "Single"));
        modelItems.add(new Model(1, "String", "Male", "22", "Married"));
        modelItems.add(new Model(1, "Cheese", "Female", "24", "Married"));
        modelItems.add(new Model(0, "Knight", "Male", "26", "Single"));
        modelItems.add(new Model(1, "Shaaka", "Male", "26", "Single"));
        modelItems.add(new Model(0, "Black", "Male", "26", "Single"));
        modelItems.add(new Model(1, "String", "Male", "22", "Married"));
        modelItems.add(new Model(1, "Cheese", "Female", "24", "Married"));
        modelItems.add(new Model(0, "Knight", "Male", "26", "Single"));
        modelItems.add(new Model(1, "Shaaka", "Male", "26", "Single"));
        modelItems.add(new Model(0, "Black", "Male", "26", "Single"));
        modelItems.add(new Model(1, "String", "Male", "22", "Married"));
        modelItems.add(new Model(1, "Cheese", "Female", "24", "Married"));
        modelItems.add(new Model(0, "Knight", "Male", "26", "Single"));
        modelItems.add(new Model(1, "Shaaka", "Male", "26", "Single"));
        CheckboxAdapter adapter = new CheckboxAdapter(this, modelItems);
        lv.setAdapter(adapter);
    }
        /*
        lv=(ListView)findViewById(R.id.listView1);

        list=new ArrayList<HashMap<String,String>>();

        HashMap<String,String> temp=new HashMap<String, String>();
        temp.put(FIRST_COLUMN, "Ankit Karia");
        temp.put(SECOND_COLUMN, "Male");
        temp.put(THIRD_COLUMN, "22");
        temp.put(FOURTH_COLUMN, "Unmarried");
        list.add(temp);

        HashMap<String,String> temp2=new HashMap<String, String>();
        temp2.put(FIRST_COLUMN, "Rajat Ghai");
        temp2.put(SECOND_COLUMN, "Male");
        temp2.put(THIRD_COLUMN, "25");
        temp2.put(FOURTH_COLUMN, "Unmarried");
        list.add(temp2);

        HashMap<String,String> temp3=new HashMap<String, String>();
        temp3.put(FIRST_COLUMN, "Karina Kaif");
        temp3.put(SECOND_COLUMN, "Female");
        temp3.put(THIRD_COLUMN, "31");
        temp3.put(FOURTH_COLUMN, "Unmarried");
        list.add(temp3);
        list.add(temp3);
        list.add(temp3);
        list.add(temp);
        list.add(temp2);

        ListViewAdapter adapter=new ListViewAdapter(this, list);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id)
            {
                int pos=position+1;
                Toast.makeText(MainActivity.this, Integer.toString(pos)+" Clicked", Toast.LENGTH_SHORT).show();
            }

        }
    }
    */
}
