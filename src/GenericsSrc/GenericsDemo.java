package GenericsSrc;

public class GenericsDemo {

	public static void main(String[] args) {
		//Data demo
		Data<String> strData = new Data<>("Insert string.");
		System.out.println(strData.toString());
		
		Data<Integer> intData = new Data<>(69420);
		System.out.println(intData.toString());
		
		Data<Double> dblData = new Data<>(3.14);
		System.out.println(dblData.toString());
		
		//Bin demo
		Bin<String, String> bin = new Bin<>();
		bin.setRecyclable("plastic bag");
		bin.setNonrecyclable("compost");
		
		System.out.println("Recyclable: "+bin.getRecyclable());
		System.out.println("Non-recyclable: "+bin.getNonrecyclable());
		
		//DataNode demo
		DataNode<Integer> node1 = new DataNode<>(8, null);
		DataNode<Integer> node2 = new DataNode<>(88, node1);
		
		//DataNode<String> nodeA = new DataNode<>("aaa", null);
		//DataNode<String> nodeB = new DataNode<>("bbb", nodeA);
	}

}
