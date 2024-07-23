package moreroom.org;

public class roomdata {
private int room_number;
private int count;
public roomdata(){
	room_number=1;
	count=1;
}
public roomdata(int d,int c){
	room_number=d;
	count=c;
}
void getn(int t ) {
	t=room_number;
}
int setn() {
	return room_number;
}
void getcount (int f) {
	f=count;
}
int setcount() {
	return count;
}
public void show() {
	System.out.println("room numder : "+room_number+",  count : "+count);
}

}
