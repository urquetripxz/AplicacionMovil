package com.example.alexj.negocios;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;import com.example.alexj.negocios.R;

/**
 * Created by alexj on 11/11/2016.
 */

public class Category {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.favoritos, container, false);
        return view;
    }

    private String title;
    private String categoryId;
    private String description;
    private Drawable imagen;

    public Category() {
        super();
    }

    public Category(String categoryId, String title, String description, Drawable imagen) {
        super();
        this.setTitle(title);
        this.setDescription(description);
        this.setImagen(imagen);
        this.setCategoryId(categoryId);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Drawable getImagen() {
        return imagen;
    }

    public void setImagen(Drawable imagen) {
        this.imagen = imagen;
    }



}


