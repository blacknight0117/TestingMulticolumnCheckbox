package blacknightstudios.testingmulticolumncheckbox;
/**
 * Created by black_000 on 8/13/2016.
 */
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class CheckboxAdapter extends ArrayAdapter {
    ArrayList<Model> modelItems = new ArrayList<Model>();
    Context context;

    public CheckboxAdapter(Context context, ArrayList<Model> resource) {
        super(context, R.layout.colmn_row, resource);
        // TODO Auto-generated constructor stub
        this.context = context;
        this.modelItems = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.colmn_row, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView age = (TextView) convertView.findViewById(R.id.age);
        TextView gender = (TextView) convertView.findViewById(R.id.gender);
        TextView status = (TextView) convertView.findViewById(R.id.status);
        CheckBox cb = (CheckBox) convertView.findViewById(R.id.checkBox1);
        name.setText(modelItems.get(position).getName());
        age.setText(modelItems.get(position).getAge());
        gender.setText(modelItems.get(position).getGender());
        status.setText(modelItems.get(position).getStatus());

        if (modelItems.get(position).getValue() == 1)
            cb.setChecked(true);
        else
            cb.setChecked(false);

        return convertView;
    }
}