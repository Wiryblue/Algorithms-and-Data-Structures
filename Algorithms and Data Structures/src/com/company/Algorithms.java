package com.company;

public class Algorithms {
    int midpoint;
    int point;

    public int  LinearSearch(int[] list, int target){

        for (int i = 0; i < list.length; i++){
            if (list[i]== target){

                point =  i;
                break;
            }
            else{
                //None
            }
        }

        return point;
    }



    public int BinarySearch(int[] list, int target){
        int first = 0;
        int last = list.length - 1;


        while(first <= last){

             midpoint = (int)Math.floor((first+last)/2);
            if(list[midpoint] == target){

                break;
            }
            if (list[midpoint] < target){
                first = midpoint+1;

            }

            if (list[midpoint] > target){
                last = midpoint-1;
            }

        }

        return midpoint;
    }


    public int RecursiveBinarySearch(){



    }






}
