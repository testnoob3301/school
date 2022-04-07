class library{

/*WOW! thats a lot of variables*/
	public String book;
	public String oc;
	public int days;
	static String[] books={"","math","physics","calculus","chemistry","merchant_of_venice","hindi","pinnochio"};
	static int[]value={0,102,120,345,6578,785,234,777};
	public String sec ="";
	public int index = 0;
	public int price;
	public int original_price;
	static int rtprice = 0;

/*Constructor*/
public library(String a,int b, String c){
	book = a;
	days = b;
	oc = c;
}

public library(String a,int b, String c,String secret){
	book = a;
	days = b;
	oc = c;
	sec = secret;
}


/*Checking if book is there?*/	
public boolean isthere(){
	boolean x = false;
	for(int i=1; i<books.length;i++){
		if(this.book == books[i]){
			x =  true;
			index = i;
		}
	}
	return x ; 
}

/*DISCOUNT CALCULATOR*/
public int[] discount(){
	int[]x={0,0};
	if(sec !=""){
		x[0]=1;
		price = 0;
	}else{
	if(((int) Math.round(Math.random()))==1){
		int dcnt = 1;
		int discout = (((int) Math.round(Math.random()*original_price))%1000);
		x[0] = dcnt;
		x[1] = discout;
		price = original_price - discout;
	}
}
	return x;
}


/*Calculating the ammount*/
public void amount(){
	if(this.isthere()==true && (this.index!=0)){
		original_price = days*value[index];
		System.out.println("Book found! ");
		int [] dis = this.discount();
		if(dis[0]==1){
			System.out.println("Yay! Yay got a discount.");
		}else{
			price = original_price;
		}
		System.out.println("Your final amount : "+price);
		rtprice = price;
	}
}
}