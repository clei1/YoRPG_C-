public class Warrior extends Character{
    public Warrior(String n){
	name = n;
	health = 125;
	strength = 80;
	defense = 90;
	attackR = 0.2;
    }
    
    public void normalize(){
	strength = 80;
	defense = 90;
    }
    
    public String about(){
	return	"Warrior\nHealth: " + health + "\nStrength: " + strength + "\nDefense: " + defense + "\nAttack Rating: " + attackR;
    }
}
