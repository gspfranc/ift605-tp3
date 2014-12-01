package ift605.tp3;
import ift605.tp3.commons.AgentGraph;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.lang.acl.UnreadableException;

import java.awt.Color;
import java.io.IOException;


@SuppressWarnings("serial")
public class MessageHandletBehaviour extends CyclicBehaviour{

	AgentGraph graph;	
	public MessageHandletBehaviour(AgentGraph graph) {
		super();
		this.graph = graph;
	}


	@Override
	public void action() {
		MessageTemplate pattern = MessageTemplate.or(MessageTemplate.MatchPerformative(ACLMessage.INFORM),
				MessageTemplate.MatchPerformative(ACLMessage.PROPOSE));
		jade.lang.acl.ACLMessage message = this.myAgent.receive(pattern);
		
		if( message  != null){
			switch (message.getPerformative()) {
				
			case ACLMessage.INFORM:
				//Tester si le noeuds courant peux accepter la couleur proposé
			
			case ACLMessage.CONFIRM:
				// l'agent confirme que c'est OK de son bords
			default:
				break;
			}
		}else{
			block();
		}
	}
}