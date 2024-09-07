package java;

public class DateTime extends Date  {

	private int h ;
	private int Min ;
	private int sec ;

	public void affiche() {

		super.affiche();
		System.out.println(h+":"+Min+":"+sec);

	}
	public  String toString() {


		return (super.toString()+"||"+h+":"+Min+":"+sec);

	}
    public DateTime(int j1 , int m1 , int a1 , int h,int Min,int sec) {
		super(j1,m1,a1);
		this.h=h;
		this.Min=Min;
		this.sec=sec;
	}

	public DateTime() {
		h= 8;
		Min=30;
		sec=00;

	}
	public void setH(int h1) {
		h=h1;
	}
	public int getH() {
		return h;
	}
	public void setMIN(int min) {
		Min=min;
	}
	public int getMIN()
{
		return Min;}

	public void setSEC(int s) {
		sec=s;
	}
	public int getSEC()
{
		return sec;}
	public static void main (String[]args) {

		DateTime dt1 = new DateTime();
		DateTime dt2 = new DateTime(23,03,2023,7,30,00);

		dt1.affiche();
		System.out.println(dt2.toString());
		if(dt1.compare(dt2)== true) {
			System.out.println("meme date");
		}
		dt1.affiche();
		dt2.affiche();
	}

}