package ift605.tp3.agent;
import ift605.tp3.commons.AgentGraph;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class MessageHandletBehaviour extends CyclicBehaviour{
	private static final long serialVersionUID = 1L;
	
	AgentGraph graph;	
	public MessageHandletBehaviour(AgentGraph graph) {
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
				//Tester si le noeuds courant peux accepter la couleur propos�
			
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