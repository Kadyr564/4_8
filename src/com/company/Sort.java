package com.company;

import java.util.Comparator;
import java.util.List;

/**
 * Класс с реализацией сортировки методом Шелла для массивов и списков
 */
public class Sort {

    /**
     * Сортировка методом Шелла
     *
     * @param <T> Произвольный (но ссылочный) тип элементов массива
     * @param data Сортируемый массив типа T
     * @param c Компаратор для сравнения элементов
     */
    public static <T> void sort(T[] data, Comparator<T> c) {
        T temp;
        int h = 0;//величина интервала

        //вычисляем исходное значение интервала
        while(h <= data.length/3)
            h = 3*h + 1;

        for(int k = h; k > 0; k = (k-1)/3)
            for(int i = k; i < data.length; i++)
            {
                temp = data[i];
                int j;
                for(j = i; j >= k; j -= k)
                {
                    if(c.compare(temp,data[j - k])<0)
                        data[j] = data[j - k];
                    else
                        break;
                }
                data[j] = temp;
            }
    }


    public static <T extends Comparable<T>> void sort(T[] data) {
        /*
        class TempComparator implements Comparator<T> {
            @Override
            public int compare(T a, T b) {
                return a.compareTo(b);
            }
        }
        sort(data, new TempComparator());
        */
        sort(data, Comparable::compareTo);
    }

}