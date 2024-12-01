package com.practice.sorting;

import java.util.Comparator;

/**
 * @author Sourav Suman - 02-12-2024
 */
public class SortingUsingComparator implements Comparator<Department> {

    @Override
    public int compare(Department o1, Department o2) {
        if(o1.getNoOfEmployee() <= o2.getNoOfEmployee()) {
            return 1;
        }
        if (o1.getNoOfEmployee() >= o2.getNoOfEmployee()) {
            return -1;
        }
        return 0;
    }
}
