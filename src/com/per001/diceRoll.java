package com.per001;

import java.util.Random;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class diceRoll extends Activity{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void rollDie1(View view){
    	// make random number generator
        Random generator = new Random();
        
        // calculate random number
        int num = generator.nextInt(6) + 1;
        
        // update die1 image view with new image
        ImageView die1 = (ImageView) findViewById(R.id.die1ImageView);
        
    	switch (num){
        case 1:
            die1.setImageResource(R.drawable.roll1);
            break;
        case 2:
            die1.setImageResource(R.drawable.roll2);
            break;
        case 3:
            die1.setImageResource(R.drawable.roll3);
            break;
        case 4:
        	die1.setImageResource(R.drawable.roll4);
        	break;
        case 5:
        	die1.setImageResource(R.drawable.roll5);
        case 6:
            die1.setImageResource(R.drawable.roll6);
        default:
        	break;
        }
    	view.invalidate();	// redraw
    }
    
    public void rollDie2(View view){
    	// make random number generator
        Random generator = new Random();
        
        // calculate random number
        int num = generator.nextInt(6) + 1;
        
        // update die1 image view with new image
        ImageView die2 = (ImageView) findViewById(R.id.die2ImageView);
        
        switch (num){
        case 1:
        	die2.setImageResource(R.drawable.roll1);
        	break;
        case 2:
        	die2.setImageResource(R.drawable.roll2);
        	break;
        case 3:
        	die2.setImageResource(R.drawable.roll3);
        	break;
        case 4:
        	die2.setImageResource(R.drawable.roll4);
        	break;
        case 5:
        	die2.setImageResource(R.drawable.roll5);
        	break;
        case 6:
        	die2.setImageResource(R.drawable.roll6);
        	break;
        default:
        	break;
        }
    	view.invalidate();	// redraw
    }
    
    public void rollDice(View view){
    	rollDie1(view);
    	rollDie2(view);
    }
    
}