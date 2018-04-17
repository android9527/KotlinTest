package com.android9527.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * Created by chenfeiyue on 2018/4/13.
 * Description:
 */
public class MainJava {
    public void write() {
        File file = new File("test.txt");
        OutputStream outputStream = null;
        try {
            boolean result = file.createNewFile();
            outputStream = new FileOutputStream(file);
            byte[] b = "Hello World".getBytes("UTF-8");
            outputStream.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void read() {
        File file = new File("test.txt");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            int len;
            byte[] buf = new byte[1024];
            while ((len = inputStream.read(buf)) != -1) {
                System.out.println(Arrays.toString(new String(buf, 0, len).getBytes("UTF-8")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
