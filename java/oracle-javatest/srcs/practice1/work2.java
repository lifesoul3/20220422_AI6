package practice1;
//lum meat stone tool wool 내림 방식
public class work2 {
	public static void main(String[] args) {
	works a=new works();
	a.tool(0);	a.copper(0);	a.coal(3);	a.sugar(0);	
	a.wool(2);	a.copperB(5);
	a.cloth(0);	
	a.clothes(3);
	a.iron(1);
	a.nail(3);
	a.pickaxe(2);
	a.check();	
	}	
}
class works {
	int nail;	int pickaxe;	int iron;		
	int stone;	int tool;	int wool;	int cloth;	int clothes;
	int lum;	int meat;
	int vine;	int clay;	int glass;	int flour;	int berry;
	int sugar;	int bowl;
	int paper;	int gems;	int coal;	int copper;	int copperB;
	int wood;	int silver;	int ironB;	int silverB;	int wire;	
	int milk;	int basket;	int htool;	int cottonC;			
	int Fflour;	int dough;	int leather;		
	int cake;	int herb;	int tinct;	int glasses;
	int fruit;	int cotton;	int Ajuice;	int Bjuice;	int fishingnet;
	int fish;	int drum;	int choco;	int snake;	int factedg;
	int tiara;	int stool;	int chair;	int wheel;	int cart;	
	int gold;	int plati;	int flask;	int brick;	
//herb 4
	
	
	public int bowl(int n) {
		bowl+=n;
		
		return n;
	}
	public int sugar(int n) {
		sugar+=n;
		bowl(n);
		return n;
	}
	public int wire(int n) {
		wire+=n;
		ironB(2*n);
		wood(n);
		return n;}
	public int silverB(int n) {
		silverB+=n;
		silver(n);
		clay+=(n*3);
		return n;}
	public int ironB(int n) {
		ironB+=n;
		iron(2*n);
		return n;}
	public int silver(int n) {
		silver+=n;
		sugar(2*n);
		return n;}
	public int wood(int n) {
		wood+=n;
		tool(n);
		return n;}
	public int copperB(int n) {
		copperB+=n;
		copper(n);
		return n;}
	public int copper(int n) {
		copper+=n;
		lum+=n;
		return n;}
	public int coal(int n) {
		coal+=n;
		lum+=(3*n);
		return n;}
	public int gems(int n) {
		gems+=n;
		copper(2*n);
		iron(2*n);
		return n;}
	public int paper(int n) {
		paper+=n;
		tool(2*n);
		return n;}
	public int nail(int n) {
		nail+=n;
		tool(n);
		iron(n);
		return n;}
	public int iron(int n) {
		iron+=n;
		meat+=n;
		return n;}
	public int cloth(int n) {
		cloth+=n;
		wool(n);
		return n;}
	public int wool(int n) {
		wool+=n;
		tool(n);
		return n;}	
	public int tool(int n) {
		tool+=n;
		stone(n);
		lum+=n;
		return n;}
	public int stone(int n) {
		stone+=n;
		meat+=n;
		return n;}
	public int clothes(int n) {
		clothes+=n;
		cloth(n);
		wool(n);
		return n;}
	public int pickaxe(int n) {
		pickaxe+=n;
		nail(2*n);
		lum+=(2*n);
		return n;}
	public void check() {
	//int vine;	int clay;	int glass;	int flour;	int berry;
		
		System.out.print(flour+" flour\t");
		System.out.print(berry+" berry\t");
		System.out.print(glass+" glass\t");
		System.out.println(clay+" clay\t");
		System.out.print(vine+" vine\t");
		System.out.print(meat+" meat\t");
		System.out.println(lum+" lum");
		System.out.println("------------");
		System.out.print(wood+" wood  \t");
		System.out.print(paper+" paper \t");
		System.out.print(sugar+" sugar \t");
		System.out.println(Fflour+" Fflour");
		System.out.print(milk+" milk  \t");
		System.out.print(wool+" wool  \t");
		System.out.println(leather+" leather");
		System.out.print(stone+" stone \t");
		System.out.print(gems+" gems  \t");
		System.out.print(coal+" coal  \t");
		System.out.print(basket+" basket\t");
		System.out.print(tool+" tool  \t");
		System.out.print(nail+" nail  \t");
		System.out.print(pickaxe+" pickaxe\t");
		System.out.println(htool+" htool ");
		System.out.print(copper+" copper\t");
		System.out.print(iron+" iron  \t");
		System.out.print(silver+" silver\t");
		System.out.println(copperB+" copperB");
		System.out.print(herb+" herb  \t");
		System.out.print(tinct+" tinct \t");
	}
}