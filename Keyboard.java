
float x = 244;
float y = 90;
float move = 10;
boolean a = false;
boolean s = false;
boolean d = false;
boolean f = false;
boolean h = false;
boolean j = false;
boolean k = false;
boolean l = false;
boolean start = false;
boolean easy = false;
boolean normal = false;
boolean hard = false;
float make=0;
float miss=0;
FloatList positions;
float count = 0;
float scount =0;
float smiss = 0;
float smake = 0;
float aMiss = 0;
float aMake = 0;
float easyl;
float normall;
float hardl;

void setup(){
  fullScreen();
  positions = new FloatList();
  positions.append(244);
  positions.append(444);
  positions.append(644);
  positions.append(844);
  positions.append(1044);
  positions.append(1244);
  positions.append(1444);
  positions.append(1644);
  
}


void draw(){
  background(0);
  if (easy == false && normal == false && hard == false){
    textSize(150);
    text("Welcome to the game!", 300, (height/2)-100);
    textSize(50);
    text("1 for easy   2 for Normal   3 for Hard", 600, (height/2)+100);
    textSize(50);
    fill(255,0,0);
    text((aMiss*100) + "miss accuracy", 600, 800);
    fill(0,255,0);
    text((aMake*100) + "made accuracy", 600, 850);
  }
  
  if (easy == true){
    easyl = random(1, 10);
    fill(255);
  circle(x, y, 100);
  circle(244,870,100);
  circle(444,870,100);
  circle(644,870,100);
  circle(844,870,100);
  circle(1044,870,100);
  circle(1244,870,100);
  circle(1444,870,100);
  circle(1644,870,100);
  
  textSize(10);
  fill(255,0,0);
  text("Miss: " + miss, 30, 90);
  
  textSize(10);
  fill(0,255,0);
  text("Make: "+ make, 30, 120);
  
  y=y+(move/2);
  if (y> height){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    miss = miss + 1;
    count = count + 1;
  }
  if((x == 244) && (y == 870) && (a == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 444) && (y == 870) && (s == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 644) && (y == 870) && (d == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 844) && (y == 870) && (f == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 1044) && (y == 870) && (h == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 1244) && (y == 870) && (j == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 1444) && (y == 870) && (k == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 1644) && (y == 870) && (l == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
  if(count ==10)
  {
    easy = false;
    scount = count;
    smake = make;
    smiss = miss;
    aMiss =smiss/scount;
    aMake = smake/scount;
    count = 0;
    make = 0;
    miss = 0;
  }
  }
  
  if (normal == true){
    fill(255);
  circle(x, y, 100);
  circle(244,870,100);
  circle(444,870,100);
  circle(644,870,100);
  circle(844,870,100);
  circle(1044,870,100);
  circle(1244,870,100);
  circle(1444,870,100);
  circle(1644,870,100);
  
  textSize(10);
  fill(255,0,0);
  text("Miss: " + miss, 30, 90);
  
  textSize(10);
  fill(0,255,0);
  text("Make: "+ make, 30, 120);
  
  y=y+move;
  if (y> height){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    miss = miss + 1;
    count = count + 1;
  }
  if((x == 244) && (y == 870) && (a == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 444) && (y == 870) && (s == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 644) && (y == 870) && (d == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 844) && (y == 870) && (f == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 1044) && (y == 870) && (h == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 1244) && (y == 870) && (j == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 1444) && (y == 870) && (k == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 1644) && (y == 870) && (l == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
  if(count ==25)
  {
    normal = false;
    scount = count;
    smake = make;
    smiss = miss;
    aMiss =smiss/scount;
    aMake = smake/scount;
    count = 0;
    make = 0;
    miss = 0;
  }
  }
  if (hard == true){
    fill(255);
  circle(x, y, 100);
  circle(244,870,100);
  circle(444,870,100);
  circle(644,870,100);
  circle(844,870,100);
  circle(1044,870,100);
  circle(1244,870,100);
  circle(1444,870,100);
  circle(1644,870,100);
  
  textSize(10);
  fill(255,0,0);
  text("Miss: " + miss, 30, 90);
  
  textSize(10);
  fill(0,255,0);
  text("Make: "+ make, 30, 120);
  
  y=y+(move*2);
  if (y> height){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    miss = miss + 1;
    count = count + 1;
  }
  if((x == 244) && (y == 870) && (a == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 444) && (y == 870) && (s == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 644) && (y == 870) && (d == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 844) && (y == 870) && (f == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 1044) && (y == 870) && (h == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 1244) && (y == 870) && (j == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 1444) && (y == 870) && (k == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
   if((x == 1644) && (y == 870) && (l == true)){
    y = 90;
    positions.shuffle();
    x = positions.get(0);
    make = make + 1;
    count = count + 1;
  }
  if(count ==50)
  {
    hard = false;
    scount = count;
    smake = make;
    smiss = miss;
    aMiss =smiss/scount;
    aMake = smake/scount;
    count = 0;
    make = 0;
    miss = 0;
  }
  }
  
}

public void keyPressed() {
  if (key == 'a'){
    a = true;
  }
  if (key == 's'){
    s = true;
  }
  if (key == 'd'){
    d = true;
  }
  if (key == 'f'){
    f = true;
  }
  if (key == 'h'){
    h = true;
  }
  if (key == 'j'){
    j = true;
  }
  if (key == 'k'){
    k = true;
  }
  if (key == 'l'){
    l = true;
  }
  if (key == '1'){
    easy=true;
  }
  if (key == '2'){
    normal=true;
  }
  if (key == '3'){
    hard = true;
  }
  
}

public void keyReleased() {
  if (key == 'a'){
    a = false;
  }
  if (key == 's'){
    s = false;
  }
  if (key == 'd'){
    d = false;
  }
  if (key == 'f'){
    f = false;
  }
  if (key == 'h'){
    h = false;
  }
  if (key == 'j'){
    j = false;
  }
  if (key == 'k'){
    k = false;
  }
  if (key == 'l'){
    l = false;
  }
}
