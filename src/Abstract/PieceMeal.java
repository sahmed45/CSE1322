package Abstract;


public class PieceMeal extends Vacation{

String setofitems;
int cost;
String destination;
public PieceMeal(int cost, int budget, String destination){
	
	this.cost=cost;
	this.budget=budget;
	this.destination=destination;
			
}
public void overUnder(){
	if (cost>budget){
		System.out.println("Piecemeal cost overbudget by $"+(cost-budget));;
	}
	else
		System.out.println("Piecemeal cost underbudget by $"+(budget-cost));;
	}
}

