package ift605.tp3.commons;

import java.util.List;

public class AgentGraph {
	private String agentName;
	private List<Node> nodeList;
	private List<Vertex> vertexList;

	public AgentGraph(String agentName, List<Node> nodeList, List<Vertex> vertexList) {
		this.agentName = agentName;
		this.nodeList = nodeList;
		this.vertexList = vertexList;
	}

	private Node getUncoloredNode() {
		for (Node node : nodeList) {
			if (node.getColor() == null) {
				return node;
			}
		}
		return null;
	}

	private Node getInvalidNode() {
		for (Vertex vertex : vertexList) {
			Node invalidNode = vertex.getRandomInvalidNode();
			if (invalidNode != null) {
				return invalidNode;
			}
		}
		return null;
	}

	public Node getLocalNodeToColor() {
		Node node = getUncoloredNode();

		if (node == null)
			node = getInvalidNode();

		// return null if no local node to color
		return node;
	}
	
	public int getRemoteNodeId() {
		for(Vertex vertex : vertexList) {
			if(vertex.isPartialVertex()) {
				if(vertex.getNodeA().getColor() == null) {
					return vertex.getNodeA().getId();
				}else if(vertex.getNodeB().getColor() == null) {
					return vertex.getNodeB().getId();
				}
			}
		}
		// No remote node id
		return 0;
	}

	public String getAgentName() {
		return agentName;
	}

	public List<Node> getNodeList() {
		return nodeList;
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}

	@Override
	public String toString() {
		String graphString = "AgentGraph [agentName=" + agentName + ", node id and color:\n";
		
		for(Node node : nodeList)
		{
			graphString = graphString + node.toString() + "\n";
		}
		
		return graphString;
	}

}
