package com.javaCore.level_6.lecture_13.task_1;

import com.javaCore.level_6.lecture_13.task_1.common.*;

public class ImageReaderFactory {
    private ImageReaderFactory() {
    }

    public static ImageReader getImageReader(ImageTypes imageTypes) {
        if (imageTypes == null) {
            throw new IllegalArgumentException();
        }
        ImageReader imageReader;
        switch (imageTypes) {
            case BMP:
                imageReader = new BmpReader();
                break;
            case JPG:
                imageReader = new JpgReader();
                break;
            case PNG:
                imageReader = new PngReader();
                break;
            default:
                throw new IllegalArgumentException();
        }
        return imageReader;
    }
}
