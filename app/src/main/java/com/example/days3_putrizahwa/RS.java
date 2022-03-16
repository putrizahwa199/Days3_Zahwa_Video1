package com.example.days3_putrizahwa;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS = new String[] {"Rumah sakit Awal Bros","Rumah Sakit Eka Hospital","Rumah Sakit Syafira",
                "Rumah Sakit Jiwa Tampan","Rumah Sakit Ibu dan Anak Zainab","RSUD Arifin Achmad"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listRS));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah sakit Awal Bros")) {
                a = new Intent(this,RSAwalBros.class);
            }else if (pilihan.equals("Rumah Sakit Eka Hospital")) {
                a = new Intent(this,RSEkaHospital.class);
            }else if (pilihan.equals("Rumah Sakit Syafira")) {
                a = new Intent(this,RSSyafira.class);
            }else if (pilihan.equals("Rumah Sakit Jiwa Tampan")) {
                a = new Intent(this,RSJTampan.class);
            }else if (pilihan.equals("Rumah Sakit Ibu dan Anak Zainab")) {
                a = new Intent(this,RSIAZainab.class);
            }else if (pilihan.equals("RSUD Arifin Achmad")) {
                a = new Intent(this,RSUDArifinAchmad.class);
            }
            startActivity(a);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
