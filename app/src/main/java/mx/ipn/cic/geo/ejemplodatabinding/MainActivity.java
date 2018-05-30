package mx.ipn.cic.geo.ejemplodatabinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.databinding.DataBindingUtil;
import mx.ipn.cic.geo.ejemplodatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    UsoDataBinding objeto;
    ActivityMainBinding dataBindingUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        dataBindingUtil = DataBindingUtil.setContentView(this, R.layout.activity_main);
        objeto = new UsoDataBinding("EJEMPLO CLASE DATA BINDING");
        dataBindingUtil.setUsoDataBinding(objeto);

        /*
        firstSampleBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_first_sample);
        userInfo = new UserInfo("EJEMPLO DE CAMBIO PROPIEDAD TEXT", "USANDO DATABINDING POJO");
        firstSampleBinding.setUserInfo(userInfo);
         */
    }
}
