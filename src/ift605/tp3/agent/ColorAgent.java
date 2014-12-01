package ift605.tp3.agent;
import ift605.tp3.commons.AgentGraph;
import jade.core.Agent;

public class ColorAgent extends Agent {

	protected void setup() {
		System.out.println("New color agent is now created: " + getLocalName());
		AgentGraph graph = (AgentGraph) getArguments()[0];
		this.addBehaviour(new ColorLocalNodeBehaviour(graph));
	  } 
}
