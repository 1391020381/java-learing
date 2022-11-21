
public class CoreClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Bob","Alice","Grace"};
		var sb = new StringBuilder();
		sb.append("Hello ");
		for(String name: names) {
			sb.append(name).append(", ");
		}
		System.out.println(sb.toString());
		sb.delete(sb.length()-2,sb.length());
		sb.append("!");
		System.out.println(sb.toString());
	}

}
