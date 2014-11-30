package ift605.tp3;

import java.util.HashSet;
import java.util.Set;

import jade.core.behaviours.Behaviour;

public class ColorBehaviour extends Behaviour {
	
	Set<String> agents_finis = new HashSet<String>();
	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean done() {
		// TODO Auto-generated method stub
		return agents_finis.size() == 2;
	}

}
