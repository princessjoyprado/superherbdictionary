package com.example.herb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainmenu extends AppCompatActivity {
//    Button garlic,aloevera,celery,Daisy,Marigold,Cayenne, Chil,Papaya,Lemon,Gingko,Jasmine,Lavender,Chamomile,Lemonbalm,Peppermint,Lotus,holybasil,Oregano,Dandelion,Parsley, Rosemary,Sage,StJohnsWort,

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
    }

    public void garlic(View view) {
        Intent intent = new Intent(mainmenu.this,GarlicActivity.class);
        startActivity(intent);

    }

    public void alovera(View view) {
        Intent a = new Intent(mainmenu.this,alovera.class);
        startActivity(a);
    }

    public void daisy(View view) {
        Intent b = new Intent(mainmenu.this,daisy.class);
        startActivity(b);
    }

    public void marygold(View view) {
        Intent c = new Intent(mainmenu.this,marygold.class);
        startActivity(c);
    }

    public void cayenne(View view) {
        Intent d = new Intent(mainmenu.this,cayenne.class);
        startActivity(d);
    }

    public void chili(View view) {
        Intent e = new Intent(mainmenu.this,chili.class);
        startActivity(e);
    }

    public void papaya(View view) {
        Intent f = new Intent(mainmenu.this,papaya.class);
        startActivity(f);
    }

    public void lemon(View view) {
        Intent g = new Intent(mainmenu.this,lemon.class);
        startActivity(g);
    }

    public void gingko(View view) {
        Intent h = new Intent(mainmenu.this,gingko.class);
        startActivity(h);
    }

    public void jasmine(View view) {
        Intent i = new Intent(mainmenu.this,jasmine.class);
        startActivity(i);
    }

    public void lavender(View view) {
        Intent j = new Intent(mainmenu.this,lavender.class);
        startActivity(j);
    }

    public void chamomile(View view) {
        Intent k = new Intent(mainmenu.this,chamomile.class);
        startActivity(k);
    }

    public void lemonbalm(View view) {
        Intent l = new Intent(mainmenu.this,lemonbalm.class);
        startActivity(l);
    }

    public void peppermint(View view) {
        Intent m = new Intent(mainmenu.this,peppermint.class);
        startActivity(m);
    }

    public void lutos(View view) {
        Intent n = new Intent(mainmenu.this,lotus.class);
        startActivity(n);
    }

    public void holybasil(View view) {
        Intent o = new Intent(mainmenu.this,holybasil.class);
        startActivity(o);
    }

    public void oregano(View view) {
        Intent p = new Intent(mainmenu.this,oregano.class);
        startActivity(p);
    }

    public void celery(View view) {
        Intent q = new Intent(mainmenu.this,celery.class);
        startActivity(q);
    }

    public void dandelion(View view) {
        Intent r = new Intent(mainmenu.this,dandelion.class);
        startActivity(r);
    }

    public void parsley(View view) {
        Intent s = new Intent(mainmenu.this,parsley.class);
        startActivity(s);
    }

    public void rosemary(View view) {
        Intent t = new Intent(mainmenu.this,rosemary.class);
        startActivity(t);
    }

    public void sage(View view) {
        Intent u = new Intent(mainmenu.this,sage.class);
        startActivity(u);
    }

    public void stjohn(View view) {
        Intent v = new Intent(mainmenu.this,stjohn.class);
        startActivity(v);
    }

    public void marshmallow(View view) {
        Intent w = new Intent(mainmenu.this,marshmallow.class);
        startActivity(w);
    }
}