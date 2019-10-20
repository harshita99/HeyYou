package com.example.dopamineproject;

import android.graphics.Path;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DrawingPad{

    public int color;
    public boolean emboss;
    public boolean blur;
    public int strokeWidth;
    public Path path;

    public DrawingPad(int color, boolean emboss, boolean blur, int strokeWidth, Path path) {
        this.color = color;
        this.emboss = emboss;
        this.blur = blur;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }
}
