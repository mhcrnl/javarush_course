package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by User on 16.04.15.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes type) {
        ImageReader reader=null;
        if (type==(ImageTypes.BMP)) reader = new BmpReader();
        else if (type==(ImageTypes.PNG)) reader = new PngReader();
        else if (type==(ImageTypes.JPG)) reader = new JpgReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
        return reader;
    }
}
