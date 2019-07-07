package graph;

import java.io.Serializable;

/**
 * ClassName: Edge.java
 * Description:  The definition of edge in graph.
 * StartNode : The start of an edge.
 * EndNode : The end of an edge.
 * value : The weight of an edge.
 */
public class Edge implements Serializable {


	private static final long serialVersionUID = 1L;
	
	public Node StartNode;     //�ߵ����
	public Node EndNode;    //���յ�
	public double value;       //��Ȩֵ
	
	public Edge(Node start,Node end,double va)//���캯��
	{
		StartNode=start;
		EndNode=end;
		value=va;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
