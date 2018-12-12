int distance;
int x = 123;
int y = 119;
int s = 113;
void setup() {
  size(800,800);
background(123,112,314);
}
void draw(){
ellipse(x,y,s,s);
if(mousePressed){
  distance = getDistance(mouseX,mouseY,x,y);
  println(distance);
}  
}

int getDistance(int x1, int y1, int x2, int y2) { //<>//
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));





}