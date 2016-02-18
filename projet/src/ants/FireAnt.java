package ants;

import core.Ant;
import core.AntColony;
import core.Bee;

public class FireAnt extends Ant{
	
	protected int damage = 3;
	protected int foodCost=4;
	
	public FireAnt() {
		super(1,4);
	}
	
	public Bee getTarget () {
		return place.getClosestBee(0, 0);
	}
	
	public void action(AntColony colony) {
		Bee target = getTarget();
		if (this.getArmor()==1 && target!=null){
			while (target != null) {
				target.reduceArmor(damage);
				target = getTarget();
				}
			this.reduceArmor(1);
		}
	}

}
