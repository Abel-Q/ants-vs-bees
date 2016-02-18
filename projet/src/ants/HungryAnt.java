package ants;

import core.Ant;
import core.AntColony;
import core.Bee;
import core.AntGame;

public class HungryAnt extends Ant{

	private int digestion;
	
	public HungryAnt() {
		super(1,4);
		this.digestion=0;
	}
	
	public Bee here () {
		return place.getClosestBee(0, 0);
	}
	
	@Override
	public void action (AntColony colony) {
		Bee target = here();
		if (target!=null&&digestion==0) {
			target.reduceArmor(target.getArmor());
			digestion=AntGame.turn;
		}
		else {
			if (digestion+3!=AntGame.turn) {digestion=0;}
	}
	}
}