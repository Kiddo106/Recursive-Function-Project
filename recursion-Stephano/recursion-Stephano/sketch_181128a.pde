void setup(){
size(600,600);
}

void draw(){
background(206,247,0);
drawCircle(width/2, height/2, 300);
drawSomething(width/2, height/2, 400);
}

void drawCircle(float x, float y, float d){
stroke(0);
noFill();
ellipse(x,y,d,d);
if (d >4){
  
drawCircle(x+d/2,y,d/2);
drawCircle(x-d/2,y,d/2);

drawCircle(y-d/2,x,d/2);
drawCircle(y+d/2,x,d/2);


}
}

void drawSomething(float x, float y, float d){
stroke(196,0, 160);
strokeWeight(0);  
line(10, 10, 40, 100);

noFill();
ellipse(x,y,d,d);
x = 300;
y= 1000;
if (d>5){

drawSomething(x+y,x,d/2);
drawSomething(x-d/2,x,d/2);
}
}
