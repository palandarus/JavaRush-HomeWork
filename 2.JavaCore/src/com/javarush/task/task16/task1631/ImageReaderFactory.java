package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by pdv on 18.05.2017.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type)
    {
        ImageReader result=null;
        try {
            switch (type) {
                case BMP:
                    result = new BmpReader();
                    break;
                case JPG:
                    result = new JpgReader();
                    break;
                case PNG:
                    result = new PngReader();
                    break;
            }
        }
        catch (Exception e)
        {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return result;
    }

}
