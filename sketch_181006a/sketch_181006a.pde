void setup() {
  size(2000, 2000);
  rect(1000, 500, 2000, 2000);
  triangle(1250, 550, 1250, 560, 1500, 700);
  fill(#F8DEFA);
  ellipse(1000, 500, 250, 250);
  fill(#DDD9DE);
  ellipse(1000, 500, 200, 200);
}
void draw() {
  fill(#DDD9DE);
  if (mousePressed==true) {
    fill(#AEEBFA);
  }
  ellipse(1000, 500, 200, 200);
}