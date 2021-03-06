package com.qbhy.poster.contracts;

import java.awt.*;
import java.io.IOException;

public interface DrawableInterface {
    void draw(Graphics2D gd) throws IOException;

    int getZIndex();
}
