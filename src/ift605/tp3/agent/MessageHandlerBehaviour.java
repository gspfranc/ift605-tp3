package ift605.tp3.agent;
import ift605.tp3.commons.AgentGraph;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class MessageHandlerBehaviour extends CyclicBehaviour{
	private static final long serialVersionUID = 1L;
	
	AgentGraph graph;	
	public MessageHandlerBehaviour(AgentGraph graph) {
		this.graph = graph;
	}


	@Override
	public void action() {
		
		//Send frontiere to other agent
		
		//get list of frontier node
		
		//send them to corresponding agent
		
		
		
		//wait reply of other agent
		//get other response
		MessageTemplate pattern = MessageTemplate.or(MessageTemplate.MatchPerformative(ACLMessage.INFORM),
				MessageTemplate.MatchPerformative(ACLMessage.PROPOSE));
		jade.lang.acl.ACLMessage message = this.myAgent.receive(pattern);
		
		if( message  != null){
			switch (message.getPerformative()) {
				
			case ACLMessage.INFORM:
				// L'agent recois un noeud frontière d'un autre agent
				// l'agent fixe le noeud et recolorie son sous-graph
			
			case ACLMessage.CONFIRM:
				// l'agent confirme que c'est OK de son bords
				// si on obtient un confirm des 2 agents, le graph est completer
			default:
				break;
			}
		}else{
			block();
		}
	}
}