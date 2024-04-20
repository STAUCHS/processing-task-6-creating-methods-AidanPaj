import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
  //drawing column on the left using flower
    drawFlower (100,100,40,20);
    drawFlower (100,200,40,20);
    drawFlower (100,300,40,20);
    drawFlower (100,400,40,20);
    drawFlower (100,500,40,20);
    drawFlower (100,600,40,20);
    drawFlower (100,700,40,20);
    
    //drawing column in the middle for the skulls 
    drawSkull  (400, 200);
    drawSkull  (400, 600);

    //drawing column on the far right using flower
    drawFlower (700,100,40,20);
    drawFlower (700,200,40,20);
    drawFlower (700,300,40,20);
    drawFlower (700,400,40,20);
    drawFlower (700,500,40,20);
    drawFlower (700,600,40,20);
    drawFlower (700,700,40,20);

    //drawing final row in the middle of the two skulls using flower
    drawFlower (200,400,40,20);
    drawFlower (300,400,40,20);
    drawFlower (400,400,40,20);
    drawFlower (500,400,40,20);
    drawFlower (600,400,40,20);
  }
    
  public void drawFlower(float flowerX, float flowerY,float petalSize,float petalDistance) {
    //drawing petals 
    fill(230, 51, 7);
    ellipse(flowerX - petalDistance, flowerY - petalDistance, petalSize, petalSize);
    ellipse(flowerX + petalDistance, flowerY - petalDistance, petalSize, petalSize);
    ellipse(flowerX - petalDistance, flowerY + petalDistance, petalSize, petalSize);
    ellipse(flowerX + petalDistance, flowerY + petalDistance, petalSize, petalSize);  
 
    // creating the middle part of the flower
    fill(0);
    ellipse(flowerX,flowerY,30,30);

    }

  //drawing skull as another drawing
  public void drawSkull(float SkullX, float SkullY){
    //making skull white
    fill(255);

    // Draw the top circle part of the skull.
    ellipse(SkullX, SkullY, 295, 195);
    
    // Draw the bottom rectangle part of the skull.
    rect(SkullX-75, SkullY+50, 145, 95);
    
    // Change the fill color to black.
    fill(0);
      
    // Draw the eyes.
    ellipse(SkullX-75, SkullY, 45, 45);
    ellipse(SkullX+75, SkullY, 45, 45);
      
    // Draw the teeth lines.
    rect(SkullX-50, SkullY+100, 5, 45);
    rect(SkullX, SkullY+100, 5, 45);
    rect(SkullX+50, SkullY+100, 5, 45);

    }
  }

  /**
   * Description
   * 
   * @param 
   * @param 
   * @return
   * @author 
   */

  
  
