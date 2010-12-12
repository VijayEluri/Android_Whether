package ucsc.whether;

import java.util.Hashtable;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class ActivityTabPressure extends Activity {
	Hashtable<String, String> ht;
	TextView tvPressure;
	TextView tvPressuremb;
	TextView tvPressurein;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_pressure);
        
        @SuppressWarnings("unchecked")
		Hashtable<String, String> ht = (Hashtable<String, String>) getIntent().getSerializableExtra("hash");
    
        tvPressure = (TextView) this.findViewById(R.id.TextView02);
        tvPressuremb = (TextView) this.findViewById(R.id.TextView04);
        tvPressurein = (TextView) this.findViewById(R.id.TextView06);
        tvPressure.setText(ht.get("pressure_string"));
        tvPressuremb.setText(ht.get("pressure_mb"));
        tvPressurein.setText(ht.get("pressure_in"));
        
    }
}