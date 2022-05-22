package com.warlocks.minesweeper.util;

import android.util.Log;

public class PrintGrid {
    public static void print(int[][] grid, int width, int height){
        for( int x = 0 ; x < width ; x++ ){
            String printedText = "| ";
            for( int y = 0 ; y < height ; y++ ){
                printedText += String.valueOf(grid[x][y]).replace("-1", "X") + " | ";
            }
            Log.e("",printedText);
        }
    }
}
