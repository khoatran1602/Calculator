package com.Youtube;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Calculator {

    ArrayList<Integer> dataList = new ArrayList<>();

    public void loadData(String fileItem) throws FileNotFoundException {
        try {
            Scanner fileIn = new Scanner(new File(fileItem));
            while (fileIn.hasNext()) {
                if (fileIn.hasNextLine()) {
                    dataList.add(fileIn.nextInt());
                } else {
                    fileIn.next();
                }
            }
        } catch (IOException e)
        {
            System.out.println("No file found.");
        }
    }

    public int Sum() {
        int sum = 0;
        for (int data : dataList) {
            sum += data;
        }
        return sum;
    }

    public void Average() {
        int avg = Sum() / dataList.size();
        System.out.println(avg);
    }

    public void Maximun() {
        int max = 0;
        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i) > max) {
                max = dataList.get(i);
            }
        }
        System.out.println(max);
    }

    public void Minimum() {
        int min = dataList.get(0);
        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i) <= min) {
                min = dataList.get(i);
            }
        }
        System.out.println(min);
    }

    public void Median() {
        Collections.sort(dataList);
        double median;
        if (dataList.size() % 2 == 0) {
            median = ((double) dataList.get(dataList.size() / 2) + (double) dataList.get(dataList.size() / 2 - 1)) / 2;
        } else {
            median = (double) dataList.get(dataList.size() / 2);
        }
        System.out.println(median);
    }

    public void Mode() {
        int maxValue = -1;
        int maxCount = 0;
        for (int i = 0; i < dataList.size(); i++) {
            int count = 0;
            for (int j = 0; j < dataList.size(); j++) {
                if (dataList.get(j) == dataList.get(i))
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = dataList.get(i);
            }
        }
        for (int i = 0; i < dataList.size(); i++) {
            int count = 0;
            for (int j = 0; j < dataList.size(); j++) {
                if (dataList.get(j) == dataList.get(i))
                    count++;
            }
            if (count == maxCount) {
                System.out.println(dataList.get(i));
            }
        }
    }
}
