package com.example.sortingvalues;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortingValues {

/*
    @RequestMapping("/")
    public String sortedValues(@RequestParam String numList){

        String = "5,10,15,20,25";
        return "";
    }
*/

    @RequestMapping("/")
    public Integer[] sortedValues(){

        /*String list= "45, 87, 39, 32, 93, 86, 12, 44, 75, 50";*/
        String list= "45,87,39,32,93,86,12,44,75,50";

        String[] arrList = list.split(",");

        Integer[] numList = new Integer[arrList.length];

        for ( int i = 0; i < arrList.length; i++){

            numList[i] = Integer.parseInt(arrList[i]);
        }

        for ( int j = 0; j < numList.length; j++) {
            for ( int k = 0; k < numList.length -j - 1; k++){
                if ( numList[k] > numList[k+1]) {
                    int temp = numList[k];
                    numList[k] = numList[k+1];
                    numList[k+1] = temp;
                }
            }
        }
        return numList;
    }
}
