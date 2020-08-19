package Abstract;


public class ClubMed extends Vacation{

int stars;
int price;
int budget;
String destination;

public ClubMed(int stars, int price, int budget, String destination){
	this.stars=stars;
	this.price=price;
	this.budget=budget;
	this.destination=destination;
			
}
public void overUnder(){
	if (price>budget){
		System.out.println("ClubMed cost overbudget by $"+(price-budget));;
	}
	else
		System.out.println("ClubMed cost underbudget by $"+(budget-price));;
	}
}

