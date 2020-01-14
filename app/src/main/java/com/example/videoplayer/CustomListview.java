package com.example.videoplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListview extends ArrayAdapter<String> {

    String[] Category;
    int[] Image;

    private Activity context;

    public CustomListview(Activity context, String[] Category,int[] Image) {
        super(context,R.layout.list_layout,Category);

        this.context=context;
        this.Category=Category;

        if(Image != null)
            this.Image=Image;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View r=convertView;
       ViewHolder viewHolder = null;
       if(r==null){
           LayoutInflater layoutInflater=context.getLayoutInflater();
           r=layoutInflater.inflate(R.layout.list_layout,null,true);
           viewHolder=new ViewHolder(r);
           r.setTag(viewHolder);
           // back to here

       }
       else {
           viewHolder= (ViewHolder) r.getTag();

       }
       viewHolder.textView2.setText(Category[position]);

       if(Image != null)
            viewHolder.imageView3.setImageResource(Image[position]);

        return r;


    }

    class ViewHolder{
        TextView textView2;
        ImageView imageView3;

        ViewHolder(View v){
            textView2=v.findViewById(R.id.textView2);
            
            if(Image != null)
                imageView3=v.findViewById(R.id.imageView3);
        }
    }
}
